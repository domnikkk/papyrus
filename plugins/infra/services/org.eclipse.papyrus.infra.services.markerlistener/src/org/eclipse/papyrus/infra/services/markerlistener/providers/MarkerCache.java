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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.services.markerlistener.Activator;
import org.eclipse.papyrus.infra.services.markerlistener.IPapyrusMarker;
import org.eclipse.swt.widgets.Display;


/**
 * An ephemeral cache of markers per resource.
 */
class MarkerCache {

	private final Map<Resource, Collection<? extends IPapyrusMarker>> cache = new ConcurrentHashMap<Resource, Collection<? extends IPapyrusMarker>>();

	private final CacheLoader loader;

	MarkerCache(CacheLoader loader) {
		super();

		this.loader = loader;
	}

	public Collection<? extends IPapyrusMarker> getMarkers(Resource resource) {
		Collection<? extends IPapyrusMarker> result = cache.get(resource);
		if (result == null) {
			try {
				result = loader.getMarkers(resource);
			} catch (CoreException e) {
				Activator.log.error("Could not get markers for resource: " + resource.getURI(), e);
				result = Collections.emptyList();
			}

			cache.put(resource, result);
			purgeFromCacheLater(resource);
		}
		return result;
	}

	public Collection<IPapyrusMarker> getMarkers(Resource context, EObject object) {
		List<IPapyrusMarker> result = null;

		for (IPapyrusMarker marker : getMarkers(context)) {
			if (marker.getEObject() == object) {
				if (result == null) {
					result = new ArrayList<IPapyrusMarker>();
				}
				result.add(marker);
			}
		}

		if (result == null) {
			result = Collections.emptyList();
		}

		return result;
	}

	private void purgeFromCacheLater(final Resource resource) {
		// It would be really odd, indeed, if we were executing/redoing this advice on some other thread than the UI thread.
		// In which case we would end up deleting stuff from the cache prematurely, resulting in reduced performance and
		// possibly a memory leak
		Display display = Display.getDefault();
		if (display != null) {
			display.asyncExec(new Runnable() {

				public void run() {
					cache.remove(resource);
				}
			});
		}
	}

	//
	// Nested types
	//

	interface CacheLoader {

		Collection<? extends IPapyrusMarker> getMarkers(Resource resource) throws CoreException;
	}
}
