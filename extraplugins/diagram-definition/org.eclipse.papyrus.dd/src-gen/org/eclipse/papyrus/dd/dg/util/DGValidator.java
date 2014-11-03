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
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final DGValidator INSTANCE = new DGValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic
	 * {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.dd.dg";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Canvas Cannot Have Transforms' of 'Canvas'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CANVAS__CANVAS_CANNOT_HAVE_TRANSFORMS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Referenced Clippath Has Id' of 'Graphical Element'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GRAPHICAL_ELEMENT__REFERENCED_CLIPPATH_HAS_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Cannot Be Empty' of 'Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DEFINITION__ID_CANNOT_BE_EMPTY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Font Size' of 'Style'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_FONT_SIZE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Fill Opacity' of 'Style'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_FILL_OPACITY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Stroke Width' of 'Style'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_STROKE_WIDTH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Dash Length Size' of 'Style'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_DASH_LENGTH_SIZE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Stroke Opacity' of 'Style'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STYLE__VALID_STROKE_OPACITY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Referenced Paint Server Has Id' of 'Paint'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PAINT__REFERENCED_PAINT_SERVER_HAS_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Negative Radius' of 'Circle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CIRCLE__NON_NEGATIVE_RADIUS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Offset' of 'Gradient Stop'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GRADIENT_STOP__VALID_OFFSET = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Opacity' of 'Gradient Stop'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GRADIENT_STOP__VALID_OPACITY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Cannot Be Empty' of 'Image'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IMAGE__SOURCE_CANNOT_BE_EMPTY = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Referenced Start Marker Has Id' of 'Marked Element'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MARKED_ELEMENT__REFERENCED_START_MARKER_HAS_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Referenced Mid Marker Has Id' of 'Marked Element'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MARKED_ELEMENT__REFERENCED_MID_MARKER_HAS_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Referenced End Marker Has Id' of 'Marked Element'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MARKED_ELEMENT__REFERENCED_END_MARKER_HAS_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Valid Gradient Vector' of 'Linear Gradient'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINEAR_GRADIENT__VALID_GRADIENT_VECTOR = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'First Command Must Be Move' of 'Path'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PATH__FIRST_COMMAND_MUST_BE_MOVE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Center Point' of 'Radial Gradient'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_CENTER_POINT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Focus Point' of 'Radial Gradient'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_FOCUS_POINT = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Radius' of 'Radial Gradient'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RADIAL_GRADIENT__VALID_RADIUS = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for
	 * constraint 'Non Negative Corner Radius' of 'Rectangle'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RECTANGLE__NON_NEGATIVE_CORNER_RADIUS = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nonnegativescale' of 'Scale'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCALE__NONNEGATIVESCALE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Cannot Be Empty' of 'Text'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TEXT__DATA_CANNOT_BE_EMPTY = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Referenced Element Has Id' of 'Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int USE__REFERENCED_ELEMENT_HAS_ID = 25;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 25;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DGValidator() {
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
	protected EPackage getEPackage() {
		return DGPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch(classifierID) {
		case DGPackage.CANVAS:
			return validateCanvas((Canvas)value, diagnostics, context);
		case DGPackage.GROUP:
			return validateGroup((Group)value, diagnostics, context);
		case DGPackage.GRAPHICAL_ELEMENT:
			return validateGraphicalElement((GraphicalElement)value, diagnostics, context);
		case DGPackage.DEFINITION:
			return validateDefinition((Definition)value, diagnostics, context);
		case DGPackage.MOVE_TO:
			return validateMoveTo((MoveTo)value, diagnostics, context);
		case DGPackage.PATH_COMMAND:
			return validatePathCommand((PathCommand)value, diagnostics, context);
		case DGPackage.CLIP_PATH:
			return validateClipPath((ClipPath)value, diagnostics, context);
		case DGPackage.STYLE:
			return validateStyle((Style)value, diagnostics, context);
		case DGPackage.PAINT:
			return validatePaint((Paint)value, diagnostics, context);
		case DGPackage.PAINT_SERVER:
			return validatePaintServer((PaintServer)value, diagnostics, context);
		case DGPackage.TRANSFORM:
			return validateTransform((Transform)value, diagnostics, context);
		case DGPackage.CIRCLE:
			return validateCircle((Circle)value, diagnostics, context);
		case DGPackage.CLOSE_PATH:
			return validateClosePath((ClosePath)value, diagnostics, context);
		case DGPackage.CUBIC_CURVE_TO:
			return validateCubicCurveTo((CubicCurveTo)value, diagnostics, context);
		case DGPackage.DEFINITIONS:
			return validateDefinitions((Definitions)value, diagnostics, context);
		case DGPackage.STYLE_SHEET:
			return validateStyleSheet((StyleSheet)value, diagnostics, context);
		case DGPackage.STYLE_RULE:
			return validateStyleRule((StyleRule)value, diagnostics, context);
		case DGPackage.STYLE_SELECTOR:
			return validateStyleSelector((StyleSelector)value, diagnostics, context);
		case DGPackage.ELLIPSE:
			return validateEllipse((Ellipse)value, diagnostics, context);
		case DGPackage.ELLIPTICAL_ARC_TO:
			return validateEllipticalArcTo((EllipticalArcTo)value, diagnostics, context);
		case DGPackage.QUADRATIC_CURVE_TO:
			return validateQuadraticCurveTo((QuadraticCurveTo)value, diagnostics, context);
		case DGPackage.GRADIENT:
			return validateGradient((Gradient)value, diagnostics, context);
		case DGPackage.GRADIENT_STOP:
			return validateGradientStop((GradientStop)value, diagnostics, context);
		case DGPackage.IMAGE:
			return validateImage((Image)value, diagnostics, context);
		case DGPackage.LINE:
			return validateLine((Line)value, diagnostics, context);
		case DGPackage.MARKED_ELEMENT:
			return validateMarkedElement((MarkedElement)value, diagnostics, context);
		case DGPackage.MARKER:
			return validateMarker((Marker)value, diagnostics, context);
		case DGPackage.LINEAR_GRADIENT:
			return validateLinearGradient((LinearGradient)value, diagnostics, context);
		case DGPackage.LINE_TO:
			return validateLineTo((LineTo)value, diagnostics, context);
		case DGPackage.MATRIX:
			return validateMatrix((Matrix)value, diagnostics, context);
		case DGPackage.PATH:
			return validatePath((Path)value, diagnostics, context);
		case DGPackage.PATTERN:
			return validatePattern((Pattern)value, diagnostics, context);
		case DGPackage.POLYGON:
			return validatePolygon((Polygon)value, diagnostics, context);
		case DGPackage.POLYLINE:
			return validatePolyline((Polyline)value, diagnostics, context);
		case DGPackage.RADIAL_GRADIENT:
			return validateRadialGradient((RadialGradient)value, diagnostics, context);
		case DGPackage.RECTANGLE:
			return validateRectangle((Rectangle)value, diagnostics, context);
		case DGPackage.ROOT_CANVAS:
			return validateRootCanvas((RootCanvas)value, diagnostics, context);
		case DGPackage.ROTATE:
			return validateRotate((Rotate)value, diagnostics, context);
		case DGPackage.SCALE:
			return validateScale((Scale)value, diagnostics, context);
		case DGPackage.SKEW:
			return validateSkew((Skew)value, diagnostics, context);
		case DGPackage.TEXT:
			return validateText((Text)value, diagnostics, context);
		case DGPackage.TRANSLATE:
			return validateTranslate((Translate)value, diagnostics, context);
		case DGPackage.USE:
			return validateUse((Use)value, diagnostics, context);
		case DGPackage.FONT_DECORATION:
			return validateFontDecoration((FontDecoration)value, diagnostics, context);
		case DGPackage.ELEMENT_KIND:
			return validateElementKind((ElementKind)value, diagnostics, context);
		case DGPackage.TEXT_ANCHOR:
			return validateTextAnchor((TextAnchor)value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCanvas(Canvas canvas, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(canvas, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(canvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateCanvas_canvasCannotHaveTransforms(canvas, diagnostics, context);
		return result;
	}

	/**
	 * Validates the canvasCannotHaveTransforms constraint of '<em>Canvas</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCanvas_canvasCannotHaveTransforms(Canvas canvas, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return canvas.canvasCannotHaveTransforms(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(group, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(group, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(group, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGraphicalElement(GraphicalElement graphicalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(graphicalElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(graphicalElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(graphicalElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the referencedClippathHasId constraint of ' <em>Graphical Element</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateGraphicalElement_referencedClippathHasId(GraphicalElement graphicalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return graphicalElement.referencedClippathHasId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinition(Definition definition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(definition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(definition, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(definition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idCannotBeEmpty constraint of '<em>Definition</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinition_idCannotBeEmpty(Definition definition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return definition.idCannotBeEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClipPath(ClipPath clipPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(clipPath, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(clipPath, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(clipPath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(style, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateStyle_validFontSize(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateStyle_validFillOpacity(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateStyle_validStrokeWidth(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateStyle_validDashLengthSize(style, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateStyle_validStrokeOpacity(style, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validFontSize constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validFontSize(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validFontSize(diagnostics, context);
	}

	/**
	 * Validates the validFillOpacity constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validFillOpacity(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validFillOpacity(diagnostics, context);
	}

	/**
	 * Validates the validStrokeWidth constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validStrokeWidth(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validStrokeWidth(diagnostics, context);
	}

	/**
	 * Validates the validDashLengthSize constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validDashLengthSize(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validDashLengthSize(diagnostics, context);
	}

	/**
	 * Validates the validStrokeOpacity constraint of '<em>Style</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyle_validStrokeOpacity(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return style.validStrokeOpacity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePaint(Paint paint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(paint, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(paint, diagnostics, context);
		if(result || diagnostics != null)
			result &= validatePaint_referencedPaintServerHasId(paint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the referencedPaintServerHasId constraint of '<em>Paint</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePaint_referencedPaintServerHasId(Paint paint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return paint.referencedPaintServerHasId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePaintServer(PaintServer paintServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(paintServer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(paintServer, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(paintServer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTransform(Transform transform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinitions(Definitions definitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCubicCurveTo(CubicCurveTo cubicCurveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubicCurveTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathCommand(PathCommand pathCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathCommand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarker(Marker marker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(marker, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(marker, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(marker, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleSheet(StyleSheet styleSheet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSheet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleRule(StyleRule styleRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStyleSelector(StyleSelector styleSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSelector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCircle(Circle circle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(circle, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(circle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateCircle_nonNegativeRadius(circle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonNegativeRadius constraint of '<em>Circle</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCircle_nonNegativeRadius(Circle circle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return circle.nonNegativeRadius(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClosePath(ClosePath closePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closePath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEllipse(Ellipse ellipse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(ellipse, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(ellipse, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(ellipse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEllipticalArcTo(EllipticalArcTo ellipticalArcTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipticalArcTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateQuadraticCurveTo(QuadraticCurveTo quadraticCurveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quadraticCurveTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradient(Gradient gradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(gradient, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(gradient, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(gradientStop, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGradientStop_validOffset(gradientStop, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGradientStop_validOpacity(gradientStop, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validOffset constraint of '<em>Gradient Stop</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop_validOffset(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gradientStop.validOffset(diagnostics, context);
	}

	/**
	 * Validates the validOpacity constraint of '<em>Gradient Stop</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGradientStop_validOpacity(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gradientStop.validOpacity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(image, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(image, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateImage_sourceCannotBeEmpty(image, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceCannotBeEmpty constraint of '<em>Image</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImage_sourceCannotBeEmpty(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return image.sourceCannotBeEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(line, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedStartMarkerHasId(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedMidMarkerHasId(line, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedEndMarkerHasId(line, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarkedElement(MarkedElement markedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(markedElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedStartMarkerHasId(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedMidMarkerHasId(markedElement, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedEndMarkerHasId(markedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the referencedStartMarkerHasId constraint of '<em>Marked Element</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarkedElement_referencedStartMarkerHasId(MarkedElement markedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return markedElement.referencedStartMarkerHasId(diagnostics, context);
	}

	/**
	 * Validates the referencedMidMarkerHasId constraint of '<em>Marked Element</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarkedElement_referencedMidMarkerHasId(MarkedElement markedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return markedElement.referencedMidMarkerHasId(diagnostics, context);
	}

	/**
	 * Validates the referencedEndMarkerHasId constraint of '<em>Marked Element</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMarkedElement_referencedEndMarkerHasId(MarkedElement markedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return markedElement.referencedEndMarkerHasId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLinearGradient(LinearGradient linearGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(linearGradient, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(linearGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateLinearGradient_validGradientVector(linearGradient, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validGradientVector constraint of '<em>Linear Gradient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLinearGradient_validGradientVector(LinearGradient linearGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linearGradient.validGradientVector(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLineTo(LineTo lineTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatrix(Matrix matrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matrix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMoveTo(MoveTo moveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(path, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedStartMarkerHasId(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedMidMarkerHasId(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedEndMarkerHasId(path, diagnostics, context);
		if(result || diagnostics != null)
			result &= validatePath_firstCommandMustBeMove(path, diagnostics, context);
		return result;
	}

	/**
	 * Validates the firstCommandMustBeMove constraint of '<em>Path</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePath_firstCommandMustBeMove(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return path.firstCommandMustBeMove(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(pattern, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pattern, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(pattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePolygon(Polygon polygon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(polygon, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedStartMarkerHasId(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedMidMarkerHasId(polygon, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedEndMarkerHasId(polygon, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePolyline(Polyline polyline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(polyline, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedStartMarkerHasId(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedMidMarkerHasId(polyline, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateMarkedElement_referencedEndMarkerHasId(polyline, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(radialGradient, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateRadialGradient_validCenterPoint(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateRadialGradient_validFocusPoint(radialGradient, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateRadialGradient_validRadius(radialGradient, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validCenterPoint constraint of '<em>Radial Gradient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validCenterPoint(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return radialGradient.validCenterPoint(diagnostics, context);
	}

	/**
	 * Validates the validFocusPoint constraint of '<em>Radial Gradient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validFocusPoint(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return radialGradient.validFocusPoint(diagnostics, context);
	}

	/**
	 * Validates the validRadius constraint of '<em>Radial Gradient</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRadialGradient_validRadius(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return radialGradient.validRadius(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRectangle(Rectangle rectangle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(rectangle, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(rectangle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateRectangle_nonNegativeCornerRadius(rectangle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonNegativeCornerRadius constraint of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRectangle_nonNegativeCornerRadius(Rectangle rectangle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rectangle.nonNegativeCornerRadius(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRootCanvas(RootCanvas rootCanvas, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(rootCanvas, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(rootCanvas, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateCanvas_canvasCannotHaveTransforms(rootCanvas, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rotate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateScale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(scale, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(scale, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateScale_nonnegativescale(scale, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonnegativescale constraint of '<em>Scale</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateScale_nonnegativescale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scale.nonnegativescale(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSkew(Skew skew, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skew, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(text, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(text, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateText_dataCannotBeEmpty(text, diagnostics, context);
		return result;
	}

	/**
	 * Validates the dataCannotBeEmpty constraint of '<em>Text</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateText_dataCannotBeEmpty(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return text.dataCannotBeEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTranslate(Translate translate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(use, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateDefinition_idCannotBeEmpty(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateGraphicalElement_referencedClippathHasId(use, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateUse_referencedElementHasId(use, diagnostics, context);
		return result;
	}

	/**
	 * Validates the referencedElementHasId constraint of '<em>Use</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUse_referencedElementHasId(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return use.referencedElementHasId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFontDecoration(FontDecoration fontDecoration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateElementKind(ElementKind elementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTextAnchor(TextAnchor textAnchor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}
} // DGValidator
