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

import static org.junit.Assert.*;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


/**
 * @author cedric dumoulin
 *
 */
public class TypeProviderTest2 {

	protected Type type1;
	protected Type type2;
	protected int typeCount;

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
		type1 = UMLFactory.eINSTANCE.createPrimitiveType();
		type1.setName("int");
		type2 = UMLFactory.eINSTANCE.createPrimitiveType();
		type2.setName("boolean");
		
		typeCount = 2;

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		type1 = null;
		type2 = null;
		typeCount = 0;
		
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#TypeCatalog()}.
	 */
	@Test
	public void testTypeProvider() {
		TypeProvider provider = new TypeProvider();
		
		assertNotNull("object created", provider);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#TypeCatalog(org.eclipse.uml2.uml.Type[])}.
	 */
	@Test
	public void testTypeProviderTypeArray() {
		
		
		TypeProvider provider = new TypeProvider(type1, type2);
		
		assertNotNull("object created", provider);
		assertNotNull("list created", provider.getTypes());
		assertEquals("all types created", typeCount, provider.getTypes().size());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#getTypes()}.
	 */
	@Test
	public void testGetTypes() {
		TypeProvider provider = new TypeProvider();
		
		assertNotNull("list created", provider.getTypes());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#iterator()}.
	 */
	@Test
	public void testIterator() {
		TypeProvider provider = new TypeProvider();
		
		provider.addType(type1);
		provider.addType(type2);
		
		assertNotNull("iterator found", provider.iterator());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#addType(org.eclipse.uml2.uml.Type)}.
	 */
	@Test
	public void testAddType() {
		TypeProvider provider = new TypeProvider();
		
		provider.addType(type1);
		provider.addType(type2);
		
		assertNotNull("list created", provider.getTypes());
		assertEquals("all types created", typeCount, provider.getTypes().size());
	}
	
	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.TypeProvider#addType(org.eclipse.uml2.uml.Type)}.
	 */
	@Test
	public void testAddTypeFromConstructor() {
		TypeProvider provider = new TypeProvider(type1);
		
		provider.addType(type2);
		
		assertNotNull("list created", provider.getTypes());
		assertEquals("all types created", typeCount, provider.getTypes().size());
	}

}
