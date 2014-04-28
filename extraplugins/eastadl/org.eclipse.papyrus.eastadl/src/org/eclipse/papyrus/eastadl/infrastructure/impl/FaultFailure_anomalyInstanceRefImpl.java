/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure anomaly Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl#getAnomaly <em>Anomaly</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailure_anomalyInstanceRefImpl extends InstanceRefImpl implements FaultFailure_anomalyInstanceRef {
	/**
	 * The cached value of the '{@link #getAnomaly() <em>Anomaly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnomaly()
	 * @generated
	 * @ordered
	 */
	protected Anomaly anomaly;

	/**
	 * The cached value of the '{@link #getErrorModelPrototype() <em>Error Model Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype> errorModelPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailure_anomalyInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.FAULT_FAILURE_ANOMALY_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anomaly getAnomaly() {
		if (anomaly != null && anomaly.eIsProxy()) {
			InternalEObject oldAnomaly = (InternalEObject)anomaly;
			anomaly = (Anomaly)eResolveProxy(oldAnomaly);
			if (anomaly != oldAnomaly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY, oldAnomaly, anomaly));
			}
		}
		return anomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anomaly basicGetAnomaly() {
		return anomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnomaly(Anomaly newAnomaly) {
		Anomaly oldAnomaly = anomaly;
		anomaly = newAnomaly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY, oldAnomaly, anomaly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype> getErrorModelPrototype() {
		if (errorModelPrototype == null) {
			errorModelPrototype = new EObjectResolvingEList<ErrorModelPrototype>(ErrorModelPrototype.class, this, InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE);
		}
		return errorModelPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY:
				if (resolve) return getAnomaly();
				return basicGetAnomaly();
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				return getErrorModelPrototype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY:
				setAnomaly((Anomaly)newValue);
				return;
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
				getErrorModelPrototype().addAll((Collection<? extends ErrorModelPrototype>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY:
				setAnomaly((Anomaly)null);
				return;
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY:
				return anomaly != null;
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				return errorModelPrototype != null && !errorModelPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultFailure_anomalyInstanceRefImpl
