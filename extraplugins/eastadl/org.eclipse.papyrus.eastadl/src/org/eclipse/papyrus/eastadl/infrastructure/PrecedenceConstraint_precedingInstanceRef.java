/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Constraint preceding Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getPrecedenceConstraint_precedingInstanceRef()
 * @model
 * @generated
 */
public interface PrecedenceConstraint_precedingInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype target</em>' reference.
	 * @see #setFunctionPrototype_target(FunctionPrototype)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype_target();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype target</em>' reference.
	 * @see #getFunctionPrototype_target()
	 * @generated
	 */
	void setFunctionPrototype_target(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Function Prototype context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype context</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_context()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype_context();

} // PrecedenceConstraint_precedingInstanceRef
