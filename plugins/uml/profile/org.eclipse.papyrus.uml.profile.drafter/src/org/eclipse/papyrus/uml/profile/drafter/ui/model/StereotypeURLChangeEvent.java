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

import java.beans.PropertyChangeEvent;


/**
 * A specialized {@link PropertyChangeEvent} fired by {@link StereotypeURL} when one of its properties has changed.
 * This event add the exact property that has changed.
 *
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeURLChangeEvent extends PropertyChangeEvent {

	
	protected String qualifiedName = "";
	protected String profileName = "";
	protected String stereotypeName = "";
	protected String resourceName = "";

	protected String oldQualifiedName = "";
	protected String oldProfileName = "";
	protected String oldStereotypeName = "";
	protected String oldResourceName = "";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * Create a new changed event for {@link StereotypeURL}.
	 * This constructor takes the source and the qualifiedName values as parameters. There is no other way to set
	 * this 2 later values.
	 *
	 * @param source The {@link StereotypeURL} sneding the event.
	 * @param oldValue The old {@link StereotypeURL#qualifiedName} value
	 * @param newValue The new {@link StereotypeURL#qualifiedName} value
	 */
	public StereotypeURLChangeEvent(Object source, String oldValue, String newValue) {
		super(source, StereotypeURL.QUALIFIED_NAME, oldValue, newValue);
//		super(source, "StereotypeURL.QUALIFIED_NAME", oldValue, newValue);
		this.oldQualifiedName = (String)oldValue;
		this.qualifiedName = (String)newValue;
	}

	/**
	 * Set old and new values of the property.
	 * 
	 * @param oldValue
	 * @param newValue
	 */
	public void setStereotypeNameValues(String oldValue, String newValue) {
		oldStereotypeName = oldValue;
		stereotypeName = newValue;
		
	}

	/**
	 * Set old and new values of the property.
	 * 
	 * @param oldValue
	 * @param newValue
	 */
	public void setProfileNameValues(String oldValue, String newValue) {
		oldProfileName = oldValue;
		profileName = newValue;
		
	}

	/**
	 * Set old and new values of the property.
	 * 
	 * @param oldValue
	 * @param newValue
	 */
	public void setResourceNameValues(String oldValue, String newValue) {
		oldResourceName = oldValue;
		resourceName = newValue;
		
	}

	
	/**
	 * @return the qualifiedName
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	
	/**
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}

	
	/**
	 * @return the stereotypeName
	 */
	public String getStereotypeName() {
		return stereotypeName;
	}

	
	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	
	/**
	 * @return the oldQualifiedName
	 */
	public String getOldQualifiedName() {
		return oldQualifiedName;
	}

	
	/**
	 * @return the oldProfileName
	 */
	public String getOldProfileName() {
		return oldProfileName;
	}

	
	/**
	 * @return the oldStereotypeName
	 */
	public String getOldStereotypeName() {
		return oldStereotypeName;
	}

	
	/**
	 * @return the oldResourceName
	 */
	public String getOldResourceName() {
		return oldResourceName;
	}

	/**
	 * Return true is the specified property has changed.
	 * @return
	 */
	public boolean isProfileNameChanged() {
		return isValuesChanged(oldProfileName, profileName);
	}

	/**
	 * Return true is the specified property has changed.
	 * @return
	 */
	public boolean isQualifiedNameChanged() {
		return isValuesChanged(oldQualifiedName, qualifiedName);
	}
	/**
	 * Return true is the specified property has changed.
	 * @return
	 */
	public boolean isResourceNameChanged() {
		return isValuesChanged(oldResourceName, resourceName);
	}

	/**
	 * Return true is the specified property has changed.
	 * @return
	 */
	public boolean isStereotypeNameChanged() {
		return isValuesChanged(oldStereotypeName, stereotypeName);
	}


	/**
	 * Compare the 2 values. Return true is they are equals, false otherwise.
	 * @param oldValue
	 * @param newValue
	 * @return
	 */
	private boolean isValuesChanged(String oldValue, String newValue) {
		if(oldValue == null) {
			return newValue!=null;
		}
		
		return !oldValue.equals(newValue);
	}
}
