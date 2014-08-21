/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chokri Mraidha (CEA LIST) Chokri.Mraidha@cea.fr - Initial API and implementation
 *  Patrick Tessier (CEA LIST) Patrick.Tessier@cea.fr - modification
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.definition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;



/**
 * <p>
 * this class is used to manage the redefinition of profiles:
 * </p>
 * The normal definition in UML is like this:
 * <ul>
 * <li>Stereotype-->Eclass</li>
 * <li>Enumeration-->EEnumeration :local copy
 * <li>Datatype-->EClass</li>
 * <li>Property--> EReference or EAttribute with ref on local copy</li>
 * <li>PrimitiveType-> Edatatype : local copy</li>
 * </ul>
 * In papyrus:
 * <ul>
 * <li>Stereotype-->Eclass
 * <li>Enumeration-->EEnumeration:local copy
 * <li>Datatype-->EClass
 * <li>Property--> EReference or EAttribute with ref on direct definition
 * <li>PrimitiveType-> Edatatype : local copy
 * </ul>
 * .
 *
 *
 * @deprecated API was moved to the plugin org.eclipse.papyrus.uml.tools for Bug 435995.
 *             It was preserved for standard releases of Papyrus 1.0.0
 * @see org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition
 */
@Deprecated
public class ProfileRedefinition extends org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition {


	/**
	 * Redefine profile.
	 *
	 * @param thepackage
	 *            the thepackage
	 * @param definitionAnnotation
	 *            the definition annotation
	 */
	@Deprecated
	public static void redefineProfile(Package thepackage, org.eclipse.papyrus.uml.profile.definition.PapyrusDefinitionAnnotation definitionAnnotation) {
		org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.redefineProfile(thepackage, definitionAnnotation);
	}

	/**
	 * redefine only real definition or do nothing.
	 *
	 * @param eclass
	 *            the given eclass that we want to redefine
	 */
	@Deprecated
	public static void redefineEclass(EClass eclass) {
		org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.redefineEclass(eclass);
	}

	/**
	 * Redefine e reference.
	 *
	 * @param eReference
	 *            the e reference
	 * @param profileDefinition
	 *            the profile definition
	 */
	@Deprecated
	public static void redefineEReference(EReference eReference, EPackage profileDefinition) {
		org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.redefineEReference(eReference, profileDefinition);
	}


	/**
	 * return id this Eclass is the real Definition.
	 *
	 * @param eclass
	 *            the eclass that we want to test
	 * @return true if this is the real definition or not is this is a local
	 *         copy
	 */
	@Deprecated
	public static boolean isADirectDefinition(EClass eclass) {
		return org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.isADirectDefinition(eclass);
	}

	/**
	 * look for the real definition of the stereotype where the EClass may be
	 * the definition.
	 *
	 * @param eClassifier
	 *            the e classifier
	 * @return the real definition or the itself
	 */
	@Deprecated
	public static EClassifier lookForDirectDefinitionFrom(EClassifier eClassifier) {
		return org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.lookForDirectDefinitionFrom(eClassifier);
	}


	/**
	 * this method is used to suppress all local copy of EClass in each Profile.
	 *
	 * @param thePackage
	 *            that we want to clean
	 */
	@Deprecated
	public static void cleanProfile(Package thePackage) {
		org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.cleanProfile(thePackage);
	}


	/**
	 * this method is used to created an EAttribute from an Ereference.
	 *
	 * @param container
	 *            the Eclass that will contain the eattribute
	 * @param eReference
	 *            from this, the eattribute will be created
	 * @return the created Eattribute
	 */
	@Deprecated
	public static EAttribute createEAttribute(EClass container, EReference eReference) {
		return org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.createEAttribute(container, eReference);
	}



	/**
	 * this method is used to obtain the classifier from its definition.
	 *
	 * @param eclass
	 *            that is a definition
	 * @return the classifier that produce this definition
	 */
	@Deprecated
	public static Classifier getUMLClassifierFromDefinition(EClassifier eclass) {
		return org.eclipse.papyrus.uml.tools.profile.definition.ProfileRedefinition.getUMLClassifierFromDefinition(eclass);
	}

}
