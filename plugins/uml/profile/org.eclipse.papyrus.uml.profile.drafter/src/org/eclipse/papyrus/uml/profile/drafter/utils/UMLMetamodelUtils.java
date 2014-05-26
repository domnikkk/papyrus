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

package org.eclipse.papyrus.uml.profile.drafter.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * @author cedric dumoulin
 *
 */
public class UMLMetamodelUtils {

	/**
	 * The UML metamodel in UML.
	 */
	protected Package umlMetamodel;
	
	/**
	 * List of UML metaclasses. This are the owned element of type 'uml:Class'.
	 */
	protected List<Class> metaclasses = null;
	
	
	/**
	 * Constructor.
	 *
	 * @param umlMetamodel
	 */
	public UMLMetamodelUtils(Package umlMetamodel) {
		super();
		this.umlMetamodel = umlMetamodel;
	}

	/**
	 * Constructor.
	 *
	 * @param anyUmlElement An UML element from which the ResourceSet can be found. The metamodel will be loaded 
	 *   in the ResourceSet associated to the provided element.
	 * @throws NotFoundException If the metamodel can not be found
	 */
	public UMLMetamodelUtils(Element anyUmlElement) throws NotFoundException {
		this(anyUmlElement.eResource().getResourceSet() );
	}

	/**
	 * Constructor.
	 *
	 * @param resourceSet The resourceSet into which the metamodel should be load.
	 * @throws NotFoundException If the metamodel can not be found
	 */
	public UMLMetamodelUtils(ResourceSet resourceSet) throws NotFoundException {
		
		this.umlMetamodel = loadUMLMetamodel(resourceSet);
	}

	/**
	 * Constructor.
	 *
	 * @param resourceSet The resourceSet into which the metamodel should be load.
	 * @throws NotFoundException If the metamodel can not be found
	 */
	public UMLMetamodelUtils(ServicesRegistry servicesRegistry) throws NotFoundException {
		
		try {
			UmlModel umlModel = UmlUtils.getUmlModelChecked(servicesRegistry);
			this.umlMetamodel = loadUMLMetamodel(umlModel.getResource().getResourceSet());
		} catch (ServiceException e) {
			throw new NotFoundException("Can't get the uml model from the ServiceRegistry.");
		}
	}

	/**
	 * Get the uml metaclass of the provided element.
	 * @param element
	 * @return
	 * @throws NotFoundException 
	 */
	public Class getElementMetaclass( Element element) throws NotFoundException {
		
		return getMetaclassFromName( element.eClass().getName());
	}

	/**
	 * Get the uml metaclass corresponding to the specified name.
	 * 
	 * @param name
	 * @return The Metaclass
	 */
	public Class getMetaclassFromName(String name) throws NotFoundException {
		
		for( Class metaclass : getMetaclasses() ) {
			if( metaclass.getName().equalsIgnoreCase(name)) {
				return metaclass;
			}
		}

        throw new NotFoundException( "Can't get uml metaclass for '" + name +"'.");
	}
	
	/**
	 * @return the umlMetamodel
	 */
	public Package getUmlMetamodel() {
		return umlMetamodel;
	}

	/**
	 * Get the metaclasses of the UML metamodel.
	 * @return
	 */
	public List<Class> getMetaclasses() {
		if( metaclasses!= null) {
			return metaclasses;
		}
		
		// Build the list
		metaclasses = new ArrayList<Class>();
		for( Type ele : getUmlMetamodel().getOwnedTypes()) {
			if(ele instanceof Class) {
				metaclasses.add((Class)ele);
			}
		}
		return metaclasses;
	}
	

	/**
	 * Load the UML metamodel in the specified ResourceSet.
	 * 
	 * @param resourceSet
	 *        The {@link ResourceSet} into which the uml metamodel should be loaded.
	 * @return the top package of the loaded content
	 * @throws NotFoundException If the metamodel can not be found.
	 */
	public static Package loadUMLMetamodel(ResourceSet resourceSet) throws NotFoundException {
		
		URI uri = URI.createURI(UMLResource.UML_METAMODEL_URI);
		org.eclipse.uml2.uml.Package package_ = null;
		try {
			Resource resource = resourceSet.getResource(uri, true);

			package_ = (org.eclipse.uml2.uml.Package)EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getPackage());
		} catch (WrappedException we) {
			throw new NotFoundException("Can't load uml metamodel.", we	);
		}

		return package_;
	}
}
