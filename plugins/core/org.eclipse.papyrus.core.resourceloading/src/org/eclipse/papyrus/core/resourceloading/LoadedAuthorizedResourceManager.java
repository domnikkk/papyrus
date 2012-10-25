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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.papyrus.preferences.Activator;
import org.eclipse.papyrus.resource.AbstractBaseModel;
import org.eclipse.papyrus.resource.IModel;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.sasheditor.DiModel;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;

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
			if(obj instanceof LoadedAuthorizedResource && uri != null) {
				return uri.equals(((LoadedAuthorizedResource)obj).uri);
			}
			return false;
		}

		@Override
		public int hashCode() {
			if(uri != null) {
				return uri.hashCode();
			}
			return 0;
		}
	}

	private static final String LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID = "loadedAuthorizedResource"; //$NON-NLS-1$

	private static final String LOADED_AUTHORIZED_RESOURCE_EXTENSION_POINT_ID = "org.eclipse.papyrus.core.resourceloading." //$NON-NLS-1$
		+ LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID; //$NON-NLS-1$

	private static final String URI_ID = "uri"; //$NON-NLS-1$

	private static final String PREFERENCE_PREFIX = LOADED_AUTHORIZED_RESOURCE_ELEMENT_ID + "."; //$NON-NLS-1$

	public static final String URI_PREF_PREFIX = PREFERENCE_PREFIX + URI_ID + "."; //$NON-NLS-1$

	private static class Holder {

		static final LoadedAuthorizedResourceManager instance = new LoadedAuthorizedResourceManager();
	}

	public static LoadedAuthorizedResourceManager getInstance() {
		return Holder.instance;
	}

	private IPreferenceStore prefStore;

	private IPreferenceStore projectPrefStore;

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

	public synchronized Set<URI> getLoadedAuthorizedResourcesSet(ModelSet modelSet) {
		readAuthorizedResources(modelSet);
		return loadedAuthorizedResourcesSet;
	}

	public synchronized void propertyChange(PropertyChangeEvent event) {
		Object newValue = event.getNewValue();

		if(event.getProperty().startsWith(URI_PREF_PREFIX) && newValue instanceof String) {
			String[] newURIs = parseString((String)newValue);
			if(newURIs.length > 0) {
				for(int i = 0; i < newURIs.length; i++) {
					String newURI = newURIs[i];
					if(!getLoadedAuthorizedResources().containsKey(newURI)) {
						getLoadedAuthorizedResources().put(newURI, new LoadedAuthorizedResource(URI.createURI(newURI)));
					}
				}
			}
		}
	}

	private void readAuthorizedResources() {
		if(loadedAuthorizedResources == null) {
			loadedAuthorizedResources = new HashMap<String, LoadedAuthorizedResourceManager.LoadedAuthorizedResource>();
		}
		if(loadedAuthorizedResourcesSet == null) {
			loadedAuthorizedResourcesSet = new HashSet<URI>();
		}
		String s;
		loadedAuthorizedResources.clear();

		if(projectPrefStore == null) {
			s = prefStore.getString(URI_PREF_PREFIX);
		} else {
			s = projectPrefStore.getString(URI_PREF_PREFIX);
		}

		String[] array = parseString(s);
		for(int i = 0; i < array.length; i++) {
			URI uri = URI.createURI(array[i]);

			loadedAuthorizedResources.put(uri.toString(), new LoadedAuthorizedResource(uri));

			loadedAuthorizedResourcesSet.add(uri);

		}

	}

	private void readAuthorizedResources(ModelSet modelSet) {
		IModel mainDiModel = modelSet.getModel(DiModel.MODEL_ID);
		URI mainUri = null;
		if(mainDiModel instanceof AbstractBaseModel) {
			AbstractBaseModel resourceMainModel = (AbstractBaseModel)mainDiModel;
			mainUri = resourceMainModel.getResourceURI();

		}
		if(loadedAuthorizedResourcesSet == null) {
			loadedAuthorizedResourcesSet = new HashSet<URI>();
		}

		if(loadedAuthorizedResources == null) {
			loadedAuthorizedResources = new HashMap<String, LoadedAuthorizedResourceManager.LoadedAuthorizedResource>();
		}

		loadedAuthorizedResources.clear();
		loadedAuthorizedResourcesSet.clear();

		IFile currentFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(mainUri.toPlatformString(true)));
		if(currentFile != null) {
			IProject project = currentFile.getProject();
			IEclipsePreferences root = Platform.getPreferencesService().getRootNode();
			if(project != null && root != null) {
				try {
					// For the project preferences :
					if(root.node(ProjectScope.SCOPE).node(project.getName()).nodeExists(Activator.PLUGIN_ID)) {
						projectPrefStore = new ScopedPreferenceStore(new ProjectScope(project), Activator.PLUGIN_ID);
						String s = projectPrefStore.getString(URI_PREF_PREFIX);
						String[] array = parseString(s);
						for(int i = 0; i < array.length; i++) {
							URI uri = URI.createURI(array[i]);

							loadedAuthorizedResources.put(uri.toString(), new LoadedAuthorizedResource(uri));

							loadedAuthorizedResourcesSet.add(uri);
						}
					}
				} catch (BackingStoreException e) {
					org.eclipse.papyrus.core.resourceloading.Activator.logError(e);
				}
			}
		}
		// For the workspace preferences :
		String s = prefStore.getString(URI_PREF_PREFIX);
		String[] array = parseString(s);
		for(int i = 0; i < array.length; i++) {
			URI uri = URI.createURI(array[i]);

			loadedAuthorizedResources.put(uri.toString(), new LoadedAuthorizedResource(uri));

			loadedAuthorizedResourcesSet.add(uri);
		}
	}

	protected String[] parseString(String stringList) {
		StringTokenizer st = new StringTokenizer(stringList, File.pathSeparator + "\n\r");//$NON-NLS-1$
		ArrayList v = new ArrayList();
		while(st.hasMoreElements()) {
			v.add(st.nextElement());
		}
		return (String[])v.toArray(new String[v.size()]);
	}
}
