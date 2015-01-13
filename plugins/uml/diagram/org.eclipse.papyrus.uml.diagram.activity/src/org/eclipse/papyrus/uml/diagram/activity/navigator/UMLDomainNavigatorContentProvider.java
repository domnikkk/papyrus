/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class UMLDomainNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public UMLDomainNavigatorContentProvider() {
		myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		@SuppressWarnings("serial")
		Map<Resource, Boolean> map = new HashMap<Resource, Boolean>() {

			@Override
			public Boolean get(java.lang.Object key) {
				if (!containsKey(key)) {
					if (key instanceof Resource) {
						put((Resource) key, Boolean.TRUE);
					}
				}
				return super.get(key);
			}
		};
		myEditingDomain.setResourceToReadOnlyMap(map);
		myViewerRefreshRunnable = new Runnable() {

			@Override
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {

			@Override
			public void dispose() {
			}

			@Override
			public boolean handleResourceChanged(final Resource resource) {
				for (Iterator<Resource> it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = it.next();
					nextResource.unload();
				}
				if (myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}

			@Override
			public boolean handleResourceDeleted(Resource resource) {
				for (Iterator<Resource> it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = it.next();
					nextResource.unload();
				}
				if (myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}

			@Override
			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				for (Iterator<Resource> it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
					Resource nextResource = it.next();
					nextResource.unload();
				}
				if (myViewer != null) {
					myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
				}
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	@Override
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator<Resource> it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource resource = it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	@Override
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	@Override
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	@Override
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			return wrapEObjects(myAdapterFctoryContentProvier.getChildren(resource), parentElement);
		}
		if (parentElement instanceof UMLDomainNavigatorItem) {
			return wrapEObjects(myAdapterFctoryContentProvier.getChildren(((UMLDomainNavigatorItem) parentElement).getEObject()), parentElement);
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object[] wrapEObjects(Object[] objects, Object parentElement) {
		Collection<UMLDomainNavigatorItem> result = new ArrayList<UMLDomainNavigatorItem>();
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof EObject) {
				result.add(new UMLDomainNavigatorItem((EObject) objects[i], parentElement, myAdapterFctoryContentProvier));
			}
		}
		return result.toArray();
	}

	/**
	 * @generated
	 */
	@Override
	public Object getParent(Object element) {
		if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}
}
