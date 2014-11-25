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
 *  Benoit Maggi benoit.maggi@cea.fr  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.ecore.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;
import org.eclipse.papyrus.uml.diagram.ecore.util.ConvertToEcoreUtil;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * Convert uml to Ecore Wizard
 */
public class ConvertToEcoreWizard extends Wizard implements IExportWizard {

	protected Map<String, String> options = new HashMap<String, String>();

	/** wizard page to export all diagram from a Papyrus model. */
	protected SelectFilesWizardPage selectModelPage;

	/** wizard page to select option for the uml to ecore transformation */
	private ConvertToEcoreWizardPage convertToEcoreWizardPage;

	/** Selected iPath. */
	private IPath iPath;

	/**
	 * Constructor.
	 *
	 */
	public ConvertToEcoreWizard() {
		super();
		setWindowTitle("Convert Papyrus Model to Ecore");
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		String[] extensionFilter = { "uml" }; //$NON-NLS-1$
		selectModelPage = new SelectFilesWizardPage("Convert uml to Ecore", 0, 1, extensionFilter, iPath);
		addPage(selectModelPage);
		convertToEcoreWizardPage = new ConvertToEcoreWizardPage(options);
		addPage(convertToEcoreWizardPage);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 *
	 * @return
	 */
	@Override
	public boolean performFinish() {
		IPath iPath = selectModelPage.getIPath();
		ModelSet modelSet = new DiResourceSet();
		URI uri = URI.createPlatformResourceURI(iPath.toString(), Boolean.TRUE);
		Resource resource = modelSet.getResource(uri, Boolean.TRUE);
		EObject eObject = resource.getContents().get(0);
		if(eObject instanceof Element) {
			Element element = (Element)eObject;
			Package nearestPackage = element.getNearestPackage();
			if(nearestPackage != null) {
				ConvertToEcoreUtil.convertToEcore(nearestPackage, options);
			}
		}
		return Boolean.TRUE;
	}
}
