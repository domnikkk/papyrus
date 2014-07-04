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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Lists;


/**
 * Class used to lookup Profile from user namespaces.
 * Returned Profile are not necessarily applied to an element of the current model.
 * 
 * @author cedric dumoulin
 *
 */
public class ProfileCatalog implements IProfileCatalog {

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


	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.IProfileCatalog#getProfiles()
	 *
	 * @return
	 */
	@Override
	public List<Profile> getProfiles() {
		
		Package nearestPackage = namedElement.getNearestPackage();
		if( nearestPackage == null ) {
			return Collections.emptyList();
		}
		List<ProfileApplication> allProfileApplications = nearestPackage.getAllProfileApplications();
		if( allProfileApplications.isEmpty()) {
			return Collections.emptyList();
		}
		
		List<Profile>  res = Lists.transform(allProfileApplications, ProfileFunctions.PROFILE_APPLICATION_GETAPPLIEDPROFILE);
		return res;
	}


	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.IProfileCatalog#getStereotypes()
	 *
	 * @return
	 */
	@Override
	public List<Stereotype> getStereotypes() {
		
		List<Profile> profiles = getProfiles();
		List<Stereotype> sterotypes = new ArrayList<Stereotype>();
		// Add all stereotypes
		for( Profile profile : profiles) {
			sterotypes.addAll(profile.getOwnedStereotypes());
		}
		
		return sterotypes;
	}


	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.IProfileCatalog#getProfileNames()
	 *
	 * @return
	 */
	@Override
	public List<String> getProfileNames() {
		Package nearestPackage = namedElement.getNearestPackage();
		if( nearestPackage == null ) {
			return Collections.emptyList();
		}
		List<ProfileApplication> allProfileApplications = nearestPackage.getAllProfileApplications();
		if( allProfileApplications.isEmpty()) {
			return Collections.emptyList();
		}
		
		List<String>  res = Lists.transform(allProfileApplications, ProfileFunctions.PROFILE_APPLICATION_PROFILE_NAME);
		return res;
	}


	@Override
	public List<String> getStereotypeNames() {
		List<String>  res = Lists.transform(getStereotypes(), ProfileFunctions.STEROTYPE_NAME);
		return res;
	}


	@Override
	public List<String> getProfileQualifiedNames() {
		Package nearestPackage = namedElement.getNearestPackage();
		if( nearestPackage == null ) {
			return Collections.emptyList();
		}
		List<ProfileApplication> allProfileApplications = nearestPackage.getAllProfileApplications();
		if( allProfileApplications.isEmpty()) {
			return Collections.emptyList();
		}
		
		List<String>  res = Lists.transform(allProfileApplications, ProfileFunctions.PROFILE_APPLICATION_PROFILE_QUALIFIEDNAME);
		return res;
	}


	@Override
	public List<String> getStereotypeQualifiedNames() {
		List<String>  res = Lists.transform(getStereotypes(), ProfileFunctions.STEROTYPE_QUALIFIEDNAME);
		return res;
	}


	@Override
	public List<String> getAllStereotypeNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
