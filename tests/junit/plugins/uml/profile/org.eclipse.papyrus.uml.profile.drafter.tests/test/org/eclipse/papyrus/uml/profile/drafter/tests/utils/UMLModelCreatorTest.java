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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;


/**
 * @author cedric dumoulin
 *
 */
public class UMLModelCreatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * 
	 * @return
	 */
	protected Resource createResource(String uriName) {
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
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#UMLModelCreator(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUMLModelCreatorStringString() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		assertNotNull("Object created", creator);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#UMLModelCreator(org.eclipse.emf.ecore.resource.Resource)}.
	 */
	@Test
	public void testUMLModelCreatorResourceFailing() {
		Resource resource = createResource("temp.uml");

		try {
			UMLModelCreator creator = new UMLModelCreator(resource);
			fail("Exception must be thrown");
		} catch (IllegalArgumentException e) {
			// ok
		}
		
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#UMLModelCreator(org.eclipse.emf.ecore.resource.Resource)}.
	 */
	@Test
	public void testUMLModelCreatorResource() {
		Resource resource = createResource("temp.uml");

		Model rootModel = UMLFactory.eINSTANCE.createModel();
		rootModel.setName("model");
		resource.getContents().add(rootModel);
		
		UMLModelCreator creator = new UMLModelCreator(resource);

		assertNotNull("Object created", creator);

	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#cd(org.eclipse.uml2.uml.Package)}.
	 */
	@Test
	public void testCd() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		creator.createPackage("p1", false);
		Package p2 = creator.createPackage("p2", false);
		creator.createPackage("p3", false);
		
		creator.cd(p2);
		
		assertSame("current package changed", creator.getCurrentDir(), p2);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#createClass(java.lang.String)}.
	 */
	@Test
	public void testCreateClass() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		Class c = creator.createClass("c1");
		
		assertNotNull("Object created", c);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#createDatatype(java.lang.String)}.
	 */
	@Test
	public void testCreateDatatype() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		DataType c = creator.createDatatype("c1");
		
		assertNotNull("Object created", c);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#createPackage(java.lang.String)}.
	 */
	@Test
	public void testCreatePackage() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		Package c = creator.createPackage("c1");
		
		assertNotNull("Object created", c);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator#createModel(java.lang.String)}.
	 */
	@Test
	public void testCreateModel() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		Model c = creator.createModel("c1");
		
		assertNotNull("Object created", c);
	}

	/**
	 * 
	 */
	@Test
	public void testCreation() {
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		// Create model
		Package p1 = creator.createPackage("p1");
		creator.createDatatype("dt1");
		creator.createDatatype("dt2");
		creator.createClass("C1");
		creator.cdToRoot();
		Package p2 = creator.createPackage("p2");
		creator.createDatatype("dt21");
		creator.createDatatype("dt12");
		creator.createClass("C21");
		
		int expectedDatatypeCount = 4;
		int expectedElementeCount = 9;
		
		assertSame("Expected count", expectedElementeCount, Iterators.size( creator.getResource().getAllContents() ));

		Iterator<EObject> iter = creator.getResource().getAllContents();
		Iterator<DataType> datatypesIter = Iterators.filter(iter, DataType.class);	
		assertSame("Expected count", expectedDatatypeCount, Iterators.size(datatypesIter));
	}
}
