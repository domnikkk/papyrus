/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.MessageSet#getBase_Interface <em>Base Interface</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.MessageSet#isIncoming <em>Is Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getMessageSet()
 * @model
 * @generated
 */
public interface MessageSet extends EObject {
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
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getMessageSet_Base_Interface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getBase_Interface();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.MessageSet#getBase_Interface <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interface</em>' reference.
	 * @see #getBase_Interface()
	 * @generated
	 */
	void setBase_Interface(Interface value);

	/**
	 * Returns the value of the '<em><b>Is Incoming</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Incoming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Incoming</em>' attribute.
	 * @see #setIsIncoming(boolean)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getMessageSet_IsIncoming()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIncoming();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.MessageSet#isIncoming <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Incoming</em>' attribute.
	 * @see #isIncoming()
	 * @generated
	 */
	void setIsIncoming(boolean value);

} // MessageSet
