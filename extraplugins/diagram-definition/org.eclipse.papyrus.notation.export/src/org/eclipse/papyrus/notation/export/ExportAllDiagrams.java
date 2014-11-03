/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.notation.export;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.infra.onefile.model.PapyrusModelHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.statushandlers.StatusManager;

public class ExportAllDiagrams {

	private IFile file;

	/**
	 * Constructor
	 * 
	 * @param file
	 *            the *.*di file where the diagrams are stored, can be null if
	 *            you use export method with diagrams in parameter
	 */
	public ExportAllDiagrams(IFile file) {
		this.file = file;
	}

	/**
	 * Run the export of all diagrams of a *.di file
	 */
	public void export() {
		final IRunnableWithProgress op = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
				if (monitor == null)
					monitor = new NullProgressMonitor();
				export(monitor);
			}

		};
		Job job = new Job(Messages.ExportAllDiagrams_0) {
			@Override
			public IStatus run(IProgressMonitor monitor) {
				try {
					op.run(monitor);
				} catch (InvocationTargetException e) {
					Activator.getDefault().log(e);
				} catch (InterruptedException e) {
					Activator.getDefault().log(e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();

	}

	/**
	 * Export all diagrams of the IFile
	 * 
	 * @param newMonitor
	 */
	private void export(IProgressMonitor newMonitor) {
		// Then iterates on all the diagrams and export them one by one
		newMonitor.beginTask(Messages.ExportAllDiagrams_1, 10);
		newMonitor.subTask(Messages.ExportAllDiagrams_2);
		if (file != null) {
			final ResourceSetImpl resourceSet = new ResourceSetImpl();
			TransactionalEditingDomain editingDomain = null;
			try {
				resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
				resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);

				IPapyrusFile logical = PapyrusModelHelper.getPapyrusModelFactory().createIPapyrusFile(file);
				if (logical != null) {
					for (IResource component : logical.getAssociatedResources()) {
						if (component.getType() == IResource.FILE) {
							resourceSet.getResource(URI.createPlatformResourceURI(component.getFullPath().toString(), true), true);
						}
					}
				}

				// create transactional editing domain
				editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);

				AbstractTransactionalCommand com = new AbstractTransactionalCommand(editingDomain, "Resolve", Collections.emptyList()) {
					@Override
					protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						EcoreUtil.resolveAll(resourceSet);
						return null;
					}
				};

				// bypass all the transaction/validate/notification mechanisms, it is a lot faster and it has no impact
				// since we do not modify the model
				CommandStack commandStack = editingDomain.getCommandStack();
				if (commandStack instanceof TransactionalCommandStack) {
					TransactionalCommandStack stack = (TransactionalCommandStack) commandStack;
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(Transaction.OPTION_NO_NOTIFICATIONS, Boolean.TRUE);
					options.put(Transaction.OPTION_NO_UNDO, Boolean.TRUE);
					options.put(Transaction.OPTION_UNPROTECTED, Boolean.TRUE);
					options.put(Transaction.OPTION_IS_UNDO_REDO_TRANSACTION, Boolean.FALSE);
					options.put(Transaction.OPTION_NO_TRIGGERS, Boolean.TRUE);
					options.put(Transaction.OPTION_VALIDATE_EDIT, Boolean.FALSE);
					options.put(Transaction.OPTION_VALIDATE_EDIT_CONTEXT, Boolean.FALSE);
					try {
						stack.execute(new GMFtoEMFCommandWrapper(com), options);
					} catch (InterruptedException e) {
					} catch (RollbackException e) {
					}
				} else {
					Activator.getDefault().log("no transactional editing domain found");
				}

				List<Diagram> diagrams = new ArrayList<Diagram>();
				if (newMonitor.isCanceled()) {
					return;
				}
				for (Iterator<Notifier> i = resourceSet.getAllContents(); i.hasNext();) {
					Notifier n = i.next();
					if (n instanceof Diagram) {
						diagrams.add((Diagram) n);
					}
				}
				if (newMonitor.isCanceled()) {
					return;
				}
				newMonitor.worked(1);
				export(new SubProgressMonitor(newMonitor, 9), diagrams);
			} finally {
				// Unload the resource set so that we don't leak loads of UML content in the CacheAdapter
				unload(resourceSet);
				if (editingDomain != null) {
					editingDomain.dispose();
				}
			}
		} else {
			Activator.getDefault().log(Messages.ExportAllDiagrams_3);
		}

	}

	private void unload(ResourceSet resourceSet) {
		for (Resource next : resourceSet.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
	}

	private void export(IProgressMonitor newMonitor, List<Diagram> diagrams) {
		newMonitor.beginTask(Messages.ExportAllDiagrams_4, 10);

		final IStatus status = exportDiagrams(new SubProgressMonitor(newMonitor, 9), diagrams);
		if (status != Status.OK_STATUS) {
			Activator.getDefault().getLog().log(status);
			StatusManager.getManager().handle(status, StatusManager.BLOCK);
		} else {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					MessageDialog.openInformation(Activator.getActiveWorkbenchShell(), Messages.ExportAllDiagrams_5, Messages.ExportAllDiagrams_5);
				}
			});
		}

	}

	/**
	 * Browse all the diagrams and export them
	 * 
	 * @param newMonitor
	 * @param findAllDiagrams
	 * @return
	 */
	private IStatus exportDiagrams(final IProgressMonitor newMonitor, List<Diagram> diagrams) {
		final ModelExtent input = new BasicModelExtent(diagrams);
		final ModelExtent output = new BasicModelExtent();

		final ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		URI transformationURI = URI.createURI("platform:/plugin/org.eclipse.papyrus.notation2umldi/transforms/NotationToUmlDi.qvto");
		final TransformationExecutor executor = new TransformationExecutor(transformationURI);

		final ExecutionDiagnostic result[] = new ExecutionDiagnostic[1];
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				result[0] = executor.execute(context, input, output);
			}
		});

		if (result[0] != null && result[0].getSeverity() != Diagnostic.OK)
			return BasicDiagnostic.toIStatus(result[0]);

		try {
			List<EObject> outObjects = output.getContents();
			ResourceSet outResourceSet = new ResourceSetImpl();
			Resource outResource = outResourceSet
					.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true)
							.trimFileExtension()
							.appendFileExtension("umldi"));
			outResource.getContents().addAll(outObjects);
			outResource.save(Collections.emptyMap());
			return Status.OK_STATUS;
		} catch (IOException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
		}
	}

}
