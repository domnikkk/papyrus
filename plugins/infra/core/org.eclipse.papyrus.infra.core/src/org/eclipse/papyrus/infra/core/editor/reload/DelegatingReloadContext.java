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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;


/**
 * An {@linkplain EditorReloadEvent#putContext(Object) editor reload context} that delegates to another reload context.
 * This should be used whenever a {@linkplain IReloadContextProvider reload context provider} is needed to get a reload
 * context to delegate to.
 */
public class DelegatingReloadContext implements IDisposableReloadContext, IAdaptable {

	private Object delegate;

	public DelegatingReloadContext(Object reloadContextProvider) {
		super();

		IReloadContextProvider provider = AdapterUtils.adapt(reloadContextProvider, IReloadContextProvider.class, null);
		if (provider != null) {
			delegate = provider.createReloadContext();
		}
	}

	@Override
	public void dispose() {
		if (delegate instanceof IDisposableReloadContext) {
			((IDisposableReloadContext) delegate).dispose();
		}

		delegate = null;
	}

	public Object getDelegate() {
		return delegate;
	}

	public void restore(Object reloadContextProvider) {
		if (delegate != null) {
			IReloadContextProvider provider = AdapterUtils.adapt(reloadContextProvider, IReloadContextProvider.class, null);
			if (provider != null) {
				provider.restore(delegate);
			}
		}
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return (adapter == IInternalEMFSelectionContext.class) ? getEMFContext() : null;
	}

	private IInternalEMFSelectionContext getEMFContext() {
		IInternalEMFSelectionContext result = null;

		if ((delegate != null) && (AdapterUtils.adapt(delegate, IInternalEMFSelectionContext.class, null) != null)) {
			// We need the adapter
			result = new IInternalEMFSelectionContext.Delegating(this);
		}

		return result;
	}
}
