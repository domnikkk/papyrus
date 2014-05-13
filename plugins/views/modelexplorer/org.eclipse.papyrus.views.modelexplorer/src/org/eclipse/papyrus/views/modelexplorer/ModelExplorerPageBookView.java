/*****************************************************************************
 * Copyright (c) 2010, 2014 LIFL, CEA LIST, and others.
 *
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin (LIFL) cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Ansgar Radermacher (CEA) ansgar.radermacher@cea.fr - Added support for IGotoMarker
 *  Christian W. Damus (CEA) - bug 434635
 *
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.MultiViewPageBookView;
import org.eclipse.papyrus.views.modelexplorer.sorting.DefaultTreeViewerSorting;
import org.eclipse.papyrus.views.modelexplorer.sorting.ITreeViewerSorting;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.google.common.collect.Lists;


/**
 * A Page Book containing one {@link ModelExplorerView} for each opened Papyrus Editor.
 * 
 * @author cedric dumoulin
 * 
 */
public class ModelExplorerPageBookView extends MultiViewPageBookView implements IGotoMarker, ITabbedPropertySheetPageContributor {

	/** ID of the view, as given in the plugin.xml file */
	public static final String VIEW_ID = "org.eclipse.papyrus.views.modelexplorer.modelexplorer"; //$NON-NLS-1$

	private final SharedModelExplorerState state = new SharedModelExplorerState();

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);

		state.load(memento);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected PageRec doCreatePage(IWorkbenchPart part) {

		// part is of type IMultiDiagramEditor (because of isImportant() )

		ModelExplorerPage page = new ModelExplorerPage();
		page.setSharedState(state);

		// Init the page, and so the View
		initPage(page, part);
		page.createControl(getPageBook());
		return new PageRec(part, page);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {

		if(IPropertySheetPage.class == adapter) {
			// Do not test if tabbedPropertySheetPage is null before calling new
			// this is managed by Eclipse which only call current method when necessary
			return new TabbedPropertySheetPage(this);
		}

		if(adapter == ITreeViewerSorting.class) {
			return new DefaultTreeViewerSorting() {

				@Override
				public void setSorted(boolean sorted) {
					// Update the shared state
					if(state != null) {
						state.setAlphaSorted(sorted);
					}
				}

				@Override
				public boolean isSorted() {
					return state != null && state.isAlphaSorted();
				}
			};
		}

		return super.getAdapter(adapter);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getContributorId() {
		// return Activator.PLUGIN_ID;
		return "TreeOutlinePage"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	public void gotoMarker(IMarker marker) {
		String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
		if(uriAttribute != null) {
			URI uri = URI.createURI(uriAttribute);
			IViewPart viewPart = getActiveView();
			if(viewPart instanceof ModelExplorerView) {
				ModelExplorerView modelExplorerView = (ModelExplorerView)viewPart;
				EditingDomain domain = modelExplorerView.getEditingDomain();
				EObject eObject = domain.getResourceSet().getEObject(uri, false);
				if(eObject != null) {
					CommonViewer treeViewer = ((ModelExplorerView)viewPart).getCommonViewer();
					// The common viewer is in fact a tree viewer
					// bug enhancement: use function in ModelExplorerView instead of findElementForEObject
					ModelExplorerView.reveal(Lists.newArrayList(eObject), treeViewer);
				}
			}
		}
	}

	@Override
	public void saveState(IMemento memento) {
		state.save(memento);

		super.saveState(memento);
	}
}
