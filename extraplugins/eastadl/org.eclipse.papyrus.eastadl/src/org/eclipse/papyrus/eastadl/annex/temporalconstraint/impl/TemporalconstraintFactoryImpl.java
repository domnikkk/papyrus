/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.State;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintFactory;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalconstraintFactoryImpl extends EFactoryImpl implements TemporalconstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalconstraintFactory init() {
		try {
			TemporalconstraintFactory theTemporalconstraintFactory = (TemporalconstraintFactory)EPackage.Registry.INSTANCE.getEFactory(TemporalconstraintPackage.eNS_URI);
			if (theTemporalconstraintFactory != null) {
				return theTemporalconstraintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemporalconstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalconstraintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TemporalconstraintPackage.TEMPORAL_CONSTRAINT: return createTemporalConstraint();
			case TemporalconstraintPackage.LOGICAL_TIME_CONDITION: return createLogicalTimeCondition();
			case TemporalconstraintPackage.TRANSITION: return createTransition();
			case TemporalconstraintPackage.STATE: return createState();
			case TemporalconstraintPackage.STATE_EVENT: return createStateEvent();
			case TemporalconstraintPackage.SYNCHRONOUSTRANSITION: return createSynchronoustransition();
			case TemporalconstraintPackage.TRANSITION_EVENT: return createTransitionEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalConstraint createTemporalConstraint() {
		TemporalConstraintImpl temporalConstraint = new TemporalConstraintImpl();
		return temporalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTimeCondition createLogicalTimeCondition() {
		LogicalTimeConditionImpl logicalTimeCondition = new LogicalTimeConditionImpl();
		return logicalTimeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent createStateEvent() {
		StateEventImpl stateEvent = new StateEventImpl();
		return stateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronoustransition createSynchronoustransition() {
		SynchronoustransitionImpl synchronoustransition = new SynchronoustransitionImpl();
		return synchronoustransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent createTransitionEvent() {
		TransitionEventImpl transitionEvent = new TransitionEventImpl();
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalconstraintPackage getTemporalconstraintPackage() {
		return (TemporalconstraintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemporalconstraintPackage getPackage() {
		return TemporalconstraintPackage.eINSTANCE;
	}

} //TemporalconstraintFactoryImpl
