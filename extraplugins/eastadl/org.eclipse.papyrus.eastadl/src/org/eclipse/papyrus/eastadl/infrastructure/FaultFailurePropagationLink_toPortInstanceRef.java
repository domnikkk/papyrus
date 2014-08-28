/**
 */
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Propagation Link to Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getFaultFairelurePort <em>Fault Fairelure Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePropagationLink_toPortInstanceRef()
 * @model
 * @generated
 */
public interface FaultFailurePropagationLink_toPortInstanceRef extends InstanceRef {
	/**
	 * Returns the value of the '<em><b>Fault Fairelure Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Fairelure Port</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Fault Fairelure Port</em>' reference.
	 * @see #setFaultFairelurePort(FaultFailurePort)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePropagationLink_toPortInstanceRef_FaultFairelurePort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FaultFailurePort getFaultFairelurePort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getFaultFairelurePort <em>Fault Fairelure Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Fault Fairelure Port</em>' reference.
	 * @see #getFaultFairelurePort()
	 * @generated
	 */
	void setFaultFairelurePort(FaultFailurePort value);

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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#getFaultFailurePropagationLink_toPortInstanceRef_ErrorModelPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ErrorModelPrototype> getErrorModelPrototype();

} // FaultFailurePropagationLink_toPortInstanceRef
