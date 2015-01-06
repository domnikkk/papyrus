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
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Executes a batch of {@link ImportTransformation}s, then restores the dependencies (References)
 * between each other
 *
 * @author Camille Letavernier
 *
 */
public class ImportTransformationLauncher {

	// Nano to Second
	protected final static long SECOND = 1000 * 1000 * 1000;

	protected final Config config;

	protected final Control baseControl;

	/**
	 * Own execution time, in nano-seconds. Doesn't take individual transformation's exec
	 * time into account. Also ignores the time when Blocking user Dialogs are opened
	 */
	protected long ownExecutionTime;

	/**
	 * Own loading time (For initial model loading)
	 */
	protected long ownLoadingTime;

	/**
	 * Total time for all invidivual transformations to complete. Since they are executed in parallel,
	 * this may be different from their cumulated execution time (Unless a single thread is used)
	 */
	protected long transformationsExecutionTime = 0L;

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

		// Always use the batch launcher, even if there is only 1 transformation (Bug 455012)
		importModelDependencies(transformations);
	}

	protected void importModelDependencies(final List<ImportTransformation> transformations) {
		Job importDependencies = new Job("Import Models") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				IStatus result = ImportTransformationLauncher.this.run(monitor, transformations);

				long totalLoadingTime = 0L;
				long totalTransformationTime = 0L;
				for (ImportTransformation transformation : transformations) {
					totalTransformationTime += transformation.getExecutionTime();
					totalLoadingTime += transformation.getLoadingTime();
				}

				int nbThreads = config.getMaxThreads();
				System.out.println("--- First phase (0-50%) / Multi-threaded (" + nbThreads + ")---");
				System.out.println("Cumulated Transformation Time: " + timeFormat(totalTransformationTime));
				System.out.println("Total Transformation Time: " + timeFormat(transformationsExecutionTime));
				System.out.println("Cumulated Loading Time: " + timeFormat(totalLoadingTime));

				System.out.println("--- Second phase (50-100%) / Single-threaded ---");
				System.out.println("Total Loading Time: " + timeFormat(ownLoadingTime));
				System.out.println("Total Fix Dependencies Time: " + timeFormat(ownExecutionTime));

				System.out.println("--- Total ---");
				System.out.println("Cumulated Total time: " + timeFormat(ownExecutionTime + totalTransformationTime));
				System.out.println("Total time: " + timeFormat(ownExecutionTime + transformationsExecutionTime));

				return result;
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

	protected String timeFormat(long nano) {
		long seconds = nano / SECOND;
		return String.format("%d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));
	}

	protected IStatus run(IProgressMonitor monitor, List<ImportTransformation> transformations) {

		long begin = System.nanoTime();

		monitor.setTaskName("Waiting for import tasks to complete...");
		int numTasks = transformations.size() * 2; // For each transformation: wait for completion, then handle dependencies
		monitor.beginTask("Importing Models...", numTasks);

		boolean runAsUserJob = false; // Never show individual progress-bar for transformations (Bug 455012)

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
				monitor.subTask("Waiting for Import " + waitFor + " to complete...");
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

		long end = System.nanoTime();
		transformationsExecutionTime = end - begin;

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

		long begin = System.nanoTime();

		long timeToIgnore = 0L;


		Map<URI, URI> urisToReplace = new HashMap<URI, URI>();
		Map<URI, URI> profileUrisToReplace = new HashMap<URI, URI>();

		for (ImportTransformation transformation : transformations) {
			for (Map.Entry<URI, URI> mapping : transformation.getURIMappings().entrySet()) {
				URI sourceURI = mapping.getKey();
				URI targetURI = mapping.getValue();
				if ("emx".equals(sourceURI.fileExtension()) || "efx".equals(sourceURI.fileExtension())) {
					urisToReplace.put(sourceURI, targetURI);
				}
			}
			urisToReplace.putAll(transformation.getURIMappings());
			profileUrisToReplace.putAll(transformation.getProfileURIMappings());
		}

		filterKnownMappings(config.getMappingParameters(), urisToReplace, profileUrisToReplace);

		if (!config.getMappingParameters().getUriMappings().isEmpty() || !config.getMappingParameters().getProfileUriMappings().isEmpty()) {

			long beginDialog = System.nanoTime();
			MappingParameters parameters = confirmURIMappings(config.getMappingParameters());
			long endDialog = System.nanoTime();
			timeToIgnore = endDialog - beginDialog;

			config.setMappingParameters(parameters);

			// Include the user-defined URI mappings
			populateURIMap(parameters.getUriMappings(), urisToReplace);
			populateURIMap(parameters.getProfileUriMappings(), profileUrisToReplace);
		}

		for (ImportTransformation transformation : transformations) {

			if (monitor.isCanceled()) {
				return;
			}

			try {

				monitor.subTask("Importing dependencies for " + transformation.getModelName());
				final ModelSet modelSet = new DiResourceSet();
				UMLUtil.init(modelSet);

				final Collection<Resource> resourcesToRepair;
				try {
					URI targetURI = transformation.getTargetURI();
					if (targetURI == null) {
						// The transformation didn't complete properly
						monitor.worked(1);
						continue;
					}

					long startLoading = System.nanoTime();
					modelSet.loadModels(transformation.getTargetURI());
					resourcesToRepair = resolveOwnResources(modelSet);
					long endLoading = System.nanoTime();
					ownLoadingTime += endLoading - startLoading;
				} catch (ModelMultiException e) {
					Activator.log.error(e);
					monitor.worked(1);
					continue;
				}

				repairProxies(modelSet, resourcesToRepair, urisToReplace, monitor); // Repairing proxies first will change the Applied Profiles. This helps repairing stereotypes

				RepairStereotypes repairStereotypesAction = new RepairStereotypes(modelSet, profileUrisToReplace);
				repairStereotypesAction.execute();

				try {

					for (Resource resource : resourcesToRepair) {
						resource.save(null);
					}
					monitor.worked(1);

					final TransactionalEditingDomain domain = modelSet.getTransactionalEditingDomain();

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
			} catch (Exception ex) {
				Activator.log.error(ex);
				continue;
			}
		}

		long end = System.nanoTime();

		ownExecutionTime = end - begin - timeToIgnore;
	}

	protected Collection<Resource> resolveOwnResources(ModelSet modelSet) {
		UmlModel umlModel = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		if (umlModel == null) {
			return Collections.emptySet();
		}

		// Iterate on the main resource's contents (Including fragments).
		// The ModelSet will take care of loading any associated resource (notation, di)

		Resource mainResource = umlModel.getResource();
		if (mainResource == null) {
			return Collections.emptySet();
		}

		Iterator<EObject> contents = mainResource.getAllContents();
		while (contents.hasNext()) {
			contents.next();
		}

		Set<Resource> resourcesToRepair = new HashSet<Resource>();
		for (Resource resource : modelSet.getResources()) {
			if (modelSet.isUserModelResource(resource.getURI())) {
				resourcesToRepair.add(resource);
			}
		}
		return resourcesToRepair;
	}

	protected void repairProxies(final ModelSet modelSet, final Collection<Resource> resourcesToRepair, Map<URI, URI> urisToReplace, IProgressMonitor monitor) {

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
					DependencyManagementHelper.updateDependencies(entry.getKey(), entry.getValue(), resourcesToRepair, domain);
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
	}

	/**
	 * Convert and add all the URIMappings into the URI Map
	 *
	 * @param mappings
	 * @param uriMap
	 */
	protected static void populateURIMap(List<URIMapping> mappings, Map<URI, URI> uriMap) {
		for (URIMapping mapping : mappings) {
			if (mapping == null) {
				continue;
			}
			String source = mapping.getSourceURI();
			String target = mapping.getTargetURI();

			if (source != null && target != null && !source.trim().isEmpty() && !target.trim().isEmpty()) {

				URI sourceURI = URI.createURI(mapping.getSourceURI());
				URI targetURI = URI.createURI(mapping.getTargetURI());

				if (uriMap.containsKey(sourceURI)) {
					continue;
				}

				uriMap.put(sourceURI, targetURI);
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
	protected void filterKnownMappings(final MappingParameters mappingParameters, final Map<URI, URI> currentMappings, final Map<URI, URI> currentProfileMappings) {
		filterKnownMappings(mappingParameters.getUriMappings(), currentMappings);
		filterKnownMappings(mappingParameters.getProfileUriMappings(), currentProfileMappings);
	}

	protected void filterKnownMappings(List<URIMapping> allMappings, Map<URI, URI> knownMappings) {

		Set<URI> userMappings = new HashSet<URI>();

		Iterator<URIMapping> mappings = allMappings.iterator();
		while (mappings.hasNext()) {
			URIMapping mapping = mappings.next();
			if (mapping == null) {
				continue;
			}
			URI sourceURI = URI.createURI(mapping.getSourceURI());
			if (knownMappings.containsKey(sourceURI) || userMappings.contains(sourceURI)) {
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
