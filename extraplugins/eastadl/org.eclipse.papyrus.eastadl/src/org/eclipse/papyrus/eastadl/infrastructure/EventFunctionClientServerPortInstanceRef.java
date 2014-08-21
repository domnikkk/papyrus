/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionClientServerPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Client Server Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionClientServerPort <em>Function Client Server Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionClientServerPortInstanceRef()
 * @model
 * @generated
 */
public interface EventFunctionClientServerPortInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Client Server Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Client Server Port</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Client Server Port</em>' reference.
	 * @see #setFunctionClientServerPort(FunctionClientServerPort)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionClientServerPortInstanceRef_FunctionClientServerPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionClientServerPort getFunctionClientServerPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionClientServerPort <em>Function Client Server Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Function Client Server Port</em>' reference.
	 * @see #getFunctionClientServerPort()
	 * @generated
	 */
	void setFunctionClientServerPort(FunctionClientServerPort value);

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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getEventFunctionClientServerPortInstanceRef_FunctionPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

} // EventFunctionClientServerPortInstanceRef
