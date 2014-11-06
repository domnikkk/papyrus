/*******************************************************************************
 * Copyright (c) 2007, 2014 Anyware Technologies, CEA LIST and others. 
 * 
 * All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *		Jacques Lescot (Anyware Technologies) - initial API and implementation
 * 		Anass RADOUANI (AtoS) - add verification of the selection if it is a papyrus file or not
 * 		Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 440754
 ******************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.export.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ResourceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForSelection;
import org.eclipse.papyrus.infra.gmfdiag.export.Activator;
import org.eclipse.papyrus.infra.gmfdiag.export.engine.ExportAllDiagramsEngine;
import org.eclipse.papyrus.infra.gmfdiag.export.utils.SelectionHelper;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Handler to export all diagrams of selected resource in Project Explorer and Model Explorer.
 */
public class ExportAllDiagramsAction extends AbstractHandler {

	/** The export all diagrams. */
	private ExportAllDiagramsEngine exportAllDiagrams = null;

	/**
	 * Constructor.
	 *
	 */
	public ExportAllDiagramsAction() {
		super();
		exportAllDiagrams = new ExportAllDiagramsEngine();
	}

	/**
	 * Execute.
	 *
	 * @param event
	 *            the event
	 * @return the object
	 * @throws ExecutionException
	 *             the execution exception
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Get selection from handler event
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);

		// Initialise local field of handler
		ModelSet modelSetSelection = null;
		ExportAllDiagramsParameter parameter = null;
		IFile file = null;

		// Try to get model set with the services
		try {
			modelSetSelection = ServiceUtilsForSelection.getInstance().getModelSet(selection);
		} catch (ServiceException e) {
			// Ignore service exception
		}


		// No registered services with the selection
		if (modelSetSelection == null) {

			file = SelectionHelper.convertSelection2File(selection);
			URI diFileUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

			// Initialise export parameter
			parameter = new ExportAllDiagramsParameter(diFileUri);

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

		ExportAllDiagramsDialog exportPopup = new ExportAllDiagramsDialog(Activator.getActiveWorkbenchShell(), uriFile);
		if (exportPopup.open() == Window.OK) {

			// Complete export configuration
			parameter.setExportFormat(exportPopup.getExporter());
			parameter.setOutputDirectory(exportPopup.getOutputDirectory());
			parameter.setQualifiedName(exportPopup.getQualifiedName());

			// Initialise and run export
			exportAllDiagrams.initialise(parameter);
			exportAllDiagrams.exportDiagramsToImages();

		}

		return null;
	}
}
