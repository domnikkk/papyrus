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

	
}
