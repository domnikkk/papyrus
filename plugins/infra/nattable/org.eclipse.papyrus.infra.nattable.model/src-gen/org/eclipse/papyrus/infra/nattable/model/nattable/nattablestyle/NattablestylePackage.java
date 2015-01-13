/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory
 * @model kind="package"
 * @generated
 */
public interface NattablestylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "nattablestyle"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/nattable/model/table/nattablestyle"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "nattablestyle"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	NattablestylePackage eINSTANCE = org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLE__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLE___GET_EANNOTATION__STRING = EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NamedStyleImpl <em>Named Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NamedStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getNamedStyle()
	 * @generated
	 */
	int NAMED_STYLE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE__EANNOTATIONS = STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE__NAME = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE___GET_EANNOTATION__STRING = STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Named Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMED_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl <em>Font Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__EANNOTATIONS = STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_COLOR = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_NAME = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__FONT_HEIGHT = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__BOLD = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__ITALIC = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__UNDERLINE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE__STRIKE_THROUGH = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Font Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE___GET_EANNOTATION__STRING = STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Font Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FONT_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.CellTextStyleImpl <em>Cell Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.CellTextStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getCellTextStyle()
	 * @generated
	 */
	int CELL_TEXT_STYLE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_TEXT_STYLE__EANNOTATIONS = STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_TEXT_STYLE__ALIGNMENT = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_TEXT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_TEXT_STYLE___GET_EANNOTATION__STRING = STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Cell Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CELL_TEXT_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntValueStyleImpl <em>Int Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getIntValueStyle()
	 * @generated
	 */
	int INT_VALUE_STYLE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE__INT_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Int Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntListValueStyleImpl <em>Int List Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntListValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getIntListValueStyle()
	 * @generated
	 */
	int INT_LIST_VALUE_STYLE = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Int List Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE__INT_LIST_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Int List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INT_LIST_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanValueStyleImpl <em>Boolean Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getBooleanValueStyle()
	 * @generated
	 */
	int BOOLEAN_VALUE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Boolean Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanListValueStyleImpl <em>Boolean List Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanListValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getBooleanListValueStyle()
	 * @generated
	 */
	int BOOLEAN_LIST_VALUE_STYLE = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Boolean List Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Boolean List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LIST_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleValueStyleImpl <em>Double Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDoubleValueStyle()
	 * @generated
	 */
	int DOUBLE_VALUE_STYLE = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE__DOUBLE_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Double Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleListValueStyleImpl <em>Double List Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleListValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDoubleListValueStyle()
	 * @generated
	 */
	int DOUBLE_LIST_VALUE_STYLE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Double List Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Double List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LIST_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringValueStyleImpl <em>String Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStringValueStyle()
	 * @generated
	 */
	int STRING_VALUE_STYLE = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE__STRING_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>String Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringListValueStyleImpl <em>String List Value Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringListValueStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStringListValueStyle()
	 * @generated
	 */
	int STRING_LIST_VALUE_STYLE = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE__EANNOTATIONS = NAMED_STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE__NAME = NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>String List Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE = NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE_FEATURE_COUNT = NAMED_STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE___GET_EANNOTATION__STRING = NAMED_STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>String List Value Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_VALUE_STYLE_OPERATION_COUNT = NAMED_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl <em>Styled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStyledElement()
	 * @generated
	 */
	int STYLED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT__EANNOTATIONS = EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT__STYLES = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Styled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT_FEATURE_COUNT = EcorePackage.EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT___GET_EANNOTATION__STRING = EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT___GET_NAMED_STYLE__ECLASS_STRING = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT___GET_STYLE__ECLASS = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT___CREATE_STYLE__ECLASS = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Styled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STYLED_ELEMENT_OPERATION_COUNT = EcorePackage.EMODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.TableDisplayStyleImpl <em>Table Display Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.TableDisplayStyleImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getTableDisplayStyle()
	 * @generated
	 */
	int TABLE_DISPLAY_STYLE = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_DISPLAY_STYLE__EANNOTATIONS = STYLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Display Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_DISPLAY_STYLE__DISPLAY_STYLE = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Display Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_DISPLAY_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_DISPLAY_STYLE___GET_EANNOTATION__STRING = STYLE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Table Display Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TABLE_DISPLAY_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment <em>Cell Text Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getCellTextAlignment()
	 * @generated
	 */
	int CELL_TEXT_ALIGNMENT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle <em>Display Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDisplayStyle()
	 * @generated
	 */
	int DISPLAY_STYLE = 15;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle <em>Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Named Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle
	 * @generated
	 */
	EClass getNamedStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle#getName()
	 * @see #getNamedStyle()
	 * @generated
	 */
	EAttribute getNamedStyle_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Font Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle
	 * @generated
	 */
	EClass getFontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontColor()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontName()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontHeight <em>Font Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Height</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#getFontHeight()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_FontHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isBold()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isItalic()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isUnderline()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_Underline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isStrikeThrough <em>Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Strike Through</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle#isStrikeThrough()
	 * @see #getFontStyle()
	 * @generated
	 */
	EAttribute getFontStyle_StrikeThrough();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle <em>Cell Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Cell Text Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle
	 * @generated
	 */
	EClass getCellTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle#getAlignment()
	 * @see #getCellTextStyle()
	 * @generated
	 */
	EAttribute getCellTextStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle <em>Int Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Int Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle
	 * @generated
	 */
	EClass getIntValueStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle#getIntValue()
	 * @see #getIntValueStyle()
	 * @generated
	 */
	EAttribute getIntValueStyle_IntValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle <em>Int List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Int List Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle
	 * @generated
	 */
	EClass getIntListValueStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle#getIntListValue <em>Int List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Int List Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle#getIntListValue()
	 * @see #getIntListValueStyle()
	 * @generated
	 */
	EAttribute getIntListValueStyle_IntListValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle <em>Boolean Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Boolean Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle
	 * @generated
	 */
	EClass getBooleanValueStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle#isBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle#isBooleanValue()
	 * @see #getBooleanValueStyle()
	 * @generated
	 */
	EAttribute getBooleanValueStyle_BooleanValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle <em>Boolean List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Boolean List Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle
	 * @generated
	 */
	EClass getBooleanListValueStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle#getBooleanListValue <em>Boolean List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Boolean List Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle#getBooleanListValue()
	 * @see #getBooleanListValueStyle()
	 * @generated
	 */
	EAttribute getBooleanListValueStyle_BooleanListValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle <em>Double Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Double Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle
	 * @generated
	 */
	EClass getDoubleValueStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle#getDoubleValue()
	 * @see #getDoubleValueStyle()
	 * @generated
	 */
	EAttribute getDoubleValueStyle_DoubleValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle <em>Double List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Double List Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle
	 * @generated
	 */
	EClass getDoubleListValueStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle#getDoubleListValue <em>Double List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>Double List Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle#getDoubleListValue()
	 * @see #getDoubleListValueStyle()
	 * @generated
	 */
	EAttribute getDoubleListValueStyle_DoubleListValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle <em>String Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle
	 * @generated
	 */
	EClass getStringValueStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle#getStringValue()
	 * @see #getStringValueStyle()
	 * @generated
	 */
	EAttribute getStringValueStyle_StringValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle <em>String List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String List Value Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle
	 * @generated
	 */
	EClass getStringListValueStyle();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle#getStringListValue <em>String List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute list '<em>String List Value</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle#getStringListValue()
	 * @see #getStringListValueStyle()
	 * @generated
	 */
	EAttribute getStringListValueStyle_StringListValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement <em>Styled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Styled Element</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement
	 * @generated
	 */
	EClass getStyledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getStyles()
	 * @see #getStyledElement()
	 * @generated
	 */
	EReference getStyledElement_Styles();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getNamedStyle(org.eclipse.emf.ecore.EClass, java.lang.String) <em>Get Named Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Named Style</em>' operation.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getNamedStyle(org.eclipse.emf.ecore.EClass, java.lang.String)
	 * @generated
	 */
	EOperation getStyledElement__GetNamedStyle__EClass_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getStyle(org.eclipse.emf.ecore.EClass) <em>Get Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Style</em>' operation.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#getStyle(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStyledElement__GetStyle__EClass();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#createStyle(org.eclipse.emf.ecore.EClass) <em>Create Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Create Style</em>' operation.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement#createStyle(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getStyledElement__CreateStyle__EClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle <em>Table Display Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Table Display Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle
	 * @generated
	 */
	EClass getTableDisplayStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle#getDisplayStyle <em>Display Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle#getDisplayStyle()
	 * @see #getTableDisplayStyle()
	 * @generated
	 */
	EAttribute getTableDisplayStyle_DisplayStyle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment <em>Cell Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Cell Text Alignment</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment
	 * @generated
	 */
	EEnum getCellTextAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle <em>Display Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Display Style</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle
	 * @generated
	 */
	EEnum getDisplayStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NattablestyleFactory getNattablestyleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NamedStyleImpl <em>Named Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NamedStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getNamedStyle()
		 * @generated
		 */
		EClass NAMED_STYLE = eINSTANCE.getNamedStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NAMED_STYLE__NAME = eINSTANCE.getNamedStyle_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl <em>Font Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getFontStyle()
		 * @generated
		 */
		EClass FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__FONT_COLOR = eINSTANCE.getFontStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__FONT_NAME = eINSTANCE.getFontStyle_FontName();

		/**
		 * The meta object literal for the '<em><b>Font Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__FONT_HEIGHT = eINSTANCE.getFontStyle_FontHeight();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__BOLD = eINSTANCE.getFontStyle_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__ITALIC = eINSTANCE.getFontStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__UNDERLINE = eINSTANCE.getFontStyle_Underline();

		/**
		 * The meta object literal for the '<em><b>Strike Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute FONT_STYLE__STRIKE_THROUGH = eINSTANCE.getFontStyle_StrikeThrough();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.CellTextStyleImpl <em>Cell Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.CellTextStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getCellTextStyle()
		 * @generated
		 */
		EClass CELL_TEXT_STYLE = eINSTANCE.getCellTextStyle();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CELL_TEXT_STYLE__ALIGNMENT = eINSTANCE.getCellTextStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntValueStyleImpl <em>Int Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getIntValueStyle()
		 * @generated
		 */
		EClass INT_VALUE_STYLE = eINSTANCE.getIntValueStyle();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute INT_VALUE_STYLE__INT_VALUE = eINSTANCE.getIntValueStyle_IntValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntListValueStyleImpl <em>Int List Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.IntListValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getIntListValueStyle()
		 * @generated
		 */
		EClass INT_LIST_VALUE_STYLE = eINSTANCE.getIntListValueStyle();

		/**
		 * The meta object literal for the '<em><b>Int List Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute INT_LIST_VALUE_STYLE__INT_LIST_VALUE = eINSTANCE.getIntListValueStyle_IntListValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanValueStyleImpl <em>Boolean Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getBooleanValueStyle()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_STYLE = eINSTANCE.getBooleanValueStyle();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE = eINSTANCE.getBooleanValueStyle_BooleanValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanListValueStyleImpl <em>Boolean List Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanListValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getBooleanListValueStyle()
		 * @generated
		 */
		EClass BOOLEAN_LIST_VALUE_STYLE = eINSTANCE.getBooleanListValueStyle();

		/**
		 * The meta object literal for the '<em><b>Boolean List Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE = eINSTANCE.getBooleanListValueStyle_BooleanListValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleValueStyleImpl <em>Double Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDoubleValueStyle()
		 * @generated
		 */
		EClass DOUBLE_VALUE_STYLE = eINSTANCE.getDoubleValueStyle();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOUBLE_VALUE_STYLE__DOUBLE_VALUE = eINSTANCE.getDoubleValueStyle_DoubleValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleListValueStyleImpl <em>Double List Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleListValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDoubleListValueStyle()
		 * @generated
		 */
		EClass DOUBLE_LIST_VALUE_STYLE = eINSTANCE.getDoubleListValueStyle();

		/**
		 * The meta object literal for the '<em><b>Double List Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE = eINSTANCE.getDoubleListValueStyle_DoubleListValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringValueStyleImpl <em>String Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStringValueStyle()
		 * @generated
		 */
		EClass STRING_VALUE_STYLE = eINSTANCE.getStringValueStyle();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_VALUE_STYLE__STRING_VALUE = eINSTANCE.getStringValueStyle_StringValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringListValueStyleImpl <em>String List Value Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StringListValueStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStringListValueStyle()
		 * @generated
		 */
		EClass STRING_LIST_VALUE_STYLE = eINSTANCE.getStringListValueStyle();

		/**
		 * The meta object literal for the '<em><b>String List Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE = eINSTANCE.getStringListValueStyle_StringListValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl <em>Styled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getStyledElement()
		 * @generated
		 */
		EClass STYLED_ELEMENT = eINSTANCE.getStyledElement();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STYLED_ELEMENT__STYLES = eINSTANCE.getStyledElement_Styles();

		/**
		 * The meta object literal for the '<em><b>Get Named Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STYLED_ELEMENT___GET_NAMED_STYLE__ECLASS_STRING = eINSTANCE.getStyledElement__GetNamedStyle__EClass_String();

		/**
		 * The meta object literal for the '<em><b>Get Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STYLED_ELEMENT___GET_STYLE__ECLASS = eINSTANCE.getStyledElement__GetStyle__EClass();

		/**
		 * The meta object literal for the '<em><b>Create Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation STYLED_ELEMENT___CREATE_STYLE__ECLASS = eINSTANCE.getStyledElement__CreateStyle__EClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.TableDisplayStyleImpl <em>Table Display Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.TableDisplayStyleImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getTableDisplayStyle()
		 * @generated
		 */
		EClass TABLE_DISPLAY_STYLE = eINSTANCE.getTableDisplayStyle();

		/**
		 * The meta object literal for the '<em><b>Display Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TABLE_DISPLAY_STYLE__DISPLAY_STYLE = eINSTANCE.getTableDisplayStyle_DisplayStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment <em>Cell Text Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getCellTextAlignment()
		 * @generated
		 */
		EEnum CELL_TEXT_ALIGNMENT = eINSTANCE.getCellTextAlignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle <em>Display Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.NattablestylePackageImpl#getDisplayStyle()
		 * @generated
		 */
		EEnum DISPLAY_STYLE = eINSTANCE.getDisplayStyle();

	}

} // NattablestylePackage
