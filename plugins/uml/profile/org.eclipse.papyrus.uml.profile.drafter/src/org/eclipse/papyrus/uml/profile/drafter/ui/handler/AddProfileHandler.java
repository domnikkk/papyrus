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

package org.eclipse.papyrus.uml.profile.drafter.ui.handler;

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.uml.profile.definition.PapyrusDefinitionAnnotation;
import org.eclipse.papyrus.uml.profile.definition.ProfileRedefinition;
import org.eclipse.papyrus.uml.profile.definition.Version;
import org.eclipse.papyrus.uml.profile.utils.Util;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * @author cedric dumoulin
 *
 */
public class AddProfileHandler extends AbstractBaseHandler {

	/**
	 * Constructor.
	 *
	 */
	public AddProfileHandler() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#getCommandName()
	 *
	 * @return
	 */
	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "Add Profile";
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#doExecute(org.eclipse.core.commands.ExecutionEvent, org.eclipse.core.expressions.IEvaluationContext, java.util.List)
	 *
	 * @param event
	 * @param context
	 * @param selections
	 */
	@Override
	protected void doExecute(ExecutionEvent event, IEvaluationContext context, List<Object> selections) {

		System.err.println("Add Profile called");
	}

	/**
	 * Lookup the metaclass of type "Class"
	 * 
	 * @param profile
	 * @return
	 */
	private ElementImport lookupMetaclass(Profile profile, String aliasName) {
		//
		for( ElementImport ele : profile.getElementImports() ) {
			if(aliasName.equals(ele.getAlias() ) ) {
				return ele;
			}
		}
		// Not found;
		return null;
	}

	protected Extension createExtension( Stereotype source,  Type target) {
		//create the extension
		Extension newExtension = UMLFactory.eINSTANCE.createExtension();

		//create the endSource
		ExtensionEnd endSource = UMLFactory.eINSTANCE.createExtensionEnd();

			//initialize the endSource
			endSource.setName("extension_" + source.getName()); //$NON-NLS-1$ //$NON-NLS-2$
			endSource.setType(source);
			endSource.setAggregation(AggregationKind.COMPOSITE_LITERAL);

			//add the endSource to the extension
			newExtension.getOwnedEnds().add(endSource); // add extension end to extension


			//create source_property
			Property property = UMLFactory.eINSTANCE.createProperty();
			property.setName("base_" + target.getName());
			//	property.setIsDerived(true);
			property.setType(target); // set the type
			property.setAssociation(newExtension); // Set the association link
			property.setAggregation(AggregationKind.NONE_LITERAL);

			newExtension.getMemberEnds().add(property);

			source.getOwnedAttributes().add(property);

			return newExtension;
	}
	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#isEnabled(org.eclipse.core.expressions.IEvaluationContext, java.util.List)
	 *
	 * @param context
	 * @param selections
	 * @return
	 */
	@Override
	public boolean isEnabled(IEvaluationContext context, List<Object> selections) {
		
		if( ! selections.isEmpty()  ) {
			return true;
		}
		
		 return false;
	}
}
