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
package org.eclipse.papyrus.eastadl.infrastructure.datatypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EABoolean;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EAString;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;


/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDatatype(CompositeDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAString(EAString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABoolean(EABoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataType(ArrayDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackageableElement(EAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeableValueType(RangeableValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableSpecification(TraceableSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DatatypesPackage.EA_DATATYPE: {
			EADatatype eaDatatype = (EADatatype) theEObject;
			T result = caseEADatatype(eaDatatype);
			if (result == null) {
				result = caseTraceableSpecification(eaDatatype);
			}
			if (result == null) {
				result = caseEAPackageableElement(eaDatatype);
			}
			if (result == null) {
				result = caseEAElement(eaDatatype);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.EA_DATATYPE_PROTOTYPE: {
			EADatatypePrototype eaDatatypePrototype = (EADatatypePrototype) theEObject;
			T result = caseEADatatypePrototype(eaDatatypePrototype);
			if (result == null) {
				result = caseEAElement(eaDatatypePrototype);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.EA_NUMERICAL: {
			EANumerical eaNumerical = (EANumerical) theEObject;
			T result = caseEANumerical(eaNumerical);
			if (result == null) {
				result = caseEADatatype(eaNumerical);
			}
			if (result == null) {
				result = caseTraceableSpecification(eaNumerical);
			}
			if (result == null) {
				result = caseEAPackageableElement(eaNumerical);
			}
			if (result == null) {
				result = caseEAElement(eaNumerical);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.UNIT: {
			Unit unit = (Unit) theEObject;
			T result = caseUnit(unit);
			if (result == null) {
				result = caseEAPackageableElement(unit);
			}
			if (result == null) {
				result = caseEAElement(unit);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.QUANTITY: {
			Quantity quantity = (Quantity) theEObject;
			T result = caseQuantity(quantity);
			if (result == null) {
				result = caseEAPackageableElement(quantity);
			}
			if (result == null) {
				result = caseEAElement(quantity);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.RANGEABLE_VALUE_TYPE: {
			RangeableValueType rangeableValueType = (RangeableValueType) theEObject;
			T result = caseRangeableValueType(rangeableValueType);
			if (result == null) {
				result = caseEADatatype(rangeableValueType);
			}
			if (result == null) {
				result = caseTraceableSpecification(rangeableValueType);
			}
			if (result == null) {
				result = caseEAPackageableElement(rangeableValueType);
			}
			if (result == null) {
				result = caseEAElement(rangeableValueType);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.COMPOSITE_DATATYPE: {
			CompositeDatatype compositeDatatype = (CompositeDatatype) theEObject;
			T result = caseCompositeDatatype(compositeDatatype);
			if (result == null) {
				result = caseEADatatype(compositeDatatype);
			}
			if (result == null) {
				result = caseTraceableSpecification(compositeDatatype);
			}
			if (result == null) {
				result = caseEAPackageableElement(compositeDatatype);
			}
			if (result == null) {
				result = caseEAElement(compositeDatatype);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.EA_STRING: {
			EAString eaString = (EAString) theEObject;
			T result = caseEAString(eaString);
			if (result == null) {
				result = caseEADatatype(eaString);
			}
			if (result == null) {
				result = caseTraceableSpecification(eaString);
			}
			if (result == null) {
				result = caseEAPackageableElement(eaString);
			}
			if (result == null) {
				result = caseEAElement(eaString);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.EA_BOOLEAN: {
			EABoolean eaBoolean = (EABoolean) theEObject;
			T result = caseEABoolean(eaBoolean);
			if (result == null) {
				result = caseEADatatype(eaBoolean);
			}
			if (result == null) {
				result = caseTraceableSpecification(eaBoolean);
			}
			if (result == null) {
				result = caseEAPackageableElement(eaBoolean);
			}
			if (result == null) {
				result = caseEAElement(eaBoolean);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.ENUMERATION_LITERAL: {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
			T result = caseEnumerationLiteral(enumerationLiteral);
			if (result == null) {
				result = caseEAElement(enumerationLiteral);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.ENUMERATION: {
			Enumeration enumeration = (Enumeration) theEObject;
			T result = caseEnumeration(enumeration);
			if (result == null) {
				result = caseEADatatype(enumeration);
			}
			if (result == null) {
				result = caseTraceableSpecification(enumeration);
			}
			if (result == null) {
				result = caseEAPackageableElement(enumeration);
			}
			if (result == null) {
				result = caseEAElement(enumeration);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DatatypesPackage.ARRAY_DATA_TYPE: {
			ArrayDataType arrayDataType = (ArrayDataType) theEObject;
			T result = caseArrayDataType(arrayDataType);
			if (result == null) {
				result = caseEADatatype(arrayDataType);
			}
			if (result == null) {
				result = caseTraceableSpecification(arrayDataType);
			}
			if (result == null) {
				result = caseEAPackageableElement(arrayDataType);
			}
			if (result == null) {
				result = caseEAElement(arrayDataType);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatype(EADatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatypePrototype(EADatatypePrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEANumerical(EANumerical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

} // DatatypesSwitch
