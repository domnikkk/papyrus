/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesFactory
 * @model kind="package"
 * @generated
 */
public interface ValuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Infrastructure/Values/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "Values";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValuesPackage eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAValueImpl <em>EA Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAValue()
	 * @generated
	 */
	int EA_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_VALUE__BASE_VALUE_SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>EA Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EA Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAArrayValueImpl <em>EA Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAArrayValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAArrayValue()
	 * @generated
	 */
	int EA_ARRAY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EABooleanValueImpl <em>EA Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EABooleanValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEABooleanValue()
	 * @generated
	 */
	int EA_BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EACompositeValueImpl <em>EA Composite Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EACompositeValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEACompositeValue()
	 * @generated
	 */
	int EA_COMPOSITE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Composite Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Composite Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAEnumerationValueImpl <em>EA Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAEnumerationValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAEnumerationValue()
	 * @generated
	 */
	int EA_ENUMERATION_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAExpressionImpl <em>EA Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAExpressionImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAExpression()
	 * @generated
	 */
	int EA_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>EA Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EA Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EANumericalValueImpl <em>EA Numerical Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EANumericalValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEANumericalValue()
	 * @generated
	 */
	int EA_NUMERICAL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Numerical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Numerical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAStringValueImpl <em>EA String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAStringValueImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAStringValue()
	 * @generated
	 */
	int EA_STRING_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE__BASE_VALUE_SPECIFICATION = EA_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE_OPERATION_COUNT = EA_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue <em>EA Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Array Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue
	 * @generated
	 */
	EClass getEAArrayValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue#getValue()
	 * @see #getEAArrayValue()
	 * @generated
	 */
	EReference getEAArrayValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAValue <em>EA Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAValue
	 * @generated
	 */
	EClass getEAValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAValue#getType()
	 * @see #getEAValue()
	 * @generated
	 */
	EReference getEAValue_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAValue#getBase_ValueSpecification <em>Base Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Value Specification</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAValue#getBase_ValueSpecification()
	 * @see #getEAValue()
	 * @generated
	 */
	EReference getEAValue_Base_ValueSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue <em>EA Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Boolean Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue
	 * @generated
	 */
	EClass getEABooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue#isValue()
	 * @see #getEABooleanValue()
	 * @generated
	 */
	EAttribute getEABooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue <em>EA Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Composite Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue
	 * @generated
	 */
	EClass getEACompositeValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue#getValue()
	 * @see #getEACompositeValue()
	 * @generated
	 */
	EReference getEACompositeValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue <em>EA Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Enumeration Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue
	 * @generated
	 */
	EClass getEAEnumerationValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue#getValue()
	 * @see #getEAEnumerationValue()
	 * @generated
	 */
	EReference getEAEnumerationValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression <em>EA Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Expression</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression
	 * @generated
	 */
	EClass getEAExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue <em>EA Numerical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Numerical Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue
	 * @generated
	 */
	EClass getEANumericalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue#getValue()
	 * @see #getEANumericalValue()
	 * @generated
	 */
	EAttribute getEANumericalValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue <em>EA String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA String Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue
	 * @generated
	 */
	EClass getEAStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue#getValue()
	 * @see #getEAStringValue()
	 * @generated
	 */
	EAttribute getEAStringValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValuesFactory getValuesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAArrayValueImpl <em>EA Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAArrayValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAArrayValue()
		 * @generated
		 */
		EClass EA_ARRAY_VALUE = eINSTANCE.getEAArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_ARRAY_VALUE__VALUE = eINSTANCE.getEAArrayValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAValueImpl <em>EA Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAValue()
		 * @generated
		 */
		EClass EA_VALUE = eINSTANCE.getEAValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_VALUE__TYPE = eINSTANCE.getEAValue_Type();

		/**
		 * The meta object literal for the '<em><b>Base Value Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_VALUE__BASE_VALUE_SPECIFICATION = eINSTANCE.getEAValue_Base_ValueSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EABooleanValueImpl <em>EA Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EABooleanValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEABooleanValue()
		 * @generated
		 */
		EClass EA_BOOLEAN_VALUE = eINSTANCE.getEABooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EA_BOOLEAN_VALUE__VALUE = eINSTANCE.getEABooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EACompositeValueImpl <em>EA Composite Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EACompositeValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEACompositeValue()
		 * @generated
		 */
		EClass EA_COMPOSITE_VALUE = eINSTANCE.getEACompositeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_COMPOSITE_VALUE__VALUE = eINSTANCE.getEACompositeValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAEnumerationValueImpl <em>EA Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAEnumerationValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAEnumerationValue()
		 * @generated
		 */
		EClass EA_ENUMERATION_VALUE = eINSTANCE.getEAEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_ENUMERATION_VALUE__VALUE = eINSTANCE.getEAEnumerationValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAExpressionImpl <em>EA Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAExpressionImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAExpression()
		 * @generated
		 */
		EClass EA_EXPRESSION = eINSTANCE.getEAExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EANumericalValueImpl <em>EA Numerical Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EANumericalValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEANumericalValue()
		 * @generated
		 */
		EClass EA_NUMERICAL_VALUE = eINSTANCE.getEANumericalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EA_NUMERICAL_VALUE__VALUE = eINSTANCE.getEANumericalValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAStringValueImpl <em>EA String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.EAStringValueImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl#getEAStringValue()
		 * @generated
		 */
		EClass EA_STRING_VALUE = eINSTANCE.getEAStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EA_STRING_VALUE__VALUE = eINSTANCE.getEAStringValue_Value();

	}

} // ValuesPackage
