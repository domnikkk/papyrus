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


/**
 * @author dumoulin
 *
 */
public class PropertyModel {

	protected String name;
	protected Type type;
	protected OwnerKind ownerKind;
	
	/**
	 * Constructor.
	 *
	 */
	public PropertyModel() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructor.
	 *
	 * @param name
	 * @param type
	 * @param ownerKind
	 */
	public PropertyModel(String name, Type type, OwnerKind ownerKind) {
		this.name = name;
		this.type = type;
		this.ownerKind = ownerKind;
	}


	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}


	
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}


	/**
	 * @return the ownerKind
	 */
	public OwnerKind getOwnerKind() {
		return ownerKind;
	}

	
	/**
	 * @param ownerKind the ownerKind to set
	 */
	public void setOwnerKind(OwnerKind ownerKind) {
		this.ownerKind = ownerKind;
	}

}
