/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net  - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * Default implementation of {@link IUncontrolledObjectsProvider} service.
 * 
 * @author Gabriel Pascual
 *
 */
public class UncontrolledObjectsProvider implements IUncontrolledObjectsProvider {

	/** The uncontrolled e object map. */
	private Map<Resource, List<EObject>> uncontrolledEObjectMap = new HashMap<Resource, List<EObject>>();

	/**
	 * Constructor.
	 *
	 */
	public UncontrolledObjectsProvider() {
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
		uncontrolledEObjectMap = null;

	}

	/**
	 * @see org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider#addUncontrolledObject(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.ecore.EObject)
	 *
	 * @param resource
	 * @param uncontroledObject
	 * @return
	 */
	public void addUncontrolledObject(Resource resource, EObject uncontroledObject) {
		List<EObject> uncontrolledObjectList = uncontrolledEObjectMap.get(resource);
		if (uncontrolledObjectList == null) {
			uncontrolledObjectList = new ArrayList<EObject>();
		}

		uncontrolledObjectList.add(uncontroledObject);
		uncontrolledEObjectMap.put(resource, uncontrolledObjectList);
	}

	/**
	 * @see org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider#clear()
	 *
	 */
	public void clear() {
		uncontrolledEObjectMap.clear();

	}

	/**
	 * @see org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider#getResources()
	 *
	 * @return
	 */
	public Iterator<Resource> getResources() {
		return uncontrolledEObjectMap.keySet().iterator();
	}

	/**
	 * @see org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider#getResourceUncontrolledObject(org.eclipse.emf.ecore.resource.Resource)
	 *
	 * @param resource
	 * @return
	 */
	public List<EObject> getResourceUncontrolledObject(Resource resource) {
		return uncontrolledEObjectMap.get(resource);

	}

	/**
	 * @see org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider#hasUncontrolledObjects()
	 *
	 * @return
	 */
	public boolean hasUncontrolledObjects() {
		return !uncontrolledEObjectMap.isEmpty();
	}
}
