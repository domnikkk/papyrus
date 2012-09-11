/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.diagram.common.editpolicies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.DiagramUIDebugOptions;
import org.eclipse.gmf.runtime.diagram.ui.internal.DiagramUIPlugin;
import org.eclipse.gmf.runtime.diagram.ui.internal.DiagramUIStatusCodes;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.util.EditPartUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.diagram.common.commands.ApplyStereotypeCommand;
import org.eclipse.papyrus.diagram.common.commands.DefferedAppliedStereotypeToDisplayCommand;
import org.eclipse.papyrus.diagram.common.service.ApplyStereotypeRequest;
import org.eclipse.uml2.uml.Element;

/**
 * Apply Stereotype edit policy.
 * <P>
 * Edit policy in charge of applying stereotypes on uml elements
 * </P>
 */
public class ApplyStereotypeEditPolicy extends AbstractEditPolicy {

	/**
	 * Creates a new ApplyStereotypeEditPolicy.
	 */
	public ApplyStereotypeEditPolicy() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Command getCommand(Request request) {
		if(understandsRequest(request)) {
			return getApplyStereotypeCommand((ApplyStereotypeRequest)request);
		} else
			return super.getCommand(request);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean understandsRequest(Request req) {
		if(ApplyStereotypeRequest.APPLY_STEREOTYPE_REQUEST.equals(req.getType())) {
			return true;
		}
		return super.understandsRequest(req);
	}

	/**
	 * Executes the supplied command inside an <code>unchecked action</code>
	 * 
	 * @param cmd
	 *        command that can be executed (i.e., cmd.canExecute() == true)
	 */
	protected void executeCommand(final Command cmd) {
		Map<String, Boolean> options = null;
		EditPart ep = getHost();
		boolean isActivating = true;
		// use the viewer to determine if we are still initializing the diagram
		// do not use the DiagramEditPart.isActivating since
		// ConnectionEditPart's
		// parent will not be a diagram edit part
		EditPartViewer viewer = ep.getViewer();
		if(viewer instanceof DiagramGraphicalViewer) {
			isActivating = ((DiagramGraphicalViewer)viewer).isInitializing();
		}

		if(isActivating || !EditPartUtil.isWriteTransactionInProgress((IGraphicalEditPart)getHost(), false, false))
			options = Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE);

		AbstractEMFOperation operation = new AbstractEMFOperation(((IGraphicalEditPart)getHost()).getEditingDomain(), StringStatics.BLANK, options) {

			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

				cmd.execute();

				return Status.OK_STATUS;
			}
		};
		try {
			operation.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			Trace.catching(DiagramUIPlugin.getInstance(), DiagramUIDebugOptions.EXCEPTIONS_CATCHING, getClass(), "executeCommand", e); //$NON-NLS-1$
			Log.warning(DiagramUIPlugin.getInstance(), DiagramUIStatusCodes.IGNORED_EXCEPTION_WARNING, "executeCommand", e); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EditPart getTargetEditPart(Request request) {
		if(understandsRequest(request)) {
			return getHost();
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * Returns the <code>Command</code> contribution for the given <code>ApplyStereotypeRequest</code>
	 * 
	 * @param request
	 *        the request linked to this edit policy
	 * @return the command that applies the stereotype or <code>null</code>
	 */
	protected Command getApplyStereotypeCommand(ApplyStereotypeRequest request) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, "Apply Stereotype");
		final Element element = (Element)(((View)getHost().getModel()).getElement());
		
		if (request.getElement() == null) {
			request.setElement(element);
		}

		// 1. apply stereotypes
		cc.compose(new ApplyStereotypeCommand(editingDomain, request));

		// 2. display stereotypes
		cc.compose(new EMFtoGMFCommandWrapper(new DefferedAppliedStereotypeToDisplayCommand(editingDomain, getHost(), "")));

		return new ICommandProxy(cc.reduce());
	}

	/**
	 * Returns the list of stereotypes to display
	 * 
	 * @param request
	 *        the request that triggers this policy
	 * @return the list of stereotypes to display
	 */
	public String getStereotypeList(ApplyStereotypeRequest request) {
		// transforms the list of stereotypes in the request into a string
		// corresponding to the
		// string input of the display stereotype command.
		StringBuffer buffer = new StringBuffer();
		Iterator<String> it = request.getStereotypesToApply().iterator();
		while(it.hasNext()) {
			String stereotypeQN = it.next();
			buffer.append(stereotypeQN);
			if(it.hasNext()) {
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}
}
