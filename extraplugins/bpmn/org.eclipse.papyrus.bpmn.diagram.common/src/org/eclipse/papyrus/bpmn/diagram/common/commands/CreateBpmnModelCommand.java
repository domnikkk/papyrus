/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.bpmn.diagram.common.commands;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

public class CreateBpmnModelCommand extends ModelCreationCommandBase {

	public static final String COMMAND_ID = "BPMN";



	public static final String PROFILES_PATHMAP = "pathmap://BPMN_PROF/"; //$NON-NLS-1$


	public static final String BPMN_PROFILE_URI = PROFILES_PATHMAP + "bpmn.profile.uml"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * @see org.eclipse.papyrus.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		((org.eclipse.uml2.uml.Package) owner).setName(getModelName());

		org.eclipse.uml2.uml.Package bpmnProfile = PackageUtil.loadPackage(URI.createURI(BPMN_PROFILE_URI), owner.eResource().getResourceSet());
		if ((bpmnProfile != null) && (bpmnProfile instanceof Profile)) {
			PackageUtil.applyProfile(((org.eclipse.uml2.uml.Package) owner), (org.eclipse.uml2.uml.Profile) bpmnProfile, true);
		}
	}

	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return "PapyrusBPMNModel";
	}


}
