/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.ui.handler;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForIEvaluationContext;
import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.services.ProfileCatalogService;

/**
 * Base class for handlers wishing to deal with ProfileCatalog.
 * This class provides miscellaneous methods to get the {@link ProfileCatalog} and {@link ProfileCatalogService}.
 * 
 * @author cedric dumoulin
 *
 */
public abstract class AbstractProfileBaseHandler extends AbstractBaseHandler {

	/**
	 * Lookup the {@link ProfileCatalogService} service.
	 * 
	 * @param context
	 * @return
	 * @throws ServiceException
	 */
	public ProfileCatalogService getProfileCatalogService(IEvaluationContext context) throws ServiceException {
		
	    ServicesRegistry servicesRegistry = ServiceUtilsForIEvaluationContext.getInstance().getServiceRegistry(context);
		return servicesRegistry.getService(ProfileCatalogService.class);
	}
	
	/**
	 * Lookup the {@link ProfileCatalog}.
	 * 
	 * @return
	 * @throws ServiceException If the Editing domain can't be found.
	 */
	protected ProfileCatalog getProfileCatalog(IEvaluationContext context) throws ServiceException {

		ProfileCatalogService service = getProfileCatalogService(context);
		return service.getProfileCatalog();
	}

}
