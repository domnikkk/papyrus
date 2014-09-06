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

import org.eclipse.uml2.uml.Property;


/**
 * Model that represent one StereotypeModel' Property
 * 
 * @author cedric dumoulin
 *
 */
public class PropertyModel {

	/**
	 * The status of the model. ModelStatusKind.created mean that the model is created by the user.
	 */
	protected ModelStatusKind modelStatusKind = ModelStatusKind.created;
	/**
	 * The {@link Property} that the Stereotype extends. This is the property represented by this model.
	 */
	protected Property property;
	
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	protected String type;
	protected String value;

	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	
	/**
	 * Constructor.
	 *
	 * @param modelStatusKind
	 */
	public PropertyModel(ModelStatusKind modelStatusKind) {
		this.modelStatusKind = modelStatusKind;
	}



	/**
	 * 
	 * Constructor.
	 *
	 * @param modelStatusKind
	 * @param property
	 */
	public PropertyModel(ModelStatusKind modelStatusKind, Property property) {
		this.modelStatusKind = modelStatusKind;
		this.property = property;
		if(property != null) {
			this.proposedName = property.getName();
		}
	}



	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public PropertyModel(ModelStatusKind modelStatusKind, String proposedName) {
		this.modelStatusKind = modelStatusKind;
		this.proposedName = proposedName;
	}




	/**
	 * 
	 * @return
	 */
	public ModelStatusKind getModelStatus() {
		return modelStatusKind;
	}



	
	/**
	 * @return the proposedName
	 */
	public String getProposedName() {
		return proposedName;
	}



	
	/**
	 * @param proposedName the proposedName to set
	 */
	public void setProposedName(String proposedName) {
		firePropertyChange("proposedName", this.proposedName, this.proposedName = proposedName);
	}



	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		firePropertyChange("type", this.type, this.type = type);
	}



	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}



	
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		firePropertyChange("value", this.value, this.value = value);
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
	
}
