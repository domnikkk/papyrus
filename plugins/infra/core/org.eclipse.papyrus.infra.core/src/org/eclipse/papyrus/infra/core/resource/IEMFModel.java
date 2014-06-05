/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * A IModel which handles EMF Resources
 *
 * @author Camille Letavernier
 *
 */
public interface IEMFModel extends IModel {

	/**
	 * Returns the main resource associated to this model
	 *
	 * @return
	 */
	public Resource getResource();

	/**
	 * Called when a resource is loaded. Implement this method to configure
	 * the resource or load related resources
	 *
	 * @param resource
	 */
	public void handle(Resource resource);

	/**
	 * Returns true if the resource is a controlled resource
	 *
	 * @param resource
	 * @return
	 */
	public boolean isControlled(Resource resource);

}
