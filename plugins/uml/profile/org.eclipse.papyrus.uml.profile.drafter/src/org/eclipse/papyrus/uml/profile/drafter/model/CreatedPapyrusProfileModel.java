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

package org.eclipse.papyrus.uml.profile.drafter.model;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.papyrus.infra.core.resource.EMFLogicalModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * A {@link ModelSet}'s {@link IModel} dedicated to created {@link Profile}.
 * <br>
 * Such {@link IModel} contains the created {@link Profile}, and can be managed by Papyrus {@link ModelSet}.
 * The model encapsulate 3 {@link Resource}s: one for uml, one for diagram, and one for di.
 * <br>
 * This implementation try to load the {@link Resource}s asociated to the requested URI. If existing resources are found,
 * load them. Otherwise, create them.
 * 
 * @author cedric dumoulin
 *
 */
public class CreatedPapyrusProfileModel extends EMFLogicalModel {

	/**
	 * File extension used for DI.
	 */
	public static final String UML_FILE_EXTENSION = "uml"; //$NON-NLS-1$

	/**
	 * Model ID.
	 * We use the class qualified name.
	 */
	public static final String MODEL_ID = CreatedPapyrusProfileModel.class.getName();

	public static final String PROFILE_FILE_EXTENSION = "profile";
	
	protected URI uriWithoutExtension;
	protected boolean isAdditionalResourcesRequired;
	protected Resource umlResource;
	protected Resource diResource;
	protected Resource notationResource;
	

	/**
	 * 
	 * Constructor.
	 *
	 * @param owner
	 * @param uriWithoutExtension
	 * @param isAdditionalResourcesRequired
	 */
	public CreatedPapyrusProfileModel(ModelSet owner, URI uriWithoutExtension, boolean isAdditionalResourcesRequired) {
		init(owner);
		this.uriWithoutExtension = uriWithoutExtension;
		this.isAdditionalResourcesRequired = isAdditionalResourcesRequired;
		
		// add '.profile' to uri if needed
		String currentExtension = uriWithoutExtension.fileExtension();
		if( ! PROFILE_FILE_EXTENSION.equals(currentExtension)) {
			// Add extension
			uriWithoutExtension.appendFileExtension(PROFILE_FILE_EXTENSION);
		}
		
		// Creates Resources
		createModel();
		// Register ourself to ModelSet
		owner.registerModel(this);
	}

	/**
	 * Use the uri.toString has identifier.
	 * 
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractModel#getIdentifier()
	 *
	 * @return
	 */
	@Override
	public String getIdentifier() {
		return uriWithoutExtension.toString();
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractBaseModel#getModelFileExtension()
	 *
	 * @return
	 */
	@Override
	protected String getModelFileExtension() {
		// TODO Auto-generated method stub
		return UML_FILE_EXTENSION;
	}

	/**
	 * Create the model by using the provided fullpath as a hint for the resource
	 * URIs. 
	 * In this implementation, create 3 resources (profile.uml, di and notation).
	 * 
	 * @param fullPathWithoutExtension
	 */
	public void createModel() {
		
		
		umlResource = createUmlResource();
		// Initialize resource
		if( umlResource.getContents().isEmpty()) {
			Profile profile = createProfile();
			umlResource.getContents().add(profile);
		}
		
		// Set the main resource
		resource = umlResource;

		// Add additional resources if requested.
		if( isAdditionalResourcesRequired ) {
			notationResource = createNotationResource();
			diResource = createDiResource();			
		}
		
		
	}

	/**
	 * Create
	 * @param uriWithoutExtension2
	 * @return
	 */
	private Resource createUmlResource() {
		umlResource = createResource( uriWithoutExtension.appendFileExtension("uml"));
		// init model
		
		return umlResource;
	}

	private Resource createNotationResource() {
		notationResource = createResource( uriWithoutExtension.appendFileExtension("notation"));
		// init model
		
		return notationResource;
	}

	private Resource createDiResource() {
		diResource = createResource( uriWithoutExtension.appendFileExtension("di"));
		// init model
		
		return diResource;
	}

	/**
	 * Create the specified Profile
	 * @param profileName The name of the Profile to create.
	 * 
	 */
	private Profile createProfile() {
		Profile resultProfile = UMLFactory.eINSTANCE.createProfile();
//		resultProfile.setName(profileName);

		return resultProfile;
	}
	
	/**
	 * Get or Create the specified Resource 
	 * @param resourceURI URI of the {@link Resource} that should be created.
	 * @return The requested Resource with specified URI.
	 */
	protected Resource createResource(URI resourceURI) {

		// Create Resource of appropriate type
		ModelSet modelSet = getModelManager();
		Resource resource = modelSet.getResource(resourceURI, false);
		if(resource != null) {
			// it already exists? Best effort to make sure it's loaded
			try {
				modelSet.getResource(resourceURI, true);
			} catch (RuntimeException e) {
				// it commonly happens when creating a new model in the
				// workspace that the wizard creates an empty file, first.
				Map<String, ?> attributes = modelSet.getURIConverter().getAttributes(resourceURI, Collections.singletonMap(URIConverter.OPTION_REQUESTED_ATTRIBUTES, Collections.singleton(URIConverter.ATTRIBUTE_LENGTH)));
				Number length = (Number)attributes.get(URIConverter.ATTRIBUTE_LENGTH);
				if((length != null) && (length.longValue() > 0L)) {
					// it has some length but isn't readable; fail
					throw e;
				} // otherwise, it's just empty and we'll fill it
			}
		} else {
			// new resource
			resource = getModelManager().createResource(resourceURI);
		}
		configureResource(resource);
		return resource;
	}

	/**
	 * Return true if the specified resource is related to the main resource.
	 * In this class, the resource is related if the fullpathname without extension is the same as the main resource.
	 * 
	 * @see org.eclipse.papyrus.infra.core.resource.EMFLogicalModel#isRelatedResource(org.eclipse.emf.ecore.resource.Resource)
	 *
	 * @param resource
	 * @return
	 */
	protected boolean isRelatedResource(Resource resource) {
		if(resource == null) {
			return false;
		}

		return resource.getURI().trimFileExtension().equals(uriWithoutExtension);
	}

	/**
	 * 
	 * @return
	 */
	public Profile getProfile() {
		return (Profile)umlResource.getContents().get(0);
	}

	/**
	 * 
	 * @return
	 */
	public Resource getProfileResource() {
		return umlResource;
	}


}
