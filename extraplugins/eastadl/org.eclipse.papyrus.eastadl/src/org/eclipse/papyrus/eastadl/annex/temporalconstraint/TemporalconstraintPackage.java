/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalconstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "temporalconstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Annex/TemporalConstraint/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TemporalConstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemporalconstraintPackage eINSTANCE = org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTemporalConstraint()
	 * @generated
	 */
	int TEMPORAL_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Transition Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__TRANSITION_EVENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__TIME_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__TRANSITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__STATE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__INIT_STATE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT__ASSERTION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Temporal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl <em>Logical Time Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getLogicalTimeCondition()
	 * @generated
	 */
	int LOGICAL_TIME_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Logical Time Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__END_POINT_REFERENCE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Point Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__START_POINT_REFERENCE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__WIDTH = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__LOWER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__UPPER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consecutive Time Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Logical Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Logical Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TIME_CONDITION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantification Guard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__QUANTIFICATION_GUARD = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIME_GUARD = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Error State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ERROR_STATE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Hazard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_HAZARD = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Init State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INIT_STATE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_MODE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hazard Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAZARD_DECLARATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mode Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__MODE_DECLARATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantification Invariant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__QUANTIFICATION_INVARIANT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Invariant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TIME_INVARIANT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateEventImpl <em>State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateEventImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getStateEvent()
	 * @generated
	 */
	int STATE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__END = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__START = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl <em>Synchronoustransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getSynchronoustransition()
	 * @generated
	 */
	int SYNCHRONOUSTRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__BASE_NAMED_ELEMENT = TRANSITION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__OWNED_COMMENT = TRANSITION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__FROM = TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__TO = TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Quantification Guard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__QUANTIFICATION_GUARD = TRANSITION__QUANTIFICATION_GUARD;

	/**
	 * The feature id for the '<em><b>Time Guard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__TIME_GUARD = TRANSITION__TIME_GUARD;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__EFFECT = TRANSITION__EFFECT;

	/**
	 * The feature id for the '<em><b>Read Transition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Write Transition Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronoustransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Synchronoustransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUSTRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Occurred Feature Flaw</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OCCURRED_FEATURE_FLAW = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurred Hazardous Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occurred Fault Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OCCURRED_FAULT_FAILURE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occurred Execution Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occurred Logical Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint
	 * @generated
	 */
	EClass getTemporalConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransitionEvent()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_TransitionEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTimeCondition()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_TimeCondition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getTransition()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_Transition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getState()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_State();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getInitState <em>Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init State</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getInitState()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_InitState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint#getAssertion()
	 * @see #getTemporalConstraint()
	 * @generated
	 */
	EReference getTemporalConstraint_Assertion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition <em>Logical Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Time Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition
	 * @generated
	 */
	EClass getLogicalTimeCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#isIsLogicalTimeSuspended <em>Is Logical Time Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logical Time Suspended</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#isIsLogicalTimeSuspended()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EAttribute getLogicalTimeCondition_IsLogicalTimeSuspended();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getEndPointReference <em>End Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Point Reference</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getEndPointReference()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_EndPointReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getStartPointReference <em>Start Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Point Reference</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getStartPointReference()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_StartPointReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Width</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getWidth()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_Width();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getLower()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_Lower();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getUpper()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_Upper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getConsecutiveTimeCondition <em>Consecutive Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consecutive Time Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition#getConsecutiveTimeCondition()
	 * @see #getLogicalTimeCondition()
	 * @generated
	 */
	EReference getLogicalTimeCondition_ConsecutiveTimeCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getQuantificationGuard <em>Quantification Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quantification Guard</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getQuantificationGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_QuantificationGuard();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTimeGuard <em>Time Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Guard</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getTimeGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TimeGuard();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsErrorState <em>Is Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Error State</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsErrorState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsErrorState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsHazard <em>Is Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hazard</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsHazard()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsHazard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsInitState <em>Is Init State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Init State</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsInitState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsMode <em>Is Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mode</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#isIsMode()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsMode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getHazardDeclaration <em>Hazard Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard Declaration</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getHazardDeclaration()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HazardDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getModeDeclaration <em>Mode Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode Declaration</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getModeDeclaration()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ModeDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getQuantificationInvariant <em>Quantification Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quantification Invariant</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getQuantificationInvariant()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_QuantificationInvariant();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getTimeInvariant <em>Time Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Invariant</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.State#getTimeInvariant()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TimeInvariant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent
	 * @generated
	 */
	EClass getStateEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getEnd()
	 * @see #getStateEvent()
	 * @generated
	 */
	EReference getStateEvent_End();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.StateEvent#getStart()
	 * @see #getStateEvent()
	 * @generated
	 */
	EReference getStateEvent_Start();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition <em>Synchronoustransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronoustransition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition
	 * @generated
	 */
	EClass getSynchronoustransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getReadTransitionEvent <em>Read Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Transition Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getReadTransitionEvent()
	 * @see #getSynchronoustransition()
	 * @generated
	 */
	EReference getSynchronoustransition_ReadTransitionEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getWriteTransitionEvent <em>Write Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write Transition Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.Synchronoustransition#getWriteTransitionEvent()
	 * @see #getSynchronoustransition()
	 * @generated
	 */
	EReference getSynchronoustransition_WriteTransitionEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFeatureFlaw <em>Occurred Feature Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurred Feature Flaw</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFeatureFlaw()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_OccurredFeatureFlaw();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredHazardousEvent <em>Occurred Hazardous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurred Hazardous Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredHazardousEvent()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_OccurredHazardousEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFaultFailure <em>Occurred Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurred Fault Failure</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredFaultFailure()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_OccurredFaultFailure();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredExecutionEvent <em>Occurred Execution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurred Execution Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredExecutionEvent()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_OccurredExecutionEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredLogicalEvent <em>Occurred Logical Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occurred Logical Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.TransitionEvent#getOccurredLogicalEvent()
	 * @see #getTransitionEvent()
	 * @generated
	 */
	EReference getTransitionEvent_OccurredLogicalEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemporalconstraintFactory getTemporalconstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl <em>Temporal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTemporalConstraint()
		 * @generated
		 */
		EClass TEMPORAL_CONSTRAINT = eINSTANCE.getTemporalConstraint();

		/**
		 * The meta object literal for the '<em><b>Transition Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__TRANSITION_EVENT = eINSTANCE.getTemporalConstraint_TransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Time Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__TIME_CONDITION = eINSTANCE.getTemporalConstraint_TimeCondition();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__TRANSITION = eINSTANCE.getTemporalConstraint_Transition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__STATE = eINSTANCE.getTemporalConstraint_State();

		/**
		 * The meta object literal for the '<em><b>Init State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__INIT_STATE = eINSTANCE.getTemporalConstraint_InitState();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONSTRAINT__ASSERTION = eINSTANCE.getTemporalConstraint_Assertion();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl <em>Logical Time Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.LogicalTimeConditionImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getLogicalTimeCondition()
		 * @generated
		 */
		EClass LOGICAL_TIME_CONDITION = eINSTANCE.getLogicalTimeCondition();

		/**
		 * The meta object literal for the '<em><b>Is Logical Time Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_TIME_CONDITION__IS_LOGICAL_TIME_SUSPENDED = eINSTANCE.getLogicalTimeCondition_IsLogicalTimeSuspended();

		/**
		 * The meta object literal for the '<em><b>End Point Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__END_POINT_REFERENCE = eINSTANCE.getLogicalTimeCondition_EndPointReference();

		/**
		 * The meta object literal for the '<em><b>Start Point Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__START_POINT_REFERENCE = eINSTANCE.getLogicalTimeCondition_StartPointReference();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__WIDTH = eINSTANCE.getLogicalTimeCondition_Width();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__LOWER = eINSTANCE.getLogicalTimeCondition_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__UPPER = eINSTANCE.getLogicalTimeCondition_Upper();

		/**
		 * The meta object literal for the '<em><b>Consecutive Time Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TIME_CONDITION__CONSECUTIVE_TIME_CONDITION = eINSTANCE.getLogicalTimeCondition_ConsecutiveTimeCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Quantification Guard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__QUANTIFICATION_GUARD = eINSTANCE.getTransition_QuantificationGuard();

		/**
		 * The meta object literal for the '<em><b>Time Guard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TIME_GUARD = eINSTANCE.getTransition_TimeGuard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Is Error State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_ERROR_STATE = eINSTANCE.getState_IsErrorState();

		/**
		 * The meta object literal for the '<em><b>Is Hazard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_HAZARD = eINSTANCE.getState_IsHazard();

		/**
		 * The meta object literal for the '<em><b>Is Init State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INIT_STATE = eINSTANCE.getState_IsInitState();

		/**
		 * The meta object literal for the '<em><b>Is Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_MODE = eINSTANCE.getState_IsMode();

		/**
		 * The meta object literal for the '<em><b>Hazard Declaration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAZARD_DECLARATION = eINSTANCE.getState_HazardDeclaration();

		/**
		 * The meta object literal for the '<em><b>Mode Declaration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__MODE_DECLARATION = eINSTANCE.getState_ModeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Quantification Invariant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__QUANTIFICATION_INVARIANT = eINSTANCE.getState_QuantificationInvariant();

		/**
		 * The meta object literal for the '<em><b>Time Invariant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TIME_INVARIANT = eINSTANCE.getState_TimeInvariant();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateEventImpl <em>State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.StateEventImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getStateEvent()
		 * @generated
		 */
		EClass STATE_EVENT = eINSTANCE.getStateEvent();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_EVENT__END = eINSTANCE.getStateEvent_End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_EVENT__START = eINSTANCE.getStateEvent_Start();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl <em>Synchronoustransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.SynchronoustransitionImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getSynchronoustransition()
		 * @generated
		 */
		EClass SYNCHRONOUSTRANSITION = eINSTANCE.getSynchronoustransition();

		/**
		 * The meta object literal for the '<em><b>Read Transition Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUSTRANSITION__READ_TRANSITION_EVENT = eINSTANCE.getSynchronoustransition_ReadTransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Write Transition Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUSTRANSITION__WRITE_TRANSITION_EVENT = eINSTANCE.getSynchronoustransition_WriteTransitionEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TransitionEventImpl
		 * @see org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Occurred Feature Flaw</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__OCCURRED_FEATURE_FLAW = eINSTANCE.getTransitionEvent_OccurredFeatureFlaw();

		/**
		 * The meta object literal for the '<em><b>Occurred Hazardous Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT = eINSTANCE.getTransitionEvent_OccurredHazardousEvent();

		/**
		 * The meta object literal for the '<em><b>Occurred Fault Failure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__OCCURRED_FAULT_FAILURE = eINSTANCE.getTransitionEvent_OccurredFaultFailure();

		/**
		 * The meta object literal for the '<em><b>Occurred Execution Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT = eINSTANCE.getTransitionEvent_OccurredExecutionEvent();

		/**
		 * The meta object literal for the '<em><b>Occurred Logical Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT = eINSTANCE.getTransitionEvent_OccurredLogicalEvent();

	}

} //TemporalconstraintPackage
