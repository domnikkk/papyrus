/*
 * Copyright (c) 2014 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   Christian W. Damus - bug 450524
 *   Christian W. Damus - bug 451557
 *
 */
package org.eclipse.papyrus.uml.modelrepair.internal.participants;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.papyrus.infra.emf.resource.IDependencyReplacementParticipant;
import org.eclipse.papyrus.infra.emf.resource.Replacement;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.modelrepair.Activator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.operations.PackageOperations;
import org.eclipse.uml2.uml.util.UMLUtil;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;


/**
 * This is the StereotypeApplicationRepairParticipant type. Enjoy.
 */
// extending UML-internal PackageOperations class to access protected API
@SuppressWarnings("restriction")
public class StereotypeApplicationRepairParticipant extends PackageOperations implements IDependencyReplacementParticipant {

	public StereotypeApplicationRepairParticipant() {
		super();
	}

	public void postProcessReplacements(Collection<? extends Replacement> replacements, Collection<? extends Resource> resources, IProgressMonitor monitor, DiagnosticChain diagnostics) {
		monitor = SubMonitor.convert(monitor, "Updating stereotype applications ...", replacements.size() + 1);

		Map<ProfileApplication, Replacement> applicationsToDefinitions = Maps.newHashMap();

		for (Replacement next : replacements) {
			if (next.getEStructuralFeature() == UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE) {
				ProfileApplication application = (ProfileApplication) next.getEObject();
				if (application.getApplyingPackage() != null) {
					if (!applicationsToDefinitions.containsKey(application)) {
						applicationsToDefinitions.put(application, next);
					} // else we processed the applied-definition annotation, first
				} else if (diagnostics != null) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING, Activator.PLUGIN_ID, 0, "Profile application has no applying package: " + application, null)); //$NON-NLS-1$
				}
			} else if (next.getEStructuralFeature() == EcorePackage.Literals.EANNOTATION__REFERENCES) {
				if (next.getOldValue() instanceof EPackage) {
					EObject application = ((EAnnotation) next.getEObject()).getEModelElement();
					if (application instanceof ProfileApplication) {
						applicationsToDefinitions.put((ProfileApplication) application, next);
					}
				}
			}
		}

		for (Map.Entry<ProfileApplication, Replacement> next : applicationsToDefinitions.entrySet()) {
			ProfileApplication application = next.getKey();
			EPackage oldDefinition = (EPackage) next.getValue().getOldValue();

			migrateStereotypeApplications(application, application.getApplyingPackage(), oldDefinition, diagnostics);
			monitor.worked(1);
		}

		monitor.done();
	}

	protected void migrateStereotypeApplications(ProfileApplication profileApplication, Package applyingPackage, EPackage oldDefinition, DiagnosticChain diagnostics) {
		Profile newProfile = profileApplication.getAppliedProfile();
		if (newProfile.eIsProxy()) {
			// the profile's ID has changed. Try to locate the new one
			newProfile = resolveNewProfile(profileApplication.eResource().getResourceSet(), newProfile, oldDefinition);
			if (newProfile != profileApplication.getAppliedProfile()) {
				// Found a new profile. Update the profile application
				profileApplication.setAppliedProfile(newProfile);
			}
		}

		EPackage definition = profileApplication.getAppliedDefinition();
		EPackage newDefinition = newProfile.getDefinition();
		if ((newDefinition != null) && (newDefinition != definition)) {
			// Update the profile application's applied definition
			EList<EObject> references = getEAnnotation(profileApplication, UML2_UML_PACKAGE_2_0_NS_URI, true).getReferences();

			if (references.isEmpty()) {
				references.add(newDefinition);
			} else {
				references.set(0, newDefinition);
			}
		}

		List<EObject> oldStereotypeApplications = Lists.newArrayList();
		for (TreeIterator<EObject> iter = getAllContents(applyingPackage, true, false); iter.hasNext();) {
			EObject element = iter.next();

			// stereotypes are only applicable to Elements
			if (element instanceof Element) {
				for (EStructuralFeature.Setting setting : EMFHelper.getUsages(element)) {
					EObject owner = setting.getEObject();
					if (isStereotypeApplicationExtensionSetting(owner, setting)) {
						// Looks like a stereotype application. Do we need to rebuild it?
						if (owner.eClass().getEPackage() == oldDefinition) {
							oldStereotypeApplications.add(owner);
						}
					}
				}
			} else {
				// non-Elements do not contain Elements, or if they do, they have no meaning in the model
				iter.prune();
			}
		}

		createStereotypeApplicationMigrator(profileApplication.eResource(), newProfile, diagnostics).migrate(oldStereotypeApplications, null);

		if (!newProfile.getOwnedExtensions(true).isEmpty()) {
			// Ensure that required stereotypes of the new profile are applied
			applyAllRequiredStereotypes(profileApplication.getApplyingPackage());
		}
	}

	protected boolean isStereotypeApplicationExtensionSetting(EObject owner, EStructuralFeature.Setting setting) {
		EStructuralFeature feature = setting.getEStructuralFeature();
		return !(owner instanceof Element) && (feature instanceof EReference) && feature.getName().startsWith("base_") && UMLPackage.Literals.ELEMENT.isSuperTypeOf(((EReference) feature).getEReferenceType());
	}

	protected Profile resolveNewProfile(ResourceSet context, Profile proxy, EPackage oldDefinition) {
		Profile result = proxy;

		if (context != null) {
			try {
				Resource res = context.getResource(EcoreUtil.getURI(proxy).trimFragment(), true);
				if (res != null) {
					Profile oldProfile = (Profile) getNamedElement(oldDefinition);
					String qname = (oldProfile != null) ? getQualifiedName(oldProfile) : getQualifiedName(oldDefinition, NamedElement.SEPARATOR);
					Collection<Profile> resolved = findNamedElements(res, qname);
					if (!resolved.isEmpty()) {
						result = resolved.iterator().next();
					} else {
						Profile profile = (Profile) EcoreUtil.getObjectByType(res.getContents(), UMLPackage.Literals.PROFILE);
						if (profile != null) {
							result = profile;
						}
					}
				}
			} catch (Exception e) {
				// Couldn't resolve. Fine
				Activator.log.error(e);
			}
		}

		return result;
	}

	public static StereotypeApplicationMigrator createStereotypeApplicationMigrator(Resource resourceUnderRepair, Profile profile, DiagnosticChain diagnostics) {
		return new StereotypeApplicationMigrator(resourceUnderRepair, profile, diagnostics);
	}

	//
	// Nested types
	//

	public static class StereotypeApplicationMigrator {

		private StereotypeApplicationRepairCopier copier;

		StereotypeApplicationMigrator(Resource resourceUnderRepair, Profile profile, DiagnosticChain diagnostics) {
			copier = new StereotypeApplicationRepairCopier(resourceUnderRepair, profile, diagnostics);
		}

		public void migrate(Collection<? extends EObject> stereotypeApplications, IProgressMonitor monitor) {
			SubMonitor sub = SubMonitor.convert(monitor, (2 * stereotypeApplications.size()) + 2);

			// Capture object IDs for later transfer to new stereotype applications
			final Map<EObject, String> objectIDs = Maps.newHashMap();
			for (EObject next : stereotypeApplications) {
				Resource res = next.eResource();
				if (res instanceof XMLResource) {
					String id = ((XMLResource) res).getID(next);
					if (id != null) {
						objectIDs.put(next, id);
					}
				}
			}

			for (EObject next : stereotypeApplications) {
				if (sub.isCanceled()) {
					throw new OperationCanceledException();
				}

				EObject newInstance = copier.copy(next);
				if ((newInstance != null) && (newInstance != next)) {
					// Depends how we copied the stereotype instance (by applying again or not),
					// it may not be attached, yet
					if (newInstance.eResource() == null) {
						EcoreUtil.replace(next, newInstance);
					}
				}

				sub.worked(1);
			}

			copier.copyReferences();
			sub.worked(1);

			SubMonitor sub2 = SubMonitor.convert(sub.newChild(stereotypeApplications.size()), copier.size());

			// Preserve the identities of stereotype applications and their contents and update references not accounted for by the copier
			// (for example, references from Notation views/styles in the diagrams)
			for (Map.Entry<EObject, EObject> next : copier.entrySet()) {
				if (sub.isCanceled()) {
					throw new OperationCanceledException();
				}

				EObject original = next.getKey();
				EObject copy = next.getValue();

				if (copy != null) {
					// Update the ID, if the old ID is known
					String id = objectIDs.get(original);
					if (id != null) {
						Resource res = copy.eResource();
						if (res instanceof XMLResource) {
							((XMLResource) res).setID(copy, id);
						}
					}

					// Replace incoming references to the old stereotypes with references to the new stereotypes
					for (Setting setting : ImmutableList.copyOf(getNonNavigableInverseReferences(original))) {
						// Don't update cross-references between the old stereotype applications!
						if (!copier.containsKey(setting.getEObject())) {
							EStructuralFeature ref = setting.getEStructuralFeature();

							if ((ref != null) && ref.isChangeable()) {
								if (ref.isMany()) {
									@SuppressWarnings("unchecked")
									EList<EObject> list = ((EList<EObject>) setting.getEObject().eGet(ref));
									list.set(list.indexOf(original), copy);
								} else {
									setting.set(copy);
								}
							}
						}
					}
				}

				sub2.worked(1);
			}
			sub2.done();

			// Delete all trace of the old stereotype applications
			for (EObject root : stereotypeApplications) {
				if (sub.isCanceled()) {
					throw new OperationCanceledException();
				}

				safelyDestroy(root);
				EcoreUtil.remove(root);
			}

			sub.worked(1);

			copier.clear();

			sub.done();
		}

		private void safelyDestroy(EObject eObject) {
			removeCrossReferences(eObject);
			List<EStructuralFeature> fakeContainmentReferences = null;

			for (EContentsEList.FeatureIterator<EObject> iter = (EContentsEList.FeatureIterator<EObject>) eObject.eContents().iterator(); iter.hasNext();) {
				EObject next = iter.next();

				// The 'mixed' feature-map of an AnyType typically includes EReferences that think they are containments but aren't,
				// where there are cross-document references (which are represented in the XMI as nested elements)
				if (next.eIsProxy() || (next.eContainer() != eObject)) {
					// Don't mess with objects contained elsewhere; they are referenced, not actually contained
					if (fakeContainmentReferences == null) {
						fakeContainmentReferences = Lists.newArrayListWithExpectedSize(1);
					}
					fakeContainmentReferences.add(iter.feature());
				} else {
					safelyDestroy(next);
				}
			}

			// If there are any fake-contained references from AnyTypes, remove them so that we don't purge the CacheAdapter from them by mistake
			if (fakeContainmentReferences != null) {
				for (EStructuralFeature toClear : fakeContainmentReferences) {
					eObject.eUnset(toClear);
				}
			}

			// Now we can remove the CacheAdapter without it propagating its removal to non-contained objects
			eObject.eAdapters().clear();
		}

		private void removeCrossReferences(EObject object) {
			ECrossReferenceAdapter xrefAdapter = ECrossReferenceAdapter.getCrossReferenceAdapter(object);
			if (xrefAdapter != null) { // It should not be null because we have the UML CacheAdapter!
				for (EStructuralFeature.Setting next : ImmutableList.copyOf(xrefAdapter.getInverseReferences(object))) {
					EReference reference = (EReference) next.getEStructuralFeature();

					if (reference.isChangeable() && !reference.isContainment() && !reference.isContainer() && !reference.isDerived()) {
						EcoreUtil.remove(next, object);
					}
				}
			}
		}
	}

	protected static class StereotypeApplicationRepairCopier extends StereotypeApplicationCopier {

		private static final long serialVersionUID = 1L;

		private final Pattern whitespace = Pattern.compile("\\s+"); //$NON-NLS-1$

		private final DiagnosticChain diagnostics;

		private final StereotypeApplicationHelper stereotypeApplicationHelper;

		private EObject copying;

		/**
		 * @param profile
		 * @param diagnostics
		 *            may be {@code null}
		 */
		public StereotypeApplicationRepairCopier(Resource resourceUnderRepair, Profile profile, DiagnosticChain diagnostics) {
			super(profile);

			this.diagnostics = diagnostics;
			stereotypeApplicationHelper = StereotypesUtil.getSameResourceStereotypeApplicationHelper(resourceUnderRepair);
		}

		@Override
		public EObject copy(EObject eObject) {
			final EObject previousCopying = copying;

			try {
				copying = eObject;
				return super.copy(eObject);
			} finally {
				copying = previousCopying;
			}
		}

		@Override
		protected NamedElement getNamedElement(ENamedElement element) {
			if (element instanceof EClassifier) {
				EClassifier classifier = (EClassifier) element;
				// Handle case of unrecognized schema
				if (isUnrecognizedSchema(classifier.getEPackage()) && (profile.getDefinition() != null)) {
					// It's unrecognized content. Force look-up in the profile chosen by the user
					EPackage definition = profile.getDefinition();
					EClassifier force = definition.getEClassifier(classifier.getName());
					if (force == null) {
						// Maybe it's in some sub-package that was generated from a nested package
						// containing stereotypes in the profile
						if (!definition.getESubpackages().isEmpty()) {
							force = searchSubpackages(definition, classifier);
						}
					}
					if (force != null) {
						element = force;
					}
				}
			} else if (element instanceof EStructuralFeature) {
				EStructuralFeature feature = (EStructuralFeature) element;
				// Handle case of unrecognized schema
				if (isUnrecognizedSchema(feature.getEContainingClass().getEPackage()) && (profile.getDefinition() != null)) {
					EClassifier classifier = profile.getDefinition().getEClassifier(feature.getEContainingClass().getName());
					if (classifier instanceof EClass) {
						EStructuralFeature force = ((EClass) classifier).getEStructuralFeature(element.getName());
						if (force != null) {
							element = force;
						}
					}
				}
			}

			return super.getNamedElement(element);
		}

		protected EClassifier searchSubpackages(EPackage ePackage, EClassifier unresolved) {
			String nsPrefix = unresolved.getEPackage().getNsPrefix();
			EClassifier result = null;
			String name = unresolved.getName();

			// Breadth-first search because we do a prefix match, to prefer matches higher
			// in the package structure in case of multiple same-named stereotypes
			Queue<EPackage> search = new LinkedList<EPackage>(ePackage.getESubpackages());

			for (EPackage next = search.poll(); (next != null) && (result == null); next = search.poll()) {
				// Match on the package's nsPrefix, accounting for possible _1, _2, etc. suffixes
				// for differentiation of EPackages that specify the same prefix
				if ((nsPrefix == null) ? (next.getNsPrefix() == null) : nsPrefix.startsWith(next.getNsPrefix())) {
					result = next.getEClassifier(name);
					if ((result == null) && !next.getESubpackages().isEmpty()) {
						search.addAll(next.getESubpackages());
					}
				}
			}

			return result;
		}

		protected boolean isUnrecognizedSchema(EPackage ePackage) {
			return StereotypesUtil.isUnrecognizedSchema(ePackage, copying);
		}

		@Override
		protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
			if (copyEObject == null) {
				// We couldn't find the corresponding stereotype/class/datatype in the profile, so it is dropped and we can't copy any properties
				return;
			}

			if (eAttribute == XMLTypePackage.Literals.ANY_TYPE__ANY_ATTRIBUTE) {
				// The 'anyAttribute' feature-map only appears in unknown schema content
				copyUnrecognizedContentAnyAttribute(eAttribute, eObject, copyEObject);
			} else if (eAttribute == XMLTypePackage.Literals.ANY_TYPE__MIXED) {
				// UML stereotype applications will not have arbitrarily mixed content, but nested objects (further AnyTypes)
				// and elements for multi-valued attributes will appear in this feature map
				copyUnrecognizedContentMixed(eAttribute, eObject, copyEObject);
			} else {
				super.copyAttribute(eAttribute, eObject, copyEObject);
			}
		}

		protected void copyUnrecognizedContentAnyAttribute(EAttribute anyAttribute, EObject eObject, EObject copyEObject) {
			FeatureMap featureMap = (FeatureMap) eObject.eGet(anyAttribute);
			for (FeatureMap.Entry next : featureMap) {
				EStructuralFeature f = next.getEStructuralFeature();

				EStructuralFeature copyFeature = copyEObject.eClass().getEStructuralFeature(f.getName());
				if (copyFeature instanceof EReference) {
					// values in the XMI will be IDREFs or HREFs
					String refs = String.valueOf(next.getValue());
					for (String ref : whitespace.split(refs)) {
						EObject referenced = resolveRef(eObject, ref);
						if (referenced == null) {
							String propertyName = getQualifiedName(UMLUtil.getNamedElement(copyFeature, eObject));
							handleException(new IllegalStateException(String.format("Unresolved reference in stereotype property %s: %s", propertyName, ref))); //$NON-NLS-1$
						} else {
							// Is it an AnyType? If so, perhaps we have already converted it
							if (referenced instanceof AnyType) {
								// Look for copy
								EObject referencedCopy = get(referenced);
								if (referencedCopy != null) {
									referenced = referencedCopy;
								} else {
									// Create a new proxy for it
									referenced = createProxy((EReference) copyFeature, (AnyType) referenced);
								}
							}

							if (!copyFeature.getEType().isInstance(referenced)) {
								String propertyName = getQualifiedName(UMLUtil.getNamedElement(copyFeature, eObject));
								handleException(new IllegalStateException(String.format("Attempt to reference object of type %s in stereotype property %s", UML2EcoreConverter.getOriginalName(referenced.eClass()), propertyName))); //$NON-NLS-1$
							} else {
								eAdd(copyEObject, copyFeature, referenced);
							}
						}
					}
				} else if (copyFeature instanceof EAttribute) {
					// values in the XMI will be string serializations of data types
					EDataType dataType = ((EAttribute) copyFeature).getEAttributeType();

					try {
						Object value = EcoreUtil.createFromString(dataType, String.valueOf(next.getValue()));
						eAdd(copyEObject, copyFeature, value);
					} catch (Exception e) {
						handleException(e);
					}
				} else {
					// feature not matched. Because this is unknown schema, the Ecore feature's actual qualified name is useless
					// (it's something like '{EPackage}::DocumentRoot::foo')
					String qualifiedName = String.format("%s::%s", UMLUtil.getNamedElement(copyEObject.eClass(), eObject).getName(), f.getName());
					handleException(new IllegalStateException(String.format("Definition for property '%s' not found in profile '%s'", qualifiedName, getQualifiedName(profile)))); //$NON-NLS-1$
				}
			}
		}

		protected void eAdd(EObject owner, EStructuralFeature feature, Object value) {
			if (feature.isChangeable() && !feature.isDerived()) {
				if (feature.isMany()) {
					@SuppressWarnings("unchecked")
					Collection<Object> list = (Collection<Object>) owner.eGet(feature);
					list.add(value);
				} else {
					owner.eSet(feature, value);
				}
			}
		}

		protected EObject resolveRef(EObject anyType, String ref) {
			Resource baseResource = anyType.eResource();
			if (baseResource == null) {
				return null; // Already resolved & removed?
			}

			URI uri;
			if (ref.contains("#")) {
				// HREF case
				uri = baseResource.getURI().resolve(URI.createURI(ref));
			} else {
				// IDREF case
				uri = baseResource.getURI().appendFragment(ref);
			}

			return baseResource.getResourceSet().getEObject(uri, true);
		}

		protected EObject createProxy(EReference reference, AnyType original) {
			EObject result = original; // As a fall-back, we would just return the original and report a problem

			EClass type = reference.getEReferenceType();
			if (type.isAbstract()) {
				// The original should have had type information, then, in the reference
				type = getTarget(original);
			}

			if ((type != null) && !type.isAbstract()) {
				result = EcoreUtil.create(type);
				Resource resource = original.eResource();
				((InternalEObject) result).eSetProxyURI(resource.getURI().appendFragment(resource.getURIFragment(original)));
			}

			return result;
		}

		protected void copyUnrecognizedContentMixed(EAttribute mixed, EObject eObject, EObject copyEObject) {
			FeatureMap featureMap = (FeatureMap) eObject.eGet(mixed);
			for (FeatureMap.Entry next : featureMap) {
				EStructuralFeature f = next.getEStructuralFeature();

				// UML stereotypes do not use comments, arbitrary mixed text, processing instructions, etc.
				if (f.getEContainingClass() != XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT) {
					// The incoming thing is an element of some kind
					if (f instanceof EReference) {
						EObject anyType = (EObject) next.getValue();
						EStructuralFeature copyFeature = copyEObject.eClass().getEStructuralFeature(f.getName());
						if (copyFeature instanceof EAttribute) {
							// Get the text value of the element, convert it to the appropriate data type, and set it into the attribute
							try {
								String text = getTextContent(anyType);
								if (text != null) {
									EDataType dataType = ((EAttribute) copyFeature).getEAttributeType();
									Object value = EcoreUtil.createFromString(dataType, text);
									eAdd(copyEObject, copyFeature, value);
								}
							} catch (Exception e) {
								handleException(e);
							}
						} else if (copyFeature instanceof EReference) {
							EReference reference = (EReference) copyFeature;
							if (!reference.isContainment()) {
								if (anyType.eClass() != XMLTypePackage.Literals.ANY_TYPE) {
									// We got a real proxy, somehow. Just use it
									if (!copyFeature.getEType().isInstance(anyType)) {
										String propertyName = getQualifiedName(UMLUtil.getNamedElement(copyFeature, eObject));
										handleException(new IllegalStateException(String.format("Attempt to reference object of type %s in stereotype property %s", UML2EcoreConverter.getOriginalName(anyType.eClass()), propertyName))); //$NON-NLS-1$
									} else {
										eAdd(copyEObject, reference, anyType);
									}
								} else {
									// Get the HREF/IDREF from the element, resolve the referenced object, and set it into the reference
									String refs = getTextContent(anyType);
									if (refs != null) {
										for (String ref : whitespace.split(refs)) {
											EObject referenced = resolveRef(eObject, ref);
											if (referenced == null) {
												String propertyName = getQualifiedName(UMLUtil.getNamedElement(copyFeature, eObject));
												handleException(new IllegalStateException(String.format("Unresolved reference in stereotype property %s: %s", propertyName, ref))); //$NON-NLS-1$
											} else if (!copyFeature.getEType().isInstance(referenced)) {
												String propertyName = getQualifiedName(UMLUtil.getNamedElement(copyFeature, eObject));
												handleException(new IllegalStateException(String.format("Attempt to reference object of type %s in stereotype property %s", UML2EcoreConverter.getOriginalName(referenced.eClass()), propertyName))); //$NON-NLS-1$
											} else {
												eAdd(copyEObject, reference, referenced);
											}
										}
									}
								}
							} else {
								// Handle the contained object
								EObject containedCopy = copy(anyType);
								if (containedCopy != null) {
									if (reference.getEReferenceType().isInstance(containedCopy)) {
										eAdd(copyEObject, reference, containedCopy);
									} else {
										String propertyName = getQualifiedName(UMLUtil.getNamedElement(reference, eObject));
										handleException(new IllegalStateException(String.format("Attempt to contain object of type %s in stereotype property %s", UML2EcoreConverter.getOriginalName(containedCopy.eClass()), propertyName))); //$NON-NLS-1$
									}
								}
							}
						} else {
							// feature not matched. Because this is unknown schema, the Ecore feature's actual qualified name is useless
							// (it's something like '{EPackage}::DocumentRoot::foo')
							String qualifiedName = String.format("%s::%s", UMLUtil.getNamedElement(copyEObject.eClass(), eObject).getName(), f.getName());
							handleException(new IllegalStateException(String.format("Definition for property '%s' not found in profile '%s'", qualifiedName, getQualifiedName(profile)))); //$NON-NLS-1$
						}
					}
				}
			}
		}

		protected String getTextContent(EObject anyType) {
			String result = null;

			Object value = anyType.eGet(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT);
			if (value instanceof String) {
				result = (String) value;
			} else if (value instanceof List<?>) {
				List<?> list = (List<?>) value;
				if (!list.isEmpty()) {
					result = (String) list.get(0);
				}
			}

			return result;
		}

		@Override
		protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
			if (copyEObject != null) {
				final EObject previousCopying = copying;

				try {
					copying = eObject;
					super.copyReference(eReference, eObject, copyEObject);
				} finally {
					copying = previousCopying;
				}
			} // Else we couldn't find the corresponding stereotype/class/datatype in the profile, so it is dropped and we can't copy any properties
		}

		@Override
		protected void copyProxyURI(EObject eObject, EObject copyEObject) {
			if (copyEObject != null) {
				super.copyProxyURI(eObject, copyEObject);
			} // Else we couldn't find the corresponding stereotype/class/datatype in the profile, so it is dropped and we can't copy the proxy URI
		}

		/**
		 * Override the EMF implementation to skip feature-maps, because we do not use them in UML Profiles.
		 */
		@Override
		public void copyReferences() {
			for (Map.Entry<EObject, EObject> entry : entrySet()) {
				EObject eObject = entry.getKey();
				EObject copyEObject = entry.getValue();
				EClass eClass = eObject.eClass();

				for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
					EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
					if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
						if (eStructuralFeature instanceof EReference) {
							EReference eReference = (EReference) eStructuralFeature;
							if (!eReference.isContainment() && !eReference.isContainer()) {
								copyReference(eReference, eObject, copyEObject);
							}
						}
					}
				}
			}
		}

		@Override
		protected EObject createCopy(EObject eObject) {
			try {
				Element baseElement = getBaseElement(eObject);
				return baseElement == null
						? super.createCopy(eObject)
						: stereotypeApplicationHelper.applyStereotype(baseElement, getTarget(eObject.eClass()));
			} catch (IllegalStateException e) {
				// target EClass does not exist in the profile
				handleException(e);
				return null;
			}
		}

		@Override
		protected ENamedElement getDefinition(NamedElement element) {
			// Look for the same named element in the new profile (assuming that the incoming element
			// is from the old profile) and get the Ecore definition of that
			return super.getDefinition(getSameNamedElement(element, profile));
		}

		protected NamedElement getSameNamedElement(NamedElement namedElement, Package package_) {
			if (namedElement == null) {
				return null;
			}

			// Ensure that the search is relative to the target package
			String qualifiedName = namedElement.getQualifiedName();
			String prefix = package_.getQualifiedName();
			int last = prefix.lastIndexOf(NamedElement.SEPARATOR);
			if (last >= 0) {
				prefix = prefix.substring(0, last + NamedElement.SEPARATOR.length());

				if (qualifiedName.startsWith(prefix)) {
					qualifiedName = qualifiedName.substring(prefix.length());
				}
			}

			return findNamedElement(package_, qualifiedName, namedElement.eClass());
		}

		@Override
		protected void handleException(Exception exception) {
			// target EClass does not exist in the profile or target EClass does not have this attribute in the profile
			if (diagnostics != null) {
				Object[] data = null;

				if (copying != null) {
					Element base = (copying == null) ? null : (copying instanceof AnyType) ? guessAnyTypeBaseElement(copying) : getBaseElement(copying);
					if (base != null) {
						data = new Object[] { base };
					} else {
						data = new Object[] { copying.eResource() };
					}
				}

				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING, Activator.PLUGIN_ID, 0, exception.getLocalizedMessage(), data));
			} else {
				super.handleException(exception);
			}
		}

		protected Element guessAnyTypeBaseElement(EObject anyType) {
			Element result = null;

			// The base_Xyz extension end is always at most one, so it should be serialized as an IDREF
			for (FeatureMap.Entry next : (FeatureMap) anyType.eGet(XMLTypePackage.Literals.ANY_TYPE__ANY_ATTRIBUTE)) {
				if (next.getEStructuralFeature().getName().startsWith("base_")) {
					Object value = next.getValue();
					EObject referenced = (value instanceof EObject) ? (EObject) value : resolveRef(anyType, String.valueOf(next.getValue()));
					if (referenced instanceof Element) {
						result = (Element) referenced;
						break;
					}
				}
			}

			// But, if it's a cross-doc reference, it will be an HREF and thus probably an element
			if (result == null) {
				for (FeatureMap.Entry next : (FeatureMap) anyType.eGet(XMLTypePackage.Literals.ANY_TYPE__MIXED)) {
					if ((next.getEStructuralFeature() instanceof EReference) && next.getEStructuralFeature().getName().startsWith("base_")) {
						EObject value = (EObject) next.getValue();
						EObject referenced = (value.eClass() != XMLTypePackage.Literals.ANY_TYPE) ? (EObject) value : resolveRef(anyType, getTextContent(value));
						if (referenced instanceof Element) {
							result = (Element) referenced;
							break;
						}
					}
				}
			}

			return result;
		}

		private static NamedElement findNamedElement(NamedElement search, String qualifiedName, EClass metaclass) {
			NamedElement result = null;

			int separator = qualifiedName.indexOf(NamedElement.SEPARATOR);
			if (separator < 0) {
				// last segment
				if (qualifiedName.equals(search.getName()) && metaclass.isInstance(search)) {
					result = search;
				}
			} else {
				String nextSegment = qualifiedName.substring(0, separator);
				String rest = qualifiedName.substring(separator + NamedElement.SEPARATOR.length());

				// Must be a namespace if we are to look for another segment
				if (nextSegment.equals(search.getName()) && (search instanceof Namespace)) {
					for (NamedElement next : ((Namespace) search).getMembers()) {
						result = findNamedElement(next, rest, metaclass);
						if (result != null) {
							break;
						}
					}
				}
			}

			return result;
		}


		protected Map<EClass, EClass> stereotypeDefinitionCache = new HashMap<EClass, EClass>();

		@Override
		protected EClass getTarget(EClass eClass) {
			if (!stereotypeDefinitionCache.containsKey(eClass)) {
				EClass result = super.getTarget(eClass);
				stereotypeDefinitionCache.put(eClass, result);
			}
			return stereotypeDefinitionCache.get(eClass);
		}
	}
}
