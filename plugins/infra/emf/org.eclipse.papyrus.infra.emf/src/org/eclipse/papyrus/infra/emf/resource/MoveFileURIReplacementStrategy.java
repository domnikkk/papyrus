/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/


package org.eclipse.papyrus.infra.emf.resource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.papyrus.infra.core.resource.ModelSet;


/**
 * The Class MoveFileURIReplacementStrategy.
 */
public class MoveFileURIReplacementStrategy implements IURIReplacementStrategy {


	/** The replacement uri mapping. */
	protected Map<URI, URI> replacementURIMapping;

	/** The source path. */
	protected IPath sourcePath;

	/** The target path. */
	protected IPath targetPath;

	/**
	 * Instantiates a new move file uri replacement strategy.
	 *
	 * @param replacementURIMapping
	 *            the replacement uri mapping
	 * @param sourcePath
	 *            the source path
	 * @param targetPath
	 *            the target path
	 */
	public MoveFileURIReplacementStrategy(Map<URI, URI> replacementURIMapping, IPath sourcePath, IPath targetPath) {
		this.replacementURIMapping = replacementURIMapping;
		this.sourcePath = sourcePath;
		this.targetPath = targetPath;
	}

	/**
	 * Instantiates a new move file uri replacement strategy.
	 *
	 * @param sourcePath
	 *            the source path
	 * @param targetPath
	 *            the target path
	 */
	public MoveFileURIReplacementStrategy(IPath sourcePath, IPath targetPath) {
		this(new HashMap<URI, URI>(), sourcePath, targetPath);
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.emf.resource.IURIReplacementStrategy#getReplacementCandidate(org.eclipse.emf.common.util.URI)
	 */
	public URI getReplacementCandidate(URI resourceURI) {
		if (replacementURIMapping.containsKey(resourceURI)) {
			return replacementURIMapping.get(resourceURI);
		}
		URI calculateUri = calculateNewUri(resourceURI);
		replacementURIMapping.put(resourceURI, calculateUri);
		return calculateUri;
	}


	/**
	 * Calculate uri.
	 *
	 * @param resourceURI
	 *            the resource uri
	 * @return the uri
	 */
	protected URI calculateNewUri(URI resourceURI) {
		ModelSet modelSet = new ModelSet();
		URIConverter uriConverter = modelSet.getURIConverter();
		boolean exists = uriConverter.exists(resourceURI, Collections.EMPTY_MAP);
		if (!exists) {
			URI choseCorrectPath = trySourcePath(sourcePath, targetPath, resourceURI);
			if (choseCorrectPath != null) {
				return choseCorrectPath;
			}
		}
		return resourceURI;
	}




	/**
	 * If the resource is not found in the target location then look in the source location
	 *
	 * @param sourcePath
	 *            the source path
	 * @param targetPath
	 *            the target path
	 * @param resourceURI
	 *            the resource uri
	 * @return the uri
	 */
	protected URI trySourcePath(IPath sourcePath, IPath targetPath, URI resourceURI) {
		String uriPlatformString = resourceURI.toPlatformString(true);
		if (uriPlatformString != null) {
			Path path = new Path(uriPlatformString);
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IFile file = root.getFile(path);
			if (!file.exists()) {// test file non existence from the target
				// calculate a new path from source path
				URI sourceURI = URI.createPlatformResourceURI(sourcePath.toString() + IPath.SEPARATOR, true);
				URI targetURI = URI.createPlatformResourceURI(targetPath.toString() + IPath.SEPARATOR, true);
				URI resourceDeresolved = resourceURI.deresolve(targetURI);
				URI resourceResolved = resourceDeresolved.resolve(sourceURI);
				return resourceResolved;
			}
		}
		return null;
	}

}
