/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.modelrepair.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.core.resource.AbstractBaseModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;

public class SwitchLibraryContentProvider implements IStructuredContentProvider {

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing
	}

	public void dispose() {
		// Nothing
	}

	protected boolean isModelResource(ModelSet modelSet, Resource resource) {
		IModel resourceModel = modelSet.getModelFor(resource);
		if (resourceModel == null) {
			return false;
		}

		if (resourceModel instanceof AbstractBaseModel) {
			AbstractBaseModel model = (AbstractBaseModel) resourceModel;
			if (model.getResource() == resource) {
				return true;
			}

			if (model.isControlled(resource)) {
				return true;
			}
		}

		return false;
	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof ModelSet) {
			ModelSet modelSet = (ModelSet) inputElement;

			Set<URI> allReferencedURIs = new HashSet<URI>();

			Set<Resource> allModelResources = new HashSet<Resource>();

			for (Resource resource : modelSet.getResources()) {
				if (isModelResource(modelSet, resource)) {
					allModelResources.add(resource);
				}
			}

			for (Resource modelResource : allModelResources) {

				// Use properContents to avoid iterating twice on controlled resources
				Iterator<EObject> allContents = EcoreUtil.getAllProperContents(modelResource, true);


				// Iterate on the contents to find all the outgoing references. Is there a helper for that?
				while (allContents.hasNext()) {
					EObject next = allContents.next();
					List<EReference> allReferences = next.eClass().getEAllReferences();
					for (EReference reference : allReferences) {
						if (reference.isContainer() || reference.isContainment()) {
							continue;
						}

						if (reference.isVolatile() || reference.isTransient()) {
							continue;
						}

						if (reference.isDerived() || !reference.isChangeable()) {
							continue;
						}

						Object value = next.eGet(reference);
						if (value instanceof EObject) {
							handleReferenceValue(value, allReferencedURIs);
						} else if (value instanceof List<?>) {
							List<?> values = (List<?>) value;
							for (Object objectValue : values) {
								handleReferenceValue(objectValue, allReferencedURIs);
							}
						}
					}
				}
			}

			URI referencedURI;
			for (Iterator<URI> iterator = allReferencedURIs.iterator(); iterator.hasNext();) {
				referencedURI = iterator.next();
				if (referencedURI == null) {
					iterator.remove();
					continue;
				}

				Resource referencedResource = modelSet.getResource(referencedURI, false);
				if (referencedResource != null) {
					if (allModelResources.contains(referencedResource)) {
						iterator.remove();
						continue;
					}

					// Fragments will be handled with their parent
					if (referencedURI instanceof Resource) {
						for (EObject rootElement : ((Resource) referencedURI).getContents()) {
							if (rootElement.eContainer() != null) {
								iterator.remove();
							}
						}
					}
				}
			}

			return allReferencedURIs.toArray();
		}
		return null;
	}

	protected void handleReferenceValue(Object objectValue, Set<URI> allReferencedURIs) {
		if (objectValue instanceof EObject) {
			EObject eObject = (EObject) objectValue;
			allReferencedURIs.add(EcoreUtil.getURI(eObject).trimFragment());
		}
	}
}
