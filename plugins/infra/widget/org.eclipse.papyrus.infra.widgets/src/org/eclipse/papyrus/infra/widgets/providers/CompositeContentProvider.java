/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (camille.letavernier@cea.fr) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.providers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class CompositeContentProvider implements ICompositeContentProvider {

	private final List<ITreeContentProvider> contentProviders;

	public CompositeContentProvider() {
		contentProviders = new LinkedList<ITreeContentProvider>();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		List<Object> result = new LinkedList<Object>();
		for (ITreeContentProvider provider : contentProviders) {
			result.addAll(Arrays.asList(provider.getElements(inputElement)));
		}
		return result.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> result = new LinkedList<Object>();
		for (ITreeContentProvider provider : contentProviders) {
			result.addAll(Arrays.asList(provider.getChildren(parentElement)));
		}
		return result.toArray();
	}

	@Override
	public Object getParent(Object element) {
		for (ITreeContentProvider provider : contentProviders) {
			Object parent = provider.getParent(element);
			if (parent != null) {
				return parent;
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public void dispose() {
		for (ITreeContentProvider provider : contentProviders) {
			provider.dispose();
		}
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		for (ITreeContentProvider provider : contentProviders) {
			provider.inputChanged(viewer, oldInput, newInput);
		}
	}

	@Override
	public boolean isValidValue(Object element) {
		for (ITreeContentProvider provider : contentProviders) {
			if (provider instanceof IHierarchicContentProvider) {
				if (((IHierarchicContentProvider) provider).isValidValue(element)) {
					return true;
				}
			} else {
				return true; // For non-hierarchic content providers, isValidValue is always true
			}
		}

		return false;
	}

	@Override
	public void appendContentProvider(ITreeContentProvider treeContentProvider) {
		contentProviders.add(treeContentProvider);
	}

}
