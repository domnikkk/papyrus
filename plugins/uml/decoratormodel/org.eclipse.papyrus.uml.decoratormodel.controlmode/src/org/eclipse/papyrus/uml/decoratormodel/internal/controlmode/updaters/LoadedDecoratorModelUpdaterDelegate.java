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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @author damus
 *
 */
public class LoadedDecoratorModelUpdaterDelegate extends AbstractDecoratorModelUpdaterDelegate {

	public LoadedDecoratorModelUpdaterDelegate(Package package_) {
		super(package_);
	}

	@Override
	public ProfileApplication addProfileApplication(Package package_, URI profileURI, URI appliedDefinitionURI) {
		ProfileApplication result = null;

		// Get the corresponding loaded profile application of the controlled package
		Profile profile = (Profile) EMFHelper.getResourceSet(getControlledPackage()).getEObject(profileURI, true);
		ProfileApplication toCopy = getControlledPackage().getProfileApplication(profile, true);

		if (toCopy != null) {
			result = EcoreUtil.copy(toCopy);
			package_.getProfileApplications().add(result);
		}

		return result;
	}

}
