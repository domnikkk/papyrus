/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionConnector;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Internal Binding through Function Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionConnector <em>Function Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef()
 * @model
 * @generated
 */
public interface BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Connector</em>' reference.
	 * @see #setFunctionConnector(FunctionConnector)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionConnector getFunctionConnector();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionConnector <em>Function Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Connector</em>' reference.
	 * @see #getFunctionConnector()
	 * @generated
	 */
	void setFunctionConnector(FunctionConnector value);

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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

} // BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef
