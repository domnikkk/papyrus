/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.infrastructure.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The Datatypes subpackage of EAST-ADL2 defines EAST-ADL2 general-purpose datatypes that may be used to type structural constructs in several different modeling diagrams.
 *
 * The purpose of the metaclasses in the Datatypes subpackage is to specify the concepts for the specific domain.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Datatypes'"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatype()
		 * @generated
		 */
		EClass EA_DATATYPE = eINSTANCE.getEADatatype();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EA_DATATYPE__BASE_DATA_TYPE = eINSTANCE.getEADatatype_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypePrototypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatypePrototype()
		 * @generated
		 */
		EClass EA_DATATYPE_PROTOTYPE = eINSTANCE.getEADatatypePrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EA_DATATYPE_PROTOTYPE__TYPE = eINSTANCE.getEADatatypePrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EA_DATATYPE_PROTOTYPE__BASE_PROPERTY = eINSTANCE.getEADatatypePrototype_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EA_DATATYPE_PROTOTYPE__BASE_PARAMETER = eINSTANCE.getEADatatypePrototype_Base_Parameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EANumericalImpl <em>EA Numerical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EANumericalImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEANumerical()
		 * @generated
		 */
		EClass EA_NUMERICAL = eINSTANCE.getEANumerical();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EA_NUMERICAL__MAX = eINSTANCE.getEANumerical_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EA_NUMERICAL__MIN = eINSTANCE.getEANumerical_Min();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EA_NUMERICAL__UNIT = eINSTANCE.getEANumerical_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.UnitImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UNIT__FACTOR = eINSTANCE.getUnit_Factor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UNIT__OFFSET = eINSTANCE.getUnit_Offset();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UNIT__QUANTITY = eINSTANCE.getUnit_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UNIT__REFERENCE = eINSTANCE.getUnit_Reference();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Amount Of Substance Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__AMOUNT_OF_SUBSTANCE_EXP = eINSTANCE.getQuantity_AmountOfSubstanceExp();

		/**
		 * The meta object literal for the '<em><b>Electric Current Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__ELECTRIC_CURRENT_EXP = eINSTANCE.getQuantity_ElectricCurrentExp();

		/**
		 * The meta object literal for the '<em><b>Lenght Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__LENGHT_EXP = eINSTANCE.getQuantity_LenghtExp();

		/**
		 * The meta object literal for the '<em><b>Luminous Intensity Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__LUMINOUS_INTENSITY_EXP = eINSTANCE.getQuantity_LuminousIntensityExp();

		/**
		 * The meta object literal for the '<em><b>Mass Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__MASS_EXP = eINSTANCE.getQuantity_MassExp();

		/**
		 * The meta object literal for the '<em><b>Thermodynamic Temperature Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP = eINSTANCE.getQuantity_ThermodynamicTemperatureExp();

		/**
		 * The meta object literal for the '<em><b>Time Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUANTITY__TIME_EXP = eINSTANCE.getQuantity_TimeExp();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.RangeableValueTypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableValueType()
		 * @generated
		 */
		EClass RANGEABLE_VALUE_TYPE = eINSTANCE.getRangeableValueType();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__ACCURACY = eINSTANCE.getRangeableValueType_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__RESOLUTION = eINSTANCE.getRangeableValueType_Resolution();

		/**
		 * The meta object literal for the '<em><b>Significant Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = eINSTANCE.getRangeableValueType_SignificantDigits();

		/**
		 * The meta object literal for the '<em><b>Base Rangeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = eINSTANCE.getRangeableValueType_BaseRangeable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.CompositeDatatypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getCompositeDatatype()
		 * @generated
		 */
		EClass COMPOSITE_DATATYPE = eINSTANCE.getCompositeDatatype();

		/**
		 * The meta object literal for the '<em><b>Datatype Prototype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = eINSTANCE.getCompositeDatatype_DatatypePrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EAStringImpl <em>EA String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EAStringImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAString()
		 * @generated
		 */
		EClass EA_STRING = eINSTANCE.getEAString();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EABooleanImpl <em>EA Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EABooleanImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEABoolean()
		 * @generated
		 */
		EClass EA_BOOLEAN = eINSTANCE.getEABoolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationLiteralImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '<em><b>Is Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ENUMERATION__IS_MULTI_VALUED = eINSTANCE.getEnumeration_IsMultiValued();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl <em>Array Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getArrayDataType()
		 * @generated
		 */
		EClass ARRAY_DATA_TYPE = eINSTANCE.getArrayDataType();

		/**
		 * The meta object literal for the '<em><b>Max Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ARRAY_DATA_TYPE__MAX_LENGHT = eINSTANCE.getArrayDataType_MaxLenght();

		/**
		 * The meta object literal for the '<em><b>Min Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ARRAY_DATA_TYPE__MIN_LENGHT = eINSTANCE.getArrayDataType_MinLenght();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ARRAY_DATA_TYPE__ELEMENT_TYPE = eINSTANCE.getArrayDataType_ElementType();

		/**
		 * The meta object literal for the '<em>Numerical</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see java.lang.Float
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getNumerical()
		 * @generated
		 */
		EDataType NUMERICAL = eINSTANCE.getNumerical();

		/**
		 * The meta object literal for the '<em>javalang Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see java.lang.Float
		 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getjavalangFloat()
		 * @generated
		 */
		EDataType JAVALANG_FLOAT = eINSTANCE.getjavalangFloat();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Infrastructure/Datatypes/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "Datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatype()
	 * @generated
	 */
	int EA_DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__BASE_NAMED_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__NOTE = ElementsPackage.TRACEABLE_SPECIFICATION__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__BASE_DATA_TYPE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EADatatypePrototypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatypePrototype()
	 * @generated
	 */
	int EA_DATATYPE_PROTOTYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__BASE_PROPERTY = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__BASE_PARAMETER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Datatype Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EA Datatype Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EANumericalImpl <em>EA Numerical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EANumericalImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEANumerical()
	 * @generated
	 */
	int EA_NUMERICAL = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__MAX = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__MIN = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__UNIT = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Numerical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EA Numerical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.UnitImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__BASE_NAMED_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = ElementsPackage.EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__OWNED_COMMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__FACTOR = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__OFFSET = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__SYMBOL = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__QUANTITY = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT__REFERENCE = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.QuantityImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__BASE_NAMED_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NAME = ElementsPackage.EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__OWNED_COMMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Amount Of Substance Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__AMOUNT_OF_SUBSTANCE_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Electric Current Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ELECTRIC_CURRENT_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lenght Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LENGHT_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Luminous Intensity Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LUMINOUS_INTENSITY_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mass Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MASS_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thermodynamic Temperature Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY__TIME_EXP = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.RangeableValueTypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableValueType()
	 * @generated
	 */
	int RANGEABLE_VALUE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__ACCURACY = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__RESOLUTION = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Significant Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Rangeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rangeable Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rangeable Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.CompositeDatatypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getCompositeDatatype()
	 * @generated
	 */
	int COMPOSITE_DATATYPE = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Datatype Prototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EAStringImpl <em>EA String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EAStringImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAString()
	 * @generated
	 */
	int EA_STRING = 7;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The number of structural features of the '<em>EA String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EA String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_STRING_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EABooleanImpl <em>EA Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EABooleanImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEABoolean()
	 * @generated
	 */
	int EA_BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The number of structural features of the '<em>EA Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EA Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationLiteralImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.EnumerationImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 10;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_MULTI_VALUED = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl <em>Array Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getArrayDataType()
	 * @generated
	 */
	int ARRAY_DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__BASE_NAMED_ELEMENT = EA_DATATYPE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__BASE_PACKAGEABLE_ELEMENT = EA_DATATYPE__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__NOTE = EA_DATATYPE__NOTE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__BASE_DATA_TYPE = EA_DATATYPE__BASE_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Max Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__MAX_LENGHT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__MIN_LENGHT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE__ELEMENT_TYPE = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATA_TYPE_OPERATION_COUNT = EA_DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Numerical</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see java.lang.Float
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getNumerical()
	 * @generated
	 */
	int NUMERICAL = 12;

	/**
	 * The meta object id for the '<em>javalang Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see java.lang.Float
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl#getjavalangFloat()
	 * @generated
	 */
	int JAVALANG_FLOAT = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype <em>EA Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EA Datatype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype
	 * @generated
	 */
	EClass getEADatatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype#getBase_DataType()
	 * @see #getEADatatype()
	 * @generated
	 */
	EReference getEADatatype_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype <em>EA Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EA Datatype Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype
	 * @generated
	 */
	EClass getEADatatypePrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getType()
	 * @see #getEADatatypePrototype()
	 * @generated
	 */
	EReference getEADatatypePrototype_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getBase_Property()
	 * @see #getEADatatypePrototype()
	 * @generated
	 */
	EReference getEADatatypePrototype_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype#getBase_Parameter()
	 * @see #getEADatatypePrototype()
	 * @generated
	 */
	EReference getEADatatypePrototype_Base_Parameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical <em>EA Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EA Numerical</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical
	 * @generated
	 */
	EClass getEANumerical();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMax()
	 * @see #getEANumerical()
	 * @generated
	 */
	EAttribute getEANumerical_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getMin()
	 * @see #getEANumerical()
	 * @generated
	 */
	EAttribute getEANumerical_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical#getUnit()
	 * @see #getEANumerical()
	 * @generated
	 */
	EReference getEANumerical_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getFactor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Factor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getOffset()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Symbol();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Quantity</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getQuantity()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit#getReference()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Reference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Amount Of Substance Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getAmountOfSubstanceExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_AmountOfSubstanceExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Electric Current Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getElectricCurrentExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_ElectricCurrentExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getLenghtExp <em>Lenght Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Lenght Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getLenghtExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_LenghtExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Luminous Intensity Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getLuminousIntensityExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_LuminousIntensityExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getMassExp <em>Mass Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Mass Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getMassExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_MassExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Thermodynamic Temperature Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getThermodynamicTemperatureExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_ThermodynamicTemperatureExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getTimeExp <em>Time Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Time Exp</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity#getTimeExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_TimeExp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype <em>Composite Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Composite Datatype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype
	 * @generated
	 */
	EClass getCompositeDatatype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype#getDatatypePrototype <em>Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Datatype Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype#getDatatypePrototype()
	 * @see #getCompositeDatatype()
	 * @generated
	 */
	EReference getCompositeDatatype_DatatypePrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EAString <em>EA String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EA String</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EAString
	 * @generated
	 */
	EClass getEAString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EABoolean <em>EA Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EA Boolean</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EABoolean
	 * @generated
	 */
	EClass getEABoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration#isIsMultiValued <em>Is Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Is Multi Valued</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration#isIsMultiValued()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_IsMultiValued();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType <em>Array Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Array Data Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType
	 * @generated
	 */
	EClass getArrayDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMaxLenght <em>Max Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max Lenght</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMaxLenght()
	 * @see #getArrayDataType()
	 * @generated
	 */
	EAttribute getArrayDataType_MaxLenght();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMinLenght <em>Min Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Min Lenght</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getMinLenght()
	 * @see #getArrayDataType()
	 * @generated
	 */
	EAttribute getArrayDataType_MinLenght();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType#getElementType()
	 * @see #getArrayDataType()
	 * @generated
	 */
	EReference getArrayDataType_ElementType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Numerical</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getNumerical();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>javalang Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>javalang Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='java.lang.Float'"
	 * @generated
	 */
	EDataType getjavalangFloat();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType <em>Rangeable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Rangeable Value Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType
	 * @generated
	 */
	EClass getRangeableValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getAccuracy()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getResolution()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Significant Digits</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getSignificantDigits()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_SignificantDigits();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getBaseRangeable <em>Base Rangeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Rangeable</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType#getBaseRangeable()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EReference getRangeableValueType_BaseRangeable();

} // DatatypesPackage
