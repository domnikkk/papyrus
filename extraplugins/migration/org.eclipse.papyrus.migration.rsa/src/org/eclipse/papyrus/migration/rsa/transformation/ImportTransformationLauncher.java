/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.transformation;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;
import org.eclipse.papyrus.infra.emf.resource.DependencyManagementHelper;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.GMFUnsafe;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.papyrus.migration.rsa.transformation.ui.URIMappingDialog;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Executes a batch of {@link ImportTransformation}s, then restores the dependencies (References)
 * between each other
 *
 * @author Camille Letavernier
 *
 */
public class ImportTransformationLauncher {

	protected final Config config;

	protected final Control baseControl;

	public ImportTransformationLauncher(Config config) {
		this(config, null);
	}

	public ImportTransformationLauncher(Config config, Control baseControl) {
		this.config = config;
		this.baseControl = baseControl;
	}

	/**
	 * Executes the transformation (Asynchronous)
	 *
	 * @param urisToImport
	 */
	public void run(List<URI> urisToImport) {
		List<ImportTransformation> transformations = new LinkedList<ImportTransformation>();

		for (URI uri : urisToImport) {
			ImportTransformation transformation = new ImportTransformation(uri, config);
			transformations.add(transformation);
		}

		if (transformations.size() > 1) {
			importModelDependencies(transformations);
		} else if (!transformations.isEmpty()) {
			transformations.get(0).run(true); // TODO URI Mappings
		}
	}

	protected void importModelDependencies(final List<ImportTransformation> transformations) {
		Job importDependencies = new Job("Import Models") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				return ImportTransformationLauncher.this.run(monitor, transformations);
			}

		};

		importDependencies.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {

				MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, IStatus.OK, "", null);

				multiStatus.merge(event.getResult());

				for (ImportTransformation transformation : transformations) {
					multiStatus.merge(transformation.getStatus());
				}

				int severity = multiStatus.getSeverity();
				String message;

				switch (severity) {
				case IStatus.OK:
					message = "The selected models have been successfully imported";
					break;
				case IStatus.CANCEL:
					message = "Operation canceled";
					break;
				case IStatus.WARNING:
					message = "The selected models have been imported; some warnings have been reported";
					break;
				default:
					message = "Some errors occurred during model import";
					break;
				}


				handle(new MultiStatus(Activator.PLUGIN_ID, severity, multiStatus.getChildren(), message, null));
			}

			protected void handle(final IStatus status) {
				if (status.getSeverity() == IStatus.OK) {
					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
							MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Import models", status.getMessage());
						}
					});

				} else if (status.getSeverity() == IStatus.CANCEL) {
					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
							MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Import models", status.getMessage());
						}
					});
				} else {
					StatusManager.getManager().handle(status, StatusManager.BLOCK);
				}
			}
		});

		importDependencies.setUser(true);
		importDependencies.schedule();
	}

	protected IStatus run(IProgressMonitor monitor, List<ImportTransformation> transformations) {
		monitor.setTaskName("Waiting for import tasks to complete...");
		int numTasks = transformations.size() * 2; // For each transformation: wait for completion, then handle dependencies
		monitor.beginTask("Importing Models...", numTasks);

		boolean runAsUserJob = transformations.size() == 1;

		int maxThreads = Math.max(1, config.getMaxThreads());

		List<ImportTransformation> remainingTransformations = new LinkedList<ImportTransformation>(transformations);
		List<ImportTransformation> runningTransformations = new LinkedList<ImportTransformation>();

		// Iterate on transformations
		// Schedule maximum MAX_THREADS transformations at the same time (At least 1)
		// When a transformation is complete, keep going. Otherwise, sleep
		while (!remainingTransformations.isEmpty()) {
			if (monitor.isCanceled()) {
				monitor.subTask("Canceling remaining jobs...");
				for (ImportTransformation transformation : runningTransformations) {
					transformation.cancel();
				}
				remainingTransformations.clear(); // Don't start these transformations at all
				// Keep waiting: the cancel operation is asynchronous, we still need to wait for the jobs to complete
			}

			// Schedule transformations if we have enough threads and they have not all been scheduled
			while (runningTransformations.size() < maxThreads && !remainingTransformations.isEmpty()) {
				ImportTransformation transformation = remainingTransformations.remove(0); // Get and remove
				transformation.run(runAsUserJob);
				runningTransformations.add(transformation);
			}

			if (!runningTransformations.isEmpty()) {
				String waitFor = runningTransformations.get(0).getModelName();
				monitor.subTask("Waiting for " + waitFor + " to complete...");
			}

			// We can continue if at least one transformation is complete (Leaving a free Thread)
			boolean canContinue = false;

			Iterator<ImportTransformation> iterator = runningTransformations.iterator();
			while (iterator.hasNext()) {
				ImportTransformation runningTransformation = iterator.next();
				if (runningTransformation.isComplete()) {
					canContinue = true;
					iterator.remove();
					monitor.worked(1);
				}
			}

			if (!canContinue) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					Activator.log.error(ex);
				}
			}
		}

		// All transformations have been scheduled (But not necessarily completed): wait for all of them to complete
		wait(runningTransformations, monitor);

		if (monitor.isCanceled()) {
			return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Operation canceled");
		}

		handleModelDependencies(transformations, monitor);

		return Status.OK_STATUS;
	}

	// Wait for all (remaining) import transformations to complete
	protected void wait(List<ImportTransformation> transformations, IProgressMonitor monitor) {

		// Transformations still running
		List<ImportTransformation> runningTransformations = new LinkedList<ImportTransformation>(transformations);

		while (!runningTransformations.isEmpty()) {

			if (monitor.isCanceled()) {
				monitor.subTask("Canceling remaining jobs...");
				for (ImportTransformation transformation : runningTransformations) {
					transformation.cancel();
				}
				// Keep waiting: the cancel operation is asynchronous, we still need to wait for the jobs to complete
			}

			Iterator<ImportTransformation> iterator = runningTransformations.iterator();
			while (iterator.hasNext()) {
				ImportTransformation transformation = iterator.next();
				if (transformation.isComplete()) {
					iterator.remove();
					monitor.worked(1);
				}
			}

			if (!runningTransformations.isEmpty()) {
				String waitFor = runningTransformations.get(0).getModelName();
				monitor.subTask("Waiting for " + waitFor + " to complete...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					Activator.log.error(ex);
					return;
				}
			}
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

		filterKnownMappings(config.getMappingParameters(), urisToReplace);

		if (!config.getMappingParameters().getUriMappings().isEmpty()) {
			MappingParameters parameters = confirmURIMappings(config.getMappingParameters());
			config.setMappingParameters(parameters);

			// Include the user-defined URI mappings
			for (URIMapping mapping : parameters.getUriMappings()) {

				String source = mapping.getSourceURI();
				String target = mapping.getTargetURI();

				if (source != null && target != null && !source.trim().isEmpty() && !target.trim().isEmpty()) {

					URI sourceURI = URI.createURI(mapping.getSourceURI());
					URI targetURI = URI.createURI(mapping.getTargetURI());

					if (urisToReplace.containsKey(sourceURI)) {
						continue;
					}

					urisToReplace.put(sourceURI, targetURI);
				}
			}
		}


		for (ImportTransformation transformation : transformations) {

			if (monitor.isCanceled()) {
				return;
			}

			monitor.subTask("Importing dependencies for " + transformation.getModelName());
			final ModelSet modelSet = new DiResourceSet();
			try {
				URI targetURI = transformation.getTargetURI();
				if (targetURI == null) {
					// The transformation didn't complete properly
					monitor.worked(1);
					continue;
				}
				modelSet.loadModels(transformation.getTargetURI());
			} catch (ModelMultiException e) {
				Activator.log.error(e);
				monitor.worked(1);
				continue;
			}
			final TransactionalEditingDomain domain = modelSet.getTransactionalEditingDomain();

			for (final Map.Entry<URI, URI> entry : urisToReplace.entrySet()) {
				if (monitor.isCanceled()) {
					return;
				}

				if (entry.getKey().equals(entry.getValue())) {
					continue;
				}

				domain.getCommandStack().execute(new AbstractCommand("Import dependencies") {

					@Override
					public void execute() {
						DependencyManagementHelper.updateDependencies(entry.getKey(), entry.getValue(), modelSet, domain);
					}

					@Override
					public void redo() {
						// Nothing
					}

					@Override
					protected boolean prepare() {
						return true;
					};
				});

			}

			try {
				modelSet.save(new NullProgressMonitor());
				monitor.worked(1);

				EcoreUtil.resolveAll(modelSet); // Resolve all before unload to ensure all proxies are cleaned up in the CacheAdapter
				GMFUnsafe.write(domain, new Runnable() {
					@Override
					public void run() {
						EMFHelper.unload(modelSet);
					}
				});

				domain.dispose();

			} catch (IOException ex) {
				Activator.log.error(ex);
				continue;
			} catch (RollbackException ex) {
				Activator.log.error(ex);
				continue;
			} catch (InterruptedException ex) {
				Activator.log.error(ex);
				continue;
			}
		}
	}

	/**
	 * Remove automatic mappings (When multiple files are imported simultaneously) and duplicates
	 *
	 * @param mappingParameters
	 *            All unresolved proxies
	 * @param currentMappings
	 *            The map of known (automatic) mappings
	 */
	protected void filterKnownMappings(final MappingParameters mappingParameters, final Map<URI, URI> currentMappings) {

		Set<URI> userMappings = new HashSet<URI>();

		Iterator<URIMapping> mappings = mappingParameters.getUriMappings().iterator();
		while (mappings.hasNext()) {
			URIMapping mapping = mappings.next();
			URI sourceURI = URI.createURI(mapping.getSourceURI());
			if (currentMappings.containsKey(sourceURI) || userMappings.contains(sourceURI)) {
				mappings.remove();
			} else {
				userMappings.add(sourceURI);
			}
		}

	}

	protected MappingParameters confirmURIMappings(final MappingParameters mappingParameters) {
		if (config.isAlwaysAcceptSuggestedMappings()) {
			return mappingParameters;
		}

		final AtomicReference<MappingParameters> newParameters = new AtomicReference<MappingParameters>(mappingParameters);

		if (baseControl != null && !baseControl.isDisposed()) {
			baseControl.getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					newParameters.set(openMappingsDialog(mappingParameters));
				}
			});
		}

		return newParameters.get();
	}

	protected MappingParameters openMappingsDialog(final MappingParameters mappingParameters) {
		final Shell shell = baseControl.getShell();

		SelectionDialog dialog = new URIMappingDialog(shell, mappingParameters);

		dialog.open();
		return (MappingParameters) dialog.getResult()[0];
	}
}
