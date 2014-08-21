/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#isIsExternVisible <em>Is Extern Visible</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getLogicalEvent()
 * @model
 * @generated
 */
public interface LogicalEvent extends Quantification {
	/**
	 * Returns the value of the '<em><b>Is Extern Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extern Visible</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Extern Visible</em>' attribute.
	 * @see #setIsExternVisible(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getLogicalEvent_IsExternVisible()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExternVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#isIsExternVisible <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Extern Visible</em>' attribute.
	 * @see #isIsExternVisible()
	 * @generated
	 */
	void setIsExternVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible Through Function Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Through Function Port</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visible Through Function Port</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getLogicalEvent_VisibleThroughFunctionPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPort> getVisibleThroughFunctionPort();

} // LogicalEvent
