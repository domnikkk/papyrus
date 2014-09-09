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

package org.eclipse.papyrus.uml.modelrepair.internal.participants;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Utilities for working with stereotypes, profiles, etc.
 */
public class StereotypesUtil {

	/**
	 * Not instantiable by clients.
	 */
	private StereotypesUtil() {
		super();
	}

	/**
	 * Queries whether a package, discovered in the context of some stereotype application, is a demand-created
	 * package created by EMF to record unrecognized schema content from the XML.
	 * 
	 * @param ePackage
	 *            a package (not {@code null})
	 * @param stereotypeApplication
	 *            the contextual stereotype application, or {@code null} if none is available
	 * 
	 * @return whether the package looks like an unrecognized schema
	 */
	public static boolean isUnrecognizedSchema(EPackage ePackage, EObject stereotypeApplication) {
		boolean result;

		if (stereotypeApplication != null) {
			result = getExtendedMetadata(stereotypeApplication).demandedPackages().contains(ePackage);
		} else {
			// Simple heuristic: unknown-schema packages don't have names, but profile-defined packages always do
			result = (ePackage.getName() == null);
		}

		return result;
	}

	private static ExtendedMetaData getExtendedMetadata(EObject context) {
		ExtendedMetaData result = ExtendedMetaData.INSTANCE;

		Resource resource = context.eResource();
		if (resource instanceof XMLResource) {
			Object option = ((XMLResource) resource).getDefaultSaveOptions().get(XMLResource.OPTION_EXTENDED_META_DATA);
			if (option instanceof ExtendedMetaData) {
				result = (ExtendedMetaData) option;
			}
		}

		return result;
	}

}
