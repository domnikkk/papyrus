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
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;


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
	protected MemberKind memberKind = MemberKind.owned;
	
	/**
	 * state of this model.
	 */
	protected StateKind stateKind = StateKind.loaded;
	
	/**
	 * Life status of this model. Value is deleted if the user request deletion of this model.
	 */
	protected LifeStatusKind lifeStatusKind = LifeStatusKind.running;
	
	/**
	 * The {@link Property} that the Stereotype extends. This is the property represented by this model.
	 */
	protected Property property;
	
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	protected Type type;
	protected String value = "defaultValue";

	protected Object initialValue;
	protected Object objectValue;
	
	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	
	/**
	 * Constructor.
	 *
	 * @param modelStatusKind
	 */
	public PropertyModel(MemberKind modelStatusKind) {
		this.memberKind = modelStatusKind;
	}



	/**
	 * 
	 * Constructor.
	 *
	 * @param modelStatusKind
	 * @param property
	 */
	public PropertyModel(MemberKind modelStatusKind, Property property) {
		this.memberKind = modelStatusKind;
		this.stateKind = StateKind.loaded;
		this.property = property;
		if(property != null) {
			this.proposedName = property.getName();
		}
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param modelStatusKind
	 * @param property
	 * @param propertyValue The value attached to the targetted object, if any.
	 */
	public PropertyModel(MemberKind modelStatusKind, Property property, Object propertyValue) {
		this.memberKind = modelStatusKind;
		this.stateKind = StateKind.loaded;
		this.property = property;
		if(property != null) {
			this.proposedName = property.getName();
			this.type = property.getType();
		}
		if( propertyValue != null) {
			this.initialValue = propertyValue;
			this.objectValue = propertyValue;
			this.value = propertyValue.toString();
		}
		
	}



	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public PropertyModel(MemberKind modelStatusKind, String proposedName) {
		this.memberKind = modelStatusKind;
		this.stateKind = StateKind.created;
		this.proposedName = proposedName;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public PropertyModel(MemberKind modelStatusKind, String proposedName, Type type) {
		this.memberKind = modelStatusKind;
		this.stateKind = StateKind.created;
		this.proposedName = proposedName;
		this.type = type;
	}






	/**
	 * 
	 * @return
	 */
	public MemberKind getMemberKind() {
		return memberKind;
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
	public Type getType() {
		return type;
	}



	
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
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
	 * @return the objectValue
	 */
	public Object getObjectValue() {
		return objectValue;
	}



	
	/**
	 * @param objectValue the objectValue to set
	 */
	public void setObjectValue(Object objectValue) {
		this.objectValue = objectValue;
	}



	/**
	 * Visitor entry to visit this Model and its nested classes.
	 * @param visitor
	 */
	public void accept(IModelVisitor visitor) {
		visitor.visit(this);
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
	 * @return the stateKind
	 */
	public StateKind getStateKind() {
		return stateKind;
	}

	
	/**
	 * @param stateKind the stateKind to set
	 */
	public void setStateKind(StateKind stateKind) {
		firePropertyChange("stateKind", this.stateKind, this.stateKind = stateKind);
	}



	
	/**
	 * @return the lifeStatusKind
	 */
	public LifeStatusKind getLifeStatusKind() {
		return lifeStatusKind;
	}



	
	/**
	 * @param lifeStatusKind the lifeStatusKind to set
	 */
	public void setLifeStatusKind(LifeStatusKind lifeStatusKind) {
		firePropertyChange("lifeStatusKind", this.lifeStatusKind, this.lifeStatusKind = lifeStatusKind);
	}
	
	/**
	 * Apply a model changed event on this model. This change the {@link #lifeStatusKind}.
	 */
	public void modelChangedEvent() {
		
		switch(stateKind) {
		case loaded:
			stateKind = StateKind.modified;
			break;

		default:
			// No change
			break;
		}
	}
	/**
	 * A delete is applied to the model. If the model is alive, it is marked deleted.
	 * If it is deleted, it is marked alive.
	 */
	public void deleteModelEvent() {
		
		switch(lifeStatusKind) {
		case running:
			setLifeStatusKind(LifeStatusKind.deleted);
			break;
		case deleted:
			setLifeStatusKind(LifeStatusKind.running);
			break;

		default:
			// No change
			break;
		}
	}



	/**
	 * Check if a property with the name of this {@link PropertyModel} exist in the specified {@link Stereotype}.
	 * Return true if a property with the same name exist in the provided stereotype, false otherwise.
	 * 
	 * @param stereotype The stereotype into which we want to check if a property exists.
	 * @return
	 */
	public boolean isPropertyExistIn(Stereotype stereotype) {
		if( proposedName == null) {
			return false;
		}
		
		return stereotype.getAttribute(proposedName, null) != null;
	}



	/**
	 * Check if the value of the property has been modified. Return true if the value has been modified by user, false otherwise.
	 * The actual implementation compare the original value as String to the String entered by user.
	 * 
	 * @return
	 */
	public boolean isValueModified() {
		
		if( initialValue == null || getValue() == null) {
			// One of the two is null.
			// If only one is not null, there is  modification.
			return (initialValue != null || getValue() != null);
		}
		
		// None is null
		String originalValue = initialValue.toString();
		if( getValue().equals(originalValue)) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @return
	 */
//	public Object createPropertyValue() {
//		return createPropertyValue( type, value);
//	}
//
//
//
//	private Object createPropertyValue(Type type, String value) {
//
//		// TODO : change it !!!
//
//		if( "String".equals(type) ) {
//			return value;
//		}
//		else if ( "Integer".equals(type) ) {
//			return Integer.valueOf(value);
//		}
//		
//		return value;
//	}
}
