/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.services;

import java.io.IOException;

import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent;
import org.eclipse.papyrus.infra.core.lifecycleevents.ILifeCycleEventsProvider;
import org.eclipse.papyrus.infra.core.lifecycleevents.LifeCycleEventsProvider;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.SashModel;

/**
 * This service automatically saves the current SashModel before closing the Papyrus editor
 *
 * This is useful, as modifications to the SashModel do not dirty the editor
 *
 * The save action is not executed if the editor is dirty when it is closed (To ensure model consistency)
 *
 * Bug 430976: [SashEditor] Editor layout is not exactly the same when reopening the model
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=430976
 *
 * @author Camille Letavernier
 */
public class SaveLayoutBeforeClose implements IService {

	private ServicesRegistry registry;

	private EditorLifecycleManager lifecycleManager;

	private EditorLifecycleEventListener lifecycleListener;

	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.registry = servicesRegistry;
	}

	@Override
	public void startService() throws ServiceException {
		installSaveOnClose();
	}

	protected void installSaveOnClose() {
		try {
			lifecycleManager = registry.getService(EditorLifecycleManager.class);
			if(lifecycleManager == null) {
				return;
			}
		} catch (ServiceException ex) {
			return;
		}

		lifecycleListener = new EditorLifecycleEventListener() {

			@Override
			public void postInit(IMultiDiagramEditor editor) {
				//Nothing
			}

			@Override
			public void postDisplay(IMultiDiagramEditor editor) {
				//Nothing
			}

			@Override
			public void beforeClose(IMultiDiagramEditor editor) {
				saveBeforeClose(editor);
			}
		};

		lifecycleManager.addEditorLifecycleEventsListener(lifecycleListener);
	}

	protected void saveBeforeClose(IMultiDiagramEditor editor) {
		if(editor.isDirty()) {
			return; //User explicitly quit without saving. Do nothing (And if user wants to save during exit, the sashmodel will be saved anyway)
		}

		ModelSet modelSet; //Required
		LifeCycleEventsProvider internalLifecycleEventsProvider = null; //Optional

		try {
			modelSet = registry.getService(ModelSet.class);
		} catch (ServiceException ex) {
			return;
		}

		try {
			ILifeCycleEventsProvider eventsProvider = registry.getService(ILifeCycleEventsProvider.class);
			if(eventsProvider instanceof LifeCycleEventsProvider) {
				internalLifecycleEventsProvider = (LifeCycleEventsProvider)eventsProvider;
			}
		} catch (ServiceException ex) {
			//Ignore: the service is optional
		}

		SashModel sashModel = (SashModel)modelSet.getModel(SashModel.MODEL_ID);

		try {
			//We need to send pre- and post-save events, but we can only do that with the internal LifecycleEventsProvider
			//The ISaveAndDirtyService can only save the whole model, but we just want to save the sash
			DoSaveEvent event = new DoSaveEvent(registry, editor);
			internalLifecycleEventsProvider.fireAboutToDoSaveEvent(event);
			internalLifecycleEventsProvider.fireDoSaveEvent(event);
			sashModel.saveModel();
			internalLifecycleEventsProvider.firePostDoSaveEvent(event);
		} catch (IOException ex) {
			Activator.log.error(ex);
		}
	}

	@Override
	public void disposeService() throws ServiceException {
		registry = null;
		if(lifecycleManager != null) {
			lifecycleManager.removeEditorLifecycleEventsListener(lifecycleListener);
			lifecycleListener = null;
			lifecycleManager = null;
		}
	}

}
