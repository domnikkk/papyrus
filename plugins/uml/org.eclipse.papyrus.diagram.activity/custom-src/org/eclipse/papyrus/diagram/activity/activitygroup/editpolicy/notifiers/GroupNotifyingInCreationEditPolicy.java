/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Arthur Daussy (Atos) - Initial API and implementation
 *   Arthur Daussy - 371712 : 372745: [ActivityDiagram] Major refactoring group framework
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.activitygroup.editpolicy.notifiers;

import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.diagram.activity.activitygroup.GroupRequestAdvisor;
import org.eclipse.papyrus.diagram.activity.activitygroup.IContainerNodeDescriptor;
import org.eclipse.papyrus.diagram.activity.activitygroup.IGroupRequestAdvisor;

/**
 * Policy which catch creation event in order to integrated it into the group framework
 * 
 * @author arthur daussy
 * 
 */
public class GroupNotifyingInCreationEditPolicy extends GroupListenerEditPolicy {

	public GroupNotifyingInCreationEditPolicy(IContainerNodeDescriptor groupDescriptor) {
		super(groupDescriptor);
	}

	@Override
	public Command getCommand(Request request) {
		if(request instanceof CreateViewRequest) {
			final CreateViewRequest c = (CreateViewRequest)request;
			return new ICommandProxy(new DeferredFakeMoveCommand(getHostEditPart().getEditingDomain(), "Fake move command to integrate into group framework", c, getHost().getViewer().getEditPartRegistry()));
		}
		return null;
	}

	/**
	 * Fake move command with a special type which will simulate a change bounds request in the newly create element in order to integrate it in te
	 * group framework
	 * 
	 * @author arthur daussy
	 * 
	 */
	private static class DeferredFakeMoveCommand extends AbstractTransactionalCommand {

		/**
		 * Initial Create View Request
		 */
		private CreateViewRequest request;

		/**
		 * Edit part registry
		 */
		private Map editPartRegistry;

		/**
		 * Special the for the fake move command
		 */
		private static String FAKE_MOVE_COMMAND_TYPE = "FAKE_MOVE_COMMAND_TYPE";

		public DeferredFakeMoveCommand(TransactionalEditingDomain domain, String label, CreateViewRequest request, Map editPartRegistry) {
			super(domain, label, null);
			this.request = request;
			this.editPartRegistry = editPartRegistry;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			Object newObject = request.getNewObject();
			/*
			 * Try to get the newly created view
			 */
			if(newObject instanceof List<?> && !((List<?>)newObject).isEmpty()) {
				Object newObj = ((List<?>)newObject).get(0);
				if(newObj instanceof IAdaptable) {
					IAdaptable adpatable = (IAdaptable)newObj;
					Object v = adpatable.getAdapter(View.class);
					if(v instanceof View) {
						View view = (View)v;
						/*
						 * Try to get the related editpart
						 */
						Object editPart = editPartRegistry.get(view);
						if(editPart instanceof IGraphicalEditPart) {
							/*
							 * Send a fake change bounds request
							 */
							IGraphicalEditPart graphEdit = (IGraphicalEditPart)editPart;
							ChangeBoundsRequest changeBoundRequest = new ChangeBoundsRequest(FAKE_MOVE_COMMAND_TYPE);
							changeBoundRequest.setEditParts(graphEdit);
							Command fakeMoveCommand = graphEdit.getCommand(changeBoundRequest);
							if(fakeMoveCommand != null && fakeMoveCommand.canExecute()) {
								getEditingDomain().getCommandStack().execute(new GEFtoEMFCommandWrapper(fakeMoveCommand));
								return CommandResult.newOKCommandResult();
							}
						}
					}
				}
			}
			return CommandResult.newWarningCommandResult("Papyrus was unable to integrate this element into the group framework mechanism", null);////$NON-NLS-1$
		}
	}

	protected IGroupRequestAdvisor getGroupRequestAdvisor() {
		return GroupRequestAdvisor.getInstance();
	}

	/**
	 * Override in order to accept correct request
	 */
	@Override
	public boolean understandsRequest(Request req) {
		if(req instanceof ChangeBoundsRequest) {
			return true;
		}
		return false;
	}
}
