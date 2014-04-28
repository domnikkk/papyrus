/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port function Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPort <em>Function Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_functionTargetInstanceRef()
 * @model
 * @generated
 */
public interface FaultFailurePort_functionTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Port</em>' reference.
	 * @see #setFunctionPort(FunctionPort)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_functionTargetInstanceRef_FunctionPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionPort getFunctionPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPort <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Port</em>' reference.
	 * @see #getFunctionPort()
	 * @generated
	 */
	void setFunctionPort(FunctionPort value);

	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePort_functionTargetInstanceRef_FunctionPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

} // FaultFailurePort_functionTargetInstanceRef
