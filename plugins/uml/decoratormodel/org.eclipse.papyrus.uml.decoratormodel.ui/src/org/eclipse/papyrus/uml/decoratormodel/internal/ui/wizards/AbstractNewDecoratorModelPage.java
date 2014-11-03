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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * @author damus
 *
 */
public abstract class AbstractNewDecoratorModelPage<I, P> extends AbstractProfileApplicationSelectionPage<I, P> {
	private static final String FILE_EXTENSION_SETTING = "fileExtension"; //$NON-NLS-1$

	private Text resourceText;

	private Text modelNameText;

	private String modelName;

	public AbstractNewDecoratorModelPage(String name, String title, ImageDescriptor icon, Class<P> elementType) {
		super(name, title, icon, elementType);

		setMessage(Messages.AbstractNewDecoratorModelPage_0);
	}

	@Override
	protected int getLayoutColumnCount() {
		return 3;
	}

	@Override
	protected void createAdditionalContents(Composite mainArea) {
		lead(label(mainArea, Messages.AbstractNewDecoratorModelPage_1), 15);
		resourceText = new Text(mainArea, SWT.SINGLE | SWT.BORDER);
		lead(fill(resourceText, true, false), 15);
		resourceText.setText(defaultResource(getInput()));
		resourceText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				validatePage();
			}
		});

		Button browse = lead(button(mainArea, Messages.AbstractNewDecoratorModelPage_2), 15);
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browseResource();
			}
		});

		label(mainArea, Messages.AbstractNewDecoratorModelPage_3);
		modelNameText = new Text(mainArea, SWT.SINGLE | SWT.BORDER);
		span(fill(modelNameText, true, false), 2);
		modelName = defaultModelName(getInput());
		modelNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				// Don't capture changes while disabled so that we can restore the user's text
				if (modelNameText.isEnabled()) {
					modelName = modelNameText.getText();
					validatePage();
				}
			}
		});
	}

	public URI getResourceURI() {
		String resourcePath = resourceText.getText().trim();
		return (resourcePath.length() > 0) ? URI.createPlatformResourceURI(resourcePath, true) : null;
	}

	protected String defaultModelName(I input) {
		return Messages.AbstractNewDecoratorModelPage_4;
	}

	public String getModelName() {
		return modelNameText.getText();
	}

	protected abstract void browseResource();

	protected void browseResource(String title, String message) {
		IFile file = WorkspaceResourceDialog.openNewFile(getShell(), title, message, new Path(resourceText.getText().trim()), null);
		if (file != null) {
			resourceText.setText(file.getFullPath().toString());
		}
	}

	@Override
	protected void validatePage() {
		setErrorMessage(null);

		URI resourceURI = getResourceURI();
		if (resourceURI == null) {
			setPageComplete(false);
		} else if (!resourceURI.isPlatformResource()) {
			setErrorMessage(Messages.AbstractNewDecoratorModelPage_5);
			setPageComplete(false);
		} else {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
			IContainer container = file.getParent();

			if (!container.exists()) {
				setErrorMessage(NLS.bind(Messages.AbstractNewDecoratorModelPage_6, container.getFullPath().toString()));
				setPageComplete(false);
			} else if (!UmlModel.UML_FILE_EXTENSION.equals(resourceURI.fileExtension())) {
				setErrorMessage(NLS.bind(Messages.AbstractNewDecoratorModelPage_7, UmlModel.UML_FILE_EXTENSION));
				setPageComplete(false);
			} else {
				if (file.exists()) {
					modelNameText.setEnabled(false);

					String message = validateExistingFile(file);
					if (message != null) {
						setErrorMessage(message);
						setPageComplete(false);
					} else if (!DecoratorModelUtils.isDecoratorModel(getResourceURI())) {
						setErrorMessage(Messages.AbstractNewDecoratorModelPage_8);
						setPageComplete(false);
					} else {
						try {
							modelNameText.setText(DecoratorModelIndex.getInstance().getDecoratorModelName(getResourceURI()));
						} catch (CoreException e) {
							Activator.getDefault().getLog().log(e.getStatus());
							StatusManager.getManager().handle(e.getStatus(), StatusManager.SHOW);
						}
						super.validatePage();
					}
				} else {
					// Restore the user's input
					if (!modelNameText.getText().equals(modelName)) {
						modelNameText.setText(modelName);
					}
					modelNameText.setEnabled(true);
					super.validatePage();
				}
			}
		}
	}

	protected String validateExistingFile(IFile file) {
		return null;
	}

	protected String getFileExtension() {
		String result = getDialogSettings().get(FILE_EXTENSION_SETTING);
		if (result == null) {
			result = "profileapp.uml"; //$NON-NLS-1$
		}
		return result;
	}

	void saveSettings() {
		URI uri = getResourceURI();
		if (uri != null) {
			String fileExtension = uri.fileExtension();
			uri = uri.trimFileExtension();

			while (uri.fileExtension() != null) {
				fileExtension = String.format("%s.%s", uri.fileExtension(), fileExtension); //$NON-NLS-1$
				uri = uri.trimFileExtension();
			}

			getDialogSettings().put(FILE_EXTENSION_SETTING, fileExtension);
		}
	}

	protected abstract String defaultResource(I input);
}
