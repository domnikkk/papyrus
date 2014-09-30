/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 444092
 *  
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEvent;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * A Helper class for UML
 *
 * @author Camille Letavernier
 */
// TODO/FIXME : Check implementations. Most of them are old and don't always match the
// specification for some cases.
public class UMLUtil {

	/**
	 * Retrieve the UML semantic element from the given Object.
	 * This method relies on {@link EMFHelper#getEObject(Object)} to resolve
	 * an EObject from an Object, then checks if the resulting EObject is a
	 * UML Element.
	 *
	 * @param source
	 *            The Object to resolve
	 * @return
	 *         The UML semantic element, or null if it couldn't be resolved
	 */
	public static Element resolveUMLElement(Object source) {
		EObject eElement = EMFHelper.getEObject(source);

		if (eElement instanceof Element) {
			return (Element) eElement;
		}

		return null;
	}

	/**
	 * Tests if a class is a subclass of another class. The classes are described
	 * by their className, in the UML Metamodel.
	 *
	 * @param className
	 * @param superclassName
	 * @return
	 *         True if the class className is a subclass of the class superclassName
	 */
	public static boolean isSubClass(String className, String superclassName) {
		EClass eClass = (EClass) getUMLMetamodel().getEClassifier(className);
		EClass superClass = (EClass) getUMLMetamodel().getEClassifier(superclassName);
		return EMFHelper.isSubclass(eClass, superClass);
	}

	/**
	 * Retrieve the EditingDomain for the given source object
	 *
	 * @param source
	 * @return
	 *         The source object's editing domain, or null if it couldn't be found
	 */
	public static EditingDomain resolveEditingDomain(Object source) {
		return EMFHelper.resolveEditingDomain(resolveUMLElement(source));
	}

	/**
	 * @return the UML EPackage
	 */
	public static EPackage getUMLMetamodel() {
		return UMLPackage.eINSTANCE;
	}

	/**
	 * Search the given stereotype (by name) on the given UML Element.
	 * If the search is not strict, the name may be the qualified name of a
	 * super-stereotype of some applied stereotype
	 *
	 * @param umlElement
	 *            The UML Element on which the stereotype is applied
	 * @param stereotypeName
	 *            The qualified name of the stereotype
	 * @param strict
	 *            If set to true, only a stereotype matching the exact qualified name
	 *            will be returned. Otherwise, any subtype of the given stereotype may be
	 *            returned. Note that if more than one stereotype is a subtype of the
	 *            given stereotype, the first matching stereotype is returned.
	 * @return
	 *         The first matching stereotype, or null if none was found
	 */
	public static Stereotype getAppliedStereotype(Element umlElement, String stereotypeName, boolean strict) {
		if (umlElement == null || stereotypeName == null) {
			return null;
		}

		Stereotype stereotype = umlElement.getAppliedStereotype(stereotypeName);
		if (strict || stereotype != null) {
			return stereotype;
		}

		// The parent stereotype is not always applicable...
		// stereotype = umlElement.getApplicableStereotype(stereotypeName);

		List<Stereotype> subStereotypes = findSubstereotypes(umlElement, stereotypeName);

		for (Stereotype subStereotype : subStereotypes) {
			if (umlElement.getAppliedStereotypes().contains(subStereotype)) {
				return subStereotype;
			}
		}

		return null;
	}

	/**
	 * Obtains the possibly implicitly applied (by virtue of some sub-stereotype of it being applied) stereotype
	 * of the specified name on a UML element.
	 *
	 * @param umlElement
	 *            The UML Element on which the stereotype is (possibly pseudo-) applied
	 * @param stereotypeName
	 *            The qualified name of the stereotype
	 * @return
	 *         The stereotype of the given name that either is applied or has some substereotype that is applied to the element
	 */
	public static Stereotype getAppliedSuperstereotype(Element umlElement, String stereotypeName) {
		if (umlElement == null) {
			throw new IllegalArgumentException("umlElement"); //$NON-NLS-1$
		}
		if (stereotypeName == null) {
			throw new IllegalArgumentException("stereotypeName"); //$NON-NLS-1$
		}

		// Simplest case
		Stereotype result = umlElement.getAppliedStereotype(stereotypeName);
		if (result == null) {
			for (Stereotype sub : findSubstereotypes(umlElement, stereotypeName)) {
				if (umlElement.isStereotypeApplied(sub)) {
					result = getSuperstereotype(sub, stereotypeName);
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Search the given stereotype (by name) that is applicable to the given UML Element.
	 * If the search is not strict, the name may be the qualified name of a
	 * sub-stereotype of an applied stereotype
	 *
	 * @param umlElement
	 *            The UML Element on which the stereotype could be applied. Must not be {@code null}
	 * @param stereotypeName
	 *            The qualified name of the stereotype. Must not be {@code null}
	 * @param strict
	 *            If set to true, only a stereotype matching the exact qualified name
	 *            will be returned. Otherwise, any subtype of the given stereotype may be
	 *            returned. Note that if more than one stereotype is a subtype of the
	 *            given stereotype, the first matching stereotype is returned.
	 * @return
	 *         The first matching applicable stereotype, or null if none was found
	 */
	public static Stereotype getApplicableStereotype(Element umlElement, String stereotypeName, boolean strict) {
		if (umlElement == null) {
			throw new IllegalArgumentException("umlElement"); //$NON-NLS-1$
		}
		if (stereotypeName == null) {
			throw new IllegalArgumentException("stereotypeName"); //$NON-NLS-1$
		}

		Stereotype result = umlElement.getApplicableStereotype(stereotypeName);
		if ((result == null) && !strict) {
			List<Stereotype> subStereotypes = findSubstereotypes(umlElement, stereotypeName);

			for (Stereotype subStereotype : subStereotypes) {
				if (umlElement.isStereotypeApplicable(subStereotype)) {
					result = subStereotype;
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Gets the first stereotype conforming to the given {@code stereotype} that is applied to the specified UML element.
	 * 
	 * @param umlElement
	 *            an UML element. Must not be {@code null}
	 * @param stereotype
	 *            a stereotype that may or may not be applied to the element. Must not be {@code null}
	 * 
	 * @return the {@code stereotype} if it is applied to the element, or some subtype of it that is applied,
	 *         if any sub-type of the {@code stereotype} is applied to the element
	 */
	public static Stereotype getAppliedSubstereotype(Element umlElement, Stereotype stereotype) {
		if (umlElement == null) {
			throw new IllegalArgumentException("umlElement"); //$NON-NLS-1$
		}
		if (stereotype == null) {
			throw new IllegalArgumentException("stereotype"); //$NON-NLS-1$
		}

		Stereotype result = null;
		if (umlElement.isStereotypeApplied(stereotype)) {
			result = stereotype;
		} else {
			result = getAppliedStereotype(umlElement, stereotype.getQualifiedName(), false);
		}

		return result;
	}

	/**
	 * Finds the Stereotype matching the given name.
	 * The search is done in the context of the given UML Element
	 * (i.e. the Profiles applied on the Element's nearest package)
	 *
	 * @param umlElement
	 * @param stereotypeName
	 * @return
	 */
	public static Stereotype findStereotype(Element umlElement, String stereotypeName) {
		if (umlElement == null || stereotypeName == null) {
			return null;
		}

		Stereotype stereotype = null;
		org.eclipse.uml2.uml.Package umlPackage = umlElement.getNearestPackage();
		if (umlPackage == null) {
			stereotype = umlElement.getApplicableStereotype(stereotypeName);
		} else {
			outerLoop: for (Profile profile : umlPackage.getAllAppliedProfiles()) {
				for (Stereotype ownedStereotype : profile.getOwnedStereotypes()) {
					if (ownedStereotype.getQualifiedName().equals(stereotypeName)) {
						stereotype = ownedStereotype;
						break outerLoop;
					}
				}
			}
		}
		return stereotype;
	}

	/**
	 * Returns all stereotypes matching the given qualified stereotype name, and their substereotypes
	 * The search is performed in the context of the given UML Element, i.e. the profiles applied
	 * on the Element's nearest package
	 *
	 * @param umlElement
	 * @param stereotypeName
	 * @return
	 */
	public static List<Stereotype> findSubstereotypes(Element umlElement, String stereotypeName) {
		if (umlElement == null || stereotypeName == null) {
			return null;
		}

		Set<Stereotype> stereotypes = new HashSet<Stereotype>();
		org.eclipse.uml2.uml.Package umlPackage = umlElement.getNearestPackage();

		if (umlPackage == null) {
			Stereotype stereotype = umlElement.getApplicableStereotype(stereotypeName);
			if (stereotype != null) {
				stereotypes.add(stereotype);
			}
		} else {
			for (Profile profile : umlPackage.getAllAppliedProfiles()) {
				for (Stereotype ownedStereotype : profile.getOwnedStereotypes()) {
					for (Stereotype superStereotype : getAllSuperStereotypes(ownedStereotype)) {
						if (stereotypeName.equals(superStereotype.getQualifiedName())) {
							stereotypes.add(ownedStereotype);
						}
					}
				}
			}
		}

		return new LinkedList<Stereotype>(stereotypes);
	}

	private static Stereotype getSuperstereotype(Stereotype substereotype, String qualifiedName) {
		Stereotype result = null;

		if (qualifiedName.equals(substereotype.getQualifiedName())) {
			result = substereotype;
		} else {
			for (Stereotype next : getAllSuperStereotypes(substereotype)) {
				if (qualifiedName.equals(next.getQualifiedName())) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Returns a collection of all super stereotypes of the given stereotype
	 * (Including itself)
	 *
	 * @param stereotype
	 * @return
	 *         A collection of all super stereotypes
	 */
	public static Collection<Stereotype> getAllSuperStereotypes(Stereotype stereotype) {
		Set<Stereotype> result = new HashSet<Stereotype>();
		if (stereotype != null) {
			getAllSuperStereotypes(stereotype, result);
		}
		return result;
	}

	private static void getAllSuperStereotypes(Stereotype stereotype, Set<Stereotype> result) {
		result.add(stereotype);
		for (Classifier superClassifier : stereotype.getGenerals()) {
			if (superClassifier instanceof Stereotype && !result.contains(superClassifier)) {
				getAllSuperStereotypes((Stereotype) superClassifier, result);
			}
		}
	}

	/**
	 * Retrieves the UML Class associated to the given Message
	 *
	 * @param message
	 * @return the UML Class associated to the given Message
	 */
	public static org.eclipse.uml2.uml.Class getContextClassForMessage(Message message) {
		MessageOccurrenceSpecification receiveEvent = (MessageOccurrenceSpecification) message.getReceiveEvent();

		if (receiveEvent == null) {
			return null;
		}

		return getContextClassForMessageOccurrence(receiveEvent);
	}

	/**
	 * Retrieves the UML Class associated to the given MessageOccurrenceSpecification
	 *
	 * @param messageOccurrence
	 * @return the UML Class associated to the given MessageOccurrenceSpecification
	 */
	public static org.eclipse.uml2.uml.Class getContextClassForMessageOccurrence(MessageOccurrenceSpecification messageOccurrence) {
		List<Lifeline> lifelines = messageOccurrence.getCovereds();
		if (lifelines.isEmpty()) {
			return null; // We can't find the context
		} else if (lifelines.size() == 1) {
			Lifeline lifeline = lifelines.get(0);
			ConnectableElement element = lifeline.getRepresents();
			if (element == null) {
				return null;
			}
			Type type = element.getType();
			if (type instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) type;
				return clazz;
			} else {
				return null; // The type is not a Class
			}
		} else {
			return null; // Too many contexts : which one should we choose ?
		}
	}

	/**
	 * Finds the UML Class associated to the given MessageEvent
	 *
	 * @param event
	 * @return the Class associated to the given MessageEvent
	 */
	public static Class getContextClassForMessageEvent(MessageEvent event) {
		Collection<EStructuralFeature.Setting> settings = EMFHelper.getUsages(event);
		if (settings.isEmpty()) {
			return null;
		}

		if (settings.size() == 1) {
			EObject referer = settings.iterator().next().getEObject();
			if (referer instanceof MessageOccurrenceSpecification) {
				return UMLUtil.getContextClassForMessageOccurrence((MessageOccurrenceSpecification) referer);
			} else {
				return null;
			}
		}

		MessageOccurrenceSpecification referer = null;
		EObject newReferer = null;

		for (EStructuralFeature.Setting setting : settings) {
			newReferer = setting.getEObject();
			if (!(newReferer instanceof MessageOccurrenceSpecification)) {
				continue;
			}

			if (referer == null || referer == newReferer) {
				referer = (MessageOccurrenceSpecification) newReferer;
			} else {
				referer = null;
				break;
			}
		}

		if (referer == null) {
			return null;
		}

		return UMLUtil.getContextClassForMessageOccurrence(referer);
	}

	/**
	 * Destroy all elements in a given list
	 *
	 * @param list
	 *            a list of elements
	 */
	public static void destroyElements(EList<? extends Element> list) {
		BasicEList<Element> listCopy = new BasicEList<Element>();
		// loop on copy in order to avoid iterator exception
		listCopy.addAll(list);
		for (Element element : listCopy) {
			element.destroy();
		}
	}
}
