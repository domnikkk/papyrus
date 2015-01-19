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
 * A catalog of fake {@link PropertyModel}.
 * 
 * @author dumoulin
 *
 */
public class PropertyCatalog {

	/**
	 * {@link TypeLibrary} used to find Types
	 */
	protected TypeLibrary typeLibrary;
	
	protected List<PropertyModel> properties;
	
	protected void init() {
		properties = new ArrayList<PropertyModel>();
		
		properties.add(new PropertyModel("p1", typeLibrary.BOOLEAN, OwnerKind.owned));
		properties.add(new PropertyModel("p2", typeLibrary.INT, OwnerKind.owned));
		properties.add(new PropertyModel("p3", typeLibrary.DOUBLE, OwnerKind.owned));
		properties.add(new PropertyModel("p4", typeLibrary.INT, OwnerKind.inherited));
		properties.add(new PropertyModel("p5", typeLibrary.STRING, OwnerKind.owned));
	}

	
	/**
	 * Constructor.
	 *
	 * @param typeLibrary TypeLibrary used to find types.
	 */
	public PropertyCatalog(TypeLibrary typeLibrary) {
		this.typeLibrary = typeLibrary;
		init();
	}

	/**
	 * @return the typeLibrary
	 */
	public TypeLibrary getTypeLibrary() {
		return typeLibrary;
	}

	
	/**
	 * @param typeLibrary the typeLibrary to set
	 */
	public void setTypeLibrary(TypeLibrary typeLibrary) {
		this.typeLibrary = typeLibrary;
	}

	
	/**
	 * @return the properties
	 */
	public List<PropertyModel> getProperties() {
		return properties;
	}
}
