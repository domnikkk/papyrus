/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.eastadl.environment.ClampConnector;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Constraint Internal Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughClampConnector <em>Binding Through Clamp Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughFunctionConnector <em>Binding Through Function Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughHardwareConnector <em>Binding Through Hardware Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintInternalBinding()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorConstraintInternalBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Through Clamp Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.environment.ClampConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Through Clamp Connector</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binding Through Clamp Connector</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintInternalBinding_BindingThroughClampConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClampConnector> getBindingThroughClampConnector();

	/**
	 * Returns the value of the '<em><b>Binding Through Function Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Through Function Connector</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binding Through Function Connector</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintInternalBinding_BindingThroughFunctionConnector()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef> getBindingThroughFunctionConnector();

	/**
	 * Returns the value of the '<em><b>Binding Through Hardware Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Through Hardware Connector</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Binding Through Hardware Connector</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage#getBehaviorConstraintInternalBinding_BindingThroughHardwareConnector()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef> getBindingThroughHardwareConnector();

} // BehaviorConstraintInternalBinding
