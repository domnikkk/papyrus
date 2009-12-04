package org.eclipse.papyrus.diagram.statemachine.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.util.MDTUtil;
import org.eclipse.papyrus.diagram.common.util.MultiDiagramUtil;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.CommentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.ConnectionPointReference2EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate11EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate12EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate13EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate14EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.Region2EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.State3EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.State4EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.papyrus.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.diagram.statemachine.part.UMLLinkDescriptor;
import org.eclipse.papyrus.diagram.statemachine.part.UMLNodeDescriptor;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StateMachineCanonicalEditPolicy extends
		CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	@Override
	protected List getSemanticChildrenList() {
		View viewObject = (View)getHost().getModel();
		List result = new LinkedList();
		for(Iterator it = UMLDiagramUpdater.getPackage_79SemanticChildren(
				viewObject).iterator(); it.hasNext();) {
			EObject nextValue = ((UMLNodeDescriptor)it.next())
					.getModelElement();
			if(MultiDiagramUtil.findEObjectReferencedInEAnnotation(getHost(),
					nextValue)) {
				result.add(nextValue);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	@Override
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	@Override
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		if(view.getType() == ViewType.NOTE || view.getType() == ViewType.TEXT) {
			return false;
		}
		if(view.getElement() != null) {
			int actualID = UMLVisualIDRegistry.getVisualID(view);
			int suggestedID = UMLVisualIDRegistry.getNodeVisualID(
					(View)getHost().getModel(), view.getElement());
			switch(actualID) {
			case StateMachine2EditPart.VISUAL_ID:
			case CommentEditPart.VISUAL_ID:
				return actualID != suggestedID;
			}
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	@Override
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	protected Set getFeaturesToSynchronize() {
		if(myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE
					.getPackage_PackagedElement());
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE
					.getElement_OwnedComment());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@Override
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@Override
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	@Override
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());
		if(createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}
		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
		Diagram diagram = MDTUtil.getHostDiagram(this);

		if(diagram != null) {
			MDTUtil.filterDiagramViews(diagram);
		}
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View)getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for(Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge)linksIterator.next();
			int diagramLinkVisualID = UMLVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if(diagramLinkVisualID == -1) {
				if(nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			// don't remove notation-only links
			if(isNotationOnlyEdge(nextDiagramLink)) {
				linksIterator.remove();
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for(Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				UMLLinkDescriptor nextLinkDescriptor = (UMLLinkDescriptor)LinkDescriptorsIterator
						.next();
				if(diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
						.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
						.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view,
			Domain2Notation domain2NotationMap) {
		if(!StateMachineEditPart.MODEL_ID.equals(UMLVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		List result = new LinkedList();
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case StateMachineEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPackage_79ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case StateMachine2EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getStateMachine_1001ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case CommentEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getComment_2024ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case RegionEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getRegion_2001ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case StateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getState_2002ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case State2EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getState_2003ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Region2EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getRegion_2004ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case State3EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getState_2005ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ConnectionPointReferenceEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getConnectionPointReference_2006ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ConnectionPointReference2EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getConnectionPointReference_2007ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case FinalStateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getFinalState_2008ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case PseudostateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2009ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate2EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2010ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate3EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2011ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate4EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2012ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate5EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2013ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate6EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2014ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate7EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2015ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate8EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2016ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case State4EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getState_2017ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate9EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2018ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate10EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2019ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate11EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2020ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate12EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2021ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate13EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2022ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pseudostate14EditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getPseudostate_2023ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case TransitionEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater
						.getTransition_3001ContainedLinks(view));
			}
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		}
		for(Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			View childView = (View)children.next();
			result.addAll(collectAllLinks(childView, domain2NotationMap));
		}
		for(Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			View childView = (View)edges.next();
			result.addAll(collectAllLinks(childView, domain2NotationMap));
		}

		if(view instanceof Diagram) {
			result.addAll(getReferencesLinkDescriptors((Diagram)view));
		}
		removeDuplicatedLinks(result);
		purgeCollection(view.getDiagram(), result);
		return result;
	}

	/**
	 * @generated
	 */
	private void removeDuplicatedLinks(List linkDescriptors) {
		List toDelete = new ArrayList();
		for(int i = 0; i < linkDescriptors.size(); i++) {
			java.lang.Object object1 = linkDescriptors.get(i);
			if(object1 instanceof UMLLinkDescriptor) {
				UMLLinkDescriptor linkDescriptor1 = (UMLLinkDescriptor)object1;
				for(int j = i + 1; j < linkDescriptors.size(); j++) {
					java.lang.Object object2 = linkDescriptors.get(j);
					if(object2 instanceof UMLLinkDescriptor) {
						UMLLinkDescriptor linkDescriptor2 = (UMLLinkDescriptor)object2;
						if(checkSameLinkDescriptor(linkDescriptor1,
								linkDescriptor2)) {
							if(toDelete.contains(linkDescriptor2) == false) {
								toDelete.add(linkDescriptor2);
							}
						}
					}
				}
			}
		}
		for(java.lang.Object object : toDelete) {
			linkDescriptors.remove(object);
		}
	}

	/**
	 * @generated
	 */
	private void purgeCollection(Diagram diagram, Collection list) {
		for(Iterator i = list.iterator(); i.hasNext();) {
			java.lang.Object obj = i.next();
			if(obj instanceof Collection) {
				purgeCollection(diagram, (Collection)obj);
			} else {
				if(obj instanceof UMLLinkDescriptor) {
					UMLLinkDescriptor lDes = (UMLLinkDescriptor)obj;
					if(lDes.getModelElement() != null
							&& !MultiDiagramUtil
							.findEObjectReferencedInEAnnotation(
							diagram, lDes.getModelElement())) {
						i.remove();
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private boolean checkSameLinkDescriptor(UMLLinkDescriptor link1,
			UMLLinkDescriptor link2) {
		EObject model1 = link1.getModelElement();
		EObject model2 = link2.getModelElement();
		if(model1 == null && model2 != null) {
			return false;
		}
		if(model1 != null && model2 == null) {
			return false;
		}
		if(model1 != null && model1.equals(model2) == false) {
			return false;
		}

		EObject source1 = link1.getSource();
		EObject source2 = link2.getSource();
		if(source1 == null && source2 != null) {
			return false;
		}
		if(source1 != null && source2 == null) {
			return false;
		}
		if(source1 != null && source1.equals(source2) == false) {
			return false;
		}

		EObject destination1 = link1.getDestination();
		EObject destination2 = link2.getDestination();
		if(destination1 == null && destination2 != null) {
			return false;
		}
		if(destination1 != null && destination2 == null) {
			return false;
		}
		if(destination1 != null && destination1.equals(destination2) == false) {
			return false;
		}

		String type1 = link1.getType();
		String type2 = link2.getType();
		if(type1 == null && type2 != null) {
			return false;
		}
		if(type1 != null && type2 == null) {
			return false;
		}
		if(type1 != null && type1.equals(type2) == false) {
			return false;
		}

		int visualID1 = link1.getVisualID();
		int visualID2 = link2.getVisualID();
		if(visualID1 <= -1 || visualID2 <= -1) {
			return false;
		}
		if(visualID1 != visualID2) {
			return false;
		}

		return true;
	}

	/**
	 * @generated
	 */
	private List getReferencesLinkDescriptors(Diagram diagram) {
		List<EObject> references = MultiDiagramUtil
				.getAllReferencesInEAnnotation(diagram);
		List linkDescriptors = new ArrayList();
		for(EObject eObject : references) {
			if(UMLVisualIDRegistry.getLinkWithClassVisualID(eObject) >= 0) {
				UMLLinkDescriptor linkDescriptor = UMLDiagramUpdater
						.createLinkDescriptorFromModelElement(eObject);
				if(linkDescriptor != null) {
					linkDescriptors.add(linkDescriptor);
				}
			}
		}
		return linkDescriptors;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Domain2Notation domain2NotationMap) {
		List adapters = new LinkedList();
		for(Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final UMLLinkDescriptor nextLinkDescriptor = (UMLLinkDescriptor)linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor,
					domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor,
					domain2NotationMap);
			if(sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart)getHost())
					.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if(cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable)ccr.getNewObject();
				if(viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Domain2Notation domain2NotationMap) {
		View view = (View)domain2NotationMap.get(domainModelElement);
		if(view != null) {
			return (EditPart)getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private EditPart getSourceEditPart(UMLLinkDescriptor descriptor,
			Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private EditPart getTargetEditPart(UMLLinkDescriptor descriptor,
			Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected final EditPart getHintedEditPart(EObject domainModelElement,
			Domain2Notation domain2NotationMap, int hintVisualId) {
		View view = (View)domain2NotationMap.getHinted(domainModelElement,
				UMLVisualIDRegistry.getType(hintVisualId));
		if(view != null) {
			return (EditPart)getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isNotationOnlyEdge(Edge edge) {
		return false;
	}

	/**
	 * @generated
	 */
	private static class Domain2Notation {

		/**
		 * @generated
		 */
		private final HashMap myMap = new HashMap();

		/**
		 * @generated
		 */
		public boolean containsDomainElement(EObject domainElement) {
			return myMap.containsKey(domainElement);
		}

		/**
		 * @generated
		 */
		public boolean containsKey(EObject domainElement) {
			return containsDomainElement(domainElement);
		}

		/**
		 * @generated
		 */
		public void put(EObject domainElement, View view) {
			Object viewOrList = myMap.get(domainElement);
			if(viewOrList instanceof View) {
				myMap.remove(domainElement);
				List<View> list = new LinkedList<View>();
				list.add((View)viewOrList);
				myMap.put(domainElement, list);
				list.add(view);
			} else if(viewOrList instanceof List) {
				((List)viewOrList).add(view);
			} else {
				myMap.put(domainElement, view);
			}
		}

		/**
		 * @generated
		 */
		public View get(EObject domainEObject) {
			Object viewOrList = myMap.get(domainEObject);
			if(viewOrList instanceof View) {
				return (View)viewOrList;
			}
			if(viewOrList instanceof List) {
				// preferring not-shortcut to shortcut -- important for cases
				// when links arr to/from
				// the element that is additionally shortcutted to the same
				// diagram
				for(Object next : (List)viewOrList) {
					View nextView = (View)next;
					if(nextView.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
						return nextView;
					}
				}
				return (View)((List)viewOrList).get(0);
			}
			return null;
		}

		/**
		 * @generated
		 */
		public View getHinted(EObject domainEObject, String hint) {
			if(hint == null) {
				return get(domainEObject);
			}
			Object viewOrList = myMap.get(domainEObject);
			if(viewOrList instanceof View) {
				// no choice, will return what we have
				return (View)viewOrList;
			}
			for(Object next : (List)viewOrList) {
				View nextView = (View)next;
				if(hint.equals(nextView.getType())) {
					return nextView;
				}
			}
			// hint not found -- return what we have
			return (View)((List)viewOrList).get(0);
		}

	}
}
