/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionFlowPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Flow Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionFlowPort <em>Function Flow Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionFlowPortInstanceRef()
 * @model
 * @generated
 */
public interface EventFunctionFlowPortInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Flow Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Flow Port</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Function Flow Port</em>' reference.
	 * @see #setFunctionFlowPort(FunctionFlowPort)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionFlowPortInstanceRef_FunctionFlowPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionFlowPort getFunctionFlowPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionFlowPort <em>Function Flow Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Function Flow Port</em>' reference.
	 * @see #getFunctionFlowPort()
	 * @generated
	 */
	void setFunctionFlowPort(FunctionFlowPort value);

	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Function Prototype</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionFlowPortInstanceRef_FunctionPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

} // EventFunctionFlowPortInstanceRef
