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

import org.eclipse.papyrus.uml.profile.drafter.commands.CompoundCommand;
import org.eclipse.papyrus.uml.profile.drafter.commands.ValueProxy;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;


/**
 * @author dumoulin
 *
 */
public class CommandBuilderVisitor extends SimpleModelVisitor {

	/**
	 * The resulting command build by this visitor.
	 */
	protected CompoundCommand compoundCommand;
	
	/**
	 * The shared value containing the current stereotype
	 */
	protected ValueProxy<Stereotype> curStereotype;
	
	/**
	 * The shared value associated to the latest encountered {@link PropertyModel}.
	 * 
	 */
	protected ValueProxy<Property> curProperty;
	
	/**
	 * The shared value associated to the latest encountered Property Value.
	 * TODO : set the right type !!
	 * 
	 */
	protected ValueProxy<Property> curPropertyValue;
	
	/**
	 * Constructor.
	 *
	 */
	public CommandBuilderVisitor() {
		compoundCommand = new CompoundCommand();
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel)
	 *
	 * @param model
	 */
	@Override
	public void doVisit(StereoptypeModel model) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel)
	 *
	 * @param model
	 */
	@Override
	public void doVisit(PropertyModel model) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassesModel)
	 *
	 * @param model
	 */
	@Override
	public void doVisit(MetaclassesModel model) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.IModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.ExtendedStereotypeModel)
	 *
	 * @param model
	 */
	@Override
	public void doVisit(ExtendedStereotypeModel model) {
		// TODO Auto-generated method stub

	}

}
