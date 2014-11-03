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

package org.eclipse.papyrus.uml.decoratormodel.internal.commands;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.model.DecoratorModel;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A command that ensures existence of the decorator model resource into which profile applications will be put by the {@link SeparateProfileApplicationsCommand}. Undoing this command will remove the decorator model resource from
 * the resource set if it created it.
 */
public class CreateDecoratorModelCommand extends AbstractCommand {
	private final TransactionalEditingDomain domain;
	private final URI resourceURI;
	private final String modelName;

	private Resource createdResource;
	private Package createdDecoratorModel;

	public CreateDecoratorModelCommand(TransactionalEditingDomain domain, URI resourceURI, String modelName) {
		super(Messages.CreateDecoratorModelCommand_0);

		this.domain = domain;
		this.resourceURI = resourceURI;
		this.modelName = modelName;
	}

	@Override
	protected boolean prepare() {
		return (domain != null) && (domain.getResourceSet() != null) && (resourceURI != null);
	}

	@Override
	public void execute() {
		ResourceSet resourceSet = domain.getResourceSet();
		Resource decoratorModel = resourceSet.getResource(resourceURI, false);

		if (decoratorModel == null) {
			if (canLoad(resourceSet, resourceURI)) {
				// Just load it, then, for the next command to find. This is not undoable (nor needs to be)
				resourceSet.getResource(resourceURI, true);
			} else {
				// Create the new decorator model resource
				if (resourceSet instanceof ModelSet) {
					DecoratorModel model = DecoratorModel.getInstance((ModelSet) resourceSet);
					createdResource = model.loadDecoratorModel(resourceURI);
				} else {
					// Ensure that we get a UML resource, regardless of the URI
					createdResource = resourceSet.createResource(resourceURI, UMLPackage.eCONTENT_TYPE);
				}

				initializeDecoratorModel(createdResource, modelName);
			}
		}
	}

	protected void initializeDecoratorModel(Resource resource, String modelName) {
		createdDecoratorModel = UMLFactory.eINSTANCE.createPackage();
		createdDecoratorModel.setName(modelName);
		resource.getContents().add(createdDecoratorModel);

		// The Externalization Profile is applied here so that it is not inherited by the packages in the user model
		Profile externalizationProfile = DecoratorModelUtils.getExternalizationProfile(resource.getResourceSet());
		createdDecoratorModel.applyProfile(externalizationProfile);
	}

	protected boolean canLoad(ResourceSet resourceSet, URI resourceURI) {
		boolean result = resourceSet.getURIConverter().exists(resourceURI, null);

		if (result) {
			// Furthermore, is it a decorator model?
			result = DecoratorModelUtils.isDecoratorModel(resourceURI);
		}

		return result;
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	@Override
	public void undo() {
		if (createdResource != null) {
			// Unload it and remove it
			createdResource.unload();
			createdResource.getResourceSet().getResources().remove(createdResource);
			createdResource.eAdapters().clear();
		}
	}

	@Override
	public void redo() {
		if (createdResource != null) {
			ResourceSet resourceSet = domain.getResourceSet();
			if (resourceSet.getResource(createdResource.getURI(), false) == null) {
				// Simply put the same resource back
				resourceSet.getResources().add(createdResource);
				createdResource.getContents().clear(); // Just in case
				createdResource.getContents().add(createdDecoratorModel);
				((InternalEObject) createdDecoratorModel).eSetProxyURI(null);
			}
		}
	}

}
