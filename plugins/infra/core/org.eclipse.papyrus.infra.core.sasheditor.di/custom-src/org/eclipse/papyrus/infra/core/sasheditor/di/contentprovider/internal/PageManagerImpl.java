/*****************************************************************************
 * Copyright (c) 2013, 2014 Cedric Dumoulin, CEA, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 433371
 *  Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 415638
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 440754
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service.ILocalPageService;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.Activator;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.IOpenable;
import org.eclipse.papyrus.infra.core.sashwindows.di.DiFactory;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashModel;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashWindowsMngr;
import org.eclipse.papyrus.infra.core.sashwindows.di.TabFolder;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.FrameworkUtil;


/**
 * This class provide high level method to manage the Sash pages through its DI
 * implementation.
 *
 * @author cedric dumoulin
 *
 */
public class PageManagerImpl extends PageMngrImpl implements IPageManager {

	/**
	 * Constructor.
	 * Use a default {@link ICurrentFolderAndPageMngr} that alwayrs use the first
	 * folder as the current folder. Futhermore, the default implementation doesn't
	 * allow to set the active folder. <br>
	 * Suitable for tests
	 *
	 * @param diSashModel
	 *            The model onto which operation of this class act.
	 * @param contentChangedEventProvider
	 *            A class listening on changes on the internal model and delivering events to registered listeners. This implementation
	 *            need the class in order to deactivate event triggering during the operations.
	 *
	 */
	protected PageManagerImpl(SashWindowsMngr diSashModel, ContentChangedEventProvider contentChangedEventProvider) {
		super(diSashModel, contentChangedEventProvider);
	}

	/**
	 * Constructor.
	 *
	 * @param diSashModel
	 *            the di sash model
	 * @param contentChangedEventProvider
	 *            the content changed event provider
	 * @param folderAndPageMngr
	 *            the folder and page mngr
	 */
	protected PageManagerImpl(SashWindowsMngr diSashModel, ContentChangedEventProvider contentChangedEventProvider, ICurrentFolderAndPageMngr folderAndPageMngr) {
		super(diSashModel, contentChangedEventProvider, folderAndPageMngr);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager#closeAllOpenedPages(java.lang.Object)
	 *
	 * @param pageIdentifier
	 */
	@Override
	public void closeAllOpenedPages(Object pageIdentifier) {
		while (isOpen(pageIdentifier)) {
			closePage(pageIdentifier);
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageMngrImpl#addPage(java.lang.Object)
	 *
	 * @param pageIdentifier
	 */
	@Override
	public void addPage(Object pageIdentifier) {
		// Nothing
	}

	/**
	 * Reload the Diagram
	 * This used when a resource is reloaded, the related diagrams are reloaded as well
	 * 
	 * @see org.eclipse.papyrus.infra.services.controlmode.listener.LoadResourceSnippet
	 * 
	 * @param diagramProxy
	 *            Identifier of the page to reload
	 */
	@Override
	public void reloadPage(Object diagramProxy) {

		if (diagramProxy instanceof EObject) {

			PageRef proxyRef = diSashModel.getSashModel().lookupPage(diagramProxy);

			if (proxyRef.eContainer() instanceof TabFolder) {
				TabFolder folder = (TabFolder) proxyRef.eContainer();


				if (folder != null) {
					if (folder.getChildren() != null) {
						// get the initial index of the Diagram Tab
						int i = folder.getChildren().indexOf(proxyRef);

						if (i >= 0) {
							// Create a new Page
							PageRef newRef = DiFactory.eINSTANCE.createPageRef();
							newRef.setEmfPageIdentifier((EObject) diagramProxy);
							// Replace the previous by the new one
							folder.getChildren().set(i, newRef);
						}
					}
				}
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageMngrImpl#allPages()
	 *
	 * @return
	 */
	@Override
	public List<Object> allPages() {
		// FIXME: Temporary, naive code. Need to implement a mechanism to contribute page providers
		List<Object> result = new LinkedList<Object>();
		List<Resource> notationResources = getResources("notation");
		for (Resource notationResource : notationResources) {
			for (EObject content : notationResource.getContents()) {
				if (isPage(content)) {
					result.add(content);
				}
			}
		}


		return result;
	}

	/**
	 * Gets the local pages.
	 *
	 * @param model
	 *            the model
	 * @return the local pages
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager#allLocalPages()
	 */
	@Override
	public List<Object> allLocalPages(ILocalPageService service) {
		List<Object> result = new LinkedList<Object>();

		List<Resource> notationResources = getResources("notation");
		for (Resource notationResource : notationResources) {
			for (EObject content : notationResource.getContents()) {
				if (isPage(content)) {

					if (service.isLocalPage(content)) {
						result.add(content);
					}
				}
			}
		}

		return result;
	}


	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager#getAssociatedPages(org.eclipse.emf.common.util.URI)
	 *
	 * @param uriTrim
	 * @return
	 */
	public List<Object> getAssociatedPages(Object uriTrim) {

		List<Object> list = new ArrayList<Object>();

		SashModel sashModel = diSashModel.getSashModel();
		Iterator<?> iter = sashModel.eAllContents();

		while (iter.hasNext()) {
			Object next = iter.next();
			if (next instanceof PageRef) {
				PageRef pageRef = (PageRef) next;

				// pageRef is one of the pages referred into the sash resource
				if (pageRef != null) {
					EObject pageID = pageRef.getEmfPageIdentifier();
					if (pageID != null) {
						URI uriContainer;
						if (pageID.eIsProxy()) {
							InternalEObject internal = (InternalEObject) pageID;
							uriContainer = internal.eProxyURI().trimFragment().trimFileExtension();

						} else {
							uriContainer = pageID.eResource().getURI().trimFileExtension();
						}
						if (uriTrim instanceof URI) {
							if (uriContainer.equals((URI) uriTrim)) {
								list.add(pageID);
							}
						}
					}
				}

			}

		}
		return list;
	}

	/**
	 * Gets the resources.
	 *
	 * @param fileExtension
	 *            the file extension
	 * @return the resources
	 */
	private List<Resource> getResources(String fileExtension) {
		List<Resource> resourcesList = new LinkedList<Resource>();

		// Get resource set from Di Sash model
		ResourceSet resourceSet = diSashModel.eResource().getResourceSet();

		for (Resource resource : resourceSet.getResources()) {

			// Verify if the resource exist and is loaded
			if (resource != null && resource.isLoaded()) {
				// Verify if its extension correspond
				if (fileExtension.equals(resource.getURI().fileExtension())) {
					resourcesList.add(resource);
				}

			}
		}

		return resourcesList;
	}

	/**
	 * Checks if is page.
	 *
	 * @param content
	 *            the content
	 * @return true, if is page
	 */
	private boolean isPage(EObject content) {
		return Platform.getAdapterManager().getAdapter(content, IOpenable.class) != null;
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageMngrImpl#openPage(java.lang.Object)
	 *
	 * @param pageIdentifier
	 */
	@Override
	public void openPage(Object pageIdentifier) {
		diSashModel.getSashModel().addPage(getCurrentFolder(), pageIdentifier);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager#selectPage(java.lang.Object)
	 *
	 * @param pageIdentifier
	 */
	@Override
	public void selectPage(final Object pageIdentifier) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				folderAndPageMngr.setActivePage(pageIdentifier);
			}
		});
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageMngrImpl#removePage(java.lang.Object)
	 *
	 * @param pageIdentifier
	 */
	@Override
	public void removePage(Object pageIdentifier) {
		closeAllOpenedPages(pageIdentifier);
	}

	/**
	 * Sets the current folder and page mngr.
	 *
	 * @param currentFolderAndPageMngr
	 *            the new current folder and page mngr
	 */
	public void setCurrentFolderAndPageMngr(ICurrentFolderAndPageMngr currentFolderAndPageMngr) {
		this.folderAndPageMngr = currentFolderAndPageMngr;

	}

	/**
	 * Executes an operation on my internal sash model.
	 *
	 * @param <T>
	 *            the generic type
	 * @param sashModelOperation
	 *            the operation to execute
	 * @return the operation's result
	 * @throws IllegalAccessException
	 *             on attempt to execute an operation defined by a client bundle
	 */
	public <T> T execute(SashModelOperation<T> sashModelOperation) throws IllegalAccessException {
		T result;

		if (FrameworkUtil.getBundle(sashModelOperation.getClass()) != Activator.getDefault().getBundle()) {
			throw new IllegalAccessException("Attempt to access bundle-private API."); //$NON-NLS-1$
		}

		ContentChangedEventProvider eventProvider = getContentChangedEventProvider();
		final boolean deliver = eventProvider.isDeliver();

		eventProvider.setDeliver(false);
		try {
			result = sashModelOperation.execute(diSashModel);
		} finally {
			eventProvider.setDeliver(deliver);
		}

		return result;
	}

	//
	// Private interfaces
	//

	/**
	 * An operation on the internal sash model of a page manager.
	 *
	 * @param <T>
	 *            the generic type
	 */
	public static interface SashModelOperation<T> {

		/**
		 * Execute.
		 *
		 * @param sashWindowsManager
		 *            the sash windows manager
		 * @return the t
		 */
		T execute(SashWindowsMngr sashWindowsManager);
	}

}