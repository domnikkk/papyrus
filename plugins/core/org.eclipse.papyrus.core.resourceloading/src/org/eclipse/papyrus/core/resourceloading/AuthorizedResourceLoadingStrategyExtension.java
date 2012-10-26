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

import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.core.resourceloading.ILoadingStrategyExtension;
import org.eclipse.papyrus.preferences.Activator;
import org.eclipse.papyrus.resource.AbstractBaseModel;
import org.eclipse.papyrus.resource.IModel;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.sasheditor.DiModel;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;

public class AuthorizedResourceLoadingStrategyExtension implements ILoadingStrategyExtension {

	public static final String AUTHORIZED_RESOURCES_PREF_ID = "authorizedResources";

	protected WeakHashMap<ModelSet, Set<URI>> authorizedResourcesCache = new WeakHashMap<ModelSet, Set<URI>>();

	protected IPreferenceStore workspacePrefStore = Activator.getDefault().getPreferenceStore();

	public boolean loadResource(ModelSet modelSet, URI uri) {
		Set<URI> authorizedResourcesSet = authorizedResourcesCache.get(modelSet);
		if(authorizedResourcesSet == null) {
			authorizedResourcesSet = calculateAuthorizedResources(modelSet);
			authorizedResourcesCache.put(modelSet, authorizedResourcesSet);
		}

		return authorizedResourcesSet.contains(uri.trimFileExtension());
	}

	public Set<URI> calculateAuthorizedResources(ModelSet modelSet) {
		HashSet<URI> loadedAuthorizedResourcesSet = new HashSet<URI>();

		if(modelSet != null) {
			IModel mainDiModel = modelSet.getModel(DiModel.MODEL_ID);
			if(mainDiModel instanceof AbstractBaseModel) {
				AbstractBaseModel resourceMainModel = (AbstractBaseModel)mainDiModel;
				URI mainUri = resourceMainModel.getResourceURI();

				IFile mainFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(mainUri.toPlatformString(true)));
				if(mainFile != null) {
					IProject project = mainFile.getProject();
					IEclipsePreferences root = Platform.getPreferencesService().getRootNode();
					if(project != null && root != null) {
						try {
							// For the project preferences :
							if(root.node(ProjectScope.SCOPE).node(project.getName()).nodeExists(Activator.PLUGIN_ID)) {
								ScopedPreferenceStore projectPrefStore = new ScopedPreferenceStore(new ProjectScope(project), Activator.PLUGIN_ID);
								String s = projectPrefStore.getString(AUTHORIZED_RESOURCES_PREF_ID);

								for(String uriStr : parseString(s)) {
									loadedAuthorizedResourcesSet.add(URI.createURI(uriStr));
								}
							}
						} catch (BackingStoreException e) {
							org.eclipse.papyrus.core.resourceloading.Activator.logError(e);
						}
					}
				}
			}

			// For the workspace preferences :
			String s = workspacePrefStore.getString(AUTHORIZED_RESOURCES_PREF_ID);
			for(String uriStr : parseString(s)) {
				loadedAuthorizedResourcesSet.add(URI.createURI(uriStr));
			}
		}
		return loadedAuthorizedResourcesSet;
	}

	protected String[] parseString(String stringList) {
		return stringList.split(",");
	}
}
