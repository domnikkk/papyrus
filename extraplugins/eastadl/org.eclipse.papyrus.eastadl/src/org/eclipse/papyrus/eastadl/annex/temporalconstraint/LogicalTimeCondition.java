/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Time Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#isIsLogicalTimeSuspended <em>Is Logical Time Suspended</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getEndPointReference <em>End Point Reference</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getStartPointReference <em>Start Point Reference</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getWidth <em>Width</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getLower <em>Lower</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getUpper <em>Upper</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getConsecutiveTimeCondition <em>Consecutive Time Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition()
 * @model
 * @generated
 */
public interface LogicalTimeCondition extends EAElement {
	/**
	 * Returns the value of the '<em><b>Is Logical Time Suspended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Logical Time Suspended</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Logical Time Suspended</em>' attribute.
	 * @see #setIsLogicalTimeSuspended(boolean)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_IsLogicalTimeSuspended()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLogicalTimeSuspended();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#isIsLogicalTimeSuspended <em>Is Logical Time Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Logical Time Suspended</em>' attribute.
	 * @see #isIsLogicalTimeSuspended()
	 * @generated
	 */
	void setIsLogicalTimeSuspended(boolean value);

	/**
	 * Returns the value of the '<em><b>End Point Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Point Reference</em>' reference.
	 * @see #setEndPointReference(TransitionEvent)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_EndPointReference()
	 * @model ordered="false"
	 * @generated
	 */
	TransitionEvent getEndPointReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getEndPointReference <em>End Point Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End Point Reference</em>' reference.
	 * @see #getEndPointReference()
	 * @generated
	 */
	void setEndPointReference(TransitionEvent value);

	/**
	 * Returns the value of the '<em><b>Start Point Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Point Reference</em>' reference.
	 * @see #setStartPointReference(TransitionEvent)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_StartPointReference()
	 * @model ordered="false"
	 * @generated
	 */
	TransitionEvent getStartPointReference();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getStartPointReference <em>Start Point Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Start Point Reference</em>' reference.
	 * @see #getStartPointReference()
	 * @generated
	 */
	void setStartPointReference(TransitionEvent value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' reference.
	 * @see #setWidth(EAValue)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_Width()
	 * @model ordered="false"
	 * @generated
	 */
	EAValue getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getWidth <em>Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(EAValue value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(EAValue)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_Lower()
	 * @model ordered="false"
	 * @generated
	 */
	EAValue getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(EAValue value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(EAValue)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_Upper()
	 * @model ordered="false"
	 * @generated
	 */
	EAValue getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(EAValue value);

	/**
	 * Returns the value of the '<em><b>Consecutive Time Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consecutive Time Condition</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Consecutive Time Condition</em>' reference.
	 * @see #setConsecutiveTimeCondition(LogicalTimeCondition)
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage#getLogicalTimeCondition_ConsecutiveTimeCondition()
	 * @model ordered="false"
	 * @generated
	 */
	LogicalTimeCondition getConsecutiveTimeCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getConsecutiveTimeCondition <em>Consecutive Time Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Consecutive Time Condition</em>' reference.
	 * @see #getConsecutiveTimeCondition()
	 * @generated
	 */
	void setConsecutiveTimeCondition(LogicalTimeCondition value);

} // LogicalTimeCondition
