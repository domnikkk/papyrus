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

package org.eclipse.papyrus.uml.profile.drafter.commands;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.profile.drafter.model.CreatedPapyrusProfileModel;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * A pseudo-command used to create a {@link Profile} and its associated Resource.
 * 
 * <br>
 * This class use the command pattern, but do not implement any existing interface. This can be changed in
 * the future.
 * The methods signature follow the emf commands (org.eclipse.emf.common.command.Command).
 * 
 * @author cedric dumoulin
 *
 */
public class CreateProfileAndProfileResourceCommand {

	protected String profileName;
	protected URI resourceURI;
	/**
	 * {@link ModelSet} containing the model to which the Profile should be applied.
	 */
	protected ModelSet modelSet;

	protected Resource resultResource;
	protected Profile resultProfile;
	
	
	/**
	 * Constructor.
	 *
	 * @param profileName
	 * @param modelSet
	 */
	public CreateProfileAndProfileResourceCommand(String profileName, ModelSet modelSet) {
		super();
		this.profileName = profileName;
		this.modelSet = modelSet;
		// Create the uri
		this.resourceURI = getResourceURIFromProfileName(profileName);
	}

	/**
	 * Constructor.
	 *
	 * @param profileName
	 * @param resourceURI
	 * @param modelSet
	 */
	public CreateProfileAndProfileResourceCommand(String profileName, URI resourceURI, ModelSet modelSet) {
		super();
		this.profileName = profileName;
		this.resourceURI = resourceURI;
		this.modelSet = modelSet;
	}

	/**
	 * @return the resultResource
	 */
	public Resource getResultResource() {
		return resultResource;
	}

	/**
	 * @return the resultProfile
	 */
	public Profile getResultProfile() {
		return resultProfile;
	}

	/**
	 * Compute the {@link Resource} {@link URI} from the profileName.
	 * Use the name associated in {@link ModelSet}, and replace the last segment with the name of the profile. Then
	 * append '.profile.uml'.
	 * 
	 * 
	 * @param profileName
	 * @return
	 */
	private URI getResourceURIFromProfileName(String profileName) {
		
		URI baseURI = modelSet.getURIWithoutExtension().trimSegments(1);
		
		baseURI = baseURI.appendSegment(profileName).appendFileExtension("profile");
		
		return baseURI;
	}

	/**
	 * Check if a resource already exist for the specified resourceURI.
	 * Do not load the corresponding resource.
	 * 
	 * @return Return true if a resource already exist for the specified resourceURI, false otherwise.
	 */
	private boolean isResourceAlreadyExist() {
		// TODO
		
//		resourceURI.toPlatformString(true);
		return false;
	}

	/**
	 * Returns whether the command is valid to <code>execute</code>.
	 * The command is valid to execute if a Resource with the same name do not already exists, and if the 
	 * requested resource can be created.
	 * 
	 * 
	 * @return whether the command is valid to <code>execute</code>.
	 */
	public boolean canExecute() {
		return !isResourceAlreadyExist();
	}

	/**
	 * Execute the command.
	 */
	public void execute() {

		CreatedPapyrusProfileModel profileModel = new CreatedPapyrusProfileModel(modelSet, resourceURI, true);
		
		resultProfile = profileModel.getProfile();
		resultProfile.setName(profileName);
		resultResource = profileModel.getProfileResource();
		
//		createProfile();
//		createResource();
//		
//		resultResource.getContents().add(resultProfile);
		
//		try {
//			resultResource.save(null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	/**
	 * Create the specified Profile
	 * @param profileName The name of the Profile to create.
	 * 
	 */
	private Profile createProfile() {
		resultProfile = UMLFactory.eINSTANCE.createProfile();
		resultProfile.setName(profileName);

		return resultProfile;
	}

	/**
	 * Create the {@link Resource} that will hold the Profile.
	 */
	private Resource createResource() {
		
		resultResource = modelSet.createResource(resourceURI.appendFileExtension("uml"), null);
		// Register the resource with UML model
		UmlModel umlModel = UmlUtils.getUmlModel(modelSet);
		umlModel.handle(resultResource);
		return resultResource;
	}


}
