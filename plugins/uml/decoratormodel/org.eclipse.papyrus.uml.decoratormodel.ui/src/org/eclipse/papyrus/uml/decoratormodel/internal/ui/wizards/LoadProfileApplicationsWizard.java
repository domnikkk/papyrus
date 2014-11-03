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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.uml2.uml.Package;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;

/**
 * @author damus
 *
 */
public class LoadProfileApplicationsWizard extends AbstractManageProfileApplicationsWizard {

	private static final String SECTION_RESOURCES = "resources"; //$NON-NLS-1$
	private static final String KEY_AUTO_PROMPT_SELECTIONS = "autoPromptSelections"; //$NON-NLS-1$

	private Set<URI> loadedProfileApplicationResources;

	private ConflictingDecoratorModelsPage conflictsPage;

	private final boolean promptingConflicts;

	public LoadProfileApplicationsWizard(boolean autoPrompt) {
		this(autoPrompt, false);
	}

	public LoadProfileApplicationsWizard(boolean autoPrompt, boolean promptingConflicts) {
		super(autoPrompt);

		this.promptingConflicts = promptingConflicts;

		setWindowTitle(Messages.LoadProfileApplicationsWizard_0);
	}

	@Override
	protected DecoratorModelSelectionPage createSelectionPage(EventBus bus) {
		return new LoadDecoratorModelsPage(bus);
	}

	@Override
	protected void configureSelectionPage(DecoratorModelSelectionPage page) {
		page.setMessage(Messages.LoadProfileApplicationsWizard_1);
	}

	@Override
	Set<URI> getAvailableProfileApplicationResources(Package package_) {
		Set<URI> result = Sets.newHashSet();

		// Collect all available decorator models
		result.addAll(DecoratorModelUtils.getUnloadedDecoratorModels(package_.eResource()));

		// If we are automatically prompting the user, then do it only for the actual resource being opened
		if (!isAutoPrompt()) {
			// Collect available decorator models for loaded sub-units
			for (Package subUnit : DecoratorModelUtils.getLoadedSubUnitPackages(package_)) {
				result.addAll(DecoratorModelUtils.getUnloadedDecoratorModels(subUnit.eResource()));
			}
		}

		return result;
	}

	@Override
	protected void createPages(Package package_, EventBus bus) {
		super.createPages(package_, bus);

		loadedProfileApplicationResources = getLoadedProfileApplicationResources(package_);

		if (needsUnloadConflictsPage()) {
			// Have potential for conflicts, or at least resources that we can unload
			conflictsPage = new ConflictingDecoratorModelsPage(bus);
			conflictsPage.setIsAutomaticPrompt(promptingConflicts);
		}
	}

	@Override
	protected void initPages(Package package_, Iterable<URI> initialSelections) {
		if (isAutoPrompt() && Iterables.isEmpty(initialSelections)) {
			// Compute the initial selections
			initialSelections = getSavedDecoratorsSelection();
		}

		super.initPages(package_, initialSelections);

		if (conflictsPage != null) {
			conflictsPage.setInput(package_, loadedProfileApplicationResources);
		}
	}

	@Override
	public void addPages() {
		super.addPages();

		if (conflictsPage != null) {
			addPage(conflictsPage);
		}
	}

	public boolean needsUnloadConflictsPage() {
		return (loadedProfileApplicationResources != null) && !loadedProfileApplicationResources.isEmpty();
	}

	protected Set<URI> getLoadedProfileApplicationResources(Package package_) {
		Set<Resource> resources = Sets.newHashSet();
		resources.add(package_.eResource());
		for (Package next : DecoratorModelUtils.getLoadedSubUnitPackages(package_)) {
			resources.add(next.eResource());
		}

		Set<URI> result = Sets.newHashSet();

		for (Resource next : resources) {
			result.addAll(DecoratorModelUtils.getLoadedDecoratorModels(next));
		}

		return result;
	}

	@Override
	public boolean isComplete() {
		return super.isComplete() && ((conflictsPage == null) || conflictsPage.isPageComplete());
	}

	@Override
	protected boolean performFinish(ResourceSet resourceSet, Set<URI> resourceURIs) {
		if (conflictsPage != null) {
			Set<URI> unload = conflictsPage.getResourcesToUnload();
			if (!unload.isEmpty() && !UnloadProfileApplicationsWizard.unload(resourceSet, unload)) {
				// Bail
				return false;
			}
		}

		boolean result = DecoratorModelUtils.loadDecoratorModels(resourceSet, resourceURIs);

		if (isAutoPrompt()) {
			saveDecoratorsSelection(resourceURIs);
		}

		return result;
	}

	protected void saveDecoratorsSelection(Set<URI> resourceURIs) {
		boolean remove = resourceURIs.isEmpty();

		IDialogSettings resourcesSection = getSection(SECTION_RESOURCES, !remove);
		if (resourcesSection != null) {
			pruneResourceSections(resourcesSection);

			String resourceURI = getPackage().eResource().getURI().toString();

			IDialogSettings resource = getSection(resourcesSection, resourceURI, !remove);
			if (resource != null) {
				if (remove) {
					resource.put(KEY_AUTO_PROMPT_SELECTIONS, (String[]) null);
				} else {
					String[] uris = Iterables.toArray(Iterables.transform(resourceURIs, Functions.toStringFunction()), String.class);
					resource.put(KEY_AUTO_PROMPT_SELECTIONS, uris);
				}
			}
		}
	}

	private Set<URI> getSavedDecoratorsSelection() {
		ImmutableSet.Builder<URI> result = ImmutableSet.builder();
		IDialogSettings resourcesSection = getSection(SECTION_RESOURCES, false);
		if (resourcesSection != null) {
			String resourceURI = getPackage().eResource().getURI().toString();
			IDialogSettings resource = resourcesSection.getSection(resourceURI);
			if (resource != null) {
				String[] uris = resource.getArray(KEY_AUTO_PROMPT_SELECTIONS);
				if (uris != null) {
					for (String next : uris) {
						result.add(URI.createURI(next));
					}
				}
			}
		}

		return result.build();
	}

	private void pruneResourceSections(IDialogSettings resourcesSection) {
		for (IDialogSettings next : resourcesSection.getSections()) {
			URI uri = URI.createURI(next.getName());
			boolean exists = false;

			if (uri.isPlatformResource()) {
				IPath path = new Path(uri.toPlatformString(true));
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

				// If the file's project is closed, assume the file still exists
				exists = (file != null) && (file.isAccessible() || !file.getProject().isOpen());
			}

			if (!exists) {
				((DialogSettings) resourcesSection).removeSection(next);
			}
		}
	}
}
