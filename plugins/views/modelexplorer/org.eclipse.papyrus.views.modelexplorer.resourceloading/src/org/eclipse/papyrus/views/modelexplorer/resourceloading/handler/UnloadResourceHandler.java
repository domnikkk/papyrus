/*****************************************************************************
 * Copyright (c) 2011, 2014 Atos, CEA, and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Hemery (Atos) vincent.hemery@atos.net - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 415639
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.resourceloading.handler;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.AbstractCommand.NonDirtying;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.SashModelUtils;
import org.eclipse.papyrus.infra.services.resourceloading.util.LoadingUtils;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;
import org.eclipse.papyrus.views.modelexplorer.resourceloading.Activator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Handler for the load resource action.
 * This actions load a resource in the model set, which is not yet loaded (due to resource loading strategy).
 */
public class UnloadResourceHandler extends AbstractCommandHandler {


	/**
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 * @return the command
	 */
	@Override
	protected Command getCommand() {
		TransactionalEditingDomain editingDomain = getEditingDomain();
		List<EObject> selection = getSelectedElements();
		if(editingDomain != null && editingDomain.getResourceSet() instanceof ModelSet && selection.size() > 0) {
			final ModelSet set = (ModelSet)editingDomain.getResourceSet();

			class NonDirtyingCompound extends CompoundCommand implements NonDirtying {
				// Empty
			}
			CompoundCommand command = new NonDirtyingCompound();

			final IEditorPart editor = getEditor();
			SaveIfNecessaryCommand save = null;
			if(editor.isDirty()) {
				// First, a command to save if necessary
				save = new SaveIfNecessaryCommand(editor);
				command.append(save);
			}

			List<URI> handledURI = new ArrayList<URI>();
			// ensure main URI is never unloaded
			URI mainURI = SashModelUtils.getSashModel(set).getResourceURI().trimFileExtension();
			handledURI.add(mainURI);
			for(EObject sel : selection) {
				if(!sel.eIsProxy()) {
					final Resource resource = sel.eResource();
					final URI uriTrim = resource.getURI().trimFileExtension();
					if(!handledURI.contains(uriTrim)) {
						handledURI.add(uriTrim);

						if((save != null) && set.shouldSave(resource)) {
							save.setNeedsSave(true);
						}

						class UnloadCommand extends AbstractCommand implements NonDirtying {

							public void redo() {
								LoadingUtils.unloadResourcesFromModelSet(set, uriTrim);
							}

							public void execute() {
								redo();
							}

							@Override
							public boolean canExecute() {
								return true;
							}
						};
						command.append(new UnloadCommand());
					}
				}
			}
			return command;
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * Get currently opened editor
	 * 
	 * @return editor
	 */
	protected IEditorPart getEditor() {
		IEditorPart editor = null;
		IWorkbenchWindow activeWorkbenchWindow = getActiveWorkbenchWindow();
		if(activeWorkbenchWindow != null) {
			IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
			if(activePage != null) {
				editor = activePage.getActiveEditor();
			}
		}
		return editor;
	}

	/**
	 * Get the active workbench window
	 * 
	 * @return window
	 */
	protected IWorkbenchWindow getActiveWorkbenchWindow() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if(workbench != null) {
			return workbench.getActiveWorkbenchWindow();
		}
		return null;
	}

	private static class SaveIfNecessaryCommand extends AbstractCommand implements NonDirtying {

		private final IEditorPart editor;

		private boolean needsSave;

		SaveIfNecessaryCommand(IEditorPart editor) {
			super();

			this.editor = editor;
		}

		@Override
		protected boolean prepare() {
			return true;
		}

		void setNeedsSave(boolean needsSave) {
			this.needsSave = needsSave;
		}

		boolean needsSave() {
			return needsSave;
		}

		public void execute() {
			if(needsSave()) {
				if(promptToSave()) {
					save();
				} else {
					// Safely cancel the entire composite
					throw new OperationCanceledException();
				}
			}
		}

		@Override
		public void undo() {
			// Pass
		}

		public void redo() {
			// Pass
		}

		boolean promptToSave() {
			final Shell parent = editor.getEditorSite().getShell();
			final int yesIndex = 0;
			MessageDialog dlg = new MessageDialog(parent, Messages.UnloadResourceHandler_0, null, Messages.UnloadResourceHandler_1, MessageDialog.WARNING, new String[]{ IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL }, yesIndex);
			return dlg.open() == yesIndex;
		}

		void save() {
			IProgressService progress = (IProgressService)editor.getSite().getService(IProgressService.class);

			try {
				progress.busyCursorWhile(new IRunnableWithProgress() {

					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						editor.doSave(monitor);
					}
				});
			} catch (Exception e) {
				StatusAdapter status = new StatusAdapter(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.UnloadResourceHandler_2));
				status.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY, System.currentTimeMillis());
				status.setProperty(IStatusAdapterConstants.TITLE_PROPERTY, Messages.UnloadResourceHandler_3);
				StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.SHOW);
			}
		}
	}
}
