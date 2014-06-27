/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.utils;

import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Class used to lookup Profile from user namespaces.
 * Returned Profile are not necessarily applied to an element of the current model.
 * 
 * @author cedric dumoulin
 *
 */
public class ProfileCatalog {

	/**
	 * A uml element from which lookup are done. Usually the currently selected element.
	 */
	protected Element namedElement;

	
	/**
	 * Constructor.
	 *
	 * @param namedElement
	 */
	public ProfileCatalog(Element namedElement) {
		this.namedElement = namedElement;
	}


	/**
	 * @return the namedElement
	 */
	public Element getNamedElement() {
		return namedElement;
	}
	
	/**
	 * Lookup {@link Stereotype} in the associated namespaces.
	 * 
	 * @param profileName
	 * @param stereotypeName
	 * @return
	 * @throws NotFoundException 
	 */
	public Stereotype lookupStereotype( String profileName, String stereotypeName ) throws NotFoundException {
		
		// Actually, only check in applied profiles namespace.
		return lookupStereotypeInAppliedProfile(profileName, stereotypeName);
	}

	/**
	 * Lookup {@link Stereotype} in Profiles applied to the {@link NamedElement} namespace .
	 * 
	 * @param profileName
	 * @param stereotypeName
	 * @return
	 * @throws NotFoundException 
	 */
	public Stereotype lookupStereotypeInAppliedProfile( String profileName, String stereotypeName ) throws NotFoundException {
		
		// First,lookup profile
		Profile profile = namedElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			throw new NotFoundException("Profile not found '" + profileName + "'.");
		}
		
		Stereotype stereotype = profile.getOwnedStereotype(stereotypeName, true);
		if( stereotype == null ) {
			throw new NotFoundException("Stereotype not found '" + stereotypeName + "'.");
		}
		
		return stereotype;
		
	}

}
