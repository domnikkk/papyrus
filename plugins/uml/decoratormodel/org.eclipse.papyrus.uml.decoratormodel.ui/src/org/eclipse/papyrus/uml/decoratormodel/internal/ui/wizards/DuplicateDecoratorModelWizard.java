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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.tools.util.ICallableWithProgress;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelCopier;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.common.collect.ImmutableSet;

/**
 * A wizard for duplication of an existing loaded or unloaded decorator model.
 */
public class DuplicateDecoratorModelWizard extends Wizard {

	private ResourceSet resourceSet;

	private Object decoratorModel;

	private DuplicateDecoratorModelPage mainPage;

	public DuplicateDecoratorModelWizard() {
		super();

		setWindowTitle(Messages.DuplicateDecoratorModelWizard_0);
		setDialogSettings(DialogSettings.getOrCreateSection(Activator.getDefault().getDialogSettings(), getClass().getSimpleName()));
	}

	public void init(ResourceSet resourceSet, Object decoratorModel) {
		this.resourceSet = resourceSet;
		this.decoratorModel = decoratorModel;

		if (mainPage != null) {
			mainPage.setInput(decoratorModel);
		}
	}

	@Override
	public void addPages() {
		mainPage = new DuplicateDecoratorModelPage(resourceSet);
		addPage(mainPage);
		mainPage.setInput(decoratorModel);
	}

	@Override
	public boolean needsProgressMonitor() {
		return true;
	}

	@Override
	public boolean performFinish() {
		boolean result = false;

		mainPage.saveSettings();

		final Set<URI> profileURIs = ImmutableSet.copyOf(mainPage.getSelectedProfileApplications());
		final URI resourceURI = mainPage.getResourceURI();
		final String modelName = mainPage.getModelName();

		if (!profileURIs.isEmpty() && (resourceURI != null)) {
			try {
				result = UIUtil.call(getContainer(), false, false, new ICallableWithProgress<Boolean>() {

					@Override
					public Boolean call(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						boolean result = false;

						final ResourceSet resourceSet;
						final URI decoratorModelURI;

						monitor.beginTask(Messages.DuplicateDecoratorModelWizard_1, IProgressMonitor.UNKNOWN);
						try {
							if (decoratorModel instanceof Resource) {
								Resource unload = (Resource) decoratorModel;
								resourceSet = unload.getResourceSet();
								decoratorModelURI = unload.getURI();
								if (!UnloadProfileApplicationsWizard.unload(resourceSet, Collections.singleton(unload.getURI()))) {
									// Bail
									return false;
								}
							} else {
								resourceSet = null;
								decoratorModelURI = (URI) decoratorModel;
							}

							try {
								result = copy(decoratorModelURI, resourceURI, modelName, profileURIs);

								if (result && (resourceSet != null)) {
									// Switch to the new copy
									DecoratorModelUtils.loadDecoratorModels(resourceSet, Collections.singleton(resourceURI));
								}
							} catch (IOException e) {
								throw new InvocationTargetException(e);
							}
						} finally {
							monitor.done();
						}

						return result;
					}
				});
			} catch (InterruptedException e) {
				// Pass
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.DuplicateDecoratorModelWizard_2, e.getTargetException());
				StatusManager.getManager().handle(status, StatusManager.SHOW | StatusManager.LOG);
			}
		}

		return result;
	}

	private boolean copy(URI sourceModel, URI destinationModel, String modelName, Set<URI> profileURIs) throws IOException {
		boolean result = false;

		DecoratorModelCopier copier = new DecoratorModelCopier(modelName, profileURIs);
		try {
			Resource destination = copier.copy(sourceModel, destinationModel);
			destination.save(null);
			result = true;
		} finally {
			copier.dispose();
		}

		return result;
	}
}
