package org.eclipse.papyrus.diagram.activity.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.common.ids.ReorientLinkIDs;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;

/**
 * @generated
 */
public class ControlFlowReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	private View node;

	/**
	 * @generated
	 */
	private View link;

	/**
	 * @generated
	 */
	public ControlFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();

		if (request.getParameter(ReorientLinkIDs.nodeEditPart) != null) {
			node = (View) request.getParameter(ReorientLinkIDs.nodeEditPart);
		}
		if (request.getParameter(ReorientLinkIDs.linkEditPart) != null) {
			link = (View) request.getParameter(ReorientLinkIDs.linkEditPart);
		}
	}

	/**
	 * @generated
	 */
	@Override
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ControlFlow) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ActivityNode && newEnd instanceof ActivityNode)) {
			return false;
		}
		ActivityNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Activity)) {
			return false;
		}
		Activity container = (Activity) getLink().eContainer();
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistControlFlow_3001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActivityNode && newEnd instanceof ActivityNode)) {
			return false;
		}
		ActivityNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Activity)) {
			return false;
		}
		Activity container = (Activity) getLink().eContainer();
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistControlFlow_3001(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		if (link != null && node != null)
			((Edge) link).setSource(node);
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		if (link != null && node != null)
			((Edge) link).setTarget(node);
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ControlFlow getLink() {
		return (ControlFlow) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ActivityNode getOldSource() {
		return (ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getNewSource() {
		return (ActivityNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getOldTarget() {
		return (ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getNewTarget() {
		return (ActivityNode) newEnd;
	}
}
