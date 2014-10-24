/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.req.reqif;

/**
 * list of constant for SysML
 *
 */
public interface I_SysMLStereotype {
		/** Qualified name of the stereotype Conform */
		public static final String CONFORM_STEREOTYPE = "SysML::ModelElements::Conform";
		/**  name of property base_Dependency of the stereotype Conform */
		public static final String CONFORM_BASE_DEPENDENCY_ATT = "base_Dependency";
		/** Qualified name of the stereotype View */
		public static final String VIEW_STEREOTYPE = "SysML::ModelElements::View";
		/**  name of property viewPoint of the stereotype View */
		public static final String VIEW_VIEWPOINT_ATT = "viewPoint";
		/**  name of property base_Package of the stereotype View */
		public static final String VIEW_BASE_PACKAGE_ATT = "base_Package";
		/** Qualified name of the stereotype ViewPoint */
		public static final String VIEWPOINT_STEREOTYPE = "SysML::ModelElements::ViewPoint";
		/**  name of property base_Class of the stereotype ViewPoint */
		public static final String VIEWPOINT_BASE_CLASS_ATT = "base_Class";
		/**  name of property stakeHolders of the stereotype ViewPoint */
		public static final String VIEWPOINT_STAKEHOLDERS_ATT = "stakeHolders";
		/**  name of property purpose of the stereotype ViewPoint */
		public static final String VIEWPOINT_PURPOSE_ATT = "purpose";
		/**  name of property concerns of the stereotype ViewPoint */
		public static final String VIEWPOINT_CONCERNS_ATT = "concerns";
		/**  name of property languages of the stereotype ViewPoint */
		public static final String VIEWPOINT_LANGUAGES_ATT = "languages";
		/**  name of property methods of the stereotype ViewPoint */
		public static final String VIEWPOINT_METHODS_ATT = "methods";
		/** Qualified name of the stereotype Rationale */
		public static final String RATIONALE_STEREOTYPE = "SysML::ModelElements::Rationale";
		/**  name of property base_Comment of the stereotype Rationale */
		public static final String RATIONALE_BASE_COMMENT_ATT = "base_Comment";
		/** Qualified name of the stereotype Problem */
		public static final String PROBLEM_STEREOTYPE = "SysML::ModelElements::Problem";
		/**  name of property base_Comment of the stereotype Problem */
		public static final String PROBLEM_BASE_COMMENT_ATT = "base_Comment";
		/** Qualified name of the stereotype Block */
		public static final String BLOCK_STEREOTYPE = "SysML::Blocks::Block";
		/**  name of property isEncapsulated of the stereotype Block */
		public static final String BLOCK_ISENCAPSULATED_ATT = "isEncapsulated";
		/**  name of property base_Class of the stereotype Block */
		public static final String BLOCK_BASE_CLASS_ATT = "base_Class";
		/** Qualified name of the stereotype DistributedProperty */
		public static final String DISTRIBUTEDPROPERTY_STEREOTYPE = "SysML::Blocks::DistributedProperty";
		/**  name of property base_Property of the stereotype DistributedProperty */
		public static final String DISTRIBUTEDPROPERTY_BASE_PROPERTY_ATT = "base_Property";
		/** Qualified name of the stereotype Dimension */
		public static final String DIMENSION_STEREOTYPE = "SysML::Blocks::Dimension";
		/**  name of property base_InstanceSpecification of the stereotype Dimension */
		public static final String DIMENSION_BASE_INSTANCESPECIFICATION_ATT = "base_InstanceSpecification";
		/** Qualified name of the stereotype Unit */
		public static final String UNIT_STEREOTYPE = "SysML::Blocks::Unit";
		/**  name of property base_InstanceSpecification of the stereotype Unit */
		public static final String UNIT_BASE_INSTANCESPECIFICATION_ATT = "base_InstanceSpecification";
		/**  name of property dimension of the stereotype Unit */
		public static final String UNIT_DIMENSION_ATT = "dimension";
		/** Qualified name of the stereotype ValueType */
		public static final String VALUETYPE_STEREOTYPE = "SysML::Blocks::ValueType";
		/**  name of property base_DataType of the stereotype ValueType */
		public static final String VALUETYPE_BASE_DATATYPE_ATT = "base_DataType";
		/**  name of property unit of the stereotype ValueType */
		public static final String VALUETYPE_UNIT_ATT = "unit";
		/**  name of property dimension of the stereotype ValueType */
		public static final String VALUETYPE_DIMENSION_ATT = "dimension";
		/** Qualified name of the stereotype NestedConnectorEnd */
		public static final String NESTEDCONNECTOREND_STEREOTYPE = "SysML::Blocks::NestedConnectorEnd";
		/**  name of property propertyPath of the stereotype NestedConnectorEnd */
		public static final String NESTEDCONNECTOREND_PROPERTYPATH_ATT = "propertyPath";
		/**  name of property base_ConnectorEnd of the stereotype NestedConnectorEnd */
		public static final String NESTEDCONNECTOREND_BASE_CONNECTOREND_ATT = "base_ConnectorEnd";
		/** Qualified name of the stereotype ParticipantProperty */
		public static final String PARTICIPANTPROPERTY_STEREOTYPE = "SysML::Blocks::ParticipantProperty";
		/**  name of property base_Property of the stereotype ParticipantProperty */
		public static final String PARTICIPANTPROPERTY_BASE_PROPERTY_ATT = "base_Property";
		/**  name of property end of the stereotype ParticipantProperty */
		public static final String PARTICIPANTPROPERTY_END_ATT = "end";
		/** Qualified name of the stereotype ConnectorProperty */
		public static final String CONNECTORPROPERTY_STEREOTYPE = "SysML::Blocks::ConnectorProperty";
		/**  name of property base_Property of the stereotype ConnectorProperty */
		public static final String CONNECTORPROPERTY_BASE_PROPERTY_ATT = "base_Property";
		/**  name of property connector of the stereotype ConnectorProperty */
		public static final String CONNECTORPROPERTY_CONNECTOR_ATT = "connector";
		/** Qualified name of the stereotype BindingConnector */
		public static final String BINDINGCONNECTOR_STEREOTYPE = "SysML::Blocks::BindingConnector";
		/**  name of property base_Connector of the stereotype BindingConnector */
		public static final String BINDINGCONNECTOR_BASE_CONNECTOR_ATT = "base_Connector";
		/** Qualified name of the stereotype PropertySpecificType */
		public static final String PROPERTYSPECIFICTYPE_STEREOTYPE = "SysML::Blocks::PropertySpecificType";
		/**  name of property base_Classifier of the stereotype PropertySpecificType */
		public static final String PROPERTYSPECIFICTYPE_BASE_CLASSIFIER_ATT = "base_Classifier";
		/** Qualified name of the stereotype FlowPort */
		public static final String FLOWPORT_STEREOTYPE = "SysML::PortAndFlows::FlowPort";
		/**  name of property base_Port of the stereotype FlowPort */
		public static final String FLOWPORT_BASE_PORT_ATT = "base_Port";
		/**  name of property isAtomic of the stereotype FlowPort */
		public static final String FLOWPORT_ISATOMIC_ATT = "isAtomic";
		/**  name of property isConjugated of the stereotype FlowPort */
		public static final String FLOWPORT_ISCONJUGATED_ATT = "isConjugated";
		/**  name of property direction of the stereotype FlowPort */
		public static final String FLOWPORT_DIRECTION_ATT = "direction";
		/** Qualified name of the stereotype FlowProperty */
		public static final String FLOWPROPERTY_STEREOTYPE = "SysML::PortAndFlows::FlowProperty";
		/**  name of property base_Property of the stereotype FlowProperty */
		public static final String FLOWPROPERTY_BASE_PROPERTY_ATT = "base_Property";
		/**  name of property direction of the stereotype FlowProperty */
		public static final String FLOWPROPERTY_DIRECTION_ATT = "direction";
		/** Qualified name of the stereotype FlowSpecification */
		public static final String FLOWSPECIFICATION_STEREOTYPE = "SysML::PortAndFlows::FlowSpecification";
		/**  name of property base_Interface of the stereotype FlowSpecification */
		public static final String FLOWSPECIFICATION_BASE_INTERFACE_ATT = "base_Interface";
		/**  name of literal in of the Enumeration FlowDirection */
		public static final String FLOWDIRECTION_IN_ENUM = "in";
		/**  name of literal out of the Enumeration FlowDirection */
		public static final String FLOWDIRECTION_OUT_ENUM = "out";
		/**  name of literal inout of the Enumeration FlowDirection */
		public static final String FLOWDIRECTION_INOUT_ENUM = "inout";
		/** Qualified name of the stereotype ItemFlow */
		public static final String ITEMFLOW_STEREOTYPE = "SysML::PortAndFlows::ItemFlow";
		/**  name of property base_InformationFlow of the stereotype ItemFlow */
		public static final String ITEMFLOW_BASE_INFORMATIONFLOW_ATT = "base_InformationFlow";
		/**  name of property itemProperty of the stereotype ItemFlow */
		public static final String ITEMFLOW_ITEMPROPERTY_ATT = "itemProperty";
		/** Qualified name of the stereotype ConstraintBlock */
		public static final String CONSTRAINTBLOCK_STEREOTYPE = "SysML::Constraints::ConstraintBlock";
		/** Qualified name of the stereotype ConstraintProperty */
		public static final String CONSTRAINTPROPERTY_STEREOTYPE = "SysML::Constraints::ConstraintProperty";
		/**  name of property base_Property of the stereotype ConstraintProperty */
		public static final String CONSTRAINTPROPERTY_BASE_PROPERTY_ATT = "base_Property";
		/** Qualified name of the stereotype Optional */
		public static final String OPTIONAL_STEREOTYPE = "SysML::Activities::Optional";
		/**  name of property base_Parameter of the stereotype Optional */
		public static final String OPTIONAL_BASE_PARAMETER_ATT = "base_Parameter";
		/** Qualified name of the stereotype Rate */
		public static final String RATE_STEREOTYPE = "SysML::Activities::Rate";
		/**  name of property base_Parameter of the stereotype Rate */
		public static final String RATE_BASE_PARAMETER_ATT = "base_Parameter";
		/**  name of property base_ActivityEdge of the stereotype Rate */
		public static final String RATE_BASE_ACTIVITYEDGE_ATT = "base_ActivityEdge";
		/**  name of property rate of the stereotype Rate */
		public static final String RATE_RATE_ATT = "rate";
		/** Qualified name of the stereotype Probability */
		public static final String PROBABILITY_STEREOTYPE = "SysML::Activities::Probability";
		/**  name of property base_ActivityEdge of the stereotype Probability */
		public static final String PROBABILITY_BASE_ACTIVITYEDGE_ATT = "base_ActivityEdge";
		/**  name of property base_ParameterSet of the stereotype Probability */
		public static final String PROBABILITY_BASE_PARAMETERSET_ATT = "base_ParameterSet";
		/**  name of property probability of the stereotype Probability */
		public static final String PROBABILITY_PROBABILITY_ATT = "probability";
		/** Qualified name of the stereotype Continuous */
		public static final String CONTINUOUS_STEREOTYPE = "SysML::Activities::Continuous";
		/** Qualified name of the stereotype Discrete */
		public static final String DISCRETE_STEREOTYPE = "SysML::Activities::Discrete";
		/** Qualified name of the stereotype ControlOperator */
		public static final String CONTROLOPERATOR_STEREOTYPE = "SysML::Activities::ControlOperator";
		/**  name of property base_Operation of the stereotype ControlOperator */
		public static final String CONTROLOPERATOR_BASE_OPERATION_ATT = "base_Operation";
		/**  name of property base_Behavior of the stereotype ControlOperator */
		public static final String CONTROLOPERATOR_BASE_BEHAVIOR_ATT = "base_Behavior";
		/** Qualified name of the stereotype NoBuffer */
		public static final String NOBUFFER_STEREOTYPE = "SysML::Activities::NoBuffer";
		/**  name of property base_ObjectNode of the stereotype NoBuffer */
		public static final String NOBUFFER_BASE_OBJECTNODE_ATT = "base_ObjectNode";
		/** Qualified name of the stereotype Overwrite */
		public static final String OVERWRITE_STEREOTYPE = "SysML::Activities::Overwrite";
		/**  name of property base_ObjectNode of the stereotype Overwrite */
		public static final String OVERWRITE_BASE_OBJECTNODE_ATT = "base_ObjectNode";
		/** Qualified name of the stereotype Allocate */
		public static final String ALLOCATE_STEREOTYPE = "SysML::Allocations::Allocate";
		/**  name of property base_Abstraction of the stereotype Allocate */
		public static final String ALLOCATE_BASE_ABSTRACTION_ATT = "base_Abstraction";
		/** Qualified name of the stereotype Allocated */
		public static final String ALLOCATED_STEREOTYPE = "SysML::Allocations::Allocated";
		/**  name of property base_NamedElement of the stereotype Allocated */
		public static final String ALLOCATED_BASE_NAMEDELEMENT_ATT = "base_NamedElement";
		/**  name of property allocatedFrom of the stereotype Allocated */
		public static final String ALLOCATED_ALLOCATEDFROM_ATT = "allocatedFrom";
		/**  name of property allocatedTo of the stereotype Allocated */
		public static final String ALLOCATED_ALLOCATEDTO_ATT = "allocatedTo";
		/** Qualified name of the stereotype AllocateActivityPartition */
		public static final String ALLOCATEACTIVITYPARTITION_STEREOTYPE = "SysML::Allocations::AllocateActivityPartition";
		/**  name of property base_ActivityPartition of the stereotype AllocateActivityPartition */
		public static final String ALLOCATEACTIVITYPARTITION_BASE_ACTIVITYPARTITION_ATT = "base_ActivityPartition";
		/** Qualified name of the stereotype DeriveReqt */
		public static final String DERIVEREQT_STEREOTYPE = "SysML::Requirements::DeriveReqt";
		/** Qualified name of the stereotype Verify */
		public static final String VERIFY_STEREOTYPE = "SysML::Requirements::Verify";
		/** Qualified name of the stereotype Copy */
		public static final String COPY_STEREOTYPE = "SysML::Requirements::Copy";
		/** Qualified name of the stereotype Satisfy */
		public static final String SATISFY_STEREOTYPE = "SysML::Requirements::Satisfy";
		/** Qualified name of the stereotype TestCase */
		public static final String TESTCASE_STEREOTYPE = "SysML::Requirements::TestCase";
		/**  name of property base_Behavior of the stereotype TestCase */
		public static final String TESTCASE_BASE_BEHAVIOR_ATT = "base_Behavior";
		/**  name of property base_Operation of the stereotype TestCase */
		public static final String TESTCASE_BASE_OPERATION_ATT = "base_Operation";
		/**  name of property verifies of the stereotype TestCase */
		public static final String TESTCASE_VERIFIES_ATT = "verifies";
		/** Qualified name of the stereotype Requirement */
		public static final String REQUIREMENT_STEREOTYPE = "SysML::Requirements::Requirement";
		/**  name of property text of the stereotype Requirement */
		public static final String REQUIREMENT_TEXT_ATT = "text";
		/**  name of property id of the stereotype Requirement */
		public static final String REQUIREMENT_ID_ATT = "id";
		/**  name of property derived of the stereotype Requirement */
		public static final String REQUIREMENT_DERIVED_ATT = "derived";
		/**  name of property derivedFrom of the stereotype Requirement */
		public static final String REQUIREMENT_DERIVEDFROM_ATT = "derivedFrom";
		/**  name of property satisfiedBy of the stereotype Requirement */
		public static final String REQUIREMENT_SATISFIEDBY_ATT = "satisfiedBy";
		/**  name of property refinedBy of the stereotype Requirement */
		public static final String REQUIREMENT_REFINEDBY_ATT = "refinedBy";
		/**  name of property tracedTo of the stereotype Requirement */
		public static final String REQUIREMENT_TRACEDTO_ATT = "tracedTo";
		/**  name of property verifiedBy of the stereotype Requirement */
		public static final String REQUIREMENT_VERIFIEDBY_ATT = "verifiedBy";
		/**  name of property master of the stereotype Requirement */
		public static final String REQUIREMENT_MASTER_ATT = "master";
		/**  name of property base_Class of the stereotype Requirement */
		public static final String REQUIREMENT_BASE_CLASS_ATT = "base_Class";
		/** Qualified name of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_STEREOTYPE = "SysML::Requirements::RequirementRelated";
		/**  name of property base_NamedElement of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_BASE_NAMEDELEMENT_ATT = "base_NamedElement";
		/**  name of property tracedFrom of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_TRACEDFROM_ATT = "tracedFrom";
		/**  name of property satisfies of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_SATISFIES_ATT = "satisfies";
		/**  name of property refines of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_REFINES_ATT = "refines";
		/**  name of property verifies of the stereotype RequirementRelated */
		public static final String REQUIREMENTRELATED_VERIFIES_ATT = "verifies";
		}
