/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#isIsExternVisible <em>Is Extern Visible</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EAElement, BehaviorConstraintParameter {
	/**
	 * Returns the value of the '<em><b>Is Extern Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extern Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extern Visible</em>' attribute.
	 * @see #setIsExternVisible(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getAttribute_IsExternVisible()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExternVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#isIsExternVisible <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extern Visible</em>' attribute.
	 * @see #isIsExternVisible()
	 * @generated
	 */
	void setIsExternVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getAttribute_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // Attribute
