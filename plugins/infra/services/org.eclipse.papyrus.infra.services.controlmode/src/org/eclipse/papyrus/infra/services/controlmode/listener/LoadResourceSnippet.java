/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.services.controlmode.listener;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.infra.core.resource.IModelSetSnippet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ResourceAdapter;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageManagerImpl;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.utils.TransactionHelper;
import org.eclipse.papyrus.infra.services.controlmode.commands.LoadDiagramCommand;


/**
 * This Snippet is used to attach Loading listener on the resourceSet.
 * 
 * @author Céline JANSSENS
 *
 */
public class LoadResourceSnippet implements IModelSetSnippet {

	private LoadResourceAdapter adapter;

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.IModelSnippet#start(org.eclipse.papyrus.infra.core.resource.IModel)
	 *
	 * @param startingModel
	 */
	public void start(ModelSet startingModel) {
		adapter = new LoadResourceAdapter();
		startingModel.eAdapters().add(adapter);

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.IModelSnippet#dispose(org.eclipse.papyrus.infra.core.resource.IModel)
	 *
	 * @param stoppingModel
	 */
	public void dispose(ModelSet stoppingModel) {
		stoppingModel.eAdapters().remove(adapter);
		adapter = null;
	}


	/**
	 * This Adapter allows to load associated pages of the resources.
	 * It uses {@link LoadingPagesHandler} to do so with the help of the {@link PageManagerImpl}.
	 * 
	 * @author Céline JANSSENS
	 *
	 */
	private class LoadResourceAdapter extends ResourceAdapter {

		/**
		 * @see org.eclipse.papyrus.infra.core.resource.ResourceAdapter#handleResourceLoaded(org.eclipse.emf.ecore.resource.Resource)
		 *
		 * @param resource
		 */
		@Override
		protected void handleResourceLoaded(Resource resource) {
			EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(resource);
			final LoadDiagramCommand loadCommand = new LoadDiagramCommand(resource);
			try {
				TransactionHelper.run(editingDomain, loadCommand);
			} catch (InterruptedException e) {
				// Nothing to do
			} catch (RollbackException e) {
				// Nothing to do
			}
		}
	}
}
