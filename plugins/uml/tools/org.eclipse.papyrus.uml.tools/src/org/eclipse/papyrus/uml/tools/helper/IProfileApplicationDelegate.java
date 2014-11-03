/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.tools.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * Protocol for a delegate that assists any UI elements dealing with profile applications in the manipulation of those profile applications.
 * Many UI components may just want to use the {@linkplain Default default implementation}.
 * 
 * @see Default
 */
public interface IProfileApplicationDelegate {
	/**
	 * Queries whether I am applicable to (support introspection/manipulation of) profile applications of the given package.
	 * 
	 * @param package_
	 *            a package
	 * @return whether I am the delegate that should be used to introspect/manipulate profile applications of the given package
	 */
	boolean appliesTo(Package package_);

	/**
	 * Queries the profile applications of a package to manage in the UI.
	 * 
	 * @param package_
	 *            a package presented in the UI
	 * @return its profile applications
	 */
	Iterable<ProfileApplication> getProfileApplications(Package package_);

	/**
	 * Queries the existing application, if any, of the given {@code profile} directly to a package (not an inherited profile application).
	 * 
	 * @param package_
	 *            a package
	 * @param profile
	 *            a profile that may or may not be directly applied
	 * 
	 * @return the application of the {@code profile} specifically to the given package, or {@code null} if either the package does not have the profile applied or the profile application is inherited
	 */
	ProfileApplication getProfileApplication(Package package_, Profile profile);

	/**
	 * Queries whether I am applicable to (support introspection/manipulation of) a given profile application.
	 * 
	 * @param profileApplication
	 *            a profile application
	 * @return whether I am the delegate that should be used to introspect/manipulate the profile application
	 */
	boolean appliesTo(ProfileApplication profileApplication);

	/**
	 * Queries the package that applies a profile via the specific application.
	 * 
	 * @param profileApplication
	 *            a profile application
	 * @return that package to which it applies a profile
	 */
	Package getApplyingPackage(ProfileApplication profileApplication);

	/**
	 * Queries the profile applied by the specified application.
	 * 
	 * @param profileApplication
	 *            a profile application
	 * @return the profile that it applies
	 */
	Profile getAppliedProfile(ProfileApplication profileApplication);

	/**
	 * Re-applies the specified {@code profile} to a package.
	 * 
	 * @param package_
	 *            the package to which to re-apply the {@code profile}. The profile must already be applied
	 * @param profile
	 *            the profile to re-apply
	 * 
	 * @return any new stereotype applications created as a consequence of required metaclass extensions
	 */
	EList<EObject> reapplyProfile(Package package_, Profile profile);

	//
	// Nested types
	//

	/**
	 * A simple implementation of the profile-application delegate protocol that just provides the UML standard
	 * properties of a profile application.
	 */
	class Default implements IProfileApplicationDelegate {
		public boolean appliesTo(Package package_) {
			return true;
		}

		public Iterable<ProfileApplication> getProfileApplications(Package package_) {
			return package_.getProfileApplications();
		}

		public ProfileApplication getProfileApplication(Package package_, Profile profile) {
			return package_.getProfileApplication(profile);
		}

		public boolean appliesTo(ProfileApplication profileApplication) {
			return true;
		}

		public Package getApplyingPackage(ProfileApplication profileApplication) {
			return profileApplication.getApplyingPackage();
		}

		public Profile getAppliedProfile(ProfileApplication profileApplication) {
			return profileApplication.getAppliedProfile();
		}

		public EList<EObject> reapplyProfile(Package package_, Profile profile) {
			return package_.applyProfile(profile);
		}
	}
}
