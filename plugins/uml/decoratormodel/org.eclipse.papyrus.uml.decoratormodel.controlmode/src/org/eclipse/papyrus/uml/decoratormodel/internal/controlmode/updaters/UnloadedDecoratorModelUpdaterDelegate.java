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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @author damus
 *
 */
public class UnloadedDecoratorModelUpdaterDelegate extends AbstractDecoratorModelUpdaterDelegate {

	public UnloadedDecoratorModelUpdaterDelegate(Package package_) {
		super(package_);
	}

	@Override
	public ProfileApplication addProfileApplication(Package package_, URI profileURI, URI appliedDefinitionURI) {
		// Create a proxy for the profile
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		((InternalEObject) profile).eSetProxyURI(profileURI);
		ProfileApplication result = package_.createProfileApplication();
		result.setAppliedProfile(profile);

		// and a proxy for the Ecore definition
		EPackage definition = EcoreFactory.eINSTANCE.createEPackage();
		((InternalEObject) definition).eSetProxyURI(appliedDefinitionURI);
		result.createEAnnotation(UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI).getReferences().add(definition);

		return result;
	}

}
