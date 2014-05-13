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
package org.eclipse.papyrus.dd.dc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> The Diagram Common (DC)
 * package contains abstractions shared by the Diagram Interchange and the
 * Diagram Graphics packages. <!-- end-model-doc -->
 * 
 * @see org.eclipse.papyrus.dd.dc.DCFactory
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DCPackage extends EPackage {

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "dc";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DD/20110901/DC";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "dc";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DCPackage eINSTANCE = org.eclipse.papyrus.dd.dc.impl.DCPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dc.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.PointImpl
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dc.impl.DimensionImpl <em>Dimension</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.DimensionImpl
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Non Negative Dimension</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION___NON_NEGATIVE_DIMENSION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Dimension</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.BoundsImpl
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Non Negative Size</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS___NON_NEGATIVE_SIZE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Bounds</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOUNDS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.dd.dc.KnownColor
	 * <em>Known Color</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.KnownColor
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getKnownColor()
	 * @generated
	 */
	int KNOWN_COLOR = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dc.AlignmentKind <em>Alignment Kind</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.AlignmentKind
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getAlignmentKind()
	 * @generated
	 */
	int ALIGNMENT_KIND = 4;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 5;

	/**
	 * The meta object id for the '<em>Integer</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 6;

	/**
	 * The meta object id for the '<em>Real</em>' data type. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 7;

	/**
	 * The meta object id for the '<em>String</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getString()
	 * @generated
	 */
	int STRING = 8;

	/**
	 * The meta object id for the '<em>Color</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.awt.Color
	 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 9;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dc.Point <em>Point</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Point#getX <em>X</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Point#getY <em>Y</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dc.Dimension <em>Dimension</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dc.Dimension#nonNegativeDimension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Dimension</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Non Negative Dimension</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dc.Dimension#nonNegativeDimension(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getDimension__NonNegativeDimension__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds#getX <em>X</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Bounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds#getY <em>Y</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Bounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds#getWidth <em>Width</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Bounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds#getHeight <em>Height</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.papyrus.dd.dc.Bounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dc.Bounds#nonNegativeSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Size</em>} ' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Non Negative Size</em>' operation.
	 * @see org.eclipse.papyrus.dd.dc.Bounds#nonNegativeSize(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getBounds__NonNegativeSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.papyrus.dd.dc.KnownColor <em>Known Color</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Known Color</em>'.
	 * @see org.eclipse.papyrus.dd.dc.KnownColor
	 * @generated
	 */
	EEnum getKnownColor();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.papyrus.dd.dc.AlignmentKind <em>Alignment Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Alignment Kind</em>'.
	 * @see org.eclipse.papyrus.dd.dc.AlignmentKind
	 * @generated
	 */
	EEnum getAlignmentKind();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '<em>Real</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Real</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getReal();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.awt.Color
	 * <em>Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.awt.Color
	 * @model instanceClass="java.awt.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DCFactory getDCFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dc.impl.PointImpl <em>Point</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.PointImpl
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dc.impl.DimensionImpl
		 * <em>Dimension</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.DimensionImpl
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '
		 * <em><b>Non Negative Dimension</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation DIMENSION___NON_NEGATIVE_DIMENSION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDimension__NonNegativeDimension__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl <em>Bounds</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.BoundsImpl
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '<em><b>Non Negative Size</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation BOUNDS___NON_NEGATIVE_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getBounds__NonNegativeSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dc.KnownColor <em>Known Color</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.KnownColor
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getKnownColor()
		 * @generated
		 */
		EEnum KNOWN_COLOR = eINSTANCE.getKnownColor();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dc.AlignmentKind
		 * <em>Alignment Kind</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.AlignmentKind
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getAlignmentKind()
		 * @generated
		 */
		EEnum ALIGNMENT_KIND = eINSTANCE.getAlignmentKind();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Real</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getReal()
		 * @generated
		 */
		EDataType REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em>String</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Color</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.awt.Color
		 * @see org.eclipse.papyrus.dd.dc.impl.DCPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} // DCPackage
