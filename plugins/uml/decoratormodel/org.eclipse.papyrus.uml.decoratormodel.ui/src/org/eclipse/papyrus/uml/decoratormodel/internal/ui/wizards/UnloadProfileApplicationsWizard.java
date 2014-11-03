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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.commands.UnloadDecoratorModelHandler;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Sets;

/**
 * @author damus
 *
 */
public class UnloadProfileApplicationsWizard extends AbstractManageProfileApplicationsWizard {

	public UnloadProfileApplicationsWizard() {
		super(false); // There is no auto-prompt for unload

		setWindowTitle(Messages.UnloadProfileApplicationsWizard_0);
	}

	@Override
	protected void configureSelectionPage(DecoratorModelSelectionPage page) {
		page.setMessage(Messages.UnloadProfileApplicationsWizard_1);
	}

	@Override
	Set<URI> getAvailableProfileApplicationResources(Package package_) {
		Set<URI> result = Sets.newHashSet();

		// Collect all loaded profile application resources for loaded sub-units
		result.addAll(DecoratorModelUtils.getLoadedDecoratorModels(package_.eResource()));
		for (Package subUnit : DecoratorModelUtils.getLoadedSubUnitPackages(package_)) {
			result.addAll(DecoratorModelUtils.getLoadedDecoratorModels(subUnit.eResource()));
		}

		return result;
	}

	@Override
	protected boolean performFinish(final ResourceSet resourceSet, final Set<URI> resourceURIs) {
		return unload(resourceSet, resourceURIs);
	}

	static boolean unload(final ResourceSet resourceSet, final Set<URI> resourceURIs) {
		boolean result = false;

		Set<Resource> toUnload = Sets.newHashSet();

		for (URI uri : resourceURIs) {
			Resource resource = resourceSet.getResource(uri, false);
			if ((resource != null) && resource.isLoaded()) {
				toUnload.add(resource);
			}
		}

		if (!toUnload.isEmpty()) {
			try {
				UnloadDecoratorModelHandler.unloadResources(Activator.getActiveWorkbenchWindow(), resourceSet, toUnload);
				result = true;
			} catch (ExecutionException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.UnloadProfileApplicationsWizard_2, e);
				Activator.getDefault().getLog().log(status);
				StatusManager.getManager().handle(status, StatusManager.BLOCK);
			}
		}

		return result;
	}
}
