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
import org.eclipse.papyrus.uml.profile.drafter.UserProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.DraftProfileException;
import org.eclipse.papyrus.uml.profile.drafter.services.ProfileCatalogService;
import org.eclipse.papyrus.uml.profile.drafter.utils.UMLMetamodelUtils;

/**
 * Base class for handlers wishing to deal with ProfileCatalog.
 * This class provides miscellaneous methods to get the {@link UserProfileCatalog} and {@link ProfileCatalogService}.
 * 
 * @author cedric dumoulin
 *
 */
public abstract class AbstractProfileBaseHandler extends AbstractBaseHandler {

	/**
	 * A class encapsulating the UML Metamodel.
	 * The class can be shared by code acting on the same UML model.
	 */
	protected UMLMetamodelUtils umlMetamodelUtils;
	
	/**
	 * Reset the values homd by the handler.
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#resetCachedValues()
	 *
	 */
	@Override
	protected void resetCachedValues() {
		umlMetamodelUtils = null;
		super.resetCachedValues();
	}
	
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
	 * Lookup the {@link UserProfileCatalog}.
	 * 
	 * @return
	 * @throws ServiceException If the Editing domain can't be found.
	 */
	protected UserProfileCatalog getProfileCatalog(IEvaluationContext context) throws ServiceException {

		ProfileCatalogService service = getProfileCatalogService(context);
		return service.getProfileCatalog();
	}

	/**
	 * Get the cached value for {@link UMLMetamodelUtils}. Call {@link #getUmlMetamodelUtils(IEvaluationContext)} to
	 * initialize the value.
	 * 
	 * @return the umlMetamodelUtils
	 * @throws DraftProfileException 
	 */
	public UMLMetamodelUtils getCachedUmlMetamodelUtils(IEvaluationContext context) throws DraftProfileException {
		if( umlMetamodelUtils == null) {
			umlMetamodelUtils = getUmlMetamodelUtils(context);
		}
		
		return umlMetamodelUtils;
	}

	/**
	 * @return the umlMetamodelUtils
	 * @throws DraftProfileException If the {@link UMLMetamodelUtils} object can't be created. A nested exception indicate the root cause.
	 * 
	 */
	public UMLMetamodelUtils getUmlMetamodelUtils(IEvaluationContext context) throws DraftProfileException {
		
		try {
			return new UMLMetamodelUtils(lookupServicesRegistry(context));
		} catch (ServiceException e) {
			throw new DraftProfileException("Can'create UMLMetamodelUtils object", e);
		}
	}

}
