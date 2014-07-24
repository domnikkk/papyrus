/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Collaboration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#getBase_Collaboration <em>Base Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Collaboration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Collaboration</em>' reference.
	 * @see #setBase_Collaboration(Collaboration)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getProtocol_Base_Collaboration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Collaboration getBase_Collaboration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#getBase_Collaboration <em>Base Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Collaboration</em>' reference.
	 * @see #getBase_Collaboration()
	 * @generated
	 */
	void setBase_Collaboration(Collaboration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Collaboration.generalization->size() <= 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Protocols can have at most one generalization'"
	 * @generated
	 */
	boolean Protocolscanhaveatmostonegeneralization(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Protocol
