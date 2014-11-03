/*****************************************************************************
 * Copyright (c) 2005, 2014 IBM Corporation, Embarcadero Technologies, CEA, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 271470
 *   Kenn Hussey - 323181, 348433
 *   Kenn Hussey (CEA) - 327039, 369492, 313951, 163556, 418466, 447901
 *   Christian W. Damus (CEA) - 300957, 431998
 *   Christian W. Damus - 444588, 399859
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.tools.helper.IProfileApplicationDelegate;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * An implementation of the profile-application delegate protocol for externalized profile applications.
 */
public class ExternalizedProfileApplicationDelegate implements IProfileApplicationDelegate {

	private final PrivateUtil util = new PrivateUtil();

	public ExternalizedProfileApplicationDelegate() {
		super();
	}

	@Override
	public boolean appliesTo(Package package_) {
		return true;
	}

	@Override
	public Iterable<ProfileApplication> getProfileApplications(Package package_) {
		return Iterables.concat(package_.getProfileApplications(), DecoratorModelUtils.getDecoratorModelProfileApplications(package_));
	}

	@Override
	public ProfileApplication getProfileApplication(Package package_, Profile profile) {
		ProfileApplication result = package_.getProfileApplication(profile);

		if (result == null) {
			for (ProfileApplication next : DecoratorModelUtils.getDecoratorModelProfileApplications(package_)) {
				if (next.getAppliedProfile() == profile) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	@Override
	public boolean appliesTo(ProfileApplication profileApplication) {
		Resource resource = profileApplication.eResource();
		return (resource != null) && DecoratorModelUtils.isDecoratorModel(resource);
	}

	@Override
	public Package getApplyingPackage(ProfileApplication profileApplication) {
		return DecoratorModelUtils.getUserModelApplyingPackage(profileApplication);
	}

	@Override
	public Profile getAppliedProfile(ProfileApplication profileApplication) {
		return profileApplication.getAppliedProfile();
	}

	@Override
	public EList<EObject> reapplyProfile(Package package_, Profile profile) {
		ProfileApplication existing = getProfileApplication(package_, profile);
		return (existing == null) ? ECollections.<EObject> emptyEList() // Nothing to do
				: (existing.getApplyingPackage() == package_) ? package_.applyProfile(profile) // Simple UML case
						: util.reapplyProfile(package_, existing); // Our extended UML case
	}

	//
	// Nested types
	//

	// extending UML-internal PackageOperations class to access protected API
	@SuppressWarnings("restriction")
	private class PrivateUtil extends org.eclipse.uml2.uml.internal.operations.PackageOperations {

		EList<EObject> reapplyProfile(Package package_, ProfileApplication profileApplication) {
			Profile profile = ExternalizedProfileApplicationDelegate.this.getAppliedProfile(profileApplication);
			EPackage definition = profile.getDefinition();

			Collection<EObject> originals = Lists.newArrayList();
			StereotypeApplicationCopier copier = new PrivateStereotypeCopier(profile);

			// First, update the referenced definition of profile applications and copy all stereotype applications that are still applicable
			for (TreeIterator<EObject> allContents = getAllContents(package_, true, false); allContents.hasNext();) {
				EObject eObject = allContents.next();

				if (eObject instanceof Element) {
					Element element = (Element) eObject;

					if (element instanceof Package) {
						for (ProfileApplication next : ExternalizedProfileApplicationDelegate.this.getProfileApplications((Package) element)) {
							if (ExternalizedProfileApplicationDelegate.this.getAppliedProfile(next) == profile) {
								EList<EObject> references = getEAnnotation(profileApplication, UML2_UML_PACKAGE_2_0_NS_URI, true).getReferences();

								if (references.isEmpty()) {
									references.add(definition);
								} else {
									references.set(0, definition);
								}
							}
						}
					}

					for (EObject stereotypeApplication : element.getStereotypeApplications()) {
						Stereotype stereotype = getStereotype(stereotypeApplication);

						if ((stereotype != null) && (stereotype.getProfile() == profile)) {
							if (element.isStereotypeApplicable(stereotype)) {
								EObject copy = copier.copy(stereotypeApplication);
								Resource eResource = stereotypeApplication.eResource();

								if (eResource != null) {
									EList<EObject> contents = eResource.getContents();

									if (eResource == copy.eResource()) {
										contents.move(contents.indexOf(stereotypeApplication), copy);
									} else {
										contents.set(contents.indexOf(stereotypeApplication), copy);
									}
								}
							}

							originals.add(stereotypeApplication);
						}
					}
				}
			}

			// Copy cross-references within the stereotype application forest that was copied
			copier.copyReferences();

			// Propagate object IDs of stereotype applications and update all incoming cross-references from objects that were not copied
			for (EObject key : copier.keySet()) {
				EObject copy = copier.get(key);

				Resource eResource = key.eResource();

				if (eResource instanceof XMLResource) {
					XMLResource xmlResource = (XMLResource) eResource;
					xmlResource.setID(copy, xmlResource.getID(key));
				}

				for (Setting setting : new ArrayList<EStructuralFeature.Setting>(
						getNonNavigableInverseReferences(key))) {

					EObject eObject = setting.getEObject();

					if (!copier.containsKey(eObject)) {
						EStructuralFeature eStructuralFeature = setting.getEStructuralFeature();

						if ((eStructuralFeature != null) && eStructuralFeature.isChangeable()) {
							if (eStructuralFeature.isMany()) {
								Object value = eObject.eGet(eStructuralFeature);

								@SuppressWarnings("unchecked")
								EList<EObject> list = ((EList<EObject>) value);
								list.set(list.indexOf(key), copy);
							} else {
								setting.set(copy);
							}
						}
					}
				}
			}

			// Delete all of the original stereotype applications (leaving only the copies)
			destroyAll(originals);

			// Easy result in the common case of the profile not having any required metaclass extensions
			return profile.getOwnedExtensions(true).isEmpty() ? ECollections.<EObject> emptyEList() : applyAllRequiredStereotypes(package_);
		}

		//
		// Nested types
		//

		private class PrivateStereotypeCopier extends StereotypeApplicationCopier {
			private static final long serialVersionUID = 1L;

			PrivateStereotypeCopier(Profile profile) {
				super(profile);
			}
		}
	}
}
