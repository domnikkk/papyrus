/*****************************************************************************
 * Copyright (c) 2011 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.readonly;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.modelexplorer.ModelExplorerView;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ReadOnlyManager {

	protected static final IReadOnlyHandler[] orderedHandlersArray;

	protected static class HandlerPriorityPair implements Comparable<HandlerPriorityPair> {

		public IReadOnlyHandler handler;

		public int priority;

		public int compareTo(HandlerPriorityPair o) {
			if(o.priority > priority) {
				return 1;
			} else if(o.priority < priority) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	static {
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.papyrus.readonly", "readOnlyHandler");

		List<HandlerPriorityPair> handlerPriorityPairs = new LinkedList<HandlerPriorityPair>();
		for(IConfigurationElement elem : configElements) {
			if("readOnlyHandler".equals(elem.getName())) {
				try {
					HandlerPriorityPair handlerPriorityPair = new HandlerPriorityPair();
					handlerPriorityPair.handler = (IReadOnlyHandler)elem.createExecutableExtension("class");
					handlerPriorityPair.priority = Integer.parseInt(elem.getAttribute("priority"));

					handlerPriorityPairs.add(handlerPriorityPair);
				} catch (Exception e) {
				}
			}
		}

		Collections.sort(handlerPriorityPairs);

		orderedHandlersArray = new IReadOnlyHandler[handlerPriorityPairs.size()];

		for(int i = 0; i < orderedHandlersArray.length; i++) {
			orderedHandlersArray[i] = handlerPriorityPairs.get(i).handler;
		}
	}

	public static boolean isReadOnly(Resource resource, EditingDomain editingDomain) {
		URI uri = null;
		if(resource != null && resource.getURI() != null) {

			uri = resource.getURI();
		}

		return isReadOnly(uri, editingDomain);
	}

	private static URI getURI(IFile iFile) {
		return URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
	}

	private static URI[] getURIs(IFile[] iFiles) {
		URI[] uris = new URI[iFiles.length];
		int i = 0;
		for(IFile iFile : iFiles) {
			uris[i++] = getURI(iFile);
		}
		return uris;
	}

	public static boolean isReadOnly(URI uri, EditingDomain editingDomain) {
		URI[] uris = uri != null ? new URI[]{ uri } : new URI[]{};
		return isReadOnly(uris, editingDomain);
	}

	public static boolean isReadOnly(URI[] uris, EditingDomain editingDomain) {
		for(int i = 0; i < orderedHandlersArray.length; i++) {
			if(orderedHandlersArray[i].isReadOnly(uris, editingDomain)) {
				return true;
			}
		}
		return false;
	}

	public static boolean enableWrite(URI[] uris, EditingDomain editingDomain) {
		for(int i = 0; i < orderedHandlersArray.length; i++) {
			if(orderedHandlersArray[i].isReadOnly(uris, editingDomain)) {
				boolean ok = orderedHandlersArray[i].enableWrite(uris, editingDomain);
				if(!ok) {
					return false;
				}
			}
		}

		// retrieve model explorer view to update the tree with
		// updated read only informations (greyed entries are read only ones)
		// there is no notification for this kind of event so this needs to be done manually here
		ModelExplorerView view = ModelExplorerView.getCurrent();
		if (view != null) {
			if (editingDomain == null) {
				editingDomain = view.getEditingDomain();
			}

			for (URI uri : uris) {
				Resource r = editingDomain.getResourceSet().getResource(uri, false);
				if (r != null) {
					for (EObject o : r.getContents()) {
						view.refreshObject(o);
					}
				}
			}
		}

		return true;
	}

	public static boolean isReadOnly(IFile[] iFiles, EditingDomain editingDomain) {
		return isReadOnly(getURIs(iFiles), editingDomain);
	}

	public static boolean enableWrite(IFile[] iFiles, EditingDomain editingDomain) {
		return enableWrite(getURIs(iFiles), editingDomain);
	}
}
