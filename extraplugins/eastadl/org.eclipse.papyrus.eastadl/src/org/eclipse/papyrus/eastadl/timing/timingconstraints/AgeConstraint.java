/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.papyrus.eastadl.timing.EventChain;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Different tolerances on over-/undersampling can be identified when the solution has been modeled.
 * 
 * An age constraint is of interest in control engineering when looking back through the system.
 * 
 * In case of over- or undersampling, there is no one-to-one relation possible between the occurrences of stimuli and responses of the associated event chain. Thus, the age constraint defines the semantic of which delay must be constrained.
 * 
 * The attribute upper is applicable in worst-case analysis.
 * 
 * The attribute lower is applicable in best-case analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getAgeConstraint()
 * @model
 * @generated
 */
public interface AgeConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' reference.
	 * @see #setMaximum(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getAgeConstraint_Maximum()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMaximum <em>Maximum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' reference.
	 * @see #setMinimum(TimingExpression)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getAgeConstraint_Minimum()
	 * @model ordered="false"
	 * @generated
	 */
	TimingExpression getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMinimum <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimingExpression value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EventChain)
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getAgeConstraint_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventChain getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EventChain value);

} // AgeConstraint
