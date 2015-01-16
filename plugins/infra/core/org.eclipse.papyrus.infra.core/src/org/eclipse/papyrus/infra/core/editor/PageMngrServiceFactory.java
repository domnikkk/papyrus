/*****************************************************************************
 * Copyright (c) 2011, 2014 LIFL, Christian W. Damus, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  LIFL - Initial API and implementation
 *  Christian W. Damus - bug 415638
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.editor;

import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageMngr;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.ISashWindowsContentProvider;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.DiSashModelManager;
import org.eclipse.papyrus.infra.core.services.IServiceFactory;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServiceNotFoundException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * A service factory to create the {@link IPageMngr} service. This
 * serviceFactory depends on {@link ISashWindowsContentProvider} service.
 *
 * @author cedric dumoulin
 *
 */
public class PageMngrServiceFactory implements IServiceFactory {

	/**
	 * The sashModelMangr.
	 */
	private DiSashModelManager sashModelMngr;

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {

		// Get required services
		sashModelMngr = servicesRegistry.getService(DiSashModelManager.class);
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void startService() throws ServiceException {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void disposeService() throws ServiceException {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IServiceFactory#createServiceInstance()
	 *
	 * @return
	 * @throws ServiceException
	 *             if the required sash model manager service is unavailable
	 */
	@Override
	public Object createServiceInstance() throws ServiceException {
		if (sashModelMngr == null) {
			throw new ServiceNotFoundException(DiSashModelManager.class.getName());
		}
		return sashModelMngr.getIPageMngr();
	}

}
