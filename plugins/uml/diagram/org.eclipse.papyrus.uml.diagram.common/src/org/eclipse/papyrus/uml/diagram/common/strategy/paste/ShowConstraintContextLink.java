/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.strategy.paste;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.requests.ShowHideRelatedLinkRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.requests.ShowHideRelatedLinkRequest.ShowHideKind;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;


/**
 * Show the <<context>> link between a constraint and its context
 *
 * @author bmaggi
 */
public class ShowConstraintContextLink extends AbstractTransactionalCommand {

	/** The diagram where the link will be displayed */
	protected DiagramEditPart diagramEP;

	/** The constraint */
	protected Constraint constraint;

	/**
	 * Show the <<context>> link between a constraint and its context
	 *
	 * @param domain
	 * @param targetEditPart
	 * @param constraintView
	 */
	public ShowConstraintContextLink(TransactionalEditingDomain domain, GraphicalEditPart targetEditPart, View constraintView) {
		super(domain, "Show Constraint Context Link", null);
		this.diagramEP = DiagramEditPartsUtil.getDiagramEditPart(targetEditPart);
		this.constraint = (Constraint) constraintView.getElement();
	}

	/**
	 * Show the <<context>> link between a constraint and its context
	 *
	 * @param domain
	 * @param targetEditPart
	 * @param constraint
	 */
	public ShowConstraintContextLink(TransactionalEditingDomain domain, GraphicalEditPart targetEditPart, Constraint constraint) {
		super(domain, "Show Constraint Context Link", null);
		this.diagramEP = DiagramEditPartsUtil.getDiagramEditPart(targetEditPart);
		this.constraint = constraint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (diagramEP != null && getEditingDomain() != null) {
			diagramEP.refresh();
			Namespace context = constraint.getContext();
			Collection<EditPart> allTopSemanticEditPart = DiagramEditPartsUtil.getAllTopSemanticEditPart(diagramEP);
			EditPart constraintEditPart = getEditPart(constraint, allTopSemanticEditPart);
			EditPart contextEditPart = getEditPart(context, allTopSemanticEditPart);

			if (constraintEditPart != null && contextEditPart != null) {
				Collection<EditPart> constraintAndContext = new ArrayList<EditPart>();
				constraintAndContext.add(constraintEditPart);
				constraintAndContext.add(contextEditPart);
				final Request request = new ShowHideRelatedLinkRequest(constraintAndContext, ShowHideKind.SHOW_ALL_LINK_BETWEEN_SELECTED_ELEMENT);
				final Command cmd = diagramEP.getCommand(request);
				if (cmd != null) {
					cmd.execute();
				}
			}
		}
		return null;
	}

	/**
	 * Return the correct edit of a specific namedElement from an editPartCollection
	 *
	 * @param namedElement
	 * @param editPartCollection
	 * @return
	 */
	protected EditPart getEditPart(NamedElement namedElement, Collection<EditPart> editPartCollection) {
		for (EditPart editPart : editPartCollection) {
			Object model = editPart.getModel();
			if (model instanceof View) {
				View view = (View) model;
				EObject element = view.getElement();
				if (namedElement.equals(element)) {
					return editPart;
				}
			}
		}
		return null;
	}
}
