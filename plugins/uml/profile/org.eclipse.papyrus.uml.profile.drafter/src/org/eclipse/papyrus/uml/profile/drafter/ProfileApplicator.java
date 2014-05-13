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

package org.eclipse.papyrus.uml.profile.drafter;

import java.util.List;

import org.eclipse.papyrus.uml.profile.definition.PapyrusDefinitionAnnotation;
import org.eclipse.papyrus.uml.profile.definition.ProfileRedefinition;
import org.eclipse.papyrus.uml.profile.definition.Version;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.DraftProfileException;
import org.eclipse.papyrus.uml.profile.utils.Util;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * 
 * @author cedric dumoulin
 *
 */
public class ProfileApplicator {

	/**
	 * Uml Element target of the applicator.
	 * 
	 */
	protected NamedElement umlElement;
	
	/**
	 * Constructor.
	 *
	 * @param umlElement
	 */
	public ProfileApplicator(NamedElement umlElement) {
		super();
		this.umlElement = umlElement;
	}
	
	/**
	 * @return the umlElement
	 */
	public NamedElement getUmlElement() {
		return umlElement;
	}


	public List<Profile> getAppliedProfiles() {
		return umlElement.getNearestPackage().getAppliedProfiles();
		
	}
	
	/**
	 * Apply the specified stereotype from the specified profile to the umlElement.
	 * Create any missing element.
	 * 
	 * @param profileName
	 * @param stereotypeName
	 * @throws DraftProfileException 
	 */
	public void applyStereotype( String profileName, String stereotypeName) throws DraftProfileException {
		
		// lookup profile
		Profile profile = umlElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			// ask creation confirmation
			createProfile(profileName);
			// TODO change next behavior
			throw new DraftProfileException("Profile '" + profileName + "' not applied on nesting packages. Apply profile first.");
		}
		
		// Lookup stereotype
		Stereotype stereotype = profile.getApplicableStereotype(stereotypeName);
		if( stereotype == null ) {
			// ask creation confirmation
			// TODO change next behavior
			stereotype = createStereotype(profile, stereotypeName);
//			throw new DraftProfileException("Profile '" + stereotypeName + "' do not exist in Profile 'profileName'.");
		}
		
		// Apply stereotype to element
		applyStereotype( stereotype);
	}

	/**
	 * 
	 * @param profileName
	 */
	private void createProfile(String profileName) {
		Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(profileName);
		
	}

	/**
	 * Apply the specified stereotype to the umlElement.
	 * @param stereotype
	 */
	public void applyStereotype(Stereotype stereotype) {
		umlElement.applyStereotype(stereotype);
	}
	
	/**
	 * Create a new Stereotype in the provided Profile
	 * 
	 * @param profile
	 * @param stereotypeName
	 * @return
	 */
	public Stereotype createStereotype( Profile profile, String stereotypeName) {
		
		System.err.println("Try to create stereotype");
		// Remember which package apply the profile
		Package applicantPackage = getApplicantPackage(profile);
		
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

		
//		// Reapply to main package
//		ServicesRegistry servicesRegistry = lookupServicesRegistry(context);
//		
////	ModelSet modelSet = ServiceUtilsForIEvaluationContext.getInstance().getModelSet(context);
//		UmlModel umlModel = UmlUtils.getUmlModelChecked(servicesRegistry);
//		Package rootPackage = (Package)umlModel.lookupRoot();
//		
//		rootPackage.applyProfile(profile);
		
		// Re-Apply profile to its package
		applicantPackage.applyProfile(profile);
		
		return stereotype;
	}

	/**
	 * 
	 * @param metaclassName
	 * @return
	 */
	public ElementImport getMetaClassImport( Profile profile, String metaclassName ) {
		
		ElementImport metaclass = lookupMetaclass(profile, "Class");

		if( metaclass !=null ) {
			return metaclass;
		}
		
		// Not found, create the import
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
//		return null;
	}
	
	/**
	 * Lookup the {@link Package} applying the specified profile. Start lookup from the umlElement.
	 * 
	 * @param profile
	 * @return
	 */
	private Package getApplicantPackage(Profile profile) {
		ProfileApplication profileApplication = null;
		
		Package container = umlElement.getNearestPackage();
		while(profileApplication == null && container != null) {
			profileApplication = container.getProfileApplication(profile);
			if( profileApplication != null) {
				return container;
			}
			container = container.getNestingPackage();
		}
		return null;
	}

	/**
	 * Lookup the nearest {@link ProfileApplication} declaring the {@link Profile}.
	 * 
	 * @param stereotype
	 * @return
	 *         the nearest profile application owning the stereotype
	 */
	public ProfileApplication getNearestProfileApplication(Profile profile) {
		ProfileApplication profileApplication = null;
		
		Package container = umlElement.getNearestPackage();
		while(profileApplication == null && container != null) {
			profileApplication = container.getProfileApplication(profile);
			container = container.getNestingPackage();
		}
		return profileApplication;
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
}
