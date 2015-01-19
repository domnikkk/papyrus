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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.papyrus.uml.profile.drafter.tests.utils.UMLModelCreator;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Iterators;


/**
 * @author cedric dumoulin
 *
 */
public class TypeProviderTest {

	protected UMLModelCreator creator;
	int expectedDatatypeCount;

	
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
		createUmlModel();

	}

	/**
	 * 
	 */
	private void createUmlModel() {
		creator = new UMLModelCreator("temp.uml", "model");
		// Create model
		creator.createPackage("p1");
		creator.createDatatype("dt1");
		creator.createDatatype("dt2");
		creator.createClass("C1");
		creator.cdToRoot();
		creator.createPackage("p2");
		creator.createDatatype("dt21");
		creator.createDatatype("dt12");
		creator.createClass("C21");
		
		expectedDatatypeCount = 4;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.ResourceTypeProvider#TypeProvider(org.eclipse.emf.ecore.resource.Resource, org.eclipse.emf.ecore.EClass)}.
	 */
	@Test
	public void testTypeProvider() {
		
		UMLModelCreator creator = new UMLModelCreator("temp.uml", "model");
		
		EClass requestedType = UMLPackage.eINSTANCE.getClass_();
		ResourceTypeProvider typeProvider = new ResourceTypeProvider(creator.getResource(), requestedType);
		
		assertNotNull("Object created", typeProvider);		
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.ResourceTypeProvider#getTypes()}.
	 */
	@Test
	public void testGetTypes() {
				
		EClass requestedType = UMLPackage.eINSTANCE.getDataType();
		ResourceTypeProvider typeProvider = new ResourceTypeProvider(creator.getResource(), requestedType);
		
		List<Type> types = typeProvider.getTypes();
		
		assertEquals("Types found", expectedDatatypeCount, types.size());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.ResourceTypeProvider#iterator()}.
	 */
	@Test
	public void testIterator() {
		EClass requestedType = UMLPackage.eINSTANCE.getDataType();
		ResourceTypeProvider typeProvider = new ResourceTypeProvider(creator.getResource(), requestedType);
		
		assertEquals("Types found", expectedDatatypeCount, Iterators.size(typeProvider.iterator()));
	}

}
