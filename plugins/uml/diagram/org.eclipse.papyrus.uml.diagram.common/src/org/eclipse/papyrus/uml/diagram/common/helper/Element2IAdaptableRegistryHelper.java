/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.uml2.uml.Element;

/**
 * Helper to manage a registry between element and IAdaptable
 */
public class Element2IAdaptableRegistryHelper {

	private final Map<Element, IAdaptable> myElement2IAdaptableRegistry;

	/**
	 * public constructor
	 */
	public Element2IAdaptableRegistryHelper() {
		myElement2IAdaptableRegistry = new HashMap<Element, IAdaptable>();
	}

	/**
	 * Clear the registry
	 */
	public void clear() {
		myElement2IAdaptableRegistry.clear();
	}

	/**
	 * Find IAdaptable from Element in registry
	 */
	public IAdaptable findAdapter(Element element) {
		return myElement2IAdaptableRegistry.get(element);
	}

	/**
	 * Register an adapter (ONLY if one is not already present)
	 */
	public void registerAdapter(Element element, IAdaptable adapter) {
		if (myElement2IAdaptableRegistry.get(element) == null) {
			myElement2IAdaptableRegistry.put(element, adapter);
		}
	}
}