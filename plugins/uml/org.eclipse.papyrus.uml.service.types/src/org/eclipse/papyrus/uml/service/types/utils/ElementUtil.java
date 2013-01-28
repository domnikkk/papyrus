/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *		Olivier Mélois (atos) olivier.melois@atos.net - addition of a method to compute a list of tables
 *			that descend from a given element
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.facet.widgets.nattable.instance.tableinstance.TableInstance;
import org.eclipse.emf.facet.widgets.nattable.instance.tableinstance.TableinstancePackage;
import org.eclipse.papyrus.core.utils.PapyrusEcoreUtils;
import org.eclipse.papyrus.table.instance.papyrustableinstance.PapyrusTableInstance;
import org.eclipse.papyrus.table.instance.papyrustableinstance.PapyrustableinstancePackage;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;

/**
 * Utility class use to retrieve stereotype applications.
 * 
 * Copied from oep.umlutils to avoid dependency toward this plug-in.
 * 
 */
public class ElementUtil {

	/**
	 * The ID for Papyrus EAnnotations.
	 */
	private static final String PAPYRUS_URI = "org.eclipse.papyrus";

	/**
	 * The ID for element nature in Papyrus EAnnotations.
	 */
	private static final String PAPYRUS_ELEMENT_NATURE = "nature";

	/**
	 * Convenient method to retrieve the StereotypeApplication by passing an element of the static profile.
	 * 
	 * @param <T>
	 *        the type of stereotype to look for
	 * @param element
	 *        an UML model element
	 * @param clazz
	 *        the class of an element of a static profile. Compatible sub-types will be returned as well
	 * @return the stereotype application or null if such stereotype is not applied
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T getStereotypeApplication(Element element, Class<T> clazz) {
		for(EObject stereoApplication : element.getStereotypeApplications()) {
			// check whether the stereotype is an instance of the passed parameter class
			if(clazz.isInstance(stereoApplication)) {
				return (T)stereoApplication;
			}
		}
		return null;
	}

	/**
	 * Adds the specified nature to this element.
	 * 
	 * @param element
	 *        The receiving '<em><b>Element</b></em>' model object.
	 * @param nature
	 *        The nature to add.
	 */
	public static void addNature(Element element, String nature) {
		EMap<String, String> details = UML2Util.getEAnnotation(element, PAPYRUS_URI, true).getDetails();

		if(!details.containsKey(PAPYRUS_ELEMENT_NATURE)) {
			details.put(PAPYRUS_ELEMENT_NATURE, nature);
		} else {
			details.removeKey(PAPYRUS_ELEMENT_NATURE);
			details.put(PAPYRUS_ELEMENT_NATURE, nature);
		}

	}

	/**
	 * Retrieves the nature for this element.
	 * 
	 * @param element
	 *        The receiving '<em><b>Element</b></em>' model object.
	 */
	public static String getNature(Element element) {
		EAnnotation eAnnotation = element.getEAnnotation(PAPYRUS_URI);

		if((eAnnotation != null) && (eAnnotation.getDetails().containsKey(PAPYRUS_ELEMENT_NATURE))) {
			return eAnnotation.getDetails().get(PAPYRUS_ELEMENT_NATURE);
		}

		return "";
	}

	/**
	 * Removes the nature from this element.
	 * 
	 * @param element
	 *        The receiving '<em><b>Element</b></em>' model object.
	 */
	public static boolean removeNature(Element element) {
		EAnnotation eAnnotation = element.getEAnnotation(PAPYRUS_URI);

		if(eAnnotation != null) {
			EMap<String, String> details = eAnnotation.getDetails();

			if(details.containsKey(PAPYRUS_ELEMENT_NATURE)) {
				details.removeKey(PAPYRUS_ELEMENT_NATURE);
				return true;
			}
		}

		return false;
	}

	/**
	 * Determines whether this element has the specified nature.
	 * 
	 * @param element
	 *        The receiving '<em><b>Element</b></em>' model object.
	 * @param nature
	 *        The nature in question.
	 */
	public static boolean hasNature(Element element, String nature) {
		EAnnotation eAnnotation = element.getEAnnotation(PAPYRUS_URI);

		if((eAnnotation != null) && (eAnnotation.getDetails().containsKey(PAPYRUS_ELEMENT_NATURE))) {
			if(nature.equals(eAnnotation.getDetails().get(PAPYRUS_ELEMENT_NATURE))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Creates an iterable containing all the Papyrus Tables that are descending from the context.
	 * 
	 * @author olivier melois (Atos)
	 */
	public static Iterable<EObject> createDescendantTablesIterable(EObject context) {

		Set<EObject> result = Sets.newHashSet();

		TreeIterator<EObject> eAllContents = EcoreUtil.getAllProperContents(context, true);
		Iterator<EObject> contextAndDescendants = Iterators.concat(eAllContents, Iterators.singletonIterator(context));

		final Predicate<Setting> keepPapyrusTableInstances = new Predicate<Setting>() {

			public boolean apply(Setting setting) {
				boolean result = true;
				if(setting != null) {
					EObject settingEObject = setting.getEObject();
					result &= settingEObject instanceof PapyrusTableInstance;
					result &= PapyrustableinstancePackage.Literals.PAPYRUS_TABLE_INSTANCE__TABLE == setting.getEStructuralFeature();
				} else {
					result = false;
				}
				return result;
			}
		};

		/*
		 * Predicate used to keep the usages which are PapyrusTableInstances
		 */
		Predicate<Setting> keepTableInstances = new Predicate<Setting>() {

			public boolean apply(Setting setting) {
				boolean result = true;
				if(setting != null) {
					EObject settingEObject = setting.getEObject();
					result &= settingEObject instanceof TableInstance;
					result &= setting.getEStructuralFeature() == TableinstancePackage.Literals.TABLE_INSTANCE__CONTEXT;

					Collection<Setting> references = PapyrusEcoreUtils.getUsages(settingEObject);
					Iterable<Setting> papyrusTableInstances = Iterables.filter(references, keepPapyrusTableInstances);
					//Veryfing that there is at least one papyrusTableInstance
					result = result && !Iterables.isEmpty(papyrusTableInstances);

				} else {
					result = false;
				}
				return result;
			}
		};

		/*
		 * Function to get the eObject from a setting
		 */
		Function<Setting, EObject> getEObject = new Function<Setting, EObject>() {

			public EObject apply(Setting input) {
				EObject settingEObject = input.getEObject();
				Collection<Setting> references = PapyrusEcoreUtils.getUsages(settingEObject);
				Iterable<Setting> papyrusTableInstances = Iterables.filter(references, keepPapyrusTableInstances);
				//Getting the eobject of thie first element of this iterable.
				return Iterables.get(papyrusTableInstances, 0).getEObject();
			}

		};

		/*
		 * For the context and his descendants :
		 */
		while(contextAndDescendants.hasNext()) {
			EObject current = contextAndDescendants.next();
			//Usages
			Iterable<Setting> usages = PapyrusEcoreUtils.getUsages(current);
			//Filtering to keep only papyrus table instances.
			Iterable<Setting> tableInstanceSettings = Iterables.filter(usages, keepTableInstances);
			//Getting the eObjects 
			Iterable<EObject> papyrusTableInstances = Iterables.transform(tableInstanceSettings, getEObject);
			//Adding all the kept usages.
			Iterables.addAll(result, papyrusTableInstances);
		}

		return result;
	}
}
