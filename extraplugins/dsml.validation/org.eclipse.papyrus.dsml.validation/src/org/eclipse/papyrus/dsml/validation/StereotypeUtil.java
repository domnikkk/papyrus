/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.dsml.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Provide the possibility to check whether a stereotype application corresponds
 * to a stereotype provided as string. It takes sub-stereotypes into account.
 * The objective is to filter the execution of validation rules within the plugin.xml, i.e.
 * only schedule their execution, if a suitable context object is selected.
 *
 * Limitation: constraint context must be a stereotype (passed objects are stereotype applications)
 */
public class StereotypeUtil {
	
	public static boolean checkStereoApplication(Object stereotypeApplicationObj, String stereoName) {
		if(!(stereotypeApplicationObj instanceof EObject)) {
			return false;
		}

		if(stereotypeApplicationObj instanceof Element) {
			return false;
		}

		EObject stereotypeApplication = ((EObject)stereotypeApplicationObj);
		Stereotype stereotype = UMLUtil.getStereotype(stereotypeApplication);
		if(stereotype == null) {
			return false;
		}
		return checkStereotype(stereotype, stereoName);
	}
	
	public static boolean checkStereotype(Stereotype stereotype, String stereoName) {
		if(stereoName.equals(stereotype.getName())) {
			return true;
		}
		for (Class superStereo : stereotype.getSuperClasses()) {
			if (superStereo instanceof Stereotype) {
				if (checkStereotype((Stereotype) superStereo, stereoName)) {
					return true;
				}
			}
		}
		return false;
	}	
}
