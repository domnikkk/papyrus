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
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelectionProvider;


/**
 * A convenient selection re-load context for UIs that present EMF-based content.
 */
public class EMFSelectionContext extends SelectionContext<ISelectionProvider, URI> implements IAdaptable {

	private IInternalEMFSelectionContext emfContext;

	public EMFSelectionContext(ISelectionProvider structuredSelectionProvider) {
		super(structuredSelectionProvider);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return (adapter == IInternalEMFSelectionContext.class) ? getEMFContext() : null;
	}

	final IInternalEMFSelectionContext getEMFContext() {
		if (emfContext == null) {
			emfContext = new IInternalEMFSelectionContext.Default();
		}
		return emfContext;
	}

	@Override
	protected URI getToken(Object object) {
		return getEMFContext().getToken(object);
	}

	@Override
	protected Object resolveToken(URI token) {
		return getEMFContext().resolveToken(token);
	}
}
