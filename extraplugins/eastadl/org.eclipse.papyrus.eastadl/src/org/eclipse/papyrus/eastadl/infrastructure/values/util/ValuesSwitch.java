/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage
 * @generated
 */
public class ValuesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesSwitch() {
		if (modelPackage == null) {
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ValuesPackage.EA_ARRAY_VALUE: {
				EAArrayValue eaArrayValue = (EAArrayValue)theEObject;
				T result = caseEAArrayValue(eaArrayValue);
				if (result == null) result = caseEAValue(eaArrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_VALUE: {
				EAValue eaValue = (EAValue)theEObject;
				T result = caseEAValue(eaValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_BOOLEAN_VALUE: {
				EABooleanValue eaBooleanValue = (EABooleanValue)theEObject;
				T result = caseEABooleanValue(eaBooleanValue);
				if (result == null) result = caseEAValue(eaBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_COMPOSITE_VALUE: {
				EACompositeValue eaCompositeValue = (EACompositeValue)theEObject;
				T result = caseEACompositeValue(eaCompositeValue);
				if (result == null) result = caseEAValue(eaCompositeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_ENUMERATION_VALUE: {
				EAEnumerationValue eaEnumerationValue = (EAEnumerationValue)theEObject;
				T result = caseEAEnumerationValue(eaEnumerationValue);
				if (result == null) result = caseEAValue(eaEnumerationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_EXPRESSION: {
				EAExpression eaExpression = (EAExpression)theEObject;
				T result = caseEAExpression(eaExpression);
				if (result == null) result = caseEAValue(eaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_NUMERICAL_VALUE: {
				EANumericalValue eaNumericalValue = (EANumericalValue)theEObject;
				T result = caseEANumericalValue(eaNumericalValue);
				if (result == null) result = caseEAValue(eaNumericalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EA_STRING_VALUE: {
				EAStringValue eaStringValue = (EAStringValue)theEObject;
				T result = caseEAStringValue(eaStringValue);
				if (result == null) result = caseEAValue(eaStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAArrayValue(EAArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAValue(EAValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABooleanValue(EABooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Composite Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Composite Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEACompositeValue(EACompositeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAEnumerationValue(EAEnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAExpression(EAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Numerical Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Numerical Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEANumericalValue(EANumericalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAStringValue(EAStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ValuesSwitch
