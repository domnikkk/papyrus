/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Devernay (Atos) laurent.devernay@atos.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.papyrus.preferences.Activator;

public class LoadedAuthorizedResourceManager implements IPropertyChangeListener {

	public static class LoadedAuthorizedResource {
		private URI uri;

		public LoadedAuthorizedResource(URI uri) {
			this.uri = uri;
		}

		public URI getUri() {
			return uri;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof LoadedAuthorizedResource && uri != null) {
				return uri.equals(((LoadedAuthorizedResource) obj).uri);
			}
			return false;
		}

		@Override
		public int hashCode() {
			if (uri != null) {
				return uri.hashCode();
			}
			return 0;
		}
	}

	private static final String LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID = "loadedAuthorizedResource"; //$NON-NLS-1$

	private static final String LOADED_AUTHORIZED_RESOURCE_EXTENSION_POINT_ID = "org.eclipse.papyrus.core.resourceloading." //$NON-NLS-1$
			+ LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID; //$NON-NLS-1$

	private static final String URI_ID = "uri"; //$NON-NLS-1$

	private static final String PREFERENCE_PREFIX = LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID
			+ "."; //$NON-NLS-1$

	public static final String URI_PREF_PREFIX = PREFERENCE_PREFIX + URI_ID
			+ "."; //$NON-NLS-1$

	private static class Holder {

		static final LoadedAuthorizedResourceManager instance = new LoadedAuthorizedResourceManager();
	}

	public static LoadedAuthorizedResourceManager getInstance() {
		return Holder.instance;
	}

	private IPreferenceStore prefStore;

	private Map<String, LoadedAuthorizedResource> loadedAuthorizedResources = null;

	private Set<URI> loadedAuthorizedResourcesSet = null;

	public LoadedAuthorizedResourceManager() {
		prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.addPropertyChangeListener(this);
	}

	public synchronized Map<String, LoadedAuthorizedResource> getLoadedAuthorizedResources() {
		readAuthorizedResources();
		return loadedAuthorizedResources;
	}

	public synchronized Set<URI> getLoadedAuthorizedResourcesSet() {
		readAuthorizedResources();
		return loadedAuthorizedResourcesSet;
	}

	public synchronized void propertyChange(PropertyChangeEvent event) {
		Object newValue = event.getNewValue();

		if (event.getProperty().startsWith(URI_PREF_PREFIX)
				&& newValue instanceof String) {
			String[] newURIs = parseString((String) newValue);
			if (newURIs.length > 0) {
				for (int i = 0; i < newURIs.length; i++) {
					String newURI = newURIs[i];
					if (!getLoadedAuthorizedResources().containsKey(newURI)) {
						getLoadedAuthorizedResources().put(
								newURI,
								new LoadedAuthorizedResource(URI
										.createURI(newURI)));
						getLoadedAuthorizedResourcesSet().add(
								URI.createURI(newURI));
					}
				}
			}
		}
	}

	private void readAuthorizedResources() {
		if (loadedAuthorizedResources == null
				|| loadedAuthorizedResourcesSet == null) {
			if (loadedAuthorizedResourcesSet == null) {
				loadedAuthorizedResourcesSet = new HashSet<URI>();
			}

			if (loadedAuthorizedResources == null) {
				loadedAuthorizedResources = new HashMap<String, LoadedAuthorizedResourceManager.LoadedAuthorizedResource>();
			}

			loadedAuthorizedResources.clear();
			loadedAuthorizedResourcesSet.clear();

			String s = prefStore.getString(URI_PREF_PREFIX);
			String[] array = parseString(s);
			for (int i = 0; i < array.length; i++) {
				URI uri = URI.createURI(array[i]);

				loadedAuthorizedResources.put(uri.toString(),
						new LoadedAuthorizedResource(uri));

				loadedAuthorizedResourcesSet.add(uri);
			}
		}
	}

	protected String[] parseString(String stringList) {
		StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator
				+ "\n\r");//$NON-NLS-1$
		ArrayList v = new ArrayList();
		while (st.hasMoreElements()) {
			v.add(st.nextElement());
		}
		return (String[]) v.toArray(new String[v.size()]);
	}
}
