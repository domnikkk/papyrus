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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.dd.dc.DCPackage;

import org.eclipse.papyrus.dd.dg.Canvas;
import org.eclipse.papyrus.dd.dg.Circle;
import org.eclipse.papyrus.dd.dg.ClipPath;
import org.eclipse.papyrus.dd.dg.ClosePath;
import org.eclipse.papyrus.dd.dg.CubicCurveTo;
import org.eclipse.papyrus.dd.dg.DGFactory;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definition;
import org.eclipse.papyrus.dd.dg.Definitions;
import org.eclipse.papyrus.dd.dg.Ellipse;
import org.eclipse.papyrus.dd.dg.EllipticalCurveTo;
import org.eclipse.papyrus.dd.dg.FontDecoration;
import org.eclipse.papyrus.dd.dg.Gradient;
import org.eclipse.papyrus.dd.dg.GradientStop;
import org.eclipse.papyrus.dd.dg.GraphicalElement;
import org.eclipse.papyrus.dd.dg.Group;
import org.eclipse.papyrus.dd.dg.Image;
import org.eclipse.papyrus.dd.dg.Line;
import org.eclipse.papyrus.dd.dg.LineTo;
import org.eclipse.papyrus.dd.dg.LinearGradient;
import org.eclipse.papyrus.dd.dg.MarkedElement;
import org.eclipse.papyrus.dd.dg.Marker;
import org.eclipse.papyrus.dd.dg.Matrix;
import org.eclipse.papyrus.dd.dg.MoveTo;
import org.eclipse.papyrus.dd.dg.Paint;
import org.eclipse.papyrus.dd.dg.PaintServer;
import org.eclipse.papyrus.dd.dg.Path;
import org.eclipse.papyrus.dd.dg.PathCommand;
import org.eclipse.papyrus.dd.dg.Pattern;
import org.eclipse.papyrus.dd.dg.Polygon;
import org.eclipse.papyrus.dd.dg.Polyline;
import org.eclipse.papyrus.dd.dg.QuadraticCurveTo;
import org.eclipse.papyrus.dd.dg.RadialGradient;
import org.eclipse.papyrus.dd.dg.Rectangle;
import org.eclipse.papyrus.dd.dg.RootCanvas;
import org.eclipse.papyrus.dd.dg.Rotate;
import org.eclipse.papyrus.dd.dg.Scale;
import org.eclipse.papyrus.dd.dg.Skew;
import org.eclipse.papyrus.dd.dg.Style;
import org.eclipse.papyrus.dd.dg.StyleRule;
import org.eclipse.papyrus.dd.dg.StyleSelector;
import org.eclipse.papyrus.dd.dg.StyleSheet;
import org.eclipse.papyrus.dd.dg.Text;
import org.eclipse.papyrus.dd.dg.Transform;
import org.eclipse.papyrus.dd.dg.Translate;
import org.eclipse.papyrus.dd.dg.Use;

import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DGPackageImpl extends EPackageImpl implements DGPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass canvasEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass graphicalElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass moveToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pathCommandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass clipPathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass paintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass paintServerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transformEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass closePathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cubicCurveToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass styleSheetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass styleRuleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass styleSelectorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ellipticalCurveToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass quadraticCurveToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gradientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gradientStopEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass markedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass markerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass linearGradientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lineToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass radialGradientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rootCanvasEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass skewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass translateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass useEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum fontDecorationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DGPackageImpl() {
		super(eNS_URI, DGFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link DGPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DGPackage init() {
		if (isInited)
			return (DGPackage) EPackage.Registry.INSTANCE
					.getEPackage(DGPackage.eNS_URI);

		// Obtain or create and register package
		DGPackageImpl theDGPackage = (DGPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DGPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DGPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DCPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDGPackage.createPackageContents();

		// Initialize created meta-data
		theDGPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDGPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return DGValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theDGPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DGPackage.eNS_URI, theDGPackage);
		return theDGPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCanvas() {
		return canvasEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCanvas_Bounds() {
		return (EReference) canvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGroup_Member() {
		return (EReference) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphicalElement() {
		return graphicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphicalElement_ClipPath() {
		return (EReference) graphicalElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphicalElement_Group() {
		return (EReference) graphicalElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphicalElement_Keyword() {
		return (EAttribute) graphicalElementEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphicalElement_Style() {
		return (EReference) graphicalElementEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphicalElement_Transform() {
		return (EReference) graphicalElementEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDefinition_Id() {
		return (EAttribute) definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMoveTo() {
		return moveToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMoveTo_Point() {
		return (EReference) moveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPathCommand() {
		return pathCommandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPathCommand_IsRelative() {
		return (EAttribute) pathCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClipPath() {
		return clipPathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyle_Fill() {
		return (EReference) styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FillOpacity() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyle_Stroke() {
		return (EReference) styleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_StrokeWidth() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_StrokeOpacity() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_StrokeDashLength() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FontSize() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FontName() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FontItalic() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FontBold() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyle_FontDecoration() {
		return (EAttribute) styleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getStyle__ValidFontSize__DiagnosticChain_Map() {
		return styleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getStyle__ValidFillOpacity__DiagnosticChain_Map() {
		return styleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getStyle__ValidStrokeWidth__DiagnosticChain_Map() {
		return styleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getStyle__ValidDashLengthSize__DiagnosticChain_Map() {
		return styleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getStyle__ValidStrokeOpacity__DiagnosticChain_Map() {
		return styleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPaint() {
		return paintEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPaint_Color() {
		return (EAttribute) paintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPaint_PaintServer() {
		return (EReference) paintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPaintServer() {
		return paintServerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPaintServer_Transform() {
		return (EReference) paintServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransform() {
		return transformEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCircle_Center() {
		return (EReference) circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCircle_Radius() {
		return (EAttribute) circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getCircle__NonNegativeRadius__DiagnosticChain_Map() {
		return circleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClosePath() {
		return closePathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCubicCurveTo() {
		return cubicCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCubicCurveTo_Point() {
		return (EReference) cubicCurveToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCubicCurveTo_StartControl() {
		return (EReference) cubicCurveToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCubicCurveTo_EndControl() {
		return (EReference) cubicCurveToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDefinitions() {
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDefinitions_Defnition() {
		return (EReference) definitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDefinitions_StyleSheet() {
		return (EReference) definitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStyleSheet() {
		return styleSheetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyleSheet_Rule() {
		return (EReference) styleSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStyleRule() {
		return styleRuleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyleRule_Selector() {
		return (EReference) styleRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyleRule_Style() {
		return (EReference) styleRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStyleSelector() {
		return styleSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStyleSelector_Type() {
		return (EReference) styleSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStyleSelector_Keyword() {
		return (EAttribute) styleSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEllipse_Center() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEllipse_Radii() {
		return (EReference) ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEllipticalCurveTo() {
		return ellipticalCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEllipticalCurveTo_Point() {
		return (EReference) ellipticalCurveToEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEllipticalCurveTo_Radii() {
		return (EReference) ellipticalCurveToEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEllipticalCurveTo_Rotation() {
		return (EAttribute) ellipticalCurveToEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEllipticalCurveTo_IsLargeArc() {
		return (EAttribute) ellipticalCurveToEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEllipticalCurveTo_IsSweep() {
		return (EAttribute) ellipticalCurveToEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getQuadraticCurveTo() {
		return quadraticCurveToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuadraticCurveTo_Point() {
		return (EReference) quadraticCurveToEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getQuadraticCurveTo_Control() {
		return (EReference) quadraticCurveToEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGradient() {
		return gradientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGradient_Stop() {
		return (EReference) gradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGradientStop() {
		return gradientStopEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientStop_Color() {
		return (EAttribute) gradientStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientStop_Offset() {
		return (EAttribute) gradientStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGradientStop_Opacity() {
		return (EAttribute) gradientStopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getGradientStop__ValidOffset__DiagnosticChain_Map() {
		return gradientStopEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getGradientStop__ValidOpacity__DiagnosticChain_Map() {
		return gradientStopEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getImage_Source() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getImage_Bounds() {
		return (EReference) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getImage_IsAspectRatioPreserved() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLine_Start() {
		return (EReference) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLine_End() {
		return (EReference) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMarkedElement() {
		return markedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarkedElement_EndMarker() {
		return (EReference) markedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarkedElement_MidMarker() {
		return (EReference) markedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarkedElement_StartMarker() {
		return (EReference) markedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMarker() {
		return markerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarker_Size() {
		return (EReference) markerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarker_Reference() {
		return (EReference) markerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLinearGradient() {
		return linearGradientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLinearGradient_Start() {
		return (EReference) linearGradientEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLinearGradient_End() {
		return (EReference) linearGradientEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getLinearGradient__ValidGradientVector__DiagnosticChain_Map() {
		return linearGradientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLineTo() {
		return lineToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLineTo_Point() {
		return (EReference) lineToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_A() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_B() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_C() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_D() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_E() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMatrix_F() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPath_Command() {
		return (EReference) pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPattern_Bounds() {
		return (EReference) patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPattern_Tile() {
		return (EReference) patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPolygon_Point() {
		return (EReference) polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPolyline() {
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPolyline_Point() {
		return (EReference) polylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRadialGradient() {
		return radialGradientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRadialGradient_Center() {
		return (EReference) radialGradientEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRadialGradient_Focus() {
		return (EReference) radialGradientEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRadialGradient_Radius() {
		return (EAttribute) radialGradientEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getRadialGradient__ValidCenterPoint__DiagnosticChain_Map() {
		return radialGradientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getRadialGradient__ValidFocusPoint__DiagnosticChain_Map() {
		return radialGradientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getRadialGradient__ValidRadius__DiagnosticChain_Map() {
		return radialGradientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRectangle_Bounds() {
		return (EReference) rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRectangle_CornerRadius() {
		return (EAttribute) rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRootCanvas() {
		return rootCanvasEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRootCanvas_BackgroundColor() {
		return (EAttribute) rootCanvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRootCanvas_Definitions() {
		return (EReference) rootCanvasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRootCanvas_StyleSheet() {
		return (EReference) rootCanvasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRotate_Angle() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRotate_Center() {
		return (EReference) rotateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getScale() {
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getScale_FactorX() {
		return (EAttribute) scaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getScale_FactorY() {
		return (EAttribute) scaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getScale__Nonnegativescale__DiagnosticChain_Map() {
		return scaleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSkew() {
		return skewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSkew_AngleX() {
		return (EAttribute) skewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSkew_AngleY() {
		return (EAttribute) skewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getText_Data() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getText_Position() {
		return (EReference) textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTranslate() {
		return translateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTranslate_DeltaX() {
		return (EAttribute) translateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTranslate_DeltaY() {
		return (EAttribute) translateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUse() {
		return useEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUse_Bounds() {
		return (EReference) useEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getFontDecoration() {
		return fontDecorationEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DGFactory getDGFactory() {
		return (DGFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		canvasEClass = createEClass(CANVAS);
		createEReference(canvasEClass, CANVAS__BOUNDS);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__MEMBER);

		graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
		createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__CLIP_PATH);
		createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__GROUP);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__KEYWORD);
		createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__STYLE);
		createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__TRANSFORM);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__ID);

		moveToEClass = createEClass(MOVE_TO);
		createEReference(moveToEClass, MOVE_TO__POINT);

		pathCommandEClass = createEClass(PATH_COMMAND);
		createEAttribute(pathCommandEClass, PATH_COMMAND__IS_RELATIVE);

		clipPathEClass = createEClass(CLIP_PATH);

		styleEClass = createEClass(STYLE);
		createEReference(styleEClass, STYLE__FILL);
		createEAttribute(styleEClass, STYLE__FILL_OPACITY);
		createEReference(styleEClass, STYLE__STROKE);
		createEAttribute(styleEClass, STYLE__STROKE_WIDTH);
		createEAttribute(styleEClass, STYLE__STROKE_OPACITY);
		createEAttribute(styleEClass, STYLE__STROKE_DASH_LENGTH);
		createEAttribute(styleEClass, STYLE__FONT_SIZE);
		createEAttribute(styleEClass, STYLE__FONT_NAME);
		createEAttribute(styleEClass, STYLE__FONT_ITALIC);
		createEAttribute(styleEClass, STYLE__FONT_BOLD);
		createEAttribute(styleEClass, STYLE__FONT_DECORATION);
		createEOperation(styleEClass,
				STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP);
		createEOperation(styleEClass,
				STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(styleEClass,
				STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(styleEClass,
				STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP);
		createEOperation(styleEClass,
				STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP);

		paintEClass = createEClass(PAINT);
		createEAttribute(paintEClass, PAINT__COLOR);
		createEReference(paintEClass, PAINT__PAINT_SERVER);

		paintServerEClass = createEClass(PAINT_SERVER);
		createEReference(paintServerEClass, PAINT_SERVER__TRANSFORM);

		transformEClass = createEClass(TRANSFORM);

		circleEClass = createEClass(CIRCLE);
		createEReference(circleEClass, CIRCLE__CENTER);
		createEAttribute(circleEClass, CIRCLE__RADIUS);
		createEOperation(circleEClass,
				CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP);

		closePathEClass = createEClass(CLOSE_PATH);

		cubicCurveToEClass = createEClass(CUBIC_CURVE_TO);
		createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__POINT);
		createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__START_CONTROL);
		createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__END_CONTROL);

		definitionsEClass = createEClass(DEFINITIONS);
		createEReference(definitionsEClass, DEFINITIONS__DEFNITION);
		createEReference(definitionsEClass, DEFINITIONS__STYLE_SHEET);

		styleSheetEClass = createEClass(STYLE_SHEET);
		createEReference(styleSheetEClass, STYLE_SHEET__RULE);

		styleRuleEClass = createEClass(STYLE_RULE);
		createEReference(styleRuleEClass, STYLE_RULE__SELECTOR);
		createEReference(styleRuleEClass, STYLE_RULE__STYLE);

		styleSelectorEClass = createEClass(STYLE_SELECTOR);
		createEReference(styleSelectorEClass, STYLE_SELECTOR__TYPE);
		createEAttribute(styleSelectorEClass, STYLE_SELECTOR__KEYWORD);

		ellipseEClass = createEClass(ELLIPSE);
		createEReference(ellipseEClass, ELLIPSE__CENTER);
		createEReference(ellipseEClass, ELLIPSE__RADII);

		ellipticalCurveToEClass = createEClass(ELLIPTICAL_CURVE_TO);
		createEReference(ellipticalCurveToEClass, ELLIPTICAL_CURVE_TO__POINT);
		createEReference(ellipticalCurveToEClass, ELLIPTICAL_CURVE_TO__RADII);
		createEAttribute(ellipticalCurveToEClass, ELLIPTICAL_CURVE_TO__ROTATION);
		createEAttribute(ellipticalCurveToEClass,
				ELLIPTICAL_CURVE_TO__IS_LARGE_ARC);
		createEAttribute(ellipticalCurveToEClass, ELLIPTICAL_CURVE_TO__IS_SWEEP);

		quadraticCurveToEClass = createEClass(QUADRATIC_CURVE_TO);
		createEReference(quadraticCurveToEClass, QUADRATIC_CURVE_TO__POINT);
		createEReference(quadraticCurveToEClass, QUADRATIC_CURVE_TO__CONTROL);

		gradientEClass = createEClass(GRADIENT);
		createEReference(gradientEClass, GRADIENT__STOP);

		gradientStopEClass = createEClass(GRADIENT_STOP);
		createEAttribute(gradientStopEClass, GRADIENT_STOP__COLOR);
		createEAttribute(gradientStopEClass, GRADIENT_STOP__OFFSET);
		createEAttribute(gradientStopEClass, GRADIENT_STOP__OPACITY);
		createEOperation(gradientStopEClass,
				GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP);
		createEOperation(gradientStopEClass,
				GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__SOURCE);
		createEReference(imageEClass, IMAGE__BOUNDS);
		createEAttribute(imageEClass, IMAGE__IS_ASPECT_RATIO_PRESERVED);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__START);
		createEReference(lineEClass, LINE__END);

		markedElementEClass = createEClass(MARKED_ELEMENT);
		createEReference(markedElementEClass, MARKED_ELEMENT__END_MARKER);
		createEReference(markedElementEClass, MARKED_ELEMENT__MID_MARKER);
		createEReference(markedElementEClass, MARKED_ELEMENT__START_MARKER);

		markerEClass = createEClass(MARKER);
		createEReference(markerEClass, MARKER__SIZE);
		createEReference(markerEClass, MARKER__REFERENCE);

		linearGradientEClass = createEClass(LINEAR_GRADIENT);
		createEReference(linearGradientEClass, LINEAR_GRADIENT__START);
		createEReference(linearGradientEClass, LINEAR_GRADIENT__END);
		createEOperation(linearGradientEClass,
				LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP);

		lineToEClass = createEClass(LINE_TO);
		createEReference(lineToEClass, LINE_TO__POINT);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__A);
		createEAttribute(matrixEClass, MATRIX__B);
		createEAttribute(matrixEClass, MATRIX__C);
		createEAttribute(matrixEClass, MATRIX__D);
		createEAttribute(matrixEClass, MATRIX__E);
		createEAttribute(matrixEClass, MATRIX__F);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__COMMAND);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__BOUNDS);
		createEReference(patternEClass, PATTERN__TILE);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__POINT);

		polylineEClass = createEClass(POLYLINE);
		createEReference(polylineEClass, POLYLINE__POINT);

		radialGradientEClass = createEClass(RADIAL_GRADIENT);
		createEReference(radialGradientEClass, RADIAL_GRADIENT__CENTER);
		createEReference(radialGradientEClass, RADIAL_GRADIENT__FOCUS);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__RADIUS);
		createEOperation(radialGradientEClass,
				RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(radialGradientEClass,
				RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(radialGradientEClass,
				RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP);

		rectangleEClass = createEClass(RECTANGLE);
		createEReference(rectangleEClass, RECTANGLE__BOUNDS);
		createEAttribute(rectangleEClass, RECTANGLE__CORNER_RADIUS);

		rootCanvasEClass = createEClass(ROOT_CANVAS);
		createEAttribute(rootCanvasEClass, ROOT_CANVAS__BACKGROUND_COLOR);
		createEReference(rootCanvasEClass, ROOT_CANVAS__DEFINITIONS);
		createEReference(rootCanvasEClass, ROOT_CANVAS__STYLE_SHEET);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__ANGLE);
		createEReference(rotateEClass, ROTATE__CENTER);

		scaleEClass = createEClass(SCALE);
		createEAttribute(scaleEClass, SCALE__FACTOR_X);
		createEAttribute(scaleEClass, SCALE__FACTOR_Y);
		createEOperation(scaleEClass,
				SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP);

		skewEClass = createEClass(SKEW);
		createEAttribute(skewEClass, SKEW__ANGLE_X);
		createEAttribute(skewEClass, SKEW__ANGLE_Y);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__DATA);
		createEReference(textEClass, TEXT__POSITION);

		translateEClass = createEClass(TRANSLATE);
		createEAttribute(translateEClass, TRANSLATE__DELTA_X);
		createEAttribute(translateEClass, TRANSLATE__DELTA_Y);

		useEClass = createEClass(USE);
		createEReference(useEClass, USE__BOUNDS);

		// Create enums
		fontDecorationEEnum = createEEnum(FONT_DECORATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DCPackage theDCPackage = (DCPackage) EPackage.Registry.INSTANCE
				.getEPackage(DCPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		canvasEClass.getESuperTypes().add(this.getGroup());
		groupEClass.getESuperTypes().add(this.getGraphicalElement());
		graphicalElementEClass.getESuperTypes().add(this.getDefinition());
		moveToEClass.getESuperTypes().add(this.getPathCommand());
		clipPathEClass.getESuperTypes().add(this.getGroup());
		paintServerEClass.getESuperTypes().add(this.getDefinition());
		circleEClass.getESuperTypes().add(this.getGraphicalElement());
		closePathEClass.getESuperTypes().add(this.getPathCommand());
		cubicCurveToEClass.getESuperTypes().add(this.getPathCommand());
		ellipseEClass.getESuperTypes().add(this.getGraphicalElement());
		ellipticalCurveToEClass.getESuperTypes().add(this.getPathCommand());
		quadraticCurveToEClass.getESuperTypes().add(this.getPathCommand());
		gradientEClass.getESuperTypes().add(this.getPaintServer());
		imageEClass.getESuperTypes().add(this.getGraphicalElement());
		lineEClass.getESuperTypes().add(this.getMarkedElement());
		markedElementEClass.getESuperTypes().add(this.getGraphicalElement());
		markerEClass.getESuperTypes().add(this.getGroup());
		linearGradientEClass.getESuperTypes().add(this.getGradient());
		lineToEClass.getESuperTypes().add(this.getPathCommand());
		matrixEClass.getESuperTypes().add(this.getTransform());
		pathEClass.getESuperTypes().add(this.getMarkedElement());
		patternEClass.getESuperTypes().add(this.getPaintServer());
		polygonEClass.getESuperTypes().add(this.getMarkedElement());
		polylineEClass.getESuperTypes().add(this.getMarkedElement());
		radialGradientEClass.getESuperTypes().add(this.getGradient());
		rectangleEClass.getESuperTypes().add(this.getGraphicalElement());
		rootCanvasEClass.getESuperTypes().add(this.getCanvas());
		rotateEClass.getESuperTypes().add(this.getTransform());
		scaleEClass.getESuperTypes().add(this.getTransform());
		skewEClass.getESuperTypes().add(this.getTransform());
		textEClass.getESuperTypes().add(this.getGraphicalElement());
		translateEClass.getESuperTypes().add(this.getTransform());
		useEClass.getESuperTypes().add(this.getGraphicalElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvas_Bounds(), theDCPackage.getBounds(), null,
				"bounds", null, 1, 1, Canvas.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Member(), this.getGraphicalElement(),
				this.getGraphicalElement_Group(), "member", null, 0, -1,
				Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(graphicalElementEClass, GraphicalElement.class,
				"GraphicalElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicalElement_ClipPath(), this.getClipPath(),
				null, "clipPath", null, 0, 1, GraphicalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getGraphicalElement_Group(), this.getGroup(),
				this.getGroup_Member(), "group", null, 0, 1,
				GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGraphicalElement_Keyword(), theDCPackage.getString(),
				"keyword", null, 0, -1, GraphicalElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalElement_Style(), this.getStyle(), null,
				"style", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalElement_Transform(), this.getTransform(),
				null, "transform", null, 0, -1, GraphicalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_Id(), theDCPackage.getString(), "id",
				null, 1, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(moveToEClass, MoveTo.class, "MoveTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveTo_Point(), theDCPackage.getPoint(), null,
				"point", null, 1, 1, MoveTo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathCommandEClass, PathCommand.class, "PathCommand",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathCommand_IsRelative(), theDCPackage.getBoolean(),
				"isRelative", "false", 1, 1, PathCommand.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(clipPathEClass, ClipPath.class, "ClipPath", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyle_Fill(), this.getPaint(), null, "fill", null, 0,
				1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_FillOpacity(), theDCPackage.getReal(),
				"fillOpacity", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getStyle_Stroke(), this.getPaint(), null, "stroke",
				null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_StrokeWidth(), theDCPackage.getReal(),
				"strokeWidth", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_StrokeOpacity(), theDCPackage.getReal(),
				"strokeOpacity", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_StrokeDashLength(), theDCPackage.getReal(),
				"strokeDashLength", null, 0, -1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_FontSize(), theDCPackage.getReal(), "fontSize",
				null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getStyle_FontName(), theDCPackage.getString(),
				"fontName", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_FontItalic(), theDCPackage.getBoolean(),
				"fontItalic", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_FontBold(), theDCPackage.getBoolean(),
				"fontBold", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyle_FontDecoration(), this.getFontDecoration(),
				"fontDecoration", null, 0, 1, Style.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(
				getStyle__ValidFontSize__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validFontSize", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyle__ValidFillOpacity__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validFillOpacity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyle__ValidStrokeWidth__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validStrokeWidth", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getStyle__ValidDashLengthSize__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validDashLengthSize", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getStyle__ValidStrokeOpacity__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validStrokeOpacity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paintEClass, Paint.class, "Paint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaint_Color(), theDCPackage.getColor(), "color",
				null, 0, 1, Paint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getPaint_PaintServer(), this.getPaintServer(), null,
				"paintServer", null, 0, 1, Paint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paintServerEClass, PaintServer.class, "PaintServer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaintServer_Transform(), this.getTransform(), null,
				"transform", null, 0, -1, PaintServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformEClass, Transform.class, "Transform", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircle_Center(), theDCPackage.getPoint(), null,
				"center", null, 1, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCircle_Radius(), theDCPackage.getReal(), "radius",
				null, 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(
				getCircle__NonNegativeRadius__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "nonNegativeRadius", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(closePathEClass, ClosePath.class, "ClosePath", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cubicCurveToEClass, CubicCurveTo.class, "CubicCurveTo",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCubicCurveTo_Point(), theDCPackage.getPoint(), null,
				"point", null, 1, 1, CubicCurveTo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubicCurveTo_StartControl(), theDCPackage.getPoint(),
				null, "startControl", null, 1, 1, CubicCurveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getCubicCurveTo_EndControl(), theDCPackage.getPoint(),
				null, "endControl", null, 1, 1, CubicCurveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(definitionsEClass, Definitions.class, "Definitions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitions_Defnition(), this.getDefinition(), null,
				"defnition", null, 0, -1, Definitions.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitions_StyleSheet(), this.getStyleSheet(), null,
				"styleSheet", null, 0, 1, Definitions.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(styleSheetEClass, StyleSheet.class, "StyleSheet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleSheet_Rule(), this.getStyleRule(), null, "rule",
				null, 0, -1, StyleSheet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleRuleEClass, StyleRule.class, "StyleRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleRule_Selector(), this.getStyleSelector(), null,
				"selector", null, 1, -1, StyleRule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleRule_Style(), this.getStyle(), null, "style",
				null, 1, 1, StyleRule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(styleSelectorEClass, StyleSelector.class, "StyleSelector",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleSelector_Type(), theEcorePackage.getEClass(),
				null, "type", null, 0, 1, StyleSelector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStyleSelector_Keyword(), theDCPackage.getString(),
				"keyword", null, 0, -1, StyleSelector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipse_Center(), theDCPackage.getPoint(), null,
				"center", null, 1, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEllipse_Radii(), theDCPackage.getDimension(), null,
				"radii", null, 1, 1, Ellipse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ellipticalCurveToEClass, EllipticalCurveTo.class,
				"EllipticalCurveTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipticalCurveTo_Point(), theDCPackage.getPoint(),
				null, "point", null, 1, 1, EllipticalCurveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getEllipticalCurveTo_Radii(),
				theDCPackage.getDimension(), null, "radii", null, 1, 1,
				EllipticalCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEllipticalCurveTo_Rotation(), theDCPackage.getReal(),
				"rotation", null, 1, 1, EllipticalCurveTo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEllipticalCurveTo_IsLargeArc(),
				theDCPackage.getBoolean(), "isLargeArc", null, 1, 1,
				EllipticalCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getEllipticalCurveTo_IsSweep(),
				theDCPackage.getBoolean(), "isSweep", null, 1, 1,
				EllipticalCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(quadraticCurveToEClass, QuadraticCurveTo.class,
				"QuadraticCurveTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuadraticCurveTo_Point(), theDCPackage.getPoint(),
				null, "point", null, 1, 1, QuadraticCurveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getQuadraticCurveTo_Control(), theDCPackage.getPoint(),
				null, "control", null, 1, 1, QuadraticCurveTo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(gradientEClass, Gradient.class, "Gradient", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradient_Stop(), this.getGradientStop(), null,
				"stop", null, 2, -1, Gradient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientStopEClass, GradientStop.class, "GradientStop",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientStop_Color(), theDCPackage.getColor(),
				"color", null, 1, 1, GradientStop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGradientStop_Offset(), theDCPackage.getReal(),
				"offset", null, 1, 1, GradientStop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGradientStop_Opacity(), theDCPackage.getReal(),
				"opacity", "1", 1, 1, GradientStop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = initEOperation(
				getGradientStop__ValidOffset__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validOffset", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getGradientStop__ValidOpacity__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validOpacity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Source(), theDCPackage.getString(), "source",
				null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getImage_Bounds(), theDCPackage.getBounds(), null,
				"bounds", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_IsAspectRatioPreserved(),
				theDCPackage.getBoolean(), "isAspectRatioPreserved", null, 1,
				1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Start(), theDCPackage.getPoint(), null, "start",
				null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLine_End(), theDCPackage.getPoint(), null, "end",
				null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(markedElementEClass, MarkedElement.class, "MarkedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkedElement_EndMarker(), this.getMarker(), null,
				"endMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarkedElement_MidMarker(), this.getMarker(), null,
				"midMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarkedElement_StartMarker(), this.getMarker(), null,
				"startMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarker_Size(), theDCPackage.getDimension(), null,
				"size", null, 1, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarker_Reference(), theDCPackage.getPoint(), null,
				"reference", null, 1, 1, Marker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linearGradientEClass, LinearGradient.class,
				"LinearGradient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearGradient_Start(), theDCPackage.getPoint(),
				null, "start", null, 1, 1, LinearGradient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinearGradient_End(), theDCPackage.getPoint(), null,
				"end", null, 1, 1, LinearGradient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(
				getLinearGradient__ValidGradientVector__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validGradientVector", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineToEClass, LineTo.class, "LineTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineTo_Point(), theDCPackage.getPoint(), null,
				"point", null, 1, 1, LineTo.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_A(), theDCPackage.getReal(), "a", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatrix_B(), theDCPackage.getReal(), "b", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatrix_C(), theDCPackage.getReal(), "c", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatrix_D(), theDCPackage.getReal(), "d", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatrix_E(), theDCPackage.getReal(), "e", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMatrix_F(), theDCPackage.getReal(), "f", null, 1, 1,
				Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_Command(), this.getPathCommand(), null,
				"command", null, 0, -1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Bounds(), theDCPackage.getBounds(), null,
				"bounds", null, 1, 1, Pattern.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_Tile(), this.getGraphicalElement(), null,
				"tile", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygon_Point(), theDCPackage.getPoint(), null,
				"point", null, 3, -1, Polygon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolyline_Point(), theDCPackage.getPoint(), null,
				"point", null, 2, -1, Polyline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radialGradientEClass, RadialGradient.class,
				"RadialGradient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadialGradient_Center(), theDCPackage.getPoint(),
				null, "center", null, 1, 1, RadialGradient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getRadialGradient_Focus(), theDCPackage.getPoint(),
				null, "focus", null, 1, 1, RadialGradient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRadialGradient_Radius(), theDCPackage.getReal(),
				"radius", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = initEOperation(
				getRadialGradient__ValidCenterPoint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validCenterPoint", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getRadialGradient__ValidFocusPoint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validFocusPoint", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getRadialGradient__ValidRadius__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "validRadius", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangle_Bounds(), theDCPackage.getBounds(), null,
				"bounds", null, 1, 1, Rectangle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRectangle_CornerRadius(), theDCPackage.getReal(),
				"cornerRadius", "0", 1, 1, Rectangle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(rootCanvasEClass, RootCanvas.class, "RootCanvas",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootCanvas_BackgroundColor(),
				theDCPackage.getColor(), "backgroundColor", null, 0, 1,
				RootCanvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRootCanvas_Definitions(), this.getDefinitions(),
				null, "definitions", null, 0, 1, RootCanvas.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRootCanvas_StyleSheet(), this.getStyleSheet(), null,
				"styleSheet", null, 0, -1, RootCanvas.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Angle(), theDCPackage.getReal(), "angle",
				null, 1, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getRotate_Center(), theDCPackage.getPoint(), null,
				"center", null, 0, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScale_FactorX(), theDCPackage.getReal(), "factorX",
				null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getScale_FactorY(), theDCPackage.getReal(), "factorY",
				null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getScale__Nonnegativescale__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "nonnegativescale", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skewEClass, Skew.class, "Skew", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkew_AngleX(), theDCPackage.getReal(), "angleX",
				null, 1, 1, Skew.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getSkew_AngleY(), theDCPackage.getReal(), "angleY",
				null, 1, 1, Skew.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Data(), theDCPackage.getString(), "data", null,
				1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getText_Position(), theDCPackage.getPoint(), null,
				"position", null, 1, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(translateEClass, Translate.class, "Translate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslate_DeltaX(), theDCPackage.getReal(), "deltaX",
				null, 1, 1, Translate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getTranslate_DeltaY(), theDCPackage.getReal(), "deltaY",
				null, 1, 1, Translate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(useEClass, Use.class, "Use", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUse_Bounds(), theDCPackage.getBounds(), null,
				"bounds", null, 1, 1, Use.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fontDecorationEEnum, FontDecoration.class, "FontDecoration");
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.UNDERLINE);
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.OVERLINE);
		addEEnumLiteral(fontDecorationEEnum, FontDecoration.LINE_THROUGH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "validationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL" });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(getStyle__ValidFontSize__DiagnosticChain_Map(), source,
				new String[] { "body", "fontSize >=  0" });
		addAnnotation(getStyle__ValidFillOpacity__DiagnosticChain_Map(),
				source, new String[] { "body",
						"fillOpacity >=  0 and fillOpacity <=1" });
		addAnnotation(getStyle__ValidStrokeWidth__DiagnosticChain_Map(),
				source, new String[] { "body", "strokeWidth >=  0" });
		addAnnotation(getStyle__ValidDashLengthSize__DiagnosticChain_Map(),
				source, new String[] { "body",
						"strokeDashLength->size().mod(2) = 0" });
		addAnnotation(getStyle__ValidStrokeOpacity__DiagnosticChain_Map(),
				source, new String[] { "body",
						"strokeOpacity >=  0 and strokeOpacity <=1" });
		addAnnotation(getCircle__NonNegativeRadius__DiagnosticChain_Map(),
				source, new String[] { "body", "radius >= 0" });
		addAnnotation(getGradientStop__ValidOffset__DiagnosticChain_Map(),
				source, new String[] { "body", "offset>=0 and offset<=1" });
		addAnnotation(getGradientStop__ValidOpacity__DiagnosticChain_Map(),
				source, new String[] { "body", "opacity>=0 and opacity<=1" });
		addAnnotation(
				getLinearGradient__ValidGradientVector__DiagnosticChain_Map(),
				source,
				new String[] {
						"body",
						"start.x>=0 and start.x<=1 and end.x>=0 and end.x<=1 and start.y>=0 and start.y<=1 and end.y>=0 and end.y<=1" });
		addAnnotation(
				getRadialGradient__ValidCenterPoint__DiagnosticChain_Map(),
				source,
				new String[] { "body",
						"centerX>=0 and centerX<=1 and centerY>=0 and centerY<=1" });
		addAnnotation(
				getRadialGradient__ValidFocusPoint__DiagnosticChain_Map(),
				source, new String[] { "body",
						"focusX>=0 and focusX<=1 and focusY>=0 and focusY<=1" });
		addAnnotation(getRadialGradient__ValidRadius__DiagnosticChain_Map(),
				source, new String[] { "body", "radius>=0 and radius<=1" });
		addAnnotation(getScale__Nonnegativescale__DiagnosticChain_Map(),
				source, new String[] { "body", "factorX>=0 and factorY>=0" });
	}

} // DGPackageImpl
