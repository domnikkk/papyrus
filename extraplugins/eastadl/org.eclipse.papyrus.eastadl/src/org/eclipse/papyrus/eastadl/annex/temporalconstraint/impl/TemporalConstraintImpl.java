/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.State;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getTransitionEvent <em>Transition Event</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getTimeCondition <em>Time Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getTransition <em>Transition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getState <em>State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getInitState <em>Init State</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalConstraintImpl extends EAElementImpl implements TemporalConstraint {
	/**
	 * The cached value of the '{@link #getTransitionEvent() <em>Transition Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionEvent> transitionEvent;

	/**
	 * The cached value of the '{@link #getTimeCondition() <em>Time Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTimeCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTimeCondition> timeCondition;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getInitState() <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected State initState;

	/**
	 * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAssertion()
	 * @generated
	 * @ordered
	 */
	protected EAExpression assertion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TemporalConstraintImpl() {
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
		return TemporalconstraintPackage.Literals.TEMPORAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TransitionEvent> getTransitionEvent() {
		if (transitionEvent == null) {
			transitionEvent = new EObjectResolvingEList<TransitionEvent>(TransitionEvent.class, this, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION_EVENT);
		}
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<LogicalTimeCondition> getTimeCondition() {
		if (timeCondition == null) {
			timeCondition = new EObjectResolvingEList<LogicalTimeCondition>(LogicalTimeCondition.class, this, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TIME_CONDITION);
		}
		return timeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectResolvingEList<Transition>(Transition.class, this, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectResolvingEList<State>(State.class, this, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public State getInitState() {
		if (initState != null && initState.eIsProxy()) {
			InternalEObject oldInitState = (InternalEObject) initState;
			initState = (State) eResolveProxy(oldInitState);
			if (initState != oldInitState) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE, oldInitState, initState));
				}
			}
		}
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public State basicGetInitState() {
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setInitState(State newInitState) {
		State oldInitState = initState;
		initState = newInitState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE, oldInitState, initState));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAExpression getAssertion() {
		if (assertion != null && assertion.eIsProxy()) {
			InternalEObject oldAssertion = (InternalEObject) assertion;
			assertion = (EAExpression) eResolveProxy(oldAssertion);
			if (assertion != oldAssertion) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION, oldAssertion, assertion));
				}
			}
		}
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAExpression basicGetAssertion() {
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAssertion(EAExpression newAssertion) {
		EAExpression oldAssertion = assertion;
		assertion = newAssertion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION, oldAssertion, assertion));
		}
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
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION_EVENT:
			return getTransitionEvent();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TIME_CONDITION:
			return getTimeCondition();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION:
			return getTransition();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__STATE:
			return getState();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE:
			if (resolve) {
				return getInitState();
			}
			return basicGetInitState();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION:
			if (resolve) {
				return getAssertion();
			}
			return basicGetAssertion();
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
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION_EVENT:
			getTransitionEvent().clear();
			getTransitionEvent().addAll((Collection<? extends TransitionEvent>) newValue);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TIME_CONDITION:
			getTimeCondition().clear();
			getTimeCondition().addAll((Collection<? extends LogicalTimeCondition>) newValue);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__STATE:
			getState().clear();
			getState().addAll((Collection<? extends State>) newValue);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE:
			setInitState((State) newValue);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION:
			setAssertion((EAExpression) newValue);
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
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION_EVENT:
			getTransitionEvent().clear();
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TIME_CONDITION:
			getTimeCondition().clear();
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION:
			getTransition().clear();
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__STATE:
			getState().clear();
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE:
			setInitState((State) null);
			return;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION:
			setAssertion((EAExpression) null);
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
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION_EVENT:
			return transitionEvent != null && !transitionEvent.isEmpty();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TIME_CONDITION:
			return timeCondition != null && !timeCondition.isEmpty();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__TRANSITION:
			return transition != null && !transition.isEmpty();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__STATE:
			return state != null && !state.isEmpty();
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__INIT_STATE:
			return initState != null;
		case TemporalconstraintPackage.TEMPORAL_CONSTRAINT__ASSERTION:
			return assertion != null;
		}
		return super.eIsSet(featureID);
	}

} // TemporalConstraintImpl
