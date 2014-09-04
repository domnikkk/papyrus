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
import org.eclipse.uml2.uml.Stereotype;


/**
 * Model that represent one {@link StereoptypeModel}'s extended sterotype.
 * @author cedric dumoulin
 *
 */
public class ExtendedStereotypeModel {
	/**
	 * The status of the model. ModelStatusKind.created mean that the model is created by the user.
	 */
	protected ModelStatusKind modelStatusKind = ModelStatusKind.created;
	/**
	 * The {@link Stereotype} that the Stereotype extends. This is the stereotype represented by this model.
	 */
	protected Class extendedStereotype;
	
	/**
	 * The name proposed by the user for this Property.
	 */
	protected String proposedName;
	
	/**
	 * Constructor.
	 *
	 * @param modelStatusKind
	 */
	public ExtendedStereotypeModel(ModelStatusKind modelStatusKind) {
		this.modelStatusKind = modelStatusKind;
	}




	public ExtendedStereotypeModel(ModelStatusKind modelStatusKind, Class superClass) {
		this.modelStatusKind = modelStatusKind;
		this.extendedStereotype = superClass;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param created
	 * @param string
	 */
	public ExtendedStereotypeModel(ModelStatusKind modelStatusKind, String proposedName) {
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
