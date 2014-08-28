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

import java.util.List;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import com.google.common.collect.Lists;

/**
 * A convenient context object for {@link IEditorReloadListener}s to store in an {@link EditorReloadEvent} to capture and restore
 * the selection state a selection provider;
 *
 * @param <V>
 *            the type of selection provider
 * @param <T>
 *            the type of token used to restore the selection state
 */
public abstract class SelectionContext<V extends ISelectionProvider, T> {

	private List<T> selection = Lists.newArrayList();

	public SelectionContext(V structuredSelectionProvider) {
		for (Object next : ((IStructuredSelection) structuredSelectionProvider.getSelection()).toList()) {
			T token = token(next);
			if (token != null) {
				selection.add(token);
			}
		}
	}

	public void restore(V structuredSelectionProvider) {
		List<Object> select = Lists.newArrayListWithCapacity(selection.size());
		for (T next : selection) {
			Object resolved = resolve(next);
			if (resolved != null) {
				select.add(resolved);
			}
		}
		setSelection(structuredSelectionProvider, select);
	}

	T token(Object selectableElement) {
		Object deresolved = deresolveSelectableElement(selectableElement);
		return (deresolved == null) ? null : getToken(deresolved);
	}

	protected Object deresolveSelectableElement(Object selectableElement) {
		return selectableElement;
	}

	protected abstract T getToken(Object object);

	Object resolve(T token) {
		Object deresolved = resolveToken(token);
		return (deresolved == null) ? null : resolveSelectableElement(deresolved);
	}

	protected Object resolveSelectableElement(Object deresolved) {
		return deresolved;
	}

	protected abstract Object resolveToken(T token);

	protected void setSelection(V structuredSelectionProvider, List<?> selection) {
		structuredSelectionProvider.setSelection(new StructuredSelection(selection));
	}
}
