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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Stereotype;


/**
 * This class can be used to lookup {@link Stereotype} from stereotype and profile name.
 * The class lookup in the ProfileCatalog
 * <br>
 * When profile or stereotype name are set, the {@link Stereotype} is set accordingly. If no profile
 * can be found, Stereotype is set to null.
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeNameToProfileSynchronizer {

	
	protected String qualifiedName;
	protected String profileName;
	protected String stereotypeName;
	
	protected Stereotype stereotype;
	protected ProfileCatalog profileCatalog;

	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param profileApplicator
	 */
	public StereotypeNameToProfileSynchronizer( ProfileCatalog profileCatalog) {
		this.profileCatalog = profileCatalog;
	}
	
	
	/**
	 * @return the qualifiedName
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	
	/**
	 * @param qualifiedName the qualifiedName to set
	 */
	public void setQualifiedName(String qualifiedName) {
		// Compute profile and stereotype name
		// TODO
		// doSet profile and stereotype name
		// TODO
		
		doSetQualifiedName(qualifiedName);
	}

	/**
	 * @param profileName the profileName to set
	 */
	protected void doSetQualifiedName(String qualifiedName) {
//		System.err.println("Qualified name set to '" + qualifiedName + "'");
		firePropertyChange("profileName", this.qualifiedName, this.qualifiedName = qualifiedName);
	}

	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		doSetProfileName(profileName);
		checkStereotype();
	}

	/**
	 * @param profileName the profileName to set
	 */
	protected void doSetProfileName(String profileName) {
//		System.err.println("ProfileName set to '" + profileName + "'");
		firePropertyChange("profileName", this.profileName, this.profileName = profileName);
	}

	
	/**
	 * @return the stereotypeName
	 */
	public String getStereotypeName() {
		return stereotypeName;
	}

	
	/**
	 * @param stereotypeName the stereotypeName to set
	 */
	public void setStereotypeName(String stereotypeName) {
		doSetStereotypeName(stereotypeName);
		checkStereotype();
	}

	/**
	 * @param stereotypeName the stereotypeName to set
	 */
	protected void doSetStereotypeName(String stereotypeName) {
//		System.err.println("StereotypeName set to '" + stereotypeName + "'");
		firePropertyChange("stereotypeName", this.stereotypeName, this.stereotypeName = stereotypeName);
	}

	
	/**
	 * @return the stereotype
	 */
	public Stereotype getStereotype() {
		return stereotype;
	}
	
	/**
	 * Set the stereotype property. 
	 * @param stereotype the stereotype to set
	 */
	public void setStereotype(Stereotype stereotype) {
		doSetStereotype(stereotype);
		// Sync names
		// Need to take care of fired events and circular set
		doSetProfileName( stereotype.getProfile().getName() );
		doSetStereotypeName( stereotype.getName() );
	}

	/**
	 * Set the stereotype property. 
	 * This value can't be set from outside.
	 * @param stereotype the stereotype to set
	 */
	protected void doSetStereotype(Stereotype stereotype) {
//		System.err.println("Stereotype set to '" + (stereotype!=null?stereotype.getQualifiedName():"null") + "'");
		firePropertyChange("stereotype", this.stereotype, this.stereotype = stereotype);
	}

	/**
	 * Stereotype or profile name have changed. Check if we can find and set a corresponding
	 * {@link Stereotype}.
	 */
	protected void checkStereotype() {
		if( stereotype!=null 
				&& stereotypeName == stereotype.getName()
				&& profileName == stereotype.getProfile().getName() ) {
			// No change
			return;
		}
		
		try {
			Stereotype stereotype = profileCatalog.lookupStereotype(profileName, stereotypeName);
			doSetStereotype(stereotype);
		} catch (NotFoundException e) {
			// exit
			doSetStereotype(null);
			return;
		}
			
	}
	
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

	protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		changeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}

}
