/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Message Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getBase_Interface <em>Base Interface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getRtMsgKind <em>Rt Msg Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTMessageSet()
 * @model
 * @generated
 */
public interface RTMessageSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interface</em>' reference.
	 * @see #setBase_Interface(Interface)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTMessageSet_Base_Interface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getBase_Interface();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getBase_Interface <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interface</em>' reference.
	 * @see #getBase_Interface()
	 * @generated
	 */
	void setBase_Interface(Interface value);

	/**
	 * Returns the value of the '<em><b>Rt Msg Kind</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rt Msg Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rt Msg Kind</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind
	 * @see #setRtMsgKind(RTMessageKind)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTMessageSet_RtMsgKind()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	RTMessageKind getRtMsgKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getRtMsgKind <em>Rt Msg Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt Msg Kind</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind
	 * @see #getRtMsgKind()
	 * @generated
	 */
	void setRtMsgKind(RTMessageKind value);

} // RTMessageSet
