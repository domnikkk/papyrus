/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Arthur Daussy (Atos) arthur.daussy@atos.net -
 *
 *****************************************************************************/
package org.eclipse.papyrus.umlutils;

import org.eclipse.uml2.uml.Classifier;


public class ClassifierUtils {
	
	
	/**
	 * return the custom label of the property, given UML2 specification and a custom style.
	 * 
	 * @param style
	 *        the integer representing the style of the label
	 * 
	 * @return the string corresponding to the label of the property
	 */
	public static String getCustomLabel(Classifier classifier, int style) {
		StringBuffer buffer = new StringBuffer();
		// visibility

		buffer.append(" ");
		if((style & ICustomAppearence.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(classifier));
		}

		// name
		if((style & ICustomAppearence.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(classifier.getName());
		}
		return buffer.toString();
	}

}
