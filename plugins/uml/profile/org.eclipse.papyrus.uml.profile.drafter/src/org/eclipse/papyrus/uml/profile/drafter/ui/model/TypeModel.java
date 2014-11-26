package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Type;


/**
 * Model representing a type to be edited.
 * In this model, the uml::type is maintained automatically when the Type label is changed.
 * 
 * 
 * @author cedric dumoulin
 *
 */
public class TypeModel extends ModelChangeSupport {

	public static final String TYPE_PROPERTY = "Type";

	public static final String TYPE_LABEL_PROPERTY = "TypeLabel";

	/**
	 * The label of the type. 
	 */
	private String typeLabel;
	
	/**
	 * The corresponding {@link Type}
	 */
	private Type type;
	
	/**
	 * Catalog used to find a type from its label.
	 * TODO Is this still used ? Remove ?
	 */
	private ITypeCatalog typeCatalog;
	
	
	/**
	 * Constructor.
	 *
	 * @param typeCatalog
	 */
	public TypeModel(ITypeCatalog typeCatalog) {
		this.typeCatalog = typeCatalog;
	}


	/**
	 * Constructor.
	 *
	 * @param typeCatalog
	 * @param type
	 */
	public TypeModel(ITypeCatalog typeCatalog, Type type) {
		this.typeCatalog = typeCatalog;
		this.type = type;
	}


	/**
	 * @return the typeLabel
	 */
	public String getTypeLabel() {
		return typeLabel;
	}

	
	/**
	 * @param typeLabel the typeLabel to set
	 * 
	 * @throws NotFoundException if the typeLabel do not correspond to a valid type.
	 */
	public void setTypeLabel(String typeLabel) throws NotFoundException {
		// Lookup the corresponding type
		
		throw new UnsupportedOperationException("Not implemented");
//			Type type = typeCatalog.getType(typeLabel);
//			setTypeInternal(type);
//			setTypeLabelInternal(typeLabel);
		
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
		
//		String typeLabel = typeCatalog.getTypeLabel(type);
		setTypeInternal(type);
//		setTypeLabelInternal(typeLabel);
	}


	/**
	 * @param typeLabel the typeLabel to set
	 */
	protected void setTypeLabelInternal(String typeLabel) {
		firePropertyChange(TYPE_LABEL_PROPERTY, this.typeLabel, this.typeLabel = typeLabel);
	}
	
	/**
	 * @param type the type to set
	 */
	protected void setTypeInternal(Type type) {
		firePropertyChange(TYPE_PROPERTY, this.type, this.type = type);
	}

}
