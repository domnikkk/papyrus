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
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
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
	 * Not used for now (should replace metaclassesCollection).
	 */
	protected List<MetaclassModel> metaclasses  = new ArrayList<MetaclassModel>();
	
	/**
	 * The collection of metaclasses in one single model. 
	 * This is for history reasons.
	 */
	protected MetaclassesModel metaclassesCollection = new MetaclassesModel();
	
	/**
	 * Catalog used to search {@link Stereotype} by the name provided in {@link #qualifiedName}.
	 */
	protected ProfileCatalog profileCatalog;

	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	/**
	 * List of property names that should not be edited.
	 */
	private List<String> excludedPropertyNames = Arrays.asList( "base_Class" );
	
	
	/**
	 * 
	 * Constructor.
	 *
	 */
	public StereoptypeModel() {
	}
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param profileCatalog The {@link ProfileCatalog} used to lookup {@link Profile} and {@link Stereotype} from a name.
	 * @param selectedElement The targetted uml {@link NamedElement}. This is the element to which the {@link Stereotype} is to be applied.
	 */
	public StereoptypeModel( ProfileCatalog profileCatalog, Element selectedElement) {
		this.profileCatalog = profileCatalog;
		this.targetElement = selectedElement;
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
	@SuppressWarnings("unchecked")
	public List<PropertyModel> getProperties() {
		return properties;
	}


	
	/**
	 * @return the metaclasses
	 */
	public List<MetaclassModel> getMetaclasses() {
		return metaclasses;
	}

	/**
	 * @return the extendedStereotypes
	 */
	public List<ExtendedStereotypeModel> getExtendedStereotypes() {
		return extendedStereotypes;
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
		
		if( profileCatalog == null) {
			stereotype = null;
			resetMetaclasses();
			resetExtendedStereotypes();
			resetProperties();
			return;
		}
		
		// Change other properties.
		// TODO Events should be sent each time a property change
		try {
			stereotype = profileCatalog.lookupStereotype(profileName, stereotypeName);
			resetMetaclasses();
			resetExtendedStereotypes();
			resetProperties();
			
		} catch (NotFoundException e) {
			// exit
			stereotype = null;
			resetMetaclasses();
			resetExtendedStereotypes();
			resetProperties();
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


		List<MetaclassModel> toRetain = new ArrayList<MetaclassModel>();
		
		for( MetaclassModel model : metaclasses) {
			if(model.getStateKind() == StateKind.created) {
				toRetain.add(model);
			}
		}

		metaclasses.clear();
		metaclasses.addAll(toRetain);
		
//		Iterator<MetaclassesModel> it = metaclasses.iterator();
//		while(it.hasNext()) {
//			MetaclassesModel model = (MetaclassesModel)it.next();
//			if(model.getModelStatus() != ModelStatusKind.created) {
//				it.remove();
//			}
//		}
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
			metaclasses.add(new MetaclassModel(MemberKind.owned, extendedMetaClass));
		}
		
		// Add inherited (not owned) metaclasses.
		for( Class extendedMetaClass : stereotype.getAllExtendedMetaclasses()) {
			if( ! ownedExtendedMetaclasses.contains(extendedMetaClass)) {
			   metaclasses.add(new MetaclassModel(MemberKind.inherited, extendedMetaClass));
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
			if(model.getStateKind()  == StateKind.created) {
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
			extendedStereotypes.add(new ExtendedStereotypeModel(MemberKind.owned, superClass));
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
			if(model.getStateKind() == StateKind.created) {
				toRetain.add(model);
			}
		}
		
		properties.clear();
		properties.addAll(toRetain);
		
		// Next works for the model, but the ui is not updated
//		@SuppressWarnings("unchecked")
//		Iterator<PropertyModel> it = properties.iterator();
//		while(it.hasNext()) {
//			PropertyModel model = (PropertyModel)it.next();
//			if(model.getModelStatus() != ModelStatusKind.created) {
//				it.remove();
//			}
//		}

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
			// filter some properties
			if(isPropertyExcluded(property)) {
				continue;
			}
			properties.add(new PropertyModel(MemberKind.owned, property, getPropertyValue(property)));
		}
		
		// Add inherited (not owned) metaclasses.
		for( Property property : stereotype.getAllAttributes()) {
			// filter some properties
			if(isPropertyExcluded(property)) {
				continue;
			}
			if( ! ownedProperties.contains(property)) {
				properties.add(new PropertyModel(MemberKind.inherited, property, getPropertyValue(property)));
			}
		}
	}

	final String BASE_PROPERTY_PREFIX = "base_";
	
	/**
	 * Return true if the Property is excluded from the list of available properties.
	 * Especially, remove all base_xxx properties.
	 * @param property
	 * @return
	 */
	private boolean isPropertyExcluded(Property property) {
		
		String propertyName = property.getName();
		if( propertyName == null) {
			return false;
		}

		if( propertyName.startsWith(BASE_PROPERTY_PREFIX) ) {
			// Check if this is the profile base_xxx reference
			String base_name = "base_" + property.getType().getName();
			// TODO improve by checking the name and the metaclasses
			
			if( propertyName.equals(base_name)) {
				// The property name is made of the BASE_PROPERTY_PREFIX and the Metaclass type name.
				// So, qwe remove it.
				return true;
			}
		}
		
		return excludedPropertyNames .contains( property.getName());
	}

	/**
	 * The uml element that is target of this StereotypeModel.
	 * Only methods reacting to the StereotypeName change should use this property.
	 */
	protected Element targetElement;
	
	/**
	 * Return the value of the specified property attached to the {@link #targetElement}.
	 * @param property
	 * @return
	 */
	protected Object getPropertyValue(Property property) {
		Object value = null;
		if(property == null || stereotype == null) {
			return null;
		}
		
		value = targetElement.getValue(stereotype, property.getName());
		
		return value;
	}
	/**
	 * Create a new {@link PropertyModel} and add it to the {@link StereoptypeModel#properties}
	 */
	public PropertyModel createNewPropertyModel() {
		
		return createNewPropertyModel("newProperty");
	}
	
	/**
	 * Create a new {@link PropertyModel} and add it to the {@link StereoptypeModel#properties}
	 */
	public PropertyModel createNewPropertyModel(String propertyName) {
		PropertyModel model = new PropertyModel(MemberKind.owned, propertyName);
		properties.add(model);
//		fireIndexedPropertyChange(PROPERTIES, properties.size()-1, null, model);
		
		return model;
	}
	
	/**
	 * Create a new {@link MetaclassModel} and add it to the {@link StereoptypeModel#metaclasses}
	 */
	public MetaclassModel createMetaclassModel(String propertyName) {
		MetaclassModel model = new MetaclassModel(MemberKind.owned, propertyName);
		metaclasses.add(model);
		
		return model;
	}
	
	/**
	 * Create a new {@link Ext} and add it to the {@link StereoptypeModel#metaclasses}
	 */
	public ExtendedStereotypeModel createExtendedStereotypeModel(String propertyName) {
		ExtendedStereotypeModel model = new ExtendedStereotypeModel(MemberKind.owned, propertyName);
		extendedStereotypes.add(model);
		
		return model;
	}
	
	/**
	 * Visitor entry to visit this Model and its nested classes.
	 * @param visitor
	 */
	public void accept(IModelVisitor visitor) {
		visitor.visit(this);
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

	
	/**
	 * @return the metaclassesCollection
	 */
	public MetaclassesModel getMetaclassesCollection() {
		return metaclassesCollection;
	}


}
