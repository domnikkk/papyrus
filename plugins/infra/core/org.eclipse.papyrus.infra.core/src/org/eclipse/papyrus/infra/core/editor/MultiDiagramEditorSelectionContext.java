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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
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


/**
 * A {@linkplain EditorReloadEvent reload event} context that restores the selection of which editor page
 * is active in an {@link IMultiDiagramEditor} that is reloaded and delegates to its pages to capture
 * re-load context for each to restore whatever they need to restore (internal selections etc.).
 */
class MultiDiagramEditorSelectionContext extends CompositeReloadContext {

	private ISashWindowsContainer sashContainer;

	MultiDiagramEditorSelectionContext(IMultiDiagramEditor editor) {
		super();

		init(editor);

		ActivePageSelectionProvider activePageSelectionProvider = new ActivePageSelectionProvider();
		IPage active = sashContainer.getActiveSashWindowsPage();
		DiagramPageContext activePage = null;

		List<IPage> visible = getAllPages(sashContainer);

		for(IPage page : visible) {
			final DelegatingReloadContext delegator = (page instanceof IEditorPage) ? add(new DelegatingReloadContext(((IEditorPage)page).getIEditorPart())) : null;
			DiagramPageContext context;

			if(page == active) {
				// This one will have the selection of the active page
				context = new DiagramPageContext(activePageSelectionProvider, page, delegator);
				activePage = context;
			} else {
				// We make sure always to restore the active page last
				// so that its selection is certain to be set properly
				context = new DiagramPageContext(EmptySelectionProvider.INSTANCE, page, delegator);
				add(context);
			}
		}

		if(activePage != null) {
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

		ISelectionProvider selectionProvider = new ActivePageSelectionProvider();
		for(DiagramPageContext next : getReloadContexts(DiagramPageContext.class)) {
			next.restore(selectionProvider);
		}
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

			if((pageContext != null) && (page instanceof IEditorPage)) {
				pageContext.restore(((IEditorPage)page).getIEditorPart());
			}

			super.restore(structuredSelectionProvider);
		}

		@Override
		protected Object deresolveSelectableElement(Object selectableElement) {
			return (selectableElement instanceof IPage) ? ((IPage)selectableElement).getRawModel() : super.deresolveSelectableElement(selectableElement);
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

	private class ActivePageSelectionProvider implements ISelectionProvider {

		ActivePageSelectionProvider() {
			super();
		}

		@Override
		public ISelection getSelection() {
			IPage active = sashContainer.getActiveSashWindowsPage();

			return (active == null) ? StructuredSelection.EMPTY : new StructuredSelection(active);
		}

		@Override
		public void setSelection(ISelection selection) {
			if(!selection.isEmpty()) {
				IPage page = (IPage)((IStructuredSelection)selection).getFirstElement();
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
