/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.LabelCellEditorLocator;
import org.eclipse.gmf.tooling.runtime.directedit.locator.TextCellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IMultilineEditableFigure;
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
			case ActivityDiagramEditPart.VISUAL_ID:
				return new ActivityDiagramEditPart(view);
			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);
			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);
			case ActivityIsSingleExecutionEditPart.VISUAL_ID:
				return new ActivityIsSingleExecutionEditPart(view);
			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);
			case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
				return new ConstraintInActivityAsPrecondEditPart(view);
			case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
				return new ConstraintInActivityAsPostcondEditPart(view);
			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);
			case InitialNodeFloatingNameEditPart.VISUAL_ID:
				return new InitialNodeFloatingNameEditPart(view);
			case InitialNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new InitialNodeAppliedStereotypeEditPart(view);
			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new ActivityFinalNodeEditPart(view);
			case ActivityFinalNodeFloatingNameEditPart.VISUAL_ID:
				return new ActivityFinalNodeFloatingNameEditPart(view);
			case ActivityFinalNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new ActivityFinalNodeAppliedStereotypeEditPart(view);
			case FlowFinalNodeEditPart.VISUAL_ID:
				return new FlowFinalNodeEditPart(view);
			case FlowFinalNodeFloatingNameEditPart.VISUAL_ID:
				return new FlowFinalNodeFloatingNameEditPart(view);
			case FlowFinalNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new FlowFinalNodeAppliedStereotypeEditPart(view);
			case OpaqueActionEditPart.VISUAL_ID:
				return new OpaqueActionEditPart(view);
			case OpaqueActionNameEditPart.VISUAL_ID:
				return new OpaqueActionNameEditPart(view);
			case OpaqueActionFloatingNameEditPart.VISUAL_ID:
				return new OpaqueActionFloatingNameEditPart(view);
			case ValuePinInOpaqueActEditPart.VISUAL_ID:
				return new ValuePinInOpaqueActEditPart(view);
			case ValuePinInOActLabelEditPart.VISUAL_ID:
				return new ValuePinInOActLabelEditPart(view);
			case ValuePinInOActValueEditPart.VISUAL_ID:
				return new ValuePinInOActValueEditPart(view);
			case ValuePinInOActAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInOActAppliedStereotypeEditPart(view);
			case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
				return new ActionInputPinInOpaqueActEditPart(view);
			case ActionInputPinInOActLabelEditPart.VISUAL_ID:
				return new ActionInputPinInOActLabelEditPart(view);
			case ActionInputPinInOActValueEditPart.VISUAL_ID:
				return new ActionInputPinInOActValueEditPart(view);
			case ActionInputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInOActAppliedStereotypeEditPart(view);
			case InputPinInOpaqueActEditPart.VISUAL_ID:
				return new InputPinInOpaqueActEditPart(view);
			case InputPinInOActLabelEditPart.VISUAL_ID:
				return new InputPinInOActLabelEditPart(view);
			case InputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInOActAppliedStereotypeEditPart(view);
			case OutputPinInOpaqueActEditPart.VISUAL_ID:
				return new OutputPinInOpaqueActEditPart(view);
			case OutputPinInOActLabelEditPart.VISUAL_ID:
				return new OutputPinInOActLabelEditPart(view);
			case OutputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInOActAppliedStereotypeEditPart(view);
			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CallBehaviorActionEditPart(view);
			case CallBehaviorActionNameEditPart.VISUAL_ID:
				return new CallBehaviorActionNameEditPart(view);
			case CallBehaviorActionFloatingNameEditPart.VISUAL_ID:
				return new CallBehaviorActionFloatingNameEditPart(view);
			case ValuePinInCallBeActEditPart.VISUAL_ID:
				return new ValuePinInCallBeActEditPart(view);
			case ValuePinInCBActLabelEditPart.VISUAL_ID:
				return new ValuePinInCBActLabelEditPart(view);
			case ValuePinInCBActValueEditPart.VISUAL_ID:
				return new ValuePinInCBActValueEditPart(view);
			case ValuePinInCBActAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInCBActAppliedStereotypeEditPart(view);
			case ActionInputPinInCallBeActEditPart.VISUAL_ID:
				return new ActionInputPinInCallBeActEditPart(view);
			case ActionInputPinInCBActLabelEditPart.VISUAL_ID:
				return new ActionInputPinInCBActLabelEditPart(view);
			case ActionInputPinInCBActValueEditPart.VISUAL_ID:
				return new ActionInputPinInCBActValueEditPart(view);
			case ActionInputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInCBActAppliedStereotypeEditPart(view);
			case InputPinInCallBeActEditPart.VISUAL_ID:
				return new InputPinInCallBeActEditPart(view);
			case InputPinInCBActLabelEditPart.VISUAL_ID:
				return new InputPinInCBActLabelEditPart(view);
			case InputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInCBActAppliedStereotypeEditPart(view);
			case OutputPinInCallBeActEditPart.VISUAL_ID:
				return new OutputPinInCallBeActEditPart(view);
			case OutputPinInCBActLabelEditPart.VISUAL_ID:
				return new OutputPinInCBActLabelEditPart(view);
			case OutputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInCBActAppliedStereotypeEditPart(view);
			case CallOperationActionEditPart.VISUAL_ID:
				return new CallOperationActionEditPart(view);
			case CallOperationActionNameEditPart.VISUAL_ID:
				return new CallOperationActionNameEditPart(view);
			case CallOperationActionFloatingNameEditPart.VISUAL_ID:
				return new CallOperationActionFloatingNameEditPart(view);
			case ActionInputPinInCallOpActEditPart.VISUAL_ID:
				return new ActionInputPinInCallOpActEditPart(view);
			case ActionInputPinInCOActLabelEditPart.VISUAL_ID:
				return new ActionInputPinInCOActLabelEditPart(view);
			case ActionInputPinInCOActValueEditPart.VISUAL_ID:
				return new ActionInputPinInCOActValueEditPart(view);
			case ActionInputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInCOActAppliedStereotypeEditPart(view);
			case ValuePinInCallOpActEditPart.VISUAL_ID:
				return new ValuePinInCallOpActEditPart(view);
			case ValuePinInCOActLabelEditPart.VISUAL_ID:
				return new ValuePinInCOActLabelEditPart(view);
			case ValuePinInCOActValueEditPart.VISUAL_ID:
				return new ValuePinInCOActValueEditPart(view);
			case ValuePinInCOActAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInCOActAppliedStereotypeEditPart(view);
			case InputPinInCallOpActEditPart.VISUAL_ID:
				return new InputPinInCallOpActEditPart(view);
			case InputPinInCOActLabelEditPart.VISUAL_ID:
				return new InputPinInCOActLabelEditPart(view);
			case InputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInCOActAppliedStereotypeEditPart(view);
			case OutputPinInCallOpActEditPart.VISUAL_ID:
				return new OutputPinInCallOpActEditPart(view);
			case OutputPinInCOActLabelEditPart.VISUAL_ID:
				return new OutputPinInCOActLabelEditPart(view);
			case OutputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInCOActAppliedStereotypeEditPart(view);
			case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
				return new ValuePinInCallOpActAsTargetEditPart(view);
			case ValuePinInCOActAsTargetLabelEditPart.VISUAL_ID:
				return new ValuePinInCOActAsTargetLabelEditPart(view);
			case ValuePinInCOActAsTargetValueEditPart.VISUAL_ID:
				return new ValuePinInCOActAsTargetValueEditPart(view);
			case ValuePinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInCOActAsTargetAppliedStereotypeEditPart(view);
			case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
				return new ActionInputPinInCallOpActAsTargetEditPart(view);
			case ActionInputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
				return new ActionInputPinInCOActAsTargetLabelEditPart(view);
			case ActionInputPinInCOActAsTargetValueEditPart.VISUAL_ID:
				return new ActionInputPinInCOActAsTargetValueEditPart(view);
			case ActionInputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInCOActAsTargetAppliedStereotypeEditPart(view);
			case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
				return new InputPinInCallOpActAsTargetEditPart(view);
			case InputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
				return new InputPinInCOActAsTargetLabelEditPart(view);
			case InputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInCOActAsTargetAppliedStereotypeEditPart(view);
			case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPrecondEditPart(view);
			case DurationConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPrecondNameEditPart(view);
			case DurationConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPrecondBodyEditPart(view);
			case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPostcondEditPart(view);
			case DurationConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPostcondNameEditPart(view);
			case DurationConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
				return new DurationConstraintAsLocalPostcondBodyEditPart(view);
			case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPrecondEditPart(view);
			case TimeConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPrecondNameEditPart(view);
			case TimeConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPrecondBodyEditPart(view);
			case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPostcondEditPart(view);
			case TimeConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPostcondNameEditPart(view);
			case TimeConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
				return new TimeConstraintAsLocalPostcondBodyEditPart(view);
			case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPrecondEditPart(view);
			case IntervalConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPrecondNameEditPart(view);
			case IntervalConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPrecondBodyEditPart(view);
			case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPostcondEditPart(view);
			case IntervalConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPostcondNameEditPart(view);
			case IntervalConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
				return new IntervalConstraintAsLocalPostcondBodyEditPart(view);
			case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
				return new ConstraintAsLocalPrecondEditPart(view);
			case ConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
				return new ConstraintAsLocalPrecondNameEditPart(view);
			case ConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
				return new ConstraintAsLocalPrecondBodyEditPart(view);
			case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
				return new ConstraintAsLocalPostcondEditPart(view);
			case ConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
				return new ConstraintAsLocalPostcondNameEditPart(view);
			case ConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
				return new ConstraintAsLocalPostcondBodyEditPart(view);
			case DecisionNodeEditPart.VISUAL_ID:
				return new DecisionNodeEditPart(view);
			case DecisionNodeFloatingNameEditPart.VISUAL_ID:
				return new DecisionNodeFloatingNameEditPart(view);
			case DecisionInputEditPart.VISUAL_ID:
				return new DecisionInputEditPart(view);
			case DecisionNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new DecisionNodeAppliedStereotypeEditPart(view);
			case MergeNodeEditPart.VISUAL_ID:
				return new MergeNodeEditPart(view);
			case MergeNodeFloatingNameEditPart.VISUAL_ID:
				return new MergeNodeFloatingNameEditPart(view);
			case MergeNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new MergeNodeAppliedStereotypeEditPart(view);
			case ForkNodeEditPart.VISUAL_ID:
				return new ForkNodeEditPart(view);
			case ForkNodeFloatingNameEditPart.VISUAL_ID:
				return new ForkNodeFloatingNameEditPart(view);
			case ForkNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new ForkNodeAppliedStereotypeEditPart(view);
			case JoinNodeEditPart.VISUAL_ID:
				return new JoinNodeEditPart(view);
			case JoinNodeFloatingNameEditPart.VISUAL_ID:
				return new JoinNodeFloatingNameEditPart(view);
			case JoinSpecEditPart.VISUAL_ID:
				return new JoinSpecEditPart(view);
			case JoinNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new JoinNodeAppliedStereotypeEditPart(view);
			case DataStoreNodeEditPart.VISUAL_ID:
				return new DataStoreNodeEditPart(view);
			case DataStoreNodeLabelEditPart.VISUAL_ID:
				return new DataStoreNodeLabelEditPart(view);
			case DataStoreSelectionEditPart.VISUAL_ID:
				return new DataStoreSelectionEditPart(view);
			case DataStoreNodeFloatingNameEditPart.VISUAL_ID:
				return new DataStoreNodeFloatingNameEditPart(view);
			case SendObjectActionEditPart.VISUAL_ID:
				return new SendObjectActionEditPart(view);
			case SendObjectActionNameEditPart.VISUAL_ID:
				return new SendObjectActionNameEditPart(view);
			case SendObjectActionFloatingNameEditPart.VISUAL_ID:
				return new SendObjectActionFloatingNameEditPart(view);
			case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsReqEditPart(view);
			case ValuePinInSendObjActAsReqLabelEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsReqLabelEditPart(view);
			case ValuePinInSendObjActAsReqValueEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsReqValueEditPart(view);
			case ValuePinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsReqAppliedStereotypeEditPart(view);
			case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsReqEditPart(view);
			case ActionInputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsReqLabelEditPart(view);
			case ActionInputPinInSendObjActAsReqValueEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsReqValueEditPart(view);
			case ActionInputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsReqAppliedStereotypeEditPart(view);
			case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsReqEditPart(view);
			case InputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsReqLabelEditPart(view);
			case InputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsReqAppliedStereotypeEditPart(view);
			case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsTargetEditPart(view);
			case ValuePinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsTargetLabelEditPart(view);
			case ValuePinInSendObjActAsTargetValueEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsTargetValueEditPart(view);
			case ValuePinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInSendObjActAsTargetAppliedStereotypeEditPart(view);
			case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsTargetEditPart(view);
			case ActionInputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsTargetLabelEditPart(view);
			case ActionInputPinInSendObjActAsTargetValueEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsTargetValueEditPart(view);
			case ActionInputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInSendObjActAsTargetAppliedStereotypeEditPart(view);
			case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsTargetEditPart(view);
			case InputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsTargetLabelEditPart(view);
			case InputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInSendObjActAsTargetAppliedStereotypeEditPart(view);
			case SendSignalActionEditPart.VISUAL_ID:
				return new SendSignalActionEditPart(view);
			case SendSignalActionNameEditPart.VISUAL_ID:
				return new SendSignalActionNameEditPart(view);
			case SendSignalActionFloatingNameEditPart.VISUAL_ID:
				return new SendSignalActionFloatingNameEditPart(view);
			case ActionInputPinInSendSigActEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActEditPart(view);
			case ActionInputPinInSendSigActLabelEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActLabelEditPart(view);
			case ActionInputPinInSendSigActValueEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActValueEditPart(view);
			case ActionInputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActAppliedStereotypeEditPart(view);
			case ValuePinInSendSigActEditPart.VISUAL_ID:
				return new ValuePinInSendSigActEditPart(view);
			case ValuePinInSendSigActLabelEditPart.VISUAL_ID:
				return new ValuePinInSendSigActLabelEditPart(view);
			case ValuePinInSendSigActValueEditPart.VISUAL_ID:
				return new ValuePinInSendSigActValueEditPart(view);
			case ValuePinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInSendSigActAppliedStereotypeEditPart(view);
			case InputPinInSendSigActEditPart.VISUAL_ID:
				return new InputPinInSendSigActEditPart(view);
			case InputPinInSendSigActLabelEditPart.VISUAL_ID:
				return new InputPinInSendSigActLabelEditPart(view);
			case InputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInSendSigActAppliedStereotypeEditPart(view);
			case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
				return new ValuePinInSendSigActAsTargetEditPart(view);
			case ValuePinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
				return new ValuePinInSendSigActAsTargetLabelEditPart(view);
			case ValuePinInSendSigActAsTargetValueEditPart.VISUAL_ID:
				return new ValuePinInSendSigActAsTargetValueEditPart(view);
			case ValuePinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ValuePinInSendSigActAsTargetAppliedStereotypeEditPart(view);
			case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActAsTargetEditPart(view);
			case ActionInputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActAsTargetLabelEditPart(view);
			case ActionInputPinInSendSigActAsTargetValueEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActAsTargetValueEditPart(view);
			case ActionInputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInSendSigActAsTargetAppliedStereotypeEditPart(view);
			case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
				return new InputPinInSendSigActAsTargetEditPart(view);
			case InputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
				return new InputPinInSendSigActAsTargetLabelEditPart(view);
			case InputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInSendSigActAsTargetAppliedStereotypeEditPart(view);
			case ActivityParameterNodeEditPart.VISUAL_ID:
				return new ActivityParameterNodeEditPart(view);
			case ParameterNodeNameEditPart.VISUAL_ID:
				return new ParameterNodeNameEditPart(view);
			case AcceptEventActionEditPart.VISUAL_ID:
				return new AcceptEventActionEditPart(view);
			case AcceptEventActionLabelEditPart.VISUAL_ID:
				return new AcceptEventActionLabelEditPart(view);
			case AcceptTimeEventActionLabelEditPart.VISUAL_ID:
				return new AcceptTimeEventActionLabelEditPart(view);
			case AcceptTimeEventActionAppliedStereotypeEditPart.VISUAL_ID:
				return new AcceptTimeEventActionAppliedStereotypeEditPart(view);
			case AcceptEventActionFloatingNameEditPart.VISUAL_ID:
				return new AcceptEventActionFloatingNameEditPart(view);
			case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
				return new OutputPinInAcceptEventActionEditPart(view);
			case OutputPinInAcceptEventActionLabelEditPart.VISUAL_ID:
				return new OutputPinInAcceptEventActionLabelEditPart(view);
			case OutputPinInAcceptEventActionAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInAcceptEventActionAppliedStereotypeEditPart(view);
			case ValueSpecificationActionEditPart.VISUAL_ID:
				return new ValueSpecificationActionEditPart(view);
			case ValueSpecificationActionNameEditPart.VISUAL_ID:
				return new ValueSpecificationActionNameEditPart(view);
			case ValueSpecificationActionFloatingNameEditPart.VISUAL_ID:
				return new ValueSpecificationActionFloatingNameEditPart(view);
			case OutputPinInValSpecActEditPart.VISUAL_ID:
				return new OutputPinInValSpecActEditPart(view);
			case OutputPinInValSpecActLabelEditPart.VISUAL_ID:
				return new OutputPinInValSpecActLabelEditPart(view);
			case OutputPinInValSpecActAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInValSpecActAppliedStereotypeEditPart(view);
			case ConditionalNodeEditPart.VISUAL_ID:
				return new ConditionalNodeEditPart(view);
			case ConditionalNodeKeywordEditPart.VISUAL_ID:
				return new ConditionalNodeKeywordEditPart(view);
			case ExpansionRegionEditPart.VISUAL_ID:
				return new ExpansionRegionEditPart(view);
			case ExpansionRegionKeywordEditPart.VISUAL_ID:
				return new ExpansionRegionKeywordEditPart(view);
			case ExpansionNodeAsInEditPart.VISUAL_ID:
				return new ExpansionNodeAsInEditPart(view);
			case ExpansionNodeAsOutEditPart.VISUAL_ID:
				return new ExpansionNodeAsOutEditPart(view);
			case LoopNodeEditPart.VISUAL_ID:
				return new LoopNodeEditPart(view);
			case LoopNodeKeywordEditPart.VISUAL_ID:
				return new LoopNodeKeywordEditPart(view);
			case OutputPinInLoopNodeAsBodyOutputEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsBodyOutputEditPart(view);
			case OutputPinInLoopNodeAsBodyOutputLabelEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsBodyOutputLabelEditPart(view);
			case OutputPinInLoopNodeAsBodyOutputAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsBodyOutputAppliedStereotypeEditPart(view);
			case OutputPinInLoopNodeAsLoopVariableEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsLoopVariableEditPart(view);
			case OutputPinInLoopNodeAsLoopVariableLabelEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsLoopVariableLabelEditPart(view);
			case OutputPinInLoopNodeAsLoopVariableAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsLoopVariableAppliedStereotypeEditPart(view);
			case OutputPinInLoopNodeAsResultEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsResultEditPart(view);
			case OutputPinInLoopNodeAsResultLabelEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsResultLabelEditPart(view);
			case OutputPinInLoopNodeAsResultAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInLoopNodeAsResultAppliedStereotypeEditPart(view);
			case SequenceNodeEditPart.VISUAL_ID:
				return new SequenceNodeEditPart(view);
			case SequenceNodeKeywordEditPart.VISUAL_ID:
				return new SequenceNodeKeywordEditPart(view);
			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new StructuredActivityNodeEditPart(view);
			case StructuredActivityNodeKeywordEditPart.VISUAL_ID:
				return new StructuredActivityNodeKeywordEditPart(view);
			case InputPinInLoopNodeAsVariableEditPart.VISUAL_ID:
				return new InputPinInLoopNodeAsVariableEditPart(view);
			case InputPinInLoopNodeAsVariableLabelEditPart.VISUAL_ID:
				return new InputPinInLoopNodeAsVariableLabelEditPart(view);
			case InputPinInStructuredActivityNodeAppliedStereotypeEditPart.VISUAL_ID:
				return new InputPinInStructuredActivityNodeAppliedStereotypeEditPart(view);
			case ActivityPartitionEditPart.VISUAL_ID:
				return new ActivityPartitionEditPart(view);
			case ActivityPartitionNameEditPart.VISUAL_ID:
				return new ActivityPartitionNameEditPart(view);
			case ActivityPartitionFloatingNameEditPart.VISUAL_ID:
				return new ActivityPartitionFloatingNameEditPart(view);
			case InterruptibleActivityRegionEditPart.VISUAL_ID:
				return new InterruptibleActivityRegionEditPart(view);
			case CommentEditPartCN.VISUAL_ID:
				return new CommentEditPartCN(view);
			case CommentBodyLabelEditPart.VISUAL_ID:
				return new CommentBodyLabelEditPart(view);
			case ReadSelfActionEditPart.VISUAL_ID:
				return new ReadSelfActionEditPart(view);
			case ReadSelfActionNameEditPart.VISUAL_ID:
				return new ReadSelfActionNameEditPart(view);
			case ReadSelfActionFloatingNameEditPart.VISUAL_ID:
				return new ReadSelfActionFloatingNameEditPart(view);
			case ReadSelfActionOutputPinEditPart.VISUAL_ID:
				return new ReadSelfActionOutputPinEditPart(view);
			case OutputPinInReadSelfActionLabelEditPart.VISUAL_ID:
				return new OutputPinInReadSelfActionLabelEditPart(view);
			case OutputPinInReadSelfActionAppliedStereotypeEditPart.VISUAL_ID:
				return new OutputPinInReadSelfActionAppliedStereotypeEditPart(view);
			case ActivityEditPartCN.VISUAL_ID:
				return new ActivityEditPartCN(view);
			case ActivityNameEditPartCN.VISUAL_ID:
				return new ActivityNameEditPartCN(view);
			case ActivityIsSingleExecutionCNEditPart.VISUAL_ID:
				return new ActivityIsSingleExecutionCNEditPart(view);
			case CreateObjectActionEditPart.VISUAL_ID:
				return new CreateObjectActionEditPart(view);
			case CreateObjectActionNameEditPart.VISUAL_ID:
				return new CreateObjectActionNameEditPart(view);
			case CreateObjectActionFloatingNameEditPart.VISUAL_ID:
				return new CreateObjectActionFloatingNameEditPart(view);
			case OutputPinInCreateObjectActionAsResultEditPart.VISUAL_ID:
				return new OutputPinInCreateObjectActionAsResultEditPart(view);
			case OutputPinInCreateObjectActionAsResultLabelEditPart.VISUAL_ID:
				return new OutputPinInCreateObjectActionAsResultLabelEditPart(view);
			case OutputPinInCreateObjectActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new OutputPinInCreateObjectActionAsResultAppliedStereotypeWrappingLabelEditPart(view);
			case ShapeNamedElementEditPart.VISUAL_ID:
				return new ShapeNamedElementEditPart(view);
			case ShapeNamedElementNameEditPart.VISUAL_ID:
				return new ShapeNamedElementNameEditPart(view);
			case ReadStructuralFeatureActionEditPart.VISUAL_ID:
				return new ReadStructuralFeatureActionEditPart(view);
			case ReadStructuralFeatureActionNameEditPart.VISUAL_ID:
				return new ReadStructuralFeatureActionNameEditPart(view);
			case ReadStructuralFeatureActionFloatingNameEditPart.VISUAL_ID:
				return new ReadStructuralFeatureActionFloatingNameEditPart(view);
			case InputPinInReadStructuralFeatureAsObjectEditPart.VISUAL_ID:
				return new InputPinInReadStructuralFeatureAsObjectEditPart(view);
			case InputPinInReadStructuralFeatureAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInReadStructuralFeatureAsObjectLabelEditPart(view);
			case InputPinInReadStructuralFeatureAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInReadStructuralFeatureAsObjectAppliedStereotypeWrappingLabelEditPart(view);
			case OutputPinInReadStructuralFeatureAsResultEditPart.VISUAL_ID:
				return new OutputPinInReadStructuralFeatureAsResultEditPart(view);
			case OutputPinInReadStructuralFeatureAsResultLabelEditPart.VISUAL_ID:
				return new OutputPinInReadStructuralFeatureAsResultLabelEditPart(view);
			case InputPinInReadStructuralFeatureAsResultWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInReadStructuralFeatureAsResultWrappingLabelEditPart(view);
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionEditPart(view);
			case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionNameEditPart(view);
			case AddStructuralFeatureValueActionFloatingNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionFloatingNameEditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsObjectEditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsObjectLabelEditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsObjectAppliedStereotypeWrappingLabelEditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsValueEditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsValueEditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsValueLabel2EditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsValueLabel2EditPart(view);
			case InputPinInAddStructuralFeatureValueActionAsValueAppliedStereotypeWrappingLabel2EditPart.VISUAL_ID:
				return new InputPinInAddStructuralFeatureValueActionAsValueAppliedStereotypeWrappingLabel2EditPart(view);
			case OutputPinInAddStructuralFeatureValueActionAsResultEditPart.VISUAL_ID:
				return new OutputPinInAddStructuralFeatureValueActionAsResultEditPart(view);
			case OutputPinInAddStructuralFeatureValueActionAsResultLabel3EditPart.VISUAL_ID:
				return new OutputPinInAddStructuralFeatureValueActionAsResultLabel3EditPart(view);
			case OutputPinInAddStructuralFeatureValueActionAsResultAppliedStereotypeWrappingLabel3EditPart.VISUAL_ID:
				return new OutputPinInAddStructuralFeatureValueActionAsResultAppliedStereotypeWrappingLabel3EditPart(view);
			case DestroyObjectActionEditPart.VISUAL_ID:
				return new DestroyObjectActionEditPart(view);
			case DestroyObjectActionNameEditPart.VISUAL_ID:
				return new DestroyObjectActionNameEditPart(view);
			case DestroyObjectActionFloatingNameEditPart.VISUAL_ID:
				return new DestroyObjectActionFloatingNameEditPart(view);
			case InputPinInDestroyObjectActionEditPart.VISUAL_ID:
				return new InputPinInDestroyObjectActionEditPart(view);
			case InputPinInDestroyObjectActionLabelEditPart.VISUAL_ID:
				return new InputPinInDestroyObjectActionLabelEditPart(view);
			case InputPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart(view);
			case ValuePinInDestroyObjectActionEditPart.VISUAL_ID:
				return new ValuePinInDestroyObjectActionEditPart(view);
			case ValuePinInDestroyObjectActionLabelEditPart.VISUAL_ID:
				return new ValuePinInDestroyObjectActionLabelEditPart(view);
			case ValuePinInDestroyObjectActionValueEditPart.VISUAL_ID:
				return new ValuePinInDestroyObjectActionValueEditPart(view);
			case ValuePinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ValuePinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart(view);
			case ActionPinInDestroyObjectActionEditPart.VISUAL_ID:
				return new ActionPinInDestroyObjectActionEditPart(view);
			case ActionPinInDestroyObjectActionLabelEditPart.VISUAL_ID:
				return new ActionPinInDestroyObjectActionLabelEditPart(view);
			case ActionPinInDestroyObjectActionValueEditPart.VISUAL_ID:
				return new ActionPinInDestroyObjectActionValueEditPart(view);
			case ActionPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ActionPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart(view);
			case ReadVariableActionEditPart.VISUAL_ID:
				return new ReadVariableActionEditPart(view);
			case ReadVariableActionNameEditPart.VISUAL_ID:
				return new ReadVariableActionNameEditPart(view);
			case ReadVariableActionFloatingNameEditPart.VISUAL_ID:
				return new ReadVariableActionFloatingNameEditPart(view);
			case OutputPinInReadVariableActionAsResultEditPart.VISUAL_ID:
				return new OutputPinInReadVariableActionAsResultEditPart(view);
			case OutputPinInReadVariableActionAsResultLabelEditPart.VISUAL_ID:
				return new OutputPinInReadVariableActionAsResultLabelEditPart(view);
			case OutputPinInReadVariableActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new OutputPinInReadVariableActionAsResultAppliedStereotypeWrappingLabelEditPart(view);
			case AddVariableValueActionEditPart.VISUAL_ID:
				return new AddVariableValueActionEditPart(view);
			case AddVariableValueActionNameEditPart.VISUAL_ID:
				return new AddVariableValueActionNameEditPart(view);
			case AddVariableValueActionFloatingNameEditPart.VISUAL_ID:
				return new AddVariableValueActionFloatingNameEditPart(view);
			case InputPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsInsertAtEditPart(view);
			case InputPinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsInsertAtLabelEditPart(view);
			case InputPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart(view);
			case InputPinInAddVariableValueActionAsValueEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsValueEditPart(view);
			case InputPinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsValueLabelEditPart(view);
			case InputPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart(view);
			case ValuePinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsInsertAtEditPart(view);
			case ValuePinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsInsertAtLabelEditPart(view);
			case ValuePinInAddVariableValueActionAsInsertAtValueEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsInsertAtValueEditPart(view);
			case ValuePinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart(view);
			case ValuePinInAddVariableValueActionAsValueEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsValueEditPart(view);
			case ValuePinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsValueLabelEditPart(view);
			case ValuePinInAddVariableValueActionAsValueValueEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsValueValueEditPart(view);
			case ValuePinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ValuePinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart(view);
			case ActionPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsInsertAtEditPart(view);
			case ActionPinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsInsertAtLabelEditPart(view);
			case ActionPinInAddVariableValueActionAsInsertAtValueEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsInsertAtValueEditPart(view);
			case ActionPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart(view);
			case ActionPinInAddVariableValueActionAsValueEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsValueEditPart(view);
			case ActionPinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsValueLabelEditPart(view);
			case ActionPinInAddVariableValueActionAsValueValueEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsValueValueEditPart(view);
			case ActionPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ActionPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart(view);
			case BroadcastSignalActionEditPart.VISUAL_ID:
				return new BroadcastSignalActionEditPart(view);
			case BroadcastSignalActionNameEditPart.VISUAL_ID:
				return new BroadcastSignalActionNameEditPart(view);
			case BroadcastSignalActionFloatingNameEditPart.VISUAL_ID:
				return new BroadcastSignalActionFloatingNameEditPart(view);
			case InputPinInBroadcastSignalActionEditPart.VISUAL_ID:
				return new InputPinInBroadcastSignalActionEditPart(view);
			case InputPinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
				return new InputPinInBroadcastSignalActionLabelEditPart(view);
			case InputPinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
				return new InputPinInBroadcastSignalActionValueLabelEditPart(view);
			case InputPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new InputPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart(view);
			case ValuePinInBroadcastSignalActionEditPart.VISUAL_ID:
				return new ValuePinInBroadcastSignalActionEditPart(view);
			case ValuePinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
				return new ValuePinInBroadcastSignalActionLabelEditPart(view);
			case ValuePinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
				return new ValuePinInBroadcastSignalActionValueLabelEditPart(view);
			case ValuePinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ValuePinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart(view);
			case ActionPinInBroadcastSignalActionEditPart.VISUAL_ID:
				return new ActionPinInBroadcastSignalActionEditPart(view);
			case ActionPinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
				return new ActionPinInBroadcastSignalActionLabelEditPart(view);
			case ActionPinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
				return new ActionPinInBroadcastSignalActionValueLabelEditPart(view);
			case ActionPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
				return new ActionPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart(view);
			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CentralBufferNodeEditPart(view);
			case CentralBufferNodeLabelEditPart.VISUAL_ID:
				return new CentralBufferNodeLabelEditPart(view);
			case CentralBufferNodeSelectionEditPart.VISUAL_ID:
				return new CentralBufferNodeSelectionEditPart(view);
			case CentralBufferNodeFloatingNameEditPart.VISUAL_ID:
				return new CentralBufferNodeFloatingNameEditPart(view);
			case ConstraintEditPartCN.VISUAL_ID:
				return new ConstraintEditPartCN(view);
			case ConstraintNameEditPartCN.VISUAL_ID:
				return new ConstraintNameEditPartCN(view);
			case ConstraintBodyEditPartCN.VISUAL_ID:
				return new ConstraintBodyEditPartCN(view);
			case StartObjectBehavoiurActionEditPart.VISUAL_ID:
				return new StartObjectBehavoiurActionEditPart(view);
			case StartObjectBehaviorActionNameEditPart.VISUAL_ID:
				return new StartObjectBehaviorActionNameEditPart(view);
			case StartObjectBehaviorActionFloatingNameEditPart.VISUAL_ID:
				return new StartObjectBehaviorActionFloatingNameEditPart(view);
			case OutputPinInStartObjectBehaviorActionEditPart.VISUAL_ID:
				return new OutputPinInStartObjectBehaviorActionEditPart(view);
			case OutputPinInStartObjectBehaviorActionLabelEditPart.VISUAL_ID:
				return new OutputPinInStartObjectBehaviorActionLabelEditPart(view);
			case OutputPinInStartObjectBehaviorActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInStartObjectBehaviorActionAppliedStereotypeLabelEditPart(view);
			case InputPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsObjectEditPart(view);
			case InputPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsObjectLabelEditPart(view);
			case InputPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsObjectEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsObjectLabelEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsObjectValueEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsObjectEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsObjectLabelEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsObjectValueEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case InputPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsArgumentEditPart(view);
			case InputPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsArgumentLabelEditPart(view);
			case InputPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsArgumentEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsArgumentLabelEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsArgumentValueEditPart(view);
			case ValuePinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsArgumentEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsArgumentLabelEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsArgumentValueEditPart(view);
			case ActionPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart(view);
			case TestIdentityActionEditPart.VISUAL_ID:
				return new TestIdentityActionEditPart(view);
			case TestIdentityActionNameEditPart.VISUAL_ID:
				return new TestIdentityActionNameEditPart(view);
			case TestIdentityActionFloatingNameEditPart.VISUAL_ID:
				return new TestIdentityActionFloatingNameEditPart(view);
			case OutputPinInTestIdentityActionEditPart.VISUAL_ID:
				return new OutputPinInTestIdentityActionEditPart(view);
			case OutputPinInTestIdentityActionItemLabelEditPart.VISUAL_ID:
				return new OutputPinInTestIdentityActionItemLabelEditPart(view);
			case OutputPinInTestIdentityActionItemAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInTestIdentityActionItemAppliedStereotypeLabelEditPart(view);
			case InputPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsFirstEditPart(view);
			case InputPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsFirstLabelEditPart(view);
			case InputPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart(view);
			case InputPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsSecondEditPart(view);
			case InputPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsSecondLabelEditPart(view);
			case InputPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart(view);
			case ValuePinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsFirstEditPart(view);
			case ValuePinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsFirstLabelEditPart(view);
			case ValuePinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsFirstValueEditPart(view);
			case ValuePinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart(view);
			case ValuePinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsSecondEditPart(view);
			case ValuePinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsSecondLabelEditPart(view);
			case ValuePinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsSecondValueEditPart(view);
			case ValuePinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart(view);
			case ActionPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsFirstEditPart(view);
			case ActionPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsFirstLabelEditPart(view);
			case ActionPinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsFirstValueEditPart(view);
			case ActionPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart(view);
			case ActionPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsSecondEditPart(view);
			case ActionPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsSecondLabelEditPart(view);
			case ActionPinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsSecondValueEditPart(view);
			case ActionPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart(view);
			case ClearStructuralFeatureActionEditPart.VISUAL_ID:
				return new ClearStructuralFeatureActionEditPart(view);
			case ClearStructuralFeatureActionNameEditPart.VISUAL_ID:
				return new ClearStructuralFeatureActionNameEditPart(view);
			case ClearStructuralFeatureActionFloatingNameEditPart.VISUAL_ID:
				return new ClearStructuralFeatureActionFloatingNameEditPart(view);
			case OutputPinInClearStructuralFeatureActionEditPart.VISUAL_ID:
				return new OutputPinInClearStructuralFeatureActionEditPart(view);
			case OutputPinInClearStructuralFeatureActionLabelEditPart.VISUAL_ID:
				return new OutputPinInClearStructuralFeatureActionLabelEditPart(view);
			case OutputPinInClearStructuralFeatureActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInClearStructuralFeatureActionAppliedStereotypeLabelEditPart(view);
			case InputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInClearStructuralFeatureActionAsObjectEditPart(view);
			case InputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInClearStructuralFeatureActionAsObjectLabelEditPart(view);
			case InputPinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInClearStructuralFeatureActionAsObjectEditPart(view);
			case ValuePinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInClearStructuralFeatureActionAsObjectLabelEditPart(view);
			case ValuePinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInClearStructuralFeatureActionAsObjectValueEditPart(view);
			case ValuePinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionInputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				return new ActionInputPinInClearStructuralFeatureActionAsObjectEditPart(view);
			case ActionInputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionInputPinInClearStructuralFeatureActionAsObjectLabelEditPart(view);
			case ActionInputPinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionInputPinInClearStructuralFeatureActionAsObjectValueEditPart(view);
			case ActionInputPinInClearStructFeatActAsObjectAppliedStereotypeEditPart.VISUAL_ID:
				return new ActionInputPinInClearStructFeatActAsObjectAppliedStereotypeEditPart(view);
			case CreateLinkActionEditPart.VISUAL_ID:
				return new CreateLinkActionEditPart(view);
			case CreateLinkActionNameEditPart.VISUAL_ID:
				return new CreateLinkActionNameEditPart(view);
			case CreateLinkActionFloatingNameEditPart.VISUAL_ID:
				return new CreateLinkActionFloatingNameEditPart(view);
			case InputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				return new InputPinInCreateLinkActionAsInputValueEditPart(view);
			case InputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new InputPinInCreateLinkActionAsInputValueLabelEditPart(view);
			case InputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ValuePinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ValuePinInCreateLinkActionAsInputValueEditPart(view);
			case ValuePinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ValuePinInCreateLinkActionAsInputValueLabelEditPart(view);
			case ValuePinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ValuePinInCreateLinkActionAsInputValueValueEditPart(view);
			case ValuePinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ActionInputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ActionInputPinInCreateLinkActionAsInputValueEditPart(view);
			case ActionInputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ActionInputPinInCreateLinkActionAsInputValueLabelEditPart(view);
			case ActionInputPinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ActionInputPinInCreateLinkActionAsInputValueValueEditPart(view);
			case ActionInputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionInputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ReadLinkActionEditPart.VISUAL_ID:
				return new ReadLinkActionEditPart(view);
			case ReadLinkActionNameEditPart.VISUAL_ID:
				return new ReadLinkActionNameEditPart(view);
			case ReadLinkActionFloatingNameEditPart.VISUAL_ID:
				return new ReadLinkActionFloatingNameEditPart(view);
			case OutputPinInReadLinkActionEditPart.VISUAL_ID:
				return new OutputPinInReadLinkActionEditPart(view);
			case OutputPinInReadLinkActionLabelEditPart.VISUAL_ID:
				return new OutputPinInReadLinkActionLabelEditPart(view);
			case OutputPinInReadLinkActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInReadLinkActionAppliedStereotypeLabelEditPart(view);
			case InputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				return new InputPinInReadLinkActionAsInputValueEditPart(view);
			case InputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new InputPinInReadLinkActionAsInputValueLabelEditPart(view);
			case InputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ValuePinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ValuePinInReadLinkActionAsInputValueEditPart(view);
			case ValuePinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ValuePinInReadLinkActionAsInputValueLabelEditPart(view);
			case ValuePinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ValuePinInReadLinkActionAsInputValueValueEditPart(view);
			case ValuePinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ActionInputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ActionInputPinInReadLinkActionAsInputValueEditPart(view);
			case ActionInputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ActionInputPinInReadLinkActionAsInputValueLabelEditPart(view);
			case ActionInputPinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ActionInputPinInReadLinkActionAsInputValueValueEditPart(view);
			case ActionInputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionInputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case DestroyLinkActionEditPart.VISUAL_ID:
				return new DestroyLinkActionEditPart(view);
			case DestroyLinkActionNameEditPart.VISUAL_ID:
				return new DestroyLinkActionNameEditPart(view);
			case DestroyLinkActionFloatingNameEditPart.VISUAL_ID:
				return new DestroyLinkActionFloatingNameEditPart(view);
			case InputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				return new InputPinInDestroyLinkActionAsInputValueEditPart(view);
			case InputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new InputPinInDestroyLinkActionAsInputValueLabelEditPart(view);
			case InputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ValuePinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ValuePinInDestroyLinkActionAsInputValueEditPart(view);
			case ValuePinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ValuePinInDestroyLinkActionAsInputValueLabelEditPart(view);
			case ValuePinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ValuePinInDestroyLinkActionAsInputValueValueEditPart(view);
			case ValuePinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ActionInputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				return new ActionInputPinInDestroyLinkActionAsInputValueEditPart(view);
			case ActionInputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
				return new ActionInputPinInDestroyLinkActionAsInputValueLabelEditPart(view);
			case ActionInputPinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID:
				return new ActionInputPinInDestroyLinkActionAsInputValueValueEditPart(view);
			case ActionInputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionInputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart(view);
			case ClearAssociationActionEditPart.VISUAL_ID:
				return new ClearAssociationActionEditPart(view);
			case ClearAssociationActionNameEditPart.VISUAL_ID:
				return new ClearAssociationActionNameEditPart(view);
			case ClearAssociationActionFloatingNameEditPart.VISUAL_ID:
				return new ClearAssociationActionFloatingNameEditPart(view);
			case InputPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInClearAssociationActionAsObjectEditPart(view);
			case InputPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInClearAssociationActionAsObjectLabelEditPart(view);
			case InputPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInClearAssociationActionAsObjectEditPart(view);
			case ValuePinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInClearAssociationActionAsObjectLabelEditPart(view);
			case ValuePinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInClearAssociationActionAsObjectValueEditPart(view);
			case ValuePinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				return new ActionPinInClearAssociationActionAsObjectEditPart(view);
			case ActionPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionPinInClearAssociationActionAsObjectLabelEditPart(view);
			case ActionPinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionPinInClearAssociationActionAsObjectValueEditPart(view);
			case ActionPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ReadExtentActionEditPart.VISUAL_ID:
				return new ReadExtentActionEditPart(view);
			case ReadExtentActionNameEditPart.VISUAL_ID:
				return new ReadExtentActionNameEditPart(view);
			case ReadExtentActionFloatingNameEditPart.VISUAL_ID:
				return new ReadExtentActionFloatingNameEditPart(view);
			case OutputPinInReadExtentActionEditPart.VISUAL_ID:
				return new OutputPinInReadExtentActionEditPart(view);
			case OutputPinInReadExtentActionLabelEditPart.VISUAL_ID:
				return new OutputPinInReadExtentActionLabelEditPart(view);
			case OutputPinInReadExtentActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInReadExtentActionAppliedStereotypeLabelEditPart(view);
			case ReclassifyObjectActionEditPart.VISUAL_ID:
				return new ReclassifyObjectActionEditPart(view);
			case ReclassifyObjectActionNameEditPart.VISUAL_ID:
				return new ReclassifyObjectActionNameEditPart(view);
			case ReclassifyObjectActionFloatingNameEditPart.VISUAL_ID:
				return new ReclassifyObjectActionFloatingNameEditPart(view);
			case InputPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInReclassifyObjectActionAsObjectEditPart(view);
			case InputPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInReclassifyObjectActionAsObjectLabelEditPart(view);
			case InputPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInReclassifyObjectActionAsObjectEditPart(view);
			case ValuePinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInReclassifyObjectActionAsObjectLabelEditPart(view);
			case ValuePinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInReclassifyObjectActionAsObjectValueEditPart(view);
			case ValuePinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				return new ActionPinInReclassifyObjectActionAsObjectEditPart(view);
			case ActionPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionPinInReclassifyObjectActionAsObjectLabelEditPart(view);
			case ActionPinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionPinInReclassifyObjectActionAsObjectValueEditPart(view);
			case ActionPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ReadIsClassifiedObjectActionEditPart.VISUAL_ID:
				return new ReadIsClassifiedObjectActionEditPart(view);
			case ReadIsClassifiedObjectActionNameEditPart.VISUAL_ID:
				return new ReadIsClassifiedObjectActionNameEditPart(view);
			case ReadIsClassifiedObjectActionFloatingNameEditPart.VISUAL_ID:
				return new ReadIsClassifiedObjectActionFloatingNameEditPart(view);
			case OutputPinInReadIsClassifiedObjectActionEditPart.VISUAL_ID:
				return new OutputPinInReadIsClassifiedObjectActionEditPart(view);
			case OutputPinInReadIsClassifiedObjectActionLabelEditPart.VISUAL_ID:
				return new OutputPinInReadIsClassifiedObjectActionLabelEditPart(view);
			case OutputPinInReadIsClassifiedObjectActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInReadIsClassifiedObjectActionAppliedStereotypeLabelEditPart(view);
			case InputPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInReadIsClassifiedObjectActionAsObjectEditPart(view);
			case InputPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInReadIsClassifiedObjectActionAsObjectLabelEditPart(view);
			case InputPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInReadIsClassifiedObjectActionAsObjectEditPart(view);
			case ValuePinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInReadIsClassifiedObjectActionAsObjectLabelEditPart(view);
			case ValuePinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInReadIsClassifiedObjectActionAsObjectValueEditPart(view);
			case ValuePinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				return new ActionPinInReadIsClassifiedObjectActionAsObjectEditPart(view);
			case ActionPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionPinInReadIsClassifiedObjectActionAsObjectLabelEditPart(view);
			case ActionPinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionPinInReadIsClassifiedObjectActionAsObjectValueEditPart(view);
			case ActionPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ReduceActionEditPart.VISUAL_ID:
				return new ReduceActionEditPart(view);
			case ReduceActionNameEditPart.VISUAL_ID:
				return new ReduceActionNameEditPart(view);
			case ReduceActionFloatingNameEditPart.VISUAL_ID:
				return new ReduceActionFloatingNameEditPart(view);
			case OutputPinInReduceActionEditPart.VISUAL_ID:
				return new OutputPinInReduceActionEditPart(view);
			case OutputPinInReduceActionLabelEditPart.VISUAL_ID:
				return new OutputPinInReduceActionLabelEditPart(view);
			case OutputPinInReduceActionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new OutputPinInReduceActionAppliedStereotypeLabelEditPart(view);
			case InputPinInReduceActionAsCollectionEditPart.VISUAL_ID:
				return new InputPinInReduceActionAsCollectionEditPart(view);
			case InputPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
				return new InputPinInReduceActionAsCollectionLabelEditPart(view);
			case InputPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart(view);
			case ValuePinInReduceActionAsCollectionEditPart.VISUAL_ID:
				return new ValuePinInReduceActionAsCollectionEditPart(view);
			case ValuePinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
				return new ValuePinInReduceActionAsCollectionLabelEditPart(view);
			case ValuePinInReduceActionAsCollectionValueEditPart.VISUAL_ID:
				return new ValuePinInReduceActionAsCollectionValueEditPart(view);
			case ValuePinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInReduceActionAsCollectionAppliedStereotypeLabelEditPart(view);
			case ActionPinInReduceActionAsCollectionEditPart.VISUAL_ID:
				return new ActionPinInReduceActionAsCollectionEditPart(view);
			case ActionPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
				return new ActionPinInReduceActionAsCollectionLabelEditPart(view);
			case ActionPinInReduceActionAsCollectionValueEditPart.VISUAL_ID:
				return new ActionPinInReduceActionAsCollectionValueEditPart(view);
			case ActionPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart(view);
			case StartClassifierBehaviorActionEditPart.VISUAL_ID:
				return new StartClassifierBehaviorActionEditPart(view);
			case StartClassifierBehaviorActionNameEditPart.VISUAL_ID:
				return new StartClassifierBehaviorActionNameEditPart(view);
			case StartClassifierBehaviorActionFloatingNameEditPart.VISUAL_ID:
				return new StartClassifierBehaviorActionFloatingNameEditPart(view);
			case InputPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new InputPinInStartClassifierBehaviorActionAsObjectEditPart(view);
			case InputPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new InputPinInStartClassifierBehaviorActionAsObjectLabelEditPart(view);
			case InputPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new InputPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ValuePinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new ValuePinInStartClassifierBehaviorActionAsObjectEditPart(view);
			case ValuePinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new ValuePinInStartClassifierBehaviorActionAsObjectLabelEditPart(view);
			case ValuePinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID:
				return new ValuePinInStartClassifierBehaviorActionAsObjectValueEditPart(view);
			case ValuePinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ValuePinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActionPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
				return new ActionPinInStartClassifierBehaviorActionAsObjectEditPart(view);
			case ActionPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
				return new ActionPinInStartClassifierBehaviorActionAsObjectLabelEditPart(view);
			case ActionPinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID:
				return new ActionPinInStartClassifierBehaviorActionAsObjectValueEditPart(view);
			case ActionPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
				return new ActionPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart(view);
			case ActivityActivityParametersCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityParametersCompartmentEditPart(view);
			case ActivityActivityPreConditionsCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityPreConditionsCompartmentEditPart(view);
			case ActivityActivityPostConditionsCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityPostConditionsCompartmentEditPart(view);
			case ActivityActivityContentCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityContentCompartmentEditPart(view);
			case ConditionalNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				return new ConditionalNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case ExpansionRegionStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				return new ExpansionRegionStructuredActivityNodeContentCompartmentEditPart(view);
			case LoopNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				return new LoopNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case SequenceNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				return new SequenceNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart(view);
			case ActivityPartitionActivityPartitionContentCompartmentEditPart.VISUAL_ID:
				return new ActivityPartitionActivityPartitionContentCompartmentEditPart(view);
			case InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart.VISUAL_ID:
				return new InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart(view);
			case ActivityCNParametersCompartmentEditPart.VISUAL_ID:
				return new ActivityCNParametersCompartmentEditPart(view);
			case ActivityCNPreConditionsCompartmentEditPart.VISUAL_ID:
				return new ActivityCNPreConditionsCompartmentEditPart(view);
			case ActivityCNPostConditionsCompartmentEditPart.VISUAL_ID:
				return new ActivityCNPostConditionsCompartmentEditPart(view);
			case ActivityCNContentCompartmentEditPart.VISUAL_ID:
				return new ActivityCNContentCompartmentEditPart(view);
			case ActionLocalPreconditionEditPart.VISUAL_ID:
				return new ActionLocalPreconditionEditPart(view);
			case ActionLocalPostconditionEditPart.VISUAL_ID:
				return new ActionLocalPostconditionEditPart(view);
			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);
			case ObjectFlowNameEditPart.VISUAL_ID:
				return new ObjectFlowNameEditPart(view);
			case ObjectFlowWeightEditPart.VISUAL_ID:
				return new ObjectFlowWeightEditPart(view);
			case ObjectFlowSelectionEditPart.VISUAL_ID:
				return new ObjectFlowSelectionEditPart(view);
			case ObjectFlowTransformationEditPart.VISUAL_ID:
				return new ObjectFlowTransformationEditPart(view);
			case DecisionInputFlowEditPart.VISUAL_ID:
				return new DecisionInputFlowEditPart(view);
			case ObjectFlowGuardEditPart.VISUAL_ID:
				return new ObjectFlowGuardEditPart(view);
			case ObjectFlowAppliedStereotypeEditPart.VISUAL_ID:
				return new ObjectFlowAppliedStereotypeEditPart(view);
			case ObjectFlowInterruptibleIconEditPart.VISUAL_ID:
				return new ObjectFlowInterruptibleIconEditPart(view);
			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);
			case ControlFlowNameEditPart.VISUAL_ID:
				return new ControlFlowNameEditPart(view);
			case ControlFlowWeightEditPart.VISUAL_ID:
				return new ControlFlowWeightEditPart(view);
			case ControlFlowGuardEditPart.VISUAL_ID:
				return new ControlFlowGuardEditPart(view);
			case ControlFlowAppliedStereotypeEditPart.VISUAL_ID:
				return new ControlFlowAppliedStereotypeEditPart(view);
			case ControlFlowInterruptibleIconEditPart.VISUAL_ID:
				return new ControlFlowInterruptibleIconEditPart(view);
			case ExceptionHandlerEditPart.VISUAL_ID:
				return new ExceptionHandlerEditPart(view);
			case ExceptionHandlerTypeEditPart.VISUAL_ID:
				return new ExceptionHandlerTypeEditPart(view);
			case ExceptionHandlerIconEditPart.VISUAL_ID:
				return new ExceptionHandlerIconEditPart(view);
			case CommentLinkEditPart.VISUAL_ID:
				return new CommentLinkEditPart(view);
			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return new ConstraintConstrainedElementEditPart(view);
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
	 * @generated NOT handle LinkAndCornerBentWithTextFigure
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof IMultilineEditableFigure) {
			return new MultilineCellEditorLocator((IMultilineEditableFigure) source.getFigure());
		} else if (source.getFigure() instanceof WrappingLabel) {
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		} else if (source.getFigure() instanceof DecisionInputEditPart.LinkAndCornerBentWithTextFigure) {
			return new TextCellEditorLocator(((DecisionInputEditPart.LinkAndCornerBentWithTextFigure) source.getFigure()).getCornerBentContent());
		} else if (source.getFigure() instanceof ObjectFlowSelectionEditPart.LinkAndCornerBentWithTextFigure) {
			return new TextCellEditorLocator(((ObjectFlowSelectionEditPart.LinkAndCornerBentWithTextFigure) source.getFigure()).getCornerBentContent());
		} else if (source.getFigure() instanceof ObjectFlowTransformationEditPart.LinkAndCornerBentWithTextFigure) {
			return new TextCellEditorLocator(((ObjectFlowTransformationEditPart.LinkAndCornerBentWithTextFigure) source.getFigure()).getCornerBentContent());
		} else {
			return new LabelCellEditorLocator((Label) source.getFigure());
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
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
