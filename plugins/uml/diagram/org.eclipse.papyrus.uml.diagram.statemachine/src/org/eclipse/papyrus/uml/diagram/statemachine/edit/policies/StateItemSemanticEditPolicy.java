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
package org.eclipse.papyrus.uml.diagram.statemachine.edit.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.infra.extendedtypes.types.IExtendedHintedElementType;
import org.eclipse.papyrus.infra.extendedtypes.util.ElementTypeUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ConnectionPointReferenceCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ContextLinkCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ContextLinkReorientCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.DoActivityStateBehaviorStateCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.EntryStateBehaviorCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ExitStateBehaviorCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.InternalTransitionCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.PseudostateEntryPointCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.PseudostateExitPointCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.RegionCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.TransitionCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.TransitionReorientCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ContextLinkEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.DoActivityStateBehaviorStateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.EntryStateBehaviorEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ExitStateBehaviorEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.InternalTransitionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateEntryPointEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateExitPointEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.StateCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class StateItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateItemSemanticEditPolicy() {
		super(UMLElementTypes.State_6000);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return super.getCreateCommand(req);
		}


		if (UMLElementTypes.Behavior_690 == requestElementType) {

			return getGEFWrapper(new EntryStateBehaviorCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Behavior_691 == requestElementType) {

			return getGEFWrapper(new DoActivityStateBehaviorStateCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Behavior_692 == requestElementType) {

			return getGEFWrapper(new ExitStateBehaviorCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Transition_680 == requestElementType) {

			return getGEFWrapper(new InternalTransitionCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Region_3000 == requestElementType) {

			return getGEFWrapper(new RegionCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Pseudostate_16000 == requestElementType) {

			return getGEFWrapper(new PseudostateEntryPointCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.Pseudostate_17000 == requestElementType) {

			return getGEFWrapper(new PseudostateExitPointCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if (UMLElementTypes.ConnectionPointReference_18000 == requestElementType) {

			return getGEFWrapper(new ConnectionPointReferenceCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(true);
		EAnnotation annotation = view.getEAnnotation("Shortcut");//$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: true
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			List<EObject> todestroy = new ArrayList<EObject>();
			todestroy.add(req.getElementToDestroy());
			// cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
			cmd.add(new EMFtoGMFCommandWrapper(new DeleteCommand(getEditingDomain(), todestroy)));
		} else {
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (UMLVisualIDRegistry.getVisualID(node)) {
			case EntryStateBehaviorEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case DoActivityStateBehaviorStateEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ExitStateBehaviorEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case InternalTransitionEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case RegionEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentAnnotatedElementEditPart.VISUAL_ID:
					case ConstraintConstrainedElementEditPart.VISUAL_ID:
					case ContextLinkEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: false
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case PseudostateEntryPointEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentAnnotatedElementEditPart.VISUAL_ID:
					case ConstraintConstrainedElementEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					case TransitionEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: false
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case PseudostateExitPointEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentAnnotatedElementEditPart.VISUAL_ID:
					case ConstraintConstrainedElementEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					case TransitionEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: false
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ConnectionPointReferenceEditPart.VISUAL_ID:





				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentAnnotatedElementEditPart.VISUAL_ID:
					case ConstraintConstrainedElementEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					case TransitionEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case StateCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (UMLVisualIDRegistry.getVisualID(cnode)) {
					case RegionEditPart.VISUAL_ID:





						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
							case ContextLinkEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							switch (UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: false
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ConnectionPointReferenceEditPart.VISUAL_ID:





						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							switch (UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case TransitionEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ?
				getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		boolean isExtendedType = false;
		if (requestElementType instanceof IExtendedHintedElementType) {
			baseElementType = ElementTypeUtils.getClosestDiagramType(requestElementType);
			if (baseElementType != null) {
				isExtendedType = true;
			} else {
				// no reference element type ID. using the closest super element type to give more opportunities, but can lead to bugs.
				baseElementType = ElementTypeUtils.findClosestNonExtendedElementType((IExtendedHintedElementType) requestElementType);
				isExtendedType = true;
			}
		}
		if (UMLElementTypes.Transition_7000 == baseElementType) {
			if (isExtendedType) {
				return getExtendedStartCreateRelationshipCommand(req, (IExtendedHintedElementType) requestElementType);
			}
			return getGEFWrapper(new TransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.CommentAnnotatedElement_667 == baseElementType) {
			return null;
		}
		if (UMLElementTypes.ConstraintConstrainedElement_670 == baseElementType) {
			return null;
		}
		if (UMLElementTypes.ConstraintContext_8500 == baseElementType) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return null;
		}
		IElementType baseElementType = requestElementType;
		boolean isExtendedType = false;
		if (requestElementType instanceof IExtendedHintedElementType) {
			baseElementType = ElementTypeUtils.getClosestDiagramType(requestElementType);
			if (baseElementType != null) {
				isExtendedType = true;
			} else {
				// no reference element type ID. using the closest super element type to give more opportunities, but can lead to bugs.
				baseElementType = ElementTypeUtils.findClosestNonExtendedElementType((IExtendedHintedElementType) requestElementType);
				isExtendedType = true;
			}
		}
		if (UMLElementTypes.Transition_7000 == baseElementType) {
			if (isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType) requestElementType);
			}
			return getGEFWrapper(new TransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.CommentAnnotatedElement_667 == baseElementType) {
			if (isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType) requestElementType);
			}
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ConstraintConstrainedElement_670 == baseElementType) {
			if (isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType) requestElementType);
			}
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ConstraintContext_8500 == baseElementType) {
			if (isExtendedType) {
				return getExtendedCompleteCreateRelationshipCommand(req, (IExtendedHintedElementType) requestElementType);
			}
			return getGEFWrapper(new ContextLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new TransitionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 *
	 * @generated
	 */
	@Override
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstraintConstrainedElementReorientCommand(req));
		case ContextLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextLinkReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
