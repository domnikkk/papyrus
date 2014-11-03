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
package org.eclipse.papyrus.dd.dg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.dd.dg.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DGFactoryImpl extends EFactoryImpl implements DGFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DGFactory init() {
		try {
			DGFactory theDGFactory = (DGFactory)EPackage.Registry.INSTANCE.getEFactory(DGPackage.eNS_URI);
			if(theDGFactory != null) {
				return theDGFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DGFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DGFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
		case DGPackage.CANVAS:
			return createCanvas();
		case DGPackage.GROUP:
			return createGroup();
		case DGPackage.MOVE_TO:
			return createMoveTo();
		case DGPackage.CLIP_PATH:
			return createClipPath();
		case DGPackage.STYLE:
			return createStyle();
		case DGPackage.PAINT:
			return createPaint();
		case DGPackage.CIRCLE:
			return createCircle();
		case DGPackage.CLOSE_PATH:
			return createClosePath();
		case DGPackage.CUBIC_CURVE_TO:
			return createCubicCurveTo();
		case DGPackage.DEFINITIONS:
			return createDefinitions();
		case DGPackage.STYLE_SHEET:
			return createStyleSheet();
		case DGPackage.STYLE_RULE:
			return createStyleRule();
		case DGPackage.STYLE_SELECTOR:
			return createStyleSelector();
		case DGPackage.ELLIPSE:
			return createEllipse();
		case DGPackage.ELLIPTICAL_ARC_TO:
			return createEllipticalArcTo();
		case DGPackage.QUADRATIC_CURVE_TO:
			return createQuadraticCurveTo();
		case DGPackage.GRADIENT_STOP:
			return createGradientStop();
		case DGPackage.IMAGE:
			return createImage();
		case DGPackage.LINE:
			return createLine();
		case DGPackage.MARKER:
			return createMarker();
		case DGPackage.LINEAR_GRADIENT:
			return createLinearGradient();
		case DGPackage.LINE_TO:
			return createLineTo();
		case DGPackage.MATRIX:
			return createMatrix();
		case DGPackage.PATH:
			return createPath();
		case DGPackage.PATTERN:
			return createPattern();
		case DGPackage.POLYGON:
			return createPolygon();
		case DGPackage.POLYLINE:
			return createPolyline();
		case DGPackage.RADIAL_GRADIENT:
			return createRadialGradient();
		case DGPackage.RECTANGLE:
			return createRectangle();
		case DGPackage.ROOT_CANVAS:
			return createRootCanvas();
		case DGPackage.ROTATE:
			return createRotate();
		case DGPackage.SCALE:
			return createScale();
		case DGPackage.SKEW:
			return createSkew();
		case DGPackage.TEXT:
			return createText();
		case DGPackage.TRANSLATE:
			return createTranslate();
		case DGPackage.USE:
			return createUse();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch(eDataType.getClassifierID()) {
		case DGPackage.FONT_DECORATION:
			return createFontDecorationFromString(eDataType, initialValue);
		case DGPackage.ELEMENT_KIND:
			return createElementKindFromString(eDataType, initialValue);
		case DGPackage.TEXT_ANCHOR:
			return createTextAnchorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch(eDataType.getClassifierID()) {
		case DGPackage.FONT_DECORATION:
			return convertFontDecorationToString(eDataType, instanceValue);
		case DGPackage.ELEMENT_KIND:
			return convertElementKindToString(eDataType, instanceValue);
		case DGPackage.TEXT_ANCHOR:
			return convertTextAnchorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MoveTo createMoveTo() {
		MoveToImpl moveTo = new MoveToImpl();
		return moveTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClipPath createClipPath() {
		ClipPathImpl clipPath = new ClipPathImpl();
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Paint createPaint() {
		PaintImpl paint = new PaintImpl();
		return paint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClosePath createClosePath() {
		ClosePathImpl closePath = new ClosePathImpl();
		return closePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CubicCurveTo createCubicCurveTo() {
		CubicCurveToImpl cubicCurveTo = new CubicCurveToImpl();
		return cubicCurveTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StyleSheet createStyleSheet() {
		StyleSheetImpl styleSheet = new StyleSheetImpl();
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StyleRule createStyleRule() {
		StyleRuleImpl styleRule = new StyleRuleImpl();
		return styleRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StyleSelector createStyleSelector() {
		StyleSelectorImpl styleSelector = new StyleSelectorImpl();
		return styleSelector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EllipticalArcTo createEllipticalArcTo() {
		EllipticalArcToImpl ellipticalArcTo = new EllipticalArcToImpl();
		return ellipticalArcTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QuadraticCurveTo createQuadraticCurveTo() {
		QuadraticCurveToImpl quadraticCurveTo = new QuadraticCurveToImpl();
		return quadraticCurveTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GradientStop createGradientStop() {
		GradientStopImpl gradientStop = new GradientStopImpl();
		return gradientStop;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Marker createMarker() {
		MarkerImpl marker = new MarkerImpl();
		return marker;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LinearGradient createLinearGradient() {
		LinearGradientImpl linearGradient = new LinearGradientImpl();
		return linearGradient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LineTo createLineTo() {
		LineToImpl lineTo = new LineToImpl();
		return lineTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RadialGradient createRadialGradient() {
		RadialGradientImpl radialGradient = new RadialGradientImpl();
		return radialGradient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RootCanvas createRootCanvas() {
		RootCanvasImpl rootCanvas = new RootCanvasImpl();
		return rootCanvas;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Skew createSkew() {
		SkewImpl skew = new SkewImpl();
		return skew;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Translate createTranslate() {
		TranslateImpl translate = new TranslateImpl();
		return translate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FontDecoration createFontDecorationFromString(EDataType eDataType, String initialValue) {
		FontDecoration result = FontDecoration.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFontDecorationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementKind createElementKindFromString(EDataType eDataType, String initialValue) {
		ElementKind result = ElementKind.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TextAnchor createTextAnchorFromString(EDataType eDataType, String initialValue) {
		TextAnchor result = TextAnchor.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTextAnchorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DGPackage getDGPackage() {
		return (DGPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DGPackage getPackage() {
		return DGPackage.eINSTANCE;
	}
} // DGFactoryImpl
