/*******************************************************************************
 * Copyright (c) 2007, 2014 Anyware Technologies, CEA, and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Jacques Lescot (Anyware Technologies) - initial API and implementation
 * Thibault Landre (Atos Origin) - refactor to extract the exportAllDiagram from ExportAllDiagramsAction
 * Alexia Allanic (Atos Origin) - Add margin to not truncate images
 * Anass Radouani (AtoS) - add use GMF exporting tool and remove manual extraction
 * Christian W. Damus (CEA) - bug 431411
 * Christian W. Damus (CEA) - bug 410346
 * Gabriel Pascual (ALL4TEC) - Bug 440754
 *
 ******************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.export.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.infra.core.editor.DiSashModelManagerServiceFactory;
import org.eclipse.papyrus.infra.core.editor.ModelSetServiceFactory;
import org.eclipse.papyrus.infra.core.editor.PageMngrServiceFactory;
import org.eclipse.papyrus.infra.core.resource.EditingDomainServiceFactory;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ModelsReader;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.service.ILocalPageService;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.DiSashModelManager;
import org.eclipse.papyrus.infra.core.services.ServiceDescriptor;
import org.eclipse.papyrus.infra.core.services.ServiceDescriptor.ServiceTypeKind;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServiceMultiException;
import org.eclipse.papyrus.infra.core.services.ServiceStartKind;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.gmfdiag.css.service.CssMarkerEventManagerService;
import org.eclipse.papyrus.infra.gmfdiag.css.service.MarkerToPseudoSelectorMappingService;
import org.eclipse.papyrus.infra.gmfdiag.export.Activator;
import org.eclipse.papyrus.infra.gmfdiag.export.actions.ExportAllDiagramsParameter;
import org.eclipse.papyrus.infra.gmfdiag.export.messages.Messages;
import org.eclipse.papyrus.infra.services.decoration.DecorationService;
import org.eclipse.papyrus.infra.services.markerlistener.MarkersMonitorService;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.views.validation.internal.ValidationMarkersService;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


/**
 * Engine to export all diagrams to images.
 */
public class ExportAllDiagramsEngine {

	/** The workbench window. */
	private IWorkbenchWindow workbenchWindow;

	/** The display renaming information. */
	private boolean displayRenamingInformation;

	/** The use display runnable. */
	private static boolean useDisplayRunnable = true;


	/** The diagnostic. */
	private BasicDiagnostic diagnostic = null;

	/** The has duplicates. */
	private boolean hasDuplicates = false;

	/** The export parameter. */
	private ExportAllDiagramsParameter exportParameter = null;


	/**
	 * Constructor.
	 *
	 */
	public ExportAllDiagramsEngine() {
		try {
			this.workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		} catch (IllegalStateException e) {
			this.workbenchWindow = null;
			// is normal in batch mode
		}
	}


	/**
	 * Initialise.
	 *
	 * @param parameter
	 *            the parameter
	 */
	public void initialise(ExportAllDiagramsParameter parameter) {
		diagnostic = new BasicDiagnostic(Diagnostic.OK, "", 0, Messages.ExportAllDiagrams_18, null);
		displayRenamingInformation = true;
		exportParameter = parameter;


	}

	/**
	 * Run the export of all diagrams of a *.*di file into images in the given
	 * format.
	 */
	public void exportDiagramsToImages() {

		Job job = new WorkspaceJob(Messages.ExportAllDiagrams_0) {


			/**
			 * @see org.eclipse.core.resources.WorkspaceJob#runInWorkspace(org.eclipse.core.runtime.IProgressMonitor)
			 *
			 * @param monitor
			 * @return
			 * @throws CoreException
			 */
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {

				if (monitor == null) {
					monitor = new NullProgressMonitor();
				}

				IProgressMonitor newMonitor = monitor;

				return export(newMonitor);

			}
		};

		job.setUser(true);
		job.schedule();

	}

	/**
	 * Export all diagrams of the IFile.
	 *
	 * @param newMonitor
	 *            the new monitor
	 * @return
	 */
	private IStatus export(IProgressMonitor newMonitor) {
		IStatus status = Status.OK_STATUS;

		// Then iterates on all the diagrams and export them one by one
		newMonitor.beginTask(Messages.ExportAllDiagrams_1, 10);
		newMonitor.subTask(Messages.ExportAllDiagrams_2);

		if (exportParameter != null) {
			ModelSet modelSet = exportParameter.getModelSet();
			try {

				// Step 1 : Get a Model set
				if (modelSet == null) {
					modelSet = initialiseModelSet();

					if (diagnostic.getSeverity() != Diagnostic.OK || newMonitor.isCanceled()) {
						return handleDiagnosticStatus();
					}

					// Step 2 : Initialise necessary service registry
					initialiseServiceRegistry(modelSet);
					if (diagnostic.getSeverity() != Diagnostic.OK || newMonitor.isCanceled()) {
						return handleDiagnosticStatus();
					}
				}




				// Get pages manager from service registry
				IPageManager pageManager = null;
				try {
					pageManager = ServiceUtilsForResourceSet.getInstance().getIPageManager(modelSet);
				} catch (ServiceException e) {
					Activator.log.error(e);
				}

				if (diagnostic.getSeverity() != Diagnostic.OK || newMonitor.isCanceled()) {
					return handleDiagnosticStatus();
				}

				// Step 3 : Get all diagram
				ILocalPageService service = new ExportDiagramLocalPageService(UmlUtils.getUmlResource(modelSet).getContents().get(0));
				List<Object> pagesList = pageManager.allLocalPages(service);
				List<Diagram> diagrams = new ArrayList<Diagram>();


				for (Object page : pagesList) {

					if (page instanceof Diagram) {
						diagrams.add((Diagram) page);
					}
				}

				if (newMonitor.isCanceled()) {
					return handleDiagnosticStatus();
				}
				newMonitor.worked(1);

				// Step 4 : Export each diagram
				export(new SubProgressMonitor(newMonitor, 9), diagrams);

			} finally {

				if (exportParameter.getModelSet() == null) {
					// Unload the resource set so that we don't leak loads of UML content in the CacheAdapter
					modelSet.unload();
				}

			}
		} else {
			status = new Status(Status.ERROR, Activator.PLUGIN_ID, Messages.ExportAllDiagrams_17);
		}


		return status;

	}

	/**
	 * Handle diagnostic status.
	 *
	 * @return the corresponding status
	 */
	private IStatus handleDiagnosticStatus() {
		diagnostic.recomputeSeverity();
		return BasicDiagnostic.toIStatus(diagnostic);
	}

	/**
	 * Create Models set from selected file.
	 *
	 * @return the model set
	 */
	private ModelSet initialiseModelSet() {
		ServicesRegistry service = new ServicesRegistry();

		// Add service factory for Model Set
		ServiceDescriptor descriptor = new ServiceDescriptor(ModelSet.class, ModelSetServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10);
		descriptor.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		service.add(descriptor);

		// Add factory for editing domain
		descriptor = new ServiceDescriptor(TransactionalEditingDomain.class, EditingDomainServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10, Collections.singletonList(ModelSet.class.getName()));
		descriptor.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		service.add(descriptor);

		try {
			service.startRegistry();
		} catch (ServiceMultiException e) {
			Activator.log.error(e);
		}

		ModelSet modelSet = null;
		try {
			modelSet = ServiceUtils.getInstance().getModelSet(service);
		} catch (ServiceException e) {
			// Ignore service exception
		}

		// Instantiate a Model set
		if (modelSet == null) {
			modelSet = new ModelSet();
			try {
				ModelSetServiceFactory.setServiceRegistry(modelSet, service);
			} catch (ServiceException e) {
				// Ignore service exception
			}
		}



		// Read all Model from selected file
		ModelsReader modelsReader = new ModelsReader();
		modelsReader.readModel(modelSet);
		try {
			modelSet.loadModels(exportParameter.getDiFileUri());
		} catch (ModelMultiException e) {
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR, Activator.PLUGIN_ID, 0, Messages.ExportAllDiagrams_3, new Object[] { e });
		}

		// Initialise an editing domain
		modelSet.getTransactionalEditingDomain();

		return modelSet;
	}

	/**
	 * Initialise service registry.
	 *
	 * @param modelSet
	 *            the model set
	 */
	private void initialiseServiceRegistry(ModelSet modelSet) {

		ServicesRegistry service = ModelSetServiceFactory.getServiceRegistry(modelSet);

		try {

			if (service == null) {
				service = new ServicesRegistry();
				addModelSetServices(modelSet, service);
				service.startRegistry();
			}

			addCSSServices(service);
			service.startRegistry();

			addModelerServices(service);
			service.startRegistry();

		} catch (ServiceException e) {
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR, Activator.PLUGIN_ID, 0, "Failed to load models", new Object[] { e });
		}




	}


	/**
	 * Adds the model set services.
	 *
	 * @param modelSet
	 *            the model set
	 * @param service
	 *            the service
	 */
	private void addModelSetServices(ModelSet modelSet, ServicesRegistry service) {
		service.add(ModelSet.class, 10, modelSet);
		ServiceDescriptor descriptor = new ServiceDescriptor(TransactionalEditingDomain.class, EditingDomainServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10, Collections.singletonList(ModelSet.class.getName()));
		descriptor.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		service.add(descriptor);
	}


	/**
	 * Adds the modeler services.
	 *
	 * @param service
	 *            the service
	 */
	private void addModelerServices(ServicesRegistry service) {

		// Di model services
		ServiceDescriptor descriptor = new ServiceDescriptor(DiSashModelManager.class, DiSashModelManagerServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10, Collections.singletonList(TransactionalEditingDomain.class.getName()));
		descriptor.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		service.add(descriptor);

		// Page Manager services
		descriptor = new ServiceDescriptor(IPageManager.class, PageMngrServiceFactory.class.getName(), ServiceStartKind.STARTUP, 10, Collections.singletonList(DiSashModelManager.class.getName()));
		descriptor.setServiceTypeKind(ServiceTypeKind.serviceFactory);
		service.add(descriptor);



	}


	/**
	 * Adds the css services.
	 *
	 * @param service
	 *            the service
	 */
	private void addCSSServices(ServicesRegistry service) {

		service.add(MarkersMonitorService.class, 10, new MarkersMonitorService());
		service.add(CssMarkerEventManagerService.class, 10, new CssMarkerEventManagerService());
		service.add(MarkerToPseudoSelectorMappingService.class, 10, new MarkerToPseudoSelectorMappingService());
		service.add(ValidationMarkersService.class, 10, new ValidationMarkersService());
		service.add(DecorationService.class, 10, new DecorationService());


	}

	/**
	 * export all the diagrams in image.
	 *
	 * @param newMonitor
	 *            , the monitor
	 * @param diagrams
	 *            , the emf element diagrams
	 */
	public void export(IProgressMonitor newMonitor, List<Diagram> diagrams) {

		// Initialise duplicates flag
		setHaveDuplicates(false);

		int tasksAmount = 9;
		if (exportParameter.getModelSet() == null) {
			tasksAmount++;
		}
		newMonitor.beginTask(Messages.ExportAllDiagrams_4, tasksAmount);

		// Create file associate to all diagram
		createDiagramFiles(new SubProgressMonitor(newMonitor, 9), diagrams);

		// If the model set is already loaded in Papyrus, unload must be skipped
		if (exportParameter.getModelSet() == null) {
			unloadResources(new SubProgressMonitor(newMonitor, 1), diagrams);
		}

		// Alert the user that file names have been changed to avoid duplicates
		if (haveDuplicates() && displayRenamingInformation) {

			final String message = Messages.ExportAllDiagrams_5;
			if (workbenchWindow != null && workbenchWindow.getShell() != null) {

				BasicDiagnostic newDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, "", 0, message, null); //$NON-NLS-1$
				diagnostic.add(newDiagnostic);

			} else {
				Activator.log.info(message);
			}

		}

		handleExportDiagnostic();

	}


	/**
	 * Handle export diagnostic.
	 */
	private void handleExportDiagnostic() {
		int severity = diagnostic.recomputeSeverity();

		if (severity == Diagnostic.ERROR) {
			BasicDiagnostic oldDiagnostic = diagnostic;
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR, "", 0, Messages.ExportAllDiagrams_22, null); //$NON-NLS-1$
			diagnostic.addAll(oldDiagnostic);
		} else if (severity == Diagnostic.WARNING) {
			BasicDiagnostic oldDiagnostic = diagnostic;
			diagnostic = new BasicDiagnostic(Diagnostic.WARNING, "", 0, Messages.ExportAllDiagrams_24, null); //$NON-NLS-1$
			diagnostic.addAll(oldDiagnostic);
		}

		// Display dialog to validate export
		if (workbenchWindow != null && workbenchWindow.getShell() != null) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (diagnostic.getSeverity() == Diagnostic.OK) {
						MessageDialog.openInformation(Activator.getActiveWorkbenchShell(), Messages.ExportAllDiagrams_25, Messages.ExportAllDiagrams_26 + exportParameter.getOutputDirectoryPath());
					} else {
						DiagnosticDialog.open(Activator.getActiveWorkbenchShell(), Messages.ExportAllDiagrams_27, "", diagnostic); //$NON-NLS-1$
					}
				}
			});
		}

	}

	/**
	 * Browse all the diagrams and export them.
	 *
	 * @param newMonitor
	 *            the new monitor
	 * @param diagrams
	 *            the diagrams
	 * @return true, if there is no duplicates
	 */
	private void createDiagramFiles(final IProgressMonitor newMonitor, List<Diagram> diagrams) {

		try {

			List<String> diagramNames = new ArrayList<String>();

			try {
				newMonitor.beginTask(Messages.ExportAllDiagrams_7, diagrams.size());

				for (final Diagram diagram : diagrams) {

					// Verify if export was cancelled
					if (newMonitor.isCanceled()) {
						break;
					}


					String uniqueFileName = handleFileName(diagram, diagramNames);

					final String finalUniqueFileName = uniqueFileName;
					diagramNames.add(uniqueFileName);
					newMonitor.subTask(uniqueFileName);
					if (useDisplayRunnable) {
						Display.getDefault().syncExec(new Runnable() {

							@Override
							public void run() {
								exportDiagram(finalUniqueFileName, diagram, newMonitor);
							}
						});
					} else {
						exportDiagram(uniqueFileName, diagram, newMonitor);
					}

					newMonitor.worked(1);
				}
			} catch (SWTError e) {
				String message = Messages.ExportAllDiagrams_9;
				Activator.log.error(message, new Exception(message, e));
			}
		} catch (Exception e) {
			Activator.log.error(e);
		}
	}



	/**
	 * Handle file name.
	 *
	 * @param diagram
	 *            the diagram
	 * @param diagramNames
	 * @param duplicates
	 * @return the string
	 */
	private String handleFileName(Diagram diagram, List<String> diagramNames) {
		boolean nameCut = false;

		// Extract name of diagram
		String label = ""; //$NON-NLS-1$
		if (exportParameter.isQualifiedName()) {
			ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

			try {
				IItemLabelProvider itemLabelFactory = (IItemLabelProvider) composedAdapterFactory.adapt(diagram.getElement(), IItemLabelProvider.class);
				label = itemLabelFactory.getText(diagram.getElement()).replace(Messages.ExportAllDiagrams_16, "") + "_"; //$NON-NLS-1$//$NON-NLS-2$
			} finally {
				// Don't leak the adapters created by this factory
				composedAdapterFactory.dispose();
			}
		}

		String uniqueFileName = encodeFileName(label + diagram.getName());

		// Verify file name length
		if (uniqueFileName.length() > 150) {
			nameCut = true;
			uniqueFileName = uniqueFileName.substring(0, 150);
		}

		// Detect duplicated diagram name
		if (diagramNames.contains(uniqueFileName)) {
			setHaveDuplicates(true);
			uniqueFileName = getFirstAvailableName(uniqueFileName, diagramNames, 1);
		}

		// Add warning about cut name in export diagnostic
		if (nameCut) {
			BasicDiagnostic newDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, "", 0, Messages.ExportAllDiagrams_10 + uniqueFileName, null); //$NON-NLS-1$
			diagnostic.add(newDiagnostic);
		}

		return uniqueFileName;



	}


	/**
	 * Sets the have duplicates.
	 *
	 * @param duplicates
	 *            the new have duplicates
	 */
	private void setHaveDuplicates(boolean duplicates) {
		hasDuplicates = duplicates;
	}

	/**
	 * Have duplicates.
	 *
	 * @return true, if successful
	 */
	private boolean haveDuplicates() {
		return hasDuplicates;
	}

	/**
	 * Export diagram.
	 *
	 * @param uniqueFileName
	 *            the unique file name
	 * @param diagram
	 *            the diagram
	 * @param newMonitor
	 *            the new monitor
	 */
	private void exportDiagram(String uniqueFileName, Diagram diagram, IProgressMonitor newMonitor) {
		CopyToImageUtil copyImageUtil = new CopyToImageUtil();

		// Build path of image
		IPath imagePath = new Path(exportParameter.getOutputDirectoryPath() + File.separator + uniqueFileName);
		imagePath = imagePath.addFileExtension(exportParameter.getExportFormat().getName());

		try {
			copyImageUtil.copyToImage(diagram, imagePath, exportParameter.getExportFormat(), new SubProgressMonitor(newMonitor, 1), PreferencesHint.USE_DEFAULTS);
		} catch (Throwable e) {
			BasicDiagnostic newDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, "", 0, String.format(Messages.ExportAllDiagrams_11, uniqueFileName, diagram.eResource().getURI().toString()), null); //$NON-NLS-1$
			diagnostic.add(newDiagnostic);
			String errorMessage = String.format(Messages.ExportAllDiagrams_11, uniqueFileName, diagram.eResource().getURI().toString());
			Activator.log.error(errorMessage, e);
		}
	}

	/**
	 * Unload resources.
	 *
	 * @param newMonitor
	 *            the new monitor
	 * @param diagrams
	 *            the diagrams
	 */
	public void unloadResources(IProgressMonitor newMonitor, List<Diagram> diagrams) {
		if (newMonitor == null) {
			newMonitor = new NullProgressMonitor();
		}
		newMonitor.subTask(Messages.ExportAllDiagrams_12);
		if (diagrams != null && !diagrams.isEmpty()) {
			ResourceSet diagramResourceSet = diagrams.get(0).eResource().getResourceSet();

			newMonitor.beginTask(Messages.ExportAllDiagrams_13, diagramResourceSet.getResources().size());
			for (int i = diagramResourceSet.getResources().size() - 1; i >= 0; i--) {
				try {
					Resource resource = diagramResourceSet.getResources().get(i);
					if (resource.isLoaded()) {
						resource.unload();
					}
				} catch (Exception e) {
					// not very clean but it sometimes occurs
				}
				newMonitor.worked(1);
			}
		}

	}

	/**
	 * Escape all characters that may result in a wrong file name.
	 *
	 * @param pathName
	 *            a file name to encode
	 * @return The encoded file name
	 */
	private String encodeFileName(String pathName) {
		pathName = pathName.trim();
		pathName = pathName.replaceAll(Messages.ExportAllDiagrams_14, Messages.ExportAllDiagrams_15);
		pathName = pathName.replaceAll("_-_", "-"); //$NON-NLS-1$ //$NON-NLS-2$
		while (pathName.contains("__")) { //$NON-NLS-1$
			pathName = pathName.replaceAll("__", "_"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (pathName.startsWith("_")) { //$NON-NLS-1$
			pathName = pathName.replaceFirst("_", ""); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (pathName.endsWith("_")) { //$NON-NLS-1$
			pathName = pathName.substring(0, pathName.length() - 1);
		}

		return pathName;
		// return URLEncoder.encode(pathName, "UTF-8").replaceAll("[*]", "_");
	}

	/**
	 * Gets the first available name.
	 *
	 * @param commonBasis
	 *            the common basis
	 * @param existingNames
	 *            the existing names
	 * @param cpt
	 *            the cpt
	 * @return the first available name
	 */
	private String getFirstAvailableName(String commonBasis, List<String> existingNames, int cpt) {
		if (existingNames.contains(commonBasis + cpt)) {
			return getFirstAvailableName(commonBasis, existingNames, cpt + 1);
		}
		return commonBasis + cpt;
	}

}
