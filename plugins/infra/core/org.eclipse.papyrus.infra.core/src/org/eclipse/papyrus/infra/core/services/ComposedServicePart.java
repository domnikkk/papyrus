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

/**
 * A service that register itself to its associated {@link ComposedService}.
 * 
 * @param T
 *        The main ComposedService
 * 
 * @author cedric dumoulin
 * @param T
 *        The type of the ComposedService to which this part will be
 *        registered.
 * 
 */
@SuppressWarnings("rawtypes")
public abstract class ComposedServicePart<T extends ComposedService> implements IService {

	/**
	 * 
	 */
	protected ServicesRegistry servicesRegistry;

	/**
	 * Class of the parent ComposedService
	 */
	private Class<T> composedServiceKey;

	/**
	 * ComposedService that will own this part.
	 */
	T parentService;

	public ComposedServicePart(Class<T> composedServiceKey) {
		this.composedServiceKey = composedServiceKey;
	}

	/**
	 * Initialize the service. Attach itself to the ComposedService
	 * 
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 * 
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	@SuppressWarnings("unchecked")
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.servicesRegistry = servicesRegistry;
		parentService = servicesRegistry.getService(composedServiceKey);
		parentService.addServicePart(this);
	}

	/**
	 * Start the service.
	 * 
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 * 
	 */
	public void startService() throws ServiceException {

	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void disposeService() {
		parentService.removeServicePart(this);
	}

}
