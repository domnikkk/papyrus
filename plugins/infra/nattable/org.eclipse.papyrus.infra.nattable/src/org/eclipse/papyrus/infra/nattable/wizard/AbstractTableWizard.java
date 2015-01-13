/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;

/**
 * @author VL222926
 *
 */
public abstract class AbstractTableWizard extends Wizard {

	/**
	 * the nattable model manager to use for the import
	 */
	protected INattableModelManager manager;

	/**
	 *
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.manager = getNattableModelManager(workbench, selection);
	}

	/**
	 *
	 * @param workbench
	 *            the current workbench
	 * @param selection
	 *            the current selection
	 * @return
	 *         the nattable manager to use to do the import
	 */
	private INattableModelManager getNattableModelManager(final IWorkbench workbench, final IStructuredSelection selection) {
		final IEditorPart editorPart = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editorPart != null) {
			return (INattableModelManager) editorPart.getAdapter(INattableModelManager.class);
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         the nattable manager to use in the wizard
	 */
	public final INattableModelManager getNatTableModelManager() {
		return this.manager;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 *
	 */
	@Override
	public void addPages() {
		getShell().setImage(Activator.getDefault().getImage(ImageConstants.PAPYRUS_ICON_PATH)); 
	}

}
