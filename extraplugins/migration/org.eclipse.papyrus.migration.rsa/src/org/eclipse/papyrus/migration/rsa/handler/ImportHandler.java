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

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformation;
import org.eclipse.ui.handlers.HandlerUtil;


public class ImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if(selection == null || selection.isEmpty()) {
			return null;
		}

		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Iterator<?> selectionIterator = structuredSelection.iterator();
			while(selectionIterator.hasNext()) {
				Object selectedElement = selectionIterator.next();
				if(selectedElement instanceof IAdaptable) {
					IFile selectedFile = (IFile)((IAdaptable)selectedElement).getAdapter(IFile.class);
					if(selectedFile == null) {
						Activator.log.warn("Element %s is not an IFile");
						continue;
					}

					importFile(selectedFile); //TODO: If more than one model is selected, import them along with their links (Instead of parallel import with link resolution in a second step)
				}
			}
		}

		return null;
	}

	public void importFile(IFile selectedFile) {
		URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

		ImportTransformation transformation = new ImportTransformation(uri);
		transformation.run();
	}




}
