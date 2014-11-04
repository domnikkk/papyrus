/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.editor.part;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoCopyAction;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoCutAction;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoDeleteAction;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoPasteAction;
import org.eclipse.papyrus.infra.emf.editor.actions.ValidationAction;
import org.eclipse.papyrus.infra.emf.editor.util.ActionUtil;
import org.eclipse.papyrus.infra.newchild.CreationMenuRegistry;
import org.eclipse.papyrus.infra.newchild.ui.DynamicNewChild;

/**
 * The Action bar contributor for the Context Editor
 * Mainly serves as an Adapter for the Ecore actions, as the Ecore actions are
 * not natively compatible with the EMF Facet tree objects
 *
 * @author Camille Letavernier
 */
public class ActionBarContributor extends EcoreActionBarContributor {

	DynamicNewChild contribution = new DynamicNewChild();

	/**
	 *
	 * Constructor.
	 *
	 */
	public ActionBarContributor() {
		super();
		validateAction = new ValidationAction();
	}

	protected CreationMenuRegistry creationMenuRegistry = new CreationMenuRegistry();

	public void setEditingDomain(EditingDomain domain) {
		if (validateAction instanceof ValidationAction) {
			((ValidationAction) validateAction).setEditingDomain(domain);
		}
	}

	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		super.addGlobalActions(menuManager);
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);

		menuManager.insertBefore("edit", contribution);
	}

	@Override
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		return new LinkedList<IAction>();
	}

	@Override
	protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		return new LinkedList<IAction>();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		ISelection newSelection = ActionUtil.getAdaptedSelection(event.getSelection());

		SelectionChangedEvent newEvent = new SelectionChangedEvent(event.getSelectionProvider(), newSelection);

		super.selectionChanged(newEvent);
	}

	@Override
	protected DeleteAction createDeleteAction() {
		return new MoDiscoDeleteAction(removeAllReferencesOnDelete());
	}

	@Override
	protected CutAction createCutAction() {
		return new MoDiscoCutAction();
	}

	@Override
	protected CopyAction createCopyAction() {
		return new MoDiscoCopyAction();
	}

	@Override
	protected PasteAction createPasteAction() {
		return new MoDiscoPasteAction();
	}

}
