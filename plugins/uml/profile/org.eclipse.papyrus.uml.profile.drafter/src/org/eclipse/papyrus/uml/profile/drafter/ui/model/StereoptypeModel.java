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

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Model used by UI to render Stereotype content.
 * 
 * @author cedric dumoulin
 *
 */
public class StereoptypeModel extends StereotypeURL {
		
	private static final String PROPERTIES = "properties";

	/**
	 * Associated {@link Stereotype}. Can be null if the Stereotype is not found in {@link ProfileCatalog}.
	 */
	protected Stereotype stereotype;
	
	/**
	 * The properties that should be attached to this stereotype.
	 */
//	protected List<PropertyModel> properties = new ArrayList<PropertyModel>();
	protected IObservableList properties = new WritableList();

	/**
	 * The extendedStereotypes that should be attached to this stereotype.
	 */
	protected List<ExtendedStereotypeModel> extendedStereotypes  = new ArrayList<ExtendedStereotypeModel>();

	/**
	 * The metaclasses that should be attached to this stereotype.
	 */
	protected List<MetaclassesModel> metaclasses  = new ArrayList<MetaclassesModel>();
	
	/**
	 * Catalog used to search {@link Stereotype} bu the name provided in {@link #qualifiedName}.
	 */
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
	public StereoptypeModel( ProfileCatalog profileCatalog) {
		this.profileCatalog = profileCatalog;
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
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	
	/**
	 * @return the properties
	 */
	public List<PropertyModel> getProperties() {
		return properties;
	}


	
	/**
	 * @return the metaclasses
	 */
	public List<MetaclassesModel> getMetaclasses() {
		return metaclasses;
	}

	/**
	 * Intercept {@link #qualifiedNameChanged(StereotypeURLChangeEvent)} call in order to set the {@link Stereotype} ans its
	 * associated properties.
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#qualifiedNameChanged(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURLChangeEvent)
	 *
	 * @param event
	 */
	@Override
	protected void qualifiedNameChanged(StereotypeURLChangeEvent event) {
		// Send events for Stereotype properties
		super.qualifiedNameChanged(event);
		
		// Change other properties.
		// TODO Events should be sent each tim a property change
		try {
			stereotype = profileCatalog.lookupStereotype(profileName, stereotypeName);
			resetMetaclasses();
			resetExtendedStereotypes();
			resetProperties();
			
		} catch (NotFoundException e) {
			// exit
			stereotype = null;
		}
		
	}
	
	/**
	 * Reset the {@link #properties}
	 */
	protected void resetMetaclasses() {
		clearInheritedMetaclasses();
		addStereotypeMetaclasses();
		
	}


	/**
	 * Remove all metaclasses that are not tagged 'created'.
	 */
	protected void clearInheritedMetaclasses() {


		List<MetaclassesModel> toRetain = new ArrayList<MetaclassesModel>();
		
		for( MetaclassesModel model : metaclasses) {
			if(model.getModelStatus() == ModelStatusKind.created) {
				toRetain.add(model);
			}
		}

		metaclasses.clear();
		metaclasses.addAll(toRetain);
	}


	/**
	 * Add all metaclasses already existing in the Stereotype.
	 */
	protected void addStereotypeMetaclasses() {

		if( stereotype == null) {
			return;
		}
		
		// Add owned metaclasses
		List<Class> ownedExtendedMetaclasses = stereotype.getExtendedMetaclasses();
		for( Class extendedMetaClass : ownedExtendedMetaclasses) {
			metaclasses.add(new MetaclassesModel(ModelStatusKind.owned, extendedMetaClass));
		}
		
		// Add inherited (not owned) metaclasses.
		for( Class extendedMetaClass : stereotype.getAllExtendedMetaclasses()) {
			if( ! ownedExtendedMetaclasses.contains(extendedMetaClass)) {
			   metaclasses.add(new MetaclassesModel(ModelStatusKind.inherited, extendedMetaClass));
			}
		}

	}


	/**
	 * Reset the {@link #extendedStereotypes} properties to the models created by the users.
	 * 
	 */
	protected void resetExtendedStereotypes() {
		clearInheritedExtendedStereotypes();
		addProfileExtendedStereotypes();
		
	}


	/**
	 * Remove all extened stereotypes that are not tagged 'created'.
	 */
	protected void clearInheritedExtendedStereotypes() {
		
		List<ExtendedStereotypeModel> toRetain = new ArrayList<ExtendedStereotypeModel>();
		
		for( ExtendedStereotypeModel model : extendedStereotypes) {
			if(model.getModelStatus() == ModelStatusKind.created) {
				toRetain.add(model);
			}
		}
		
		extendedStereotypes.clear();
		extendedStereotypes.addAll(toRetain);
		
	}


	protected void addProfileExtendedStereotypes() {
		if( stereotype == null) {
			return;
		}
		
		// Add owned metaclasses
		List<Class> superclasses = stereotype.getSuperClasses();
		for( Class superClass : superclasses) {
			extendedStereotypes.add(new ExtendedStereotypeModel(ModelStatusKind.owned, superClass));
		}
		

	}


	/**
	 * Reset the list {@link #properties} of {@link PropertyModel}. Only retains {@link PropertyModel} created by the user.
	 * 
	 */
	protected void resetProperties() {
		clearProfileProperties();
		addProfileProperties();
	}


	/**
	 * Clear all the {@link PropertyModel} that are not created by the user.
	 */
	protected void clearProfileProperties() {
		
		List<PropertyModel> toRetain = new ArrayList<PropertyModel>();
		
		for( Object p : properties) {
			PropertyModel model = (PropertyModel)p;
			if(model.getModelStatus() == ModelStatusKind.created) {
				toRetain.add(model);
			}
		}
		
		properties.clear();
		properties.addAll(toRetain);
	}


	/**
	 * Create a {@link PropertyModel} for each property found in {@link #stereotype}, and add them to {@link #properties}. 
	 */
	protected void addProfileProperties() {
		if( stereotype == null) {
			return;
		}
		
		// Add owned metaclasses
		List<Property> ownedProperties = stereotype.getOwnedAttributes();
		for( Property property : ownedProperties) {
			properties.add(new PropertyModel(ModelStatusKind.owned, property));
		}
		
		// Add inherited (not owned) metaclasses.
		for( Property property : stereotype.getAllAttributes()) {
			if( ! ownedProperties.contains(property)) {
				properties.add(new PropertyModel(ModelStatusKind.inherited, property));
			}
		}
	}

	/**
	 * Create a new {@link PropertyModel} and add it to the {@link StereoptypeModel#properties}
	 */
	public PropertyModel createNewPropertyModel() {
		PropertyModel model = new PropertyModel(ModelStatusKind.created, "new property");
		properties.add(model);
		fireIndexedPropertyChange(PROPERTIES, properties.size()-1, null, model);
		
		return model;
	}
	
	/**
	 * Remove the property at the specified index.
	 * @param index
	 */
	public void removePropertyModel( int index ) {
		
		if(index <0) {
			return;
		}
		
		
		PropertyModel oldValue = (PropertyModel)properties.remove(index);
		PropertyModel newValue = null;
		if(index<properties.size()) {
			newValue = (PropertyModel)properties.get(index);
		}
		
		fireIndexedPropertyChange(PROPERTIES, index, oldValue, newValue);
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
