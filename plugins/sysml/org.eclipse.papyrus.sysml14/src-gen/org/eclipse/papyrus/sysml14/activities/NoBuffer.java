/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.activities;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ObjectNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When this stereotype is applied to object nodes, tokens arriving at the node are discarded if they are refused by outgoing edges, or refused by actions for object nodes that are input pins. This is typically used with fast or continuously flowing data values, to prevent buffer overrun, or to model transient values, such as electrical signals. For object nodes that are the target of continuous flows, «nobuffer» and «overwrite» have the same effect. The stereotype does not override UML token offering semantics; it just indicates what happens to the token when it is accepted. When the stereotype is not applied, the semantics are as in UML, specifically, tokens arriving at an object node that are refused by outgoing edges, or action for input pins, are held until they can leave the object node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.NoBuffer#getBase_ObjectNode <em>Base Object Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getNoBuffer()
 * @model
 * @generated
 */
public interface NoBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Object Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Object Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Object Node</em>' reference.
	 * @see #setBase_ObjectNode(ObjectNode)
	 * @see org.eclipse.papyrus.sysml14.activities.ActivitiesPackage#getNoBuffer_Base_ObjectNode()
	 * @model ordered="false"
	 * @generated
	 */
	ObjectNode getBase_ObjectNode();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.activities.NoBuffer#getBase_ObjectNode <em>Base Object Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Object Node</em>' reference.
	 * @see #getBase_ObjectNode()
	 * @generated
	 */
	void setBase_ObjectNode(ObjectNode value);

} // NoBuffer
