/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer;

import java.util.ArrayList;
import java.util.List;


/**
 * A library of predefined types
 * 
 * @author cedric dumoulin
 *
 */
public class TypeLibrary {

	final public Type INT = new Type("int");
	final public Type STRING = new Type("String");
	final public Type BOOLEAN = new Type("boolean");
	final public Type DOUBLE = new Type("double");
	
	protected List<Type> types;
	
	
	

	/**
	 * Constructor.
	 *
	 */
	public TypeLibrary() {
		init();
	}


	protected void init() {
		types = new ArrayList<Type>();
		
		types.add(INT);
		types.add(STRING);
		types.add(BOOLEAN);
		types.add(DOUBLE);
		
	}
	
	/**
	 * @return the types
	 */
	public List<Type> getTypes() {
		return types;
	}


	public Object getDefaultType() {
		return STRING;
	}


	
}
