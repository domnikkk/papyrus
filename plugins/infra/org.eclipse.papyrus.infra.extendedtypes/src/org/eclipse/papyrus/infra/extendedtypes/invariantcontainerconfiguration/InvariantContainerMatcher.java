/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.extendedtypes.invariantcontainerconfiguration;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.extendedtypes.Activator;
import org.eclipse.papyrus.infra.extendedtypes.invariantsemantictypeconfiguration.IInvariantElementMatcher;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;

/**
 * Matcher of the hierarchy matcher
 */
public class InvariantContainerMatcher implements IInvariantElementMatcher<InvariantContainerConfiguration> {

	protected List<HierarchyPermission> permissions;
	
	protected IClientContext sharedContext;

	/**
	 *
	 */
	public InvariantContainerMatcher() {
		// nothing here. Trying not to create list to avoid unnecessary created objects
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean matches(EObject eObject) {
		boolean matches = false;

		EObject container = eObject.eContainer();

		if (container == null) {
			return false;
		}
		// retrieve element type
		IElementType[] containerTypes = ElementTypeRegistry.getInstance().getAllTypesMatching(container, sharedContext);
		if(containerTypes != null && containerTypes.length >0) {
			return InvariantContainerUtils.isContainerValid(containerTypes, matches, permissions);
		}
		return false;
	}


	/**
	 * {@inheritDoc}
	 */
	public void init(InvariantContainerConfiguration configuration) {
		try {
			sharedContext = TypeContext.getContext();
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
		this.permissions = configuration.getPermissions();
	}
}
