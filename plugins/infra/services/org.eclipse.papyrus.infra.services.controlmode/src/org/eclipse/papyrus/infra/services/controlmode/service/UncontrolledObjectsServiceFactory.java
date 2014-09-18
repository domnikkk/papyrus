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

import org.eclipse.papyrus.infra.core.services.IServiceFactory;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * Factory service to instantiate UncontrolledObjectsProvider.
 * 
 * @author Gabriel Pascual
 *
 */
public class UncontrolledObjectsServiceFactory implements IServiceFactory {

	/**
	 * Constructor.
	 *
	 */
	public UncontrolledObjectsServiceFactory() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {


	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 *
	 * @throws ServiceException
	 */
	public void startService() throws ServiceException {

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 *
	 * @throws ServiceException
	 */
	public void disposeService() throws ServiceException {

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IServiceFactory#createServiceInstance()
	 *
	 * @return
	 * @throws ServiceException
	 */
	public Object createServiceInstance() throws ServiceException {
		return new UncontrolledObjectsProvider();
	}

}
