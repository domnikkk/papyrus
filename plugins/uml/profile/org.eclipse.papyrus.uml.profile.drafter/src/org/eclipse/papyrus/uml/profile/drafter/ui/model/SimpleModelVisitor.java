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


/**
 * A simple visitor visiting Models.
 * visit() method call doXX() methods and walk nested models.
 * 
 * @author cedric dumoulin
 *
 */
public abstract class SimpleModelVisitor implements IModelVisitor {

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel)
	 *
	 * @param model
	 */
	@Override
	public void visit(StereoptypeModel model) {

		doVisit(model);
		// Now visit nested models
		for( PropertyModel propertyModel : model.getProperties()) {
			propertyModel.accept(this);
		}

		for( MetaclassModel m : model.getMetaclasses()) {
			m.accept(this);
		}

		for( ExtendedStereotypeModel m : model.getExtendedStereotypes()) {
			m.accept(this);
		}

	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel)
	 *
	 * @param model
	 */
	@Override
	public void visit(PropertyModel model) {
		doVisit(model);
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassModel)
	 *
	 * @param model
	 */
	@Override
	public void visit(MetaclassModel model) {
		doVisit(model);
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.ExtendedStereotypeModel)
	 *
	 * @param model
	 */
	@Override
	public void visit(ExtendedStereotypeModel model) {
		doVisit(model);
     }
	
	/**
	 * Do visit the specified model. This can be overload by subclasses.
	 * 
	 * @param model
	 */
	public void doVisit(StereoptypeModel model) {
		
	}

	/**
	 * Do visit the specified model. This can be overload by subclasses.
	 * 
	 * @param model
	 */
	public void doVisit(PropertyModel model) {
		
	}

	/**
	 * Do visit the specified model. This can be overload by subclasses.
	 * 
	 * @param model
	 */
	public void doVisit(MetaclassModel model) {
		
	}

	/**
	 * Do visit the specified model. This can be overload by subclasses.
	 * 
	 * @param model
	 */
	public void doVisit(ExtendedStereotypeModel model) {
		
	}

}
