/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint#getBase_ExtensionPoint <em>Base Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtensionPoint()
 * @model
 * @generated
 */
public interface ExtensionPoint extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Base Extension Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Extension Point</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Extension Point</em>' reference.
	 * @see #setBase_ExtensionPoint(org.eclipse.uml2.uml.ExtensionPoint)
	 * @see org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage#getExtensionPoint_Base_ExtensionPoint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.ExtensionPoint getBase_ExtensionPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint#getBase_ExtensionPoint <em>Base Extension Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Extension Point</em>' reference.
	 * @see #getBase_ExtensionPoint()
	 * @generated
	 */
	void setBase_ExtensionPoint(org.eclipse.uml2.uml.ExtensionPoint value);

} // ExtensionPoint
