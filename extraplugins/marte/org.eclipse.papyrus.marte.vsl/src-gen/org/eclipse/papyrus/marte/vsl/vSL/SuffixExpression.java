/**
 */
package org.eclipse.papyrus.marte.vsl.vSL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suffix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.marte.vsl.vSL.SuffixExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.marte.vsl.vSL.VSLPackage#getSuffixExpression()
 * @model
 * @generated
 */
public interface SuffixExpression extends EObject
{
	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(SuffixExpression)
	 * @see org.eclipse.papyrus.marte.vsl.vSL.VSLPackage#getSuffixExpression_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	SuffixExpression getSuffix();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.marte.vsl.vSL.SuffixExpression#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(SuffixExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.marte.vsl.extensions.VSLContextUtil.getFilteredParentRule(this, filter) ;'"
	 * @generated
	 */
	EObject getFilteredParentRule(EClass filter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.marte.vsl.extensions.VSLContextUtil.getExpectedType(this) ;'"
	 * @generated
	 */
	Type getExpectedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return org.eclipse.papyrus.marte.vsl.extensions.VSLContextUtil.getContextElement(this) ;'"
	 * @generated
	 */
	Element getContextElement();

} // SuffixExpression
