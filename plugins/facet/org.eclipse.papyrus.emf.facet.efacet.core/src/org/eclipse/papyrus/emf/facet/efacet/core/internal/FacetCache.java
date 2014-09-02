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

package org.eclipse.papyrus.emf.facet.efacet.core.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A cache of resolved facet overrides for an {@link EObject}. It expunges itself automatically when
 * it detects that it is out-of-date with respect to the {@link FacetManagerContext}.
 */
class FacetCache extends AdapterImpl {

	private final FacetManagerContext context;

	private long currentGeneration = -1;

	private final Map<ETypedElement, ETypedElement> overrides = new HashMap<ETypedElement, ETypedElement>();

	FacetCache(EObject owner, FacetManagerContext context) {
		this.context = context;
		owner.eAdapters().add(this);
	}

	static FacetCache getInstance(EObject element, FacetManagerContext context) {
		FacetCache result = (FacetCache) EcoreUtil.getExistingAdapter(element, context);

		if (result == null) {
			result = new FacetCache(element, context);
		}

		return result;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == context;
	}

	@Override
	public void notifyChanged(Notification msg) {
		if (!msg.isTouch()) {
			// It could be that some facet/customization predicate has changed for me. Purge the cache
			currentGeneration = -1;
		}
	}

	public <T extends ETypedElement> T resolve(T feature) {
		if (context.facetGeneration > currentGeneration) {
			// Purge and recompute as needed
			overrides.clear();
			currentGeneration = context.facetGeneration;
		}

		// This should be safe because we should only add mappings of matching types, although this cannot
		// actually be enforced in any way
		@SuppressWarnings("unchecked")
		T result = (T) overrides.get(feature);
		return result;
	}

	<T extends ETypedElement> void add(T feature, T override) {
		overrides.put(feature, override);
	}
}
