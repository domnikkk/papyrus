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
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * @author cedric dumoulin
 *
 */
public class CheckSelectionHandler extends AbstractProfileBaseHandler {

	private List<NamedElement> cachedSelectionAsNamedElement;
	/**
	 * Constructor.
	 *
	 */
	public CheckSelectionHandler() {
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#getCommandName()
	 *
	 * @return
	 */
	@Override
	public String getCommandName() {
		return "Check Selection Type";
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#doExecute(org.eclipse.core.commands.ExecutionEvent, org.eclipse.core.expressions.IEvaluationContext, java.util.List)
	 *
	 * @param event
	 * @param context
	 * @param selections
	 */
	@Override
	protected void doExecute(ExecutionEvent event, IEvaluationContext context) {

		cachedSelectionAsNamedElement = null;
		
		System.err.println("Add Profile called. Selected elements:");
		List<NamedElement> selected = getSelectionAsNamedElements(context);
		for( NamedElement ele : selected) {
			try {
				System.err.println(ele.getName());
				System.err.println("applicable stereotypes:" + ele.getApplicableStereotypes() );
				System.err.println("applied profiles:" + ele.getNearestPackage().getAllAppliedProfiles());
				System.err.println("profiles application:" + ele.getNearestPackage().getAllProfileApplications());
			} catch (Exception e) {
				System.err.println("error while printing data (" + e.getMessage() + ")");;
			}
		}
		System.err.println("********************");
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#resetCachedValues()
	 *
	 */
	@Override
	protected void resetCachedValues() {
		super.resetCachedValues();
		cachedSelectionAsNamedElement = null;
	}
	
	/**
	 * Get the list of selected element of type 'NamedElement'.
	 * 
	 * @param context
	 * @return
	 */
	protected List<NamedElement> getSelectionAsNamedElements(IEvaluationContext context) {
	
		if( cachedSelectionAsNamedElement == null) {

			cachedSelectionAsNamedElement = getSelectionsByType(context, NamedElement.class);
		}
		
		return cachedSelectionAsNamedElement;
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
