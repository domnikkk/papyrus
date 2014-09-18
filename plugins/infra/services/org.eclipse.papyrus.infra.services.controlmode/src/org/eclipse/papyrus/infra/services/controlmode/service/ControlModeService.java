/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.service;

import org.eclipse.papyrus.infra.core.lifecycleevents.ILifeCycleEventsProvider;
import org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.services.controlmode.listener.UncontrolModeSaveListener;

/**
 * Service to registry SaveListener for Uncontrol.
 *
 * @author Gabriel Pascual
 */
public class ControlModeService implements IService {

	/** The life cycle events provider. */
	private ILifeCycleEventsProvider lifeCycleEventsProvider = null;

	/** The save listener. */
	private ISaveEventListener saveListener = null;

	/** The uncontrolled objects provider. */
	private IUncontrolledObjectsProvider uncontrolledObjectsProvider = null;

	/**
	 * Constructor.
	 *
	 */
	public ControlModeService() {
		super();
	}

	/**
	 * Inits the service.
	 *
	 * @param servicesRegistry
	 *            the services registry
	 * @throws ServiceException
	 *             the service exception
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 */
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {

		lifeCycleEventsProvider = ServiceUtils.getInstance().getILifeCycleEventsProvider(servicesRegistry);
		uncontrolledObjectsProvider = ServiceUtils.getInstance().getService(IUncontrolledObjectsProvider.class, servicesRegistry);


	}

	/**
	 * Start service.
	 *
	 * @throws ServiceException
	 *             the service exception
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 */
	public void startService() throws ServiceException {

		saveListener = new UncontrolModeSaveListener(uncontrolledObjectsProvider);
		lifeCycleEventsProvider.addDoSaveListener(saveListener);

	}

	/**
	 * Dispose service.
	 *
	 * @throws ServiceException
	 *             the service exception
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 */
	public void disposeService() throws ServiceException {
		lifeCycleEventsProvider.removeDoSaveListener(saveListener);
		saveListener = null;
		lifeCycleEventsProvider = null;
		uncontrolledObjectsProvider = null;

	}



}
