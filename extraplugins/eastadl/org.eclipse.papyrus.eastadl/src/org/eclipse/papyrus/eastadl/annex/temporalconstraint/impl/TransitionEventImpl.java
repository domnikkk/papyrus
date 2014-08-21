/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;
import org.eclipse.papyrus.eastadl.dependability.FeatureFlaw;
import org.eclipse.papyrus.eastadl.dependability.HazardousEvent;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.timing.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl#getOccurredFeatureFlaw <em>Occurred Feature Flaw</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl#getOccurredHazardousEvent <em>Occurred Hazardous Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl#getOccurredFaultFailure <em>Occurred Fault Failure</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl#getOccurredExecutionEvent <em>Occurred Execution Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl#getOccurredLogicalEvent <em>Occurred Logical Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionEventImpl extends EAElementImpl implements TransitionEvent {
	/**
	 * The cached value of the '{@link #getOccurredFeatureFlaw() <em>Occurred Feature Flaw</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOccurredFeatureFlaw()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureFlaw> occurredFeatureFlaw;

	/**
	 * The cached value of the '{@link #getOccurredHazardousEvent() <em>Occurred Hazardous Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOccurredHazardousEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardousEvent> occurredHazardousEvent;

	/**
	 * The cached value of the '{@link #getOccurredFaultFailure() <em>Occurred Fault Failure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOccurredFaultFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailure> occurredFaultFailure;

	/**
	 * The cached value of the '{@link #getOccurredExecutionEvent() <em>Occurred Execution Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOccurredExecutionEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> occurredExecutionEvent;

	/**
	 * The cached value of the '{@link #getOccurredLogicalEvent() <em>Occurred Logical Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOccurredLogicalEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalEvent> occurredLogicalEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransitionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalconstraintPackage.Literals.TRANSITION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<FeatureFlaw> getOccurredFeatureFlaw() {
		if (occurredFeatureFlaw == null) {
			occurredFeatureFlaw = new EObjectResolvingEList<FeatureFlaw>(FeatureFlaw.class, this, TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW);
		}
		return occurredFeatureFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HazardousEvent> getOccurredHazardousEvent() {
		if (occurredHazardousEvent == null) {
			occurredHazardousEvent = new EObjectResolvingEList<HazardousEvent>(HazardousEvent.class, this, TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT);
		}
		return occurredHazardousEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<FaultFailure> getOccurredFaultFailure() {
		if (occurredFaultFailure == null) {
			occurredFaultFailure = new EObjectResolvingEList<FaultFailure>(FaultFailure.class, this, TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE);
		}
		return occurredFaultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Event> getOccurredExecutionEvent() {
		if (occurredExecutionEvent == null) {
			occurredExecutionEvent = new EObjectResolvingEList<Event>(Event.class, this, TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT);
		}
		return occurredExecutionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalEvent> getOccurredLogicalEvent() {
		if (occurredLogicalEvent == null) {
			occurredLogicalEvent = new EObjectResolvingEList<LogicalEvent>(LogicalEvent.class, this, TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT);
		}
		return occurredLogicalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW:
			return getOccurredFeatureFlaw();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT:
			return getOccurredHazardousEvent();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE:
			return getOccurredFaultFailure();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT:
			return getOccurredExecutionEvent();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT:
			return getOccurredLogicalEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW:
			getOccurredFeatureFlaw().clear();
			getOccurredFeatureFlaw().addAll((Collection<? extends FeatureFlaw>) newValue);
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT:
			getOccurredHazardousEvent().clear();
			getOccurredHazardousEvent().addAll((Collection<? extends HazardousEvent>) newValue);
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE:
			getOccurredFaultFailure().clear();
			getOccurredFaultFailure().addAll((Collection<? extends FaultFailure>) newValue);
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT:
			getOccurredExecutionEvent().clear();
			getOccurredExecutionEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT:
			getOccurredLogicalEvent().clear();
			getOccurredLogicalEvent().addAll((Collection<? extends LogicalEvent>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW:
			getOccurredFeatureFlaw().clear();
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT:
			getOccurredHazardousEvent().clear();
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE:
			getOccurredFaultFailure().clear();
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT:
			getOccurredExecutionEvent().clear();
			return;
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT:
			getOccurredLogicalEvent().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW:
			return occurredFeatureFlaw != null && !occurredFeatureFlaw.isEmpty();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT:
			return occurredHazardousEvent != null && !occurredHazardousEvent.isEmpty();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE:
			return occurredFaultFailure != null && !occurredFaultFailure.isEmpty();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT:
			return occurredExecutionEvent != null && !occurredExecutionEvent.isEmpty();
		case TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT:
			return occurredLogicalEvent != null && !occurredLogicalEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TransitionEventImpl
