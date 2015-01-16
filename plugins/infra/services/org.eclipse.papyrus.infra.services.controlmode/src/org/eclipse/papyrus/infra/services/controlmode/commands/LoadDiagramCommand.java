/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.commands;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;


/**
 * Command to load the diagram related to a resource URI
 * 
 * @author Céline JANSSENS
 *
 */
public class LoadDiagramCommand implements Runnable {

	private IPageManager pageManager;

	/**
	 * URI of the resource which the diagram is based on.
	 */
	private URI uri;


	/**
	 * Constructor.
	 *
	 */
	public LoadDiagramCommand() {
		super();
	}


	/**
	 * 
	 * Constructor.
	 *
	 * @param pageManager
	 * @param uriOfDiagram
	 */
	public LoadDiagramCommand(Resource resource) {

		try {
			pageManager = ServiceUtilsForResource.getInstance().getIPageManager(resource);
		} catch (ServiceException e) {
			// nothing to do
		}

		this.uri = resource.getURI();

	}

	/**
	 * @see org.eclipse.emf.common.command.CompoundCommand#execute()
	 *
	 */
	public void run() {

		if (pageManager != null) {
			URI uriTrimResource = uri.trimFragment().trimFileExtension();
			// retrieve open pages related to this URI
			List<Object> pagesID = pageManager.getAssociatedPages(uriTrimResource);
			if (pagesID.size() > 0) {
				for (Object pageID : pagesID) {
					if (pageID != null) {
						pageManager.reloadPage(pageID);
					}
				}
			}
		}

	}
}
