/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.decoratormodel.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.uml.tools.utils.ProfileUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;


/**
 * Specific Stereotype Application Helper for Papyrus tool. If it detects the model is not a model handled by Papyrus, it will delegate to the standard Stereotype application helper.
 */
public class PapyrusStereotypeApplicationHelper extends StereotypeApplicationHelper {

	@Override
	protected EList<EObject> getContainmentList(Element element, EClass definition) {
		// Locate stereotype applications in the same resource as the profile application

		ProfileApplication profileApplication = ProfileUtil.getProfileApplication(element, definition);
		if (profileApplication != null) {
			Resource containingResource = profileApplication.eResource();
			if (containingResource != null) {
				return containingResource.getContents();
			}
		}

		return super.getContainmentList(element, definition);
	}

}
