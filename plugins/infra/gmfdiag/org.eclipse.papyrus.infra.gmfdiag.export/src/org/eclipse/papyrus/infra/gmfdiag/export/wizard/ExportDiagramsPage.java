/*******************************************************************************
 * Copyright (c) 2011 AtoS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anass RADOUANI (AtoS)
 *******************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.export.wizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.gmfdiag.export.actions.ExportComposite;
import org.eclipse.papyrus.infra.gmfdiag.export.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * wizard page to export all diagram from a Papyrus model
 */
public class ExportDiagramsPage extends WizardPage {

	private ExportComposite export;

	public ExportComposite getExport() {
		return export;
	}

	private final URI uriFile;

	/**
	 * Create the wizard.
	 */
	public ExportDiagramsPage(URI uriFile) {
		super(Messages.ExportDiagramsPage_0);
		this.uriFile = uriFile;
		setTitle(Messages.ExportDiagramsPage_0);
		setDescription(Messages.ExportDiagramsPage_2);
	}

	/**
	 * Create contents of the wizard.
	 *
	 * @param parent
	 */
	@Override
	public void createControl(Composite parent) {
		export = new ExportComposite(parent, SWT.NONE);
		export.setSelectedDiagramFileURI(uriFile);
		setControl(export);
	}

}
