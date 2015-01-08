/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.wizard.pages;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;


public class TransformationConfigPage extends WizardPage {

	protected Config config;

	protected Collection<Object> transformationFiles;

	ConfigurationComposite configComposite;


	/**
	 *
	 * Constructor.
	 * 
	 * @param selectedFiles
	 */
	public TransformationConfigPage() {
		super("Parameters selection"); //$NON-NLS-1$
		setTitle("Define the transformation parameters"); //$NON-NLS-1$
		setDescription("Select the files and the configuration options for the transformation"); //$NON-NLS-1$
		// String iconPath = "icons/import_wiz_75x66.png"; //$NON-NLS-1$
		// ImageDescriptor imgDescriptior = Activator.getDefault().getImageDescriptor(iconPath);
		// setImageDescriptor(imgDescriptior);
		transformationFiles = new LinkedList<Object>();
		config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite pageComposite = new Composite(parent, SWT.NONE);
		pageComposite.setLayout(new GridLayout());

		configComposite = new ConfigurationComposite(pageComposite, SWT.NONE, config);

		setControl(pageComposite);
	}

	public Collection<Object> getTransformationFiles() {
		return configComposite.getTransformationFiles();
	}

	public Config getConfig() {
		return configComposite.getConfig();
	}

	public void setViewerInput(Collection<Object> selectedFiles) {
		configComposite.setViewerInput(selectedFiles);
	}


}
