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

package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.papyrus.uml.profile.drafter.utils.UMLPrimitiveTypesModel;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Type;


/**
 * A {@link ITypeCatalog} listing the type accessible from a specified {@link Element}.
 * 
 * @author cedric dumoulin
 *
 */
public class AccessibleTypeCatalog implements ITypeCatalog {

	/**
	 * 
	 */
	protected Element element;
	
	protected UMLPrimitiveTypesModel primitiveTypesModel;
	/**
	 * Constructor.
	 *
	 */
	public AccessibleTypeCatalog(Element element) {
		this.element = element;
		
		// Create primitiveTypeModel from the ResourceSet associated to the element.
		// It will be used to add such types.
		try {
			primitiveTypesModel = new UMLPrimitiveTypesModel(element.eResource().getResourceSet());
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Constructor.
	 *
	 */
	public AccessibleTypeCatalog(Element element, UMLPrimitiveTypesModel primitiveTypesLibrary) {
		this.element = element;
		this.primitiveTypesModel = primitiveTypesLibrary;
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#getTypeLabel(org.eclipse.uml2.uml.Type)
	 *
	 * @param type
	 * @return
	 */
//	@Override
	public String getTypeLabel(Type type) {
		return type.getLabel();
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#getType(java.lang.String)
	 *
	 * @param typeLabel
	 * @return
	 * @throws NotFoundException
	 */
//	@Override
	public Type getType(String typeLabel) throws NotFoundException {
		
		for( Type type : getTypes()) {
			if( type.getLabel().equals(typeLabel)) 
				return type;
		}
		
		throw new NotFoundException("No type found under name '" + typeLabel +"'.");
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#getTypes()
	 *
	 * @return
	 */
	@Override
	public List<Type> getTypes() {
		
		if(primitiveTypesModel != null) {
			return primitiveTypesModel.getLibraryPackage().getOwnedTypes();
		}
		
		// Retutn empty list
		return Collections.emptyList();
		
//		Package owningPackage = element.getNearestPackage();
//		
//		org.eclipse.papyrus.uml.tools.utils.PackageUtil.getAccessibleTypes(owningPackage);
//		
//		EcoreUtil.getObjectsByType(element.eResource().getAllContents(), UMLPackage.eINSTANCE.getType());
//		
//		element.eResource().g
//		// TODO Auto-generated method stub
//		return null;
	}

	@Override
	public Iterator<Type> iterator() {
		return getTypes().iterator();
	}

}
