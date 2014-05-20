/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.resource;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.Activator;

/**
 * The Class RestoreDependencyHelper is used to restore broken URI according to a replacement Strategy.
 */
public class RestoreDependencyHelper {


	/** The  uri replacement strategy. */
	protected IURIReplacementStrategy iURIReplacementStrategy;

	/**
	 * Instantiates a new restore dependency helper.
	 *
	 * @param iURIReplacementStrategy the chosen uriReplacementStrategy
	 */
	public RestoreDependencyHelper(IURIReplacementStrategy iURIReplacementStrategy) {
		this.iURIReplacementStrategy = iURIReplacementStrategy;
	}

	/**
	 * Restore dependencies, iterate on all contents to check and replace URIs.
	 *
	 * @param resource the resource
	 * @return the collection
	 */
	public Collection<Replacement> restoreDependencies(Resource resource) {
		Iterator<EObject> allContentsIterator = resource.getAllContents();
		Collection<Replacement> replacements = new LinkedList<Replacement>();
		while(allContentsIterator.hasNext()) {
			EObject eObject = allContentsIterator.next();

			for(EReference reference : eObject.eClass().getEAllReferences()) {
				if(reference.isContainment()) {
					continue;
				}

				if(!reference.isChangeable()) {
					continue;
				}

				Object value = eObject.eGet(reference);
				if(value instanceof EObject) {
					EObject eObjectToReplace = (EObject)value;
					EObject newEObject = checkAndReplace(eObjectToReplace);
					if(newEObject == null) {
						continue;
					}

					try {
						eObject.eSet(reference, newEObject);
						replacements.add(new ReplacementImpl(eObject, reference, eObjectToReplace, newEObject));
					} catch (Exception ex) {
						Activator.log.error(ex);
					}

				} else if(value instanceof Collection<?>) {
					Map<EObject, EObject> previousToNewValue = new HashMap<EObject, EObject>();
					Collection<?> collection = (Collection<?>)value;
					for(Object collectionElement : (Collection<?>)value) {
						if(collectionElement instanceof EObject) {
							EObject eObjectToReplace = (EObject)collectionElement;
							EObject newEObject = checkAndReplace(eObjectToReplace);
							if(newEObject == null) {
								continue;
							}
							previousToNewValue.put(eObjectToReplace, newEObject);
						}
					}
					if(previousToNewValue.isEmpty()) {
						continue;
					}
					if(collection instanceof EStructuralFeature.Setting) {
						EStructuralFeature.Setting setting = (EStructuralFeature.Setting)collection;
						for(Map.Entry<EObject, EObject> entry : previousToNewValue.entrySet()) {
							EcoreUtil.replace(setting, entry.getKey(), entry.getValue());
							replacements.add(new ReplacementImpl(eObject, reference, entry.getKey(), entry.getValue()));
						}
					}
				}
			}
		}
		return replacements;
	}

	/**
	 * Check and replace.
	 *
	 * @param eObject the e object to replace
	 * @return the e object
	 */
	protected EObject checkAndReplace(EObject eObject) {
		URI eObjectURIToReplace = EcoreUtil.getURI(eObject);
		URI resourceURI = eObjectURIToReplace.trimFragment();
		if(!resourceURI.isEmpty()) {
			URI targetURI = iURIReplacementStrategy.getReplacementCandidate(resourceURI);
			if(targetURI != null && !targetURI.equals(resourceURI)) {
				return DependencyManagementHelper.replace(eObject, targetURI);
			}
		}
		return null;
	}

}
