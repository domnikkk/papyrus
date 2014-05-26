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

package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Default implementation of {@link IStereotypeUpdateArgs}.
 * This implementation provide default storage for the data.
 * 
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeUpdateArgs implements IStereotypeUpdateArgs {

	/**
	 * Required name for the stereotype.
	 */
	protected String stereotypeName;
	protected String profileName;
	protected Stereotype stereotypeToUpdate;
	
	protected List<Class> extendedMetaclasses;
	protected List<Stereotype> extendedStereotypes;
	
	/**
	 * @return the stereotypeName
	 */
	public String getStereotypeName() {
		if( stereotypeToUpdate != null) {
			return stereotypeToUpdate.getName();
		}
		return stereotypeName;
	}
	/**
	 * @param stereotypeName the stereotypeName to set
	 */
	public void setStereotypeName(String stereotypeName) {
		this.stereotypeName = stereotypeName;
	}
	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		if( stereotypeToUpdate != null && stereotypeToUpdate.getProfile() != null) {
			return stereotypeToUpdate.getProfile().getName();
		}
		return profileName;
	}
	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	/**
	 * @return the profileToUpdate
	 */
	public Stereotype getStereotypeToUpdate() {
		return stereotypeToUpdate;
	}
	/**
	 * @param profileToUpdate the profileToUpdate to set
	 */
	public void setStereotypeToUpdate(Stereotype profileToUpdate) {
		this.stereotypeToUpdate = profileToUpdate;
	}
	/**
	 * @return the extendedMetaclasses
	 */
	public List<Class> getExtendedMetaclasses() {
		return extendedMetaclasses;
	}
	/**
	 * @param extendedMetaclasses the extendedMetaclasses to set
	 */
	public void setExtendedMetaclasses(List<Class> extendedMetaclasses) {
		this.extendedMetaclasses = extendedMetaclasses;
	}
	/**
	 * @return the extendedStereotypes
	 */
	public List<Stereotype> getExtendedStereotypes() {
		return extendedStereotypes;
	}
	/**
	 * @param extendedStereotypes the extendedStereotypes to set
	 */
	public void setExtendedStereotypes(List<Stereotype> extendedStereotypes) {
		this.extendedStereotypes = extendedStereotypes;
	}
	
}
