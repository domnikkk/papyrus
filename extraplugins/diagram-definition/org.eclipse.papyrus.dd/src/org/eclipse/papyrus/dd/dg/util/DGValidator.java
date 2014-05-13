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
package org.eclipse.papyrus.dd.dg.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.dd.dg.*;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage
 * @generated
 */
public class DGValidator extends EObjectValidator {

	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final DGValidator INSTANCE = new DGValidator();

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
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.dd.dg";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Font Size' of 'Style'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_FONT_SIZE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Fill Opacity' of 'Style'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_FILL_OPACITY = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Stroke Width' of 'Style'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_STROKE_WIDTH = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Dash Length Size' of 'Style'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_DASH_LENGTH_SIZE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Stroke Opacity' of 'Style'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_STROKE_OPACITY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Non Negative Radius' of 'Circle'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CIRCLE__NON_NEGATIVE_RADIUS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Offset' of 'Gradient Stop'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GRADIENT_STOP__VALID_OFFSET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Opacity' of 'Gradient Stop'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GRADIENT_STOP__VALID_OPACITY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Gradient Vector' of 'Linear Gradient'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINEAR_GRADIENT__VALID_GRADIENT_VECTOR = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Center Point' of 'Radial Gradient'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_CENTER_POINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Focus Point' of 'Radial Gradient'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_FOCUS_POINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Radius' of 'Radial Gradient'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_RADIUS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Nonnegativescale' of 'Scale'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCALE__NONNEGATIVESCALE = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

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
	public DGValidator() {
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
		return DGPackage.eINSTANCE;
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
		case DGPackage.CANVAS:
			return validateCanvas((Canvas) value, diagnostics, context);
		case DGPackage.GROUP:
			return validateGroup((Group) value, diagnostics, context);
		case DGPackage.GRAPHICAL_ELEMENT:
			return validateGraphicalElement((GraphicalElement) value,
					diagnostics, context);
		case DGPackage.DEFINITION:
			return validateDefinition((Definition) value, diagnostics, context);
		case DGPackage.MOVE_TO:
			return validateMoveTo((MoveTo) value, diagnostics, context);
		case DGPackage.PATH_COMMAND:
			return validatePathCommand((PathCommand) value, diagnostics,
					context);
		case DGPackage.CLIP_PATH:
			return validateClipPath((ClipPath) value, diagnostics, context);
		case DGPackage.STYLE:
			return validateStyle((Style) value, diagnostics, context);
		case DGPackage.PAINT:
			return validatePaint((Paint) value, diagnostics, context);
		case DGPackage.PAINT_SERVER:
			return validatePaintServer((PaintServer) value, diagnostics,
					context);
		case DGPackage.TRANSFORM:
			return validateTransform((Transform) value, diagnostics, context);
		case DGPackage.CIRCLE:
			return validateCircle((Circle) value, diagnostics, context);
		case DGPackage.CLOSE_PATH:
			return validateClosePath((ClosePath) value, diagnostics, context);
		case DGPackage.CUBIC_CURVE_TO:
			return validateCubicCurveTo((CubicCurveTo) value, diagnostics,
					context);
		case DGPackage.DEFINITIONS:
			return validateDefinitions((Definitions) value, diagnostics,
					context);
		case DGPackage.STYLE_SHEET:
			return validateStyleSheet((StyleSheet) value, diagnostics, context);
		case DGPackage.STYLE_RULE:
			return validateStyleRule((StyleRule) value, diagnostics, context);
		case DGPackage.STYLE_SELECTOR:
			return validateStyleSelector((StyleSelector) value, diagnostics,
					context);
		case DGPackage.ELLIPSE:
			return validateEllipse((Ellipse) value, diagnostics, context);
		case DGPackage.ELLIPTICAL_CURVE_TO:
			return validateEllipticalCurveTo((EllipticalCurveTo) value,
					diagnostics, context);
		case DGPackage.QUADRATIC_CURVE_TO:
			return validateQuadraticCurveTo((QuadraticCurveTo) value,
					diagnostics, context);
		case DGPackage.GRADIENT:
			return validateGradient((Gradient) value, diagnostics, context);
		case DGPackage.GRADIENT_STOP:
			return validateGradientStop((GradientStop) value, diagnostics,
					context);
		case DGPackage.IMAGE:
			return validateImage((Image) value, diagnostics, context);
		case DGPackage.LINE:
			return validateLine((Line) value, diagnostics, context);
		case DGPackage.MARKED_ELEMENT:
			return validateMarkedElement((MarkedElement) value, diagnostics,
					context);
		case DGPackage.MARKER:
			return validateMarker((Marker) value, diagnostics, context);
		case DGPackage.LINEAR_GRADIENT:
			return validateLinearGradient((LinearGradient) value, diagnostics,
					context);
		case DGPackage.LINE_TO:
			return validateLineTo((LineTo) value, diagnostics, context);
		case DGPackage.MATRIX:
			return validateMatrix((Matrix) value, diagnostics, context);
		case DGPackage.PATH:
			return validatePath((Path) value, diagnostics, context);
		case DGPackage.PATTERN:
			return validatePattern((Pattern) value, diagnostics, context);
		case DGPackage.POLYGON:
			return validatePolygon((Polygon) value, diagnostics, context);
		case DGPackage.POLYLINE:
			return validatePolyline((Polyline) value, diagnostics, context);
		case DGPackage.RADIAL_GRADIENT:
			return validateRadialGradient((RadialGradient) value, diagnostics,
					context);
		case DGPackage.RECTANGLE:
			return validateRectangle((Rectangle) value, diagnostics, context);
		case DGPackage.ROOT_CANVAS:
			return validateRootCanvas((RootCanvas) value, diagnostics, context);
		case DGPackage.ROTATE:
			return validateRotate((Rotate) value, diagnostics, context);
		case DGPackage.SCALE:
			return validateScale((Scale) value, diagnostics, context);
		case DGPackage.SKEW:
			return validateSkew((Skew) value, diagnostics, context);
		case DGPackage.TEXT:
			return validateText((Text) value, diagnostics, context);
		case DGPackage.TRANSLATE:
			return validateTranslate((Translate) value, diagnostics, context);
		case DGPackage.USE:
			return validateUse((Use) value, diagnostics, context);
		case DGPackage.FONT_DECORATION:
			return validateFontDecoration((FontDecoration) value, diagnostics,
					context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCanvas(Canvas canvas, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(canvas, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGraphicalElement(GraphicalElement graphicalElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicalElement, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinition(Definition definition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClipPath(ClipPath clipPath,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clipPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle(Style style, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(style, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(style, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(style, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(style, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(style,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(style, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(style, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(style, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(style, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStyle_validFontSize(style, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStyle_validFillOpacity(style, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateStyle_validStrokeWidth(style, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateStyle_validDashLengthSize(style, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateStyle_validStrokeOpacity(style, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the validFontSize constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validFontSize(Style style,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validFontSize(diagnostics, context);
	}

	/**
	 * Validates the validFillOpacity constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validFillOpacity(Style style,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validFillOpacity(diagnostics, context);
	}

	/**
	 * Validates the validStrokeWidth constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validStrokeWidth(Style style,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validStrokeWidth(diagnostics, context);
	}

	/**
	 * Validates the validDashLengthSize constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validDashLengthSize(Style style,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validDashLengthSize(diagnostics, context);
	}

	/**
	 * Validates the validStrokeOpacity constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validStrokeOpacity(Style style,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validStrokeOpacity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePaint(Paint paint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePaintServer(PaintServer paintServer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paintServer, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransform(Transform transform,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinitions(Definitions definitions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitions, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCubicCurveTo(CubicCurveTo cubicCurveTo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubicCurveTo, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathCommand(PathCommand pathCommand,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathCommand, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarker(Marker marker, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleSheet(StyleSheet styleSheet,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSheet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleRule(StyleRule styleRule,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleSelector(StyleSelector styleSelector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSelector, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCircle(Circle circle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(circle, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(circle,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(circle, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(circle, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(circle,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(circle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(circle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(circle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(circle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCircle_nonNegativeRadius(circle, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the nonNegativeRadius constraint of '<em>Circle</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCircle_nonNegativeRadius(Circle circle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return circle.nonNegativeRadius(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClosePath(ClosePath closePath,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closePath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEllipse(Ellipse ellipse,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEllipticalCurveTo(
			EllipticalCurveTo ellipticalCurveTo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipticalCurveTo, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateQuadraticCurveTo(QuadraticCurveTo quadraticCurveTo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quadraticCurveTo, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradient(Gradient gradient,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gradient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop(GradientStop gradientStop,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gradientStop, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gradientStop,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gradientStop,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gradientStop,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					gradientStop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(gradientStop, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(gradientStop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(gradientStop, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gradientStop, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateGradientStop_validOffset(gradientStop,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGradientStop_validOpacity(gradientStop,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the validOffset constraint of '<em>Gradient Stop</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop_validOffset(GradientStop gradientStop,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gradientStop.validOffset(diagnostics, context);
	}

	/**
	 * Validates the validOpacity constraint of '<em>Gradient Stop</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop_validOpacity(GradientStop gradientStop,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gradientStop.validOpacity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarkedElement(MarkedElement markedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markedElement, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLinearGradient(LinearGradient linearGradient,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linearGradient, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(linearGradient,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(linearGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(linearGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					linearGradient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(linearGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(linearGradient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(linearGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(linearGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateLinearGradient_validGradientVector(
					linearGradient, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validGradientVector constraint of '<em>Linear Gradient</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLinearGradient_validGradientVector(
			LinearGradient linearGradient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return linearGradient.validGradientVector(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLineTo(LineTo lineTo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatrix(Matrix matrix, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matrix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMoveTo(MoveTo moveTo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(path, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePolygon(Polygon polygon,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePolyline(Polyline polyline,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polyline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient(RadialGradient radialGradient,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(radialGradient, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(radialGradient,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(radialGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(radialGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					radialGradient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(radialGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(radialGradient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(radialGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(radialGradient, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateRadialGradient_validCenterPoint(radialGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRadialGradient_validFocusPoint(radialGradient,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRadialGradient_validRadius(radialGradient,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the validCenterPoint constraint of '<em>Radial Gradient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validCenterPoint(
			RadialGradient radialGradient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radialGradient.validCenterPoint(diagnostics, context);
	}

	/**
	 * Validates the validFocusPoint constraint of '<em>Radial Gradient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validFocusPoint(
			RadialGradient radialGradient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radialGradient.validFocusPoint(diagnostics, context);
	}

	/**
	 * Validates the validRadius constraint of '<em>Radial Gradient</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validRadius(
			RadialGradient radialGradient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radialGradient.validRadius(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRectangle(Rectangle rectangle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectangle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRootCanvas(RootCanvas rootCanvas,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootCanvas, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateScale(Scale scale, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scale, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scale, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scale, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scale, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(scale,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(scale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(scale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(scale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateScale_nonnegativescale(scale, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the nonnegativescale constraint of '<em>Scale</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateScale_nonnegativescale(Scale scale,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scale.nonnegativescale(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSkew(Skew skew, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skew, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTranslate(Translate translate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(use, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFontDecoration(FontDecoration fontDecoration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} // DGValidator
