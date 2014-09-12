/*******************************************************************************
 * Copyright (c) 2011, 2014 Mia-Software, CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366567 - [Releng] Tool to update rmaps
 *     Camille Letavernier (CEA LIST) - camille.letavernier@cea.fr - Generalize to handle POMs
 *     Christian W. Damus (CEA) - Add support for updating Oomph setup models
 *     
 *******************************************************************************/
package org.eclipse.papyrus.releng.tools.internal.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.releng.tools.internal.Activator;
import org.eclipse.papyrus.releng.tools.internal.Messages;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;


public abstract class AbstractDependencyHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Shell activeShell = HandlerUtil.getActiveShell(event);
		try {
			if(selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection)selection;
				Object selected = structuredSelection.getFirstElement();
				if(selected instanceof IFile) {
					IFile file = (IFile)selected;
					List<IFile> aggregationBuildFiles = findAggregationBuildFiles();
					IFile aggregationBuildFile = chooseAggregationBuildFile(aggregationBuildFiles, activeShell);
					if(aggregationBuildFile != null) {
						updateFile(file, aggregationBuildFile, activeShell);
					}
				}
			}
		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error", e)); //$NON-NLS-1$
			MessageDialog.openError(activeShell, Messages.UpdateRMapAction_error, e.getLocalizedMessage());
		}

		return null;
	}

	protected static List<IFile> findAggregationBuildFiles() throws CoreException {
		List<IFile> aggregationBuildFiles = new ArrayList<IFile>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for(IProject project : projects) {
			if(!project.isOpen()) {
				continue;
			}
			IResource[] members = project.members();
			for(IResource resource : members) {
				if(resource.getType() == IResource.FILE && resource.getName().endsWith(".b3aggr")) { //$NON-NLS-1$
					aggregationBuildFiles.add((IFile)resource);
				}
			}
		}
		return aggregationBuildFiles;
	}

	protected static IFile chooseAggregationBuildFile(final List<IFile> aggregationBuildFiles, Shell activeShell) {
		if(aggregationBuildFiles.size() == 0) {
			MessageDialog.openWarning(activeShell, Messages.UpdateRMapAction_noBuildModelFound, Messages.UpdateRMapAction_noBuildModelFoundLong);
			return null;
		}
		LabelProvider labelProvider = new LabelProvider() {

			@Override
			public String getText(final Object element) {
				if(element instanceof IFile) {
					IFile file = (IFile)element;
					return file.getProject().getName() + "/" + file.getName(); //$NON-NLS-1$
				}
				return super.getText(element);
			}
		};

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(activeShell, labelProvider);
		dialog.setTitle(Messages.UpdateRMapAction_chooseBuildModel);
		dialog.setMessage(Messages.UpdateRMapAction_chooseBuildModelLong);
		dialog.setElements(aggregationBuildFiles.toArray());
		dialog.open();
		return (IFile)dialog.getFirstResult();
	}

	protected abstract void updateFile(IFile selectedFile, IFile aggregationBuildFile, Shell activeShell) throws CoreException;

}
