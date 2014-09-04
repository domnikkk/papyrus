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
import java.util.List;

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
	protected List<PropertyModel> properties;

	/**
	 * The extendedStereotypes that should be attached to this stereotype.
	 */
	protected List<ExtendedStereotypeModel> extendedStereotypes;

	/**
	 * The metaclasses that should be attached to this stereotype.
	 */
	protected List<MetaclassesModel> metaclasses;
	
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
	 * Intercept {@link #qualifiedNameChanged(StereotypeURLChangeEvent)} call in order to set the {@link Stereotype} ans its
	 * associated properties.
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#qualifiedNameChanged(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURLChangeEvent)
	 *
	 * @param event
	 */
	@Override
	protected void qualifiedNameChanged(StereotypeURLChangeEvent event) {
		try {
			stereotype = profileCatalog.lookupStereotype(profileName, stereotypeName);
			resetMetaclasses();
			resetExtendedStereotypes();
			resetProperties();
			
		} catch (NotFoundException e) {
			// exit
			stereotype = null;
			return;
		}
		// Send another event for Stereotype ??
		
		super.qualifiedNameChanged(event);
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


		for( MetaclassesModel model : metaclasses) {
			if(model.getModelStatus() != ModelStatusKind.created) {
				metaclasses.remove(model);
			}
		}
		
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
		for( ExtendedStereotypeModel model : extendedStereotypes) {
			if(model.getModelStatus() != ModelStatusKind.created) {
				extendedStereotypes.remove(model);
			}
		}
		
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
		for( PropertyModel model : properties) {
			if(model.getModelStatus() != ModelStatusKind.created) {
				properties.remove(model);
			}
		}
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
		
		
		PropertyModel oldValue = properties.remove(index);
		PropertyModel newValue = null;
		if(index<properties.size()) {
			newValue = properties.get(index);
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
