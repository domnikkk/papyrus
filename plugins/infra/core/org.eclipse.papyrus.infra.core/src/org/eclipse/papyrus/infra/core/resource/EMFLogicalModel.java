/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 437052
 *  Christian W. Damus - bug 399859
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436952
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.Activator;

/**
 * An IModel which is an abstraction for a set of consistent EMF Resources
 *
 * @author Camille Letavernier
 *
 */
public abstract class EMFLogicalModel extends AbstractBaseModel implements IEMFModel {

	protected final Set<Resource> resources = new HashSet<Resource>();

	public Set<Resource> getResources() {
		pruneDeletedResources();
		return resources;
	}

	protected void pruneDeletedResources() {
		ResourceSet rset = getModelManager();
		for (Iterator<Resource> iter = resources.iterator(); iter.hasNext();) {
			if (iter.next().getResourceSet() != rset) {
				// This resource was deleted
				iter.remove();
			}
		}
	}

	@Override
	protected void configureResource(Resource resourceToConfigure) {
		super.configureResource(resourceToConfigure);
		if (resourceToConfigure != null) {
			resources.add(resourceToConfigure);
		}
	}

	protected boolean isRelatedResource(Resource resource) {
		if (resource == null) {
			return false;
		}

		return resource.getURI().fileExtension().equals(getModelFileExtension());
	}

	@Override
	public void saveModel() throws IOException {
		final ModelSet set = getModelManager();

		for (Resource resource : getResources()) {
			if (set.shouldSave(resource)) {
				try {
					resource.save(null);
				} catch (IOException ex) {
					// If an exception occurs, we should not prevent other resources from being saved.
					// This would probably make things even worse. Catch and log.
					Activator.log.error(ex);
				}
			}
		}
	}

	@Override
	public void handle(Resource resource) {
		if (isRelatedResource(resource)) {
			configureResource(resource);
		}
	}

	@Override
	public void unload() {
		super.unload();
		getResources().clear();
	}

	@Override
	public void setModelURI(URI uriWithoutExtension) {
		for (Resource resource : getResources()) {
			if (isControlled(resource)) {
				updateURI(resource, uriWithoutExtension);
			}
		}
		super.setModelURI(uriWithoutExtension);
	}

	protected void updateURI(Resource resource, URI uriWithoutExtension) {
		URI oldBaseURI = this.resource.getURI();
		URI newBaseURI = uriWithoutExtension.appendFileExtension(getModelFileExtension());

		URI currentFullURI = resource.getURI();
		URI currentRelativeURI = currentFullURI.deresolve(oldBaseURI);
		URI newFullURI = currentRelativeURI.resolve(newBaseURI);

		resource.setURI(newFullURI);
	}

	@Override
	public boolean isModelFor(Object element) {
		if (element instanceof EObject) {
			return resources.contains(((EObject) element).eResource());
		}
		return resources.contains(element);
	}

	/**
	 * Clean model.
	 *
	 * @param resourcesToDelete
	 *            the resource to delete
	 * @see org.eclipse.papyrus.infra.core.resource.IModel#cleanModel(java.util.Set)
	 */
	@Override
	public void cleanModel(Set<URI> resourcesToDelete) {

		if (!resourcesToDelete.isEmpty()) {

			// Initialise exploration
			Iterator<Resource> modelResourcesIterator = getResources().iterator();
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
				getResources().removeAll(referencedDeletedResources);
			}


		}

	}

}
