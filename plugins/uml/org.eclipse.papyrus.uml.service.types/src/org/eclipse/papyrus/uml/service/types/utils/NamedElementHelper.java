/*****************************************************************************
 * Copyright (c) 2008, 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 440263
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.utils;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;

/**
 * This singleton is used to find a new element name with
 * no duplication in the same workspace.
 * 
 * @deprecated Use the {@link NamedElementUtil} API, instead.
 */
@Deprecated
public class NamedElementHelper {

	/** Singleton instance */
	@Deprecated
	public static NamedElementHelper EINSTANCE = new NamedElementHelper();

	@Deprecated
	private String baseString = "default";

	/**
	 * Get the base string to use for default name creation
	 * 
	 * @return the base string
	 * @deprecated should not be used.
	 */
	@Deprecated
	public String getBaseString() {
		return baseString;
	}

	/**
	 * Generic method that returns a new unique name within a {@link Namespace}.
	 * 
	 * @param umlParent
	 *        the parent of the element to create
	 * @param eclass
	 *        the eClass of the element to name
	 * 
	 * @return a distinguishable name within the {@link Namespace} of the umlParent
	 * @deprecated should not be used.
	 */
	@Deprecated
	public String getNewUMLElementName(Element umlParent, EClass eclass) {
		return getNewUMLElementName(umlParent, eclass.getName());
	}

	/**
	 * Generic method that returns a new unique name within a {@link Namespace}.
	 * 
	 * @param umlParent
	 *        the parent of the element to create
	 * @param baseString
	 *        the base string for the new element name
	 * 
	 * @return a distinguishable name within the {@link Namespace} of the umlParent
	 * @deprecated use {@link #getDefaultNameWithIncrementFromBase(String, Collection)} directly.
	 */
	@Deprecated
	public String getNewUMLElementName(Element umlParent, String baseString) {
		return getDefaultNameWithIncrementFromBase(baseString, umlParent.eContents());
	}

	/**
	 * set the base string for the name
	 * 
	 * @param baseString
	 *        a string that is the prefix
	 * @deprecated should not be used.
	 */
	@Deprecated
	public void setBaseString(String baseString) {
		this.baseString = baseString;
	}

	public static String getDefaultNameWithIncrementFromBase(String base, Collection<?> contents) {
		return getDefaultNameWithIncrementFromBase(base, contents, null, "");
	}

	public static String getDefaultNameWithIncrementFromBase(String base, Collection<?> contents, String separator) {
		return getDefaultNameWithIncrementFromBase(base, contents, null, separator);
	}
	
	public static String getDefaultNameWithIncrementFromBase(String base, Collection<?> contents, EObject elementToRename) {
		return getDefaultNameWithIncrementFromBase(base, contents, elementToRename, "");
	}

	public static String getDefaultNameWithIncrementFromBase(String base, Collection<?> contents, EObject elementToRename, String separator) {
		return NamedElementUtil.getDefaultNameWithIncrementFromBase(base, contents, elementToRename, separator);
	}
}
