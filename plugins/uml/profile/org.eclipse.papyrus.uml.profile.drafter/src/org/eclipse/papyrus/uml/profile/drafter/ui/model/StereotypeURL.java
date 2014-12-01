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

package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import static org.eclipse.papyrus.uml.profile.drafter.Activator.log;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.uml2.uml.Stereotype;


/**
 * A class encapsulating an URL identifying a Stereotype.
 * The class does not ensure that a corresponding UML {@link Stereotype} exists. It is only a identifier to a Stereotype.
 * 
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeURL {

	final static String QUALIFIED_NAME = "qualifiedName";
	final static String PROFILE_NAME = "profileName";
	final static String STEREOTYPEE_NAME = "stereotypeName";
	final static String RESOURCEE_NAME = "resourceName";
	
	
	protected String qualifiedName = "";
	protected String profileName = "";
	protected String stereotypeName = "";
	/**
	 * The resource that should contains the Stereotype.
	 * Not yet used
	 * TODO : used this extra property
	 */
	protected String resourceName = "";
	
	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	private static int count=0;

	
	/**
	 * 
	 * Constructor.
	 *
	 */
	public StereotypeURL() {
	}
	
	/**
	 * Constructor.
	 *
	 * @param qualifiedName
	 */
	public StereotypeURL(String qualifiedName) {
		setQualifiedName(qualifiedName);
	}



	/**
	 * Constructor.
	 *
	 * @param profileNames
	 * @param stereotypeName
	 */
	public StereotypeURL(String profileName, String stereotypeName) {
		this.profileName = profileName;
		this.stereotypeName = stereotypeName;
		this.qualifiedName = computeQualifiedName();
	}


	/**
	 * @return the qualifiedName
	 */
	public String getQualifiedName() {
		if(qualifiedName==null) {
			computeQualifiedName();
		}
		
		return qualifiedName;
	}

	
	/**
	 * @param qualifiedName the qualifiedName to set
	 */
	synchronized public void setQualifiedName(String qualifiedName) {
		
		qualifiedName = qualifiedName.trim();
		
		int num = count++;

		try {
			if(qualifiedName == null) {
				return;
			}
			
			if(this.qualifiedName != null && this.qualifiedName.equals(qualifiedName)) {
				// No change
				return;
			}
			
			// Remember old values
			String stereotypeName="";
			String profileName="";
			String resourceName="";
			
			
			// Remove trailing '/'
			if( qualifiedName.startsWith("//")) {
				qualifiedName = qualifiedName.substring(2);
			}
			else if( qualifiedName.startsWith("/")) {
				qualifiedName = qualifiedName.substring(1);				
			}
			
			// Is there a resource name ?
			// "resourceName/endOfName"
			int index = qualifiedName.indexOf("/");
			if(index > 0) {
				// Extract resourceName, and the end of the qualified name (ie: endOfName)
				resourceName = qualifiedName.substring(0, index);
				qualifiedName = qualifiedName.substring(index+1);
			}
			
			
			// Parse the qualifiedName and set other names accordingly.
			index = qualifiedName.lastIndexOf("::");
			if(index == -1) {
				// no profile names
				stereotypeName = qualifiedName;
				profileName = "";
			}
			else {
				stereotypeName = qualifiedName.substring(index+2);
				profileName = qualifiedName.substring(0, index);
			}
			
			StereotypeURLChangeEvent ev = createStereotypeURLChangeEvent(this.qualifiedName, this.qualifiedName=computeQualifiedName(resourceName, profileName, stereotypeName));
			ev.setStereotypeNameValues(this.stereotypeName, this.stereotypeName = stereotypeName);
			ev.setProfileNameValues(this.profileName, this.profileName = profileName);
			ev.setResourceNameValues(this.resourceName, this.resourceName = resourceName);
			
			qualifiedNameChanged(ev);
		} catch (Exception e) {
			log.error(e);
		}

		}

	
	/**
	 * Clear this URL. All segments are set to null or empty.
	 */
	public void clear() {
		
		StereotypeURLChangeEvent ev = createStereotypeURLChangeEvent(qualifiedName, qualifiedName = "");
		ev.setProfileNameValues(profileName, profileName= ""); 
		ev.setStereotypeNameValues(stereotypeName, stereotypeName= ""); 
		ev.setResourceNameValues(resourceName, resourceName= "");
		
		qualifiedNameChanged(ev);
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
		
		// StereotypeName should be set.
		if(stereotypeName == null) {
			return;
		}
		
		if(this.stereotypeName != null && this.stereotypeName.equals(stereotypeName)) {
			// No change
			return;
		}
		
		String oldStereotypeName = this.stereotypeName;
		this.stereotypeName = stereotypeName;
		
		StereotypeURLChangeEvent ev = createStereotypeURLChangeEvent(qualifiedName, qualifiedName = computeQualifiedName());
		ev.setStereotypeNameValues( oldStereotypeName, stereotypeName);
		
		qualifiedNameChanged(ev);
	}


	

	/**
	 * @return the profileNames
	 */
	public String getProfileName() {
		return profileName;
	}
	
	/**
	 * @param profilePath The name of the profile to add to {@link #profileNames}.
	 * @return the profileNames
	 */
	public void setProfileName(String profileName) {
		
		// parameter should be set.
		if(profileName == null) {
			return;
		}
		
		if(this.profileName != null && this.profileName.equals(profileName)) {
			// No change
			return;
		}
		
		String oldProfileName = this.profileName;
		this.profileName = profileName;

		StereotypeURLChangeEvent ev = createStereotypeURLChangeEvent(qualifiedName, qualifiedName = computeQualifiedName());
		ev.setProfileNameValues( oldProfileName, profileName);
		
		qualifiedNameChanged(ev);
	}
	
	
	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	
	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		
		// parameter should be set.
		if(resourceName == null) {
			return;
		}
		
		if(this.resourceName != null && this.resourceName.equals(resourceName)) {
			// No change
			return;
		}
		
		String oldResourceName = this.resourceName;
		this.resourceName = resourceName;

		StereotypeURLChangeEvent ev = createStereotypeURLChangeEvent(qualifiedName, qualifiedName = computeQualifiedName());
		ev.setResourceNameValues( oldResourceName, resourceName);
		
		qualifiedNameChanged(ev);

	}

	/**
	 * Method called when the {@link #qualifiedName} property has changed. This method is called directly by methods
	 * modifying the properties.
	 * The provided parameter is the event that has been created and filled with appropriate values. It is ready to be fired.
	 * 
	 * 
	 * @param event The event indicating the changes. This event is not yet fired. The method should fire the event.
	 * 
	 */
	protected void qualifiedNameChanged( StereotypeURLChangeEvent event) {
		
		// Fire QUALIFIED_NAME event
		// The event already hold the QUALIFIED_NAME id.
		changeSupport.firePropertyChange(event);

		// Also propagate other change events.
		if(event.isProfileNameChanged() ) {
			firePropertyChange(PROFILE_NAME, event.getOldProfileName(), event.getProfileName());
		}
		if(event.isStereotypeNameChanged() ) {
			firePropertyChange(STEREOTYPEE_NAME, event.getOldStereotypeName(), event.getStereotypeName());
		}
		if(event.isResourceNameChanged() ) {
			firePropertyChange(RESOURCEE_NAME, event.getOldResourceName(), event.getResourceName());
		}
		if(event.isQualifiedNameChanged() ) {
			firePropertyChange(QUALIFIED_NAME, event.getOldQualifiedName(), event.getQualifiedName());
		}
		
	}
	
	/**
	 * Create a new {@link StereotypeURLChangeEvent} initialized with provided values.
	 * 
	 * @param oldValue The old {@link #qualifiedName} value
	 * @param newValue The new {@link #qualifiedName} value
	 * @return
	 */
	protected StereotypeURLChangeEvent createStereotypeURLChangeEvent( String oldValue, String newValue) {
		return new StereotypeURLChangeEvent(this,  oldValue, newValue);
	}
	
	/**
	 * Compute the qualifiedName from {@link #resourceName}, {@link #profileNames} and {@link #stereotypeName}.
	 * Add necessary '::' and '/'.
	 * Profile paths and stereotype name are separated with '::'.
	 * ResourceName and paths are separated by '/'.
	 * 
	 * @return
	 */
	protected String computeQualifiedName() {
		
		return computeQualifiedName(resourceName, profileName, stereotypeName);
	}

	/**
	 * Compute the qualifiedName from {@link #resourceName}, {@link #profileNames} and {@link #stereotypeName}.
	 * Add necessary '::' and '/'.
	 * Profile paths and stereotype name are separated with '::'.
	 * ResourceName and paths are separated by '/'.
	 * 
	 * @return
	 */
	static public String computeQualifiedName(String resourceName, String profileName, String stereotypeName) {
		
		StringBuilder buf = new StringBuilder();
		
		if( resourceName != null && resourceName.length()>0) {
			buf.append("//").append(resourceName).append("/");
		}
		if( profileName != null && profileName.length()>0) {
			buf.append(profileName);
		}
		
		if( stereotypeName != null && stereotypeName.length()>0) {
			if(buf.length()>0 && buf.charAt(buf.length()-1)!='/' ) {
				buf.append("::");
			}
			buf.append(stereotypeName);
		}
		
		return buf.toString();
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return qualifiedName;
	}

	/**
	 * 
	 * @param listener
	 */
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

	protected void fireIndexedPropertyChange(String propertyName, int index, Object oldValue, Object newValue) {
		changeSupport.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);
	}

	
	/**
	 * @return the changeSupport
	 */
	protected PropertyChangeSupport getChangeSupport() {
		return changeSupport;
	}


}
