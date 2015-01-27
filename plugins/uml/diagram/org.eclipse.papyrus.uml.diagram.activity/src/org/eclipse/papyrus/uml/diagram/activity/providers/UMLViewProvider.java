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
package org.eclipse.papyrus.uml.diagram.activity.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.infra.extendedtypes.types.IExtendedHintedElementType;
import org.eclipse.papyrus.infra.extendedtypes.util.ElementTypeUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.preferences.PreferencesConstantsHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.reconciler.DiagramVersioningUtils;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.*;
import org.eclipse.papyrus.uml.diagram.activity.locator.PinPositionLocator;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ValuePin;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	@Override
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 * if (op.getViewKind() == Node.class)
		 * return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 * if (op.getViewKind() == Edge.class)
		 * return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		// check Diagram Type should be the class diagram
		String modelID = UMLVisualIDRegistry.getModelID(op.getContainerView());
		if (!getDiagramProvidedId().equals(modelID)) {
			return false;
		}
		int visualID = UMLVisualIDRegistry.getVisualID(op.getSemanticHint());
		if (Node.class.isAssignableFrom(op.getViewKind())) {
			return UMLVisualIDRegistry.canCreateNode(op.getContainerView(), visualID);
		}
		return true;
	}

	/**
	 * Indicates for which diagram this provider works for.
	 * <p>
	 * This method can be overloaded when diagram editor inherits from another one
	 * </p>
	 *
	 * @return the unique identifier of the diagram for which views are provided.
	 */
	protected String getDiagramProvidedId() {
		return ActivityDiagramEditPart.MODEL_ID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return ActivityDiagramEditPart.MODEL_ID.equals(op.getSemanticHint()) && UMLVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (elementType instanceof IExtendedHintedElementType) {
					if (domainElement != null) {
						if (!UMLVisualIDRegistry.checkNodeVisualID(op.getContainerView(), domainElement, visualID)) {
							return false;
						}
					}
				} else {
					if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
						return false; // foreign element type
					}
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!ActivityDiagramEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case ActivityEditPart.VISUAL_ID:
				case ParameterEditPart.VISUAL_ID:
				case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
				case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
				case InitialNodeEditPart.VISUAL_ID:
				case ActivityFinalNodeEditPart.VISUAL_ID:
				case FlowFinalNodeEditPart.VISUAL_ID:
				case OpaqueActionEditPart.VISUAL_ID:
				case ValuePinInOpaqueActEditPart.VISUAL_ID:
				case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
				case InputPinInOpaqueActEditPart.VISUAL_ID:
				case OutputPinInOpaqueActEditPart.VISUAL_ID:
				case CallBehaviorActionEditPart.VISUAL_ID:
				case ValuePinInCallBeActEditPart.VISUAL_ID:
				case ActionInputPinInCallBeActEditPart.VISUAL_ID:
				case InputPinInCallBeActEditPart.VISUAL_ID:
				case OutputPinInCallBeActEditPart.VISUAL_ID:
				case CallOperationActionEditPart.VISUAL_ID:
				case ActionInputPinInCallOpActEditPart.VISUAL_ID:
				case ValuePinInCallOpActEditPart.VISUAL_ID:
				case InputPinInCallOpActEditPart.VISUAL_ID:
				case OutputPinInCallOpActEditPart.VISUAL_ID:
				case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
				case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
				case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
				case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
				case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
				case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
				case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
				case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
				case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
				case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
				case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
				case DecisionNodeEditPart.VISUAL_ID:
				case MergeNodeEditPart.VISUAL_ID:
				case ForkNodeEditPart.VISUAL_ID:
				case JoinNodeEditPart.VISUAL_ID:
				case DataStoreNodeEditPart.VISUAL_ID:
				case SendObjectActionEditPart.VISUAL_ID:
				case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
				case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
				case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
				case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
				case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
				case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
				case SendSignalActionEditPart.VISUAL_ID:
				case ActionInputPinInSendSigActEditPart.VISUAL_ID:
				case ValuePinInSendSigActEditPart.VISUAL_ID:
				case InputPinInSendSigActEditPart.VISUAL_ID:
				case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
				case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
				case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
				case ActivityParameterNodeEditPart.VISUAL_ID:
				case AcceptEventActionEditPart.VISUAL_ID:
				case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
				case ValueSpecificationActionEditPart.VISUAL_ID:
				case OutputPinInValSpecActEditPart.VISUAL_ID:
				case ConditionalNodeEditPart.VISUAL_ID:
				case ExpansionRegionEditPart.VISUAL_ID:
				case ExpansionNodeAsInEditPart.VISUAL_ID:
				case ExpansionNodeAsOutEditPart.VISUAL_ID:
				case LoopNodeEditPart.VISUAL_ID:
				case OutputPinInLoopNodeAsBodyOutputEditPart.VISUAL_ID:
				case OutputPinInLoopNodeAsLoopVariableEditPart.VISUAL_ID:
				case OutputPinInLoopNodeAsResultEditPart.VISUAL_ID:
				case SequenceNodeEditPart.VISUAL_ID:
				case StructuredActivityNodeEditPart.VISUAL_ID:
				case InputPinInLoopNodeAsVariableEditPart.VISUAL_ID:
				case ActivityPartitionEditPart.VISUAL_ID:
				case InterruptibleActivityRegionEditPart.VISUAL_ID:
				case CommentEditPartCN.VISUAL_ID:
				case ReadSelfActionEditPart.VISUAL_ID:
				case ReadSelfActionOutputPinEditPart.VISUAL_ID:
				case ActivityEditPartCN.VISUAL_ID:
				case CreateObjectActionEditPart.VISUAL_ID:
				case OutputPinInCreateObjectActionAsResultEditPart.VISUAL_ID:
				case ShapeNamedElementEditPart.VISUAL_ID:
				case ReadStructuralFeatureActionEditPart.VISUAL_ID:
				case InputPinInReadStructuralFeatureAsObjectEditPart.VISUAL_ID:
				case OutputPinInReadStructuralFeatureAsResultEditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				case InputPinInAddStructuralFeatureValueActionAsObjectEditPart.VISUAL_ID:
				case InputPinInAddStructuralFeatureValueActionAsValueEditPart.VISUAL_ID:
				case OutputPinInAddStructuralFeatureValueActionAsResultEditPart.VISUAL_ID:
				case DestroyObjectActionEditPart.VISUAL_ID:
				case InputPinInDestroyObjectActionEditPart.VISUAL_ID:
				case ReadVariableActionEditPart.VISUAL_ID:
				case OutputPinInReadVariableActionAsResultEditPart.VISUAL_ID:
				case AddVariableValueActionEditPart.VISUAL_ID:
				case InputPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:
				case InputPinInAddVariableValueActionAsValueEditPart.VISUAL_ID:
				case BroadcastSignalActionEditPart.VISUAL_ID:
				case InputPinInBroadcastSignalActionEditPart.VISUAL_ID:
				case CentralBufferNodeEditPart.VISUAL_ID:
				case ConstraintEditPartCN.VISUAL_ID:
				case StartObjectBehavoiurActionEditPart.VISUAL_ID:
				case OutputPinInStartObjectBehaviorActionEditPart.VISUAL_ID:
				case InputPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				case ActionPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
				case InputPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				case ValuePinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				case ActionPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
				case TestIdentityActionEditPart.VISUAL_ID:
				case OutputPinInTestIdentityActionEditPart.VISUAL_ID:
				case InputPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				case InputPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				case ValuePinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				case ValuePinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				case ActionPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
				case ActionPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
				case ClearStructuralFeatureActionEditPart.VISUAL_ID:
				case OutputPinInClearStructuralFeatureActionEditPart.VISUAL_ID:
				case InputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				case ActionInputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
				case CreateLinkActionEditPart.VISUAL_ID:
				case InputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				case ValuePinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				case ActionInputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
				case ReadLinkActionEditPart.VISUAL_ID:
				case OutputPinInReadLinkActionEditPart.VISUAL_ID:
				case InputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				case ValuePinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				case ActionInputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
				case DestroyLinkActionEditPart.VISUAL_ID:
				case InputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				case ValuePinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				case ActionInputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
				case ClearAssociationActionEditPart.VISUAL_ID:
				case InputPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				case ActionPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
				case ReadExtentActionEditPart.VISUAL_ID:
				case OutputPinInReadExtentActionEditPart.VISUAL_ID:
				case ReclassifyObjectActionEditPart.VISUAL_ID:
				case InputPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				case ActionPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
				case ReadIsClassifiedObjectActionEditPart.VISUAL_ID:
				case OutputPinInReadIsClassifiedObjectActionEditPart.VISUAL_ID:
				case InputPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				case ActionPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
				case ReduceActionEditPart.VISUAL_ID:
				case OutputPinInReduceActionEditPart.VISUAL_ID:
				case InputPinInReduceActionAsCollectionEditPart.VISUAL_ID:
				case ValuePinInReduceActionAsCollectionEditPart.VISUAL_ID:
				case ActionPinInReduceActionAsCollectionEditPart.VISUAL_ID:
				case StartClassifierBehaviorActionEditPart.VISUAL_ID:
				case InputPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
				case ValuePinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
				case ActionPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return UMLVisualIDRegistry.canCreateNode(op.getContainerView(), visualID);
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		// RS: add code for extended types creation
		if (elementType instanceof IExtendedHintedElementType) {
			IElementType closestNonExtendedType = ElementTypeUtils.getClosestDiagramType(elementType);
			if (!UMLElementTypes.isKnownElementType(closestNonExtendedType) || (!(closestNonExtendedType instanceof IHintedType))) {
				return false; // foreign element type.
			}
		} else {
			if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
				return false; // foreign element type
			}
		}
		// if (!org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
		// return false; // foreign element type
		// }
		// END R.S.
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null || (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		DiagramVersioningUtils.stampCurrentVersion(diagram);
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(ActivityDiagramEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	@Override
	public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return createActivity_2001(domainElement, containerView, index, persisted, preferencesHint);
		case ParameterEditPart.VISUAL_ID:
			return createParameter_3001(domainElement, containerView, index, persisted, preferencesHint);
		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
			return createConstraint_3002(domainElement, containerView, index, persisted, preferencesHint);
		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
			return createConstraint_3003(domainElement, containerView, index, persisted, preferencesHint);
		case InitialNodeEditPart.VISUAL_ID:
			return createInitialNode_3004(domainElement, containerView, index, persisted, preferencesHint);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return createActivityFinalNode_3005(domainElement, containerView, index, persisted, preferencesHint);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return createFlowFinalNode_3006(domainElement, containerView, index, persisted, preferencesHint);
		case OpaqueActionEditPart.VISUAL_ID:
			return createOpaqueAction_3007(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInOpaqueActEditPart.VISUAL_ID:
			return createValuePin_3015(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInOpaqueActEditPart.VISUAL_ID:
			return createActionInputPin_3016(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInOpaqueActEditPart.VISUAL_ID:
			return createInputPin_3013(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInOpaqueActEditPart.VISUAL_ID:
			return createOutputPin_3014(domainElement, containerView, index, persisted, preferencesHint);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return createCallBehaviorAction_3008(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInCallBeActEditPart.VISUAL_ID:
			return createValuePin_3017(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInCallBeActEditPart.VISUAL_ID:
			return createActionInputPin_3018(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInCallBeActEditPart.VISUAL_ID:
			return createInputPin_3019(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInCallBeActEditPart.VISUAL_ID:
			return createOutputPin_3020(domainElement, containerView, index, persisted, preferencesHint);
		case CallOperationActionEditPart.VISUAL_ID:
			return createCallOperationAction_3010(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInCallOpActEditPart.VISUAL_ID:
			return createActionInputPin_3021(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInCallOpActEditPart.VISUAL_ID:
			return createValuePin_3022(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInCallOpActEditPart.VISUAL_ID:
			return createInputPin_3023(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInCallOpActEditPart.VISUAL_ID:
			return createOutputPin_3024(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInCallOpActAsTargetEditPart.VISUAL_ID:
			return createValuePin_3025(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return createActionInputPin_3026(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInCallOpActAsTargetEditPart.VISUAL_ID:
			return createInputPin_3027(domainElement, containerView, index, persisted, preferencesHint);
		case DurationConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return createDurationConstraint_3034(domainElement, containerView, index, persisted, preferencesHint);
		case DurationConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return createDurationConstraint_3035(domainElement, containerView, index, persisted, preferencesHint);
		case TimeConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return createTimeConstraint_3036(domainElement, containerView, index, persisted, preferencesHint);
		case TimeConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return createTimeConstraint_3037(domainElement, containerView, index, persisted, preferencesHint);
		case IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return createIntervalConstraint_3032(domainElement, containerView, index, persisted, preferencesHint);
		case IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return createIntervalConstraint_3033(domainElement, containerView, index, persisted, preferencesHint);
		case ConstraintAsLocalPrecondEditPart.VISUAL_ID:
			return createConstraint_3011(domainElement, containerView, index, persisted, preferencesHint);
		case ConstraintAsLocalPostcondEditPart.VISUAL_ID:
			return createConstraint_3012(domainElement, containerView, index, persisted, preferencesHint);
		case DecisionNodeEditPart.VISUAL_ID:
			return createDecisionNode_3038(domainElement, containerView, index, persisted, preferencesHint);
		case MergeNodeEditPart.VISUAL_ID:
			return createMergeNode_3039(domainElement, containerView, index, persisted, preferencesHint);
		case ForkNodeEditPart.VISUAL_ID:
			return createForkNode_3040(domainElement, containerView, index, persisted, preferencesHint);
		case JoinNodeEditPart.VISUAL_ID:
			return createJoinNode_3041(domainElement, containerView, index, persisted, preferencesHint);
		case DataStoreNodeEditPart.VISUAL_ID:
			return createDataStoreNode_3078(domainElement, containerView, index, persisted, preferencesHint);
		case SendObjectActionEditPart.VISUAL_ID:
			return createSendObjectAction_3042(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInSendObjActAsReqEditPart.VISUAL_ID:
			return createValuePin_3046(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return createActionInputPin_3047(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInSendObjActAsReqEditPart.VISUAL_ID:
			return createInputPin_3048(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInSendObjActAsTargetEditPart.VISUAL_ID:
			return createValuePin_3049(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return createActionInputPin_3050(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInSendObjActAsTargetEditPart.VISUAL_ID:
			return createInputPin_3051(domainElement, containerView, index, persisted, preferencesHint);
		case SendSignalActionEditPart.VISUAL_ID:
			return createSendSignalAction_3052(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInSendSigActEditPart.VISUAL_ID:
			return createActionInputPin_3053(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInSendSigActEditPart.VISUAL_ID:
			return createValuePin_3054(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInSendSigActEditPart.VISUAL_ID:
			return createInputPin_3055(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInSendSigActAsTargetEditPart.VISUAL_ID:
			return createValuePin_3060(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return createActionInputPin_3061(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInSendSigActAsTargetEditPart.VISUAL_ID:
			return createInputPin_3062(domainElement, containerView, index, persisted, preferencesHint);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return createActivityParameterNode_3059(domainElement, containerView, index, persisted, preferencesHint);
		case AcceptEventActionEditPart.VISUAL_ID:
			return createAcceptEventAction_3063(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInAcceptEventActionEditPart.VISUAL_ID:
			return createOutputPin_3064(domainElement, containerView, index, persisted, preferencesHint);
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return createValueSpecificationAction_3076(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInValSpecActEditPart.VISUAL_ID:
			return createOutputPin_3077(domainElement, containerView, index, persisted, preferencesHint);
		case ConditionalNodeEditPart.VISUAL_ID:
			return createConditionalNode_3069(domainElement, containerView, index, persisted, preferencesHint);
		case ExpansionRegionEditPart.VISUAL_ID:
			return createExpansionRegion_3070(domainElement, containerView, index, persisted, preferencesHint);
		case ExpansionNodeAsInEditPart.VISUAL_ID:
			return createExpansionNode_3074(domainElement, containerView, index, persisted, preferencesHint);
		case ExpansionNodeAsOutEditPart.VISUAL_ID:
			return createExpansionNode_3075(domainElement, containerView, index, persisted, preferencesHint);
		case LoopNodeEditPart.VISUAL_ID:
			return createLoopNode_3071(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInLoopNodeAsBodyOutputEditPart.VISUAL_ID:
			return createOutputPin_3109(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInLoopNodeAsLoopVariableEditPart.VISUAL_ID:
			return createOutputPin_3110(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInLoopNodeAsResultEditPart.VISUAL_ID:
			return createOutputPin_3111(domainElement, containerView, index, persisted, preferencesHint);
		case SequenceNodeEditPart.VISUAL_ID:
			return createSequenceNode_3073(domainElement, containerView, index, persisted, preferencesHint);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return createStructuredActivityNode_3065(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInLoopNodeAsVariableEditPart.VISUAL_ID:
			return createInputPin_3105(domainElement, containerView, index, persisted, preferencesHint);
		case ActivityPartitionEditPart.VISUAL_ID:
			return createActivityPartition_3067(domainElement, containerView, index, persisted, preferencesHint);
		case InterruptibleActivityRegionEditPart.VISUAL_ID:
			return createInterruptibleActivityRegion_3068(domainElement, containerView, index, persisted, preferencesHint);
		case CommentEditPartCN.VISUAL_ID:
			return createComment_3080(domainElement, containerView, index, persisted, preferencesHint);
		case ReadSelfActionEditPart.VISUAL_ID:
			return createReadSelfAction_3081(domainElement, containerView, index, persisted, preferencesHint);
		case ReadSelfActionOutputPinEditPart.VISUAL_ID:
			return createOutputPin_3084(domainElement, containerView, index, persisted, preferencesHint);
		case ActivityEditPartCN.VISUAL_ID:
			return createActivity_3083(domainElement, containerView, index, persisted, preferencesHint);
		case CreateObjectActionEditPart.VISUAL_ID:
			return createCreateObjectAction_3086(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInCreateObjectActionAsResultEditPart.VISUAL_ID:
			return createOutputPin_3087(domainElement, containerView, index, persisted, preferencesHint);
		case ShapeNamedElementEditPart.VISUAL_ID:
			return createNamedElement_3085(domainElement, containerView, index, persisted, preferencesHint);
		case ReadStructuralFeatureActionEditPart.VISUAL_ID:
			return createReadStructuralFeatureAction_3088(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInReadStructuralFeatureAsObjectEditPart.VISUAL_ID:
			return createInputPin_3089(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReadStructuralFeatureAsResultEditPart.VISUAL_ID:
			return createOutputPin_3090(domainElement, containerView, index, persisted, preferencesHint);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return createAddStructuralFeatureValueAction_3091(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInAddStructuralFeatureValueActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3092(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInAddStructuralFeatureValueActionAsValueEditPart.VISUAL_ID:
			return createInputPin_3093(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInAddStructuralFeatureValueActionAsResultEditPart.VISUAL_ID:
			return createOutputPin_3094(domainElement, containerView, index, persisted, preferencesHint);
		case DestroyObjectActionEditPart.VISUAL_ID:
			return createDestroyObjectAction_3095(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInDestroyObjectActionEditPart.VISUAL_ID:
			return createInputPin_3096(domainElement, containerView, index, persisted, preferencesHint);
		case ReadVariableActionEditPart.VISUAL_ID:
			return createReadVariableAction_3097(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReadVariableActionAsResultEditPart.VISUAL_ID:
			return createOutputPin_3098(domainElement, containerView, index, persisted, preferencesHint);
		case AddVariableValueActionEditPart.VISUAL_ID:
			return createAddVariableValueAction_3099(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:
			return createInputPin_3100(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInAddVariableValueActionAsValueEditPart.VISUAL_ID:
			return createInputPin_3101(domainElement, containerView, index, persisted, preferencesHint);
		case BroadcastSignalActionEditPart.VISUAL_ID:
			return createBroadcastSignalAction_3102(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInBroadcastSignalActionEditPart.VISUAL_ID:
			return createInputPin_3103(domainElement, containerView, index, persisted, preferencesHint);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return createCentralBufferNode_3104(domainElement, containerView, index, persisted, preferencesHint);
		case ConstraintEditPartCN.VISUAL_ID:
			return createConstraint_3112(domainElement, containerView, index, persisted, preferencesHint);
		case StartObjectBehavoiurActionEditPart.VISUAL_ID:
			return createStartObjectBehaviorAction_3113(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInStartObjectBehaviorActionEditPart.VISUAL_ID:
			return createOutputPin_3125(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3132(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3145(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3158(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
			return createInputPin_3133(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
			return createValuePin_3146(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID:
			return createActionInputPin_3159(domainElement, containerView, index, persisted, preferencesHint);
		case TestIdentityActionEditPart.VISUAL_ID:
			return createTestIdentityAction_3114(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInTestIdentityActionEditPart.VISUAL_ID:
			return createOutputPin_3126(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
			return createInputPin_3134(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
			return createInputPin_3135(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
			return createValuePin_3147(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
			return createValuePin_3148(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInTestIdentityActionAsFirstEditPart.VISUAL_ID:
			return createActionInputPin_3160(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInTestIdentityActionAsSecondEditPart.VISUAL_ID:
			return createActionInputPin_3161(domainElement, containerView, index, persisted, preferencesHint);
		case ClearStructuralFeatureActionEditPart.VISUAL_ID:
			return createClearStructuralFeatureAction_3115(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInClearStructuralFeatureActionEditPart.VISUAL_ID:
			return createOutputPin_3127(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3136(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3149(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3162(domainElement, containerView, index, persisted, preferencesHint);
		case CreateLinkActionEditPart.VISUAL_ID:
			return createCreateLinkAction_3117(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
			return createInputPin_3137(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
			return createValuePin_3151(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID:
			return createActionInputPin_3163(domainElement, containerView, index, persisted, preferencesHint);
		case ReadLinkActionEditPart.VISUAL_ID:
			return createReadLinkAction_3116(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReadLinkActionEditPart.VISUAL_ID:
			return createOutputPin_3128(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
			return createInputPin_3138(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
			return createValuePin_3150(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID:
			return createActionInputPin_3164(domainElement, containerView, index, persisted, preferencesHint);
		case DestroyLinkActionEditPart.VISUAL_ID:
			return createDestroyLinkAction_3118(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
			return createInputPin_3139(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
			return createValuePin_3152(domainElement, containerView, index, persisted, preferencesHint);
		case ActionInputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID:
			return createActionInputPin_3165(domainElement, containerView, index, persisted, preferencesHint);
		case ClearAssociationActionEditPart.VISUAL_ID:
			return createClearAssociationAction_3119(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3140(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3153(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInClearAssociationActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3166(domainElement, containerView, index, persisted, preferencesHint);
		case ReadExtentActionEditPart.VISUAL_ID:
			return createReadExtentAction_3120(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReadExtentActionEditPart.VISUAL_ID:
			return createOutputPin_3129(domainElement, containerView, index, persisted, preferencesHint);
		case ReclassifyObjectActionEditPart.VISUAL_ID:
			return createReclassifyObjectAction_3121(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3141(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3154(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3167(domainElement, containerView, index, persisted, preferencesHint);
		case ReadIsClassifiedObjectActionEditPart.VISUAL_ID:
			return createReadIsClassifiedObjectAction_3122(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReadIsClassifiedObjectActionEditPart.VISUAL_ID:
			return createOutputPin_3130(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3142(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3155(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3168(domainElement, containerView, index, persisted, preferencesHint);
		case ReduceActionEditPart.VISUAL_ID:
			return createReduceAction_3123(domainElement, containerView, index, persisted, preferencesHint);
		case OutputPinInReduceActionEditPart.VISUAL_ID:
			return createOutputPin_3131(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInReduceActionAsCollectionEditPart.VISUAL_ID:
			return createInputPin_3143(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInReduceActionAsCollectionEditPart.VISUAL_ID:
			return createValuePin_3156(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInReduceActionAsCollectionEditPart.VISUAL_ID:
			return createActionInputPin_3169(domainElement, containerView, index, persisted, preferencesHint);
		case StartClassifierBehaviorActionEditPart.VISUAL_ID:
			return createStartClassifierBehaviorAction_3124(domainElement, containerView, index, persisted, preferencesHint);
		case InputPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createInputPin_3144(domainElement, containerView, index, persisted, preferencesHint);
		case ValuePinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createValuePin_3157(domainElement, containerView, index, persisted, preferencesHint);
		case ActionPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID:
			return createActionInputPin_3170(domainElement, containerView, index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (UMLVisualIDRegistry.getVisualID(elementTypeHint)) {
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return createActionLocalPrecondition_4001(containerView, index, persisted, preferencesHint);
		case ActionLocalPostconditionEditPart.VISUAL_ID:
			return createActionLocalPostcondition_4002(containerView, index, persisted, preferencesHint);
		case ObjectFlowEditPart.VISUAL_ID:
			return createObjectFlow_4003(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case ControlFlowEditPart.VISUAL_ID:
			return createControlFlow_4004(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return createExceptionHandler_4005(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case CommentLinkEditPart.VISUAL_ID:
			return createCommentAnnotatedElement_4006(containerView, index, persisted, preferencesHint);
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return createConstraintConstrainedElement_4007(containerView, index, persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createActivity_2001(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Activity");
		Node label5001 = createLabel(node, UMLVisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
		Node label5002 = createLabel(node, UMLVisualIDRegistry.getType(ActivityIsSingleExecutionEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityActivityParametersCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityActivityPreConditionsCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityActivityPostConditionsCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityActivityContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "Activity");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createParameter_3001(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(UMLVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Parameter");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConstraint_3002(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(UMLVisualIDRegistry.getType(ConstraintInActivityAsPrecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Constraint");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConstraint_3003(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(UMLVisualIDRegistry.getType(ConstraintInActivityAsPostcondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Constraint");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInitialNode_3004(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InitialNode");
		Node label6034 = createLabel(node, UMLVisualIDRegistry.getType(InitialNodeFloatingNameEditPart.VISUAL_ID));
		label6034.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6034 = (Location) label6034.getLayoutConstraint();
		location6034.setX(0);
		location6034.setY(5);
		Node label5080 = createLabel(node, UMLVisualIDRegistry.getType(InitialNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5080.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5080 = (Location) label5080.getLayoutConstraint();
		location5080.setX(0);
		location5080.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActivityFinalNode_3005(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActivityFinalNode");
		Node label6033 = createLabel(node, UMLVisualIDRegistry.getType(ActivityFinalNodeFloatingNameEditPart.VISUAL_ID));
		label6033.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6033 = (Location) label6033.getLayoutConstraint();
		location6033.setX(0);
		location6033.setY(5);
		Node label5081 = createLabel(node, UMLVisualIDRegistry.getType(ActivityFinalNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5081.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5081 = (Location) label5081.getLayoutConstraint();
		location5081.setX(0);
		location5081.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createFlowFinalNode_3006(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "FlowFinalNode");
		Node label6035 = createLabel(node, UMLVisualIDRegistry.getType(FlowFinalNodeFloatingNameEditPart.VISUAL_ID));
		label6035.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6035 = (Location) label6035.getLayoutConstraint();
		location6035.setX(0);
		location6035.setY(5);
		Node label5082 = createLabel(node, UMLVisualIDRegistry.getType(FlowFinalNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5082.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5082 = (Location) label5082.getLayoutConstraint();
		location5082.setX(0);
		location5082.setY(5);
		return node;
	}

	/**
	 * @generated NOT addition of pins initialization and height adaptation to pins
	 */
	public Node createOpaqueAction_3007(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		// adapt the height to contained pins
		Bounds boundsConstraint = NotationFactory.eINSTANCE.createBounds();
		PinPositionLocator.adaptActionHeight(boundsConstraint, domainElement);
		node.setLayoutConstraint(boundsConstraint);
		node.setType(UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initForegroundFromPrefs(node, prefStore, "OpaqueAction");
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OpaqueAction");
		PreferenceInitializerForElementHelper.initBackgroundFromPrefs(node, prefStore, "OpaqueAction");
		Node label5003 = createLabel(node, UMLVisualIDRegistry.getType(OpaqueActionNameEditPart.VISUAL_ID));
		// not generated but changes include on gmfgen, can be override at the generation
		Node label6028 = createLabel(node, UMLVisualIDRegistry.getType(OpaqueActionFloatingNameEditPart.VISUAL_ID));
		label6028.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6028 = (Location) label6028.getLayoutConstraint();
		location6028.setX(0);
		location6028.setY(5);
		// Add pins
		createPins(domainElement, node, persisted, preferencesHint);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3015(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInOpaqueActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5011 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInOActLabelEditPart.VISUAL_ID));
		label5011.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5011 = (Location) label5011.getLayoutConstraint();
		location5011.setX(0);
		location5011.setY(5);
		Node label5024 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInOActValueEditPart.VISUAL_ID));
		label5024.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5024 = (Location) label5024.getLayoutConstraint();
		location5024.setX(0);
		location5024.setY(5);
		Node label5083 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInOActAppliedStereotypeEditPart.VISUAL_ID));
		label5083.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5083 = (Location) label5083.getLayoutConstraint();
		location5083.setX(0);
		location5083.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3016(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInOpaqueActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5012 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInOActLabelEditPart.VISUAL_ID));
		label5012.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5012 = (Location) label5012.getLayoutConstraint();
		location5012.setX(0);
		location5012.setY(5);
		Node label5025 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInOActValueEditPart.VISUAL_ID));
		label5025.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5025 = (Location) label5025.getLayoutConstraint();
		location5025.setX(0);
		location5025.setY(5);
		Node label5084 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInOActAppliedStereotypeEditPart.VISUAL_ID));
		label5084.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5084 = (Location) label5084.getLayoutConstraint();
		location5084.setX(0);
		location5084.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3013(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInOpaqueActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5009 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInOActLabelEditPart.VISUAL_ID));
		label5009.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5009 = (Location) label5009.getLayoutConstraint();
		location5009.setX(0);
		location5009.setY(5);
		Node label5085 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInOActAppliedStereotypeEditPart.VISUAL_ID));
		label5085.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5085 = (Location) label5085.getLayoutConstraint();
		location5085.setX(0);
		location5085.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3014(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInOpaqueActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5010 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInOActLabelEditPart.VISUAL_ID));
		label5010.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5010 = (Location) label5010.getLayoutConstraint();
		location5010.setX(0);
		location5010.setY(5);
		Node label5086 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInOActAppliedStereotypeEditPart.VISUAL_ID));
		label5086.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5086 = (Location) label5086.getLayoutConstraint();
		location5086.setX(0);
		location5086.setY(5);
		return node;
	}

	/**
	 * @generated NOT addition of pins initialization and height adaptation to pins
	 */
	public Node createCallBehaviorAction_3008(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		// adapt the height to contained pins
		Bounds boundsConstraint = NotationFactory.eINSTANCE.createBounds();
		PinPositionLocator.adaptActionHeight(boundsConstraint, domainElement);
		node.setLayoutConstraint(boundsConstraint);
		node.setType(UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initForegroundFromPrefs(node, prefStore, "CallBehaviorAction");
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CallBehaviorAction");
		PreferenceInitializerForElementHelper.initBackgroundFromPrefs(node, prefStore, "CallBehaviorAction");
		Node label5004 = createLabel(node, UMLVisualIDRegistry.getType(CallBehaviorActionNameEditPart.VISUAL_ID));
		// not generated but change include on gmfgen, can be override at the generation
		Node label6020 = createLabel(node, UMLVisualIDRegistry.getType(CallBehaviorActionFloatingNameEditPart.VISUAL_ID));
		label6020.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6020 = (Location) label6020.getLayoutConstraint();
		location6020.setX(0);
		location6020.setY(5);
		// Add pins
		createPins(domainElement, node, persisted, preferencesHint);
		return node;
	}

	/**
	 * Create pins in an action's node
	 *
	 * @param domainElement
	 *            the model action
	 * @param node
	 *            the action node
	 * @param persisted
	 *            the persisted property of views to create
	 * @param preferencesHint
	 *            the preference hint
	 * @generated NOT
	 */
	private void createPins(EObject domainElement, Shape node, boolean persisted, PreferencesHint preferencesHint) {
		if (domainElement instanceof OpaqueAction) {
			// pins of an opaque action : input values and output values
			int index = 0;
			for (InputPin pin : ((OpaqueAction) domainElement).getInputValues()) {
				if (pin instanceof ValuePin) {
					createValuePin_3015(pin, node, index, persisted, preferencesHint);
				} else if (pin instanceof ActionInputPin) {
					createActionInputPin_3016(pin, node, index, persisted, preferencesHint);
				} else {
					createInputPin_3013(pin, node, index, persisted, preferencesHint);
				}
				index++;
			}
			index = 0;
			for (OutputPin pin : ((OpaqueAction) domainElement).getOutputValues()) {
				createOutputPin_3014(pin, node, index, persisted, preferencesHint);
			}
		} else if (domainElement instanceof CallBehaviorAction) {
			// pins of a call behavior action : arguments and results
			int index = 0;
			for (InputPin pin : ((CallBehaviorAction) domainElement).getArguments()) {
				if (pin instanceof ValuePin) {
					createValuePin_3017(pin, node, index, persisted, preferencesHint);
				} else if (pin instanceof ActionInputPin) {
					createActionInputPin_3018(pin, node, index, persisted, preferencesHint);
				} else {
					createInputPin_3019(pin, node, index, persisted, preferencesHint);
				}
				index++;
			}
			index = 0;
			for (OutputPin pin : ((CallBehaviorAction) domainElement).getResults()) {
				createOutputPin_3020(pin, node, index, persisted, preferencesHint);
			}
		} else if (domainElement instanceof CallOperationAction) {
			// pins of a call operation action : arguments, target and results
			int index = 0;
			for (InputPin pin : ((CallOperationAction) domainElement).getArguments()) {
				if (pin instanceof ValuePin) {
					createValuePin_3022(pin, node, index, persisted, preferencesHint);
				} else if (pin instanceof ActionInputPin) {
					createActionInputPin_3021(pin, node, index, persisted, preferencesHint);
				} else {
					createInputPin_3023(pin, node, index, persisted, preferencesHint);
				}
				index++;
			}
			InputPin target = ((CallOperationAction) domainElement).getTarget();
			if (target instanceof ValuePin) {
				createValuePin_3025(target, node, index, persisted, preferencesHint);
			} else if (target instanceof ActionInputPin) {
				createActionInputPin_3026(target, node, index, persisted, preferencesHint);
			} else if (target != null) {
				createInputPin_3027(target, node, index, persisted, preferencesHint);
			}
			index = 0;
			for (OutputPin pin : ((CallOperationAction) domainElement).getResults()) {
				createOutputPin_3024(pin, node, index, persisted, preferencesHint);
			}
		}
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3017(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInCallBeActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5013 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCBActLabelEditPart.VISUAL_ID));
		label5013.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5013 = (Location) label5013.getLayoutConstraint();
		location5013.setX(0);
		location5013.setY(5);
		Node label5026 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCBActValueEditPart.VISUAL_ID));
		label5026.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5026 = (Location) label5026.getLayoutConstraint();
		location5026.setX(0);
		location5026.setY(5);
		Node label5087 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCBActAppliedStereotypeEditPart.VISUAL_ID));
		label5087.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5087 = (Location) label5087.getLayoutConstraint();
		location5087.setX(0);
		location5087.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3018(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInCallBeActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5014 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCBActLabelEditPart.VISUAL_ID));
		label5014.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5014 = (Location) label5014.getLayoutConstraint();
		location5014.setX(0);
		location5014.setY(5);
		Node label5027 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCBActValueEditPart.VISUAL_ID));
		label5027.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5027 = (Location) label5027.getLayoutConstraint();
		location5027.setX(0);
		location5027.setY(5);
		Node label5088 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCBActAppliedStereotypeEditPart.VISUAL_ID));
		label5088.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5088 = (Location) label5088.getLayoutConstraint();
		location5088.setX(0);
		location5088.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3019(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInCallBeActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5015 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCBActLabelEditPart.VISUAL_ID));
		label5015.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5015 = (Location) label5015.getLayoutConstraint();
		location5015.setX(0);
		location5015.setY(5);
		Node label5089 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCBActAppliedStereotypeEditPart.VISUAL_ID));
		label5089.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5089 = (Location) label5089.getLayoutConstraint();
		location5089.setX(0);
		location5089.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3020(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInCallBeActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5016 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCBActLabelEditPart.VISUAL_ID));
		label5016.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5016 = (Location) label5016.getLayoutConstraint();
		location5016.setX(0);
		location5016.setY(5);
		Node label5090 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCBActAppliedStereotypeEditPart.VISUAL_ID));
		label5090.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5090 = (Location) label5090.getLayoutConstraint();
		location5090.setX(0);
		location5090.setY(5);
		return node;
	}

	/**
	 * @generated NOT addition of pins initialization and height adaptation to pins
	 */
	public Node createCallOperationAction_3010(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		// adapt the height to contained pins
		Bounds boundsConstraint = NotationFactory.eINSTANCE.createBounds();
		PinPositionLocator.adaptActionHeight(boundsConstraint, domainElement);
		node.setLayoutConstraint(boundsConstraint);
		node.setType(UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initForegroundFromPrefs(node, prefStore, "CallOperationAction");
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CallOperationAction");
		PreferenceInitializerForElementHelper.initBackgroundFromPrefs(node, prefStore, "CallOperationAction");
		Node label5006 = createLabel(node, UMLVisualIDRegistry.getType(CallOperationActionNameEditPart.VISUAL_ID));
		// not generated but changes include on gmfgen, can be override at the generation
		Node label6020 = createLabel(node, UMLVisualIDRegistry.getType(CallOperationActionFloatingNameEditPart.VISUAL_ID));
		label6020.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6020 = (Location) label6020.getLayoutConstraint();
		location6020.setX(0);
		location6020.setY(5);
		// Add pins
		createPins(domainElement, node, persisted, preferencesHint);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3021(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInCallOpActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5017 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActLabelEditPart.VISUAL_ID));
		label5017.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5017 = (Location) label5017.getLayoutConstraint();
		location5017.setX(0);
		location5017.setY(5);
		Node label5028 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActValueEditPart.VISUAL_ID));
		label5028.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5028 = (Location) label5028.getLayoutConstraint();
		location5028.setX(0);
		location5028.setY(5);
		Node label5091 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActAppliedStereotypeEditPart.VISUAL_ID));
		label5091.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5091 = (Location) label5091.getLayoutConstraint();
		location5091.setX(0);
		location5091.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3022(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInCallOpActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5018 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActLabelEditPart.VISUAL_ID));
		label5018.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5018 = (Location) label5018.getLayoutConstraint();
		location5018.setX(0);
		location5018.setY(5);
		Node label5029 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActValueEditPart.VISUAL_ID));
		label5029.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5029 = (Location) label5029.getLayoutConstraint();
		location5029.setX(0);
		location5029.setY(5);
		Node label5092 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActAppliedStereotypeEditPart.VISUAL_ID));
		label5092.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5092 = (Location) label5092.getLayoutConstraint();
		location5092.setX(0);
		location5092.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3023(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInCallOpActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5019 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCOActLabelEditPart.VISUAL_ID));
		label5019.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5019 = (Location) label5019.getLayoutConstraint();
		location5019.setX(0);
		location5019.setY(5);
		Node label5093 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCOActAppliedStereotypeEditPart.VISUAL_ID));
		label5093.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5093 = (Location) label5093.getLayoutConstraint();
		location5093.setX(0);
		location5093.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3024(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInCallOpActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5020 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCOActLabelEditPart.VISUAL_ID));
		label5020.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5020 = (Location) label5020.getLayoutConstraint();
		location5020.setX(0);
		location5020.setY(5);
		Node label5094 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCOActAppliedStereotypeEditPart.VISUAL_ID));
		label5094.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5094 = (Location) label5094.getLayoutConstraint();
		location5094.setX(0);
		location5094.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3025(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInCallOpActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5021 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActAsTargetLabelEditPart.VISUAL_ID));
		label5021.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5021 = (Location) label5021.getLayoutConstraint();
		location5021.setX(0);
		location5021.setY(5);
		Node label5030 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActAsTargetValueEditPart.VISUAL_ID));
		label5030.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5030 = (Location) label5030.getLayoutConstraint();
		location5030.setX(0);
		location5030.setY(5);
		Node label5095 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5095.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5095 = (Location) label5095.getLayoutConstraint();
		location5095.setX(0);
		location5095.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3026(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5022 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActAsTargetLabelEditPart.VISUAL_ID));
		label5022.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5022 = (Location) label5022.getLayoutConstraint();
		location5022.setX(0);
		location5022.setY(5);
		Node label5031 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActAsTargetValueEditPart.VISUAL_ID));
		label5031.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5031 = (Location) label5031.getLayoutConstraint();
		location5031.setX(0);
		location5031.setY(5);
		Node label5096 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5096.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5096 = (Location) label5096.getLayoutConstraint();
		location5096.setX(0);
		location5096.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3027(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInCallOpActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5023 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCOActAsTargetLabelEditPart.VISUAL_ID));
		label5023.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5023 = (Location) label5023.getLayoutConstraint();
		location5023.setX(0);
		location5023.setY(5);
		Node label5097 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5097.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5097 = (Location) label5097.getLayoutConstraint();
		location5097.setX(0);
		location5097.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConstraint_3011(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Constraint");
		Node label5007 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondNameEditPart.VISUAL_ID));
		Node label5136 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintAsLocalPrecondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConstraint_3012(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Constraint");
		Node label5008 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondNameEditPart.VISUAL_ID));
		Node label5137 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintAsLocalPostcondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDecisionNode_3038(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DecisionNode");
		Node label6036 = createLabel(node, UMLVisualIDRegistry.getType(DecisionNodeFloatingNameEditPart.VISUAL_ID));
		label6036.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6036 = (Location) label6036.getLayoutConstraint();
		location6036.setX(0);
		location6036.setY(5);
		Node label5043 = createLabel(node, UMLVisualIDRegistry.getType(DecisionInputEditPart.VISUAL_ID));
		label5043.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5043 = (Location) label5043.getLayoutConstraint();
		location5043.setX(0);
		location5043.setY(5);
		Node label5098 = createLabel(node, UMLVisualIDRegistry.getType(DecisionNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5098.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5098 = (Location) label5098.getLayoutConstraint();
		location5098.setX(0);
		location5098.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createMergeNode_3039(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "MergeNode");
		Node label6037 = createLabel(node, UMLVisualIDRegistry.getType(MergeNodeFloatingNameEditPart.VISUAL_ID));
		label6037.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6037 = (Location) label6037.getLayoutConstraint();
		location6037.setX(0);
		location6037.setY(5);
		Node label5099 = createLabel(node, UMLVisualIDRegistry.getType(MergeNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5099.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5099 = (Location) label5099.getLayoutConstraint();
		location5099.setX(0);
		location5099.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createForkNode_3040(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ForkNode");
		Node label6038 = createLabel(node, UMLVisualIDRegistry.getType(ForkNodeFloatingNameEditPart.VISUAL_ID));
		label6038.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6038 = (Location) label6038.getLayoutConstraint();
		location6038.setX(0);
		location6038.setY(5);
		Node label5100 = createLabel(node, UMLVisualIDRegistry.getType(ForkNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5100.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5100 = (Location) label5100.getLayoutConstraint();
		location5100.setX(0);
		location5100.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createJoinNode_3041(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "JoinNode");
		Node label6039 = createLabel(node, UMLVisualIDRegistry.getType(JoinNodeFloatingNameEditPart.VISUAL_ID));
		label6039.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6039 = (Location) label6039.getLayoutConstraint();
		location6039.setX(0);
		location6039.setY(5);
		Node label5042 = createLabel(node, UMLVisualIDRegistry.getType(JoinSpecEditPart.VISUAL_ID));
		label5042.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5042 = (Location) label5042.getLayoutConstraint();
		location5042.setX(0);
		location5042.setY(5);
		Node label5101 = createLabel(node, UMLVisualIDRegistry.getType(JoinNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5101.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5101 = (Location) label5101.getLayoutConstraint();
		location5101.setX(0);
		location5101.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSendObjectAction_3042(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(SendObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "SendObjectAction");
		Node label5059 = createLabel(node, UMLVisualIDRegistry.getType(SendObjectActionNameEditPart.VISUAL_ID));
		Node label6027 = createLabel(node, UMLVisualIDRegistry.getType(SendObjectActionFloatingNameEditPart.VISUAL_ID));
		label6027.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6027 = (Location) label6027.getLayoutConstraint();
		location6027.setX(0);
		location6027.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3046(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInSendObjActAsReqEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5049 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsReqLabelEditPart.VISUAL_ID));
		label5049.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5049 = (Location) label5049.getLayoutConstraint();
		location5049.setX(0);
		location5049.setY(5);
		Node label5050 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsReqValueEditPart.VISUAL_ID));
		label5050.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5050 = (Location) label5050.getLayoutConstraint();
		location5050.setX(0);
		location5050.setY(5);
		Node label5102 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID));
		label5102.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5102 = (Location) label5102.getLayoutConstraint();
		location5102.setX(0);
		location5102.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3047(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsReqEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5051 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsReqLabelEditPart.VISUAL_ID));
		label5051.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5051 = (Location) label5051.getLayoutConstraint();
		location5051.setX(0);
		location5051.setY(5);
		Node label5052 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsReqValueEditPart.VISUAL_ID));
		label5052.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5052 = (Location) label5052.getLayoutConstraint();
		location5052.setX(0);
		location5052.setY(5);
		Node label5103 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID));
		label5103.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5103 = (Location) label5103.getLayoutConstraint();
		location5103.setX(0);
		location5103.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3048(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInSendObjActAsReqEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5053 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendObjActAsReqLabelEditPart.VISUAL_ID));
		label5053.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5053 = (Location) label5053.getLayoutConstraint();
		location5053.setX(0);
		location5053.setY(5);
		Node label5104 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID));
		label5104.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5104 = (Location) label5104.getLayoutConstraint();
		location5104.setX(0);
		location5104.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3049(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInSendObjActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5054 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsTargetLabelEditPart.VISUAL_ID));
		label5054.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5054 = (Location) label5054.getLayoutConstraint();
		location5054.setX(0);
		location5054.setY(5);
		Node label5055 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsTargetValueEditPart.VISUAL_ID));
		label5055.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5055 = (Location) label5055.getLayoutConstraint();
		location5055.setX(0);
		location5055.setY(5);
		Node label5105 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5105.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5105 = (Location) label5105.getLayoutConstraint();
		location5105.setX(0);
		location5105.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3050(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5056 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID));
		label5056.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5056 = (Location) label5056.getLayoutConstraint();
		location5056.setX(0);
		location5056.setY(5);
		Node label5057 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsTargetValueEditPart.VISUAL_ID));
		label5057.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5057 = (Location) label5057.getLayoutConstraint();
		location5057.setX(0);
		location5057.setY(5);
		Node label5106 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5106.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5106 = (Location) label5106.getLayoutConstraint();
		location5106.setX(0);
		location5106.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3051(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInSendObjActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5058 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID));
		label5058.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5058 = (Location) label5058.getLayoutConstraint();
		location5058.setX(0);
		location5058.setY(5);
		Node label5107 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5107.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5107 = (Location) label5107.getLayoutConstraint();
		location5107.setX(0);
		location5107.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSendSignalAction_3052(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(SendSignalActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "SendSignalAction");
		Node label5060 = createLabel(node, UMLVisualIDRegistry.getType(SendSignalActionNameEditPart.VISUAL_ID));
		Node label6032 = createLabel(node, UMLVisualIDRegistry.getType(SendSignalActionFloatingNameEditPart.VISUAL_ID));
		label6032.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6032 = (Location) label6032.getLayoutConstraint();
		location6032.setX(0);
		location6032.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3053(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInSendSigActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5061 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActLabelEditPart.VISUAL_ID));
		label5061.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5061 = (Location) label5061.getLayoutConstraint();
		location5061.setX(0);
		location5061.setY(5);
		Node label5062 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActValueEditPart.VISUAL_ID));
		label5062.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5062 = (Location) label5062.getLayoutConstraint();
		location5062.setX(0);
		location5062.setY(5);
		Node label5108 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID));
		label5108.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5108 = (Location) label5108.getLayoutConstraint();
		location5108.setX(0);
		location5108.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3054(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInSendSigActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5063 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActLabelEditPart.VISUAL_ID));
		label5063.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5063 = (Location) label5063.getLayoutConstraint();
		location5063.setX(0);
		location5063.setY(5);
		Node label5064 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActValueEditPart.VISUAL_ID));
		label5064.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5064 = (Location) label5064.getLayoutConstraint();
		location5064.setX(0);
		location5064.setY(5);
		Node label5109 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActAppliedStereotypeEditPart.VISUAL_ID));
		label5109.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5109 = (Location) label5109.getLayoutConstraint();
		location5109.setX(0);
		location5109.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3055(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInSendSigActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5065 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendSigActLabelEditPart.VISUAL_ID));
		label5065.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5065 = (Location) label5065.getLayoutConstraint();
		location5065.setX(0);
		location5065.setY(5);
		Node label5110 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID));
		label5110.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5110 = (Location) label5110.getLayoutConstraint();
		location5110.setX(0);
		location5110.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3060(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInSendSigActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5072 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActAsTargetLabelEditPart.VISUAL_ID));
		label5072.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5072 = (Location) label5072.getLayoutConstraint();
		location5072.setX(0);
		location5072.setY(5);
		Node label5073 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActAsTargetValueEditPart.VISUAL_ID));
		label5073.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5073 = (Location) label5073.getLayoutConstraint();
		location5073.setX(0);
		location5073.setY(5);
		Node label5111 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5111.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5111 = (Location) label5111.getLayoutConstraint();
		location5111.setX(0);
		location5111.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3061(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInSendSigActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5074 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID));
		label5074.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5074 = (Location) label5074.getLayoutConstraint();
		location5074.setX(0);
		location5074.setY(5);
		Node label5075 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActAsTargetValueEditPart.VISUAL_ID));
		label5075.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5075 = (Location) label5075.getLayoutConstraint();
		location5075.setX(0);
		location5075.setY(5);
		Node label5112 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5112.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5112 = (Location) label5112.getLayoutConstraint();
		location5112.setX(0);
		location5112.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3062(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInSendSigActAsTargetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5076 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID));
		label5076.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5076 = (Location) label5076.getLayoutConstraint();
		location5076.setX(0);
		location5076.setY(5);
		Node label5113 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID));
		label5113.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5113 = (Location) label5113.getLayoutConstraint();
		location5113.setX(0);
		location5113.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActivityParameterNode_3059(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActivityParameterNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActivityParameterNode");
		Node label5071 = createLabel(node, UMLVisualIDRegistry.getType(ParameterNodeNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAcceptEventAction_3063(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "AcceptEventAction");
		Node label5078 = createLabel(node, UMLVisualIDRegistry.getType(AcceptEventActionLabelEditPart.VISUAL_ID));
		Node label5079 = createLabel(node, UMLVisualIDRegistry.getType(AcceptTimeEventActionLabelEditPart.VISUAL_ID));
		label5079.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5079 = (Location) label5079.getLayoutConstraint();
		location5079.setX(0);
		location5079.setY(5);
		Node label5115 = createLabel(node, UMLVisualIDRegistry.getType(AcceptTimeEventActionAppliedStereotypeEditPart.VISUAL_ID));
		label5115.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5115 = (Location) label5115.getLayoutConstraint();
		location5115.setX(0);
		location5115.setY(5);
		Node label6040 = createLabel(node, UMLVisualIDRegistry.getType(AcceptEventActionFloatingNameEditPart.VISUAL_ID));
		label6040.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6040 = (Location) label6040.getLayoutConstraint();
		location6040.setX(0);
		location6040.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3064(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInAcceptEventActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5077 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInAcceptEventActionLabelEditPart.VISUAL_ID));
		label5077.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5077 = (Location) label5077.getLayoutConstraint();
		location5077.setX(0);
		location5077.setY(5);
		Node label5114 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInAcceptEventActionAppliedStereotypeEditPart.VISUAL_ID));
		label5114.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5114 = (Location) label5114.getLayoutConstraint();
		location5114.setX(0);
		location5114.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStructuredActivityNode_3065(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "StructuredActivityNode");
		Node label5117 = createLabel(node, UMLVisualIDRegistry.getType(StructuredActivityNodeKeywordEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "StructuredActivityNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3105(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInLoopNodeAsVariableEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5178 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInLoopNodeAsVariableLabelEditPart.VISUAL_ID));
		label5178.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5178 = (Location) label5178.getLayoutConstraint();
		location5178.setX(0);
		location5178.setY(5);
		Node label5179 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStructuredActivityNodeAppliedStereotypeEditPart.VISUAL_ID));
		label5179.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5179 = (Location) label5179.getLayoutConstraint();
		location5179.setX(0);
		location5179.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActivityPartition_3067(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActivityPartitionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActivityPartition");
		Node label5118 = createLabel(node, UMLVisualIDRegistry.getType(ActivityPartitionNameEditPart.VISUAL_ID));
		Node label6016 = createLabel(node, UMLVisualIDRegistry.getType(ActivityPartitionFloatingNameEditPart.VISUAL_ID));
		label6016.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6016 = (Location) label6016.getLayoutConstraint();
		location6016.setX(0);
		location6016.setY(5);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityPartitionActivityPartitionContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "ActivityPartition");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInterruptibleActivityRegion_3068(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InterruptibleActivityRegionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InterruptibleActivityRegion");
		createCompartment(node, UMLVisualIDRegistry.getType(InterruptibleActivityRegionInterruptibleActivityRegionContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "InterruptibleActivityRegion");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createComment_3080(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CommentEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Comment");
		Node label5138 = createLabel(node, UMLVisualIDRegistry.getType(CommentBodyLabelEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadSelfAction_3081(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadSelfActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadSelfAction");
		Node label5139 = createLabel(node, UMLVisualIDRegistry.getType(ReadSelfActionNameEditPart.VISUAL_ID));
		Node label6025 = createLabel(node, UMLVisualIDRegistry.getType(ReadSelfActionFloatingNameEditPart.VISUAL_ID));
		label6025.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6025 = (Location) label6025.getLayoutConstraint();
		location6025.setX(0);
		location6025.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3084(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadSelfActionOutputPinEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5144 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadSelfActionLabelEditPart.VISUAL_ID));
		label5144.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5144 = (Location) label5144.getLayoutConstraint();
		location5144.setX(0);
		location5144.setY(5);
		Node label5145 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadSelfActionAppliedStereotypeEditPart.VISUAL_ID));
		label5145.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5145 = (Location) label5145.getLayoutConstraint();
		location5145.setX(0);
		location5145.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActivity_3083(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActivityEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Activity");
		Node label5142 = createLabel(node, UMLVisualIDRegistry.getType(ActivityNameEditPartCN.VISUAL_ID));
		Node label5143 = createLabel(node, UMLVisualIDRegistry.getType(ActivityIsSingleExecutionCNEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityCNParametersCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityCNPreConditionsCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityCNPostConditionsCompartmentEditPart.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(ActivityCNContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "Activity");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNamedElement_3085(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ShapeNamedElementEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ShapeNamedElement");
		Node label5129 = createLabel(node, UMLVisualIDRegistry.getType(ShapeNamedElementNameEditPart.VISUAL_ID));
		label5129.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5129 = (Location) label5129.getLayoutConstraint();
		location5129.setX(25);
		location5129.setY(3);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCreateObjectAction_3086(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CreateObjectAction");
		Node label5148 = createLabel(node, UMLVisualIDRegistry.getType(CreateObjectActionNameEditPart.VISUAL_ID));
		Node label6024 = createLabel(node, UMLVisualIDRegistry.getType(CreateObjectActionFloatingNameEditPart.VISUAL_ID));
		label6024.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6024 = (Location) label6024.getLayoutConstraint();
		location6024.setX(0);
		location6024.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3087(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInCreateObjectActionAsResultEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5146 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCreateObjectActionAsResultLabelEditPart.VISUAL_ID));
		label5146.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5146 = (Location) label5146.getLayoutConstraint();
		location5146.setX(0);
		location5146.setY(5);
		Node label5147 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInCreateObjectActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5147.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5147 = (Location) label5147.getLayoutConstraint();
		location5147.setX(0);
		location5147.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadStructuralFeatureAction_3088(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadStructuralFeatureActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadStructuralFeatureAction");
		Node label5153 = createLabel(node, UMLVisualIDRegistry.getType(ReadStructuralFeatureActionNameEditPart.VISUAL_ID));
		Node label6023 = createLabel(node, UMLVisualIDRegistry.getType(ReadStructuralFeatureActionFloatingNameEditPart.VISUAL_ID));
		label6023.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6023 = (Location) label6023.getLayoutConstraint();
		location6023.setX(0);
		location6023.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3089(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInReadStructuralFeatureAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5149 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadStructuralFeatureAsObjectLabelEditPart.VISUAL_ID));
		label5149.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5149 = (Location) label5149.getLayoutConstraint();
		location5149.setX(0);
		location5149.setY(5);
		Node label5150 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadStructuralFeatureAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5150.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5150 = (Location) label5150.getLayoutConstraint();
		location5150.setX(0);
		location5150.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3090(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReadStructuralFeatureAsResultEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5151 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadStructuralFeatureAsResultLabelEditPart.VISUAL_ID));
		label5151.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5151 = (Location) label5151.getLayoutConstraint();
		location5151.setX(0);
		location5151.setY(5);
		Node label5152 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadStructuralFeatureAsResultWrappingLabelEditPart.VISUAL_ID));
		label5152.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5152 = (Location) label5152.getLayoutConstraint();
		location5152.setX(0);
		location5152.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAddStructuralFeatureValueAction_3091(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "AddStructuralFeatureValueAction");
		Node label5160 = createLabel(node, UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionNameEditPart.VISUAL_ID));
		Node label6019 = createLabel(node, UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionFloatingNameEditPart.VISUAL_ID));
		label6019.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6019 = (Location) label6019.getLayoutConstraint();
		location6019.setX(0);
		location6019.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3092(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5154 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsObjectLabelEditPart.VISUAL_ID));
		label5154.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5154 = (Location) label5154.getLayoutConstraint();
		location5154.setX(0);
		location5154.setY(5);
		Node label5155 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5155.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5155 = (Location) label5155.getLayoutConstraint();
		location5155.setX(0);
		location5155.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3093(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5156 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsValueLabel2EditPart.VISUAL_ID));
		label5156.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5156 = (Location) label5156.getLayoutConstraint();
		location5156.setX(0);
		location5156.setY(5);
		Node label5157 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddStructuralFeatureValueActionAsValueAppliedStereotypeWrappingLabel2EditPart.VISUAL_ID));
		label5157.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5157 = (Location) label5157.getLayoutConstraint();
		location5157.setX(0);
		location5157.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3094(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInAddStructuralFeatureValueActionAsResultEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5158 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInAddStructuralFeatureValueActionAsResultLabel3EditPart.VISUAL_ID));
		label5158.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5158 = (Location) label5158.getLayoutConstraint();
		location5158.setX(0);
		location5158.setY(5);
		Node label5159 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInAddStructuralFeatureValueActionAsResultAppliedStereotypeWrappingLabel3EditPart.VISUAL_ID));
		label5159.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5159 = (Location) label5159.getLayoutConstraint();
		location5159.setX(0);
		location5159.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDestroyObjectAction_3095(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DestroyObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DestroyObjectAction");
		Node label5163 = createLabel(node, UMLVisualIDRegistry.getType(DestroyObjectActionNameEditPart.VISUAL_ID));
		Node label6022 = createLabel(node, UMLVisualIDRegistry.getType(DestroyObjectActionFloatingNameEditPart.VISUAL_ID));
		label6022.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6022 = (Location) label6022.getLayoutConstraint();
		location6022.setX(0);
		location6022.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3096(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInDestroyObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5161 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInDestroyObjectActionLabelEditPart.VISUAL_ID));
		label5161.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5161 = (Location) label5161.getLayoutConstraint();
		location5161.setX(0);
		location5161.setY(5);
		Node label5162 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5162.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5162 = (Location) label5162.getLayoutConstraint();
		location5162.setX(0);
		location5162.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadVariableAction_3097(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadVariableActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadVariableAction");
		Node label5166 = createLabel(node, UMLVisualIDRegistry.getType(ReadVariableActionNameEditPart.VISUAL_ID));
		Node label6021 = createLabel(node, UMLVisualIDRegistry.getType(ReadVariableActionFloatingNameEditPart.VISUAL_ID));
		label6021.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6021 = (Location) label6021.getLayoutConstraint();
		location6021.setX(0);
		location6021.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3098(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReadVariableActionAsResultEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5164 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadVariableActionAsResultLabelEditPart.VISUAL_ID));
		label5164.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5164 = (Location) label5164.getLayoutConstraint();
		location5164.setX(0);
		location5164.setY(5);
		Node label5165 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadVariableActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5165.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5165 = (Location) label5165.getLayoutConstraint();
		location5165.setX(0);
		location5165.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAddVariableValueAction_3099(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(AddVariableValueActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "AddVariableValueAction");
		Node label5171 = createLabel(node, UMLVisualIDRegistry.getType(AddVariableValueActionNameEditPart.VISUAL_ID));
		Node label6018 = createLabel(node, UMLVisualIDRegistry.getType(AddVariableValueActionFloatingNameEditPart.VISUAL_ID));
		label6018.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6018 = (Location) label6018.getLayoutConstraint();
		location6018.setX(0);
		location6018.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3100(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5167 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID));
		label5167.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5167 = (Location) label5167.getLayoutConstraint();
		location5167.setX(0);
		location5167.setY(5);
		Node label5168 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5168.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5168 = (Location) label5168.getLayoutConstraint();
		location5168.setX(0);
		location5168.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3101(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5169 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID));
		label5169.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5169 = (Location) label5169.getLayoutConstraint();
		location5169.setX(0);
		location5169.setY(5);
		Node label5170 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5170.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5170 = (Location) label5170.getLayoutConstraint();
		location5170.setX(0);
		location5170.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createBroadcastSignalAction_3102(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(BroadcastSignalActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "BroadcastSignalAction");
		Node label5175 = createLabel(node, UMLVisualIDRegistry.getType(BroadcastSignalActionNameEditPart.VISUAL_ID));
		Node label6017 = createLabel(node, UMLVisualIDRegistry.getType(BroadcastSignalActionFloatingNameEditPart.VISUAL_ID));
		label6017.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6017 = (Location) label6017.getLayoutConstraint();
		location6017.setX(0);
		location6017.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3103(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInBroadcastSignalActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5172 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInBroadcastSignalActionLabelEditPart.VISUAL_ID));
		label5172.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5172 = (Location) label5172.getLayoutConstraint();
		location5172.setX(0);
		location5172.setY(5);
		Node label5173 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID));
		label5173.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5173 = (Location) label5173.getLayoutConstraint();
		location5173.setX(0);
		location5173.setY(5);
		Node label5174 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID));
		label5174.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5174 = (Location) label5174.getLayoutConstraint();
		location5174.setX(0);
		location5174.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCentralBufferNode_3104(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CentralBufferNode");
		Node label5176 = createLabel(node, UMLVisualIDRegistry.getType(CentralBufferNodeLabelEditPart.VISUAL_ID));
		Node label5177 = createLabel(node, UMLVisualIDRegistry.getType(CentralBufferNodeSelectionEditPart.VISUAL_ID));
		label5177.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5177 = (Location) label5177.getLayoutConstraint();
		location5177.setX(0);
		location5177.setY(5);
		Node label6030 = createLabel(node, UMLVisualIDRegistry.getType(CentralBufferNodeFloatingNameEditPart.VISUAL_ID));
		label6030.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6030 = (Location) label6030.getLayoutConstraint();
		location6030.setX(0);
		location6030.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConstraint_3112(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ConstraintEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Constraint");
		Node label5189 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintNameEditPartCN.VISUAL_ID));
		Node label5190 = createLabel(node, UMLVisualIDRegistry.getType(ConstraintBodyEditPartCN.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStartObjectBehaviorAction_3113(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(StartObjectBehavoiurActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "StartObjectBehaviourAction");
		Node label5191 = createLabel(node, UMLVisualIDRegistry.getType(StartObjectBehaviorActionNameEditPart.VISUAL_ID));
		Node label5394 = createLabel(node, UMLVisualIDRegistry.getType(StartObjectBehaviorActionFloatingNameEditPart.VISUAL_ID));
		label5394.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5394 = (Location) label5394.getLayoutConstraint();
		location5394.setX(0);
		location5394.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3125(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInStartObjectBehaviorActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5203 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInStartObjectBehaviorActionLabelEditPart.VISUAL_ID));
		label5203.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5203 = (Location) label5203.getLayoutConstraint();
		location5203.setX(0);
		location5203.setY(5);
		Node label5204 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInStartObjectBehaviorActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5204.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5204 = (Location) label5204.getLayoutConstraint();
		location5204.setX(0);
		location5204.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3132(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5217 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5217.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5217 = (Location) label5217.getLayoutConstraint();
		location5217.setX(0);
		location5217.setY(5);
		Node label5218 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5218.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5218 = (Location) label5218.getLayoutConstraint();
		location5218.setX(0);
		location5218.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3145(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5245 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5245.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5245 = (Location) label5245.getLayoutConstraint();
		location5245.setX(0);
		location5245.setY(5);
		Node label5246 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID));
		label5246.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5246 = (Location) label5246.getLayoutConstraint();
		location5246.setX(0);
		location5246.setY(5);
		Node label5247 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5247.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5247 = (Location) label5247.getLayoutConstraint();
		location5247.setX(0);
		location5247.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3158(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5263 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5263.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5263 = (Location) label5263.getLayoutConstraint();
		location5263.setX(0);
		location5263.setY(5);
		Node label5264 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID));
		label5264.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5264 = (Location) label5264.getLayoutConstraint();
		location5264.setX(0);
		location5264.setY(5);
		Node label5265 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5265.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5265 = (Location) label5265.getLayoutConstraint();
		location5265.setX(0);
		location5265.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3133(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5219 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID));
		label5219.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5219 = (Location) label5219.getLayoutConstraint();
		location5219.setX(0);
		location5219.setY(5);
		Node label5220 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5220.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5220 = (Location) label5220.getLayoutConstraint();
		location5220.setX(0);
		location5220.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3146(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5248 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID));
		label5248.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5248 = (Location) label5248.getLayoutConstraint();
		location5248.setX(0);
		location5248.setY(5);
		Node label5249 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID));
		label5249.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5249 = (Location) label5249.getLayoutConstraint();
		location5249.setX(0);
		location5249.setY(5);
		Node label5250 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5250.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5250 = (Location) label5250.getLayoutConstraint();
		location5250.setX(0);
		location5250.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3159(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsArgumentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5266 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID));
		label5266.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5266 = (Location) label5266.getLayoutConstraint();
		location5266.setX(0);
		location5266.setY(5);
		Node label5267 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID));
		label5267.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5267 = (Location) label5267.getLayoutConstraint();
		location5267.setX(0);
		location5267.setY(5);
		Node label5268 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5268.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5268 = (Location) label5268.getLayoutConstraint();
		location5268.setX(0);
		location5268.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTestIdentityAction_3114(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TestIdentityActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "TestIdentityAction");
		Node label5192 = createLabel(node, UMLVisualIDRegistry.getType(TestIdentityActionNameEditPart.VISUAL_ID));
		Node label5395 = createLabel(node, UMLVisualIDRegistry.getType(TestIdentityActionFloatingNameEditPart.VISUAL_ID));
		label5395.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5395 = (Location) label5395.getLayoutConstraint();
		location5395.setX(0);
		location5395.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3126(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInTestIdentityActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5205 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInTestIdentityActionItemLabelEditPart.VISUAL_ID));
		label5205.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5205 = (Location) label5205.getLayoutConstraint();
		location5205.setX(0);
		location5205.setY(5);
		Node label5206 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInTestIdentityActionItemAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5206.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5206 = (Location) label5206.getLayoutConstraint();
		location5206.setX(0);
		location5206.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3134(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsFirstEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5221 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID));
		label5221.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5221 = (Location) label5221.getLayoutConstraint();
		location5221.setX(0);
		location5221.setY(5);
		Node label5222 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5222.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5222 = (Location) label5222.getLayoutConstraint();
		location5222.setX(0);
		location5222.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3135(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsSecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5223 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID));
		label5223.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5223 = (Location) label5223.getLayoutConstraint();
		location5223.setX(0);
		location5223.setY(5);
		Node label5224 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5224.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5224 = (Location) label5224.getLayoutConstraint();
		location5224.setX(0);
		location5224.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3147(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsFirstEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5251 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID));
		label5251.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5251 = (Location) label5251.getLayoutConstraint();
		location5251.setX(0);
		location5251.setY(5);
		Node label5252 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID));
		label5252.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5252 = (Location) label5252.getLayoutConstraint();
		location5252.setX(0);
		location5252.setY(5);
		Node label5253 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5253.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5253 = (Location) label5253.getLayoutConstraint();
		location5253.setX(0);
		location5253.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3148(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsSecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5254 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID));
		label5254.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5254 = (Location) label5254.getLayoutConstraint();
		location5254.setX(0);
		location5254.setY(5);
		Node label5255 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID));
		label5255.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5255 = (Location) label5255.getLayoutConstraint();
		location5255.setX(0);
		location5255.setY(5);
		Node label5256 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5256.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5256 = (Location) label5256.getLayoutConstraint();
		location5256.setX(0);
		location5256.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3160(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsFirstEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5269 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID));
		label5269.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5269 = (Location) label5269.getLayoutConstraint();
		location5269.setX(0);
		location5269.setY(5);
		Node label5270 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID));
		label5270.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5270 = (Location) label5270.getLayoutConstraint();
		location5270.setX(0);
		location5270.setY(5);
		Node label5271 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5271.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5271 = (Location) label5271.getLayoutConstraint();
		location5271.setX(0);
		location5271.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3161(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsSecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5272 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID));
		label5272.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5272 = (Location) label5272.getLayoutConstraint();
		location5272.setX(0);
		location5272.setY(5);
		Node label5273 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID));
		label5273.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5273 = (Location) label5273.getLayoutConstraint();
		location5273.setX(0);
		location5273.setY(5);
		Node label5274 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5274.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5274 = (Location) label5274.getLayoutConstraint();
		location5274.setX(0);
		location5274.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createClearStructuralFeatureAction_3115(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ClearStructuralFeatureActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ClearStructuralFeatureAction");
		Node label5193 = createLabel(node, UMLVisualIDRegistry.getType(ClearStructuralFeatureActionNameEditPart.VISUAL_ID));
		Node label5396 = createLabel(node, UMLVisualIDRegistry.getType(ClearStructuralFeatureActionFloatingNameEditPart.VISUAL_ID));
		label5396.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5396 = (Location) label5396.getLayoutConstraint();
		location5396.setX(0);
		location5396.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3127(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInClearStructuralFeatureActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5207 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInClearStructuralFeatureActionLabelEditPart.VISUAL_ID));
		label5207.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5207 = (Location) label5207.getLayoutConstraint();
		location5207.setX(0);
		location5207.setY(5);
		Node label5208 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInClearStructuralFeatureActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5208.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5208 = (Location) label5208.getLayoutConstraint();
		location5208.setX(0);
		location5208.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3136(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5225 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID));
		label5225.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5225 = (Location) label5225.getLayoutConstraint();
		location5225.setX(0);
		location5225.setY(5);
		Node label5226 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5226.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5226 = (Location) label5226.getLayoutConstraint();
		location5226.setX(0);
		location5226.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3149(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5260 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID));
		label5260.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5260 = (Location) label5260.getLayoutConstraint();
		location5260.setX(0);
		location5260.setY(5);
		Node label5261 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID));
		label5261.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5261 = (Location) label5261.getLayoutConstraint();
		location5261.setX(0);
		location5261.setY(5);
		Node label5262 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5262.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5262 = (Location) label5262.getLayoutConstraint();
		location5262.setX(0);
		location5262.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3162(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInClearStructuralFeatureActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5275 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID));
		label5275.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5275 = (Location) label5275.getLayoutConstraint();
		location5275.setX(0);
		location5275.setY(5);
		Node label5276 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID));
		label5276.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5276 = (Location) label5276.getLayoutConstraint();
		location5276.setX(0);
		location5276.setY(5);
		Node label5277 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInClearStructFeatActAsObjectAppliedStereotypeEditPart.VISUAL_ID));
		label5277.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5277 = (Location) label5277.getLayoutConstraint();
		location5277.setX(0);
		location5277.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCreateLinkAction_3117(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CreateLinkActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CreateLinkAction");
		Node label5195 = createLabel(node, UMLVisualIDRegistry.getType(CreateLinkActionNameEditPart.VISUAL_ID));
		Node label5397 = createLabel(node, UMLVisualIDRegistry.getType(CreateLinkActionFloatingNameEditPart.VISUAL_ID));
		label5397.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5397 = (Location) label5397.getLayoutConstraint();
		location5397.setX(0);
		location5397.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3137(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5227 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5227.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5227 = (Location) label5227.getLayoutConstraint();
		location5227.setX(0);
		location5227.setY(5);
		Node label5228 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5228.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5228 = (Location) label5228.getLayoutConstraint();
		location5228.setX(0);
		location5228.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3151(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInCreateLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5281 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5281.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5281 = (Location) label5281.getLayoutConstraint();
		location5281.setX(0);
		location5281.setY(5);
		Node label5282 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5282.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5282 = (Location) label5282.getLayoutConstraint();
		location5282.setX(0);
		location5282.setY(5);
		Node label5283 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5283.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5283 = (Location) label5283.getLayoutConstraint();
		location5283.setX(0);
		location5283.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3163(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInCreateLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5278 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5278.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5278 = (Location) label5278.getLayoutConstraint();
		location5278.setX(0);
		location5278.setY(5);
		Node label5279 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5279.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5279 = (Location) label5279.getLayoutConstraint();
		location5279.setX(0);
		location5279.setY(5);
		Node label5280 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5280.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5280 = (Location) label5280.getLayoutConstraint();
		location5280.setX(0);
		location5280.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadLinkAction_3116(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadLinkActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadLinkAction");
		Node label5194 = createLabel(node, UMLVisualIDRegistry.getType(ReadLinkActionNameEditPart.VISUAL_ID));
		Node label5398 = createLabel(node, UMLVisualIDRegistry.getType(ReadLinkActionFloatingNameEditPart.VISUAL_ID));
		label5398.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5398 = (Location) label5398.getLayoutConstraint();
		location5398.setX(0);
		location5398.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3128(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReadLinkActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5209 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadLinkActionLabelEditPart.VISUAL_ID));
		label5209.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5209 = (Location) label5209.getLayoutConstraint();
		location5209.setX(0);
		location5209.setY(5);
		Node label5210 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadLinkActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5210.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5210 = (Location) label5210.getLayoutConstraint();
		location5210.setX(0);
		location5210.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3138(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5229 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5229.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5229 = (Location) label5229.getLayoutConstraint();
		location5229.setX(0);
		location5229.setY(5);
		Node label5230 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5230.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5230 = (Location) label5230.getLayoutConstraint();
		location5230.setX(0);
		location5230.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3150(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInReadLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5287 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5287.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5287 = (Location) label5287.getLayoutConstraint();
		location5287.setX(0);
		location5287.setY(5);
		Node label5288 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5288.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5288 = (Location) label5288.getLayoutConstraint();
		location5288.setX(0);
		location5288.setY(5);
		Node label5289 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5289.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5289 = (Location) label5289.getLayoutConstraint();
		location5289.setX(0);
		location5289.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3164(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInReadLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5284 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5284.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5284 = (Location) label5284.getLayoutConstraint();
		location5284.setX(0);
		location5284.setY(5);
		Node label5285 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5285.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5285 = (Location) label5285.getLayoutConstraint();
		location5285.setX(0);
		location5285.setY(5);
		Node label5286 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5286.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5286 = (Location) label5286.getLayoutConstraint();
		location5286.setX(0);
		location5286.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDestroyLinkAction_3118(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DestroyLinkActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DestroyLinkAction");
		Node label5196 = createLabel(node, UMLVisualIDRegistry.getType(DestroyLinkActionNameEditPart.VISUAL_ID));
		Node label5399 = createLabel(node, UMLVisualIDRegistry.getType(DestroyLinkActionFloatingNameEditPart.VISUAL_ID));
		label5399.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5399 = (Location) label5399.getLayoutConstraint();
		location5399.setX(0);
		location5399.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3139(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5231 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5231.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5231 = (Location) label5231.getLayoutConstraint();
		location5231.setX(0);
		location5231.setY(5);
		Node label5232 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5232.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5232 = (Location) label5232.getLayoutConstraint();
		location5232.setX(0);
		location5232.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3152(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5290 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5290.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5290 = (Location) label5290.getLayoutConstraint();
		location5290.setX(0);
		location5290.setY(5);
		Node label5291 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5291.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5291 = (Location) label5291.getLayoutConstraint();
		location5291.setX(0);
		location5291.setY(5);
		Node label5292 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5292.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5292 = (Location) label5292.getLayoutConstraint();
		location5292.setX(0);
		location5292.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3165(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionInputPinInDestroyLinkActionAsInputValueEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5293 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID));
		label5293.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5293 = (Location) label5293.getLayoutConstraint();
		location5293.setX(0);
		location5293.setY(5);
		Node label5294 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID));
		label5294.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5294 = (Location) label5294.getLayoutConstraint();
		location5294.setX(0);
		location5294.setY(5);
		Node label5295 = createLabel(node, UMLVisualIDRegistry.getType(ActionInputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5295.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5295 = (Location) label5295.getLayoutConstraint();
		location5295.setX(0);
		location5295.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createClearAssociationAction_3119(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ClearAssociationActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ClearAssotiationAction");
		Node label5197 = createLabel(node, UMLVisualIDRegistry.getType(ClearAssociationActionNameEditPart.VISUAL_ID));
		Node label5400 = createLabel(node, UMLVisualIDRegistry.getType(ClearAssociationActionFloatingNameEditPart.VISUAL_ID));
		label5400.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5400 = (Location) label5400.getLayoutConstraint();
		location5400.setX(0);
		location5400.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3140(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInClearAssociationActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5235 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID));
		label5235.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5235 = (Location) label5235.getLayoutConstraint();
		location5235.setX(0);
		location5235.setY(5);
		Node label5236 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5236.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5236 = (Location) label5236.getLayoutConstraint();
		location5236.setX(0);
		location5236.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3153(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInClearAssociationActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5296 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID));
		label5296.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5296 = (Location) label5296.getLayoutConstraint();
		location5296.setX(0);
		location5296.setY(5);
		Node label5297 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID));
		label5297.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5297 = (Location) label5297.getLayoutConstraint();
		location5297.setX(0);
		location5297.setY(5);
		Node label5298 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5298.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5298 = (Location) label5298.getLayoutConstraint();
		location5298.setX(0);
		location5298.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3166(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInClearAssociationActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5299 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID));
		label5299.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5299 = (Location) label5299.getLayoutConstraint();
		location5299.setX(0);
		location5299.setY(5);
		Node label5300 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID));
		label5300.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5300 = (Location) label5300.getLayoutConstraint();
		location5300.setX(0);
		location5300.setY(5);
		Node label5301 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5301.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5301 = (Location) label5301.getLayoutConstraint();
		location5301.setX(0);
		location5301.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadExtentAction_3120(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadExtentActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadExtentAction");
		Node label5198 = createLabel(node, UMLVisualIDRegistry.getType(ReadExtentActionNameEditPart.VISUAL_ID));
		Node label5402 = createLabel(node, UMLVisualIDRegistry.getType(ReadExtentActionFloatingNameEditPart.VISUAL_ID));
		label5402.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5402 = (Location) label5402.getLayoutConstraint();
		location5402.setX(0);
		location5402.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3129(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReadExtentActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5211 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadExtentActionLabelEditPart.VISUAL_ID));
		label5211.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5211 = (Location) label5211.getLayoutConstraint();
		location5211.setX(0);
		location5211.setY(5);
		Node label5212 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadExtentActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5212.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5212 = (Location) label5212.getLayoutConstraint();
		location5212.setX(0);
		location5212.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReclassifyObjectAction_3121(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReclassifyObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReclassifyObjectAction");
		Node label5199 = createLabel(node, UMLVisualIDRegistry.getType(ReclassifyObjectActionNameEditPart.VISUAL_ID));
		Node label5401 = createLabel(node, UMLVisualIDRegistry.getType(ReclassifyObjectActionFloatingNameEditPart.VISUAL_ID));
		label5401.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5401 = (Location) label5401.getLayoutConstraint();
		location5401.setX(0);
		location5401.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3141(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5237 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5237.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5237 = (Location) label5237.getLayoutConstraint();
		location5237.setX(0);
		location5237.setY(5);
		Node label5238 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5238.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5238 = (Location) label5238.getLayoutConstraint();
		location5238.setX(0);
		location5238.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3154(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5302 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5302.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5302 = (Location) label5302.getLayoutConstraint();
		location5302.setX(0);
		location5302.setY(5);
		Node label5303 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID));
		label5303.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5303 = (Location) label5303.getLayoutConstraint();
		location5303.setX(0);
		location5303.setY(5);
		Node label5304 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5304.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5304 = (Location) label5304.getLayoutConstraint();
		location5304.setX(0);
		location5304.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3167(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInReclassifyObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5305 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5305.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5305 = (Location) label5305.getLayoutConstraint();
		location5305.setX(0);
		location5305.setY(5);
		Node label5306 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID));
		label5306.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5306 = (Location) label5306.getLayoutConstraint();
		location5306.setX(0);
		location5306.setY(5);
		Node label5307 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5307.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5307 = (Location) label5307.getLayoutConstraint();
		location5307.setX(0);
		location5307.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReadIsClassifiedObjectAction_3122(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReadIsClassifiedObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReadIsClassifiedObjectAction");
		Node label5200 = createLabel(node, UMLVisualIDRegistry.getType(ReadIsClassifiedObjectActionNameEditPart.VISUAL_ID));
		Node label5403 = createLabel(node, UMLVisualIDRegistry.getType(ReadIsClassifiedObjectActionFloatingNameEditPart.VISUAL_ID));
		label5403.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5403 = (Location) label5403.getLayoutConstraint();
		location5403.setX(0);
		location5403.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3130(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReadIsClassifiedObjectActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5213 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadIsClassifiedObjectActionLabelEditPart.VISUAL_ID));
		label5213.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5213 = (Location) label5213.getLayoutConstraint();
		location5213.setX(0);
		location5213.setY(5);
		Node label5214 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReadIsClassifiedObjectActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5214.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5214 = (Location) label5214.getLayoutConstraint();
		location5214.setX(0);
		location5214.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3142(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5239 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5239.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5239 = (Location) label5239.getLayoutConstraint();
		location5239.setX(0);
		location5239.setY(5);
		Node label5240 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5240.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5240 = (Location) label5240.getLayoutConstraint();
		location5240.setX(0);
		location5240.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3155(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5308 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5308.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5308 = (Location) label5308.getLayoutConstraint();
		location5308.setX(0);
		location5308.setY(5);
		Node label5309 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID));
		label5309.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5309 = (Location) label5309.getLayoutConstraint();
		location5309.setX(0);
		location5309.setY(5);
		Node label5310 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5310.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5310 = (Location) label5310.getLayoutConstraint();
		location5310.setX(0);
		location5310.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3168(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInReadIsClassifiedObjectActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5311 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID));
		label5311.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5311 = (Location) label5311.getLayoutConstraint();
		location5311.setX(0);
		location5311.setY(5);
		Node label5312 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID));
		label5312.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5312 = (Location) label5312.getLayoutConstraint();
		location5312.setX(0);
		location5312.setY(5);
		Node label5313 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5313.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5313 = (Location) label5313.getLayoutConstraint();
		location5313.setX(0);
		location5313.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createReduceAction_3123(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ReduceActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ReduceAction");
		Node label5201 = createLabel(node, UMLVisualIDRegistry.getType(ReduceActionNameEditPart.VISUAL_ID));
		Node label5404 = createLabel(node, UMLVisualIDRegistry.getType(ReduceActionFloatingNameEditPart.VISUAL_ID));
		label5404.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5404 = (Location) label5404.getLayoutConstraint();
		location5404.setX(0);
		location5404.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3131(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInReduceActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5215 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReduceActionLabelEditPart.VISUAL_ID));
		label5215.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5215 = (Location) label5215.getLayoutConstraint();
		location5215.setX(0);
		location5215.setY(5);
		Node label5216 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInReduceActionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5216.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5216 = (Location) label5216.getLayoutConstraint();
		location5216.setX(0);
		location5216.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3143(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInReduceActionAsCollectionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5241 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID));
		label5241.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5241 = (Location) label5241.getLayoutConstraint();
		location5241.setX(0);
		location5241.setY(5);
		Node label5242 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5242.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5242 = (Location) label5242.getLayoutConstraint();
		location5242.setX(0);
		location5242.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3156(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInReduceActionAsCollectionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5314 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReduceActionAsCollectionLabelEditPart.VISUAL_ID));
		label5314.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5314 = (Location) label5314.getLayoutConstraint();
		location5314.setX(0);
		location5314.setY(5);
		Node label5315 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReduceActionAsCollectionValueEditPart.VISUAL_ID));
		label5315.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5315 = (Location) label5315.getLayoutConstraint();
		location5315.setX(0);
		location5315.setY(5);
		Node label5316 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5316.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5316 = (Location) label5316.getLayoutConstraint();
		location5316.setX(0);
		location5316.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3169(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInReduceActionAsCollectionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5317 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID));
		label5317.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5317 = (Location) label5317.getLayoutConstraint();
		location5317.setX(0);
		location5317.setY(5);
		Node label5318 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReduceActionAsCollectionValueEditPart.VISUAL_ID));
		label5318.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5318 = (Location) label5318.getLayoutConstraint();
		location5318.setX(0);
		location5318.setY(5);
		Node label5319 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5319.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5319 = (Location) label5319.getLayoutConstraint();
		location5319.setX(0);
		location5319.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStartClassifierBehaviorAction_3124(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(StartClassifierBehaviorActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "StartClassifierBehaviourAction");
		Node label5202 = createLabel(node, UMLVisualIDRegistry.getType(StartClassifierBehaviorActionNameEditPart.VISUAL_ID));
		Node label5405 = createLabel(node, UMLVisualIDRegistry.getType(StartClassifierBehaviorActionFloatingNameEditPart.VISUAL_ID));
		label5405.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5405 = (Location) label5405.getLayoutConstraint();
		location5405.setX(0);
		location5405.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInputPin_3144(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InputPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "InputPin");
		Node label5243 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5243.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5243 = (Location) label5243.getLayoutConstraint();
		location5243.setX(0);
		location5243.setY(5);
		Node label5244 = createLabel(node, UMLVisualIDRegistry.getType(InputPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5244.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5244 = (Location) label5244.getLayoutConstraint();
		location5244.setX(0);
		location5244.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValuePin_3157(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValuePinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValuePin");
		Node label5320 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5320.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5320 = (Location) label5320.getLayoutConstraint();
		location5320.setX(0);
		location5320.setY(5);
		Node label5321 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID));
		label5321.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5321 = (Location) label5321.getLayoutConstraint();
		location5321.setX(0);
		location5321.setY(5);
		Node label5322 = createLabel(node, UMLVisualIDRegistry.getType(ValuePinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5322.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5322 = (Location) label5322.getLayoutConstraint();
		location5322.setX(0);
		location5322.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActionInputPin_3170(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ActionPinInStartClassifierBehaviorActionAsObjectEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ActionInputPin");
		Node label5323 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID));
		label5323.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5323 = (Location) label5323.getLayoutConstraint();
		location5323.setX(0);
		location5323.setY(5);
		Node label5324 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID));
		label5324.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5324 = (Location) label5324.getLayoutConstraint();
		location5324.setX(0);
		location5324.setY(5);
		Node label5325 = createLabel(node, UMLVisualIDRegistry.getType(ActionPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID));
		label5325.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5325 = (Location) label5325.getLayoutConstraint();
		location5325.setX(0);
		location5325.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createValueSpecificationAction_3076(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ValueSpecificationActionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ValueSpecificationAction");
		Node label5126 = createLabel(node, UMLVisualIDRegistry.getType(ValueSpecificationActionNameEditPart.VISUAL_ID));
		Node label6026 = createLabel(node, UMLVisualIDRegistry.getType(ValueSpecificationActionFloatingNameEditPart.VISUAL_ID));
		label6026.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6026 = (Location) label6026.getLayoutConstraint();
		location6026.setX(0);
		location6026.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3077(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInValSpecActEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5124 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInValSpecActLabelEditPart.VISUAL_ID));
		label5124.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5124 = (Location) label5124.getLayoutConstraint();
		location5124.setX(0);
		location5124.setY(5);
		Node label5125 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInValSpecActAppliedStereotypeEditPart.VISUAL_ID));
		label5125.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5125 = (Location) label5125.getLayoutConstraint();
		location5125.setX(0);
		location5125.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDataStoreNode_3078(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DataStoreNode");
		Node label5127 = createLabel(node, UMLVisualIDRegistry.getType(DataStoreNodeLabelEditPart.VISUAL_ID));
		Node label5128 = createLabel(node, UMLVisualIDRegistry.getType(DataStoreSelectionEditPart.VISUAL_ID));
		label5128.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5128 = (Location) label5128.getLayoutConstraint();
		location5128.setX(0);
		location5128.setY(5);
		Node label6031 = createLabel(node, UMLVisualIDRegistry.getType(DataStoreNodeFloatingNameEditPart.VISUAL_ID));
		label6031.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6031 = (Location) label6031.getLayoutConstraint();
		location6031.setX(0);
		location6031.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createConditionalNode_3069(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ConditionalNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ConditionalNode");
		Node label5119 = createLabel(node, UMLVisualIDRegistry.getType(ConditionalNodeKeywordEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(ConditionalNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "ConditionalNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createExpansionRegion_3070(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ExpansionRegionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ExpansionRegion");
		Node label5120 = createLabel(node, UMLVisualIDRegistry.getType(ExpansionRegionKeywordEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(ExpansionRegionStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "ExpansionRegion");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createExpansionNode_3074(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ExpansionNodeAsInEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ExpansionNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createExpansionNode_3075(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(ExpansionNodeAsOutEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "ExpansionNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLoopNode_3071(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(LoopNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "LoopNode");
		Node label5121 = createLabel(node, UMLVisualIDRegistry.getType(LoopNodeKeywordEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(LoopNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "LoopNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3109(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsBodyOutputEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5184 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsBodyOutputLabelEditPart.VISUAL_ID));
		label5184.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5184 = (Location) label5184.getLayoutConstraint();
		location5184.setX(0);
		location5184.setY(5);
		Node label5185 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsBodyOutputAppliedStereotypeEditPart.VISUAL_ID));
		label5185.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5185 = (Location) label5185.getLayoutConstraint();
		location5185.setX(0);
		location5185.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3110(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsLoopVariableEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5186 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsLoopVariableLabelEditPart.VISUAL_ID));
		label5186.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5186 = (Location) label5186.getLayoutConstraint();
		location5186.setX(0);
		location5186.setY(5);
		Node label5183 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsLoopVariableAppliedStereotypeEditPart.VISUAL_ID));
		label5183.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5183 = (Location) label5183.getLayoutConstraint();
		location5183.setX(0);
		location5183.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOutputPin_3111(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsResultEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OutputPin");
		Node label5187 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsResultLabelEditPart.VISUAL_ID));
		label5187.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5187 = (Location) label5187.getLayoutConstraint();
		location5187.setX(0);
		location5187.setY(5);
		Node label5188 = createLabel(node, UMLVisualIDRegistry.getType(OutputPinInLoopNodeAsResultAppliedStereotypeEditPart.VISUAL_ID));
		label5188.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location5188 = (Location) label5188.getLayoutConstraint();
		location5188.setX(0);
		location5188.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSequenceNode_3073(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(SequenceNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "SequenceNode");
		Node label5123 = createLabel(node, UMLVisualIDRegistry.getType(SequenceNodeKeywordEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(SequenceNodeStructuredActivityNodeContentCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "SequenceNode");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createIntervalConstraint_3032(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPrecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "IntervalConstraint");
		Node label5036 = createLabel(node, UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPrecondNameEditPart.VISUAL_ID));
		Node label5134 = createLabel(node, UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPrecondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createIntervalConstraint_3033(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPostcondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "IntervalConstraint");
		Node label5037 = createLabel(node, UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPostcondNameEditPart.VISUAL_ID));
		Node label5135 = createLabel(node, UMLVisualIDRegistry.getType(IntervalConstraintAsLocalPostcondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDurationConstraint_3034(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DurationConstraintAsLocalPrecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DurationConstraint");
		Node label5038 = createLabel(node, UMLVisualIDRegistry.getType(DurationConstraintAsLocalPrecondNameEditPart.VISUAL_ID));
		Node label5130 = createLabel(node, UMLVisualIDRegistry.getType(DurationConstraintAsLocalPrecondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDurationConstraint_3035(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DurationConstraintAsLocalPostcondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DurationConstraint");
		Node label5039 = createLabel(node, UMLVisualIDRegistry.getType(DurationConstraintAsLocalPostcondNameEditPart.VISUAL_ID));
		Node label5131 = createLabel(node, UMLVisualIDRegistry.getType(DurationConstraintAsLocalPostcondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTimeConstraint_3036(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TimeConstraintAsLocalPrecondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "TimeConstraint");
		Node label5040 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintAsLocalPrecondNameEditPart.VISUAL_ID));
		Node label5132 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintAsLocalPrecondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTimeConstraint_3037(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.getStyles().add(NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TimeConstraintAsLocalPostcondEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "TimeConstraint");
		Node label5041 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintAsLocalPostcondNameEditPart.VISUAL_ID));
		Node label5133 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintAsLocalPostcondBodyEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createActionLocalPrecondition_4001(View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ActionLocalPreconditionEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createActionLocalPostcondition_4002(View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ActionLocalPostconditionEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createObjectFlow_4003(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "ObjectFlow");
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		Node label6001 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowNameEditPart.VISUAL_ID));
		label6001.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6001 = (Location) label6001.getLayoutConstraint();
		location6001.setX(0);
		location6001.setY(20);
		Node label6002 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowWeightEditPart.VISUAL_ID));
		label6002.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6002 = (Location) label6002.getLayoutConstraint();
		location6002.setX(0);
		location6002.setY(20);
		Node label6005 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowSelectionEditPart.VISUAL_ID));
		label6005.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6005 = (Location) label6005.getLayoutConstraint();
		location6005.setX(20);
		location6005.setY(40);
		Node label6006 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowTransformationEditPart.VISUAL_ID));
		label6006.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6006 = (Location) label6006.getLayoutConstraint();
		location6006.setX(-20);
		location6006.setY(-60);
		Node label6007 = createLabel(edge, UMLVisualIDRegistry.getType(DecisionInputFlowEditPart.VISUAL_ID));
		label6007.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6007 = (Location) label6007.getLayoutConstraint();
		location6007.setX(0);
		location6007.setY(-20);
		Node label6008 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowGuardEditPart.VISUAL_ID));
		label6008.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6008 = (Location) label6008.getLayoutConstraint();
		location6008.setX(0);
		location6008.setY(20);
		Node label6010 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowAppliedStereotypeEditPart.VISUAL_ID));
		label6010.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6010 = (Location) label6010.getLayoutConstraint();
		location6010.setX(0);
		location6010.setY(-20);
		Node label6014 = createLabel(edge, UMLVisualIDRegistry.getType(ObjectFlowInterruptibleIconEditPart.VISUAL_ID));
		label6014.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		PreferenceInitializerForElementHelper.initLabelVisibilityFromPrefs(edge, prefStore, "ObjectFlow");
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createControlFlow_4004(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "ControlFlow");
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		Node label6003 = createLabel(edge, UMLVisualIDRegistry.getType(ControlFlowNameEditPart.VISUAL_ID));
		label6003.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6003 = (Location) label6003.getLayoutConstraint();
		location6003.setX(0);
		location6003.setY(20);
		Node label6004 = createLabel(edge, UMLVisualIDRegistry.getType(ControlFlowWeightEditPart.VISUAL_ID));
		label6004.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6004 = (Location) label6004.getLayoutConstraint();
		location6004.setX(0);
		location6004.setY(20);
		Node label6009 = createLabel(edge, UMLVisualIDRegistry.getType(ControlFlowGuardEditPart.VISUAL_ID));
		label6009.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6009 = (Location) label6009.getLayoutConstraint();
		location6009.setX(0);
		location6009.setY(20);
		Node label6011 = createLabel(edge, UMLVisualIDRegistry.getType(ControlFlowAppliedStereotypeEditPart.VISUAL_ID));
		label6011.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6011 = (Location) label6011.getLayoutConstraint();
		location6011.setX(0);
		location6011.setY(-20);
		Node label6013 = createLabel(edge, UMLVisualIDRegistry.getType(ControlFlowInterruptibleIconEditPart.VISUAL_ID));
		label6013.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		PreferenceInitializerForElementHelper.initLabelVisibilityFromPrefs(edge, prefStore, "ControlFlow");
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createExceptionHandler_4005(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ExceptionHandlerEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "ExceptionHandler");
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		Node label6012 = createLabel(edge, UMLVisualIDRegistry.getType(ExceptionHandlerTypeEditPart.VISUAL_ID));
		label6012.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location6012 = (Location) label6012.getLayoutConstraint();
		location6012.setX(0);
		location6012.setY(40);
		Node label6015 = createLabel(edge, UMLVisualIDRegistry.getType(ExceptionHandlerIconEditPart.VISUAL_ID));
		label6015.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createCommentAnnotatedElement_4006(View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(CommentLinkEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createConstraintConstrainedElement_4007(View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		// org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		// if (routing != null) {
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		// }
		return edge;
	}

	/**
	 * @generated
	 */
	protected void stampShortcut(View containerView, Node target) {
		if (!ActivityDiagramEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID", ActivityDiagramEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	protected Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	protected Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort, boolean canFilter) {
		// SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		// rv.setShowTitle(showTitle);
		// rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		rv.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private void initFontStyleFromPrefs(View view, final IPreferenceStore store, String elementName) {
		String fontConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.FONT);
		String fontColorConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.COLOR_FONT);
		FontStyle viewFontStyle = (FontStyle) view.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (viewFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(store, fontConstant);
			viewFontStyle.setFontName(fontData.getName());
			viewFontStyle.setFontHeight(fontData.getHeight());
			viewFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			viewFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(store, fontColorConstant);
			viewFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
	}

	/**
	 * @generated
	 */
	private void initForegroundFromPrefs(View view, final IPreferenceStore store, String elementName) {
		String lineColorConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.COLOR_LINE);
		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(store, lineColorConstant);
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));
	}

	/**
	 * @generated
	 */
	private void initBackgroundFromPrefs(View view, final IPreferenceStore store, String elementName) {
		String fillColorConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.COLOR_FILL);
		String gradientColorConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.COLOR_GRADIENT);
		String gradientPolicyConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.GRADIENT_POLICY);
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(store, fillColorConstant);
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getFillStyle_FillColor(), FigureUtilities.RGBToInteger(fillRGB));
		FillStyle fillStyle = (FillStyle) view.getStyle(NotationPackage.Literals.FILL_STYLE);
		fillStyle.setFillColor(FigureUtilities.RGBToInteger(fillRGB).intValue());
		;
		if (store.getBoolean(gradientPolicyConstant)) {
			GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(store.getString(gradientColorConstant));
			fillStyle.setGradient(gradientPreferenceConverter.getGradientData());
			fillStyle.setTransparency(gradientPreferenceConverter.getTransparency());
		}
	}
}
