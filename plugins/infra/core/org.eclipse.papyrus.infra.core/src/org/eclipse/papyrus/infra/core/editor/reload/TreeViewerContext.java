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
import java.util.List;

import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.StructuredSelection;

import com.google.common.collect.Lists;

/**
 * A convenient context object for {@link IEditorReloadListener}s to store in an {@link EditorReloadEvent} to capture and restore
 * the expansion and selection state of nodes in a tree viewer.
 */
public abstract class TreeViewerContext<T> extends SelectionContext<AbstractTreeViewer, T> {

	private List<T> expandedNodes = Lists.newArrayList();

	public TreeViewerContext(AbstractTreeViewer viewer) {
		super(viewer);

		for (Object next : viewer.getExpandedElements()) {
			T token = token(next);
			if (token != null) {
				expandedNodes.add(token);
			}
		}
	}

	@Override
	public void restore(AbstractTreeViewer viewer) {
		List<Object> expand = Lists.newArrayListWithCapacity(expandedNodes.size());
		for (T next : expandedNodes) {
			Object resolved = resolve(next);
			if (resolved != null) {
				expand.add(resolved);
			}
		}
		setExpandedElements(viewer, expand);

		super.restore(viewer);
	}

	@Override
	protected void setSelection(AbstractTreeViewer viewer, List<?> selection) {
		viewer.setSelection(new StructuredSelection(selection), true);
	}

	protected void setExpandedElements(AbstractTreeViewer viewer, Collection<?> toExpand) {
		viewer.setExpandedElements(toExpand.toArray());
	}
}
