/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.services.edit.internal.advice;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.IdentityCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.infra.services.markerlistener.providers.IMarkerProvider;
import org.eclipse.papyrus.infra.services.markerlistener.providers.IMarkerProvider2;
import org.eclipse.papyrus.infra.services.markerlistener.providers.MarkerProviderRegistry;


/**
 * A destroy-elements advice that deletes markers attached to the object being deleted and restores them (to the best
 * of its ability) on undo.
 */
public class MarkerDeletionAdvice extends AbstractEditHelperAdvice {

	// This parameter is set by generated semantic edit policies when delegating to "visual element types" to
	// decorate the semantic element command with advice targeting the visual element type, which is a hinted
	// element type specializing the semantic element type to suggest the way in which it should be presented
	// in the diagram. Because our advice is already included in the semantic command, it isn't needed in
	// this additional decoration and, therefore, it won't cause problems when the visual element type is
	// a specialization (dubiously) of the null element type
	// (see https://www.eclipse.org/forums/index.php/t/781825/ for discussion of that problem)
	private static final String EDIT_POLICY_COMMAND = "edit policy command"; //$NON-NLS-1$

	public MarkerDeletionAdvice() {
		super();
	}

	@Override
	protected ICommand getBeforeDestroyElementCommand(DestroyElementRequest request) {
		ICommand result = null;

		if (request.getParameter(EDIT_POLICY_COMMAND) == null) {
			final EObject object = request.getElementToDestroy();
			final Resource context = object.eResource();

			// Don't determine up-front exactly which markers to delete, because that can be quite expensive
			// and will make menu enablement calculations etc. perform badly. This should be reasonably
			// efficient.

			// There can't be markers for this object if it's not in a resource, because markers would
			// be attached to its resource, but there is no resource
			if (context != null) {
				for (IMarkerProvider provider : MarkerProviderRegistry.INSTANCE.getMarkerProviders(context)) {
					if (IMarkerProvider2.Adapter.getExtendedProvider(provider).hasMarkers(context, object)) {
						result = new DeleteMarkersCommand(object);
						break;
					}
				}
			}
		}

		return result;
	}

	//
	// Nested types
	//

	private static class DeleteMarkersCommand extends AbstractCommand {

		private Resource context;

		private EObject object;

		private ICommand delegate;

		DeleteMarkersCommand(EObject object) {
			super("Delete markers");

			// Grab the resource context now because, despite that this command is a before advice,
			// the element may actually already be detached by the time we are executed (as happens
			// when deleting an UML association in a diagram)
			this.context = object.eResource();
			this.object = object;
		}

		@Override
		public void dispose() {
			disposeDelegate();
			context = null;
			object = null;

			super.dispose();
		}

		void disposeDelegate() {
			if (delegate != null) {
				delegate.dispose();
				delegate = null;
			}
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			// In case we had been executed before, which would be odd
			disposeDelegate();

			// Initialize our delegate
			ICommand command = null;
			for (IMarkerProvider provider : MarkerProviderRegistry.INSTANCE.getMarkerProviders(context)) {
				ICommand nextCommand = IMarkerProvider2.Adapter.getExtendedProvider(provider).getMarkerDeletionCommand(context, object);
				if (command == null) {
					command = nextCommand;
				} else if (nextCommand != null) {
					command = command.compose(nextCommand);
				}
			}

			delegate = (command != null) ? command : IdentityCommand.INSTANCE;

			return convertResult(delegate.execute(progressMonitor, info));
		}

		@Override
		public boolean canUndo() {
			return (delegate == null) || delegate.canUndo();
		}

		@Override
		protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			// We could be asked to undo without first having been executed if a transaction is rolling back.
			return (delegate != null) ? convertResult(delegate.undo(progressMonitor, info)) : CommandResult.newOKCommandResult();
		}

		@Override
		public boolean canRedo() {
			return (delegate == null) || delegate.canRedo();
		}

		@Override
		protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			return (delegate != null) ? convertResult(delegate.redo(progressMonitor, info)) : CommandResult.newOKCommandResult();
		}

		CommandResult convertResult(IStatus status) {
			if (status == null) {
				return CommandResult.newOKCommandResult();
			} else {
				switch (status.getSeverity()) {
				case IStatus.OK:
				case IStatus.INFO:
					return CommandResult.newOKCommandResult();
				case IStatus.WARNING:
					return CommandResult.newWarningCommandResult(status.getMessage(), null);
				case IStatus.CANCEL:
					return CommandResult.newCancelledCommandResult();
				default:
					return (status.getException() == null) ? CommandResult.newErrorCommandResult(status.getMessage()) : CommandResult.newErrorCommandResult(status.getException());
				}
			}
		}
	}
}
