/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 455075
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.providers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.infra.tools.util.ListHelper;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.infra.widgets.strategy.IStrategyBasedContentProvider;
import org.eclipse.papyrus.infra.widgets.strategy.TreeBrowseStrategy;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.swt.widgets.Composite;

/**
 * A ContentProvider encapsulate another ContentProvider.
 * This class implements all Papyrus interfaces extending IContentProvider,
 * and is thus compatible with all papyrus tools, even if the encapsulated
 * provider is not.
 *
 * Moreover, the Encapsulated provider can handle temporary elements.
 *
 * @author Camille Letavernier
 *
 */
// TODO : Move the temporary elements feature to another class.
// This feature is only used by multi-reference dialogs
public class EncapsulatedContentProvider implements IHierarchicContentProvider, IGraphicalContentProvider, ICommitListener, IAdaptableContentProvider, IRevealSemanticElement, IStrategyBasedContentProvider, IStaticContentProvider {

	/**
	 * The encapsulated static content provider
	 */
	protected IStructuredContentProvider encapsulated;

	/**
	 * The set of temporaryElements, which are added from outside this ContentProvider
	 */
	private Set<Object> temporaryElements = new LinkedHashSet<Object>();

	/**
	 *
	 * Constructor.
	 *
	 * @param encapsulated
	 *            The encapsulated content provider, to which all calls will be forwarded
	 */
	public EncapsulatedContentProvider(IStructuredContentProvider encapsulated) {
		this.encapsulated = encapsulated;
	}

	/**
	 *
	 * Constructor.
	 *
	 */
	protected EncapsulatedContentProvider() {
	}

	/**
	 * Returns all elements known by this ContentProvider. This is the union of
	 * the objects returned by the wrapped StaticContentProvider and the temporary
	 * elements, which are not known by the wrapped provider.
	 *
	 * @param elements
	 *            The Object[] returned by the encapsulated provider
	 * @return
	 *         All elements known by this ContentProvider
	 */
	private Object[] getAllElements(Object[] elements) {
		if (temporaryElements.isEmpty()) {
			return elements;
		}

		List<Object> result = ListHelper.asList(elements);
		result.addAll(temporaryElements);
		return result.toArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		// encapsulated.dispose();
		// encapsulated = null;
	}

	/**
	 * Updates me to encapsulate a new {@code delegate}. If it makes sense for a particular instance, this may
	 * collapse any chain of providers that are exactly of {@link EncapsulatedContentProvider} type (not some
	 * subclass that may have different behaviour). If it is necessary to delegate to another encapsulated
	 * instance as is, then simply assign the protected {@link #encapsulated} field.
	 * 
	 * @param delegate
	 *            my new delegate, or {@code null} to simply forget the previous delegate
	 */
	protected void encapsulate(IStructuredContentProvider delegate) {
		while ((delegate != null) && (delegate.getClass() == EncapsulatedContentProvider.class)) {
			delegate = ((EncapsulatedContentProvider) delegate).encapsulated;
		}

		this.encapsulated = delegate;
	}

	protected void addViewerFilter(StructuredViewer viewer, ViewerFilter filter) {
		Set<ViewerFilter> currentFilters = new LinkedHashSet<ViewerFilter>(Arrays.asList(viewer.getFilters()));
		currentFilters.add(filter);
		viewer.setFilters(currentFilters.toArray(new ViewerFilter[currentFilters.size()]));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (encapsulated != null) {
			encapsulated.inputChanged(viewer, oldInput, newInput);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (encapsulated == null) {
			return new Object[0];
		}
		return getAllElements(encapsulated.getElements(inputElement));
	}

	/**
	 * Gets the elements for this content provider
	 *
	 * @return
	 *         all elements from the wrapped ContentProvider
	 */
	@Override
	public Object[] getElements() {
		if (encapsulated instanceof IStaticContentProvider) {
			return getAllElements(((IStaticContentProvider) encapsulated).getElements());
		}
		return getElements(null);
	}

	/**
	 * Adds a Temporary element to this ContentProvider
	 *
	 * @param newObject
	 *            The temporary element to be added
	 */
	public void addTemporaryElement(Object newObject) {
		temporaryElements.add(newObject);
	}

	/**
	 * Removes a Temporary element from this ContentProvider
	 *
	 * @param removeObject
	 *            The temporary element to remove
	 */
	public void removeTemporaryElement(Object removeObject) {
		temporaryElements.remove(removeObject);
	}

	/**
	 * Clears all temporary elements from this content provider
	 */
	public void clearTemporaryElements() {
		temporaryElements.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (encapsulated instanceof ITreeContentProvider) {
			return ((ITreeContentProvider) encapsulated).getChildren(parentElement);
		} else {
			return new Object[0];
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getParent(Object element) {
		if (encapsulated instanceof ITreeContentProvider) {
			return ((ITreeContentProvider) encapsulated).getParent(element);
		} else {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean hasChildren(Object element) {
		if (encapsulated instanceof ITreeContentProvider) {
			return ((ITreeContentProvider) encapsulated).hasChildren(element);
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValidValue(Object element) {
		if (encapsulated instanceof IHierarchicContentProvider) {
			return ((IHierarchicContentProvider) encapsulated).isValidValue(element);
		} else {
			return true;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createBefore(Composite parent) {
		if (encapsulated instanceof IGraphicalContentProvider) {
			((IGraphicalContentProvider) encapsulated).createBefore(parent);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createAfter(Composite parent) {
		if (encapsulated instanceof IGraphicalContentProvider) {
			((IGraphicalContentProvider) encapsulated).createAfter(parent);
		}
	}

	@Override
	public void commit(AbstractEditor editor) {
		if (encapsulated instanceof ICommitListener) {
			((ICommitListener) encapsulated).commit(editor);
		}
	}

	@Override
	public Object getAdaptedValue(Object selection) {
		if (encapsulated instanceof IAdaptableContentProvider) {
			return ((IAdaptableContentProvider) encapsulated).getAdaptedValue(selection);
		}
		return selection;
	}

	@Override
	public void revealSemanticElement(List<?> elementList) {
		if (encapsulated instanceof IRevealSemanticElement) {
			((IRevealSemanticElement) encapsulated).revealSemanticElement(elementList);
		}
	}

	@Override
	public TreeBrowseStrategy getBrowseStrategy() {
		if (encapsulated instanceof IStrategyBasedContentProvider) {
			return ((IStrategyBasedContentProvider) encapsulated).getBrowseStrategy();
		}
		return null;
	}

	@Override
	public TreeBrowseStrategy getRevealStrategy() {
		if (encapsulated instanceof IStrategyBasedContentProvider) {
			return ((IStrategyBasedContentProvider) encapsulated).getRevealStrategy();
		}
		return null;
	}
}
