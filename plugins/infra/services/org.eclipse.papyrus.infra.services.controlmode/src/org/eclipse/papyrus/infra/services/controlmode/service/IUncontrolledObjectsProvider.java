/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.service;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.services.IService;

/**
 * Interface for Uncontrolled Objects provider service.
 *
 * @author Gabriel Pascual
 */
public interface IUncontrolledObjectsProvider extends IService {

	/**
	 * Adds the uncontrolled object.
	 *
	 * @param resource
	 *            the resource
	 * @param uncontroledObject
	 *            the uncontroled object
	 */
	void addUncontrolledObject(Resource resource, EObject uncontroledObject);

	/**
	 * Clear.
	 */
	void clear();

	/**
	 * Gets the resources.
	 *
	 * @return the resources
	 */
	Iterator<Resource> getResources();

	/**
	 * Gets the resource uncontrolled object.
	 *
	 * @param resource
	 *            the resource
	 * @return the resource uncontrolled object
	 */
	List<EObject> getResourceUncontrolledObject(Resource resource);

	/**
	 * Checks for uncontrolled objects.
	 *
	 * @return true, if successful
	 */
	boolean hasUncontrolledObjects();

}
