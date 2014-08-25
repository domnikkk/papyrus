/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Prototype function Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype <em>Function Prototype</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_functionTargetInstanceRef()
 * @model
 * @generated
 */
public interface ErrorModelPrototype_functionTargetInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Function Prototype</em>' reference.
	 * @see #setFunctionPrototype(FunctionPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Function Prototype</em>' reference.
	 * @see #getFunctionPrototype()
	 * @generated
	 */
	void setFunctionPrototype(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Function Prototype context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype context</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Function Prototype context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype_context();

} // ErrorModelPrototype_functionTargetInstanceRef
