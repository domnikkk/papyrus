/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.model;

import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.listenerservice.ModelListenerManager;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.IModelSnippet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ResourceAdapter;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.tools.model.UmlModel;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/**
 * A model snippet that ensures propagation of the {@link UmlModel}'s {@link ModelListenerManager} to all
 * loaded profile-application resources.
 */
public class UMLSnippet implements IModelSnippet {
	private DecoratorModel model;
	private Adapter resourceAdapter;
	private ModelListenerManager modelListenerManager;

	public UMLSnippet() {
		super();
	}

	@Override
	public void start(IModel startingModel) {
		model = (DecoratorModel) startingModel;

		ModelSet modelSet = model.getModelManager();
		UmlModel uml = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		if (uml != null) {
			modelListenerManager = getModelListenerManager(uml);
			if (modelListenerManager != null) {
				modelSet.eAdapters().add(getResourceAdapter());
			}
		}
	}

	@Override
	public void dispose(IModel stoppingModel) {
		if (stoppingModel == model) {
			if (modelListenerManager != null) {
				ModelSet modelSet = ((DecoratorModel) stoppingModel).getModelManager();
				modelSet.eAdapters().remove(getResourceAdapter());
			}

			resourceAdapter = null;
			modelListenerManager = null;
			model = null;
		}
	}

	private ModelListenerManager getModelListenerManager(UmlModel uml) {
		ModelListenerManager result = null;

		Resource resource = uml.getResource();
		if (resource != null) {
			result = Iterables.getFirst(Iterables.filter(resource.eAdapters(), ModelListenerManager.class), null);
		}

		return result;
	}

	private Adapter getResourceAdapter() {
		if (resourceAdapter == null) {
			resourceAdapter = new ResourceAdapter() {
				private Set<Resource> managedResources = Sets.newHashSet();

				@Override
				protected void handleResourceAdded(Resource resource) {
					if (model.isDecoratorModelResource(resource) || DecoratorModelUtils.isDecoratorModel(resource.getURI())) {
						managedResources.add(resource);
						resource.eAdapters().add(modelListenerManager);
					}
				}

				@Override
				protected void handleResourceRemoved(Resource resource) {
					if (managedResources.remove(resource)) {
						resource.eAdapters().remove(modelListenerManager);
					}
				}

				@Override
				public void unsetTarget(Notifier oldTarget) {
					super.unsetTarget(oldTarget);

					if (managedResources.remove(oldTarget)) {
						// unmanage the resource
						oldTarget.eAdapters().remove(modelListenerManager);
					}
				}
			};
		}

		return resourceAdapter;
	}
}
