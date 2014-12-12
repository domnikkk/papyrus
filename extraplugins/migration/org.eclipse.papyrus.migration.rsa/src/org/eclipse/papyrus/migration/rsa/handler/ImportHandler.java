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

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.transformation.ConfigHelper;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.papyrus.views.properties.creation.PropertyEditorFactory;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;


public class ImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection == null || selection.isEmpty()) {
			return null;
		}

		Set<IFile> filesToImport = new HashSet<IFile>();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> selectionIterator = structuredSelection.iterator();
			while (selectionIterator.hasNext()) {
				Object selectedElement = selectionIterator.next();
				if (selectedElement instanceof IAdaptable) {
					IFile selectedFile = (IFile) ((IAdaptable) selectedElement).getAdapter(IFile.class);
					if (selectedFile == null) {
						continue;
					}

					// EFX files can be selected (Makes it easier to select a set of files),
					// but they will be imported by their parent model
					String fileExtension = selectedFile.getFileExtension();
					if ("epx".equals(fileExtension) || "emx".equals(fileExtension)) { //$NON-NLS-1$ //$NON-NLS-2$
						filesToImport.add(selectedFile);
					}
				}
			}
		}

		if (filesToImport.isEmpty()) {
			Activator.log.warn("The selection doesn't contain any *.epx nor *.emx file");
		} else {
			importFiles(filesToImport, event);
		}

		return null;
	}

	public void importFiles(Set<IFile> selectedFiles, ExecutionEvent event) {
		Config config = getTransformationParameters(event);

		if (config == null) {
			return;
		}

		List<URI> urisToImport = new LinkedList<URI>();

		for (IFile selectedFile : selectedFiles) {
			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

			urisToImport.add(uri);
		}

		// The Event's control is (or may be) a Context Menu, which will be disposed soon: retrieve its own parent instead (The main Window), if it has one.
		Control baseControl = HandlerUtil.getActiveShell(event);
		if (baseControl != null && !baseControl.isDisposed() && baseControl.getParent() != null) {
			baseControl = baseControl.getParent();
		}

		// On some platforms, it seems that the ActiveShell (Context Menu) may already be disposed (Bug 455011). Use the Active Workbench Window directly
		if (baseControl == null || baseControl.isDisposed()) {
			baseControl = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		}

		ImportTransformationLauncher launcher = new ImportTransformationLauncher(config, baseControl);
		launcher.run(urisToImport);
	}

	public Config getTransformationParameters(ExecutionEvent event) {
		ConfigHelper helper = new ConfigHelper();

		Config config = helper.getConfig();

		Shell activeShell = HandlerUtil.getActiveShell(event);

		final AtomicBoolean okPressed = new AtomicBoolean(true);
		PropertyEditorFactory factory = new PropertyEditorFactory() {
			@Override
			public String getEditionDialogTitle(Object objectToEdit) {
				return "Transformation parameters";
			}

			@Override
			protected void handleEditCancelled(Control widget, Object source) {
				okPressed.set(false);
				super.handleEditCancelled(widget, source);
			}
		};

		Object result = factory.edit(activeShell, config);

		if (!okPressed.get()) {
			return null;
		}

		// Result can be null, the source config, or a new config
		if (result instanceof Config) {
			config = (Config) result;
		}

		return config;
	}



}
