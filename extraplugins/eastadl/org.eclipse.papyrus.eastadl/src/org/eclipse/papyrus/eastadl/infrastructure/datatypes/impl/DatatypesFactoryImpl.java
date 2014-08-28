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
package org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesFactory;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EABoolean;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EAString;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory) EPackage.Registry.INSTANCE.getEFactory(DatatypesPackage.eNS_URI);
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertjavalangFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DatatypesPackage.NUMERICAL:
			return convertNumericalToString(eDataType, instanceValue);
		case DatatypesPackage.JAVALANG_FLOAT:
			return convertjavalangFloatToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADatatypePrototype createEADatatypePrototype() {
		EADatatypePrototypeImpl eaDatatypePrototype = new EADatatypePrototypeImpl();
		return eaDatatypePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EANumerical createEANumerical() {
		EANumericalImpl eaNumerical = new EANumericalImpl();
		return eaNumerical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DatatypesPackage.EA_DATATYPE_PROTOTYPE:
			return createEADatatypePrototype();
		case DatatypesPackage.EA_NUMERICAL:
			return createEANumerical();
		case DatatypesPackage.UNIT:
			return createUnit();
		case DatatypesPackage.QUANTITY:
			return createQuantity();
		case DatatypesPackage.RANGEABLE_VALUE_TYPE:
			return createRangeableValueType();
		case DatatypesPackage.COMPOSITE_DATATYPE:
			return createCompositeDatatype();
		case DatatypesPackage.EA_STRING:
			return createEAString();
		case DatatypesPackage.EA_BOOLEAN:
			return createEABoolean();
		case DatatypesPackage.ENUMERATION_LITERAL:
			return createEnumerationLiteral();
		case DatatypesPackage.ENUMERATION:
			return createEnumeration();
		case DatatypesPackage.ARRAY_DATA_TYPE:
			return createArrayDataType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CompositeDatatype createCompositeDatatype() {
		CompositeDatatypeImpl compositeDatatype = new CompositeDatatypeImpl();
		return compositeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAString createEAString() {
		EAStringImpl eaString = new EAStringImpl();
		return eaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EABoolean createEABoolean() {
		EABooleanImpl eaBoolean = new EABooleanImpl();
		return eaBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ArrayDataType createArrayDataType() {
		ArrayDataTypeImpl arrayDataType = new ArrayDataTypeImpl();
		return arrayDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Float createNumericalFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertNumericalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DatatypesPackage.NUMERICAL:
			return createNumericalFromString(eDataType, initialValue);
		case DatatypesPackage.JAVALANG_FLOAT:
			return createjavalangFloatFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Float createjavalangFloatFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RangeableValueType createRangeableValueType() {
		RangeableValueTypeImpl rangeableValueType = new RangeableValueTypeImpl();
		return rangeableValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage) getEPackage();
	}

} // DatatypesFactoryImpl
