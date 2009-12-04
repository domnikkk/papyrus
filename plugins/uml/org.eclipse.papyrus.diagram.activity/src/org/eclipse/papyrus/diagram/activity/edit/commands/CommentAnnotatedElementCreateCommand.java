package org.eclipse.papyrus.diagram.activity.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.papyrus.diagram.activity.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * @generated
 */
public class CommentAnnotatedElementCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public CommentAnnotatedElementCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Comment) {
			return false;
		}
		if (target != null && false == target instanceof Element) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateCommentAnnotatedElement_3006(getSource(), getTarget());
	}

	/**
	 * Modified to add the Comment to the correct element.
	 * 
	 * @generated NOT
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (getSource() != null && getTarget() != null) {
			getSource().getAnnotatedElements().add(getTarget());

			// check the parent of the comment. If has not elements in
			// annotatedElement relation, the parent will be this Element; if
			// has more than one element, the parent will be the model
			if (getSource().getAnnotatedElements().size() == 1) {
				getTarget().getOwnedComments().add(getSource());
			} else if (getSource().getAnnotatedElements().size() > 1) {
				org.eclipse.uml2.uml.Package root = getTarget().getNearestPackage();
				root.getOwnedComments().add(getSource());
			}
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * @generated
	 */
	protected Comment getSource() {
		return (Comment) source;
	}

	/**
	 * @generated
	 */
	protected Element getTarget() {
		return (Element) target;
	}
}
