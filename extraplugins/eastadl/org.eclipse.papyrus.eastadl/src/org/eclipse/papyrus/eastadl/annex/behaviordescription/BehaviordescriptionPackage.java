/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;

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
 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviordescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviordescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Annex/BehaviorDescription/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BehaviorDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviordescriptionPackage eINSTANCE = org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingAttributeImpl <em>Behavior Constraint Binding Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingAttributeImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintBindingAttribute()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__BASE_NAMED_ELEMENT = AttributequantificationconstraintPackage.ATTRIBUTE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__NAME = AttributequantificationconstraintPackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__OWNED_COMMENT = AttributequantificationconstraintPackage.ATTRIBUTE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Extern Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__IS_EXTERN_VISIBLE = AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__TYPE = AttributequantificationconstraintPackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Binding Through Clamp Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__BINDING_THROUGH_CLAMP_CONNECTOR = AttributequantificationconstraintPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Through Function Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__BINDING_THROUGH_FUNCTION_CONNECTOR = AttributequantificationconstraintPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Through Hardware Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE__BINDING_THROUGH_HARDWARE_CONNECTOR = AttributequantificationconstraintPackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE_FEATURE_COUNT = AttributequantificationconstraintPackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavior Constraint Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE_OPERATION_COUNT = AttributequantificationconstraintPackage.ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintParameterImpl <em>Behavior Constraint Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintParameterImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintParameter()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behavior Constraint Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl <em>Behavior Constraint Internal Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintInternalBinding()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Binding Through Clamp Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Binding Through Function Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Binding Through Hardware Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Internal Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behavior Constraint Internal Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingEventImpl <em>Behavior Constraint Binding Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingEventImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintBindingEvent()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__BASE_NAMED_ELEMENT = TemporalconstraintPackage.TRANSITION_EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__NAME = TemporalconstraintPackage.TRANSITION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OWNED_COMMENT = TemporalconstraintPackage.TRANSITION_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Occurred Feature Flaw</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OCCURRED_FEATURE_FLAW = TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FEATURE_FLAW;

	/**
	 * The feature id for the '<em><b>Occurred Hazardous Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OCCURRED_HAZARDOUS_EVENT = TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_HAZARDOUS_EVENT;

	/**
	 * The feature id for the '<em><b>Occurred Fault Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OCCURRED_FAULT_FAILURE = TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_FAULT_FAILURE;

	/**
	 * The feature id for the '<em><b>Occurred Execution Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OCCURRED_EXECUTION_EVENT = TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_EXECUTION_EVENT;

	/**
	 * The feature id for the '<em><b>Occurred Logical Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__OCCURRED_LOGICAL_EVENT = TemporalconstraintPackage.TRANSITION_EVENT__OCCURRED_LOGICAL_EVENT;

	/**
	 * The feature id for the '<em><b>Binding Through Clamp Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__BINDING_THROUGH_CLAMP_CONNECTOR = TemporalconstraintPackage.TRANSITION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Through Function Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__BINDING_THROUGH_FUNCTION_CONNECTOR = TemporalconstraintPackage.TRANSITION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding Through Hardware Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT__BINDING_THROUGH_HARDWARE_CONNECTOR = TemporalconstraintPackage.TRANSITION_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Binding Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT_FEATURE_COUNT = TemporalconstraintPackage.TRANSITION_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavior Constraint Binding Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_BINDING_EVENT_OPERATION_COUNT = TemporalconstraintPackage.TRANSITION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl <em>Behavior Constraint Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintPrototype()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__BASE_NAMED_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__NOTE = ElementsPackage.TRACEABLE_SPECIFICATION__NOTE;

	/**
	 * The feature id for the '<em><b>Instantiation Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Vehicle Feature Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hardware Component Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Model Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Behavior Constraint Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl <em>Behavior Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintType()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__BASE_NAMED_ELEMENT = ElementsPackage.CONTEXT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.CONTEXT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Shared Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__PART = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Quantificationconstraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Temporal Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Computation Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Behavior Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TYPE_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl <em>Behavior Constraint Target Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__BASE_NAMED_ELEMENT = ElementsPackage.RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__NAME = ElementsPackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__OWNED_COMMENT = ElementsPackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Behavior Constraint Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targeted Vehicle Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targeted Function Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constrained Error Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Targeted Hardware Component Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constrained Function Triggering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constrained Mode Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Constrained Function Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Target Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING_FEATURE_COUNT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Behavior Constraint Target Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_TARGET_BINDING_OPERATION_COUNT = ElementsPackage.RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingAttribute <em>Behavior Constraint Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Binding Attribute</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingAttribute
	 * @generated
	 */
	EClass getBehaviorConstraintBindingAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter <em>Behavior Constraint Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Parameter</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter
	 * @generated
	 */
	EClass getBehaviorConstraintParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding <em>Behavior Constraint Internal Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Internal Binding</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding
	 * @generated
	 */
	EClass getBehaviorConstraintInternalBinding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughClampConnector <em>Binding Through Clamp Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding Through Clamp Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughClampConnector()
	 * @see #getBehaviorConstraintInternalBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_BindingThroughClampConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughFunctionConnector <em>Binding Through Function Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Through Function Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughFunctionConnector()
	 * @see #getBehaviorConstraintInternalBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_BindingThroughFunctionConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughHardwareConnector <em>Binding Through Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Through Hardware Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding#getBindingThroughHardwareConnector()
	 * @see #getBehaviorConstraintInternalBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_BindingThroughHardwareConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingEvent <em>Behavior Constraint Binding Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Binding Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingEvent
	 * @generated
	 */
	EClass getBehaviorConstraintBindingEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype <em>Behavior Constraint Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype
	 * @generated
	 */
	EClass getBehaviorConstraintPrototype();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getInstantiationVariable <em>Instantiation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiation Variable</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getInstantiationVariable()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_InstantiationVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getTargetVehicleFeatureElement <em>Target Vehicle Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Vehicle Feature Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getTargetVehicleFeatureElement()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_TargetVehicleFeatureElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getType()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getFunctionTarget <em>Function Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getFunctionTarget()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_FunctionTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getHardwareComponentTarget <em>Hardware Component Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Component Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getHardwareComponentTarget()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_HardwareComponentTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getErrorModelTarget <em>Error Model Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Model Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype#getErrorModelTarget()
	 * @see #getBehaviorConstraintPrototype()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_ErrorModelTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType <em>Behavior Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType
	 * @generated
	 */
	EClass getBehaviorConstraintType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getSharedVariable <em>Shared Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Variable</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getSharedVariable()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_SharedVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getInterfaceVariable <em>Interface Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Variable</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getInterfaceVariable()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_InterfaceVariable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getPart()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_Part();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getAttributeQuantificationconstraint <em>Attribute Quantificationconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Quantificationconstraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getAttributeQuantificationconstraint()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_AttributeQuantificationconstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getTemporalConstraint <em>Temporal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getTemporalConstraint()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_TemporalConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getComputationConstraint <em>Computation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computation Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType#getComputationConstraint()
	 * @see #getBehaviorConstraintType()
	 * @generated
	 */
	EReference getBehaviorConstraintType_ComputationConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding <em>Behavior Constraint Target Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Constraint Target Binding</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding
	 * @generated
	 */
	EClass getBehaviorConstraintTargetBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getBehaviorConstraintType <em>Behavior Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Constraint Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getBehaviorConstraintType()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_BehaviorConstraintType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedVehicleFeature <em>Targeted Vehicle Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeted Vehicle Feature</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedVehicleFeature()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_TargetedVehicleFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedFunctionType <em>Targeted Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeted Function Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedFunctionType()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_TargetedFunctionType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedErrorModel <em>Constrained Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Error Model</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedErrorModel()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_ConstrainedErrorModel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedHardwareComponentType <em>Targeted Hardware Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeted Hardware Component Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getTargetedHardwareComponentType()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_TargetedHardwareComponentType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionTriggering <em>Constrained Function Triggering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Function Triggering</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionTriggering()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_ConstrainedFunctionTriggering();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedModeBehavior <em>Constrained Mode Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Mode Behavior</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedModeBehavior()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_ConstrainedModeBehavior();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionBehavior <em>Constrained Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Function Behavior</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding#getConstrainedFunctionBehavior()
	 * @see #getBehaviorConstraintTargetBinding()
	 * @generated
	 */
	EReference getBehaviorConstraintTargetBinding_ConstrainedFunctionBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviordescriptionFactory getBehaviordescriptionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingAttributeImpl <em>Behavior Constraint Binding Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingAttributeImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintBindingAttribute()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE = eINSTANCE.getBehaviorConstraintBindingAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintParameterImpl <em>Behavior Constraint Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintParameterImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintParameter()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_PARAMETER = eINSTANCE.getBehaviorConstraintParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl <em>Behavior Constraint Internal Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintInternalBindingImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintInternalBinding()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_INTERNAL_BINDING = eINSTANCE.getBehaviorConstraintInternalBinding();

		/**
		 * The meta object literal for the '<em><b>Binding Through Clamp Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_CLAMP_CONNECTOR = eINSTANCE.getBehaviorConstraintInternalBinding_BindingThroughClampConnector();

		/**
		 * The meta object literal for the '<em><b>Binding Through Function Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_FUNCTION_CONNECTOR = eINSTANCE.getBehaviorConstraintInternalBinding_BindingThroughFunctionConnector();

		/**
		 * The meta object literal for the '<em><b>Binding Through Hardware Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING__BINDING_THROUGH_HARDWARE_CONNECTOR = eINSTANCE.getBehaviorConstraintInternalBinding_BindingThroughHardwareConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingEventImpl <em>Behavior Constraint Binding Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintBindingEventImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintBindingEvent()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_BINDING_EVENT = eINSTANCE.getBehaviorConstraintBindingEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl <em>Behavior Constraint Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintPrototypeImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintPrototype()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_PROTOTYPE = eINSTANCE.getBehaviorConstraintPrototype();

		/**
		 * The meta object literal for the '<em><b>Instantiation Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__INSTANTIATION_VARIABLE = eINSTANCE.getBehaviorConstraintPrototype_InstantiationVariable();

		/**
		 * The meta object literal for the '<em><b>Target Vehicle Feature Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__TARGET_VEHICLE_FEATURE_ELEMENT = eINSTANCE.getBehaviorConstraintPrototype_TargetVehicleFeatureElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__TYPE = eINSTANCE.getBehaviorConstraintPrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Function Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__FUNCTION_TARGET = eINSTANCE.getBehaviorConstraintPrototype_FunctionTarget();

		/**
		 * The meta object literal for the '<em><b>Hardware Component Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__HARDWARE_COMPONENT_TARGET = eINSTANCE.getBehaviorConstraintPrototype_HardwareComponentTarget();

		/**
		 * The meta object literal for the '<em><b>Error Model Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE__ERROR_MODEL_TARGET = eINSTANCE.getBehaviorConstraintPrototype_ErrorModelTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl <em>Behavior Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintType()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_TYPE = eINSTANCE.getBehaviorConstraintType();

		/**
		 * The meta object literal for the '<em><b>Shared Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE = eINSTANCE.getBehaviorConstraintType_SharedVariable();

		/**
		 * The meta object literal for the '<em><b>Interface Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE = eINSTANCE.getBehaviorConstraintType_InterfaceVariable();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__PART = eINSTANCE.getBehaviorConstraintType_Part();

		/**
		 * The meta object literal for the '<em><b>Attribute Quantificationconstraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT = eINSTANCE.getBehaviorConstraintType_AttributeQuantificationconstraint();

		/**
		 * The meta object literal for the '<em><b>Temporal Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT = eINSTANCE.getBehaviorConstraintType_TemporalConstraint();

		/**
		 * The meta object literal for the '<em><b>Computation Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT = eINSTANCE.getBehaviorConstraintType_ComputationConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl <em>Behavior Constraint Target Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTargetBindingImpl
		 * @see org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl#getBehaviorConstraintTargetBinding()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_TARGET_BINDING = eINSTANCE.getBehaviorConstraintTargetBinding();

		/**
		 * The meta object literal for the '<em><b>Behavior Constraint Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__BEHAVIOR_CONSTRAINT_TYPE = eINSTANCE.getBehaviorConstraintTargetBinding_BehaviorConstraintType();

		/**
		 * The meta object literal for the '<em><b>Targeted Vehicle Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_VEHICLE_FEATURE = eINSTANCE.getBehaviorConstraintTargetBinding_TargetedVehicleFeature();

		/**
		 * The meta object literal for the '<em><b>Targeted Function Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_FUNCTION_TYPE = eINSTANCE.getBehaviorConstraintTargetBinding_TargetedFunctionType();

		/**
		 * The meta object literal for the '<em><b>Constrained Error Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_ERROR_MODEL = eINSTANCE.getBehaviorConstraintTargetBinding_ConstrainedErrorModel();

		/**
		 * The meta object literal for the '<em><b>Targeted Hardware Component Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__TARGETED_HARDWARE_COMPONENT_TYPE = eINSTANCE.getBehaviorConstraintTargetBinding_TargetedHardwareComponentType();

		/**
		 * The meta object literal for the '<em><b>Constrained Function Triggering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_TRIGGERING = eINSTANCE.getBehaviorConstraintTargetBinding_ConstrainedFunctionTriggering();

		/**
		 * The meta object literal for the '<em><b>Constrained Mode Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_MODE_BEHAVIOR = eINSTANCE.getBehaviorConstraintTargetBinding_ConstrainedModeBehavior();

		/**
		 * The meta object literal for the '<em><b>Constrained Function Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_TARGET_BINDING__CONSTRAINED_FUNCTION_BEHAVIOR = eINSTANCE.getBehaviorConstraintTargetBinding_ConstrainedFunctionBehavior();

	}

} //BehaviordescriptionPackage
