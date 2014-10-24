/*****************************************************************************
 * Copyright (c) 2013 CEA
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Soyatec - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.edit.policies;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.sequence.command.ChangeEdgeTargetCommand;
import org.eclipse.papyrus.uml.diagram.sequence.command.CreateElementAndNodeCommand;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.AbstractExecutionSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.ExecutionSpecificationEndEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.GateEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.sequence.util.FragmentsOrdererHelper;
import org.eclipse.papyrus.uml.diagram.sequence.util.SequenceRequestConstant;
import org.eclipse.papyrus.uml.diagram.sequence.util.SequenceUtil;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * Add support to connect directly on ExecutionOccurrenceSpecification.
 *
 * @author Jin Liu (jin.liu@soyatec.com)
 */
@SuppressWarnings("restriction")
public class ExecutionSpecificationEndGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		INodeEditPart node = getConnectableEditPart();
		if (node == null) {
			return null;
		}
		TransactionalEditingDomain editingDomain = getEditingDomain();
		ConnectionAnchor targetAnchor = getTargetConnectionAnchor(request.getTarget(), request);
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		if (targetEP == null) {
			return null;
		}
		SetConnectionEndsCommand sceCommand = new SetConnectionEndsCommand(editingDomain, StringStatics.BLANK);
		sceCommand.setEdgeAdaptor(new EObjectAdapter((EObject) request.getConnectionEditPart().getModel()));
		sceCommand.setNewTargetAdaptor(targetEP);
		SetConnectionAnchorsCommand scaCommand = new SetConnectionAnchorsCommand(editingDomain, StringStatics.BLANK);
		scaCommand.setEdgeAdaptor(new EObjectAdapter((EObject) request.getConnectionEditPart().getModel()));
		scaCommand.setNewTargetTerminal(targetEP.mapConnectionAnchorToTerminal(targetAnchor));
		CompositeCommand cc = new CompositeCommand(DiagramUIMessages.Commands_SetConnectionEndsCommand_Target);
		cc.compose(sceCommand);
		cc.compose(scaCommand);
		Command cmd = new ICommandProxy(cc);
		EditPart cep = request.getConnectionEditPart();
		RoutingStyle style = (RoutingStyle) ((View) cep.getModel()).getStyle(NotationPackage.eINSTANCE.getRoutingStyle());
		Routing currentRouter = Routing.MANUAL_LITERAL;
		if (style != null) {
			currentRouter = style.getRouting();
		}
		Command cmdRouter = getRoutingAdjustment(request.getConnectionEditPart(), getSemanticHint(request), currentRouter, request.getTarget());
		if (cmdRouter != null) {
			cmd = cmd == null ? cmdRouter : cmd.chain(cmdRouter);
			// reset the bendpoints
			ConnectionAnchor sourceAnchor = node.getSourceConnectionAnchor(request);
			PointList pointList = new PointList();
			pointList.addPoint(sourceAnchor.getLocation(targetAnchor.getReferencePoint()));
			pointList.addPoint(targetAnchor.getLocation(sourceAnchor.getReferencePoint()));
			SetConnectionBendpointsCommand sbbCommand = new SetConnectionBendpointsCommand(editingDomain);
			sbbCommand.setEdgeAdapter(request.getConnectionEditPart());
			sbbCommand.setNewPointList(pointList, sourceAnchor.getReferencePoint(), targetAnchor.getReferencePoint());
			Command cmdBP = new ICommandProxy(sbbCommand);
			if (cmdBP != null) {
				cmd = cmd == null ? cmdBP : cmd.chain(cmdBP);
			}
		}
		if (cmd.canExecute()) {
			return cmd.chain(FragmentsOrdererHelper.createOrderingFragmentsCommand(getHost(), request));
		}
		return cmd;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		INodeEditPart node = getConnectableEditPart();
		if (node == null) {
			return null;
		}
		TransactionalEditingDomain editingDomain = getEditingDomain();
		ConnectionAnchor sourceAnchor = getSourceConnectionAnchor(getHost(), request);
		SetConnectionEndsCommand sceCommand = new SetConnectionEndsCommand(editingDomain, StringStatics.BLANK);
		sceCommand.setEdgeAdaptor(new EObjectAdapter((View) request.getConnectionEditPart().getModel()));
		sceCommand.setNewSourceAdaptor(new EObjectAdapter((View) node.getModel()));
		SetConnectionAnchorsCommand scaCommand = new SetConnectionAnchorsCommand(editingDomain, StringStatics.BLANK);
		scaCommand.setEdgeAdaptor(new EObjectAdapter((View) request.getConnectionEditPart().getModel()));
		scaCommand.setNewSourceTerminal(node.mapConnectionAnchorToTerminal(sourceAnchor));
		CompositeCommand cc = new CompositeCommand(DiagramUIMessages.Commands_SetConnectionEndsCommand_Source);
		cc.compose(sceCommand);
		cc.compose(scaCommand);
		ICommandProxy result = new ICommandProxy(cc);
		if (result.canExecute()) {
			return result.chain(FragmentsOrdererHelper.createOrderingFragmentsCommand(node, request));
		}
		return result;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		request.getExtendedData().put(SequenceRequestConstant.TARGET_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(getHostFigure().getBounds(), getHost()));
		ICommandProxy proxy = (ICommandProxy) request.getStartCommand();
		if (proxy == null) {
			return null;
		}
		// reset the target edit-part for the request
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		if (targetEP == null) {
			return null;
		}
		// Fixed bug about creating MessageSync on same Execution.
		INodeEditPart sourceEditPart = getSourceEditPart(request.getSourceEditPart());
		if (request instanceof CreateConnectionViewRequest) {
			if (((IHintedType) UMLElementTypes.Message_4003).getSemanticHint().equals(((CreateConnectionViewRequest) request).getConnectionViewDescriptor().getSemanticHint())) {
				if (targetEP == sourceEditPart) {
					return UnexecutableCommand.INSTANCE;
				} else if (targetEP instanceof AbstractExecutionSpecificationEditPart && getHost() instanceof ExecutionSpecificationEndEditPart) {
					EObject parentElement = ((AbstractExecutionSpecificationEditPart) targetEP).resolveSemanticElement();
					EObject element = ((ExecutionSpecificationEndEditPart) getHost()).resolveSemanticElement();
					if (parentElement instanceof ExecutionSpecification && element instanceof OccurrenceSpecification && element == ((ExecutionSpecification) parentElement).getFinish()) {
						return UnexecutableCommand.INSTANCE;
					}
				}
			}
		}
		CompositeCommand cc = (CompositeCommand) proxy.getICommand();
		ConnectionAnchor targetAnchor = getTargetConnectionAnchor(getHost(), request);
		Iterator commandItr = cc.iterator();
		commandItr.next(); // 0
		SetConnectionEndsCommand sceCommand = (SetConnectionEndsCommand) commandItr.next(); // 1
		sceCommand.setNewTargetAdaptor(new EObjectAdapter(((IGraphicalEditPart) targetEP).getNotationView()));
		SetConnectionAnchorsCommand scaCommand = (SetConnectionAnchorsCommand) commandItr.next(); // 2
		scaCommand.setNewTargetTerminal(targetEP.mapConnectionAnchorToTerminal(targetAnchor));
		setViewAdapter(sceCommand.getEdgeAdaptor());
		ConnectionAnchor sourceAnchor = sourceEditPart.mapTerminalToConnectionAnchor(scaCommand.getNewSourceTerminal());
		PointList pointList = new PointList();
		if (request.getLocation() == null) {
			pointList.addPoint(sourceAnchor.getLocation(targetAnchor.getReferencePoint()));
			pointList.addPoint(targetAnchor.getLocation(sourceAnchor.getReferencePoint()));
		} else {
			pointList.addPoint(sourceAnchor.getLocation(request.getLocation()));
			pointList.addPoint(targetAnchor.getLocation(request.getLocation()));
		}
		SetConnectionBendpointsCommand sbbCommand = (SetConnectionBendpointsCommand) commandItr.next(); // 3
		sbbCommand.setNewPointList(pointList, sourceAnchor.getReferencePoint(), targetAnchor.getReferencePoint());
		return request.getStartCommand();
	}

	private INodeEditPart getSourceEditPart(EditPart sourceEditPart) {
		if (sourceEditPart instanceof ExecutionSpecificationEndEditPart) {
			return (INodeEditPart) ((ExecutionSpecificationEndEditPart) sourceEditPart).getParent();
		}
		return (INodeEditPart) sourceEditPart;
	}

	private Command getCreateAdditionalESCommand(CreateConnectionRequest request) {
		INodeEditPart sourceEP = getSourceEditPart(request.getSourceEditPart());
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		View targetView = (View) targetEP.getModel();
		EObject target = ViewUtil.resolveSemanticElement(targetView);
		if (target == null) {
			target = targetView;
		}
		if (targetEP == sourceEP) {
			return null;
		}
		if (!(targetEP instanceof AbstractExecutionSpecificationEditPart
				&& getHost() instanceof ExecutionSpecificationEndEditPart)) {
			return null;
		}
		IHintedType elementType = null;
		if(target instanceof ActionExecutionSpecification) {
			elementType = (IHintedType)UMLElementTypes.ActionExecutionSpecification_3006;
		} else if(target instanceof BehaviorExecutionSpecification) {
			elementType = (IHintedType)UMLElementTypes.BehaviorExecutionSpecification_3003;
		}
		if (elementType == null) {
			return null;
		}
		if (false == request instanceof CreateConnectionViewRequest) {
			return null;
		}
		CreateConnectionViewRequest viewRequest = (CreateConnectionViewRequest) request;
		if (false == ((IHintedType) UMLElementTypes.Message_4003).getSemanticHint().equals(((CreateConnectionViewRequest) request).getConnectionViewDescriptor().getSemanticHint())) {
			return null;
		}
		InteractionFragment ift = SequenceUtil.findInteractionFragmentContainerAt(request.getLocation(), getHost());
		EObject parentElement = ((AbstractExecutionSpecificationEditPart) targetEP).resolveSemanticElement();
		EObject element = ((ExecutionSpecificationEndEditPart) getHost()).resolveSemanticElement();
		boolean executionLinkedAlready = parentElement instanceof ExecutionSpecification && element instanceof MessageOccurrenceSpecification;
		// Check if we go uphill
		ConnectionAnchor sourceAnchor = getActualSourceConnectionAnchor(request);
		ConnectionAnchor targetAnchor = getSourceConnectionAnchor(targetEP, request);
		Point sourceLocation = sourceAnchor.getLocation(targetAnchor.getReferencePoint()).getCopy();
		if (sourceEP instanceof GateEditPart) {
			// Changing target for Gates changes anchor location - we're taking care of it
			org.eclipse.draw2d.geometry.Rectangle gateBounds = sourceEP.getFigure().getBounds().getCopy();
			sourceEP.getFigure().translateToAbsolute(gateBounds);
			sourceLocation.y = gateBounds.y + gateBounds.height/2;			
		}
		Point targetLocation = targetEP.getFigure().getBounds().getTopLeft().getCopy();
		targetEP.getFigure().translateToAbsolute(targetLocation);
		boolean messageGoUphill = targetLocation.y < sourceLocation.y;
		if (!executionLinkedAlready && !messageGoUphill) {
			return null;
		}
		CompositeCommand compound = new CompositeCommand(SequenceRequestConstant.INTERACTIONFRAGMENT_CONTAINER);
		Point newExecutionLocation = targetLocation.getCopy();
		INodeEditPart targetLifelineEP = (INodeEditPart)targetEP.getParent();
		if (messageGoUphill) {
			newExecutionLocation.y = sourceLocation.y;
			// Calc resize amount
			org.eclipse.draw2d.geometry.Rectangle targetBounds = targetEP.getFigure().getBounds().getCopy();
			targetEP.getFigure().translateToAbsolute(targetBounds);
			int resizeAmount = newExecutionLocation.y 
					+ LifelineXYLayoutEditPolicy.EXECUTION_INIT_HEIGHT + LifelineXYLayoutEditPolicy.SPACING_HEIGHT 
					- targetBounds.bottom();
			if (resizeAmount > 0) {
				// Resize parent ES
				ChangeBoundsRequest esRequest = new ChangeBoundsRequest(org.eclipse.gef.RequestConstants.REQ_MOVE);
				esRequest.setEditParts(targetEP);
				esRequest.setResizeDirection(PositionConstants.SOUTH);
				esRequest.setSizeDelta(new Dimension(0, resizeAmount));
				Command moveESCommand = LifelineXYLayoutEditPolicy.getResizeOrMoveChildrenCommand((LifelineEditPart) targetLifelineEP, esRequest, false, false, true);
				if (moveESCommand != null && !moveESCommand.canExecute()) {
					// forbid creation of the message if the es can't be moved correctly
					return UnexecutableCommand.INSTANCE;
				} else if (moveESCommand != null) {
					compound.compose(new CommandProxy(moveESCommand));
				}
			}
		}
		EObject targetLifeline = ViewUtil.resolveSemanticElement((View) targetEP.getParent().getModel());
		CreateElementAndNodeCommand createExecutionSpecificationCommand = new CreateElementAndNodeCommand(getEditingDomain(), (ShapeNodeEditPart)targetLifelineEP, targetLifeline, elementType, newExecutionLocation);
		createExecutionSpecificationCommand.putCreateElementRequestParameter(SequenceRequestConstant.INTERACTIONFRAGMENT_CONTAINER, ift);
		compound.compose(createExecutionSpecificationCommand);
		// put the anchor at the top of the figure
		ChangeEdgeTargetCommand changeTargetCommand = new ChangeEdgeTargetCommand(getEditingDomain(), createExecutionSpecificationCommand, viewRequest.getConnectionViewDescriptor(), "(0.5, 0.0)");
		compound.compose(changeTargetCommand);
		return new ICommandProxy(compound);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Command getConnectionAndRelationshipCompleteCommand(CreateConnectionViewAndElementRequest request) {
		request.getExtendedData().put(SequenceRequestConstant.TARGET_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(getHostFigure().getBounds(), getHost()));
		// get the element descriptor
		CreateElementRequestAdapter requestAdapter = request.getConnectionViewAndElementDescriptor().getCreateElementRequestAdapter();
		// get the semantic request
		CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) requestAdapter.getAdapter(CreateRelationshipRequest.class);
		createElementRequest.setPrompt(!request.isUISupressed());
		// complete the semantic request by filling in the source and
		// destination
		INodeEditPart targetEP = (INodeEditPart) getHost();
		View sourceView = (View) request.getSourceEditPart().getModel();
		View targetView = (View) targetEP.getModel();
		// resolve the source
		EObject source = ViewUtil.resolveSemanticElement(sourceView);
		if (source == null) {
			source = sourceView;
		}
		createElementRequest.setSource(source);
		// resolve the target
		EObject target = ViewUtil.resolveSemanticElement(targetView);
		if (target == null) {
			target = targetView;
		}
		createElementRequest.setTarget(target);
		// get the create element request based on the elementdescriptor's
		// request
		Command createElementCommand = targetEP.getCommand(new EditCommandRequestWrapper((CreateRelationshipRequest) requestAdapter.getAdapter(CreateRelationshipRequest.class), request.getExtendedData()));
		// create the create semantic element wrapper command
		if (null == createElementCommand) {
			return null;
		}
		SemanticCreateCommand semanticCommand = new SemanticCreateCommand(requestAdapter, createElementCommand);
		// get the view command
		Command viewCommand = getConnectionCompleteCommand(request);
		if (null == viewCommand) {
			return null;
		}
		Command addESCommand = getCreateAdditionalESCommand(request);
		// form the compound command and return
		CompositeCommand cc = new CompositeCommand(semanticCommand.getLabel());
		cc.compose(semanticCommand);
		cc.compose(new CommandProxy(viewCommand));
		if (null != addESCommand) {
			cc.compose(new CommandProxy(addESCommand));
		}
		ICommandProxy result = new ICommandProxy(cc);
		if (result.canExecute()) {
			Command orderFragments = FragmentsOrdererHelper.createOrderingFragmentsCommand(getHost().getParent(), request);
			return result.chain(orderFragments);
		}
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	protected Command getConnectionAndRelationshipCreateCommand(CreateConnectionViewAndElementRequest request) {
		request.getExtendedData().put(SequenceRequestConstant.SOURCE_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(getHostFigure().getBounds(), getHost()));
		return super.getConnectionAndRelationshipCreateCommand(request);
	}

	private TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	@Override
	@SuppressWarnings("unchecked")
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		if (!(request instanceof CreateConnectionViewRequest)) {
			return null;
		}
		request.getExtendedData().put(SequenceRequestConstant.SOURCE_MODEL_CONTAINER, SequenceUtil.findInteractionFragmentContainerAt(getHostFigure().getBounds(), getHost()));
		request.getExtendedData().put(SequenceRequestConstant.SOURCE_LOCATION_DATA, request.getLocation());
		CreateConnectionViewRequest req = (CreateConnectionViewRequest) request;
		CompositeCommand cc = new CompositeCommand(DiagramUIMessages.Commands_CreateCommand_Connection_Label);
		Diagram diagramView = ((View) getHost().getModel()).getDiagram();
		TransactionalEditingDomain editingDomain = getEditingDomain();
		CreateCommand createCommand = new CreateCommand(editingDomain, req.getConnectionViewDescriptor(), diagramView.getDiagram());
		setViewAdapter((IAdaptable) createCommand.getCommandResult().getReturnValue());
		SetConnectionEndsCommand sceCommand = new SetConnectionEndsCommand(editingDomain, StringStatics.BLANK);
		sceCommand.setEdgeAdaptor(getViewAdapter());
		sceCommand.setNewSourceAdaptor(new EObjectAdapter(getView()));
		ConnectionAnchor sourceAnchor = getSourceConnectionAnchor(getHost(), request);
		SetConnectionAnchorsCommand scaCommand = new SetConnectionAnchorsCommand(editingDomain, StringStatics.BLANK);
		scaCommand.setEdgeAdaptor(getViewAdapter());
		scaCommand.setNewSourceTerminal(getConnectableEditPart().mapConnectionAnchorToTerminal(sourceAnchor));
		SetConnectionBendpointsCommand sbbCommand = new SetConnectionBendpointsCommand(editingDomain);
		sbbCommand.setEdgeAdapter(getViewAdapter());
		cc.compose(createCommand);
		cc.compose(sceCommand);
		cc.compose(scaCommand);
		cc.compose(sbbCommand);
		Command c = new ICommandProxy(cc);
		request.setStartCommand(c);
		return c;
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy#getView()
	 *
	 * @return
	 */
	@Override
	protected View getView() {
		return (View) getHost().getParent().getModel();
	}

	@Override
	protected INodeEditPart getConnectableEditPart() {
		return (INodeEditPart) getHost().getParent();
	}

	@Override
	protected INodeEditPart getConnectionCompleteEditPart(Request request) {
		return (INodeEditPart) getHost().getParent();
	}

	@Override
	protected Connection createDummyConnection(Request req) {
		Connection conn = super.createDummyConnection(req);
		conn.setForegroundColor(ColorConstants.black);
		return conn;
	}

	/**
	 * Gets the actual connection anchor used in the request (i.e. with an actual getReferencePoint() value) 
	 */
	@SuppressWarnings("rawtypes")
	private ConnectionAnchor getActualSourceConnectionAnchor(CreateConnectionRequest request) {
		ICommandProxy proxy = (ICommandProxy) request.getStartCommand();
		if (proxy == null) {
			return null;
		}
		INodeEditPart sourceEditPart = getSourceEditPart(request.getSourceEditPart());
		CompositeCommand cc = (CompositeCommand) proxy.getICommand();
		Iterator commandItr = cc.iterator();
		commandItr.next(); // 0
		commandItr.next(); // 1
		SetConnectionAnchorsCommand scaCommand = (SetConnectionAnchorsCommand) commandItr.next(); // 2
		ConnectionAnchor sourceAnchor = sourceEditPart.mapTerminalToConnectionAnchor(scaCommand.getNewSourceTerminal());
		return sourceAnchor;
	}
	
	@SuppressWarnings("unchecked")
	private ConnectionAnchor getSourceConnectionAnchor(EditPart sourceEditPart, Request request) {
		if (sourceEditPart instanceof ExecutionSpecificationEndEditPart) {
			request.getExtendedData().remove(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION);
			EObject element = ((ExecutionSpecificationEndEditPart) sourceEditPart).resolveSemanticElement();
			INodeEditPart parent = (INodeEditPart) sourceEditPart.getParent();
			if (parent instanceof IGraphicalEditPart) {
				EObject parentElement = ((IGraphicalEditPart) parent).resolveSemanticElement();
				if (parentElement instanceof ExecutionSpecification) {
					if (element == ((ExecutionSpecification) parentElement).getStart()) {
						request.getExtendedData().put(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION, PositionConstants.TOP);
					} else if (element == ((ExecutionSpecification) parentElement).getFinish()) {
						request.getExtendedData().put(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION, PositionConstants.BOTTOM);
					}
				}
			}
			ConnectionAnchor sourceConnectionAnchor = parent.getSourceConnectionAnchor(request);
			// Be sure to remove this key after used.
			request.getExtendedData().remove(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION);
			return sourceConnectionAnchor;
		}
		return sourceEditPart instanceof INodeEditPart ? ((INodeEditPart) sourceEditPart).getSourceConnectionAnchor(request) : null;
	}

	@SuppressWarnings("unchecked")
	private ConnectionAnchor getTargetConnectionAnchor(EditPart targetEditPart, Request request) {
		if (targetEditPart instanceof ExecutionSpecificationEndEditPart) {
			request.getExtendedData().remove(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION);
			EObject element = ((ExecutionSpecificationEndEditPart) targetEditPart).resolveSemanticElement();
			INodeEditPart parent = (INodeEditPart) targetEditPart.getParent();
			if (parent instanceof IGraphicalEditPart) {
				EObject parentElement = ((IGraphicalEditPart) parent).resolveSemanticElement();
				if (parentElement instanceof ExecutionSpecification) {
					if (element == ((ExecutionSpecification) parentElement).getStart()) {
						request.getExtendedData().put(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION, PositionConstants.TOP);
					} else if (element == ((ExecutionSpecification) parentElement).getFinish()) {
						request.getExtendedData().put(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION, PositionConstants.BOTTOM);
					}
				}
			}
			ConnectionAnchor targetConnectionAnchor = parent.getTargetConnectionAnchor(request);
			// Be sure to remove this key after used.
			request.getExtendedData().remove(AbstractExecutionSpecificationEditPart.EXECUTION_FIX_ANCHOR_POSITION);
			return targetConnectionAnchor;
		}
		return targetEditPart instanceof INodeEditPart ? ((INodeEditPart) targetEditPart).getTargetConnectionAnchor(request) : null;
	}

	// protected ConnectionAnchor getTargetConnectionAnchor(CreateConnectionRequest request) {
	// EditPart targetEditPart = request.getTargetEditPart();
	// return getTargetConnectionAnchor(targetEditPart, request);
	// }
	@Override
	protected ConnectionRouter getDummyConnectionRouter(CreateConnectionRequest arg0) {
		return LifelineChildGraphicalNodeEditPolicy.messageRouter;
	}
}
