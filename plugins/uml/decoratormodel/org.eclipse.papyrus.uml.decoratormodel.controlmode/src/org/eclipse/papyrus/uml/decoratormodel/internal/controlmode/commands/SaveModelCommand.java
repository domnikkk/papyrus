/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * A command that asynchronously saves the model editor after completion of the (un)control operation,
 * if it completes normally.
 */
class SaveModelCommand extends AbstractCommand {
	private final ModelSet modelSet;

	private volatile boolean savePending;

	SaveModelCommand(PackageRefactoringContext context) {
		super(Messages.SaveModelCommand_0);

		this.modelSet = (ModelSet) context.getEditingDomain().getResourceSet();
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		if (savePending) {
			// We are being invoked to roll back the composite operation that failed in some later command,
			// so cancel the pending async exec
			savePending = false;
			return CommandResult.newOKCommandResult();
		}

		// We now have a save operation pending (asynchronously)
		savePending = true;

		// Do this asynchronously because we need the current transaction to have finished first,
		// otherwise the command-stack (and hence the editor) will be marked dirty when it commits.
		// Moreover, because undo also needs to save and this is the last command in the composite,
		// it will actually undo first, which would save then save first if synchronous
		Activator.getDefault().getExecutorService().execute(new Runnable() {

			@Override
			public void run() {
				if (!savePending) {
					// The execute/undo/redo was rolled back, so don't go through with save.
					return;
				}
				savePending = false;

				try {
					// Prefer to save the editor so that it doesn't spuriously prompt for reloading
					// resources saved without its knowledge. Of course, there may not be an editor
					IRunnableWithProgress save = new IRunnableWithProgress() {

						@Override
						public void run(IProgressMonitor monitor) throws InvocationTargetException {
							try {
								IEditorPart editor = findEditor(modelSet);
								if (editor != null) {
									save(editor);
								} else {
									modelSet.save(monitor);
								}
							} catch (IOException e) {
								throw new InvocationTargetException(e);
							}
						}
					};

					if (Display.getCurrent() != null) {
						Activator.getActiveWorkbenchWindow().run(false, false, save);
					} else {
						save.run(new NullProgressMonitor());
					}
				} catch (InvocationTargetException e) {
					IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, Messages.SaveModelCommand_1, e.getTargetException());
					StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.SHOW);
				} catch (InterruptedException e) {
					IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, Messages.SaveModelCommand_2, e);
					StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.SHOW);
				}
			}
		});

		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		// On Undo we also need to save changes to ensure consistency
		return doExecuteWithResult(progressMonitor, info);
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		// On Redo we also need to save changes to ensure consistency
		return doExecuteWithResult(progressMonitor, info);
	}

	static IEditorPart findEditor(ModelSet modelSet) {
		IEditorPart result = null;

		try {
			IMultiDiagramEditor editor = ServiceUtilsForResourceSet.getInstance().getService(IMultiDiagramEditor.class, modelSet);
			if (editor instanceof IEditorPart) {
				result = editor;
			}
		} catch (ServiceException e) {
			// Obviously this isn't our editor if the service registry doesn't have an editor
		}

		return result;
	}

	static void save(IEditorPart editor) {
		editor.getSite().getPage().saveEditor(editor, false);
	}
}
