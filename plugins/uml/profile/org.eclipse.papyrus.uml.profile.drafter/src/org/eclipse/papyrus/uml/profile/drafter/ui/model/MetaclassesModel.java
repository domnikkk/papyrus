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

import org.eclipse.uml2.uml.Class;


/**
 * Model that represent one {@link StereoptypeModel}'s extended metaclasses.

 * @author cedric dumoulin
 *
 */
public class MetaclassesModel {

	/**
	 * The status of the model. ModelStatusKind.created mean that the model is created by the user.
	 */
	ModelStatusKind modelStatusKind = ModelStatusKind.created;
	
	/**
	 * The Metaclass that the Stereotype extends. This is the metaclass represented by this model.
	 */
	private Class extendedMetaClass;
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	
	
	
	/**
	 * Constructor.
	 *
	 * @param modelStatusKind
	 */
	public MetaclassesModel(ModelStatusKind modelStatusKind) {
		this.modelStatusKind = modelStatusKind;
	}




	public MetaclassesModel(ModelStatusKind modelStatusKind, Class extendedMetaClass) {
		this.modelStatusKind = modelStatusKind;
		this.extendedMetaClass = extendedMetaClass;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public MetaclassesModel(ModelStatusKind modelStatusKind, String proposedName) {
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
	 * @return the extendedMetaClass
	 */
	protected Class getExtendedMetaClass() {
		return extendedMetaClass;
	}

}
