/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4te.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.tools.service;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener;

/**
 * Service to register Stereotype listener on Editing domain.
 * 
 * @author Gabriel Pascual
 *
 */
public class StereotypeElementService implements IService {

	/** The stereotype element listener. */
	private StereotypeElementListener stereotypeElementListener = null;

	/** The editing domain. */
	private TransactionalEditingDomain editingDomain = null;

	/**
	 * Constructor.
	 *
	 */
	public StereotypeElementService() {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {

		// Get editing domain from service registry
		editingDomain = ServiceUtils.getInstance().getTransactionalEditingDomain(servicesRegistry);

		// Build a stereotype listener with editing domain
		stereotypeElementListener = new StereotypeElementListener(editingDomain);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 *
	 * @throws ServiceException
	 */
	public void startService() throws ServiceException {
		editingDomain.addResourceSetListener(stereotypeElementListener);

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 *
	 * @throws ServiceException
	 */
	public void disposeService() throws ServiceException {
		editingDomain.removeResourceSetListener(stereotypeElementListener);
		stereotypeElementListener = null;

	}

}
