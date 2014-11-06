package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


/**
 * Base class providing common change support for models.
 * 
 * @author cedric dumoulin
 *
 */
abstract public class ModelChangeSupport {

	/**
	 * Event manager
	 */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	public ModelChangeSupport() {
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
