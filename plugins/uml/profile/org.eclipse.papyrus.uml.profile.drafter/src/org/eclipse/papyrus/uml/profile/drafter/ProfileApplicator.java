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

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.profile.Activator;
import org.eclipse.papyrus.uml.profile.drafter.commands.CreateProfileAndProfileResourceCommand;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.DraftProfileException;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.papyrus.uml.profile.drafter.ui.dialog.IStereotypeUpdateArgs;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassesModel;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel;
import org.eclipse.papyrus.uml.profile.utils.Util;
import org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation;
import org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition;
import org.eclipse.papyrus.uml.tools.profile.definition.Version;
import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
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
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.Profile2EPackageConverter;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

/**
 * This class hold a {@link NamedElement} and provides utility methods to manage {@link Stereotype} on this
 * element.
 * 
 * @author cedric dumoulin
 *
 */
public class ProfileApplicator {

	/**
	 * Uml Element target of the applicator.
	 * This is the element for which we create/update a Profile ans stereotype
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


	/**
	 * Return the Profiles applied to the nearest package of the umlElement.
	 * @return A list of profiles applied to the nearest package of the umlElement.
	 * 
	 * @unused
	 */
	public List<Profile> getAppliedProfiles() {
		return umlElement.getNearestPackage().getAppliedProfiles();
	}
	
	/**
	 * Update or create the specified stereotype according to the provided {@link IStereotypeUpdateArgs}.
	 * 
	 * @param updateArgs Arguments used to update or create a Stereotype.
	 * 
	 * @throws DraftProfileException If an error occur during update.
	 */
	public void updateStereotype(IStereotypeUpdateArgs updateArgs) throws DraftProfileException {
		
		String profileName = updateArgs.getProfileName(); 
		String stereotypeName = updateArgs.getStereotypeName();
		
		boolean isProfileModified = false;
		// The package to which the corresponding Profile is attached
		Package applicantPackage = null;
		
		PapyrusDefinitionAnnotation annotations = null;
		Stereotype stereotype = null;
		// lookup profile
		Profile profile = umlElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			// ask creation confirmation
			profile = createProfile(profileName);
			// Create the stereotype
			stereotype = createStereotype(profile, stereotypeName);

//			applyProfileToUmlElement( profile);
			// TODO change next behavior
//			throw new DraftProfileException("Profile '" + profileName + "' not applied on nesting packages. Apply profile first.");

			// We will apply profile in nearest PAckage 
			// TODO let choose between nearest, root or choosen
			applicantPackage = umlElement.getNearestPackage();
			annotations = createPapyrusDefinitionAnnotation(0, 0, 1);
			isProfileModified = true;
		}
		else {
			// Profile already exist
			// Lookup for the stereotype
			stereotype = profile.getOwnedStereotype(stereotypeName, true);
			applicantPackage = getApplicantPackage(profile);
			if( stereotype == null ) {
				// We need to create the stereotype
				// ask creation confirmation
				// TODO change next behavior
				stereotype = createStereotype(profile, stereotypeName);
				annotations = createUpdatedPapyrusDefinitionAnnotation(profile, 0, 0, 1);
				isProfileModified = true;
			}
		}
		
		// update metaclasses by adding missing metaclasses
		if( ! updateArgs.getExtendedMetaclasses().isEmpty() ) {
			isProfileModified = updateStereotypeMetaclasses( stereotype, updateArgs.getExtendedMetaclasses()) || isProfileModified  ;
		}
		
		// Do we need to reapply the profile ?
		// We do it only if the profile is modified
		if( isProfileModified) {
			definesAllProfiles( profile );
			redefineAllProfiles( profile, annotations );
			cleanAllProfiles( profile );
//			validateAllProfiles(profile, Arrays.asList((EPackage)profile) );
			applyProfile( applicantPackage, profile);
		}
		
		// Apply stereotype to element
		applyStereotype( stereotype );
		
	}

	/**
	 * Add metaclasses to the specified {@link Stereotype}. Only add metaclasses that are not alread attached.
	 * Also create any required {@link ElementImport}
	 * 
	 * @param stereotype
	 * @param extendedMetaclasses
	 * @return True if the Stereotype is updated by adding one of the specified metaclass, false if the stereotype is not modified (the metaclass was already attached).
	 */
	private boolean updateStereotypeMetaclasses(Stereotype stereotype, List<Class> extendedMetaclasses) {

		boolean updated = false;
		for( Class metaclass : extendedMetaclasses ) {
				// add the metaclass to stereotype
			updated = updateMetaclassToStereotype( stereotype, metaclass) || updated;
		}
		return updated;
	}

	/**
	 * Add the specified metaclass to the stereotype. Do nothing if the metaclass already exist.
	 * This implies creating an {@link Extension} between the {@link Stereotype} and the Metaclass.
	 * Also create any required {@link ElementImport}.
	 * 
	 * @param stereotype The stereotype to which the metaclass should be added
	 * @param metaclass The metaclass to add.
	 * @return True if the Stereotype is modified by adding the specified metaclass, false if the stereotype is not modified (the metaclass was already attached).
	 * 
	 */
	@SuppressWarnings("unused")
	private boolean updateMetaclassToStereotype(Stereotype stereotype, Class metaclass) {
		
		if( stereotype.getExtendedMetaclasses().contains(metaclass) ) {
			return false;
		}
		
		// Ensure that a corresponding ElementImport exists in one of te 
		// stereotype container.
		ElementImport target = stereotype.getProfile().getMetaclassReference(metaclass, true);
//		ElementImport target = getMetaclassElementImport(stereotype, metaclass);
		
		// Create extension
		Extension extension = stereotype.createExtension(metaclass, false);
//		Extension extension = createExtension(stereotype, (Type)target.getImportedElement());
//		extension.setName("Ext_" + stereotype.getName() + "_" + metaclass.getName());
		// Add the extension to the profile package owning this stereotype
		stereotype.getNearestPackage().getPackagedElements().add(extension);
//		stereotype.getProfile().getPackagedElements().add(extension);
		return true;
	}

	/**
	 * Apply the specified stereotype from the specified profile to the umlElement.
	 * Create any missing element.
	 * 
	 * @param profileName
	 * @param stereotypeName
	 * @throws DraftProfileException 
	 * 
	 * @{@link Deprecated} use {@link #updateStereotype(IStereotypeUpdateArgs)} or {@link #applyStereotype2(String, String)}
	 */
	public void applyStereotype( String profileName, String stereotypeName) throws DraftProfileException {
		
		// lookup profile
		Profile profile = umlElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			// ask creation confirmation
			profile = createProfile(profileName);
			applyProfileToUmlElement( profile);
			// TODO change next behavior
//			throw new DraftProfileException("Profile '" + profileName + "' not applied on nesting packages. Apply profile first.");
		}
		
		// Lookup stereotype
		Stereotype stereotype = profile.getApplicableStereotype(stereotypeName);
		if( stereotype == null ) {
			// ask creation confirmation
			// TODO change next behavior
			stereotype = createStereotypeAndRedefineProfile(profile, stereotypeName);
//			throw new DraftProfileException("Profile '" + stereotypeName + "' do not exist in Profile 'profileName'.");
		}
		
		// Apply stereotype to element
		applyStereotype( stereotype);
	}

	/**
	 * Apply the specified stereotype from the specified profile to the umlElement.
	 * Create any missing elements ( {@link Profile}, {@link ElementImport} ...).
	 * 
	 * @param profileName
	 * @param stereotypeName
	 * @throws DraftProfileException 
	 */
	public void applyStereotype2( String profileName, String stereotypeName) throws DraftProfileException {
		
		boolean isProfileModified = false;
		Package applicantPackage = null;
		
		PapyrusDefinitionAnnotation annotations = null;
		Stereotype stereotype = null;
		// lookup profile
		Profile profile = umlElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			// ask creation confirmation
			profile = createProfile(profileName);
			// Create the stereotype
			stereotype = createStereotype(profile, stereotypeName, "Class");

//			applyProfileToUmlElement( profile);
			// TODO change next behavior
//			throw new DraftProfileException("Profile '" + profileName + "' not applied on nesting packages. Apply profile first.");

			// We will apply profile in nearest PAckage 
			// TODO let choose between nearest, root or choosen
			applicantPackage = umlElement.getNearestPackage();
			annotations = createPapyrusDefinitionAnnotation(0, 0, 1);
			isProfileModified = true;
		}
		else {
			// Profile already exist
			// Lookup for the stereotype
			stereotype = profile.getOwnedStereotype(stereotypeName, true);
			if( stereotype == null ) {
				// We need to create the stereotype
				// ask creation confirmation
				// TODO change next behavior
				stereotype = createStereotype(profile, stereotypeName, "Class");
				applicantPackage = getApplicantPackage(profile);
				annotations = createUpdatedPapyrusDefinitionAnnotation(profile, 0, 0, 1);
				isProfileModified = true;
			}
		}
		
		// Do we need to reapply the profile ?
		if( isProfileModified) {
			definesAllProfiles( profile );
			redefineAllProfiles( profile, annotations );
			cleanAllProfiles( profile );
//			validateAllProfiles(profile, Arrays.asList((EPackage)profile) );
			applyProfile( applicantPackage, profile);
		}
		
		// Apply stereotype to element
		applyStereotype( stereotype );
	}

	/**
	 * Apply the specified profile to the specified package.
	 * see {@link Package#applyProfile(Profile)};
	 * 
	 * @param applicantPackage
	 * @param profile
	 */
	private void applyProfile(Package applicantPackage, Profile profile) {
		applicantPackage.applyProfile(profile);
	}

	/**
	 * Validate specified profiles.
	 * Copied from org.eclipse.papyrus.uml.diagram.profile.custom.commands.DefineProfileCommand
	 * 
	 * @param rootObject The object used as a root of object to validate. This is usually the Profile containing object to validate.
	 * 
	 * @param objectsToValidate List of objects (here Profile) to validate.
	 * @return The status of the validation.
	 */
	private IStatus validateAllProfiles(EObject rootObject, List<EPackage> objectsToValidate) {

		EditingDomain domain = EMFHelper.resolveEditingDomain(rootObject);
		AdapterFactory adapterFactory = domain instanceof AdapterFactoryEditingDomain ? ((AdapterFactoryEditingDomain)domain).getAdapterFactory() : null;
		Diagnostician diagnostician = createDiagnostician(adapterFactory, new NullProgressMonitor());
		BasicDiagnostic diagnostic = diagnostician.createDefaultDiagnostic(rootObject);
		Map<Object, Object> context = diagnostician.createDefaultContext();

		for(EPackage ePackage : objectsToValidate) {
			diagnostician.validate(ePackage, diagnostic, context);
		}

		if(diagnostic.getSeverity() == Diagnostic.ERROR) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The defined profile is invalid");
		}

		if(diagnostic.getSeverity() == Diagnostic.WARNING) {
			return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "The profile has been successfully defined");
		}

		return Status.OK_STATUS;
	}

	/**
	 * Call {@link Profile#define()} to all Profile nested in the specified Package.
	 * If the Package is a Profile, define it also.
	 * 
	 * @param container
	 */
	private void definesAllProfiles(Package container) {

		defineAllProfiles(container, true);
	}

	/**
	 * Perform changes in Profile definition, in order to meet Papyrus requirements. Add also 
	 * Profile versions and annotations.
	 * 
	 * @param profile
	 * @param annotations
	 */
	private void redefineAllProfiles(Profile profile, PapyrusDefinitionAnnotation annotations) {
		ProfileRedefinition.redefineProfile(profile, annotations);
	}

	/**
	 * Clean indirect EClass from the provided profile.
	 * Required by Papyrus.
	 * 
	 * @param profile
	 */
	private void cleanAllProfiles(Profile profile) {
		ProfileRedefinition.cleanProfile(profile);
	}

	/**
	 * Apply the Profile to the nearest Package of the umlElement.
	 * 
	 * @param profile
	 * @throws DraftProfileException 
	 * @deprecated Only used by deprecated methods.
	 */
	private void applyProfileToUmlElement(Profile profile) throws DraftProfileException {


		Package nearestPackage = umlElement.getNearestPackage();
		if( nearestPackage == null) {
			throw new DraftProfileException("Can't get nearest Package for element '" + umlElement.getName() +"'");

		}
		
		nearestPackage.applyProfile(profile);
	}

	/**
	 * Create the specified Profile
	 * @param profileName The name of the Profile to create.
	 * 
	 */
	private Profile createProfile(String profileName) {
//		Profile profile = UMLFactory.eINSTANCE.createProfile();
//		profile.setName(profileName);
//		
//		return profile;
		
		CreateProfileAndProfileResourceCommand createCmd = new CreateProfileAndProfileResourceCommand(profileName, getModelSet());
		
		createCmd.execute();
		
		return createCmd.getResultProfile();
	}

	/**
	 * Get the modelSet owning the uml model owning the umlElement.
	 * 
	 * @return
	 */
	private ModelSet getModelSet() {
		
		ResourceSet rs = umlElement.eResource().getResourceSet();
		// In Papyrus, The ResourceSet is an ModelSet.
		return (ModelSet)rs;
		
	}

	/**
	 * Apply the specified stereotype to the umlElement.
	 * @param stereotype
	 */
	public void applyStereotype(Stereotype stereotype) {
		// Check application
		if (umlElement.getStereotypeApplication(stereotype) != null) {
		  return;
		}
		// not applied : do it !
		umlElement.applyStereotype(stereotype);
	}
	
	/**
	 * Create a new Stereotype in the provided Profile. 
	 * 
	 * @param profile
	 * @param stereotypeName
	 * @return
	 */
	protected Stereotype createStereotype( Profile profile, String stereotypeName)  {
		
		// Create a new stereotype
		Stereotype stereotype = UMLFactory.eINSTANCE.createStereotype();
		stereotype.setName(stereotypeName);
		// Add the stereotype to the profile
		profile.getPackagedElements().add(stereotype);
				
		return stereotype;
	}

	/**
	 * Create a new Stereotype in the provided Profile
	 * 
	 * @param profile
	 * @param stereotypeName
	 * @return
	 * @throws NotFoundException If the uml::metaclass can't be found. 
	 */
	protected Stereotype createStereotype( Profile profile, String stereotypeName, String metaclassName) throws NotFoundException {
		
		// Create a new stereotype
		Stereotype stereotype = createStereotype(profile, stereotypeName);
		
		// If a metaclass name is specified, create an extension to its import.
		if( metaclassName != null) {
			ElementImport target = getElementImportByName(umlElement, metaclassName);
			Extension extension = createExtension(stereotype, (Type)target.getImportedElement());
			extension.setName("E_" + stereotype.getName());
			profile.getPackagedElements().add(extension);
		}
		
		return stereotype;
	}

	/**
	 * Create a new Stereotype in the provided Profile
	 * 
	 * @param profile
	 * @param stereotypeName
	 * @return
	 * @deprecated
	 */
	protected Stereotype createStereotypeAndRedefineProfile( Profile profile, String stereotypeName) {
		
		// Remember which package apply the profile
		Package applicantPackage = getApplicantPackage(profile);
		
		// Create a new stereotype
		Stereotype stereotype = UMLFactory.eINSTANCE.createStereotype();
		stereotype.setName(stereotypeName);
		profile.getPackagedElements().add(stereotype);
		
		// TODO : set application
		ElementImport target = lookupElementImportByName(profile, "Class");
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
	 * Create a {@link PapyrusDefinitionAnnotation} based on the actual definition found in the profile, and 
	 * with updated versions. 
	 * 
	 * @param profile
	 * @param majorInc
	 * @param minorInc
	 * @param microInc
	 * @return a new {@link PapyrusDefinitionAnnotation}
	 */
	protected PapyrusDefinitionAnnotation createUpdatedPapyrusDefinitionAnnotation(Profile profile, int majorInc, int minorInc, int microInc) {
		Version curVersion = Util.getProfileDefinitionVersion(profile);
		Version version = new Version(curVersion.getMajor() + majorInc, curVersion.getMinor()+minorInc, curVersion.getMicro()+microInc);
		PapyrusDefinitionAnnotation papyrusAnnotation = new PapyrusDefinitionAnnotation(version, "", "", "", "");		
		return papyrusAnnotation;
	}
	
	/**
	 * Create a  new {@link PapyrusDefinitionAnnotation} with the specified values. 
	 * 
	 * @param stereotype
	 * @param majorInc
	 * @param minorInc
	 * @param microInc
	 * @return a new {@link PapyrusDefinitionAnnotation}
	 */
	protected PapyrusDefinitionAnnotation createPapyrusDefinitionAnnotation( int majorInc, int minorInc, int microInc) {
		Version version = new Version(majorInc, minorInc, microInc);
		Date date = new Date();
		PapyrusDefinitionAnnotation papyrusAnnotation = new PapyrusDefinitionAnnotation(version, "", "", DateFormat.getInstance().format(date), "");		
		return papyrusAnnotation;
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
	 * Get the metaclass {@link ElementImport} for requested type. Lookup if the import already exist in Profile. Return it if found.
	 * Create it otherwise, by using the aliasName as a hint for the imported metaclass (ie: name ='Class'==> type=Class).
	 * 
	 * @param fromElement Uml:Element used as a starting point to lookup for the {@link ElementImport}. This element
	 *    is also used to lookup the rootContainer where the ElementImport will be created
	 * @return The requested metaclass
	 * @throws NotFoundException If the uml::metaclass can't be found
	 */
	private ElementImport getElementImportByName(Element fromElement, String aliasName) throws NotFoundException {
		
		ElementImport elementImport = lookupElementImportByName(fromElement, aliasName);
		if(elementImport == null) {
			elementImport = createMetaclassElementImport(fromElement, aliasName);
		}
		
		return elementImport;
	}

	/**
	 * Get the metaclass {@link ElementImport} for requested type. Lookup if the import already exist in Profile. Return it if found.
	 * Create it otherwise.
	 * 
	 * @param fromElement Uml:Element used as a starting point to lookup for the {@link ElementImport}. This element
	 *    is also used to lookup the rootContainer where the ElementImport will be created
	 * @return The Metaclass for which an element import is requested.
	 * 
	 * @throws NotFoundException If the uml::metaclass can't be found
	 */
	private ElementImport getMetaclassElementImport(Element fromElement, Class metaclass)  {
		
		ElementImport elementImport = lookupElementImportByName(fromElement, metaclass.getName());
		if(elementImport == null) {
			elementImport = createMetaclassElementImport(fromElement, metaclass);
		}
		
		return elementImport;
	}

	/**
	 * Create the {@link ElementImport} for the specified uml:metaClass name.
	 * 
	 * @param umlMetamodelLocator An uml Element used to locate the uml:metamodel throw the ResourceSet.
	 * @param aliasName
	 * @return
	 * @throws NotFoundException If the metaclass can't be found
	 */
	private ElementImport createMetaclassElementImport(Element fromElement, String aliasName) throws NotFoundException {

		// Get the corresponding metaclass
		Class metaclass = getUmlMetaClass(aliasName, fromElement);
		// Create the elementImport
		return createMetaclassElementImport(fromElement, metaclass);
	}

	/**
	 * Create the {@link ElementImport} for the specified uml:metaClass name.
	 * 
	 * @param umlMetamodelLocator An uml Element used to locate the uml:metamodel throw the ResourceSet.
	 * @param aliasName
	 * @return
	 * @throws NotFoundException If the metaclass can't be found
	 */
	private ElementImport createMetaclassElementImport(Element fromElement, Class metaclass) {
//		ElementImport elementImport = UMLFactory.eINSTANCE.createElementImport();
//		elementImport.setAlias(metaclass.getName());
//		elementImport.setImportedElement(metaclass);
//		// Add it to the root of the Profile model
//		getResourceRoot().creategetImportedElements().add(elementImport);
		
		ElementImport elementImport = getRootPackageContainer(fromElement).createElementImport(metaclass);
		elementImport.setAlias(metaclass.getName());
		return elementImport;
	}

	/**
	 * Get the {@link Package} root container to which the specified element belong.
	 * 
	 * @return
	 */
	private Package getRootPackageContainer(Element element) {
		// This is the root container
		return (Package)EcoreUtil.getRootContainer(element);
	}

	/**
	 * Get the metaclass with specified name in UML metamodel.
	 * Throw an exception if not found.
	 * 
	 * @param metaclassName
	 * @param ressourceLocator Any uml::Element allowing to get the ResourceSet for uml.
	 * @return
	 * @throws NotFoundException
	 */
	protected Class getUmlMetaClass( String metaclassName, Element ressourceLocator) throws NotFoundException {
		// TODO Use a cache for the previous result instead of computing it.
		List<Class> metaclasses = ElementUtil.getPossibleMetaclasses(ressourceLocator);
		
		for( Class curClass : metaclasses) {
			if( curClass.getName().equals(metaclassName)) {
				return curClass;
			}
		}
		
		// Not found
		throw new NotFoundException("No uml metaclass found with name '" + metaclassName + "'");
	}
	
	/**
	 * Lookup the {@link ElementImport} for the specified aliasName. Start lookup from the specified fromelement.
	 * 
	 * @param fromElement Uml:Element used as a starting point to lookup for the {@link ElementImport}. This element
	 *    is also used to lookup the rootContainer where the ElementImport will be created
	 * @param aliasName The name of the requested {@link ElementImport}.
	 * @return the {@link ElementImport} or null if not found.
	 */
	private ElementImport lookupElementImportByName(Element fromElement, String aliasName) {
		
		if( fromElement == null) {
			return null;
		}
		
		//
		if( fromElement instanceof Package ) {
			Package container = (Package)fromElement;
			for( ElementImport ele : container.getElementImports() ) {
				if(aliasName.equals(ele.getAlias() ) ) {
					return ele;
				}
			}
			// Not found in package, search nesting packages
			return lookupElementImportByName(container.getNestingPackage(), aliasName );
		}
		// Lookup from the nearest package of the element.
		return lookupElementImportByName(fromElement.getNearestPackage(), aliasName );
	}

	/**
	 * Create an extension between the specified {@link Stereotype} and the specified {@link Type}.
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
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
	 * Define all Profiles found from the container, including the provided package (if it is a profile) 
	 * and nested Profile.
	 * 
	 * @param container
	 *        the package from which to define {@link Profile}
	 */
	protected List<EPackage> defineAllProfiles(Package container, boolean saveConstraintInDef) {

		List<EPackage> result = new ArrayList<EPackage>();

		// we wants to define
		if(container instanceof Profile) {
			Map<String, String> options = createProfileDefinitionOptions(saveConstraintInDef);
			EPackage profileDefinition = ((Profile)container).define(options, null, null);
			result.add(profileDefinition);
		}

		for( Package nestedPackage : container.getNestedPackages() ) {
			List<EPackage> profileDefinitions = defineAllProfiles(nestedPackage, saveConstraintInDef);
			result.addAll(profileDefinitions);
		}

		return result;
	}

	/**
	 * @param saveConstraintInDef
	 * @return
	 */
	private Map<String, String> createProfileDefinitionOptions(
			boolean saveConstraintInDef) {
		Map<String, String> options = new HashMap<String, String>();

		options.put(Profile2EPackageConverter.OPTION__ECORE_TAGGED_VALUES, UMLUtil.OPTION__PROCESS);
		options.put(Profile2EPackageConverter.OPTION__DERIVED_FEATURES, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, UMLUtil.OPTION__PROCESS);
		options.put(Profile2EPackageConverter.OPTION__DUPLICATE_FEATURES, UMLUtil.OPTION__PROCESS);
		options.put(Profile2EPackageConverter.OPTION__DUPLICATE_OPERATIONS, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__REDEFINING_OPERATIONS, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__REDEFINING_PROPERTIES, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__SUBSETTING_PROPERTIES, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__UNION_PROPERTIES, UMLUtil.OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, UMLUtil.OPTION__REPORT);
		options.put(Profile2EPackageConverter.OPTION__ANNOTATION_DETAILS, UMLUtil.OPTION__REPORT);

		//Generate constraints for the validation
		String handleConstraints = saveConstraintInDef ? UMLUtil.OPTION__PROCESS : UMLUtil.OPTION__IGNORE;
		options.put(Profile2EPackageConverter.OPTION__INVARIANT_CONSTRAINTS, handleConstraints);
		options.put(Profile2EPackageConverter.OPTION__VALIDATION_DELEGATES, handleConstraints);
		options.put(Profile2EPackageConverter.OPTION__INVOCATION_DELEGATES, handleConstraints);
		options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES, handleConstraints);
		//

		options.put(Profile2EPackageConverter.OPTION__COMMENTS, UMLUtil.OPTION__IGNORE);
		options.put(Profile2EPackageConverter.OPTION__FOREIGN_DEFINITIONS, UMLUtil.OPTION__IGNORE);

		options.put(Profile2EPackageConverter.OPTION__UNTYPED_PROPERTIES, UMLUtil.OPTION__PROCESS); //Closer to the UML semantics of untyped properties

		return options;
	}


	/**
	 * Create a {@link Diagnostician} to validate profile.
	 * Copied from org.eclipse.papyrus.uml.diagram.profile.custom.commands.DefineProfileCommand
	 * @param adapterFactory
	 * @param progressMonitor
	 * @return
	 */
	protected Diagnostician createDiagnostician(final AdapterFactory adapterFactory, final IProgressMonitor progressMonitor) {
		return new Diagnostician() {

			@Override
			public String getObjectLabel(EObject eObject) {
				if(adapterFactory != null && !eObject.eIsProxy()) {
					IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
					if(itemLabelProvider != null) {
						return itemLabelProvider.getText(eObject);
					}
				}
				return super.getObjectLabel(eObject);
			}

			@Override
			public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
				progressMonitor.worked(1);
				return super.validate(eClass, eObject, diagnostics, context);
			}
		};
	}

	/**
	 * Update or create the specified stereotype according to the provided {@link IStereotypeUpdateArgs}.
	 * 
	 * @param updateArgs Arguments used to update or create a Stereotype.
	 * 
	 * @throws DraftProfileException If an error occur during update.
	 */
	public void updateStereotype(StereoptypeModel stereoptypeModel) throws DraftProfileException {
		
		String profileName = stereoptypeModel.getProfileName(); 
		String stereotypeName = stereoptypeModel.getStereotypeName();
		
		boolean isProfileModified = false;
		// The package to which the corresponding Profile is attached
		Package applicantPackage = null;
		
		PapyrusDefinitionAnnotation annotations = null;
		Stereotype stereotype = null;
		// lookup profile
		Profile profile = umlElement.getNearestPackage().getAppliedProfile(profileName, true);
		if( profile == null ) {
			// ask creation confirmation
			profile = createProfile(profileName);
			// Create the stereotype
			stereotype = createStereotype(profile, stereotypeName);

//			applyProfileToUmlElement( profile);
			// TODO change next behavior
//			throw new DraftProfileException("Profile '" + profileName + "' not applied on nesting packages. Apply profile first.");

			// We will apply profile in nearest PAckage 
			// TODO let choose between nearest, root or choosen
			applicantPackage = umlElement.getNearestPackage();
			annotations = createPapyrusDefinitionAnnotation(0, 0, 1);
			isProfileModified = true;
		}
		else {
			// Profile already exist
			// Lookup for the stereotype
			stereotype = profile.getOwnedStereotype(stereotypeName, true);
			applicantPackage = getApplicantPackage(profile);
			if( stereotype == null ) {
				// We need to create the stereotype
				// ask creation confirmation
				// TODO change next behavior
				stereotype = createStereotype(profile, stereotypeName);
				annotations = createUpdatedPapyrusDefinitionAnnotation(profile, 0, 0, 1);
				isProfileModified = true;
			}
		}
		
		// update metaclasses by adding missing metaclasses
		MetaclassesModel metaclassesModel = stereoptypeModel.getMetaclassesCollection();
		if( ! metaclassesModel.getSelectedMetaclasses().isEmpty() ) {
			isProfileModified = updateStereotypeMetaclasses( stereotype, metaclassesModel.getSelectedMetaclasses()) || isProfileModified  ;
		}
		
		// Update property definitions
		if( !stereoptypeModel.getProperties().isEmpty()) {
			isProfileModified = createOrUpdateProperties( stereotype, stereoptypeModel.getProperties()) || isProfileModified;
		}
		
		
		// Do we need to reapply the profile ?
		// We do it only if the profile is modified
		if( isProfileModified) {
			definesAllProfiles( profile );
			redefineAllProfiles( profile, annotations );
			cleanAllProfiles( profile );
//			validateAllProfiles(profile, Arrays.asList((EPackage)profile) );
			applyProfile( applicantPackage, profile);
		}
		
		// Apply stereotype to element
		applyStereotype( stereotype );
		// Update or set property values
		// This should be done once the profile is applied
		if( !stereoptypeModel.getProperties().isEmpty()) {
			updatePropertyValues( stereotype, stereoptypeModel.getProperties()) ;
		}
		
		
		
	}

	/**
	 * Update any values associated to properties. 
	 * Check if a value need to be modified, and modify it accordingly.
	 * 
	 * @param stereotype
	 * @param properties
	 */
	private void updatePropertyValues(Stereotype stereotype, List<PropertyModel> properties) {

//		System.err.println("uml.profile.drafter.ProfileApplicator.updatePropertyValues() is disabled - values are not updated.");

		for( PropertyModel propertyModel : properties) {
			updatePropertyValue( stereotype, propertyModel);
		}

	}

	/**
	 * Update the value of the property if needed.
	 * 
	 * @param stereotype
	 * @param propertyModel
	 */
	private void updatePropertyValue(Stereotype stereotype, PropertyModel propertyModel) {
		
		// Get the actual value
		Object actualValue = getUmlElement().getValue(stereotype, propertyModel.getProposedName());

//		org.eclipse.papyrus.uml.profile.utils.Util.getValueObjectFromString(String, Type)
		// Need to check if the Property value is modified
		if(propertyModel.isValueModified() ) {
			String valueAsStr = propertyModel.getValue();
			if( valueAsStr == null || valueAsStr.length() == 0 ) {
				getUmlElement().setValue(stereotype, propertyModel.getProposedName(), null);
				return;
			}
			
			Object newValue = org.eclipse.papyrus.uml.profile.utils.Util.getValueObjectFromString(valueAsStr, propertyModel.getType());
			getUmlElement().setValue(stereotype, propertyModel.getProposedName(), newValue);
		}
		
	}

	/**
	 * Check if the property definitions need to be updated or created, accordingly to
	 * {@link PropertyModel}s.
	 * Create missing property, and update modified ones.
	 * 
	 * @param stereotype The stereotype that own the properties.
	 * 
	 * @param properties models used to update the properties
	 * @return 
	 */
	private boolean createOrUpdateProperties(Stereotype stereotype, List<PropertyModel> properties) {
	
		boolean isUpdated = false;
		for( PropertyModel propertyModel : properties) {
			isUpdated = createOrUpdateProperty( stereotype, propertyModel) || isUpdated;
		}
		
		return isUpdated;
	}

	/**
	 * Check if the property associated to {@link PropertyModel} need to be updated or created.
	 * 
	 * Update the specified {@link Property} of the {@link Stereotype}
	 * @param stereotype The {@link Stereotype} owning the property.
	 * @param propertyModel The {@link PropertyModel} to use to update stereotype's corresponding property.
	 * 
	 */
	
	private boolean createOrUpdateProperty(Stereotype stereotype, PropertyModel propertyModel) {
		
		boolean isUpdated = false;
		boolean isPropertyExistIn = propertyModel.isPropertyExistIn(stereotype);

		switch(propertyModel.getStateKind()) {
		case modified:
			if( isPropertyExistIn) {
				isUpdated = updateProperty( stereotype, propertyModel);
			}
			break;

		case created:
			if( ! isPropertyExistIn) {
				isUpdated = createProperty( stereotype, propertyModel);
			}
			
			break;

		default:
			break;
		}
		
		return isUpdated;
	}

	/**
	 * Update the specified {@link Property} of the {@link Stereotype}.
	 * 
	 * @param stereotype The {@link Stereotype} owning the property.
	 * @param propertyModel The {@link PropertyModel} to use to update stereotype's corresponding property.
	 * 
	 */
	private boolean updateProperty(Stereotype stereotype, PropertyModel propertyModel) {
	
		boolean isUpdated = false;
		String newName = propertyModel.getProposedName();
		System.err.println("updateProperty(" + stereotype.getName() + "." + propertyModel.getProposedName() );
		if( newName!=null && (! newName.equals( stereotype.getName() ) ) ) {
			stereotype.setName(newName);
			isUpdated = true;
		}
		
		return isUpdated;
		
	}

	/**
	 * Create the specified {@link Property} of the {@link Stereotype}.
	 * 
	 * @param stereotype The {@link Stereotype} owning the property.
	 * @param propertyModel The {@link PropertyModel} to use to update stereotype's corresponding property.
	 * 
	 */
	private boolean createProperty(Stereotype stereotype, PropertyModel propertyModel) {
	
		boolean isUpdated = true;

//		System.err.println("createProperty(" + stereotype.getName() + "." + propertyModel.getProposedName() );
		stereotype.createOwnedAttribute(propertyModel.getProposedName(), propertyModel.getType());
		
		return isUpdated;
	}


}
