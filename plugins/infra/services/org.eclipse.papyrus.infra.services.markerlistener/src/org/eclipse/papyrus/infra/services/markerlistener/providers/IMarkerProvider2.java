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
package org.eclipse.papyrus.infra.services.markerlistener.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.services.markerlistener.Activator;
import org.eclipse.papyrus.infra.services.markerlistener.IPapyrusMarker;


/**
 * An optional extension interface for {@link IMarkerProvider}s that can provide undoable commands for deletion of the {@link IPapyrusMarker}s
 * attached to some model element.
 */
public interface IMarkerProvider2 {

	/**
	 * Queries whether the specified {@code object}, in the context of the given {@code resource} (to which it may
	 * not currently be attached but on which its markers, if any, would be attached) has or is likely to have
	 * any markers. Implementors should try to be as efficient about this as possible, because this will be invoked
	 * frequently by a GMF element type edit-helper advice in the creation of deletion commands. This is why it is
	 * permitted for implementations to optimistically return a positive result when further analysis would actually
	 * determine that there are no markers for the specific object (e.g., perhaps it can be efficiently determined
	 * that a resource has markers but not for which objects).
	 *
	 * @param context
	 *            a resource on which markers would be attached (or not)
	 * @param object
	 *            an object whose markers, if any, would be attached to the {@code context} resource
	 *
	 * @return whether it seems likely that the {@code object} has markers
	 */
	boolean hasMarkers(Resource context, EObject object);

	/**
	 * Creates a command for undoable deletion of the markers associated with a model element.
	 *
	 * @param context
	 *            the contextual resource from which markers are to be deleted. The {@code object} may not
	 *            be sufficient to infer this {@code context}, especially in the case that it has already been detached
	 * @param object
	 *            a model element, which may or may not currently have any markers attached to it
	 *
	 * @return the marker-deletion command (never {@code null})
	 */
	ICommand getMarkerDeletionCommand(Resource context, EObject object);

	/**
	 * An adapter that obtains the {@link IMarkerProvider2} extension for marker providers, adapting them if necessary to provide an approximate
	 * default behaviour.
	 */
	class Adapter implements IMarkerProvider2 {

		// Cache the markers because we will be requesting the markers for every object in the containment tree
		// of the root object being deleted
		private static MarkerCache markerCache = new MarkerCache(createMarkerCacheLoader());

		private final IMarkerProvider provider;

		Adapter(IMarkerProvider provider) {
			this.provider = provider;
		}

		public static IMarkerProvider2 getExtendedProvider(IMarkerProvider provider) {
			return (provider instanceof IMarkerProvider2) ? (IMarkerProvider2) provider : new Adapter(provider);
		}

		public boolean hasMarkers(Resource context, EObject object) {
			// Yes, it's an inaccurate answer, but false positives are explicitly permitted by the contract.
			// We can't take the time to iterate the list, and the cache only has to be populated once anyways
			return !markerCache.getMarkers(context).isEmpty();
		}

		public ICommand getMarkerDeletionCommand(Resource context, EObject object) {
			return new DeleteMarkersCommand(provider, context, object);
		}

		static MarkerCache.CacheLoader createMarkerCacheLoader() {
			return new MarkerCache.CacheLoader() {

				public Collection<? extends IPapyrusMarker> getMarkers(Resource resource) throws CoreException {
					Collection<? extends IPapyrusMarker> result;

					List<IMarkerProvider> providers = MarkerProviderRegistry.INSTANCE.getMarkerProviders(resource);
					switch (providers.size()) {
					case 0:
						result = Collections.emptyList();
						break;
					case 1:
						result = providers.get(0).getMarkers(resource, null, true);
						break;
					default:
						List<IPapyrusMarker> markers = new ArrayList<IPapyrusMarker>();
						for (IMarkerProvider provider : providers) {
							markers.addAll(provider.getMarkers(resource, null, true));
						}
						result = markers;
						break;
					}

					return result;
				}
			};
		}

		//
		// Nested types
		//

		private static class DeleteMarkersCommand extends AbstractCommand {

			private IMarkerProvider provider;

			private Resource context;

			private EObject object;

			private Diagnostic diagnosticForUndo;

			DeleteMarkersCommand(IMarkerProvider provider, Resource context, EObject object) {
				super("Delete markers");

				this.provider = provider;
				this.context = context;
				this.object = object;
			}

			@Override
			public void dispose() {
				provider = null;
				context = null;
				object = null;
				diagnosticForUndo = null;

				super.dispose();
			}

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				Collection<? extends IPapyrusMarker> markers = markerCache.getMarkers(context, object);
				if (markers.isEmpty()) {
					// Nothing to do
					return CommandResult.newOKCommandResult();
				}

				CoreException exception = null;

				BasicDiagnostic diagnostics = new BasicDiagnostic();

				for (IPapyrusMarker marker : markers) {
					try {
						// Capture the marker details as a diagnostic for undo, to recreate the marker
						int severity = marker.getAttribute(IPapyrusMarker.SEVERITY, Diagnostic.ERROR);
						String message = (String) marker.getAttribute(IPapyrusMarker.MESSAGE);
						String source = marker.getAttribute(IMarker.SOURCE_ID, Activator.PLUGIN_ID);
						diagnostics.add(new BasicDiagnostic(toDiagnosticSeverity(severity), source, 0, message, new Object[] { object }));

						marker.delete();
					} catch (CoreException e) {
						if (exception == null) {
							// Record the first one (others should be similar)
							exception = e;
						}
					}
				}

				if (!diagnostics.getChildren().isEmpty()) {
					// Initialize undo information
					diagnosticForUndo = diagnostics;
				}

				return (exception == null) ? CommandResult.newOKCommandResult() : CommandResult.newErrorCommandResult(exception);
			}

			@Override
			protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				if (diagnosticForUndo == null) {
					// Nothing to do
					return CommandResult.newOKCommandResult();
				}

				CoreException exception = null;

				// Detach undo information
				Diagnostic diagnostic = diagnosticForUndo;
				diagnosticForUndo = null;

				Resource resource = object.eResource();
				if (resource != null) { // Should have been reattached by now
					context = resource;

					try {
						provider.createMarkers(resource, diagnostic, progressMonitor);
					} catch (CoreException e) {
						exception = e;
					}
				}

				return (exception == null) ? CommandResult.newOKCommandResult() : CommandResult.newErrorCommandResult(exception);
			}

			@Override
			protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				return doExecuteWithResult(progressMonitor, info);
			}

			static int toDiagnosticSeverity(int markerSeverity) {
				switch (markerSeverity) {
				case IPapyrusMarker.SEVERITY_INFO:
					return Diagnostic.INFO;
				case IPapyrusMarker.SEVERITY_WARNING:
					return Diagnostic.WARNING;
				case IPapyrusMarker.SEVERITY_ERROR:
					return Diagnostic.ERROR;
				default:
					return Diagnostic.OK;
				}
			}

		}
	}
}
