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
package org.eclipse.papyrus.uml.diagram.timing.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.uml.diagram.common.part.ICustomDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.timing.custom.parts.PropertyDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineTimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineStateDefinitionCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineTimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineTimelineCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionCompartmentEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionEditPartTN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeRulerCompartmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimingDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;
import org.eclipse.uml2.uml.DestructionOccurrenceSpecification;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLDiagramUpdater implements DiagramUpdater {

	/**
	 * @generated
	 */
	public static final org.eclipse.papyrus.uml.diagram.timing.part.UMLDiagramUpdater INSTANCE = new UMLDiagramUpdater();

	/**
	 * @generated
	 */
	protected UMLDiagramUpdater() {
		//to prevent instantiation allowing the override
	}

	/**
	 * @generated
	 */
	@Override
	public List<UMLNodeDescriptor> getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case TimingDiagramEditPart.VISUAL_ID:
			return getPackage_1SemanticChildren(view);
		case InteractionEditPartTN.VISUAL_ID:
			return getInteraction_2SemanticChildren(view);
		case InteractionCompartmentEditPartTN.VISUAL_ID:
			return getInteractionInteractionCompartment_5SemanticChildren(view);
		case FullLifelineStateDefinitionCompartmentEditPartCN.VISUAL_ID:
			return getLifelineFullLifelineStateDefinitionCompartment_7SemanticChildren(view);
		case FullLifelineTimelineCompartmentEditPartCN.VISUAL_ID:
			return getLifelineFullLifelineTimelineCompartment_8SemanticChildren(view);
		case CompactLifelineCompartmentEditPartCN.VISUAL_ID:
			return getLifelineCompactLifelineCompartment_23SemanticChildren(view);
		case TimeRulerCompartmentEditPartCN.VISUAL_ID:
			return getInteractionTimeRulerCompartment_29SemanticChildren(view);
		case FullLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID:
			return getLifelineFullLifelineTimeRuler_82SemanticChildren(view);
		case CompactLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID:
			return getLifelineCompactLifelineTimeRuler_83SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getPackage_1SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElements()
				.iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InteractionEditPartTN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getInteraction_2SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Interaction modelElement = (Interaction) view.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFormalGates()
				.iterator(); it.hasNext();) {
			Gate childElement = (Gate) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GateEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getInteractionInteractionCompartment_5SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interaction modelElement = (Interaction) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLifelines()
				.iterator(); it.hasNext();) {
			Lifeline childElement = (Lifeline) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FullLifelineEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompactLifelineEditPartCN.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getLifelineFullLifelineStateDefinitionCompartment_7SemanticChildren(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getLifelineFullLifelineTimelineCompartment_8SemanticChildren(View view) {
		ICustomDiagramUpdater<UMLNodeDescriptor> customUpdater = new PropertyDiagramUpdater();
		return customUpdater.getSemanticChildren(view);
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getLifelineCompactLifelineCompartment_23SemanticChildren(View view) {
		ICustomDiagramUpdater<UMLNodeDescriptor> customUpdater = new PropertyDiagramUpdater();
		return customUpdater.getSemanticChildren(view);
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getInteractionTimeRulerCompartment_29SemanticChildren(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getLifelineFullLifelineTimeRuler_82SemanticChildren(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLNodeDescriptor> getLifelineCompactLifelineTimeRuler_83SemanticChildren(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	@Override
	public List<UMLLinkDescriptor> getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case TimingDiagramEditPart.VISUAL_ID:
			return getPackage_1ContainedLinks(view);
		case InteractionEditPartTN.VISUAL_ID:
			return getInteraction_2ContainedLinks(view);
		case FullLifelineEditPartCN.VISUAL_ID:
			return getLifeline_19ContainedLinks(view);
		case CompactLifelineEditPartCN.VISUAL_ID:
			return getLifeline_20ContainedLinks(view);
		case FullStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_11ContainedLinks(view);
		case CompactStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_28ContainedLinks(view);
		case OccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getOccurrenceSpecification_12ContainedLinks(view);
		case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getMessageOccurrenceSpecification_13ContainedLinks(view);
		case TimeConstraintEditPart.VISUAL_ID:
			return getTimeConstraint_15ContainedLinks(view);
		case TimeObservationEditPart.VISUAL_ID:
			return getTimeObservation_16ContainedLinks(view);
		case DurationConstraintEditPartCN.VISUAL_ID:
			return getDurationConstraint_18ContainedLinks(view);
		case DurationObservationEditPartCN.VISUAL_ID:
			return getDurationObservation_17ContainedLinks(view);
		case GeneralOrderingEditPart.VISUAL_ID:
			return getGeneralOrdering_67ContainedLinks(view);
		case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getDestructionOccurrenceSpecification_27ContainedLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_40ContainedLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_69ContainedLinks(view);
		case MessageSyncEditPart.VISUAL_ID:
			return getMessage_3ContainedLinks(view);
		case MessageAsyncEditPart.VISUAL_ID:
			return getMessage_4ContainedLinks(view);
		case MessageReplyEditPart.VISUAL_ID:
			return getMessage_41ContainedLinks(view);
		case MessageCreateEditPart.VISUAL_ID:
			return getMessage_44ContainedLinks(view);
		case MessageDeleteEditPart.VISUAL_ID:
			return getMessage_47ContainedLinks(view);
		case MessageLostEditPart.VISUAL_ID:
			return getMessage_50ContainedLinks(view);
		case MessageFoundEditPart.VISUAL_ID:
			return getMessage_53ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	@Override
	public List<UMLLinkDescriptor> getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case InteractionEditPartTN.VISUAL_ID:
			return getInteraction_2IncomingLinks(view);
		case FullLifelineEditPartCN.VISUAL_ID:
			return getLifeline_19IncomingLinks(view);
		case CompactLifelineEditPartCN.VISUAL_ID:
			return getLifeline_20IncomingLinks(view);
		case FullStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_11IncomingLinks(view);
		case CompactStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_28IncomingLinks(view);
		case OccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getOccurrenceSpecification_12IncomingLinks(view);
		case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getMessageOccurrenceSpecification_13IncomingLinks(view);
		case TimeConstraintEditPart.VISUAL_ID:
			return getTimeConstraint_15IncomingLinks(view);
		case TimeObservationEditPart.VISUAL_ID:
			return getTimeObservation_16IncomingLinks(view);
		case DurationConstraintEditPartCN.VISUAL_ID:
			return getDurationConstraint_18IncomingLinks(view);
		case DurationObservationEditPartCN.VISUAL_ID:
			return getDurationObservation_17IncomingLinks(view);
		case GeneralOrderingEditPart.VISUAL_ID:
			return getGeneralOrdering_67IncomingLinks(view);
		case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getDestructionOccurrenceSpecification_27IncomingLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_40IncomingLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_69IncomingLinks(view);
		case MessageSyncEditPart.VISUAL_ID:
			return getMessage_3IncomingLinks(view);
		case MessageAsyncEditPart.VISUAL_ID:
			return getMessage_4IncomingLinks(view);
		case MessageReplyEditPart.VISUAL_ID:
			return getMessage_41IncomingLinks(view);
		case MessageCreateEditPart.VISUAL_ID:
			return getMessage_44IncomingLinks(view);
		case MessageDeleteEditPart.VISUAL_ID:
			return getMessage_47IncomingLinks(view);
		case MessageLostEditPart.VISUAL_ID:
			return getMessage_50IncomingLinks(view);
		case MessageFoundEditPart.VISUAL_ID:
			return getMessage_53IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	@Override
	public List<UMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case InteractionEditPartTN.VISUAL_ID:
			return getInteraction_2OutgoingLinks(view);
		case FullLifelineEditPartCN.VISUAL_ID:
			return getLifeline_19OutgoingLinks(view);
		case CompactLifelineEditPartCN.VISUAL_ID:
			return getLifeline_20OutgoingLinks(view);
		case FullStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_11OutgoingLinks(view);
		case CompactStateInvariantEditPartCN.VISUAL_ID:
			return getStateInvariant_28OutgoingLinks(view);
		case OccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getOccurrenceSpecification_12OutgoingLinks(view);
		case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getMessageOccurrenceSpecification_13OutgoingLinks(view);
		case TimeConstraintEditPart.VISUAL_ID:
			return getTimeConstraint_15OutgoingLinks(view);
		case TimeObservationEditPart.VISUAL_ID:
			return getTimeObservation_16OutgoingLinks(view);
		case DurationConstraintEditPartCN.VISUAL_ID:
			return getDurationConstraint_18OutgoingLinks(view);
		case DurationObservationEditPartCN.VISUAL_ID:
			return getDurationObservation_17OutgoingLinks(view);
		case GeneralOrderingEditPart.VISUAL_ID:
			return getGeneralOrdering_67OutgoingLinks(view);
		case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
			return getDestructionOccurrenceSpecification_27OutgoingLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_40OutgoingLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_69OutgoingLinks(view);
		case MessageSyncEditPart.VISUAL_ID:
			return getMessage_3OutgoingLinks(view);
		case MessageAsyncEditPart.VISUAL_ID:
			return getMessage_4OutgoingLinks(view);
		case MessageReplyEditPart.VISUAL_ID:
			return getMessage_41OutgoingLinks(view);
		case MessageCreateEditPart.VISUAL_ID:
			return getMessage_44OutgoingLinks(view);
		case MessageDeleteEditPart.VISUAL_ID:
			return getMessage_47OutgoingLinks(view);
		case MessageLostEditPart.VISUAL_ID:
			return getMessage_50OutgoingLinks(view);
		case MessageFoundEditPart.VISUAL_ID:
			return getMessage_53OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getPackage_1ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getInteraction_2ContainedLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Message_3
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_4
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_41
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_44
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_47
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_50
				(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_19ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_20ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_11ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_28ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getOccurrenceSpecification_12ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessageOccurrenceSpecification_13ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeConstraint_15ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeObservation_16ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationConstraint_18ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationObservation_17ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGeneralOrdering_67ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDestructionOccurrenceSpecification_27ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_40ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGate_69ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_3ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_4ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_41ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_44ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_47ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_50ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_53ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getInteraction_2IncomingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_19IncomingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_20IncomingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_11IncomingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_28IncomingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getOccurrenceSpecification_12IncomingLinks(View view) {
		OccurrenceSpecification modelElement = (OccurrenceSpecification) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessageOccurrenceSpecification_13IncomingLinks(View view) {
		MessageOccurrenceSpecification modelElement = (MessageOccurrenceSpecification) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_3
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_4
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_41
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_44
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_47
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_53
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeConstraint_15IncomingLinks(View view) {
		TimeConstraint modelElement = (TimeConstraint) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeObservation_16IncomingLinks(View view) {
		TimeObservation modelElement = (TimeObservation) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationConstraint_18IncomingLinks(View view) {
		DurationConstraint modelElement = (DurationConstraint) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationObservation_17IncomingLinks(View view) {
		DurationObservation modelElement = (DurationObservation) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGeneralOrdering_67IncomingLinks(View view) {
		GeneralOrdering modelElement = (GeneralOrdering) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDestructionOccurrenceSpecification_27IncomingLinks(View view) {
		DestructionOccurrenceSpecification modelElement = (DestructionOccurrenceSpecification) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_3
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_4
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_41
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_44
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_47
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_53
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_40IncomingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGate_69IncomingLinks(View view) {
		Gate modelElement = (Gate) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_3
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_4
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_41
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_44
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_47
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		result.addAll(getIncomingTypeModelFacetLinks_Message_53
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_3IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_4IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_41IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_44IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_47IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_50IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_53IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		CrossReferenceAdapter crossReferencer = CrossReferenceAdapter.getCrossReferenceAdapter(view.eResource().getResourceSet());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Message_50
				(modelElement, crossReferencer));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getInteraction_2OutgoingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_19OutgoingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_20OutgoingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_11OutgoingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getStateInvariant_28OutgoingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getOccurrenceSpecification_12OutgoingLinks(View view) {
		OccurrenceSpecification modelElement = (OccurrenceSpecification) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessageOccurrenceSpecification_13OutgoingLinks(View view) {
		MessageOccurrenceSpecification modelElement = (MessageOccurrenceSpecification) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_3
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_41
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_44
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_47
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_50
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeConstraint_15OutgoingLinks(View view) {
		TimeConstraint modelElement = (TimeConstraint) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getTimeObservation_16OutgoingLinks(View view) {
		TimeObservation modelElement = (TimeObservation) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationConstraint_18OutgoingLinks(View view) {
		DurationConstraint modelElement = (DurationConstraint) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDurationObservation_17OutgoingLinks(View view) {
		DurationObservation modelElement = (DurationObservation) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGeneralOrdering_67OutgoingLinks(View view) {
		GeneralOrdering modelElement = (GeneralOrdering) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getDestructionOccurrenceSpecification_27OutgoingLinks(View view) {
		DestructionOccurrenceSpecification modelElement = (DestructionOccurrenceSpecification) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_3
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_41
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_44
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_47
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_50
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getLifeline_40OutgoingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getGate_69OutgoingLinks(View view) {
		Gate modelElement = (Gate) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_3
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_41
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_44
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_47
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_50
				(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_3OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_4OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_41OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_44OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_47OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_50OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public List<UMLLinkDescriptor> getMessage_53OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_53
				(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_3(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageSyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_3, MessageSyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_4(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageAsyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_4, MessageAsyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_41(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageReplyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_41, MessageReplyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_44(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageCreateEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_44, MessageCreateEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_47(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageDeleteEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_47, MessageDeleteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_50(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageLostEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getOwner();
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_50, MessageLostEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Message_53(Interaction container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageFoundEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			Element src = link.getOwner();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_53, MessageFoundEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_3(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageSyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_3, MessageSyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_4(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageAsyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_4, MessageAsyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_41(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageReplyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_41, MessageReplyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_44(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageCreateEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_44, MessageCreateEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_47(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageDeleteEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_47, MessageDeleteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_50(Element target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getElement_Owner() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageLostEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd src = link.getReceiveEvent();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_50, MessageLostEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Message_53(MessageEnd target, CrossReferenceAdapter crossReferencer) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferencer.getInverseReferences(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getMessage_SendEvent() || false == setting.getEObject() instanceof Message) {
				continue;
			}
			Message link = (Message) setting.getEObject();
			if (MessageFoundEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getOwner();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Message_53, MessageFoundEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_3(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageSyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_3, MessageSyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_4(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageAsyncEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_4, MessageAsyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_41(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageReplyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_41, MessageReplyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_44(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageCreateEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_44, MessageCreateEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_47(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageDeleteEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_47, MessageDeleteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_50(MessageEnd source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageLostEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getOwner();
			MessageEnd src = link.getReceiveEvent();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_50, MessageLostEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Message_53(Element source) {
		Interaction container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				container = (Interaction) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getMessages()
				.iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Message) {
				continue;
			}
			Message link = (Message) linkObject;
			if (MessageFoundEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageEnd dst = link.getSendEvent();
			Element src = link.getOwner();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Message_53, MessageFoundEditPart.VISUAL_ID));
		}
		return result;
	}
}
