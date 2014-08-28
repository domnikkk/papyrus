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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
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
import org.eclipse.uml2.uml.Package;

/**
 * @generated
 */
public class UMLDiagramContentInitializer {

	/**
	 * @generated
	 */
	private Map myDomain2NotationMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	public void initDiagramContent(Diagram diagram) {
		if (!TimingDiagramEditPart.MODEL_ID.equals(diagram.getType())) {
			UMLDiagramEditorPlugin.getInstance().logError("Incorrect diagram passed as a parameter: " + diagram.getType());
			return;
		}
		if (false == diagram.getElement() instanceof Package) {
			UMLDiagramEditorPlugin.getInstance().logError("Incorrect diagram element specified: " + diagram.getElement() + " instead of Package");
			return;
		}
		createPackage_1Children(diagram);
		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createPackage_1Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getPackage_1SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createInteraction_2Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getInteraction_2OutgoingLinks(view));
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getInteraction_2SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
		createInteractionInteractionCompartment_5Children(getCompartment(view, InteractionCompartmentEditPartTN.VISUAL_ID));
		createInteractionTimeRulerCompartment_29Children(getCompartment(view, TimeRulerCompartmentEditPartCN.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	private void createLifeline_19Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getLifeline_19OutgoingLinks(view));
		createLifelineFullLifelineStateDefinitionCompartment_7Children(getCompartment(view, FullLifelineStateDefinitionCompartmentEditPartCN.VISUAL_ID));
		createLifelineFullLifelineTimelineCompartment_8Children(getCompartment(view, FullLifelineTimelineCompartmentEditPartCN.VISUAL_ID));
		createLifelineFullLifelineTimeRuler_82Children(getCompartment(view, FullLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	private void createLifeline_20Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getLifeline_20OutgoingLinks(view));
		createLifelineCompactLifelineCompartment_23Children(getCompartment(view, CompactLifelineCompartmentEditPartCN.VISUAL_ID));
		createLifelineCompactLifelineTimeRuler_83Children(getCompartment(view, CompactLifelineTimeRulerCompartmentEditPartCN.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	private void createStateInvariant_11Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getStateInvariant_11OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createStateInvariant_28Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getStateInvariant_28OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createOccurrenceSpecification_12Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getOccurrenceSpecification_12OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createMessageOccurrenceSpecification_13Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessageOccurrenceSpecification_13OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createTimeConstraint_15Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getTimeConstraint_15OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createTimeObservation_16Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getTimeObservation_16OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createDurationConstraint_18Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getDurationConstraint_18OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createDurationObservation_17Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getDurationObservation_17OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createGeneralOrdering_67Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getGeneralOrdering_67OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createDestructionOccurrenceSpecification_27Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getDestructionOccurrenceSpecification_27OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createLifeline_40Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getLifeline_40OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createGate_69Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getGate_69OutgoingLinks(view));
	}

	/**
	 * @generated
	 */
	private void createInteractionInteractionCompartment_5Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getInteractionInteractionCompartment_5SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createLifelineFullLifelineStateDefinitionCompartment_7Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getLifelineFullLifelineStateDefinitionCompartment_7SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createLifelineFullLifelineTimelineCompartment_8Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getLifelineFullLifelineTimelineCompartment_8SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createLifelineCompactLifelineCompartment_23Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getLifelineCompactLifelineCompartment_23SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createInteractionTimeRulerCompartment_29Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getInteractionTimeRulerCompartment_29SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createLifelineFullLifelineTimeRuler_82Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getLifelineFullLifelineTimeRuler_82SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createLifelineCompactLifelineTimeRuler_83Children(View view) {
		Collection childNodeDescriptors = UMLDiagramUpdater.INSTANCE.getLifelineCompactLifelineTimeRuler_83SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (UMLNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createNode(View parentView, UMLNodeDescriptor nodeDescriptor) {
		final String nodeType = UMLVisualIDRegistry.getType(nodeDescriptor.getVisualID());
		Node node = ViewService.createNode(parentView, nodeDescriptor.getModelElement(), nodeType, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		switch (nodeDescriptor.getVisualID()) {
		case InteractionEditPartTN.VISUAL_ID:
			createInteraction_2Children(node);
			return;
		case FullLifelineEditPartCN.VISUAL_ID:
			createLifeline_19Children(node);
			return;
		case CompactLifelineEditPartCN.VISUAL_ID:
			createLifeline_20Children(node);
			return;
		case FullStateInvariantEditPartCN.VISUAL_ID:
			createStateInvariant_11Children(node);
			return;
		case CompactStateInvariantEditPartCN.VISUAL_ID:
			createStateInvariant_28Children(node);
			return;
		case OccurrenceSpecificationEditPartCN.VISUAL_ID:
			createOccurrenceSpecification_12Children(node);
			return;
		case MessageOccurrenceSpecificationEditPartCN.VISUAL_ID:
			createMessageOccurrenceSpecification_13Children(node);
			return;
		case TimeConstraintEditPart.VISUAL_ID:
			createTimeConstraint_15Children(node);
			return;
		case TimeObservationEditPart.VISUAL_ID:
			createTimeObservation_16Children(node);
			return;
		case DurationConstraintEditPartCN.VISUAL_ID:
			createDurationConstraint_18Children(node);
			return;
		case DurationObservationEditPartCN.VISUAL_ID:
			createDurationObservation_17Children(node);
			return;
		case GeneralOrderingEditPart.VISUAL_ID:
			createGeneralOrdering_67Children(node);
			return;
		case DestructionOccurrenceSpecificationEditPartCN.VISUAL_ID:
			createDestructionOccurrenceSpecification_27Children(node);
			return;
		case LifelineEditPart.VISUAL_ID:
			createLifeline_40Children(node);
			return;
		case GateEditPart.VISUAL_ID:
			createGate_69Children(node);
			return;
		}
	}

	/**
	 * @generated
	 */
	private void createLinks(Diagram diagram) {
		for (boolean continueLinkCreation = true; continueLinkCreation;) {
			continueLinkCreation = false;
			Collection additionalDescriptors = new LinkedList();
			for (Iterator it = myLinkDescriptors.iterator(); it.hasNext();) {
				UMLLinkDescriptor nextLinkDescriptor = (UMLLinkDescriptor) it.next();
				if (!myDomain2NotationMap.containsKey(nextLinkDescriptor.getSource()) || !myDomain2NotationMap.containsKey(nextLinkDescriptor.getDestination())) {
					continue;
				}
				final String linkType = UMLVisualIDRegistry.getType(nextLinkDescriptor.getVisualID());
				Edge edge = ViewService.getInstance().createEdge(nextLinkDescriptor.getSemanticAdapter(), diagram, linkType, ViewUtil.APPEND, true, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (edge != null) {
					edge.setSource((View) myDomain2NotationMap.get(nextLinkDescriptor.getSource()));
					edge.setTarget((View) myDomain2NotationMap.get(nextLinkDescriptor.getDestination()));
					it.remove();
					if (nextLinkDescriptor.getModelElement() != null) {
						myDomain2NotationMap.put(nextLinkDescriptor.getModelElement(), edge);
					}
					continueLinkCreation = true;
					switch (nextLinkDescriptor.getVisualID()) {
					case MessageSyncEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_3OutgoingLinks(edge));
						break;
					case MessageAsyncEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_4OutgoingLinks(edge));
						break;
					case MessageReplyEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_41OutgoingLinks(edge));
						break;
					case MessageCreateEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_44OutgoingLinks(edge));
						break;
					case MessageDeleteEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_47OutgoingLinks(edge));
						break;
					case MessageLostEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_50OutgoingLinks(edge));
						break;
					case MessageFoundEditPart.VISUAL_ID:
						additionalDescriptors.addAll(UMLDiagramUpdater.INSTANCE.getMessage_53OutgoingLinks(edge));
						break;
					}
				}
			}
			myLinkDescriptors.addAll(additionalDescriptors);
		}
	}

	/**
	 * @generated
	 */
	private Node getCompartment(View node, int visualID) {
		String type = UMLVisualIDRegistry.getType(visualID);
		for (Iterator it = node.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView instanceof Node && type.equals(nextView.getType())) {
				return (Node) nextView;
			}
		}
		return null;
	}
}
