/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly;
import org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePin <em>Visible Through Hardware Pin</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePort <em>Visible Through Hardware Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getAttribute <em>Attribute</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughAnomaly <em>Visible Through Anomaly</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding()
 * @model
 * @generated
 */
public interface BehaviorAttributeBinding extends Relationship {
	/**
	 * Returns the value of the '<em><b>Visible Through Function Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Through Function Port</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visible Through Function Port</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding_VisibleThroughFunctionPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FunctionPort> getVisibleThroughFunctionPort();

	/**
	 * Returns the value of the '<em><b>Visible Through Hardware Pin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Through Hardware Pin</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visible Through Hardware Pin</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding_VisibleThroughHardwarePin()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwarePin> getVisibleThroughHardwarePin();

	/**
	 * Returns the value of the '<em><b>Visible Through Hardware Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Through Hardware Port</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visible Through Hardware Port</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding_VisibleThroughHardwarePort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HardwarePort> getVisibleThroughHardwarePort();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Visible Through Anomaly</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Through Anomaly</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visible Through Anomaly</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage#getBehaviorAttributeBinding_VisibleThroughAnomaly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Anomaly> getVisibleThroughAnomaly();

} // BehaviorAttributeBinding
