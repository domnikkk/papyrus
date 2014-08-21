/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 *
 * This class provides methods for EMF Resource
 *
 */
public class ResourceUtils {

	private ResourceUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param resource
	 *            an EMF resource
	 * @return
	 *         the IFile corresponding to this resource, or <code>null</code> if not found
	 */
	public static IFile getFile(final Resource resource) {
		if (resource != null) {
			URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			if (uri.isPlatformResource()) {
				String uriPlatformString = uri.toPlatformString(true);
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uriPlatformString));
			}
		}
		return null;
	}

	/**
	 *
	 *
	 * @param resource
	 *            a resource
	 * @return
	 *         a collection with all existing id in the resource
	 *
	 */
	public static Collection<String> getAllResourceIds(final XMIResource resource) {
		final Set<String> ids = new HashSet<String>();
		final Iterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			final EObject current = iterator.next();
			final String id = resource.getID(current);
			Assert.isNotNull(id);
			Assert.isTrue(!ids.contains(id));
			ids.add(id);
		}
		return ids;
	}


	/**
	 * Default options to save emf files used in Papyrus
	 * 
	 * @return
	 */
	public static Map<String, Object> getSaveOptions() {
		Map<String, Object> saveOptions = new HashMap<String, Object>();

		// default save options.
		saveOptions.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");

		// see bug 397987: [Core][Save] The referenced plugin models are saved using relative path
		saveOptions.put(XMLResource.OPTION_URI_HANDLER, new org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl.PlatformSchemeAware());

		return saveOptions;
	}

}
