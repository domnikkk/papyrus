/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.composite.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IMultilineEditableFigure;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class UMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {

			case CompositeStructureDiagramEditPart.VISUAL_ID:
				return new CompositeStructureDiagramEditPart(view);

			case ActivityCompositeEditPart.VISUAL_ID:
				return new ActivityCompositeEditPart(view);

			case ActivityCompositeNameEditPart.VISUAL_ID:
				return new ActivityCompositeNameEditPart(view);

			case ActivityCompositeFloatingLabelEditPart.VISUAL_ID:
				return new ActivityCompositeFloatingLabelEditPart(view);

			case InteractionCompositeEditPart.VISUAL_ID:
				return new InteractionCompositeEditPart(view);

			case InteractionCompositeNameEditPart.VISUAL_ID:
				return new InteractionCompositeNameEditPart(view);

			case InteractionCompositeFloatingLabelEditPart.VISUAL_ID:
				return new InteractionCompositeFloatingLabelEditPart(view);

			case ProtocolStateMachineCompositeEditPart.VISUAL_ID:
				return new ProtocolStateMachineCompositeEditPart(view);

			case ProtocolStateMachineCompositeNameEditPart.VISUAL_ID:
				return new ProtocolStateMachineCompositeNameEditPart(view);

			case ProtocolStateMachineCompositeFloatingLabelEditPart.VISUAL_ID:
				return new ProtocolStateMachineCompositeFloatingLabelEditPart(view);

			case StateMachineCompositeEditPart.VISUAL_ID:
				return new StateMachineCompositeEditPart(view);

			case StateMachineCompositeNameEditPart.VISUAL_ID:
				return new StateMachineCompositeNameEditPart(view);

			case StateMachineCompositeFloatingLabelEditPart.VISUAL_ID:
				return new StateMachineCompositeFloatingLabelEditPart(view);

			case FunctionBehaviorCompositeEditPart.VISUAL_ID:
				return new FunctionBehaviorCompositeEditPart(view);

			case FunctionBehaviorCompositeNameEditPart.VISUAL_ID:
				return new FunctionBehaviorCompositeNameEditPart(view);

			case FunctionBehaviorCompositeFloatingLabelEditPart.VISUAL_ID:
				return new FunctionBehaviorCompositeFloatingLabelEditPart(view);

			case OpaqueBehaviorCompositeEditPart.VISUAL_ID:
				return new OpaqueBehaviorCompositeEditPart(view);

			case OpaqueBehaviorCompositeNameEditPart.VISUAL_ID:
				return new OpaqueBehaviorCompositeNameEditPart(view);

			case OpaqueBehaviorCompositeFloatingLabelEditPart.VISUAL_ID:
				return new OpaqueBehaviorCompositeFloatingLabelEditPart(view);

			case ComponentCompositeEditPart.VISUAL_ID:
				return new ComponentCompositeEditPart(view);

			case ComponentCompositeNameEditPart.VISUAL_ID:
				return new ComponentCompositeNameEditPart(view);

			case ComponentCompositeFloatingLabelEditPart.VISUAL_ID:
				return new ComponentCompositeFloatingLabelEditPart(view);

			case DeviceCompositeEditPart.VISUAL_ID:
				return new DeviceCompositeEditPart(view);

			case DeviceCompositeNameEditPart.VISUAL_ID:
				return new DeviceCompositeNameEditPart(view);

			case DeviceCompositeFloatingLabelEditPart.VISUAL_ID:
				return new DeviceCompositeFloatingLabelEditPart(view);

			case ExecutionEnvironmentCompositeEditPart.VISUAL_ID:
				return new ExecutionEnvironmentCompositeEditPart(view);

			case ExecutionEnvironmentCompositeNameEditPart.VISUAL_ID:
				return new ExecutionEnvironmentCompositeNameEditPart(view);

			case ExecutionEnvironmentCompositeFloatingLabelEditPart.VISUAL_ID:
				return new ExecutionEnvironmentCompositeFloatingLabelEditPart(view);

			case NodeCompositeEditPart.VISUAL_ID:
				return new NodeCompositeEditPart(view);

			case NodeCompositeNameEditPart.VISUAL_ID:
				return new NodeCompositeNameEditPart(view);

			case NodeCompositeFloatingLabelEditPart.VISUAL_ID:
				return new NodeCompositeFloatingLabelEditPart(view);

			case ClassCompositeEditPart.VISUAL_ID:
				return new ClassCompositeEditPart(view);

			case ClassCompositeNameEditPart.VISUAL_ID:
				return new ClassCompositeNameEditPart(view);

			case ClassCompositeFloatingLabelEditPart.VISUAL_ID:
				return new ClassCompositeFloatingLabelEditPart(view);

			case CollaborationCompositeEditPart.VISUAL_ID:
				return new CollaborationCompositeEditPart(view);

			case CollaborationCompositeNameEditPart.VISUAL_ID:
				return new CollaborationCompositeNameEditPart(view);

			case CollaborationCompositeFloatingLabelEditPart.VISUAL_ID:
				return new CollaborationCompositeFloatingLabelEditPart(view);

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case InterfaceFloatingLabelEditPart.VISUAL_ID:
				return new InterfaceFloatingLabelEditPart(view);

			case PrimitiveTypeEditPart.VISUAL_ID:
				return new PrimitiveTypeEditPart(view);

			case PrimitiveTypeNameEditPart.VISUAL_ID:
				return new PrimitiveTypeNameEditPart(view);

			case PrimitiveTypeFloatingLabelEditPart.VISUAL_ID:
				return new PrimitiveTypeFloatingLabelEditPart(view);

			case EnumerationEditPart.VISUAL_ID:
				return new EnumerationEditPart(view);

			case EnumerationNameEditPart.VISUAL_ID:
				return new EnumerationNameEditPart(view);

			case EnumerationFloatingLabelEditPart.VISUAL_ID:
				return new EnumerationFloatingLabelEditPart(view);

			case DataTypeEditPart.VISUAL_ID:
				return new DataTypeEditPart(view);

			case DataTypeNameEditPart.VISUAL_ID:
				return new DataTypeNameEditPart(view);

			case DataTypeFloatingLabelEditPart.VISUAL_ID:
				return new DataTypeFloatingLabelEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case ActorFloatingLabelEditPart.VISUAL_ID:
				return new ActorFloatingLabelEditPart(view);

			case DeploymentSpecificationEditPart.VISUAL_ID:
				return new DeploymentSpecificationEditPart(view);

			case DeploymentSpecificationNameEditPart.VISUAL_ID:
				return new DeploymentSpecificationNameEditPart(view);

			case DeploymentSpecificationFloatingLabelEditPart.VISUAL_ID:
				return new DeploymentSpecificationFloatingLabelEditPart(view);

			case ArtifactEditPart.VISUAL_ID:
				return new ArtifactEditPart(view);

			case ArtifactNameEditPart.VISUAL_ID:
				return new ArtifactNameEditPart(view);

			case ArtifactFloatingLabelEditPart.VISUAL_ID:
				return new ArtifactFloatingLabelEditPart(view);

			case InformationItemEditPart.VISUAL_ID:
				return new InformationItemEditPart(view);

			case InformationItemNameEditPart.VISUAL_ID:
				return new InformationItemNameEditPart(view);

			case InformationItemFloatingLabelEditPart.VISUAL_ID:
				return new InformationItemFloatingLabelEditPart(view);

			case SignalEditPart.VISUAL_ID:
				return new SignalEditPart(view);

			case SignalNameEditPart.VISUAL_ID:
				return new SignalNameEditPart(view);

			case SignalFloatingLabelEditPart.VISUAL_ID:
				return new SignalFloatingLabelEditPart(view);

			case UseCaseEditPart.VISUAL_ID:
				return new UseCaseEditPart(view);

			case UseCaseNameEditPart.VISUAL_ID:
				return new UseCaseNameEditPart(view);

			case UseCaseFloatingLabelEditPart.VISUAL_ID:
				return new UseCaseFloatingLabelEditPart(view);

			case SignalEventEditPart.VISUAL_ID:
				return new SignalEventEditPart(view);

			case SignalEventNameEditPart.VISUAL_ID:
				return new SignalEventNameEditPart(view);

			case SignalEventFloatingLabelEditPart.VISUAL_ID:
				return new SignalEventFloatingLabelEditPart(view);

			case CallEventEditPart.VISUAL_ID:
				return new CallEventEditPart(view);

			case CallEventNameEditPart.VISUAL_ID:
				return new CallEventNameEditPart(view);

			case CallEventFloatingLabelEditPart.VISUAL_ID:
				return new CallEventFloatingLabelEditPart(view);

			case AnyReceiveEventEditPart.VISUAL_ID:
				return new AnyReceiveEventEditPart(view);

			case AnyReceiveEventNameEditPart.VISUAL_ID:
				return new AnyReceiveEventNameEditPart(view);

			case AnyReceiveEventFloatingLabelEditPart.VISUAL_ID:
				return new AnyReceiveEventFloatingLabelEditPart(view);

			case ChangeEventEditPart.VISUAL_ID:
				return new ChangeEventEditPart(view);

			case ChangeEventNameEditPart.VISUAL_ID:
				return new ChangeEventNameEditPart(view);

			case ChangeEventFloatingLabelEditPart.VISUAL_ID:
				return new ChangeEventFloatingLabelEditPart(view);

			case TimeEventEditPart.VISUAL_ID:
				return new TimeEventEditPart(view);

			case TimeEventNameEditPart.VISUAL_ID:
				return new TimeEventNameEditPart(view);

			case TimeEventFloatingLabelEditPart.VISUAL_ID:
				return new TimeEventFloatingLabelEditPart(view);

			case DurationObservationEditPart.VISUAL_ID:
				return new DurationObservationEditPart(view);

			case DurationObservationNameEditPart.VISUAL_ID:
				return new DurationObservationNameEditPart(view);

			case DurationObservationStereotypeLabelEditPart.VISUAL_ID:
				return new DurationObservationStereotypeLabelEditPart(view);

			case TimeObservationEditPart.VISUAL_ID:
				return new TimeObservationEditPart(view);

			case TimeObservationNameEditPart.VISUAL_ID:
				return new TimeObservationNameEditPart(view);

			case TimeObservationStereotypeLabelEditPart.VISUAL_ID:
				return new TimeObservationStereotypeLabelEditPart(view);

			case LiteralBooleanEditPart.VISUAL_ID:
				return new LiteralBooleanEditPart(view);

			case LiteralBooleanNameEditPart.VISUAL_ID:
				return new LiteralBooleanNameEditPart(view);

			case LiteralBooleanFloatingLabelEditPart.VISUAL_ID:
				return new LiteralBooleanFloatingLabelEditPart(view);

			case LiteralIntegerEditPart.VISUAL_ID:
				return new LiteralIntegerEditPart(view);

			case LiteralIntegerNameEditPart.VISUAL_ID:
				return new LiteralIntegerNameEditPart(view);

			case LiteralIntegerFloatingLabelEditPart.VISUAL_ID:
				return new LiteralIntegerFloatingLabelEditPart(view);

			case LiteralNullEditPart.VISUAL_ID:
				return new LiteralNullEditPart(view);

			case LiteralNullNameEditPart.VISUAL_ID:
				return new LiteralNullNameEditPart(view);

			case LiteralNullFloatingLabelEditPart.VISUAL_ID:
				return new LiteralNullFloatingLabelEditPart(view);

			case LiteralStringEditPart.VISUAL_ID:
				return new LiteralStringEditPart(view);

			case LiteralStringNameEditPart.VISUAL_ID:
				return new LiteralStringNameEditPart(view);

			case LiteralStringFloatingLabelEditPart.VISUAL_ID:
				return new LiteralStringFloatingLabelEditPart(view);

			case LiteralUnlimitedNaturalEditPart.VISUAL_ID:
				return new LiteralUnlimitedNaturalEditPart(view);

			case LiteralUnlimitedNaturalNameEditPart.VISUAL_ID:
				return new LiteralUnlimitedNaturalNameEditPart(view);

			case LiteralUnlimitedNaturalFloatingLabelEditPart.VISUAL_ID:
				return new LiteralUnlimitedNaturalFloatingLabelEditPart(view);

			case StringExpressionEditPart.VISUAL_ID:
				return new StringExpressionEditPart(view);

			case StringExpressionNameEditPart.VISUAL_ID:
				return new StringExpressionNameEditPart(view);

			case StringExpressionFloatingLabelEditPart.VISUAL_ID:
				return new StringExpressionFloatingLabelEditPart(view);

			case OpaqueExpressionEditPart.VISUAL_ID:
				return new OpaqueExpressionEditPart(view);

			case OpaqueExpressionNameEditPart.VISUAL_ID:
				return new OpaqueExpressionNameEditPart(view);

			case OpaqueExpressionFloatingLabelEditPart.VISUAL_ID:
				return new OpaqueExpressionFloatingLabelEditPart(view);

			case TimeExpressionEditPart.VISUAL_ID:
				return new TimeExpressionEditPart(view);

			case TimeExpressionNameEditPart.VISUAL_ID:
				return new TimeExpressionNameEditPart(view);

			case TimeExpressionFloatingLabelEditPart.VISUAL_ID:
				return new TimeExpressionFloatingLabelEditPart(view);

			case ExpressionEditPart.VISUAL_ID:
				return new ExpressionEditPart(view);

			case ExpressionNameEditPart.VISUAL_ID:
				return new ExpressionNameEditPart(view);

			case ExpressionFloatingLabelEditPart.VISUAL_ID:
				return new ExpressionFloatingLabelEditPart(view);

			case DurationEditPart.VISUAL_ID:
				return new DurationEditPart(view);

			case DurationNameEditPart.VISUAL_ID:
				return new DurationNameEditPart(view);

			case DurationFloatingLabelEditPart.VISUAL_ID:
				return new DurationFloatingLabelEditPart(view);

			case TimeIntervalEditPart.VISUAL_ID:
				return new TimeIntervalEditPart(view);

			case TimeIntervalNameEditPart.VISUAL_ID:
				return new TimeIntervalNameEditPart(view);

			case TimeIntervalFloatingLabelEditPart.VISUAL_ID:
				return new TimeIntervalFloatingLabelEditPart(view);

			case DurationIntervalEditPart.VISUAL_ID:
				return new DurationIntervalEditPart(view);

			case DurationIntervalNameEditPart.VISUAL_ID:
				return new DurationIntervalNameEditPart(view);

			case DurationIntervalFloatingLabelEditPart.VISUAL_ID:
				return new DurationIntervalFloatingLabelEditPart(view);

			case IntervalEditPart.VISUAL_ID:
				return new IntervalEditPart(view);

			case IntervalNameEditPart.VISUAL_ID:
				return new IntervalNameEditPart(view);

			case IntervalFloatingLabelEditPart.VISUAL_ID:
				return new IntervalFloatingLabelEditPart(view);

			case InstanceValueEditPart.VISUAL_ID:
				return new InstanceValueEditPart(view);

			case InstanceValueNameEditPart.VISUAL_ID:
				return new InstanceValueNameEditPart(view);

			case InstanceValueFloatingLabelEditPart.VISUAL_ID:
				return new InstanceValueFloatingLabelEditPart(view);

			case CommentEditPart.VISUAL_ID:
				return new CommentEditPart(view);

			case CommentBodyEditPart.VISUAL_ID:
				return new CommentBodyEditPart(view);

			case DurationConstraintEditPart.VISUAL_ID:
				return new DurationConstraintEditPart(view);

			case DurationConstraintNameEditPart.VISUAL_ID:
				return new DurationConstraintNameEditPart(view);

			case DurationConstraintSpecificationEditPart.VISUAL_ID:
				return new DurationConstraintSpecificationEditPart(view);

			case TimeConstraintEditPart.VISUAL_ID:
				return new TimeConstraintEditPart(view);

			case TimeConstraintNameEditPart.VISUAL_ID:
				return new TimeConstraintNameEditPart(view);

			case TimeConstraintSpecificationEditPart.VISUAL_ID:
				return new TimeConstraintSpecificationEditPart(view);

			case IntervalConstraintEditPart.VISUAL_ID:
				return new IntervalConstraintEditPart(view);

			case IntervalConstraintNameEditPart.VISUAL_ID:
				return new IntervalConstraintNameEditPart(view);

			case IntervalConstraintSpecificationEditPart.VISUAL_ID:
				return new IntervalConstraintSpecificationEditPart(view);

			case InteractionConstraintEditPart.VISUAL_ID:
				return new InteractionConstraintEditPart(view);

			case InteractionConstraintNameEditPart.VISUAL_ID:
				return new InteractionConstraintNameEditPart(view);

			case InteractionConstraintSpecificationEditPart.VISUAL_ID:
				return new InteractionConstraintSpecificationEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case ConstraintNameEditPart.VISUAL_ID:
				return new ConstraintNameEditPart(view);

			case ConstraintSpecificationEditPart.VISUAL_ID:
				return new ConstraintSpecificationEditPart(view);

			case BehaviorPortEditPart.VISUAL_ID:
				return new BehaviorPortEditPart(view);

			case BehaviorPortFloatingLabelEditPart.VISUAL_ID:
				return new BehaviorPortFloatingLabelEditPart(view);

			case PortEditPart.VISUAL_ID:
				return new PortEditPart(view);

			case PortNameEditPart.VISUAL_ID:
				return new PortNameEditPart(view);

			case PortAppliedStereotypeEditPart.VISUAL_ID:
				return new PortAppliedStereotypeEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameEditPart.VISUAL_ID:
				return new ParameterNameEditPart(view);

			case ParameterAppliedStereotypeEditPart.VISUAL_ID:
				return new ParameterAppliedStereotypeEditPart(view);

			case PropertyPartEditPartCN.VISUAL_ID:
				return new PropertyPartEditPartCN(view);

			case PropertyPartNameEditPartCN.VISUAL_ID:
				return new PropertyPartNameEditPartCN(view);

			case PropertyPartFloatingLabelEditPartCN.VISUAL_ID:
				return new PropertyPartFloatingLabelEditPartCN(view);

			case CollaborationRoleEditPartCN.VISUAL_ID:
				return new CollaborationRoleEditPartCN(view);

			case CollaborationRoleNameEditPartCN.VISUAL_ID:
				return new CollaborationRoleNameEditPartCN(view);

			case CollaborationRoleFloatingLabelEditPartCN.VISUAL_ID:
				return new CollaborationRoleFloatingLabelEditPartCN(view);

			case CollaborationUseEditPartCN.VISUAL_ID:
				return new CollaborationUseEditPartCN(view);

			case CollaborationUseNameEditPart.VISUAL_ID:
				return new CollaborationUseNameEditPart(view);

			case CollaborationUseFloatingLabelEditPartCN.VISUAL_ID:
				return new CollaborationUseFloatingLabelEditPartCN(view);

			case ActivityCompositeEditPartCN.VISUAL_ID:
				return new ActivityCompositeEditPartCN(view);

			case ActivityCompositeNameEditPartCN.VISUAL_ID:
				return new ActivityCompositeNameEditPartCN(view);

			case ActivityCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new ActivityCompositeFloatingLabelEditPartCN(view);

			case InteractionCompositeEditPartCN.VISUAL_ID:
				return new InteractionCompositeEditPartCN(view);

			case InteractionCompositeNameEditPartCN.VISUAL_ID:
				return new InteractionCompositeNameEditPartCN(view);

			case InteractionCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new InteractionCompositeFloatingLabelEditPartCN(view);

			case ProtocolStateMachineCompositeEditPartCN.VISUAL_ID:
				return new ProtocolStateMachineCompositeEditPartCN(view);

			case ProtocolStateMachineCompositeNameEditPartCN.VISUAL_ID:
				return new ProtocolStateMachineCompositeNameEditPartCN(view);

			case ProtocolStateMachineCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new ProtocolStateMachineCompositeFloatingLabelEditPartCN(view);

			case StateMachineCompositeEditPartCN.VISUAL_ID:
				return new StateMachineCompositeEditPartCN(view);

			case StateMachineCompositeNameEditPartCN.VISUAL_ID:
				return new StateMachineCompositeNameEditPartCN(view);

			case StateMachineCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new StateMachineCompositeFloatingLabelEditPartCN(view);

			case FunctionBehaviorCompositeEditPartCN.VISUAL_ID:
				return new FunctionBehaviorCompositeEditPartCN(view);

			case FunctionBehaviorCompositeNameEditPartCN.VISUAL_ID:
				return new FunctionBehaviorCompositeNameEditPartCN(view);

			case FunctionBehaviorCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new FunctionBehaviorCompositeFloatingLabelEditPartCN(view);

			case OpaqueBehaviorCompositeEditPartCN.VISUAL_ID:
				return new OpaqueBehaviorCompositeEditPartCN(view);

			case OpaqueBehaviorCompositeNameEditPartCN.VISUAL_ID:
				return new OpaqueBehaviorCompositeNameEditPartCN(view);

			case OpaqueBehaviorCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new OpaqueBehaviorCompositeFloatingLabelEditPartCN(view);

			case ComponentCompositeEditPartCN.VISUAL_ID:
				return new ComponentCompositeEditPartCN(view);

			case ComponentCompositeNameEditPartCN.VISUAL_ID:
				return new ComponentCompositeNameEditPartCN(view);

			case ComponentCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new ComponentCompositeFloatingLabelEditPartCN(view);

			case DeviceCompositeEditPartCN.VISUAL_ID:
				return new DeviceCompositeEditPartCN(view);

			case DeviceCompositeNameEditPartCN.VISUAL_ID:
				return new DeviceCompositeNameEditPartCN(view);

			case DeviceCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new DeviceCompositeFloatingLabelEditPartCN(view);

			case ExecutionEnvironmentCompositeEditPartCN.VISUAL_ID:
				return new ExecutionEnvironmentCompositeEditPartCN(view);

			case ExecutionEnvironmentCompositeNameEditPartCN.VISUAL_ID:
				return new ExecutionEnvironmentCompositeNameEditPartCN(view);

			case ExecutionEnvironmentCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new ExecutionEnvironmentCompositeFloatingLabelEditPartCN(view);

			case NodeCompositeEditPartCN.VISUAL_ID:
				return new NodeCompositeEditPartCN(view);

			case NodeCompositeNameEditPartCN.VISUAL_ID:
				return new NodeCompositeNameEditPartCN(view);

			case NodeCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new NodeCompositeFloatingLabelEditPartCN(view);

			case ClassCompositeEditPartCN.VISUAL_ID:
				return new ClassCompositeEditPartCN(view);

			case ClassCompositeNameEditPartCN.VISUAL_ID:
				return new ClassCompositeNameEditPartCN(view);

			case ClassCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new ClassCompositeFloatingLabelEditPartCN(view);

			case CollaborationCompositeEditPartCN.VISUAL_ID:
				return new CollaborationCompositeEditPartCN(view);

			case CollaborationCompositeNameEditPartCN.VISUAL_ID:
				return new CollaborationCompositeNameEditPartCN(view);

			case CollaborationCompositeFloatingLabelEditPartCN.VISUAL_ID:
				return new CollaborationCompositeFloatingLabelEditPartCN(view);

			case InterfaceEditPartCN.VISUAL_ID:
				return new InterfaceEditPartCN(view);

			case InterfaceNameEditPartCN.VISUAL_ID:
				return new InterfaceNameEditPartCN(view);

			case InterfaceFloatingLabelEditPartCN.VISUAL_ID:
				return new InterfaceFloatingLabelEditPartCN(view);

			case PrimitiveTypeEditPartCN.VISUAL_ID:
				return new PrimitiveTypeEditPartCN(view);

			case PrimitiveTypeNameEditPartCN.VISUAL_ID:
				return new PrimitiveTypeNameEditPartCN(view);

			case PrimitiveTypeFloatingLabelEditPartCN.VISUAL_ID:
				return new PrimitiveTypeFloatingLabelEditPartCN(view);

			case EnumerationEditPartCN.VISUAL_ID:
				return new EnumerationEditPartCN(view);

			case EnumerationNameEditPartCN.VISUAL_ID:
				return new EnumerationNameEditPartCN(view);

			case EnumerationFloatingLabelEditPartCN.VISUAL_ID:
				return new EnumerationFloatingLabelEditPartCN(view);

			case DataTypeEditPartCN.VISUAL_ID:
				return new DataTypeEditPartCN(view);

			case DataTypeNameEditPartCN.VISUAL_ID:
				return new DataTypeNameEditPartCN(view);

			case DataTypeFloatingLabelEditPartCN.VISUAL_ID:
				return new DataTypeFloatingLabelEditPartCN(view);

			case ActorEditPartCN.VISUAL_ID:
				return new ActorEditPartCN(view);

			case ActorNameEditPartCN.VISUAL_ID:
				return new ActorNameEditPartCN(view);

			case ActorFloatingLabelEditPartCN.VISUAL_ID:
				return new ActorFloatingLabelEditPartCN(view);

			case DeploymentSpecificationEditPartCN.VISUAL_ID:
				return new DeploymentSpecificationEditPartCN(view);

			case DeploymentSpecificationNameEditPartCN.VISUAL_ID:
				return new DeploymentSpecificationNameEditPartCN(view);

			case DeploymentSpecificationFloatingLabelEditPartCN.VISUAL_ID:
				return new DeploymentSpecificationFloatingLabelEditPartCN(view);

			case ArtifactEditPartCN.VISUAL_ID:
				return new ArtifactEditPartCN(view);

			case ArtifactNameEditPartCN.VISUAL_ID:
				return new ArtifactNameEditPartCN(view);

			case ArtifactFloatingLabelEditPartCN.VISUAL_ID:
				return new ArtifactFloatingLabelEditPartCN(view);

			case InformationItemEditPartCN.VISUAL_ID:
				return new InformationItemEditPartCN(view);

			case InformationItemNameEditPartCN.VISUAL_ID:
				return new InformationItemNameEditPartCN(view);

			case InformationItemFloatingLabelEditPartCN.VISUAL_ID:
				return new InformationItemFloatingLabelEditPartCN(view);

			case SignalEditPartCN.VISUAL_ID:
				return new SignalEditPartCN(view);

			case SignalNameEditPartCN.VISUAL_ID:
				return new SignalNameEditPartCN(view);

			case SignalFloatingLabelEditPartCN.VISUAL_ID:
				return new SignalFloatingLabelEditPartCN(view);

			case UseCaseEditPartCN.VISUAL_ID:
				return new UseCaseEditPartCN(view);

			case UseCaseNameEditPartCN.VISUAL_ID:
				return new UseCaseNameEditPartCN(view);

			case UseCaseFloatingLabelEditPartCN.VISUAL_ID:
				return new UseCaseFloatingLabelEditPartCN(view);

			case CommentEditPartCN.VISUAL_ID:
				return new CommentEditPartCN(view);

			case CommentBodyEditPartCN.VISUAL_ID:
				return new CommentBodyEditPartCN(view);

			case DurationConstraintEditPartCN.VISUAL_ID:
				return new DurationConstraintEditPartCN(view);

			case DurationConstraintNameEditPartCN.VISUAL_ID:
				return new DurationConstraintNameEditPartCN(view);

			case DurationConstraintSpecificationEditPartCN.VISUAL_ID:
				return new DurationConstraintSpecificationEditPartCN(view);

			case TimeConstraintEditPartCN.VISUAL_ID:
				return new TimeConstraintEditPartCN(view);

			case TimeConstraintNameEditPartCN.VISUAL_ID:
				return new TimeConstraintNameEditPartCN(view);

			case TimeConstraintSpecificationEditPartCN.VISUAL_ID:
				return new TimeConstraintSpecificationEditPartCN(view);

			case IntervalConstraintEditPartCN.VISUAL_ID:
				return new IntervalConstraintEditPartCN(view);

			case IntervalConstraintNameEditPartCN.VISUAL_ID:
				return new IntervalConstraintNameEditPartCN(view);

			case IntervalConstraintSpecificationEditPartCN.VISUAL_ID:
				return new IntervalConstraintSpecificationEditPartCN(view);

			case InteractionConstraintEditPartCN.VISUAL_ID:
				return new InteractionConstraintEditPartCN(view);

			case InteractionConstraintNameEditPartCN.VISUAL_ID:
				return new InteractionConstraintNameEditPartCN(view);

			case InteractionConstraintSpecificationEditPartCN.VISUAL_ID:
				return new InteractionConstraintSpecificationEditPartCN(view);

			case ConstraintEditPartCN.VISUAL_ID:
				return new ConstraintEditPartCN(view);

			case ConstraintNameEditPartCN.VISUAL_ID:
				return new ConstraintNameEditPartCN(view);

			case ConstraintSpecificationEditPartCN.VISUAL_ID:
				return new ConstraintSpecificationEditPartCN(view);

			case PropertyEditPartCLN.VISUAL_ID:
				return new PropertyEditPartCLN(view);

			case OperationEditPartCLN.VISUAL_ID:
				return new OperationEditPartCLN(view);

			case EnumerationLiteralEditPartCLN.VISUAL_ID:
				return new EnumerationLiteralEditPartCLN(view);

			case DataTypeAttributeCompartmentEditPart.VISUAL_ID:
				return new DataTypeAttributeCompartmentEditPart(view);

			case DataTypeOperationCompartmentEditPart.VISUAL_ID:
				return new DataTypeOperationCompartmentEditPart(view);

			case DataTypeAttributeCompartmentEditPartCN.VISUAL_ID:
				return new DataTypeAttributeCompartmentEditPartCN(view);

			case DataTypeOperationCompartmentEditPartCN.VISUAL_ID:
				return new DataTypeOperationCompartmentEditPartCN(view);

			case EnumerationEnumerationLiteralCompartmentEditPart.VISUAL_ID:
				return new EnumerationEnumerationLiteralCompartmentEditPart(view);

			case EnumerationEnumerationLiteralCompartmentEditPartCN.VISUAL_ID:
				return new EnumerationEnumerationLiteralCompartmentEditPartCN(view);

			case ActivityCompositeCompartmentEditPartCN.VISUAL_ID:
				return new ActivityCompositeCompartmentEditPartCN(view);

			case InteractionCompositeCompartmentEditPartCN.VISUAL_ID:
				return new InteractionCompositeCompartmentEditPartCN(view);

			case ProtocolStateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				return new ProtocolStateMachineCompositeCompartmentEditPartCN(view);

			case StateMachineCompositeCompartmentEditPartCN.VISUAL_ID:
				return new StateMachineCompositeCompartmentEditPartCN(view);

			case FunctionBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				return new FunctionBehaviorCompositeCompartmentEditPartCN(view);

			case OpaqueBehaviorCompositeCompartmentEditPartCN.VISUAL_ID:
				return new OpaqueBehaviorCompositeCompartmentEditPartCN(view);

			case ComponentCompositeCompartmentEditPartCN.VISUAL_ID:
				return new ComponentCompositeCompartmentEditPartCN(view);

			case DeviceCompositeCompartmentEditPartCN.VISUAL_ID:
				return new DeviceCompositeCompartmentEditPartCN(view);

			case ExecutionEnvironmentCompositeCompartmentEditPartCN.VISUAL_ID:
				return new ExecutionEnvironmentCompositeCompartmentEditPartCN(view);

			case NodeCompositeCompartmentEditPartCN.VISUAL_ID:
				return new NodeCompositeCompartmentEditPartCN(view);

			case ClassCompositeCompartmentEditPartCN.VISUAL_ID:
				return new ClassCompositeCompartmentEditPartCN(view);

			case CollaborationCompositeCompartmentEditPartCN.VISUAL_ID:
				return new CollaborationCompositeCompartmentEditPartCN(view);

			case ActivityCompositeCompartmentEditPart.VISUAL_ID:
				return new ActivityCompositeCompartmentEditPart(view);

			case InteractionCompositeCompartmentEditPart.VISUAL_ID:
				return new InteractionCompositeCompartmentEditPart(view);

			case ProtocolStateMachineCompositeCompartmentEditPart.VISUAL_ID:
				return new ProtocolStateMachineCompositeCompartmentEditPart(view);

			case StateMachineCompositeCompartmentEditPart.VISUAL_ID:
				return new StateMachineCompositeCompartmentEditPart(view);

			case FunctionBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				return new FunctionBehaviorCompositeCompartmentEditPart(view);

			case OpaqueBehaviorCompositeCompartmentEditPart.VISUAL_ID:
				return new OpaqueBehaviorCompositeCompartmentEditPart(view);

			case ComponentCompositeCompartmentEditPart.VISUAL_ID:
				return new ComponentCompositeCompartmentEditPart(view);

			case DeviceCompositeCompartmentEditPart.VISUAL_ID:
				return new DeviceCompositeCompartmentEditPart(view);

			case ExecutionEnvironmentCompositeCompartmentEditPart.VISUAL_ID:
				return new ExecutionEnvironmentCompositeCompartmentEditPart(view);

			case NodeCompositeCompartmentEditPart.VISUAL_ID:
				return new NodeCompositeCompartmentEditPart(view);

			case ClassCompositeCompartmentEditPart.VISUAL_ID:
				return new ClassCompositeCompartmentEditPart(view);

			case CollaborationCompositeCompartmentEditPart.VISUAL_ID:
				return new CollaborationCompositeCompartmentEditPart(view);

			case PropertyPartCompartmentEditPartCN.VISUAL_ID:
				return new PropertyPartCompartmentEditPartCN(view);

			case BehaviorPortLinkEditPart.VISUAL_ID:
				return new BehaviorPortLinkEditPart(view);


			case LinkDescriptorEditPart.VISUAL_ID:
				return new LinkDescriptorEditPart(view);


			case CommentAnnotatedElementEditPart.VISUAL_ID:
				return new CommentAnnotatedElementEditPart(view);


			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return new ConstraintConstrainedElementEditPart(view);


			case ComponentRealizationEditPart.VISUAL_ID:
				return new ComponentRealizationEditPart(view);

			case ComponentRealizationNameEditPart.VISUAL_ID:
				return new ComponentRealizationNameEditPart(view);

			case ComponentRealizationAppliedStereotypeEditPart.VISUAL_ID:
				return new ComponentRealizationAppliedStereotypeEditPart(view);


			case InterfaceRealizationEditPart.VISUAL_ID:
				return new InterfaceRealizationEditPart(view);

			case InterfaceRealizationNameEditPart.VISUAL_ID:
				return new InterfaceRealizationNameEditPart(view);

			case InterfaceRealizationAppliedStereotypeEditPart.VISUAL_ID:
				return new InterfaceRealizationAppliedStereotypeEditPart(view);


			case SubstitutionEditPart.VISUAL_ID:
				return new SubstitutionEditPart(view);

			case SubstitutionNameEditPart.VISUAL_ID:
				return new SubstitutionNameEditPart(view);

			case SubstitutionAppliedStereotypeEditPart.VISUAL_ID:
				return new SubstitutionAppliedStereotypeEditPart(view);


			case RealizationEditPart.VISUAL_ID:
				return new RealizationEditPart(view);

			case RealizationNameEditPart.VISUAL_ID:
				return new RealizationNameEditPart(view);

			case RealizationAppliedStereotypeEditPart.VISUAL_ID:
				return new RealizationAppliedStereotypeEditPart(view);


			case ManifestationEditPart.VISUAL_ID:
				return new ManifestationEditPart(view);

			case ManifestationNameEditPart.VISUAL_ID:
				return new ManifestationNameEditPart(view);

			case ManifestationAppliedStereotypeEditPart.VISUAL_ID:
				return new ManifestationAppliedStereotypeEditPart(view);


			case AbstractionEditPart.VISUAL_ID:
				return new AbstractionEditPart(view);

			case AbstractionNameEditPart.VISUAL_ID:
				return new AbstractionNameEditPart(view);

			case AbstractionAppliedStereotypeEditPart.VISUAL_ID:
				return new AbstractionAppliedStereotypeEditPart(view);


			case UsageEditPart.VISUAL_ID:
				return new UsageEditPart(view);

			case UsageNameEditPart.VISUAL_ID:
				return new UsageNameEditPart(view);

			case UsageAppliedStereotypeEditPart.VISUAL_ID:
				return new UsageAppliedStereotypeEditPart(view);


			case DeploymentEditPart.VISUAL_ID:
				return new DeploymentEditPart(view);

			case DeploymentNameEditPart.VISUAL_ID:
				return new DeploymentNameEditPart(view);

			case DeploymentAppliedStereotypeEditPart.VISUAL_ID:
				return new DeploymentAppliedStereotypeEditPart(view);


			case RoleBindingEditPart.VISUAL_ID:
				return new RoleBindingEditPart(view);

			case RoleBindingRoleNameEditPart.VISUAL_ID:
				return new RoleBindingRoleNameEditPart(view);

			case RoleBindingAppliedStereotypeEditPart.VISUAL_ID:
				return new RoleBindingAppliedStereotypeEditPart(view);


			case DependencyEditPart.VISUAL_ID:
				return new DependencyEditPart(view);

			case DependencyNameEditPart.VISUAL_ID:
				return new DependencyNameEditPart(view);

			case DependencyAppliedStereotypeEditPart.VISUAL_ID:
				return new DependencyAppliedStereotypeEditPart(view);


			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorAppliedStereotypeEditPart.VISUAL_ID:
				return new ConnectorAppliedStereotypeEditPart(view);

			case ConnectorNameEditPart.VISUAL_ID:
				return new ConnectorNameEditPart(view);

			case ConnectorMultiplicitySourceEditPart.VISUAL_ID:
				return new ConnectorMultiplicitySourceEditPart(view);

			case ConnectorMultiplicityTargetEditPart.VISUAL_ID:
				return new ConnectorMultiplicityTargetEditPart(view);


			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case GeneralizationAppliedStereotypeEditPart.VISUAL_ID:
				return new GeneralizationAppliedStereotypeEditPart(view);


			case TimeObservationEventEditPart.VISUAL_ID:
				return new TimeObservationEventEditPart(view);


			case DurationObservationEventEditPart.VISUAL_ID:
				return new DurationObservationEventEditPart(view);


			case RepresentationEditPart.VISUAL_ID:
				return new RepresentationEditPart(view);

			case RepresentationTagLabelEditPart.VISUAL_ID:
				return new RepresentationTagLabelEditPart(view);


			case InformationFlowEditPart.VISUAL_ID:
				return new InformationFlowEditPart(view);

			case InformationFlowConveyedLabelEditPart.VISUAL_ID:
				return new InformationFlowConveyedLabelEditPart(view);

			case InformationFlowAppliedStereotypeEditPart.VISUAL_ID:
				return new InformationFlowAppliedStereotypeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof IMultilineEditableFigure) {
			return new MultilineCellEditorLocator(
					(IMultilineEditableFigure) source.getFigure());
		}
		else {
			return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);

		}
	}

	/**
	 * @generated
	 */
	static private class MultilineCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private IMultilineEditableFigure multilineEditableFigure;

		/**
		 * @generated
		 */
		public MultilineCellEditorLocator(IMultilineEditableFigure figure) {
			this.multilineEditableFigure = figure;
		}

		/**
		 * @generated
		 */
		public IMultilineEditableFigure getMultilineEditableFigure() {
			return multilineEditableFigure;
		}

		/**
		 * @generated
		 */
		@Override
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getMultilineEditableFigure().getBounds().getCopy();
			rect.x = getMultilineEditableFigure().getEditionLocation().x;
			rect.y = getMultilineEditableFigure().getEditionLocation().y;
			getMultilineEditableFigure().translateToAbsolute(rect);
			if (getMultilineEditableFigure().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
