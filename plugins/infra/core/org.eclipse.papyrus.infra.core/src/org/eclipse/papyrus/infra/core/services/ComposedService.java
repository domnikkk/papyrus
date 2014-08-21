/*****************************************************************************
 * Copyright (c) 2011, 2014 LIFL and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  LIFL - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.services;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class to create a Service composed of other services called Parts.
 * ServiceParts register themselves to the ComposedService. The ComposedService
 * maintain a list of its part.
 *
 * @author cedric dumoulin
 *
 * @param T
 *            The type of sub-services that can register to this
 *            ComposedService.
 */
public abstract class ComposedService<T> implements IService {

	/**
	 * The list of serviceParts composing this Service.
	 */
	protected List<T> serviceParts = new ArrayList<T>();

	/**
	 * Constructor. Constructor.
	 *
	 */
	public ComposedService() {

	}

	/**
	 * Add the provided servicePart.
	 *
	 * @param servicePart
	 */
	public void addServicePart(T servicePart) {
		serviceParts.add(servicePart);
	}

	/**
	 * Remove the provided servicePart.
	 *
	 * @param servicePart
	 */
	public void removeServicePart(T servicePart) {
		serviceParts.remove(servicePart);
	}

	/**
	 * Do nothing here.
	 *
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
	}

	/**
	 * Do nothing here.
	 *
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void startService() throws ServiceException {
	}

	/**
	 * Do nothing here.
	 *
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void disposeService() throws ServiceException {
	}

	/**
	 * Get a list of registered sub service parts.
	 *
	 * @return List of registered services.
	 */
	public List<T> getRegisteredServices() {
		return serviceParts;
	}

}
