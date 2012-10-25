/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Devernay (Atos) laurent.devernay@atos.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.preferences.Activator;
import org.eclipse.papyrus.preferences.pages.AbstractPapyrusNodePreferencePage;
import org.eclipse.papyrus.preferences.ui.AbstractGroup;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class LoadingStrategyPreferencePage extends AbstractPapyrusNodePreferencePage {

	/**
	 * @generated
	 */
	@Override
	protected String getBundleId() {
		return Activator.PLUGIN_ID;
	}

	private IProject project;

	/**
	 * @generated
	 */
	public static void initDefaults(IPreferenceStore store) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createPageContents(Composite parent) {
		AbstractGroup group = new LoadinStrategyGroup(parent, getTitle(), this);
		addAbstractGroup(group);
		group = new LoadedAssociatedResourceGroup(parent, getTitle(), this);
		addAbstractGroup(group);
		group = new LoadedAuthorizedResourceGroup(parent, getTitle(), this);
		addAbstractGroup(group);
		// TODO : if no value is set for the radio buttons (loading strategy) on
		// a project, use the workspace loading strategy.
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performOk() {
		boolean result = super.performOk();

		StrategyChooser.setCurrentStrategy(doGetPreferenceStore().getInt(ICorePreferenceConstants.PREF_CORE_DEFINE_LOADING_STRATEGY));
		IPreferenceStore modifiedPrefStore = doGetPreferenceStore();
		try {
			if(modifiedPrefStore instanceof IPersistentPreferenceStore) {
				((IPersistentPreferenceStore)modifiedPrefStore).save();
			}
		} catch (Exception e) {
			CorePlugin.logError(e);
		}

		return result;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 */
	public IAdaptable getElement() {
		return project;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 */
	public void setElement(IAdaptable element) {
		project = (IProject)element.getAdapter(IResource.class);
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return doGetPreferenceStore();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#doGetPreferenceStore()
	 */
	protected IPreferenceStore doGetPreferenceStore() {
		IPreferenceStore store;
		if(project != null) {
			store = new ScopedPreferenceStore(new ProjectScope(project), Activator.PLUGIN_ID);
		} else {
			store = new ScopedPreferenceStore(new InstanceScope(), Activator.PLUGIN_ID);
		}
		return store;
	}
}
