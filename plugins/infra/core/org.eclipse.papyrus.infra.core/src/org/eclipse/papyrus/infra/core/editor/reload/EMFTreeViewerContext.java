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
import org.eclipse.jface.viewers.AbstractTreeViewer;

/**
 * A convenient context object for {@link IEditorReloadListener}s to store in an {@link EditorReloadEvent} to capture and restore
 * the expansion and selection state of nodes in an EMF-based tree viewer.
 */
public class EMFTreeViewerContext extends TreeViewerContext<URI> implements IAdaptable {

	private IInternalEMFSelectionContext emfContext;

	public EMFTreeViewerContext(AbstractTreeViewer viewer) {
		super(viewer);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return (adapter == IInternalEMFSelectionContext.class) ? getEMFContext() : null;
	}

	final IInternalEMFSelectionContext getEMFContext() {
		if(emfContext == null) {
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
