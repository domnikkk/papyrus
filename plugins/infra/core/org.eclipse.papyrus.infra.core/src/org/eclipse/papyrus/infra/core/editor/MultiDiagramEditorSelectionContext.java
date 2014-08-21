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
package org.eclipse.papyrus.infra.core.editor;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.reload.CompositeReloadContext;
import org.eclipse.papyrus.infra.core.editor.reload.DelegatingReloadContext;
import org.eclipse.papyrus.infra.core.editor.reload.EMFSelectionContext;
import org.eclipse.papyrus.infra.core.editor.reload.EditorReloadEvent;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IComponentPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageVisitor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;


/**
 * A {@linkplain EditorReloadEvent reload event} context that restores the selection of which editor page
 * is active in an {@link IMultiDiagramEditor} that is reloaded and delegates to its pages to capture
 * re-load context for each to restore whatever they need to restore (internal selections etc.).
 */
class MultiDiagramEditorSelectionContext extends CompositeReloadContext {

	private ISashWindowsContainer sashContainer;

	private final List<URI> resourcesToLoad;

	MultiDiagramEditorSelectionContext(IMultiDiagramEditor editor) {
		super();

		init(editor);

		resourcesToLoad = computeResourcesToLoad(editor);

		IPage active = sashContainer.getActiveSashWindowsPage();
		DiagramPageContext activePage = null;

		Set<IPage> visiblePages = Sets.newIdentityHashSet();
		visiblePages.addAll(sashContainer.getVisiblePages());

		List<IPage> allPages = getAllPages(sashContainer);

		for (IPage page : allPages) {
			final DelegatingReloadContext delegator = (page instanceof IEditorPage) ? add(new DelegatingReloadContext(((IEditorPage) page).getIEditorPart())) : null;
			DiagramPageContext context;

			if (page == active) {
				// This one will have the selection of the active page
				context = new DiagramPageContext(new VisiblePageSelectionProvider(page), page, delegator);
				activePage = context;
			} else {
				if (visiblePages.contains(page)) {
					// This one must be selected in its folder in order to make it visible again
					context = new DiagramPageContext(new VisiblePageSelectionProvider(page), page, delegator);
				} else {
					context = new DiagramPageContext(EmptySelectionProvider.INSTANCE, page, delegator);
				}

				// We make sure always to restore the active page last
				// so that it will not only be visible but also the
				// over-all active page
				add(context);
			}
		}

		if (activePage != null) {
			// Restore this one last
			add(activePage);
		}
	}

	@Override
	public void dispose() {
		sashContainer = null;
		super.dispose();
	}

	private List<IPage> getAllPages(ISashWindowsContainer container) {
		final List<IPage> result = Lists.newArrayList();

		container.visit(new IPageVisitor() {

			@Override
			public void accept(IEditorPage page) {
				result.add(page);
			}

			@Override
			public void accept(IComponentPage page) {
				result.add(page);
			}
		});

		return result;
	}

	private void init(IMultiDiagramEditor editor) {
		sashContainer = AdapterUtils.adapt(editor, ISashWindowsContainer.class, null);
	}

	void restore(IMultiDiagramEditor editor) {
		init(editor);

		// Forcibly re-load all previously loaded resources to that
		// (a) we don't lose imports that weren't yet used, and
		// (b) we can restore selections in resources that wouldn't be loaded until proxies resolve later
		reloadResources(editor);

		ISelectionProvider selectionProvider = new VisiblePageSelectionProvider();
		for (DiagramPageContext next : getReloadContexts(DiagramPageContext.class)) {
			next.restore(selectionProvider);
		}
	}

	protected List<URI> computeResourcesToLoad(IMultiDiagramEditor editor) {
		List<URI> result = null;

		ResourceSet rset = getResourceSet(editor);
		if (rset != null) {
			result = Lists.newArrayListWithCapacity(rset.getResources().size());

			for (Resource next : rset.getResources()) {
				if (next.isLoaded()) {
					result.add(next.getURI());
				}
			}
		}

		return result;
	}

	protected void reloadResources(IMultiDiagramEditor editor) {
		if (resourcesToLoad != null) {
			ResourceSet rset = getResourceSet(editor);
			if (rset != null) {
				for (URI next : resourcesToLoad) {
					try {
						rset.getResource(next, true);
					} catch (Exception e) {
						Activator.log.error("Failed to restore loaded resource: " + next, e); //$NON-NLS-1$
					}
				}
			}
		}
	}

	protected final ResourceSet getResourceSet(IMultiDiagramEditor editor) {
		ResourceSet result = null;

		EditingDomain editingDomain = (EditingDomain) editor.getAdapter(EditingDomain.class);
		if (editingDomain != null) {
			result = editingDomain.getResourceSet();
		}

		return result;
	}

	//
	// Nested types
	//

	private class DiagramPageContext extends EMFSelectionContext {

		private URI pageRef;

		private DelegatingReloadContext pageContext;

		DiagramPageContext(ISelectionProvider structuredSelectionProvider, IPage page, DelegatingReloadContext pageContext) {
			super(structuredSelectionProvider);

			this.pageContext = pageContext;
			this.pageRef = getToken(page.getRawModel());
		}

		@Override
		public void restore(ISelectionProvider structuredSelectionProvider) {
			IPage page = sashContainer.lookupModelPage(resolveToken(pageRef));

			if ((pageContext != null) && (page instanceof IEditorPage)) {
				pageContext.restore(((IEditorPage) page).getIEditorPart());
			}

			super.restore(structuredSelectionProvider);
		}

		@Override
		protected Object deresolveSelectableElement(Object selectableElement) {
			return (selectableElement instanceof IPage) ? ((IPage) selectableElement).getRawModel() : super.deresolveSelectableElement(selectableElement);
		}

		@Override
		protected Object resolveSelectableElement(Object deresolved) {
			return sashContainer.lookupModelPage(deresolved);
		}
	}

	private static class EmptySelectionProvider implements ISelectionProvider {

		static final EmptySelectionProvider INSTANCE = new EmptySelectionProvider();

		EmptySelectionProvider() {
			super();
		}

		@Override
		public ISelection getSelection() {
			return StructuredSelection.EMPTY;
		}

		@Override
		public void setSelection(ISelection selection) {
			// Pass
		}

		@Override
		public void addSelectionChangedListener(ISelectionChangedListener listener) {
			// Not needed because the selection is always empty
		}

		@Override
		public void removeSelectionChangedListener(ISelectionChangedListener listener) {
			// Not needed because the selection is always empty
		}

	}

	private class VisiblePageSelectionProvider implements ISelectionProvider {

		private final IStructuredSelection selection;

		VisiblePageSelectionProvider() {
			this(null);
		}

		VisiblePageSelectionProvider(IPage visible) {
			super();

			this.selection = (visible == null) ? StructuredSelection.EMPTY : new StructuredSelection(visible);
		}

		@Override
		public ISelection getSelection() {
			return selection;
		}

		@Override
		public void setSelection(ISelection selection) {
			if (!selection.isEmpty()) {
				IPage page = (IPage) ((IStructuredSelection) selection).getFirstElement();
				sashContainer.selectPage(page);
			}
		}

		@Override
		public void addSelectionChangedListener(ISelectionChangedListener listener) {
			// Not needed
		}

		@Override
		public void removeSelectionChangedListener(ISelectionChangedListener listener) {
			// Not needed
		}

	}
}
