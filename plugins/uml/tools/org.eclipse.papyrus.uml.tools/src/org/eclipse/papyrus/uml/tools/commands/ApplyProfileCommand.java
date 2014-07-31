/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Gabriel Pascual	(ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.tools.profile.definition.IPapyrusVersionConstants;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * A command to apply a profile on a UML Package and save applied version of profile.
 * <p>
 * It is possible to disable save of version, passing boolean value to constructor.
 * </p>
 * 
 * @author Camille Letavernier
 */
public class ApplyProfileCommand extends RecordingCommand {

	/** The uml package. */
	private Package umlPackage;

	/** The profiles. */
	private Collection<Profile> profiles;

	/** The save profile application version. */
	private boolean saveProfileApplicationVersion;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param umlPackage
	 *        The UML Package on which the profiles will be applied
	 * @param profiles
	 *        The list of profiles to apply
	 * @param editingDomain
	 *        The EditingDomain
	 */
	public ApplyProfileCommand(Package umlPackage, Collection<Profile> profiles, TransactionalEditingDomain editingDomain) {
		this(umlPackage, profiles, editingDomain, true);
	}

	/**
	 * Instantiates a new apply profile command.
	 *
	 * @param umlPackage
	 *        the uml package
	 * @param profiles
	 *        the profiles
	 * @param editingDomain
	 *        the editing domain
	 * @param saveProfileApplicationVersion
	 *        the save profile application version
	 */
	public ApplyProfileCommand(Package umlPackage, Collection<Profile> profiles, TransactionalEditingDomain editingDomain, boolean saveProfileApplicationVersion) {
		super(editingDomain);
		this.umlPackage = umlPackage;
		this.profiles = profiles;
		this.saveProfileApplicationVersion = saveProfileApplicationVersion;
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param umlPackage
	 *        The UML Package on which the profile will be applied
	 * @param profile
	 *        The profile to apply
	 * @param editingDomain
	 *        The EditingDomain
	 */
	public ApplyProfileCommand(Package umlPackage, Profile profile, TransactionalEditingDomain editingDomain) {
		this(umlPackage, profile, editingDomain, true);
	}

	/**
	 * Constructor.
	 *
	 * @param umlPackage
	 *        The UML Package on which the profile will be applied
	 * @param profile
	 *        The profile to apply
	 * @param editingDomain
	 *        The EditingDomain
	 * @param saveProfileApplicationVersion
	 *        the save profile application version
	 */
	public ApplyProfileCommand(Package umlPackage, Profile profile, TransactionalEditingDomain editingDomain, boolean saveProfileApplicationVersion) {
		this(umlPackage, Collections.singletonList(profile), editingDomain, saveProfileApplicationVersion);
	}

	/**
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		for(Profile profile : profiles) {
			// Apply profile
			umlPackage.applyProfile(profile);

			// Save version of applied profile if necessary
			if(saveProfileApplicationVersion) {
				ProfileApplication profileApplication = umlPackage.getProfileApplication(profile);

				// Get version annotation in case it is a Papyrus profile
				EAnnotation versionAnnotation = profile.getDefinition().getEAnnotation(IPapyrusVersionConstants.PAPYRUS_EANNOTATION_SOURCE);
				if(versionAnnotation != null) {
					profileApplication.getEAnnotations().add(0, EcoreUtil.copy(versionAnnotation));
				}
			}
		}
	}

}
