/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingAttribute;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingEvent;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Context;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;
import org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification;

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
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage
 * @generated
 */
public class BehaviordescriptionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static BehaviordescriptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BehaviordescriptionSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviordescriptionPackage.eINSTANCE;
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE: {
			BehaviorConstraintBindingAttribute behaviorConstraintBindingAttribute = (BehaviorConstraintBindingAttribute) theEObject;
			T result = caseBehaviorConstraintBindingAttribute(behaviorConstraintBindingAttribute);
			if (result == null) {
				result = caseAttribute(behaviorConstraintBindingAttribute);
			}
			if (result == null) {
				result = caseBehaviorConstraintInternalBinding(behaviorConstraintBindingAttribute);
			}
			if (result == null) {
				result = caseEAElement(behaviorConstraintBindingAttribute);
			}
			if (result == null) {
				result = caseBehaviorConstraintParameter(behaviorConstraintBindingAttribute);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PARAMETER: {
			BehaviorConstraintParameter behaviorConstraintParameter = (BehaviorConstraintParameter) theEObject;
			T result = caseBehaviorConstraintParameter(behaviorConstraintParameter);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING: {
			BehaviorConstraintInternalBinding behaviorConstraintInternalBinding = (BehaviorConstraintInternalBinding) theEObject;
			T result = caseBehaviorConstraintInternalBinding(behaviorConstraintInternalBinding);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_BINDING_EVENT: {
			BehaviorConstraintBindingEvent behaviorConstraintBindingEvent = (BehaviorConstraintBindingEvent) theEObject;
			T result = caseBehaviorConstraintBindingEvent(behaviorConstraintBindingEvent);
			if (result == null) {
				result = caseTransitionEvent(behaviorConstraintBindingEvent);
			}
			if (result == null) {
				result = caseBehaviorConstraintInternalBinding(behaviorConstraintBindingEvent);
			}
			if (result == null) {
				result = caseEAElement(behaviorConstraintBindingEvent);
			}
			if (result == null) {
				result = caseBehaviorConstraintParameter(behaviorConstraintBindingEvent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE: {
			BehaviorConstraintPrototype behaviorConstraintPrototype = (BehaviorConstraintPrototype) theEObject;
			T result = caseBehaviorConstraintPrototype(behaviorConstraintPrototype);
			if (result == null) {
				result = caseTraceableSpecification(behaviorConstraintPrototype);
			}
			if (result == null) {
				result = caseEAPackageableElement(behaviorConstraintPrototype);
			}
			if (result == null) {
				result = caseEAElement(behaviorConstraintPrototype);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE: {
			BehaviorConstraintType behaviorConstraintType = (BehaviorConstraintType) theEObject;
			T result = caseBehaviorConstraintType(behaviorConstraintType);
			if (result == null) {
				result = caseContext(behaviorConstraintType);
			}
			if (result == null) {
				result = caseEAPackageableElement(behaviorConstraintType);
			}
			if (result == null) {
				result = caseEAElement(behaviorConstraintType);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING: {
			BehaviorConstraintTargetBinding behaviorConstraintTargetBinding = (BehaviorConstraintTargetBinding) theEObject;
			T result = caseBehaviorConstraintTargetBinding(behaviorConstraintTargetBinding);
			if (result == null) {
				result = caseRelationship(behaviorConstraintTargetBinding);
			}
			if (result == null) {
				result = caseEAElement(behaviorConstraintTargetBinding);
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Binding Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Binding Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintBindingAttribute(BehaviorConstraintBindingAttribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintInternalBinding(BehaviorConstraintInternalBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Binding Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Binding Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintBindingEvent(BehaviorConstraintBindingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintPrototype(BehaviorConstraintPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintType(BehaviorConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Target Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Target Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintTargetBinding(BehaviorConstraintTargetBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEvent(TransitionEvent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
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
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
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

} // BehaviordescriptionSwitch
