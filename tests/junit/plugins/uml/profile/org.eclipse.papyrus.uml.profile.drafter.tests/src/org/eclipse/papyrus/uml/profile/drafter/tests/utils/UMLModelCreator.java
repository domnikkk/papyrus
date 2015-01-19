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

package org.eclipse.papyrus.uml.profile.drafter.tests.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;


/**
 * Class use to create a UML Model inside a Resource, and to populate it.
 * 
 * @author cedric dumoulin
 *
 */
public class UMLModelCreator {

	protected Resource resource;
	
	protected Package curPackage;
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param resourceUri
	 */
	public UMLModelCreator(String resourceUri, String rootModelName) {
		
		resource = createResource(resourceUri);
		
		Model model = createRootModel(rootModelName);
		resource.getContents().add(model);
		cd(model);
	}



	

	/**
	 * 
	 * Constructor.
	 *
	 * @param resource
	 * @throws IllegalAccessException 
	 */
	public UMLModelCreator(Resource resource) throws IllegalArgumentException {
		this.resource = resource;
		
		// Lookup for a Pacakge ine the resource.
		Package p = (Package)EcoreUtil.getObjectByType(resource.getContents(),UMLPackage.eINSTANCE.getPackage());
		if( p == null) {
			p = (Model)EcoreUtil.getObjectByType(resource.getContents(),UMLPackage.eINSTANCE.getModel());
		}
		if( p == null) {
			throw new IllegalArgumentException("Resource must contains a Package or a Model");
		}
		cd(p);
	}
	
	/**
	 * 
	 * @return
	 */
	private Resource createResource(String uriName) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// True for local test, false for plugin test
		if(true) {
		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE );

		}
		
		URI uri = URI.createURI(uriName);
		Resource resource = resourceSet.createResource(uri);
		
		return resource;
	}

	/**
	 * @param rootModelName
	 * @return
	 */
	private Model createRootModel(String rootModelName) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(rootModelName);
		return model;
	}
	
	/**
	 * Change current package to specified package.
	 * The package should belong to the Resource (not verified).
	 * 
	 * @param p
	 */
	public void cd(Package p) {
		curPackage = p;
	}
	
	/**
	 * Change current package to the root model.
	 * 
	 * @param p
	 */
	public Package cdToRoot() {
		// Lookup for a Pacakge ine the resource.
		Package p = (Package)EcoreUtil.getObjectByType(resource.getContents(),UMLPackage.eINSTANCE.getPackage());
		if( p == null) {
			p = (Model)EcoreUtil.getObjectByType(resource.getContents(),UMLPackage.eINSTANCE.getModel());
		}

		return p;
	}
	
	public Class createClass( String name ) {
		Class c = UMLFactory.eINSTANCE.createClass();
		c.setName(name);
		curPackage.getPackagedElements().add(c);
		return c;
	}
	
	public DataType createDatatype( String name ) {
		DataType c = UMLFactory.eINSTANCE.createDataType();
		c.setName(name);
		curPackage.getPackagedElements().add(c);
		return c;
	}
	
	public Package createPackage( String name ) {
		return createPackage(name, true);
	}

	public Model createModel( String name ) {
		return createModel(name, true);
	}

	/**
	 * 
	 * @param name
	 * @param changeCurrent
	 * @return
	 */
	public Package createPackage( String name, boolean changeCurrent ) {
		Package c = UMLFactory.eINSTANCE.createModel();
		c.setName(name);
		curPackage.getNestedPackages().add(c);
		if( changeCurrent ) {
			curPackage = c;
		}
		return c;
	}

	/**
	 * 
	 * @param name
	 * @param changeCurrent
	 * @return
	 */
	public Model createModel( String name, boolean changeCurrent ) {
		Model c = UMLFactory.eINSTANCE.createModel();
		c.setName(name);
		curPackage.getNestedPackages().add(c);
		if( changeCurrent ) {
			curPackage = c;
		}
		return c;
	}

	/**
	 * Return the current Package.
	 * 
	 * @return
	 */
	public Package getCurrentDir() {
		return curPackage;
	}

	public Resource getResource() {
		return resource;
	}


}
