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
 *  Tristan FAURE (Atos) tristan.faure@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading.impl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.core.Activator;
import org.eclipse.papyrus.core.resourceloading.HistoryRoutingManager;
import org.eclipse.papyrus.core.resourceloading.IProxyManager;
import org.eclipse.papyrus.log.LogHelper;
import org.eclipse.papyrus.resource.ModelSet;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

/**
 * This routing manager does not manage routing it search xmi ids in the different resources.
 * if some double xmi ids are found it is logged to the user
 * 
 * @author tfaure
 * 
 */
public class MapBasedHistoryManager extends HistoryRoutingManager {


	public MapBasedHistoryManager(IProxyManager proxyManager) {
		super(proxyManager);
	}

	@Override
	public EObject getEObject(ModelSet modelSet, String resourceURI, String fragment) {
		// ? and / means computed path => we only manage xmi ids cf ResourceImpl.java
		if(fragment != null && fragment.charAt(0) == '?' || fragment.charAt(0) == '/') {
			return null;
		}
		Set<EObject> result = new HashSet<EObject>();
		for(Resource r : modelSet.getResources()) {
			// use directly intrinsic id to avoid nested call in getEOBject
			addIfNotNull(r.getEObject(fragment), result);
		}
		int size = result.size();
		if(size > 1) {
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("the uri fragment %s is present in several resources : ", fragment));
			Iterable<String> transformed = Iterables.transform(result, new Function<EObject, String>() {

				public String apply(EObject arg0) {
					Resource eResource = arg0.eResource();
					if(eResource != null) {
						return eResource.getURI().toString();
					}
					return null;
				}
			});
			transformed = Iterables.filter(transformed, Predicates.notNull());
			builder.append(Joiner.on(", ").join(transformed));
			new LogHelper(Activator.getDefault()).warn(builder.toString());
		}
		if(size > 0) {
			return result.iterator().next();
		}
		return null;
	}

	private void addIfNotNull(EObject eObject, Set<EObject> result) {
		if(eObject != null) {
			result.add(eObject);
		}
	}

	@Override
	public void unload() {
		// do nothing
	}


}
