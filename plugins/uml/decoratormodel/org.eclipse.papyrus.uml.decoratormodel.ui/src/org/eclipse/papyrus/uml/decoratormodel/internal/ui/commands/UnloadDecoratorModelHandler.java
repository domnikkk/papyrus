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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.commands;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.AbstractCommand.NonDirtying;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.tools.utils.CustomUMLUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/**
 * Command handler for the "Unload Profile Applications" command.
 */
public class UnloadDecoratorModelHandler extends AbstractHandler {

	public UnloadDecoratorModelHandler() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = HandlerUtil.getActiveMenuSelectionChecked(event);

		ResourceSet resourceSet = null;
		final Set<Resource> toUnload = Sets.newHashSet();
		if (selection instanceof IStructuredSelection) {
			for (Object next : ((IStructuredSelection) selection).toList()) {
				EObject eObject = EMFHelper.getEObject(next);
				if (eObject instanceof Package) {
					Resource resource = eObject.eResource();
					toUnload.add(resource);
					resourceSet = resource.getResourceSet();
				}
			}
		}

		if (resourceSet != null) {
			unloadResources(window, resourceSet, toUnload);
		}

		return null;
	}

	public static void unloadResources(IWorkbenchWindow uiContext, ResourceSet resourceSet, final Iterable<? extends Resource> resources) throws ExecutionException {
		// Check for resources that need to be saved
		final SaveHandler save = getSaveHandler(resourceSet);
		boolean needSave = save.isSaveNeeded(resources);
		if (needSave) {
			if (!confirmSave(uiContext.getShell())) {
				// Bail if user refused to save
				return;
			}

			try {
				uiContext.run(true, false, new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException {
						try {
							save.save(resources, monitor);
						} catch (IOException e) {
							throw new InvocationTargetException(e);
						}
					}
				});
			} catch (InterruptedException e) {
				throw new ExecutionException(Messages.UnloadDecoratorModelHandler_0, e);
			} catch (InvocationTargetException e) {
				throw new ExecutionException(Messages.UnloadDecoratorModelHandler_1, e.getTargetException());
			}
		}

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resourceSet);
		if (domain != null) {
			class UnloadCommand extends AbstractCommand implements NonDirtying {
				UnloadCommand() {
					super(Messages.UnloadDecoratorModelHandler_2);
				}

				@Override
				protected boolean prepare() {
					return true;
				}

				@Override
				public void execute() {
					for (Resource next : resources) {
						// Destroy the contents of the resource to effect unapplication of stereotypes
						CustomUMLUtil.destroyAll(next.getContents());

						next.unload();
						next.getResourceSet().getResources().remove(next);
						next.eAdapters().clear();
					}
				}

				/**
				 * Unloading resources breaks undo/redo of any previous commands that involved their
				 * contents.
				 * 
				 * @return {@code false}, always
				 */
				@Override
				public boolean canUndo() {
					return false;
				}

				@Override
				public void redo() {
					throw new IllegalStateException("command was not undone"); //$NON-NLS-1$
				}
			}

			domain.getCommandStack().execute(new UnloadCommand());
		}
	}

	static SaveHandler getSaveHandler(ResourceSet resourceSet) {
		return (resourceSet instanceof ModelSet) ? new ModelSetSaveHandlerImpl((ModelSet) resourceSet) : new SaveHandlerImpl(resourceSet);
	}

	static boolean confirmSave(Shell parentShell) {
		return MessageDialog.openConfirm(parentShell, Messages.UnloadDecoratorModelHandler_2, Messages.UnloadDecoratorModelHandler_3);
	}

	//
	// Nested types
	//

	interface SaveHandler {
		boolean isSaveNeeded(Iterable<? extends Resource> resources);

		void save(Iterable<? extends Resource> resources, IProgressMonitor monitor) throws IOException;
	}

	static class SaveHandlerImpl implements SaveHandler {
		private final ResourceSet resourceSet;

		SaveHandlerImpl(ResourceSet resourceSet) {
			this.resourceSet = resourceSet;
		}

		@Override
		public boolean isSaveNeeded(Iterable<? extends Resource> resources) {
			boolean result = false;
			boolean trackingModification = true;

			for (Resource next : resources) {
				if (!next.isTrackingModification()) {
					// Can't trust this method
					result = false;
					trackingModification = false;
					break;
				}

				if (next.isModified()) {
					result = true;
					break;
				}
			}

			if (!result && !trackingModification) {
				// Check command stack, if any
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(resourceSet);
				if ((domain != null) && (domain.getCommandStack() instanceof BasicCommandStack)) {
					result = ((BasicCommandStack) domain.getCommandStack()).isSaveNeeded();
				} else {
					// Asssume that save will be needed
					result = true;
				}
			}

			return result;
		}

		@Override
		public void save(Iterable<? extends Resource> resources, IProgressMonitor monitor) throws IOException {
			SubMonitor sub = SubMonitor.convert(monitor, Messages.UnloadDecoratorModelHandler_4, Iterables.size(resources));

			for (Resource next : resources) {
				next.save(null);
				sub.worked(1);
			}

			sub.done();
		}
	}

	static class ModelSetSaveHandlerImpl implements SaveHandler {
		private final ModelSet modelSet;

		ModelSetSaveHandlerImpl(ModelSet modelSet) {
			this.modelSet = modelSet;
		}

		@Override
		public boolean isSaveNeeded(Iterable<? extends Resource> resources) {
			boolean result = false;

			for (Resource next : resources) {
				if (modelSet.shouldSave(next)) {
					result = true;
					break;
				}
			}

			return result;
		}

		@Override
		public void save(Iterable<? extends Resource> resources, IProgressMonitor monitor) throws IOException {
			// First, try to find the open editor
			IMultiDiagramEditor editor = null;

			try {
				editor = ServiceUtilsForResourceSet.getInstance().getService(IMultiDiagramEditor.class, modelSet);
			} catch (ServiceException e) {
				// OK, there's no editor. That's fine
			}

			if (editor != null) {
				editor.doSave(monitor);
			} else {
				// Just save the model set for consistency
				modelSet.save(monitor);
			}
		}
	}
}
