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

import java.util.Collections;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @author damus
 *
 */
abstract class AbstractManageProfileApplicationsWizard extends Wizard implements IWorkbenchWizard {

	private final boolean autoPrompt;

	private Package package_;

	private Set<URI> availableResources;

	private IFile[] selectedResources;

	private DecoratorModelSelectionPage mainPage;

	public AbstractManageProfileApplicationsWizard(boolean autoPrompt) {
		super();

		this.autoPrompt = autoPrompt;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		EObject eObject = EMFHelper.getEObject(selection.getFirstElement());
		if (eObject instanceof Package) {
			init((Package) eObject, Collections.<URI> emptyList());
		}
	}

	public void init(Package package_, Iterable<URI> initialSelections) {
		this.package_ = package_;
		this.availableResources = getAvailableProfileApplicationResources(package_);

		EventBus bus = new EventBus("wizard"); //$NON-NLS-1$
		bus.register(this);
		createPages(package_, bus);
		initPages(package_, ImmutableList.copyOf(initialSelections));
	}

	protected void createPages(Package package_, EventBus bus) {
		mainPage = createSelectionPage(bus);
		mainPage.setIsAutomaticPrompt(isAutoPrompt());
		configureSelectionPage(mainPage);
	}

	protected void initPages(Package package_, Iterable<URI> initialSelections) {
		mainPage.setInput(package_, availableResources);
		mainPage.select(initialSelections);
	}

	@Override
	public void addPages() {
		addPage(mainPage);
	}

	@Override
	public IWizardPage getStartingPage() {
		IWizardPage result = super.getStartingPage();

		if ((mainPage != null) && mainPage.canFlipToNextPage()) {
			result = mainPage.getNextPage();
		}

		return result;
	}

	protected DecoratorModelSelectionPage createSelectionPage(EventBus bus) {
		return new DecoratorModelSelectionPage(bus);
	}

	protected void configureSelectionPage(DecoratorModelSelectionPage page) {
		// Pass
	}

	protected boolean isAutoPrompt() {
		return autoPrompt;
	}

	abstract Set<URI> getAvailableProfileApplicationResources(Package package_);

	protected IDialogSettings getSection(String sectionName, boolean createIfNecessary) {
		IDialogSettings settings = Activator.getDefault().getDialogSettings().getSection(getClass().getSimpleName());
		if ((settings == null) && createIfNecessary) {
			settings = Activator.getDefault().getDialogSettings().addNewSection(getClass().getSimpleName());
		}

		IDialogSettings result = (settings == null) ? null : settings.getSection(sectionName);
		if ((result == null) && createIfNecessary) {
			result = settings.addNewSection(sectionName);
		}

		return result;
	}

	protected IDialogSettings getSection(IDialogSettings settings, String sectionName, boolean createIfNecessary) {
		IDialogSettings result = settings.getSection(sectionName);
		if ((result == null) && createIfNecessary) {
			result = settings.addNewSection(sectionName);
		}

		return result;
	}

	@Subscribe
	public void resourcesSelected(IFile[] resources) {
		this.selectedResources = resources;
	}

	public boolean isComplete() {
		return (mainPage != null) && mainPage.isPageComplete();
	}

	protected final Package getPackage() {
		return package_;
	}

	@Override
	public boolean performFinish() {
		final ResourceSet resourceSet = getPackage().eResource().getResourceSet();

		final Set<URI> resourceURIs = Sets.newHashSet();
		for (IFile next : selectedResources) {
			resourceURIs.add(URI.createPlatformResourceURI(next.getFullPath().toString(), true));
		}

		return performFinish(resourceSet, resourceURIs);
	}

	protected abstract boolean performFinish(ResourceSet resourceSet, Set<URI> resourceURIs);
}
