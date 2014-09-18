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
package org.eclipse.papyrus.infra.services.controlmode.listener;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent;
import org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.infra.services.controlmode.ControlModePlugin;
import org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider;


/**
 * The listener interface for receiving uncontrolModeSave events.
 * The class that is interested in processing a uncontrolModeSave
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addUncontrolModeSaveListener<code> method. When
 * the uncontrolModeSave event occurs, that object's appropriate
 * method is invoked.
 *
 * @see UncontrolModeSaveEvent
 */
public class UncontrolModeSaveListener implements ISaveEventListener {

	/** The service. */
	private IUncontrolledObjectsProvider service = null;

	/**
	 * Constructor.
	 *
	 * @param serviceUncontrolledObject
	 *            the service uncontrolled object
	 */
	public UncontrolModeSaveListener(IUncontrolledObjectsProvider serviceUncontrolledObject) {
		service = serviceUncontrolledObject;
	}

	/**
	 * Do save as.
	 *
	 * @param event
	 *            the event
	 * @see org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener#doSaveAs(org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent)
	 */
	public void doSaveAs(DoSaveEvent event) {
		doSave(event);
	}

	/**
	 * Do save.
	 *
	 * @param event
	 *            the event
	 * @see org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener#doSave(org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent)
	 */
	public void doSave(DoSaveEvent event) {

		if (service.hasUncontrolledObjects()) {
			try {
				TransactionalEditingDomain editingDomain = ServiceUtils.getInstance().getTransactionalEditingDomain(event.getServiceRegistry());
				TransactionHelper.run(editingDomain, new UncontrolledObjectCommand(service));
			} catch (ServiceException e) {
				ControlModePlugin.log.error(e);
			} catch (InterruptedException e) {
				ControlModePlugin.log.error(e);
			} catch (RollbackException e) {
				ControlModePlugin.log.error(e);
			} finally {
				service.clear();
			}
		}
	}

	/**
	 * The Class UncontrolledCommand.
	 */
	public class UncontrolledObjectCommand implements Runnable {

		/** The uncontrolled e object map. */
		private IUncontrolledObjectsProvider uncontrolledEObjectService;

		/**
		 * Constructor.
		 *
		 * @param service
		 *            the uncontrolled elements map
		 */
		public UncontrolledObjectCommand(IUncontrolledObjectsProvider service) {
			uncontrolledEObjectService = service;
		}


		/**
		 * Run.
		 *
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
			Iterator<Resource> resourcesIterator = uncontrolledEObjectService.getResources();
			while (resourcesIterator.hasNext()) {
				Resource resource = resourcesIterator.next();
				List<EObject> resourceUncontrolledObject = uncontrolledEObjectService.getResourceUncontrolledObject(resource);
				resource.getContents().removeAll(resourceUncontrolledObject);

			}

		}
	}
}
