/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - Handle dynamic profile applications in CDO
 *  Christian W. Damus - bug 399859
 *  Christian W. Damus - bug 451613
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AttributeOwner;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationOwner;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

/**
 * A class containing static utility method regarding UML profiles
 *
 * @author Camille Letavernier
 *
 */
public class ProfileUtil extends org.eclipse.uml2.uml.util.UMLUtil {


	/**
	 * Checks if the profile applied has been changed since last application (definition does not match.
	 *
	 * @param _package
	 *            on which the profile is applied
	 * @param _profile
	 *            the applied profile
	 * @return true if the profile has changed
	 */
	public static boolean isDirty(Package _package, Profile _profile) {
		boolean isDirty = false;
		if (_profile == null || _profile.eResource() == null || _package.eResource() == null) {
			return false;
		}

		// Retrieve model resourceSet
		ResourceSet pkge_resourceSet = _package.eResource().getResourceSet();

		if (pkge_resourceSet != null) {

			// Retrieve profile resource
			URI prof_URI = _profile.eResource().getURI();
			Resource modelResource = pkge_resourceSet.getResource(prof_URI, true);

			if (modelResource != null && modelResource.getContents().get(0) instanceof Profile) {

				// ckeck applied profile application definition vs profile definition referenced in file
				Profile profileInFile = (Profile) (modelResource.getContents().get(0));
				ProfileApplication profileApplication = _package.getProfileApplication(_profile, true);
				if (profileApplication != null) {
					EPackage appliedProfileDefinition = profileApplication.getAppliedDefinition();
					EPackage fileProfileDefinition = null;

					// Check profiles qualified names to ensure the correct profiles are compared
					String appliedProfileName = _profile.getQualifiedName();
					String fileProfileName = profileInFile.getQualifiedName();
					if (!appliedProfileName.equals(fileProfileName)) {

						// The profile must be a subprofile
						Iterator<Profile> it = PackageUtil.getSubProfiles(profileInFile).iterator();
						while (it.hasNext()) {
							Profile current = it.next();
							fileProfileName = current.getQualifiedName();
							if (fileProfileName.equals(appliedProfileName)) {
								profileInFile = current;
							}
						}
					}

					fileProfileDefinition = profileInFile.getDefinition();

					// don't just test that the EPackage definitions are the
					// same object because in the CDO context they are not, even
					// though they are "the same package". Comparing the NSURIs
					// should suffice
					if ((appliedProfileDefinition == null)
							|| (fileProfileDefinition == null)
							|| !UML2Util.safeEquals(
									appliedProfileDefinition.getNsURI(),
									fileProfileDefinition.getNsURI())) {

						isDirty = true;
					}
				}

			}
		}



		return isDirty;
	}

	public static List<Stereotype> findAllSubStereotypes(Stereotype parentStereotype, Package umlPackage, boolean concreteOnly) {
		Collection<Stereotype> result = new LinkedHashSet<Stereotype>();

		for (Profile profile : umlPackage.getAllAppliedProfiles()) {
			List<Stereotype> allStereotypes = new LinkedList<Stereotype>();
			findAllStereotypes(profile, allStereotypes);
			for (Stereotype stereotype : allStereotypes) {
				if (concreteOnly && stereotype.isAbstract()) {
					continue; // Skip abstract stereotypes
				}

				if (isSubStereotype(parentStereotype, stereotype)) {
					result.add(stereotype);
				}
			}

		}

		return new LinkedList<Stereotype>(result);
	}

	public static boolean isSubStereotype(Stereotype parentStereotype, Stereotype childStereotype) {
		if (parentStereotype == childStereotype) {
			return true;
		}
		return childStereotype.getGenerals().contains(parentStereotype); // TODO : This is probably not recursive...
	}

	/**
	 * Finds recursively all stereotypes contained in this profile
	 *
	 * @param profile
	 *
	 * @param result
	 */
	public static void findAllStereotypes(Profile profile, List<Stereotype> result) {
		for (Stereotype stereotype : profile.getOwnedStereotypes()) {
			result.add(stereotype);
		}
		for (Package subPackage : profile.getNestedPackages()) {
			if (subPackage instanceof Profile) {
				Profile subProfile = (Profile) subPackage;
				findAllStereotypes(subProfile, result);
			}
		}
	}

	private static EPackage umlMetamodel = UMLPackage.eINSTANCE;

	public static List<EClass> getAllExtendedMetaclasses(Stereotype stereotype, boolean concreteClassesOnly) {
		List<Class> extendedMetaclasses = stereotype.getAllExtendedMetaclasses();
		Set<EClass> allMetaclasses = new LinkedHashSet<EClass>();
		for (Class extendedMetaclass : extendedMetaclasses) {
			EClass UMLEClass = findEClass(extendedMetaclass);
			allMetaclasses.addAll(EMFHelper.getSubclassesOf(UMLEClass, concreteClassesOnly));
		}

		return new LinkedList<EClass>(allMetaclasses);
	}

	private static EClass findEClass(Class metaclass) {
		for (EClassifier classifier : umlMetamodel.getEClassifiers()) {
			if (classifier instanceof EClass) {
				if (classifier.getName().equals(metaclass.getName())) {
					return (EClass) classifier;
				}
			}
		}
		return null;
	}

	/**
	 * Searchs the association containing a member end matching the given name
	 * in the given stereotype, and returns it if it is typed by a stereotype
	 *
	 * TODO : This method can probably be used in a single specific case and should probably not be here
	 *
	 * @param stereotype
	 * @param associationName
	 * @return
	 */
	public static Property findStereotypedProperty(Stereotype stereotype, String associationName) {
		// associations loop
		associations: for (Association association : stereotype.getAssociations()) {
			// memberEnds loop
			for (Property memberEnd : association.getMemberEnds()) {
				if (memberEnd.getType() == stereotype) {
					// oppositeEnds loop
					for (Property oppositeEnd : association.getMemberEnds()) {
						if (oppositeEnd != memberEnd && oppositeEnd.getName().equals(associationName) && !association.getOwnedEnds().contains(oppositeEnd)) {
							if (oppositeEnd.getType() instanceof Stereotype) {
								return oppositeEnd;
							}
							break associations; // break the three loops
						}
					}
				}
			}
		}

		// FIXME : Do we really need to browse associations first ?

		// Search for properties which are not associations
		for (Property property : stereotype.getAllAttributes()) {
			if (property.getName().equals(associationName)) {
				if (property.getType() instanceof Stereotype) {
					return property;
				}
			}
		}

		return null;
	}

	/**
	 * Finds the profile application, if any, in the context of an {@code element} that supplies the given
	 * stereotype Ecore definition.
	 * 
	 * @param element
	 *            a model element
	 * @param stereotypeDefinition
	 *            the Ecore definition of a stereotype
	 * 
	 * @return the providing profile application, or {@code null} if none can be determined
	 */
	public static ProfileApplication getProfileApplication(Element element, EClass stereotypeDefinition) {
		ProfileApplication result = null;

		NamedElement umlDefinition = getNamedElement(stereotypeDefinition, element);
		if (umlDefinition != null) {
			Profile profile = getContainingProfile(umlDefinition);
			if (profile != null) {
				result = getApplicationOf(profile, element);
			}
		}

		return result;
	}

	static Profile getContainingProfile(NamedElement umlDefinition) {
		Profile result = null;

		for (Package package_ = umlDefinition.getNearestPackage(); package_ != null; package_ = package_.getNestingPackage()) {
			if (package_ instanceof Profile) {
				result = (Profile) package_;
				break;
			}
		}

		return result;
	}

	static ProfileApplication getApplicationOf(Profile profile, Element context) {
		ProfileApplication result = null;

		Package package_ = context.getNearestPackage();
		if (package_ != null) {
			result = package_.getProfileApplication(profile, true);
		}

		return result;
	}

	/**
	 * Sort a list of profiles in dependency order, such that profiles that are used by other profiles sort ahead of the profiles that use them.
	 * A profile uses another profile when it has classifiers that either:
	 * <ul>
	 * <li>specialize classifiers contained in the other profile (possibly in nested packages), or</li>
	 * <li>have attributes typed by classifiers in the other profile, or</li>
	 * <li>have operations with parameters typed by classifiers in the other profile</li>
	 * </ul>
	 * 
	 * @param profiles
	 *            a list of profiles to sort in place
	 */
	public static void sortProfiles(List<Profile> profiles) {
		// Analyze profiles for inter-dependencies
		final SetMultimap<Profile, Profile> dependencies = computeProfileDependencies(profiles);

		// Expand to find transitive dependencies
		expand(dependencies);

		// Now sort by used profiles ahead of those that use them
		Collections.sort(profiles, new Comparator<Profile>() {
			public int compare(Profile o1, Profile o2) {
				return dependencies.get(o1).contains(o2) ? +1 : dependencies.get(o2).contains(o1) ? -1 : 0;
			}
		});
	}

	/**
	 * Compute a mapping of profiles to the profiles that they depend on.
	 * 
	 * @param profiles
	 *            profiles for which to compute dependencies
	 * @return the dependency mapping (one-to-many)
	 */
	private static SetMultimap<Profile, Profile> computeProfileDependencies(Collection<? extends Profile> profiles) {
		SetMultimap<Profile, Profile> result = HashMultimap.create();
		for (Profile next : profiles) {
			for (PackageableElement member : next.getPackagedElements()) {
				if (member instanceof Classifier) {
					// Look for supertype dependencies
					for (Classifier general : ((Classifier) member).allParents()) {
						addProfileContaining(general, next, result);
					}
				}
				if (member instanceof AttributeOwner) {
					// Look for attribute type dependencies
					for (Property property : ((AttributeOwner) member).getOwnedAttributes()) {
						addProfileContaining(property.getType(), next, result);
					}
				}
				if (member instanceof OperationOwner) {
					// Look for operation parameter type dependencies
					for (Operation operation : ((OperationOwner) member).getOwnedOperations()) {
						for (Parameter parameter : operation.getOwnedParameters()) {
							addProfileContaining(parameter.getType(), next, result);
						}
					}
				}
			}

			// Exclude self dependencies
			result.remove(next, next);
		}

		return result;
	}

	private static void addProfileContaining(PackageableElement element, Profile dependent, SetMultimap<Profile, Profile> dependencies) {
		if (element != null) {
			Package containingPackage = element.getNearestPackage();
			while ((containingPackage != null) && !(containingPackage instanceof Profile) && (containingPackage.getOwner() != null)) {
				containingPackage = containingPackage.getOwner().getNearestPackage();
			}

			if (containingPackage instanceof Profile) {
				dependencies.put(dependent, (Profile) containingPackage);
			}
		}
	}

	/**
	 * Expands a profile dependency map to include all transitive dependencies in the mapping for each profile.
	 * 
	 * @param dependencies
	 *            a dependency map to expand
	 */
	private static void expand(SetMultimap<Profile, Profile> dependencies) {
		for (boolean changed = true; changed;) {
			changed = false;

			for (Profile next : new ArrayList<Profile>(dependencies.keySet())) {
				for (Profile dep : new ArrayList<Profile>(dependencies.get(next))) {
					Set<Profile> transitive = dependencies.get(dep);

					// Add the transitive dependencies to my own
					if ((transitive != null) && dependencies.putAll(next, transitive)) {
						changed = true;
					}
				}
			}
		}
	}
}
