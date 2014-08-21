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
 * A factory creating a Service that can be registered in the {@link ServicesRegistry}.
 *
 * A service is a singleton available throw the registry. A service can be
 * shared across editors. The service lifecycle events (init, start and dispose)
 * are sent to the factory. The factory is responsible to forward them to the
 * real service.
 *
 * @author dumoulin
 *
 */
public interface IServiceFactory extends IService {

	/**
	 * Create the instance of the service that will be returned by {@link ServicesRegistry#getService(Class)}.
	 *
	 * @return The instance of the service.
	 * @throws ServiceException
	 *             If an error occurs during the operation.
	 */
	public Object createServiceInstance() throws ServiceException;

}
