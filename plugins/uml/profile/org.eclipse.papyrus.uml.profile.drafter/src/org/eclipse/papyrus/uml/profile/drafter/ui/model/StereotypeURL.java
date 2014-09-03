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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

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
	final static String PROFILE_PATHS = "profileNames";
	final static String STEREOTYPE = "stereotypeName";
	final static String RESOURCE = "resourceName";
	
	
	protected String qualifiedName;
	protected List<String> profileNames = new ArrayList<String>();
	protected String stereotypeName;
	/**
	 * The resource that should contains the Stereotype.
	 * Not yet used
	 * TODO : used this extra property
	 */
	protected String resourceName;
	
	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	
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
	public StereotypeURL(List<String> profileNames, String stereotypeName) {
		this.profileNames = profileNames;
		this.stereotypeName = stereotypeName;
		this.qualifiedName = computeQualifiedName();
	}

	/**
	 * Constructor.
	 *
	 * @param profileNames
	 * @param stereotypeName
	 */
	public StereotypeURL(String profileName, String stereotypeName) {
		this.profileNames.add(profileName);
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
	public void setQualifiedName(String qualifiedName) {
		
		if(this.qualifiedName != null && this.qualifiedName.equals(qualifiedName)) {
			// No change
			return;
		}
		
		if(qualifiedName == null ) {
			clear();
			return;
		}
		
		// Parse the qualifiedName and set other names accordingly.
		
		String[] paths = qualifiedName.split("::");
		// stereotype name = last segment
		String oldStereotypeName = this.stereotypeName;
		stereotypeName = paths[paths.length-1];
		
		// profile names = first segments
		profileNames.clear();
		for( int i=0; i<paths.length-1; i++) {
			profileNames.add(paths[i]);
		}
		
		this.qualifiedName = qualifiedName;
		// Now, fire events
		firePropertyChange(STEREOTYPE, oldStereotypeName, stereotypeName);
		// TODO : improve this event ?
		firePropertyChange(PROFILE_PATHS, null, profileNames); 
		firePropertyChange(QUALIFIED_NAME, this.qualifiedName, this.qualifiedName = qualifiedName);
	}

	
	/**
	 * Clear this URL. All segments are set to null or empty.
	 */
	public void clear() {
		if( qualifiedName != null) {
			firePropertyChange(QUALIFIED_NAME, this.qualifiedName, this.qualifiedName = null);
		}
		
		if(profileNames.size()>0) {
			// TODO : improve this event ?
			profileNames.clear();
			firePropertyChange(PROFILE_PATHS, profileNames, profileNames); 
		}
		
		if(stereotypeName != null) {
			firePropertyChange(STEREOTYPE, stereotypeName, stereotypeName=null);			
		}
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
		if(this.stereotypeName != null && this.stereotypeName.equals(stereotypeName)) {
			// No change
			return;
		}
		
		if(this.stereotypeName == null && stereotypeName == null) {
			// No change
			return;
		}
		
		
		String oldStereotypeName = this.stereotypeName;
		this.stereotypeName = stereotypeName;
		String oldQualifiedName = qualifiedName;
		qualifiedName = computeQualifiedName();
		
		// Now, fire events
		firePropertyChange(STEREOTYPE, oldStereotypeName, stereotypeName);
		firePropertyChange(QUALIFIED_NAME, oldQualifiedName, qualifiedName);
	}


	

	/**
	 * @return the profileNames
	 */
	public List<String> getProfileNames() {
		return profileNames;
	}
	
	/**
	 * @param profilePath The name of the profile to add to {@link #profileNames}.
	 * @return the profileNames
	 */
	public void addProfilePath(String profilePath) {
		
		int index = profileNames.size();
		String oldValue = null;
		profileNames.add(profilePath);
		
		String oldQualifiedName = qualifiedName;
		qualifiedName = computeQualifiedName();
		
		fireIndexedPropertyChange(PROFILE_PATHS, index, oldValue, profilePath);
		firePropertyChange(QUALIFIED_NAME, oldQualifiedName, qualifiedName);
	}
	
	/**
	 * @param profilePath The name of the profile to add to {@link #profileNames}.
	 * @return the profileNames
	 */
	public void setProfilePath(int index, String profilePath) {
		String oldValue = profileNames.set(index, profilePath);
		
		String oldQualifiedName = qualifiedName;
		qualifiedName = computeQualifiedName();
		
		fireIndexedPropertyChange(PROFILE_PATHS, index, oldValue, profilePath);
		firePropertyChange(QUALIFIED_NAME, oldQualifiedName, qualifiedName);
	}
	
	/**
	 * Compute the qualifiedName from {@link #resourceName}, {@link #profileNames} and {@link #stereotypeName}.
	 * Add necessary '::' and '/'.
	 * Profile paths and stereotype name are separated with '::'.
	 * ResourceName and paths are separated by '/'.
	 * 
	 * @return
	 */
	public String computeQualifiedName() {
		
		StringBuffer buf = new StringBuffer();
		
		if( resourceName != null) {
			buf.append("url://").append(resourceName).append("/");
		}
		if( ! profileNames.isEmpty()) {
			for( int i=0; i<profileNames.size()-1; i++) {
				buf.append(profileNames.get(i)).append("::");
			}
			// Last segment without separator
			buf.append(profileNames.get(profileNames.size()-1));
		}
		
		if( stereotypeName != null) {
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
