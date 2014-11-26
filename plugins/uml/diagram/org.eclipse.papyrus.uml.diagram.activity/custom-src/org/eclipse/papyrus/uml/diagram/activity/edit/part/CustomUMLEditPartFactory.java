/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Arthur Daussy 	Bug 366026 - [ActivityDiagram] Refactoring in order to try respect Generation Gap Pattern
 *   				Bug 366159 - [ActivityDiagram] Activity Diagram should be able to handle correctly Interruptible Edge
 *   				Bug 367279 - [Activity Diagram] Activity Diagram should be able to handle correctly Exception Handler element
 *   				Bug 368932 - [ActivitiyDiagram] Prevent Compartment of Activity group to be selected
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomActivityPartitionActivityPartitionContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomConditionalNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomInterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomLoopNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomSequenceNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup.CustomStructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AcceptTimeEventActionAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityActivityContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPartCN;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityPartitionActivityPartitionContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AddVariableValueActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ConditionalNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowInterruptibleIconEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DestroyObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExceptionHandlerIconEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InterruptibleActivityRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.LoopNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowInterruptibleIconEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowSelectionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowTransformationEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadSelfActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadStructuralFeatureActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadVariableActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SendObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SequenceNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SequenceNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;

public class CustomUMLEditPartFactory extends UMLEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {
			case ControlFlowEditPart.VISUAL_ID:
				/*
				 * To implement InterruptibleEdge interface
				 */
				return new CustomControlFlowEditPart(view);
			case ObjectFlowSelectionEditPart.VISUAL_ID:
				/*
				 * Customization to handle special image label
				 */
				return new CustomObjectFlowSelectionEditPart(view);
			case ObjectFlowTransformationEditPart.VISUAL_ID:
				/*
				 * Customization to handle special image label
				 */
				return new CustomObjectFlowTransformationEditPart(view);
			case ControlFlowInterruptibleIconEditPart.VISUAL_ID:
				/*
				 * Customization to handle special image label
				 */
				return new CustomControlFlowInterruptibleIconEditPart(view);
			case ObjectFlowEditPart.VISUAL_ID:
				/*
				 * To implement InterruptibleEdge interface
				 */
				return new CustomObjectFlowEditPart(view);
			case ObjectFlowInterruptibleIconEditPart.VISUAL_ID:
				/*
				 * Customization to handle special image label
				 */
				return new CustomObjectFlowInterruptibleIconEditPart(view);
			case ExceptionHandlerIconEditPart.VISUAL_ID:
				/*
				 * Customization to handle special image label
				 */
				return new CustomExceptionHandlerIconEditPart(view);
			case ActivityPartitionActivityPartitionContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomActivityPartitionActivityPartitionContentCompartmentEditPart(view);
			case StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomStructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case ExpansionRegionStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart(view);
			case LoopNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomLoopNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case SequenceNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomSequenceNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case ConditionalNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomConditionalNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomInterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart(view);
			case ActivityActivityContentCompartmentEditPart.VISUAL_ID:
				/*
				 * Customization in order to make this compartment not selectable
				 * Custom figure
				 */
				return new CustomActivityActivityContentCompartmentEditPart(view);
			case AcceptEventActionEditPart.VISUAL_ID:
				return new CustomAcceptEventActionEditPart(view);
			case AcceptTimeEventActionAppliedStereotypeEditPart.VISUAL_ID:
				return new CustomAcceptTimeEventActionAppliedStereotypeEditPart(view);
			case ActivityPartitionEditPart.VISUAL_ID:
				return new CustomActivityPartitionEditPart(view);
			case BroadcastSignalActionEditPart.VISUAL_ID:
				return new CustomBroadcastSignalActionEditPart(view);
			case AddVariableValueActionEditPart.VISUAL_ID:
				return new CustomAddVariableValueActionEditPart(view);
			case InterruptibleActivityRegionEditPart.VISUAL_ID:
				return new CustomInterruptibleActivityRegionEditPart(view);
			case ExpansionRegionEditPart.VISUAL_ID:
				return new CustomExpansionRegionEditPart(view);
			case ConditionalNodeEditPart.VISUAL_ID:
				return new CustomConditionalNodeEditPart(view);
			case LoopNodeEditPart.VISUAL_ID:
				return new CustomLoopNodeEditPart(view);
			case SequenceNodeEditPart.VISUAL_ID:
				return new CustomSequenceNodeEditPart(view);
			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new CustomStructuredActivityNodeEditPart(view);
			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CustomCallBehaviorActionEditPart(view);
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new CustomAddStructuralFeatureValueActionEditPart(view);
			case CallOperationActionEditPart.VISUAL_ID:
				return new CustomCallOperationActionEditPart(view);
			case CreateObjectActionEditPart.VISUAL_ID:
				return new CustomCreateObjectActionEditPart(view);
			case DestroyObjectActionEditPart.VISUAL_ID:
				return new CustomDestroyObjectActionEditPart(view);
			case OpaqueActionEditPart.VISUAL_ID:
				return new CustomOpaqueActionEditPart(view);
			case ReadSelfActionEditPart.VISUAL_ID:
				return new CustomReadSelfActionEditPart(view);
			case ReadStructuralFeatureActionEditPart.VISUAL_ID:
				return new CustomReadStructuralFeatureActionEditPart(view);
			case ReadVariableActionEditPart.VISUAL_ID:
				return new CustomReadVariableActionEditPart(view);
			case SendObjectActionEditPart.VISUAL_ID:
				return new CustomSendObjectActionEditPart(view);
			case ValueSpecificationActionEditPart.VISUAL_ID:
				return new CustomValueSpecificationActionEditPart(view);
			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CustomCentralBufferNodeEditPart(view);
			case DataStoreNodeEditPart.VISUAL_ID:
				return new CustomDataStoreNodeEditPart(view);
			case ActivityParameterNodeEditPart.VISUAL_ID:
				return new CustomActivityParameterNodeEditPart(view);
			case ActivityEditPart.VISUAL_ID:
				return new CustomActivityEditPart(view);
			case ActivityEditPartCN.VISUAL_ID:
				return new CustomActivityEditPartCN(view);
			case SendSignalActionEditPart.VISUAL_ID:
				return new CustomSendSignalActionEditPart(view);
			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new CustomActivityFinalNodeEditPart(view);
			case DecisionNodeEditPart.VISUAL_ID:
				return new CustomDecisionNodeEditPart(view);
			case InitialNodeEditPart.VISUAL_ID:
				return new CustomInitialNodeEditPart(view);
			case FlowFinalNodeEditPart.VISUAL_ID:
				return new CustomFlowFinalNodeEditPart(view);
			case MergeNodeEditPart.VISUAL_ID:
				return new CustomMergeNodeEditPart(view);
			case ForkNodeEditPart.VISUAL_ID:
				return new CustomForkNodeEditPart(view);
			case JoinNodeEditPart.VISUAL_ID:
				return new CustomJoinNodeEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
