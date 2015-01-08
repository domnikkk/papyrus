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
package org.eclipse.papyrus.eastadl.infrastructure.elements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Context;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAType;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Rationale;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Realization;
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
 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage
 * @generated
 */
public class ElementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static ElementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ElementsSwitch() {
		if (modelPackage == null) {
			modelPackage = ElementsPackage.eINSTANCE;
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
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackage(EAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAXML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAXML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAXML(EAXML object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EA Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAType(EAType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPort(EAPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAConnector(EAConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPrototype(EAPrototype object) {
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
		case ElementsPackage.TRACEABLE_SPECIFICATION: {
			TraceableSpecification traceableSpecification = (TraceableSpecification) theEObject;
			T result = caseTraceableSpecification(traceableSpecification);
			if (result == null)
				result = caseEAPackageableElement(traceableSpecification);
			if (result == null)
				result = caseEAElement(traceableSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_PACKAGEABLE_ELEMENT: {
			EAPackageableElement eaPackageableElement = (EAPackageableElement) theEObject;
			T result = caseEAPackageableElement(eaPackageableElement);
			if (result == null)
				result = caseEAElement(eaPackageableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.CONTEXT: {
			Context context = (Context) theEObject;
			T result = caseContext(context);
			if (result == null)
				result = caseEAPackageableElement(context);
			if (result == null)
				result = caseEAElement(context);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.RELATIONSHIP: {
			Relationship relationship = (Relationship) theEObject;
			T result = caseRelationship(relationship);
			if (result == null)
				result = caseEAElement(relationship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_TYPE: {
			EAType eaType = (EAType) theEObject;
			T result = caseEAType(eaType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_PORT: {
			EAPort eaPort = (EAPort) theEObject;
			T result = caseEAPort(eaPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_CONNECTOR: {
			EAConnector eaConnector = (EAConnector) theEObject;
			T result = caseEAConnector(eaConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_PROTOTYPE: {
			EAPrototype eaPrototype = (EAPrototype) theEObject;
			T result = caseEAPrototype(eaPrototype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.REALIZATION: {
			Realization realization = (Realization) theEObject;
			T result = caseRealization(realization);
			if (result == null)
				result = caseRelationship(realization);
			if (result == null)
				result = caseEAElement(realization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.RATIONALE: {
			Rationale rationale = (Rationale) theEObject;
			T result = caseRationale(rationale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_PACKAGE: {
			EAPackage eaPackage = (EAPackage) theEObject;
			T result = caseEAPackage(eaPackage);
			if (result == null)
				result = caseEAElement(eaPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EAXML: {
			EAXML eaxml = (EAXML) theEObject;
			T result = caseEAXML(eaxml);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ElementsPackage.EA_ELEMENT: {
			EAElement eaElement = (EAElement) theEObject;
			T result = caseEAElement(eaElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

} // ElementsSwitch
