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

import static org.eclipse.papyrus.uml.profile.drafter.Activator.log;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.uml.profile.utils.Util;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation;
import org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition;
import org.eclipse.papyrus.uml.tools.profile.definition.Version;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
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
public class CreateProfileHandler extends AbstractBaseHandler {

	/**
	 * Constructor.
	 *
	 */
	public CreateProfileHandler() {
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
		return "Create new Profile";
	}

	/**
	 * Compute the selection.
	 * @param event
	 * @param context
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected boolean preExecute(ExecutionEvent event, IEvaluationContext context) throws ExecutionException {
		// Get the selection here in order to not do it in the transaction.
		getCachedSelections(context);
		
		return super.preExecute(event, context);
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

		String stereotypeName ="MyNewStereotype";
		List<Object> selections = getCachedSelections(context);
		
		if( !(selections.get(0) instanceof Profile ) ) {
			return;
		}
		try {
			log.info("Create new profile called ...");
			
			Profile profile = (Profile)selections.get(0);
			
			
			
			// Create a new stereotype
			Stereotype stereotype = UMLFactory.eINSTANCE.createStereotype();
			stereotype.setName(stereotypeName);
			profile.getPackagedElements().add(stereotype);
			// TODO : set application
			ElementImport target = lookupMetaclass(profile, "Class");
			Extension extension = createExtension(stereotype, (Type)target.getImportedElement());
			extension.setName("E_" + stereotype.getName());
			profile.getPackagedElements().add(extension);
			
			// Define the profile
			profile.define();

			// Define the profile annotation (from Papyrus)
			// == adapt to Papyrus
			Version curVersion = Util.getProfileDefinitionVersion(profile);
			Version version = new Version(curVersion.getMajor(), curVersion.getMinor(), curVersion.getMicro()+4);
			PapyrusDefinitionAnnotation papyrusAnnotation = new PapyrusDefinitionAnnotation(version, "", "", "", "");
			// define the profile
			ProfileRedefinition.redefineProfile(profile, papyrusAnnotation);
			ProfileRedefinition.cleanProfile(profile);

			
			// Reapply to main package
			ServicesRegistry servicesRegistry = lookupServicesRegistry(context);
			
//		ModelSet modelSet = ServiceUtilsForIEvaluationContext.getInstance().getModelSet(context);
			UmlModel umlModel = UmlUtils.getUmlModelChecked(servicesRegistry);
			Package rootPackage = (Package)umlModel.lookupRoot();
			
			rootPackage.applyProfile(profile);
			
			log.info("    ... New profile created");
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("    ... Profile creation failed !!", e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("    ... Profile creation failed !!", e);
		}
		
		
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
		
		if( ! selections.isEmpty() && selections.get(0) instanceof Profile ) {
			return true;
		}
		
		 return false;
	}
}
