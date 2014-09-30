/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.onefile.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.papyrus.infra.onefile.action.PapyrusModelPasteAction;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

/**
 * Action provider for paste Papyrus models
 */
public class PapyrusEditActionProvider extends CommonActionProvider {

	private boolean fInViewPart = false;

	private ICommonViewerWorkbenchSite workbenchSite;

	private Action pasteAction;

	public PapyrusEditActionProvider() {
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		super.fillActionBars(actionBars);
		if (fInViewPart) {
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		if (pasteAction != null && pasteAction.isEnabled()) {
			menu.insertAfter(PapyrusModelPasteAction.ID, pasteAction); // same as the internal org.eclipse.ui.internal.navigator.resources.actions.PasteAction.ID
			menu.remove(PapyrusModelPasteAction.ID);
		}
	}

	@Override
	public void init(ICommonActionExtensionSite site) {
		if (site.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			workbenchSite = (ICommonViewerWorkbenchSite) site.getViewSite();
		}
		if (workbenchSite != null) {
			if (workbenchSite.getPart() != null && workbenchSite.getPart() instanceof IViewPart) {
				fInViewPart = true;
			}
			makeActions();
		}
	}

	private void makeActions() {
		final IWorkbenchPartSite provider = workbenchSite.getSite();

		Shell shell = provider.getShell();
		Clipboard clipboard = new Clipboard(shell.getDisplay());
		pasteAction = new PapyrusModelPasteAction(shell, clipboard) {

			// the helper is filtering Ipapyrus files

			@Override
			protected List getSelectedResources() {
				ActionContext context = getContext();
				List selectedResources = getSelectedResources(context);
				return selectedResources;
			}

			protected List getSelectedResources(ActionContext context) {
				ISelection selec = context.getSelection();
				List<IResource> resources = new ArrayList<IResource>();

				if (selec instanceof TreeSelection) {
					TreeSelection tree = (TreeSelection) selec;
					Object firstElement = tree.getFirstElement();
					if (firstElement instanceof IResource) {
						resources.add((IResource) firstElement);
					}
				}
				return resources;
			}
		};

		makeAction(pasteAction, IWorkbenchCommandConstants.EDIT_PASTE, ISharedImages.IMG_TOOL_PASTE, ISharedImages.IMG_TOOL_PASTE_DISABLED);
	}

	/**
	 * Create an action
	 *
	 * @param action
	 * @param id
	 * @param imgTool
	 * @param imgToolDisabled
	 */
	protected void makeAction(Action action, String id, String imgTool, String imgToolDisabled) {
		if (action != null) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			if (id != null) {
				action.setId(id);
				action.setActionDefinitionId(id);
			}
			if (imgTool != null) {
				action.setImageDescriptor(images.getImageDescriptor(imgTool));
			}
			if (imgToolDisabled != null) {
				action.setDisabledImageDescriptor(images.getImageDescriptor(imgToolDisabled));
			}
		}
	}

}
