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
package org.eclipse.papyrus.infra.core.editor.reload;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


/**
 * An {@linkplain EditorReloadEvent#putContext(Object) editor reload context} that composes other reload contexts.
 * This should be used whenever a {@linkplain IReloadContextProvider reload context provider} supplies multiple
 * reload contexts, to ensure that they are properly initialized by the reload system.
 */
public class CompositeReloadContext implements IDisposableReloadContext, IAdaptable {

	private final Collection<Object> reloadContexts;

	public CompositeReloadContext() {
		this(Collections.EMPTY_LIST);
	}

	public CompositeReloadContext(Iterable<?> reloadContexts) {
		super();

		this.reloadContexts = Lists.newArrayList(reloadContexts);
	}

	public <T> T add(T reloadContext) {
		reloadContexts.add(reloadContext);
		return reloadContext;
	}

	public Iterable<?> getReloadContexts() {
		return Collections.unmodifiableCollection(reloadContexts);
	}

	public <T> Iterable<T> getReloadContexts(Class<T> type) {
		return Iterables.filter(getReloadContexts(), type);
	}

	@Override
	public void dispose() {
		for(Object next : reloadContexts) {
			if(next instanceof IDisposableReloadContext) {
				((IDisposableReloadContext)next).dispose();
			}
		}

		reloadContexts.clear();
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return (adapter == IInternalEMFSelectionContext.class) ? getEMFContext() : null;
	}

	private IInternalEMFSelectionContext getEMFContext() {
		IInternalEMFSelectionContext result = null;

		for(Object next : reloadContexts) {
			if(AdapterUtils.adapt(next, IInternalEMFSelectionContext.class, null) != null) {
				// We need the adapter
				result = new IInternalEMFSelectionContext.Composite(this);
				break;
			}
		}

		return result;
	}
}
