/*****************************************************************************
 * Copyright (c) 2010, 2014 Atos Origin, CEA LIST, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico emilien.perico@atosorigin.com - manage loading strategies
 *  Christian W. Damus (CEA) - manage models by URI, not IFile (CDO)
 *  Christian W. Damus (CEA LIST) - support control mode in CDO resources
 *  Christian W. Damus (CEA) - bug 437052
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436952
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource.additional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.papyrus.infra.core.resource.AbstractModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;

public class AdditionalResourcesModel extends AbstractModel implements IModel {

	/** Model identifier */
	public static String MODEL_ID = "org.eclipse.papyrus.infra.core.resource.additional";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getIdentifier() {
		return MODEL_ID;
	}

	/**
	 * useless for additional resources
	 */
	@Override
	@Deprecated
	public void createModel(IPath fullPath) {
		// do nothing
	}

	@Override
	public void createModel(URI uri) {
		// do nothing
	}

	@Override
	@Deprecated
	public void loadModel(IPath path) {
		// call registered snippets
		snippets.performStart(this);
	}

	@Override
	public void loadModel(URI uri) {
		// call registered snippets
		snippets.performStart(this);
	}

	@Override
	@Deprecated
	public void importModel(IPath fullPathWithoutExtension) {
		loadModel(fullPathWithoutExtension);
	}

	@Override
	public void importModel(URI uriWithoutExtension) {
		loadModel(uriWithoutExtension);
	}

	@Override
	public void saveModel() throws IOException {
		for (Resource r : modelSet.getResources()) {
			if (isAdditionalResource(getModelManager(), r.getURI())) {
				// only save referenced models not
				// read-only and either platform or file
				if (modelSet.shouldSave(r) && modelSet.isUserModelResource(r.getURI())) {
					if (r instanceof XMIResource) {
						r.save(Collections.singletonMap(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware()));
					} else {
						r.save(Collections.EMPTY_MAP);
					}

				}
			}
		}
	}

	/**
	 * useless for additional resources
	 */
	@Override
	@Deprecated
	public void changeModelPath(IPath fullPath) {
		// do nothing
	}

	@Override
	public void setModelURI(URI uri) {
		// do nothing
	}

	@Override
	public void unload() {
		// call registered snippets
		snippets.performDispose(this);

		// Unload remaining resources
		for (int i = 0; i < modelSet.getResources().size(); i++) {
			Resource next = modelSet.getResources().get(i);
			if (isAdditionalResource(getModelManager(), next.getURI())) {
				next.unload();
			}
		}
	}

	/**
	 * Check is a resource is additional in the resource set
	 *
	 * @param uri
	 *            the specified URI of the resource
	 * @return true if it is an additional resource
	 */
	public static boolean isAdditionalResource(ModelSet modelSet, URI uri) {
		if (uri != null) {
			URI uriWithoutExt = uri.trimFileExtension();
			return !modelSet.getURIWithoutExtension().equals(uriWithoutExt);
		}
		return false;
	}

	@Override
	public Set<URI> getModifiedURIs() {
		Set<URI> res = new HashSet<URI>();
		for (Resource r : modelSet.getResources()) {
			if (isAdditionalResource(getModelManager(), r.getURI())) {
				if (!r.isTrackingModification() || r.isModified()) {
					res.add(r.getURI());
				}
			}
		}
		return res;
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractModel#cleanModel(java.util.Set)
	 *
	 * @param resourcesToDelete
	 */
	@Override
	public void cleanModel(Set<URI> resourcesToDelete) {
		if (!resourcesToDelete.isEmpty()) {

			// Initialise exploration
			Iterator<Resource> modelResourcesIterator = modelSet.getResources().iterator();
			List<Resource> referencedDeletedResources = new ArrayList<Resource>();

			while (modelResourcesIterator.hasNext()) {

				// Verify if current resource will be deleted
				Resource currentResource = modelResourcesIterator.next();
				if (resourcesToDelete.contains(currentResource.getURI())) {

					referencedDeletedResources.add(currentResource);
				}

			}

			// Remove all bad references
			if (!referencedDeletedResources.isEmpty()) {
				modelSet.getResources().removeAll(referencedDeletedResources);
			}


		}

	}

}
