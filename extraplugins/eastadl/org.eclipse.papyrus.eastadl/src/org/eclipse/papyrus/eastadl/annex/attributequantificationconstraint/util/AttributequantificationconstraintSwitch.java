/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage
 * @generated
 */
public class AttributequantificationconstraintSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static AttributequantificationconstraintPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AttributequantificationconstraintSwitch() {
		if (modelPackage == null) {
			modelPackage = AttributequantificationconstraintPackage.eINSTANCE;
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT: {
			AttributeQuantificationconstraint attributeQuantificationconstraint = (AttributeQuantificationconstraint) theEObject;
			T result = caseAttributeQuantificationconstraint(attributeQuantificationconstraint);
			if (result == null) {
				result = caseEAElement(attributeQuantificationconstraint);
			}
			if (result == null) {
				result = caseBehaviorConstraintParameter(attributeQuantificationconstraint);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case AttributequantificationconstraintPackage.QUANTIFICATION: {
			Quantification quantification = (Quantification) theEObject;
			T result = caseQuantification(quantification);
			if (result == null) {
				result = caseEAElement(quantification);
			}
			if (result == null) {
				result = caseEAExpression(quantification);
			}
			if (result == null) {
				result = caseEAValue(quantification);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING: {
			BehaviorAttributeBinding behaviorAttributeBinding = (BehaviorAttributeBinding) theEObject;
			T result = caseBehaviorAttributeBinding(behaviorAttributeBinding);
			if (result == null) {
				result = caseRelationship(behaviorAttributeBinding);
			}
			if (result == null) {
				result = caseEAElement(behaviorAttributeBinding);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case AttributequantificationconstraintPackage.LOGICAL_EVENT: {
			LogicalEvent logicalEvent = (LogicalEvent) theEObject;
			T result = caseLogicalEvent(logicalEvent);
			if (result == null) {
				result = caseQuantification(logicalEvent);
			}
			if (result == null) {
				result = caseEAElement(logicalEvent);
			}
			if (result == null) {
				result = caseEAExpression(logicalEvent);
			}
			if (result == null) {
				result = caseEAValue(logicalEvent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case AttributequantificationconstraintPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null) {
				result = caseEAElement(attribute);
			}
			if (result == null) {
				result = caseBehaviorConstraintParameter(attribute);
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Quantificationconstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Quantificationconstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeQuantificationconstraint(AttributeQuantificationconstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantification(Quantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorAttributeBinding(BehaviorAttributeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalEvent(LogicalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintParameter(BehaviorConstraintParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAValue(EAValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAExpression(EAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
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

} // AttributequantificationconstraintSwitch
