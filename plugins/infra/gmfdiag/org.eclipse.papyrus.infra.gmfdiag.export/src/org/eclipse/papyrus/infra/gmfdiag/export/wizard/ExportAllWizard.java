/*******************************************************************************
 * Copyright (c) 2011, 2014 AtoS, CEA LIST and other.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anass RADOUANI (AtoS)
 *    Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 440754
 *******************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.export.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ResourceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForSelection;
import org.eclipse.papyrus.infra.gmfdiag.export.actions.ExportAllDiagramsParameter;
import org.eclipse.papyrus.infra.gmfdiag.export.actions.ExportComposite;
import org.eclipse.papyrus.infra.gmfdiag.export.engine.ExportAllDiagramsEngine;
import org.eclipse.papyrus.infra.gmfdiag.export.messages.Messages;
import org.eclipse.papyrus.infra.gmfdiag.export.utils.SelectionHelper;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;



/**
 * Export wizard for Export all diagrams feature.
 */
public class ExportAllWizard extends Wizard implements IExportWizard {

	/** wizard page to export all diagram from a Papyrus model. */
	private ExportDiagramsPage page;

	/** error wizard page shown when the selected file is incorrect. */
	private ExportDiagramsErrorPage pageError;

	/** Selected file. */
	private IFile file;

	/** The export all diagrams. */
	private ExportAllDiagramsEngine exportAllDiagrams = null;

	/** The Export parameter. */
	private ExportAllDiagramsParameter parameter = null;

	/**
	 * Constructor.
	 *
	 */
	public ExportAllWizard() {
		super();
		setWindowTitle(Messages.ExportAllWizard_1);
		exportAllDiagrams = new ExportAllDiagramsEngine();
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {


		// Initialise local field of handler
		ModelSet modelSetSelection = null;

		file = null;

		// Try to get model set with the services
		try {
			modelSetSelection = ServiceUtilsForSelection.getInstance().getModelSet(selection);
		} catch (ServiceException e) {
			// Ignore service exception
		}


		// No registered services with the selection
		if (modelSetSelection == null) {

			file = SelectionHelper.convertSelection2File(selection);
			if (file != null) {

				URI diFileUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

				// Initialise export parameter
				parameter = new ExportAllDiagramsParameter(diFileUri);
			}

		} else {

			// Get file di file
			IModel diModel = modelSetSelection.getModel(DiModel.DI_MODEL_ID);
			if (diModel instanceof DiModel) {
				file = ResourceUtils.getFile(((DiModel) diModel).getResource());
			}

			// Initialise export parameter
			parameter = new ExportAllDiagramsParameter(modelSetSelection);

		}

		// Ask to user the others export configuration parameters
		URI uriFile = null;
		if (file != null) {
			IContainer parentResource = file.getParent();
			parentResource = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(parentResource.getLocation());
			uriFile = URI.createPlatformResourceURI(parentResource.getLocation().toString(), true);

		}

		if (parameter == null) {
			pageError = new ExportDiagramsErrorPage();
			addPage(pageError);
		} else {
			page = new ExportDiagramsPage(uriFile);
			addPage(page);
		}


	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 *
	 * @return
	 */
	@Override
	public boolean canFinish() {
		return file != null && super.canFinish();
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 *
	 * @return
	 */
	@Override
	public boolean performFinish() {
		boolean performFinish = parameter != null;
		if (performFinish) {

			ExportComposite exportPage = page.getExport();
			performFinish = exportPage.getOutputDirectory().isAccessible();
			if (performFinish) {
				page.setErrorMessage(null);

				parameter.setOutputDirectory(exportPage.getOutputDirectory());
				parameter.setExportFormat(exportPage.getExporter());
				parameter.setQualifiedName(exportPage.getQualifiedName());

				exportAllDiagrams.initialise(parameter);
				exportAllDiagrams.exportDiagramsToImages();
			} else {
				page.setErrorMessage(Messages.ExportAllWizard_0);
			}

		}

		return performFinish;
	}

}
