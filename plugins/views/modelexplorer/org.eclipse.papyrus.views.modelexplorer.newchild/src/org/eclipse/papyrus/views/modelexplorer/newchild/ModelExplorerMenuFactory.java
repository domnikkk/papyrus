/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer.newchild;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.newchild.CreationMenuFactory;
import org.eclipse.papyrus.infra.widgets.util.RevealResultCommand;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.MultiViewPageBookView;
import org.eclipse.papyrus.views.modelexplorer.newchild.preferences.NewChildPreferences;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

/**
 * Override of creation menu factory to select created element in Model Explorer view.
 * 
 * @author Gabriel Pascual
 *
 */
public class ModelExplorerMenuFactory extends CreationMenuFactory {

	/**
	 * Default constructor.
	 *
	 * @param editingDomain
	 */
	public ModelExplorerMenuFactory(TransactionalEditingDomain editingDomain) {
		super(editingDomain);
	}

	/**
	 * @see org.eclipse.papyrus.infra.newchild.CreationMenuFactory#buildCommand(org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, java.lang.String)
	 *
	 * @param reference
	 * @param container
	 * @param extendedType
	 * @return
	 */
	@Override
	protected Command buildCommand(EReference reference, EObject container, String extendedType) {
		Command buildCommand = super.buildCommand(reference, container, extendedType);

		boolean defaultSelectionPreference = Activator.getDefault().getPreferenceStore().getBoolean(NewChildPreferences.DEFAULT_SELECTION);

		if (defaultSelectionPreference) {

			IViewPart viewPart = getActiveViewPart();
			// Wrap command to select created element
			buildCommand = RevealResultCommand.wrap(buildCommand, viewPart, container);
		}

		return buildCommand;
	}


	/**
	 * Gets the active view part.
	 *
	 * @return the active view part
	 */
	private IViewPart getActiveViewPart() {
		IViewPart activeView = null;
		// Get Model Explorer view part
		IViewPart modelExplorerView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ModelExplorerPageBookView.VIEW_ID);

		if (modelExplorerView instanceof MultiViewPageBookView) {
			MultiViewPageBookView pageBook = (MultiViewPageBookView) modelExplorerView;
			activeView = pageBook.getActiveView();
		}

		return activeView;
	}
}
