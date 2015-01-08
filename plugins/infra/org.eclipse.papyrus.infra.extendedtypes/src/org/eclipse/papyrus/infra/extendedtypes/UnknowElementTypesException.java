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

package org.eclipse.papyrus.infra.extendedtypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exception thrown when trying to create an element type whereas the element types it tries to load are not known, either not created yet or unknown at all.
 */
public class UnknowElementTypesException extends Exception {

	public final List<String> unknowElementTypes;
	
	/**serial version UUID */
	private static final long serialVersionUID = 8690324597824714150L;

	/**
	 * Default Constructor with one unknown element type 
	 */
	public UnknowElementTypesException(String elementTypeID) {
		unknowElementTypes = Collections.singletonList(elementTypeID);
	}
	
	/**
	 * Default Constructor with several unknown element types 
	 */
	public UnknowElementTypesException(List<String> elementTypesID) {
		unknowElementTypes = new ArrayList<String>(elementTypesID);
	}
	
	/**
	 * Returns the list of unknown element types
	 * @return the list of unknown element types
	 */
	public List<String> getUnknownElementTypes() {
		return unknowElementTypes;
	}
}
