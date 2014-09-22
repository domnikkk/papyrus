/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;
import org.eclipse.papyrus.infra.emf.resource.DependencyManagementHelper;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformation;
import org.eclipse.ui.handlers.HandlerUtil;


public class ImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection == null || selection.isEmpty()) {
			return null;
		}

		Set<IFile> filesToImport = new HashSet<IFile>();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> selectionIterator = structuredSelection.iterator();
			while (selectionIterator.hasNext()) {
				Object selectedElement = selectionIterator.next();
				if (selectedElement instanceof IAdaptable) {
					IFile selectedFile = (IFile) ((IAdaptable) selectedElement).getAdapter(IFile.class);
					if (selectedFile == null) {
						Activator.log.warn("Element %s is not an IFile");
						continue;
					}

					// EFX files can be selected (Makes it easier to select a set of files),
					// but they will be imported by their parent model
					String fileExtension = selectedFile.getFileExtension();
					if ("epx".equals(fileExtension) || "emx".equals(fileExtension)) { //$NON-NLS-1$ //$NON-NLS-2$
						filesToImport.add(selectedFile);
					}
				}
			}
		}

		importFiles(filesToImport);

		return null;
	}

	public void importFiles(Set<IFile> selectedFiles) {
		List<ImportTransformation> transformations = new LinkedList<ImportTransformation>();

		for (IFile selectedFile : selectedFiles) {
			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

			ImportTransformation transformation = new ImportTransformation(uri);
			transformation.run();

			transformations.add(transformation);
		}

		if (selectedFiles.size() > 1) {
			importModelDependencies(transformations);
		}
	}

	public void importModelDependencies(final List<ImportTransformation> transformations) {
		Job importDependencies = new Job("Import model dependencies") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.setTaskName("Waiting for import tasks to complete...");
				monitor.beginTask("Import model dependencies", transformations.size() * 2);

				wait(transformations, monitor);

				handleModelDependencies(transformations, monitor);

				return Status.OK_STATUS;
			}

			// Wait for all import transformations to complete
			protected void wait(List<ImportTransformation> transformations, IProgressMonitor monitor) {
				for (ImportTransformation transformation : transformations) {
					monitor.subTask("Waiting for " + transformation.getModelName() + " to complete...");
					transformation.waitForCompletion();
					monitor.worked(1);
				}
			}

			// Convert all model dependencies (For "imported model -> emx library" to "imported model -> imported library")
			protected void handleModelDependencies(List<ImportTransformation> transformations, IProgressMonitor monitor) {
				Map<URI, URI> urisToReplace = new HashMap<URI, URI>();
				for (ImportTransformation transformation : transformations) {
					// Only transform EMX/EFX models. Profiles (epx) will be handled separately

					for (Map.Entry<URI, URI> entry : transformation.getURIMappings().entrySet()) {
						String fileExtension = entry.getKey().fileExtension();
						if ("emx".equals(fileExtension) || "efx".equals(fileExtension)) {
							urisToReplace.put(entry.getKey(), entry.getValue());
						}
					}

				}

				for (ImportTransformation transformation : transformations) {

					monitor.subTask("Importing dependencies for " + transformation.getModelName());
					final ModelSet modelSet = new DiResourceSet();
					try {
						modelSet.loadModels(transformation.getTargetURI());
					} catch (ModelMultiException e) {
						Activator.log.error(e);
						continue;
					}
					final TransactionalEditingDomain domain = modelSet.getTransactionalEditingDomain();

					for (final Map.Entry<URI, URI> entry : urisToReplace.entrySet()) {
						domain.getCommandStack().execute(new RecordingCommand(domain, "Import dependencies") {

							@Override
							protected void doExecute() {
								DependencyManagementHelper.updateDependencies(entry.getKey(), entry.getValue(), modelSet, domain);
							}
						});

					}

					try {
						modelSet.save(new NullProgressMonitor());
						monitor.worked(1);
					} catch (IOException ex) {
						Activator.log.error(ex);
						continue;
					}
				}
			}
		};

		importDependencies.setUser(true);
		importDependencies.schedule();
	}




}
