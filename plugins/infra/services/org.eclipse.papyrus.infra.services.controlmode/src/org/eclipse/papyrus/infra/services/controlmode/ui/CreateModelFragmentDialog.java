/*******************************************************************************
 * Copyright (c) 2006 Anyware Technologies. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *    Jacques Lescot (Anyware Technologies) - Initial API and implementation
 *    Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436947
 ******************************************************************************/
package org.eclipse.papyrus.infra.services.controlmode.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog that will ask the user the target URI for th new resource holding the new controlled element
 *
 * @author adaussy
 *
 */
public class CreateModelFragmentDialog extends ResourceDialog {

	/** The Constant DIALOG_TITLE. */
	private static final String DIALOG_TITLE = "Submodel Resource";

	private URI uri;

	private Resource currentResource;

	private String defaultName;

	/**
	 * The constructor
	 *
	 * @param parent
	 * @param theDomain
	 * @param theCurrentResource
	 * @param defaultName
	 */
	public CreateModelFragmentDialog(Shell parent, Resource theCurrentResource, String defaultName) {
		super(parent, DIALOG_TITLE, SWT.SAVE); //$NON-NLS-1$
		this.currentResource = theCurrentResource;
		this.defaultName = defaultName;
	}

	@Override
	protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton) {
		browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				IFile file = null;
				String path = URI.createURI(computeDefaultURI()).lastSegment();
				file = WorkspaceResourceDialog.openNewFile(getShell(), null, null, path != null ? new Path(path) : null, null);
				if (file != null) {
					uriField.setText(URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
				}
			}

		});
	}

	public String computeDefaultURI() {
		String ext = currentResource.getURI().fileExtension();
		URI uri = currentResource.getURI().trimSegments(1);
		uri = uri.appendSegment(defaultName).appendFileExtension(ext);
		return uri.toString();
	}

	@Override
	protected Control createContents(Composite parent) {
		Control result = super.createContents(parent);
		this.uriField.setText(computeDefaultURI());
		return result;
	}

	/**
	 * Creates and, if it already exists, loads the specified resource. This implementation verifies
	 * that a resource can be opened for that URI, that the resource is not the object's current
	 * container, and that it is not read-only in the editing domain. If there is an existing
	 * resource with that URI, it prompts before overriding or adding to it.
	 *
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#processResources()
	 */
	@Override
	protected boolean processResources() {
		URI uri = URI.createURI(getURIText());
		this.uri = uri;
		return true;
	}

	/**
	 * Return the created Resource
	 *
	 * @return the Resource
	 */
	public URI getURI() {
		return uri;
	}
}
