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
package org.eclipse.papyrus.uml.diagram.timing.providers;

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
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineTimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FreeTimeRulerCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FreeTimingRulerEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineStateDefinitionCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineTimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineTimelineCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantVerticalLineEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GateLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionCompartmentEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LinearTimeRulerCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LinearTimingRulerEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.StateDefinitionEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.StateDefinitionLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.StateInvariantAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TickEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TickNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimingDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLVisualIDRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if(operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation)operation);
		}
		assert operation instanceof CreateViewOperation;
		if(operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation)operation);
		} else if(operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation)operation);
		} else if(operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation)operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
				if (op.getViewKind() == Node.class)
					return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
				if (op.getViewKind() == Edge.class)
					return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		// check Diagram Type should be the class diagram
		String modelID = UMLVisualIDRegistry.getModelID(op.getContainerView());
		if(!getDiagramProvidedId().equals(modelID)) {
			return false;
		}
		int visualID = UMLVisualIDRegistry.getVisualID(op.getSemanticHint());
		if(Node.class.isAssignableFrom(op.getViewKind())) {
			return UMLVisualIDRegistry.canCreateNode(op.getContainerView(), visualID);
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected String getDiagramProvidedId() {
		/*
		 * Indicates for which diagram this provider works for.
		 * <p>
		 * This method can be overloaded when diagram editor inherits from another one, but should never be <code>null</code>
		 * </p>
		 * 
		 * @return the unique identifier of the diagram for which views are provided.
		 */
		return TimingDiagramEditPart.MODEL_ID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return TimingDiagramEditPart.MODEL_ID.equals(op.getSemanticHint()) && UMLVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if(op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if(op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if(elementType != null || domainElement == null) {
				return false;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(op.getSemanticHint());
			if(elementType != null) {
				if(elementType instanceof IExtendedHintedElementType) {
					if(domainElement != null) {
						if(!UMLVisualIDRegistry.checkNodeVisualID(op.getContainerView(), domainElement, visualID)) {
							return false;
						}
					}
				} else {
					if(!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
						return false; // foreign element type
					}
				}
				String elementTypeHint = ((IHintedType)elementType).getSemanticHint();
				if(!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if(domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if(!TimingDiagramEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch(visualID) {
				case StateDefinitionEditPart.VISUAL_ID:
				case FullStateInvariantVerticalLineEditPart.VISUAL_ID:
				case FreeTimingRulerEditPartCN.VISUAL_ID:
				case LinearTimingRulerEditPartCN.VISUAL_ID:
				case TickEditPart.VISUAL_ID:
					break; // pure design element
				case InteractionEditPartTN.VISUAL_ID:
				case FullStateInvariantEditPartCN.VISUAL_ID:
				case OccurrenceSpecificationEditPartCN.VISUAL_ID:
				case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
				case TimeConstraintEditPart.VISUAL_ID:
				case TimeObservationEditPart.VISUAL_ID:
				case DurationConstraintEditPartCN.VISUAL_ID:
				case DurationObservationEditPartCN.VISUAL_ID:
				case GeneralOrderingEditPart.VISUAL_ID:
				case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
				case LifelineEditPart.VISUAL_ID:
				case GateEditPart.VISUAL_ID:
				case FullLifelineEditPartCN.VISUAL_ID:
				case CompactLifelineEditPartCN.VISUAL_ID:
				case CompactStateInvariantEditPartCN.VISUAL_ID:
					if(domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return InteractionEditPartTN.VISUAL_ID == visualID || FullLifelineEditPartCN.VISUAL_ID == visualID || CompactLifelineEditPartCN.VISUAL_ID == visualID || FullStateInvariantEditPartCN.VISUAL_ID == visualID || CompactStateInvariantEditPartCN.VISUAL_ID == visualID || OccurrenceSpecificationEditPartCN.VISUAL_ID == visualID || MessageOccurrenceSpecificationEditPartCN.VISUAL_ID == visualID || StateDefinitionEditPart.VISUAL_ID == visualID || FullStateInvariantVerticalLineEditPart.VISUAL_ID == visualID || TimeConstraintEditPart.VISUAL_ID == visualID || TimeObservationEditPart.VISUAL_ID == visualID || DurationConstraintEditPartCN.VISUAL_ID == visualID || DurationObservationEditPartCN.VISUAL_ID == visualID || GeneralOrderingEditPart.VISUAL_ID == visualID || FreeTimingRulerEditPartCN.VISUAL_ID == visualID || LinearTimingRulerEditPartCN.VISUAL_ID == visualID || TickEditPart.VISUAL_ID == visualID || DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID == visualID || LifelineEditPart.VISUAL_ID == visualID || GateEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		//RS: add code for extended types creation
		if(elementType instanceof IExtendedHintedElementType) {
			IElementType closestNonExtendedType = ElementTypeUtils.getClosestDiagramType(elementType);
			if(!UMLElementTypes.isKnownElementType(closestNonExtendedType) || (!(closestNonExtendedType instanceof IHintedType))) {
				return false; // foreign element type.
			}
		} else {
			if(!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
				return false; // foreign element type
			}
		}
		//if (!org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
		//	return false; // foreign element type
		//}
		// END R.S.
		String elementTypeHint = ((IHintedType)elementType).getSemanticHint();
		if(elementTypeHint == null || (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if(domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(TimingDiagramEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if(semanticHint == null) {
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
		}
		switch(visualID) {
		case InteractionEditPartTN.VISUAL_ID:
			return createInteraction_2(domainElement, containerView, index, persisted, preferencesHint);
		case FullLifelineEditPartCN.VISUAL_ID:
			return createLifeline_19(domainElement, containerView, index, persisted, preferencesHint);
		case CompactLifelineEditPartCN.VISUAL_ID:
			return createLifeline_20(domainElement, containerView, index, persisted, preferencesHint);
		case FullStateInvariantEditPartCN.VISUAL_ID:
			return createStateInvariant_11(domainElement, containerView, index, persisted, preferencesHint);
		case CompactStateInvariantEditPartCN.VISUAL_ID:
			return createStateInvariant_28(domainElement, containerView, index, persisted, preferencesHint);
		case OccurrenceSpecificationEditPartCN.VISUAL_ID:
			return createOccurrenceSpecification_12(domainElement, containerView, index, persisted, preferencesHint);
		case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return createMessageOccurrenceSpecification_13(domainElement, containerView, index, persisted, preferencesHint);
		case StateDefinitionEditPart.VISUAL_ID:
			return createNode_9(domainElement, containerView, index, persisted, preferencesHint);
		case FullStateInvariantVerticalLineEditPart.VISUAL_ID:
			return createNode_39(domainElement, containerView, index, persisted, preferencesHint);
		case TimeConstraintEditPart.VISUAL_ID:
			return createTimeConstraint_15(domainElement, containerView, index, persisted, preferencesHint);
		case TimeObservationEditPart.VISUAL_ID:
			return createTimeObservation_16(domainElement, containerView, index, persisted, preferencesHint);
		case DurationConstraintEditPartCN.VISUAL_ID:
			return createDurationConstraint_18(domainElement, containerView, index, persisted, preferencesHint);
		case DurationObservationEditPartCN.VISUAL_ID:
			return createDurationObservation_17(domainElement, containerView, index, persisted, preferencesHint);
		case GeneralOrderingEditPart.VISUAL_ID:
			return createGeneralOrdering_67(domainElement, containerView, index, persisted, preferencesHint);
		case FreeTimingRulerEditPartCN.VISUAL_ID:
			return createNode_24(domainElement, containerView, index, persisted, preferencesHint);
		case LinearTimingRulerEditPartCN.VISUAL_ID:
			return createNode_25(domainElement, containerView, index, persisted, preferencesHint);
		case TickEditPart.VISUAL_ID:
			return createNode_26(domainElement, containerView, index, persisted, preferencesHint);
		case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return createDestructionOccurrenceSpecification_27(domainElement, containerView, index, persisted, preferencesHint);
		case LifelineEditPart.VISUAL_ID:
			return createLifeline_40(domainElement, containerView, index, persisted, preferencesHint);
		case GateEditPart.VISUAL_ID:
			return createGate_69(domainElement, containerView, index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index, boolean persisted, PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType)elementType).getSemanticHint();
		switch(UMLVisualIDRegistry.getVisualID(elementTypeHint)) {
		case MessageSyncEditPart.VISUAL_ID:
			return createMessage_3(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageAsyncEditPart.VISUAL_ID:
			return createMessage_4(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageReplyEditPart.VISUAL_ID:
			return createMessage_41(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageCreateEditPart.VISUAL_ID:
			return createMessage_44(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageDeleteEditPart.VISUAL_ID:
			return createMessage_47(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageLostEditPart.VISUAL_ID:
			return createMessage_50(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		case MessageFoundEditPart.VISUAL_ID:
			return createMessage_53(getSemanticElement(semanticAdapter), containerView, index, persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createInteraction_2(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(InteractionEditPartTN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Interaction");
		Node label37 = createLabel(node, UMLVisualIDRegistry.getType(InteractionNameEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(InteractionCompartmentEditPartTN.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(TimeRulerCompartmentEditPartCN.VISUAL_ID), false, false, true, true);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "Interaction");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLifeline_19(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(FullLifelineEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "FullLifeline");
		Node label21 = createLabel(node, UMLVisualIDRegistry.getType(FullLifelineNameEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(FullLifelineStateDefinitionCompartmentEditPartCN.VISUAL_ID), false, false, true, true);
		createCompartment(node, UMLVisualIDRegistry.getType(FullLifelineTimelineCompartmentEditPartCN.VISUAL_ID), false, false, false, false);
		createCompartment(node, UMLVisualIDRegistry.getType(FullLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID), false, false, true, true);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "FullLifeline");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLifeline_20(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CompactLifelineEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CompactLifeline");
		Node label22 = createLabel(node, UMLVisualIDRegistry.getType(CompactLifelineNameEditPart.VISUAL_ID));
		createCompartment(node, UMLVisualIDRegistry.getType(CompactLifelineCompartmentEditPartCN.VISUAL_ID), false, false, false, false);
		createCompartment(node, UMLVisualIDRegistry.getType(CompactLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID), false, false, true, true);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "CompactLifeline");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStateInvariant_11(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(FullStateInvariantEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "FullStateInvariant");
		Node label62 = createLabel(node, UMLVisualIDRegistry.getType(FullStateInvariantAppliedStereotypeEditPart.VISUAL_ID));
		label62.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location62 = (Location)label62.getLayoutConstraint();
		location62.setX(0);
		location62.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStateInvariant_28(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(CompactStateInvariantEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "CompactStateInvariant");
		Node label31 = createLabel(node, UMLVisualIDRegistry.getType(CompactStateInvariantNameEditPart.VISUAL_ID));
		Node label64 = createLabel(node, UMLVisualIDRegistry.getType(StateInvariantAppliedStereotypeEditPart.VISUAL_ID));
		label64.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location64 = (Location)label64.getLayoutConstraint();
		location64.setX(0);
		location64.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOccurrenceSpecification_12(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(OccurrenceSpecificationEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "OccurrenceSpecification");
		Node label10 = createLabel(node, UMLVisualIDRegistry.getType(OccurrenceSpecificationLabelEditPart.VISUAL_ID));
		label10.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location10 = (Location)label10.getLayoutConstraint();
		location10.setX(0);
		location10.setY(18);
		Node label58 = createLabel(node, UMLVisualIDRegistry.getType(OccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID));
		label58.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location58 = (Location)label58.getLayoutConstraint();
		location58.setX(0);
		location58.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createMessageOccurrenceSpecification_13(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(MessageOccurrenceSpecificationEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "MessageOccurrenceSpecification");
		Node label14 = createLabel(node, UMLVisualIDRegistry.getType(MessageOccurrenceSpecificationLabelEditPart.VISUAL_ID));
		label14.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location14 = (Location)label14.getLayoutConstraint();
		location14.setX(0);
		location14.setY(18);
		Node label59 = createLabel(node, UMLVisualIDRegistry.getType(MessageOccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID));
		label59.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location59 = (Location)label59.getLayoutConstraint();
		location59.setX(0);
		location59.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNode_9(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(StateDefinitionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "StateDefinition");
		Node label38 = createLabel(node, UMLVisualIDRegistry.getType(StateDefinitionLabelEditPart.VISUAL_ID));
		label38.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNode_39(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(FullStateInvariantVerticalLineEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "VerticalLineStateInvariant");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTimeConstraint_15(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TimeConstraintEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "TimeConstraint");
		Node label30 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintSpecificationEditPart.VISUAL_ID));
		label30.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location30 = (Location)label30.getLayoutConstraint();
		location30.setX(-5);
		location30.setY(-15);
		Node label65 = createLabel(node, UMLVisualIDRegistry.getType(TimeConstraintAppliedStereotypeEditPart.VISUAL_ID));
		label65.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location65 = (Location)label65.getLayoutConstraint();
		location65.setX(0);
		location65.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTimeObservation_16(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TimeObservationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "TimeObservation");
		Node label34 = createLabel(node, UMLVisualIDRegistry.getType(TimeObservationNameEditPart.VISUAL_ID));
		label34.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location34 = (Location)label34.getLayoutConstraint();
		location34.setX(-5);
		location34.setY(-15);
		Node label66 = createLabel(node, UMLVisualIDRegistry.getType(TimeObservationAppliedStereotypeEditPart.VISUAL_ID));
		label66.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location66 = (Location)label66.getLayoutConstraint();
		location66.setX(0);
		location66.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDurationConstraint_18(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DurationConstraintEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DurationConstraint");
		Node label33 = createLabel(node, UMLVisualIDRegistry.getType(DurationConstraintSpecificationEditPart.VISUAL_ID));
		label33.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location33 = (Location)label33.getLayoutConstraint();
		location33.setX(0);
		location33.setY(15);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDurationObservation_17(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DurationObservationEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DurationObservation");
		Node label35 = createLabel(node, UMLVisualIDRegistry.getType(DurationObservationNameEditPart.VISUAL_ID));
		label35.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location35 = (Location)label35.getLayoutConstraint();
		location35.setX(0);
		location35.setY(15);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGeneralOrdering_67(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(GeneralOrderingEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "GeneralOrdering");
		Node label68 = createLabel(node, UMLVisualIDRegistry.getType(GeneralOrderingNameEditPart.VISUAL_ID));
		label68.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location68 = (Location)label68.getLayoutConstraint();
		location68.setX(-5);
		location68.setY(-15);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNode_24(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(FreeTimingRulerEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "FreeTimingRuler");
		createCompartment(node, UMLVisualIDRegistry.getType(FreeTimeRulerCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "FreeTimingRuler");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNode_25(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(LinearTimingRulerEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "LinearTimingRuler");
		createCompartment(node, UMLVisualIDRegistry.getType(LinearTimeRulerCompartmentEditPart.VISUAL_ID), false, false, false, false);
		PreferenceInitializerForElementHelper.initCompartmentsStatusFromPrefs(node, prefStore, "LinearTimingRuler");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createNode_26(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(TickEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Tick");
		Node label36 = createLabel(node, UMLVisualIDRegistry.getType(TickNameEditPart.VISUAL_ID));
		label36.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		label36.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location36 = (Location)label36.getLayoutConstraint();
		location36.setX(0);
		location36.setY(12);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDestructionOccurrenceSpecification_27(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "DestructionOccurrenceSpecification");
		Node label32 = createLabel(node, UMLVisualIDRegistry.getType(DestructionOccurrenceSpecificationLabelEditPart.VISUAL_ID));
		label32.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location32 = (Location)label32.getLayoutConstraint();
		location32.setX(0);
		location32.setY(18);
		Node label63 = createLabel(node, UMLVisualIDRegistry.getType(DestructionOccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID));
		label63.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location63 = (Location)label63.getLayoutConstraint();
		location63.setX(0);
		location63.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLifeline_40(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(LifelineEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Lifeline");
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGate_69(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UMLVisualIDRegistry.getType(GateEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(node, prefStore, "Gate");
		Node label70 = createLabel(node, UMLVisualIDRegistry.getType(GateLabelEditPart.VISUAL_ID));
		label70.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location70 = (Location)label70.getLayoutConstraint();
		location70.setX(20);
		location70.setY(0);
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_3(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageSyncEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageSync");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label56 = createLabel(edge, UMLVisualIDRegistry.getType(MessageSyncNameLabelEditPart.VISUAL_ID));
		label56.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location56 = (Location)label56.getLayoutConstraint();
		location56.setX(0);
		location56.setY(-10);
		Node label57 = createLabel(edge, UMLVisualIDRegistry.getType(MessageSyncAppliedStereotypeEditPart.VISUAL_ID));
		label57.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location57 = (Location)label57.getLayoutConstraint();
		location57.setX(0);
		location57.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_4(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageAsyncEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageAsync");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label60 = createLabel(edge, UMLVisualIDRegistry.getType(MessageAsyncNameLabelEditPart.VISUAL_ID));
		label60.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location60 = (Location)label60.getLayoutConstraint();
		location60.setX(0);
		location60.setY(-10);
		Node label61 = createLabel(edge, UMLVisualIDRegistry.getType(MessageAsyncAppliedStereotypeEditPart.VISUAL_ID));
		label61.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location61 = (Location)label61.getLayoutConstraint();
		location61.setX(0);
		location61.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_41(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageReplyEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageReply");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label42 = createLabel(edge, UMLVisualIDRegistry.getType(MessageReplyNameLabelEditPart.VISUAL_ID));
		label42.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location42 = (Location)label42.getLayoutConstraint();
		location42.setX(0);
		location42.setY(-10);
		Node label43 = createLabel(edge, UMLVisualIDRegistry.getType(MessageReplyAppliedStereotypeEditPart.VISUAL_ID));
		label43.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location43 = (Location)label43.getLayoutConstraint();
		location43.setX(0);
		location43.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_44(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageCreateEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageCreate");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label45 = createLabel(edge, UMLVisualIDRegistry.getType(MessageCreateNameLabelEditPart.VISUAL_ID));
		label45.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location45 = (Location)label45.getLayoutConstraint();
		location45.setX(0);
		location45.setY(-10);
		Node label46 = createLabel(edge, UMLVisualIDRegistry.getType(MessageCreateAppliedStereotypeEditPart.VISUAL_ID));
		label46.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location46 = (Location)label46.getLayoutConstraint();
		location46.setX(0);
		location46.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_47(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageDeleteEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageDelete");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label48 = createLabel(edge, UMLVisualIDRegistry.getType(MessageDeleteNameLabelEditPart.VISUAL_ID));
		label48.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location48 = (Location)label48.getLayoutConstraint();
		location48.setX(0);
		location48.setY(-10);
		Node label49 = createLabel(edge, UMLVisualIDRegistry.getType(MessageDeleteAppliedStereotypeEditPart.VISUAL_ID));
		label49.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location49 = (Location)label49.getLayoutConstraint();
		location49.setX(0);
		location49.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_50(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageLostEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageLost");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label51 = createLabel(edge, UMLVisualIDRegistry.getType(MessageLostNameLabelEditPart.VISUAL_ID));
		label51.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location51 = (Location)label51.getLayoutConstraint();
		location51.setX(0);
		location51.setY(-10);
		Node label52 = createLabel(edge, UMLVisualIDRegistry.getType(MessageLostAppliedStereotypeEditPart.VISUAL_ID));
		label52.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location52 = (Location)label52.getLayoutConstraint();
		location52.setX(0);
		location52.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMessage_53(EObject domainElement, View containerView, int index, boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UMLVisualIDRegistry.getType(MessageFoundEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore)preferencesHint.getPreferenceStore();
		PreferenceInitializerForElementHelper.initFontStyleFromPrefs(edge, prefStore, "MessageFound");
		//org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		//if (routing != null) {
		//	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		//}
		Node label54 = createLabel(edge, UMLVisualIDRegistry.getType(MessageFoundNameLabelEditPart.VISUAL_ID));
		label54.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location54 = (Location)label54.getLayoutConstraint();
		location54.setX(0);
		location54.setY(-10);
		Node label55 = createLabel(edge, UMLVisualIDRegistry.getType(MessageFoundAppliedStereotypeEditPart.VISUAL_ID));
		label55.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		Location location55 = (Location)label55.getLayoutConstraint();
		location55.setX(0);
		location55.setY(-30);
		return edge;
	}

	/**
	 * @generated
	 */
	protected void stampShortcut(View containerView, Node target) {
		if(!TimingDiagramEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID", TimingDiagramEditPart.MODEL_ID); //$NON-NLS-1$
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
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if(canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		rv.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		if(hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			rv.getStyles().add(ts);
		}
		if(canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if(canFilter) {
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
		if(semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject)semanticAdapter.getAdapter(EObject.class);
		if(eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if(semanticAdapter == null) {
			return null;
		}
		return (IElementType)semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private void initFontStyleFromPrefs(View view, final IPreferenceStore store, String elementName) {
		String fontConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.FONT);
		String fontColorConstant = PreferencesConstantsHelper.getElementConstant(elementName, PreferencesConstantsHelper.COLOR_FONT);
		FontStyle viewFontStyle = (FontStyle)view.getStyle(NotationPackage.Literals.FONT_STYLE);
		if(viewFontStyle != null) {
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
		FillStyle fillStyle = (FillStyle)view.getStyle(NotationPackage.Literals.FILL_STYLE);
		fillStyle.setFillColor(FigureUtilities.RGBToInteger(fillRGB).intValue());;
		if(store.getBoolean(gradientPolicyConstant)) {
			GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(store.getString(gradientColorConstant));
			fillStyle.setGradient(gradientPreferenceConverter.getGradientData());
			fillStyle.setTransparency(gradientPreferenceConverter.getTransparency());
		}
	}
}
