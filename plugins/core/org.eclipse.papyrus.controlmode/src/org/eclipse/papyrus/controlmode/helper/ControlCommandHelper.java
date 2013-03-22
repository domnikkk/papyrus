/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Helper for control command
 * 
 * @author adaussy
 * 
 */
public class ControlCommandHelper {

	/**
	 * Return true if the object is an controled object
	 * 
	 * @param eObject
	 * @return
	 */
	public static boolean isRootControledObject(EObject eObject) {
		if(eObject != null) {
			Resource resource = eObject.eResource();
			if(resource != null) {
				EList<EObject> contents = resource.getContents();
				if(contents != null && !contents.isEmpty()) {
					return contents.contains(eObject);
				}
			}
		}
		return false;
	}
}
