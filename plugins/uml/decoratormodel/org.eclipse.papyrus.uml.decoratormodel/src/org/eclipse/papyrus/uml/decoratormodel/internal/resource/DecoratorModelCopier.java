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

package org.eclipse.papyrus.uml.decoratormodel.internal.resource;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.base.Preconditions;

/**
 * A utility for copying decorator models, with optional filtering of which profile applications are copied.
 */
public class DecoratorModelCopier {

	private final ResourceSet resourceSet;
	private final FilteredCopier copier;

	/**
	 * Initializes me with the name of the copy model. All profile applications are copied.
	 *
	 * @param modelName
	 *            the name of the new decorator model
	 */
	public DecoratorModelCopier(String modelName) {
		this(modelName, null);
	}

	/**
	 * Initializes me with the name of the copy model and the set of URIs of profiles to include in the copy.
	 *
	 * @param modelName
	 *            the name of the new decorator model
	 * @param profileURIs
	 *            the URIs of the resources storing profiles which applications are to be copied, or {@code null} to copy all profile applications.
	 * 
	 * @throws IllegalArgumentException
	 *             if the set of profile URIs is empty, because then the resulting model would be useless
	 */
	public DecoratorModelCopier(String modelName, Set<URI> profileURIs) {
		super();

		Preconditions.checkArgument((profileURIs == null) || !profileURIs.isEmpty(), "empty profileURIs set"); //$NON-NLS-1$

		this.resourceSet = new DecoratorModelResourceSet(profileURIs);
		this.copier = new FilteredCopier(modelName, profileURIs);
	}

	public void dispose() {
		copier.clear();
		EMFHelper.unload(resourceSet);
	}

	/**
	 * Copies the decorator model indicated by the source URI to the destination URI. It is the caller's responsibility to save the destination resource.
	 * 
	 * @param sourceModel
	 *            the source model URI
	 * @param destinationModel
	 *            the destination model URI
	 * 
	 * @return the destination resource, which is new and not yet saved
	 */
	public Resource copy(URI sourceModel, URI destinationModel) {
		Resource result = resourceSet.createResource(destinationModel, UMLPackage.eCONTENT_TYPE);
		Resource source = resourceSet.getResource(sourceModel, true);

		List<EObject> output = result.getContents();
		for (EObject next : source.getContents()) {
			if (copier.shouldCopy(next)) {
				output.add(copier.copy(next));
			}
		}
		copier.copyReferences();

		return result;
	}

	//
	// Nested types
	//

	private static class FilteredCopier extends EcoreUtil.Copier {
		private static final long serialVersionUID = 1L;

		private final String modelName;

		private final Set<URI> profileURIs;

		FilteredCopier(String modelName, Set<URI> profileURIs) {
			super(false);

			this.modelName = modelName;
			this.profileURIs = profileURIs;
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
			if ((eAttribute == UMLPackage.Literals.NAMED_ELEMENT__NAME) && (eObject.eContainer() == null)) {
				// Set the name of the target model
				copyEObject.eSet(eAttribute, modelName);
			} else {
				super.copyAttribute(eAttribute, eObject, copyEObject);
			}
		}

		@Override
		protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
			if (eObject instanceof Package) {
				Package package_ = (Package) eObject;

				if (package_.eContainer() == null) {
					// Root package
					if (eReference == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT) {
						List<PackageableElement> source = package_.getPackagedElements();
						List<PackageableElement> target = ((Package) copyEObject).getPackagedElements();
						for (PackageableElement next : source) {
							// Don't copy nested packages for which we don't want any of the profile applications
							if (shouldCopy(next)) {
								target.add((PackageableElement) copy(next));
							}
						}
					} else {
						super.copyContainment(eReference, eObject, copyEObject);
					}
				} else if (eReference == UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION) {
					List<ProfileApplication> source = package_.getProfileApplications();
					List<ProfileApplication> target = ((Package) copyEObject).getProfileApplications();
					for (ProfileApplication next : source) {
						// Don't copy applications of profiles that we want to exclude
						if (shouldCopy(next)) {
							target.add((ProfileApplication) copy(next));
						}
					}
				} else {
					super.copyContainment(eReference, eObject, copyEObject);
				}
			} else {
				super.copyContainment(eReference, eObject, copyEObject);
			}
		}

		boolean shouldCopy(EObject object) {
			boolean result = profileURIs == null;

			if (!result) {
				if (object instanceof Package) {
					// We copy a package if it's the root model package or we want any of its profile applications
					result = object.eContainer() == null;
					if (!result) {
						for (ProfileApplication next : ((Package) object).getProfileApplications()) {
							if (shouldCopy(next)) {
								result = true;
								break;
							}
						}
					}
				} else if (object instanceof ProfileApplication) {
					ProfileApplication profileApplication = (ProfileApplication) object;

					// Always copy the root package's profile applications
					result = profileApplication.getApplyingPackage().eContainer() == null;
					if (!result) {
						// Remember that our resource set doesn't resolve proxies
						Profile profile = ((ProfileApplication) object).getAppliedProfile();
						result = profileURIs.contains(EcoreUtil.getURI(profile).trimFragment());
					}
				} else if (object instanceof ApplyProfiles) {
					// Did we copy the dependency to which this stereotype is applied?
					result = get(((ApplyProfiles) object).getBase_Dependency()) != null;
				} else if (object.eContainer() == null) {
					// It's a stereotype application. Copy it if its profile is in our set
					result = profileURIs.contains(EcoreUtil.getURI(object.eClass()).trimFragment());
				} else {
					result = true;
				}
			}

			return result;
		}
	}
}
