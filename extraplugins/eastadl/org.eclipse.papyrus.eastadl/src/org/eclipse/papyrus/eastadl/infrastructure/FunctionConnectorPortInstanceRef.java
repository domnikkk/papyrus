/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Connector Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPort <em>Function Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFunctionConnectorPortInstanceRef()
 * @model
 * @generated
 */
public interface FunctionConnectorPortInstanceRef extends InstanceRef {
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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFunctionConnectorPortInstanceRef_FunctionPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionPort getFunctionPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPort <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Port</em>' reference.
	 * @see #getFunctionPort()
	 * @generated
	 */
	void setFunctionPort(FunctionPort value);

	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference.
	 * @see #setFunctionPrototype(FunctionPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFunctionConnectorPortInstanceRef_FunctionPrototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype</em>' reference.
	 * @see #getFunctionPrototype()
	 * @generated
	 */
	void setFunctionPrototype(FunctionPrototype value);

} // FunctionConnectorPortInstanceRef
