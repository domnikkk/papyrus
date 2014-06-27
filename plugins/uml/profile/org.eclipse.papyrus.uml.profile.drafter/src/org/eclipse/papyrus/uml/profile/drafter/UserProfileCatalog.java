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

package org.eclipse.papyrus.uml.profile.drafter;

import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Catalog used to lookup a {@link Profile} from user namespace.
 * User can register Profile in this Catalog.
 * 
 * @author cedric dumoulin
 *
 */
public class UserProfileCatalog {

	
	/**
	 * Get a Profile by its name.
	 * First lookup if an existing profile exist with this name. If no profile is found, create the 
	 * profile.
	 * 
	 * @param profileName
	 * @return The requested profile (found or created).
	 */
	public Profile getProfile(String profileName ) {
		
		Profile profile = lookupProfile(profileName);
		if( profile == null) {
			profile = createProfile(profileName);
		}
		
		return profile;
	}
	
	/**
	 * Lookup for the specified profile in the catalog. Return null if no profile is found under the specified name.
	 * 
	 * @param profileName
	 * @return The profile found, or null.
	 */
	public Profile lookupProfile(String profileName ) {
		return null;
	}
	
	/**
	 * Create a new profile with the specified name.
	 * 
	 * @param profileName
	 * @return
	 */
	public Profile createProfile(String profileName ) {
		
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(profileName);
		
//		Util.reorderStereotypeApplications(element, stereotypes);
		
        return profile;
	}
}
