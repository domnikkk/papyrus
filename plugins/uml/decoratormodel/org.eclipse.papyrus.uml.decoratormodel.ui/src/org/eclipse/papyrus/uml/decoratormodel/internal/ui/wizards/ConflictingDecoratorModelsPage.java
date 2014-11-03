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

import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.AbstractProfileApplicationsPage.button;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.ProfileExternalizationUIPreferences;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

import com.google.common.collect.Maps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @author damus
 *
 */
public class ConflictingDecoratorModelsPage extends DecoratorModelSelectionPage {
	private IFile[] resourcesSelectedForLoad;
	private IFile[] conflicts;
	private Button selectConflicts;

	/*
	 * Map of (package -> profile -> application resource).
	 */
	private Map<URI, Map<URI, URI>> loadedExternalApplications;

	public ConflictingDecoratorModelsPage(EventBus bus) {
		this(bus, null);
	}

	public ConflictingDecoratorModelsPage(EventBus bus, ImageDescriptor titleImage) {
		super("unload", Messages.ConflictingDecoratorModelsPage_0, bus, titleImage); //$NON-NLS-1$

		bus.register(this);

		setMessage(Messages.ConflictingDecoratorModelsPage_1);
	}

	@Override
	public void setInput(Package package_, Set<URI> input) {
		super.setInput(package_, input);

		// Compute the external profile applications already loaded
		loadedExternalApplications = Maps.newHashMap();
		ResourceSet rset = EMFHelper.getResourceSet(package_);
		for (URI next : input) {
			Resource resource = rset.getResource(next, true);
			for (Map.Entry<Package, Profile> external : DecoratorModelUtils.getDecoratorProfileApplications(resource).entrySet()) {
				URI packageURI = EcoreUtil.getURI(external.getKey());
				Map<URI, URI> profiles = loadedExternalApplications.get(packageURI);
				if (profiles == null) {
					profiles = Maps.newHashMap();
					loadedExternalApplications.put(packageURI, profiles);
				}

				profiles.put(EcoreUtil.getURI(external.getValue()), next);
			}
		}

		conflicts = computeConflicts(resourcesSelectedForLoad);

		validatePage();
	}

	@Override
	protected void createSpecialSelectionButtons(Composite parent) {
		selectConflicts = button(parent, Messages.ConflictingDecoratorModelsPage_2);
		selectConflicts.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (IFile next : conflicts) {
					table.setChecked(next, true);
				}
				validatePage();
			}
		});

		if (conflicts != null) {
			selectConflicts.setEnabled(conflicts.length > 0);
		}
	}

	@Override
	protected void storeDontShowThisPreference(boolean dontShowThisAgain) {
		ProfileExternalizationUIPreferences.setPromptToUnloadConflicts(!dontShowThisAgain);
	}

	public Set<URI> getResourcesToUnload() {
		return filesToURIs(getCheckedFiles());
	}

	@Subscribe
	public void resourcesSelectedForLoad(IFile[] resources) {
		this.resourcesSelectedForLoad = resources;
		this.conflicts = computeConflicts(resources);

		validatePage();
	}

	static Set<URI> filesToURIs(IFile[] files) {
		Set<URI> result = Sets.newHashSet();
		for (IFile next : files) {
			result.add(URI.createPlatformResourceURI(next.getFullPath().toString(), true));
		}
		return result;
	}

	protected IFile[] computeConflicts(IFile[] resources) {
		if ((loadedExternalApplications == null) || (resources == null)) {
			return new IFile[0];
		}

		Set<URI> result = Sets.newHashSet();
		Set<URI> uris = filesToURIs(resources);

		// The input resources are loaded. Which of these apply the same profiles
		// to the same packages as any of ones to be loaded?
		for (URI next : uris) {
			try {
				SetMultimap<URI, URI> profileApplications = DecoratorModelIndex.getInstance().getAppliedProfilesByPackage(next);
				for (URI packageURI : profileApplications.keySet()) {
					Map<URI, URI> existingAppliedProfiles = loadedExternalApplications.get(packageURI);
					if (existingAppliedProfiles != null) {
						Set<URI> newProfiles = profileApplications.get(packageURI);
						for (Map.Entry<URI, URI> profileToResource : existingAppliedProfiles.entrySet()) {
							if (newProfiles.contains(profileToResource.getKey())) {
								// This is a conflict
								result.add(profileToResource.getValue());
							}
						}
					}
				}
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
				StatusManager.getManager().handle(e.getStatus(), StatusManager.SHOW);
			}
		}

		// Before we have created the UI, automatically select any conflicts if we are showing
		// this page as an automatic prompt to unload conflicts
		if (!result.isEmpty() && showDontShowThis() && !ProfileExternalizationUIPreferences.getPromptToUnloadConflicts() && (table == null)) {
			select(result);
		}

		IFile[] conflicts = urisToFilesArray(result);
		if (selectConflicts != null) {
			selectConflicts.setEnabled(conflicts.length > 0);
		}

		return conflicts;
	}

	boolean anyConflictNotSelected() {
		boolean result = false;

		Set<IFile> checked = Sets.newHashSet(getCheckedFiles());
		if (conflicts != null) {
			for (IFile next : conflicts) {
				if (!checked.contains(next)) {
					result = true;
					break;
				}
			}
		}

		return result;
	}

	@Override
	void validatePage() {
		setErrorMessage(null);

		if (anyConflictNotSelected()) {
			setErrorMessage(Messages.ConflictingDecoratorModelsPage_3);
			setPageComplete(false);
		} else {
			setPageComplete(true);
		}
	}

}
