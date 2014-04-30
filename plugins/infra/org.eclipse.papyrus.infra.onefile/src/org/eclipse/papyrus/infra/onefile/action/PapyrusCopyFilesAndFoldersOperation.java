/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.onefile.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.emf.resource.DependencyManagementHelper;
import org.eclipse.papyrus.infra.emf.resource.MoveFileURIReplacementStrategy;
import org.eclipse.papyrus.infra.emf.resource.RestoreDependencyHelper;
import org.eclipse.papyrus.infra.emf.utils.ResourceUtils;
import org.eclipse.papyrus.infra.onefile.Activator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.undo.CopyResourcesOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;



/**
 * Implementation of Papyrus paste for model
 */
public class PapyrusCopyFilesAndFoldersOperation extends CopyFilesAndFoldersOperation {

	protected Map<String, String> renameMapping = new HashMap<String, String>();

	protected IPath[] destinationPaths = null;

	public PapyrusCopyFilesAndFoldersOperation(Shell shell) {
		super(shell);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.onefile.action.CopyFilesAndFoldersOperation#performCopyWithAutoRename(org.eclipse.core.resources.IResource[],
	 * org.eclipse.core.runtime.IPath, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	// perform rename only for .di	
	protected boolean performCopyWithAutoRename(IResource[] resources, IPath destination, IProgressMonitor monitor) {
		IWorkspace workspace = resources[0].getWorkspace();
		destinationPaths = new IPath[resources.length];
		try {
			String oldName = ""; //$NON-NLS-1$
			String newName = ""; //$NON-NLS-1$
			for(int i = 0; i < resources.length; i++) {
				IResource source = resources[i];
				destinationPaths[i] = destination.append(source.getName());
				IPath relativSourcePath = source.getFullPath();
				String sourceFileName = relativSourcePath.removeFileExtension().lastSegment();
				if(sourceFileName.equals(oldName)) {
					String fileExtension = relativSourcePath.getFileExtension();
					destinationPaths[i] = relativSourcePath.removeLastSegments(1).append(newName).addFileExtension(fileExtension);
				} else {
					oldName = sourceFileName;
					if(workspace.getRoot().exists(destinationPaths[i]) && destinationPaths[i].getFileExtension().equals(DiModel.MODEL_FILE_EXTENSION)) {
						destinationPaths[i] = getNewNameFor(destinationPaths[i], workspace);
						newName = destinationPaths[i].removeFileExtension().lastSegment();
					}
					renameMapping.put(oldName, newName);
				}

			}
			CopyResourcesOperation op = new CopyResourcesOperation(resources, destinationPaths, IDEWorkbenchMessages.CopyFilesAndFoldersOperation_copyTitle);
			op.setModelProviderIds(getModelProviderIds());
			PlatformUI.getWorkbench().getOperationSupport().getOperationHistory().execute(op, monitor, WorkspaceUndoUtil.getUIInfoAdapter(messageShell));
		} catch (ExecutionException e) {
			if(e.getCause() instanceof CoreException) {
				recordError((CoreException)e.getCause());
			} else {
				IDEWorkbenchPlugin.log(e.getMessage(), e);
				displayError(e.getMessage());
			}
			return false;
		}
		return true;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.onefile.action.CopyFilesAndFoldersOperation#performCopy(org.eclipse.core.resources.IResource[],
	 * org.eclipse.core.runtime.IPath, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	// store path of created files
	protected boolean performCopy(IResource[] resources, IPath destination, IProgressMonitor monitor) {
		boolean performCopy = super.performCopy(resources, destination, monitor);
		if(performCopy) {
			destinationPaths = new IPath[resources.length];
			for(int i = 0; i < resources.length; i++) {
				String name = resources[i].getName();
				destinationPaths[i] = destination.append(name);
			}
		}
		return performCopy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.onefile.action.CopyFilesAndFoldersOperation#copyResources(org.eclipse.core.resources.IResource[],
	 * org.eclipse.core.resources.IContainer)
	 */
	@Override
	// restore internal and external link coherence
	public IResource[] copyResources(IResource[] resources, IContainer destination) {
		IResource[] copyResources = super.copyResources(resources, destination);
		try {
			ModelSet modelSet = new ModelSet();	
			restoreInternalLinks(modelSet, resources, copyResources);
			restoreExternalLinks(modelSet, resources, copyResources);
		} catch (IOException e) {
			Activator.log.error("It was not possible to restore broken links", e); //$NON-NLS-1$
		}
		return copyResources;
	}


	/**
	 * Restore referenced URI following the pattern ; 
	 * 	- if there is an accessible Resource use it 
	 *  - else search the resource in the source location of the copy
	 * @param resources
	 * @param copyResources
	 * @throws IOException
	 */
	protected void restoreExternalLinks(ModelSet modelSet, IResource[] resources, IResource[] copyResources) throws IOException {
		for(int i = 0; i < destinationPaths.length; i++) {
			IPath iPath = destinationPaths[i];
			URI uri = URI.createPlatformResourceURI(iPath.toString(), Boolean.TRUE);
			Resource resource = modelSet.getResource(uri, Boolean.TRUE);
			for(int j = 0; j < copyResources.length; j++) {
				IPath targetPath = destinationPaths[j];
				IResource sourceResource = copyResources[j];
				URI targetURI = URI.createPlatformResourceURI(targetPath.toString(), true);
				URI sourceURI = URI.createPlatformResourceURI(sourceResource.getFullPath().toString(), true);
				DependencyManagementHelper.updateDependencies(sourceURI, targetURI, resource);
			}
			resource.save(ResourceUtils.getSaveOptions());
		}
	}

	/**
	 * Restore links to maintain coherence in the 3 files: uml-notation-di
	 * @param resources
	 * @param copyResources
	 * @throws IOException
	 */
	protected void restoreInternalLinks(ModelSet modelSet, IResource[] resources, IResource[] copyResources) throws IOException {
		for(int i = 0; i < destinationPaths.length; i++) {
			IPath iPath = destinationPaths[i];
			MoveFileURIReplacementStrategy iURIReplacementStrategy = new MoveFileURIReplacementStrategy(new HashMap<URI, URI>(), resources[i].getFullPath().removeLastSegments(1), iPath.removeLastSegments(1));
			RestoreDependencyHelper restoreDependencyHelper = new RestoreDependencyHelper(iURIReplacementStrategy);
			URI uri = URI.createPlatformResourceURI(iPath.toString(), Boolean.TRUE);
			Resource resource = modelSet.getResource(uri, Boolean.TRUE);
			restoreDependencyHelper.restoreDependencies(resource);
			resource.save(ResourceUtils.getSaveOptions());
		}
	}
	
}
