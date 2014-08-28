/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.behavior.Mode;
import org.eclipse.papyrus.eastadl.dependability.Hazard;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsErrorState <em>Is Error State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsHazard <em>Is Hazard</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsInitState <em>Is Init State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsMode <em>Is Mode</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getHazardDeclaration <em>Hazard Declaration</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getModeDeclaration <em>Mode Declaration</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getQuantificationInvariant <em>Quantification Invariant</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getTimeInvariant <em>Time Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState()
 * @model
 * @generated
 */
public interface State extends EAElement {
	/**
	 * Returns the value of the '<em><b>Is Error State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Error State</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Error State</em>' attribute.
	 * @see #setIsErrorState(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_IsErrorState()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsErrorState();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsErrorState <em>Is Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Error State</em>' attribute.
	 * @see #isIsErrorState()
	 * @generated
	 */
	void setIsErrorState(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Hazard</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hazard</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Hazard</em>' attribute.
	 * @see #setIsHazard(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_IsHazard()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsHazard();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsHazard <em>Is Hazard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Hazard</em>' attribute.
	 * @see #isIsHazard()
	 * @generated
	 */
	void setIsHazard(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Init State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Init State</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Init State</em>' attribute.
	 * @see #setIsInitState(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_IsInitState()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsInitState();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsInitState <em>Is Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Init State</em>' attribute.
	 * @see #isIsInitState()
	 * @generated
	 */
	void setIsInitState(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mode</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Mode</em>' attribute.
	 * @see #setIsMode(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_IsMode()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMode();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsMode <em>Is Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Mode</em>' attribute.
	 * @see #isIsMode()
	 * @generated
	 */
	void setIsMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Hazard Declaration</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Declaration</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hazard Declaration</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_HazardDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hazard> getHazardDeclaration();

	/**
	 * Returns the value of the '<em><b>Mode Declaration</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Declaration</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Mode Declaration</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_ModeDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mode> getModeDeclaration();

	/**
	 * Returns the value of the '<em><b>Quantification Invariant</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantification Invariant</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Quantification Invariant</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_QuantificationInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantification> getQuantificationInvariant();

	/**
	 * Returns the value of the '<em><b>Time Invariant</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Invariant</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Time Invariant</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getState_TimeInvariant()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LogicalTimeCondition> getTimeInvariant();

} // State
