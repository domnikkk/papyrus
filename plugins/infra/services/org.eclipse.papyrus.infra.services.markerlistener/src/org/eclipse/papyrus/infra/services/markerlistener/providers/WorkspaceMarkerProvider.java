/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus (CEA) - bug 431618
 *   
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.markerlistener.providers;

import static org.eclipse.papyrus.infra.services.markerlistener.util.MarkerListenerUtils.getFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.services.markerlistener.IPapyrusMarker;
import org.eclipse.papyrus.infra.services.markerlistener.PapyrusMarkerAdapter;
import org.eclipse.papyrus.infra.services.markerlistener.util.MarkerListenerUtils;


/**
 * This is the WorkspaceMarkerProvider type. Enjoy.
 */
public class WorkspaceMarkerProvider extends AbstractMarkerProvider implements IMarkerProvider2 {

	private final MarkerCache markerCache;

	public WorkspaceMarkerProvider() {
		super();

		markerCache = new MarkerCache(createMarkerCacheLoader());
	}

	public boolean canProvideMarkersFor(Resource resource) {
		return getFile(resource) != null;
	}

	public Collection<? extends IPapyrusMarker> getMarkers(Resource resource, String type, boolean includeSubtypes) throws CoreException {

		IFile file = getFile(resource);

		if(file != null) {
			// TODO: quite inefficient, since requested for each element (could cache markers, already done
			// by findMarkers operation?) 
			IMarker[] markers = file.findMarkers(type, true, 0);
			return PapyrusMarkerAdapter.wrap(resource, Arrays.asList(markers));
		}

		return Collections.emptyList();
	}

	public void createMarkers(Resource resource, Diagnostic diagnostic) {
	}

	@Override
	protected void doCreateMarker(Resource resource, Diagnostic diagnostic) throws CoreException {

		if(MarkerListenerUtils.eclipseResourcesUtil != null) {
			MarkerListenerUtils.eclipseResourcesUtil.createMarkers(resource, diagnostic);
		}
	}

	@Deprecated
	public void deleteMarkers(Resource resource, IProgressMonitor monitor) {
		try {
			this.deleteMarkers(resource, monitor, null, true);
		} catch (CoreException e) {
			Activator.log.error(e);
		}
	}

	public void deleteMarkers(Resource resource, IProgressMonitor monitor, String markerType, boolean includeSubtypes) throws CoreException {
		if(MarkerListenerUtils.eclipseResourcesUtil != null) {
			SubMonitor sub = SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN);
			//FIXME Shall only delete markers of the given markerType 
			MarkerListenerUtils.eclipseResourcesUtil.deleteMarkers(resource);
			sub.done();
		}
	}
	
	public boolean hasMarkers(Resource context, EObject object) {
		// Yes, it's an inaccurate answer, but false positives are explicitly permitted by the contract.
		// We can't take the time to iterate the list, and the cache only has to be populated once anyways
		return !markerCache.getMarkers(context).isEmpty();
	}

	public ICommand getMarkerDeletionCommand(Resource context, EObject object) {
		return new MarkerDeletionCommand(context, object);
	}

	private MarkerCache.CacheLoader createMarkerCacheLoader() {
		return new MarkerCache.CacheLoader() {

			public Collection<? extends IPapyrusMarker> getMarkers(Resource resource) throws CoreException {
				return WorkspaceMarkerProvider.this.getMarkers(resource, null, true);
			}
		};
	}

	//
	// Nested types
	//

	private class MarkerDeletionCommand extends AbstractCommand {

		private Resource context;

		private EObject object;

		private Collection<MarkerData> markerDataForUndo;

		public MarkerDeletionCommand(Resource context, EObject object) {
			super("Delete markers");

			this.context = context;
			this.object = object;
		}

		@Override
		public void dispose() {
			context = null;
			object = null;
			markerDataForUndo = null;

			super.dispose();
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			Collection<? extends IPapyrusMarker> markers = markerCache.getMarkers(context, object);
			if(markers.isEmpty()) {
				// Nothing to do
				return CommandResult.newOKCommandResult();
			}

			CoreException exception = null;

			Collection<MarkerData> markerData = new ArrayList<MarkerData>();

			for(IPapyrusMarker marker : markers) {
				try {
					// Capture the marker details for undo, to recreate the marker
					markerData.add(new MarkerData(marker.getType(), marker.getAttributes()));

					marker.delete();
				} catch (CoreException e) {
					if(exception == null) {
						// Record the first one (others should be similar)
						exception = e;
					}
				}
			}

			if(!markerData.isEmpty()) {
				// Initialize undo information
				markerDataForUndo = markerData;
			}

			return (exception == null) ? CommandResult.newOKCommandResult() : CommandResult.newErrorCommandResult(exception);
		}

		@Override
		protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			if(markerDataForUndo == null) {
				// Nothing to do
				return CommandResult.newOKCommandResult();
			}

			CoreException exception = null;

			// Detach undo information
			final Collection<MarkerData> markerData = markerDataForUndo;
			markerDataForUndo = null;

			Resource resource = object.eResource();
			if(resource != null) { // Should have been reattached by now
				context = resource;

				try {
					final IFile file = MarkerListenerUtils.getFile(resource);
					if(file != null) {
						file.getWorkspace().run(new IWorkspaceRunnable() {

							public void run(IProgressMonitor monitor) throws CoreException {

								for(MarkerData data : markerData) {
									file.createMarker(data.type).setAttributes(data.attributes);
								}

								if(monitor != null) {
									monitor.done();
								}
							}
						}, progressMonitor);
					}
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

	}

	private static final class MarkerData {

		final String type;

		final Map<String, ?> attributes;

		MarkerData(String type, Map<String, ?> attributes) {
			this.type = type;
			this.attributes = attributes;
		}
	}
}
