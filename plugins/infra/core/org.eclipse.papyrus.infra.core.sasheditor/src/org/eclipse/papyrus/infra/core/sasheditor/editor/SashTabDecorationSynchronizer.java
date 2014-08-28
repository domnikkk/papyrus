/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.sasheditor.editor;


import org.eclipse.papyrus.infra.core.sasheditor.Activator;
import org.eclipse.papyrus.infra.core.sasheditor.internal.SashWindowsContainer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;


/**
 * This class take care to refresh a Sash Tab (name and icon) when its model change.
 * The class listen to IEditor property change, and refresh the corresponding tab
 * accordingly.
 * The class also listen on {@link SashWindowsContainer} page's life cycle in order to
 * attach/remove the listener on pages.
 *
 * The class can be extended.
 *
 * @author cedric dumoulin
 *
 */
public class SashTabDecorationSynchronizer {

	/**
	 * The container to synchronize.
	 */
	private SashWindowsContainer container;

	/**
	 * Listener on Container'pages life cycle.
	 */
	IPageLifeCycleEventsListener pageLifeCycleListener = new IPageLifeCycleEventsListener() {

		@Override
		public void pageChanged(IPage newPage) {
		}

		@Override
		public void pageOpened(IPage page) {
			attachPage(page);

		}

		@Override
		public void pageDeactivated(IPage page) {
		}

		@Override
		public void pageClosed(IPage page) {
			detachPage(page);

		}

		@Override
		public void pageActivated(IPage page) {
		}

		@Override
		public void pageAboutToBeOpened(IPage page) {
		}

		@Override
		public void pageAboutToBeClosed(IPage page) {
		}
	};

	/**
	 * Listener on changes of an {@link IEditorPart}
	 */
	private IPropertyListener editorPartPropertyListener = new IPropertyListener() {

		@Override
		public void propertyChanged(Object source, int propId) {
			if (propId == IWorkbenchPart.PROP_TITLE && source instanceof IEditorPart)
			{
				refreshContainerTabForPage((IEditorPart) source);
			}

		}
	};

	/**
	 *
	 * Constructor.
	 *
	 * @param container
	 *            The container to synchronize.
	 *
	 */
	public SashTabDecorationSynchronizer(SashWindowsContainer container) {
		this.container = container;
		attachContainerPages();
		attachListeners();
	}

	/**
	 * Detach any listeners.
	 */
	public void dispose() {
		detachListeners();
		detachContainerPages();
	}

	/**
	 * Attach listeners requested by the class.
	 */
	protected void attachListeners() {
		container.addPageLifeCycleListener(pageLifeCycleListener);
	}

	/**
	 * Detach listeners requested by the class.
	 */
	protected void detachListeners() {
		if (!container.isDisposed()) {
			container.removePageLifeCycleListener(pageLifeCycleListener);
		}
	}

	/**
	 * Start listening on change for the specified page.
	 *
	 * @param page
	 */
	protected void attachPage(IPage page) {
		if (page instanceof IEditorPage)
		{
			Activator.log.debug("attachPage( " + page + " )");
			IEditorPage editorPage = (IEditorPage) page;
			editorPage.getIEditorPart().addPropertyListener(editorPartPropertyListener);
		}

	}

	/**
	 * Stop listening on change for the specified page.
	 *
	 * @param page
	 */
	protected void detachPage(IPage page) {
		// IEditorPage are already disposed, so we don't need to remove anything
		// if( page instanceof IEditorPage )
		// {
		// log.fine("attachPage( " + page + " )");
		// IEditorPage editorPage = (IEditorPage)page;
		// editorPage.getIEditorPart().removePropertyListener(editorPartPropertyListener);
		// }
	}

	protected void refreshContainerTabForPage(IEditorPart source) {
		// lookup page
		IPage page = container.lookupIPageByIEditorPart(source);
		refreshContainerTabForPage(page);

	}

	/**
	 * Refresh the tab for the specified page
	 *
	 * @param page
	 */
	protected void refreshContainerTabForPage(IPage page) {
		container.refreshPageTab(page);
	}

	/**
	 * Iterate on pages owned by the container, and call detachPage for each.
	 */
	private void detachContainerPages() {
		// Visit all pages of the container.
		if (!container.isDisposed()) {
			container.visit(new DetachVisitor());
		}

	}

	/**
	 * Iterate on pages owned by the container, and call detachPage for each.
	 */
	private void attachContainerPages() {
		// Visit all pages of the container.
		container.visit(new AttachVisitor());

	}

	/**
	 * Visitor to visit all pages of the container and attach the page.
	 *
	 * @author dumoulin
	 *
	 */
	private class AttachVisitor implements IPageVisitor {

		@Override
		public void accept(IComponentPage page) {
		}

		@Override
		public void accept(IEditorPage page) {
			attachPage(page);

		}

	}

	/**
	 * Visitor to visit all pages of the container and attach the page.
	 *
	 * @author dumoulin
	 *
	 */
	private class DetachVisitor implements IPageVisitor {

		@Override
		public void accept(IComponentPage page) {
		}

		@Override
		public void accept(IEditorPage page) {
			detachPage(page);

		}

	}
}
