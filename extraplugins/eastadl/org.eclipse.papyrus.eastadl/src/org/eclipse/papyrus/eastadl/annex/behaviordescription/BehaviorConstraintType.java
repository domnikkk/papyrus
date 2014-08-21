/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getSharedVariable <em>Shared Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getInterfaceVariable <em>Interface Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getPart <em>Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getAttributeQuantificationconstraint <em>Attribute Quantificationconstraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getTemporalConstraint <em>Temporal Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getComputationConstraint <em>Computation Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType()
 * @model
 * @generated
 */
public interface BehaviorConstraintType extends Context {
	/**
	 * Returns the value of the '<em><b>Shared Variable</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Variable</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Shared Variable</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_SharedVariable()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintInternalBinding> getSharedVariable();

	/**
	 * Returns the value of the '<em><b>Interface Variable</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Variable</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface Variable</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_InterfaceVariable()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintParameter> getInterfaceVariable();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_Part()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintPrototype> getPart();

	/**
	 * Returns the value of the '<em><b>Attribute Quantificationconstraint</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Quantificationconstraint</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attribute Quantificationconstraint</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_AttributeQuantificationconstraint()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributeQuantificationconstraint> getAttributeQuantificationconstraint();

	/**
	 * Returns the value of the '<em><b>Temporal Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Constraint</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Temporal Constraint</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_TemporalConstraint()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TemporalConstraint> getTemporalConstraint();

	/**
	 * Returns the value of the '<em><b>Computation Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computation Constraint</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Computation Constraint</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintType_ComputationConstraint()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComputationConstraint> getComputationConstraint();

} // BehaviorConstraintType
