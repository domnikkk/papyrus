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
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Context;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The HardwareComponentType represents hardware element on an abstract level, allowing preliminary engineering activities related to hardware.
 *
 * Semantics:
 * The HardwareElementType is a structural entity that defines a part of an electrical architecture. Through its ports it can be connected to electrical sources and sinks. Its logical behavior, the transfer function, may be defined in an HWFunctionType
 * referencing the HardwareElementType. This is typically connected through its ports to the environment model to participate in the end-to-end behavioral definition of a function.
 *
 *
 * Extension:
 * Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType#getConnector <em>Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType#getPin <em>Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType#getPart <em>Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType#getPortConnector <em>Port Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType()
 * @model
 * @generated
 */
public interface HardwareComponentType extends Context, EAType {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWConnectors.
	 * {derived from UML::StructuredClassifier::ownedConnector}
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType_Connector()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<HardwareConnector> getConnector();

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Ports.
	 * {derived from UML::EncapsulatedClassifier::ownedPort}
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Pin</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType_Pin()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<HardwarePin> getPin();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWElementPrototypes.
	 * {derived from UML::Classifier::attribute}
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType_Part()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getPart();

	/**
	 * Returns the value of the '<em><b>Port Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Connector</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Port Connector</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType_PortConnector()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<HardwarePortConnector> getPortConnector();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage#getHardwareComponentType_Port()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<HardwarePort> getPort();

} // HardwareComponentType
