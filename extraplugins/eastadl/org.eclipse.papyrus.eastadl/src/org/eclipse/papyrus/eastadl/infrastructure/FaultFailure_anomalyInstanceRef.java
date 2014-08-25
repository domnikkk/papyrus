/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure anomaly Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getAnomaly <em>Anomaly</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailure_anomalyInstanceRef()
 * @model
 * @generated
 */
public interface FaultFailure_anomalyInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Anomaly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anomaly</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Anomaly</em>' reference.
	 * @see #setAnomaly(Anomaly)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailure_anomalyInstanceRef_Anomaly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Anomaly getAnomaly();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getAnomaly <em>Anomaly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Anomaly</em>' reference.
	 * @see #getAnomaly()
	 * @generated
	 */
	void setAnomaly(Anomaly value);

	/**
	 * Returns the value of the '<em><b>Error Model Prototype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Prototype</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Error Model Prototype</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailure_anomalyInstanceRef_ErrorModelPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorModelPrototype> getErrorModelPrototype();

} // FaultFailure_anomalyInstanceRef
