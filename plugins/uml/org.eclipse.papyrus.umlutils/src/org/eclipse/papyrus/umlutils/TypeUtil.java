/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann TANGUY (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.umlutils;

import java.util.Iterator;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Type;

/**
 * Utility class for <code>org.eclipse.uml2.uml.Type</code><BR>
 */
public class TypeUtil {

	/**
	 * Get a string that displays the name of the type, and then its namespace.
	 * <p>
	 * For example: "String - UMLPrimitiveType"
	 * 
	 * @return a string that displays information about the type
	 */
	public static String getInfoString(Type type) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(type.getName());
		buffer.append(" - ");
		String tmp = "";
		Iterator<Namespace> it = type.allNamespaces().iterator();
		while(it.hasNext()) {
			Namespace namespace = it.next();
			if(it.hasNext()) {
				tmp = NamedElement.SEPARATOR + namespace.getName() + tmp;
			} else {
				tmp = namespace.getName() + tmp;
			}
		}
		buffer.append(tmp);
		return buffer.toString();
	}
}
