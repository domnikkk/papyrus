/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.State;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingDescription;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage
 * @generated
 */
public class TemporalconstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static TemporalconstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TemporalconstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TemporalconstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TemporalconstraintSwitch<Adapter> modelSwitch =
			new TemporalconstraintSwitch<Adapter>() {
				@Override
				public Adapter caseTemporalConstraint(TemporalConstraint object) {
					return createTemporalConstraintAdapter();
				}

				@Override
				public Adapter caseLogicalTimeCondition(LogicalTimeCondition object) {
					return createLogicalTimeConditionAdapter();
				}

				@Override
				public Adapter caseTransition(Transition object) {
					return createTransitionAdapter();
				}

				@Override
				public Adapter caseState(State object) {
					return createStateAdapter();
				}

				@Override
				public Adapter caseStateEvent(StateEvent object) {
					return createStateEventAdapter();
				}

				@Override
				public Adapter caseSynchronoustransition(Synchronoustransition object) {
					return createSynchronoustransitionAdapter();
				}

				@Override
				public Adapter caseTransitionEvent(TransitionEvent object) {
					return createTransitionEventAdapter();
				}

				@Override
				public Adapter caseEAElement(EAElement object) {
					return createEAElementAdapter();
				}

				@Override
				public Adapter caseTimingDescription(TimingDescription object) {
					return createTimingDescriptionAdapter();
				}

				@Override
				public Adapter caseEvent(Event object) {
					return createEventAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintParameter(BehaviorConstraintParameter object) {
					return createBehaviorConstraintParameterAdapter();
				}

				@Override
				public Adapter defaultCase(EObject object) {
					return createEObjectAdapter();
				}
			};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint
	 * @generated
	 */
	public Adapter createTemporalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition <em>Logical Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition
	 * @generated
	 */
	public Adapter createLogicalTimeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent
	 * @generated
	 */
	public Adapter createStateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition <em>Synchronoustransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition
	 * @generated
	 */
	public Adapter createSynchronoustransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent
	 * @generated
	 */
	public Adapter createTransitionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.timing.TimingDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingDescription
	 * @generated
	 */
	public Adapter createTimingDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.timing.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.timing.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter <em>Behavior Constraint Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter
	 * @generated
	 */
	public Adapter createBehaviorConstraintParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // TemporalconstraintAdapterFactory
