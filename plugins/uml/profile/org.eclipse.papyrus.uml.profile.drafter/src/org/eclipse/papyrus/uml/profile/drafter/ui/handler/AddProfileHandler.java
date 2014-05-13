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
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.uml.profile.drafter.ProfileApplicator;
import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.DraftProfileException;
import org.eclipse.swt.widgets.Display;
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
public class AddProfileHandler extends AbstractProfileBaseHandler {

	private List<NamedElement> cachedSelectionAsNamedElement;
	
	private String stereotypeNameInput;
	private String profileNameInput;
	
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
		return "Add Profile";
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.handler.AbstractBaseHandler#preExecute(org.eclipse.core.commands.ExecutionEvent, org.eclipse.core.expressions.IEvaluationContext)
	 *
	 * @param event
	 * @param context
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected boolean preExecute(ExecutionEvent event, IEvaluationContext context) throws ExecutionException {

		// Open the dialog to ask the new name
		// TODO dialog should not be in the transaction !! put it outside !
		String inputName = null;
		InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), "Attach a Stereotype to Selected Element", "Enter the stereotype name.", inputName, null);
		if(dialog.open() == Window.OK) {
			inputName = dialog.getValue();
			if(inputName == null || inputName.length() <= 0) {
				return false;
			}
		} else {
			// cancelled
			return false;
		}

		stereotypeNameInput = inputName;
		profileNameInput = "testProfile";
		
		System.err.println("Try to apply stereotype '" + profileNameInput + ":" +stereotypeNameInput + "'");
		return true;
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

		System.err.println("Add Profile called. Selected elements:");
		List<NamedElement> selected = getSelectionAsNamedElements(context);
		for( NamedElement ele : selected) {
				System.err.println(ele.getName());
		}
		System.err.println("********************");
		
		if( selected.isEmpty()) {
			return;
		}
		
		// Try to apply the stereotype
		ProfileApplicator profileApplicator = new ProfileApplicator(selected.get(0));
		try {
			profileApplicator.applyStereotype(profileNameInput, stereotypeNameInput);
		} catch (DraftProfileException e) {
			e.printStackTrace();
		}
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
		stereotypeNameInput = null;
		profileNameInput = null;
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
