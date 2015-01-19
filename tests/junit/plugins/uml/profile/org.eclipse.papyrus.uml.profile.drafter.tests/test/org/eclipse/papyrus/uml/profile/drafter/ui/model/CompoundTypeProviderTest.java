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

import org.eclipse.core.commands.ITypedParameter;
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
public class CompoundTypeProviderTest {

	protected Type type1;
	protected Type type2;
	protected Type type3;
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
		type3 = UMLFactory.eINSTANCE.createPrimitiveType();
		type3.setName("double");
		
		typeCount = 2;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.CompoundTypeProvider#CompoundTypeProvider(org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog[])}.
	 */
	@Test
	public void testCompoundTypeProvider() {
		ITypeCatalog provider1 = new TypeProvider(type1);
		ITypeCatalog provider2 = new TypeProvider(type2);
		
		CompoundTypeProvider provider = new CompoundTypeProvider(provider1, provider2);
		
		assertNotNull("object created", provider);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.CompoundTypeProvider#getTypes()}.
	 */
	@Test
	public void testGetTypes() {
		ITypeCatalog provider1 = new TypeProvider(type1);
		ITypeCatalog provider2 = new TypeProvider(type2);
		int typeCount = 2;
		
		CompoundTypeProvider provider = new CompoundTypeProvider(provider1, provider2);
		
		assertNotNull("list created", provider.getTypes());
		assertEquals("All types found", typeCount, provider.getTypes().size());
		
		
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.CompoundTypeProvider#iterator()}.
	 */
	@Test
	public void testIterator() {
		ITypeCatalog provider1 = new TypeProvider(type1);
		ITypeCatalog provider2 = new TypeProvider(type2);
		
		CompoundTypeProvider provider = new CompoundTypeProvider(provider1, provider2);
		
		assertNotNull("iterator found", provider.iterator());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.CompoundTypeProvider#addITypeProvider(org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog)}.
	 */
	@Test
	public void testAddITypeProvider() {
		ITypeCatalog provider1 = new TypeProvider(type1);
		ITypeCatalog provider2 = new TypeProvider(type2);
		int typeCount = 2;
		
		CompoundTypeProvider provider = new CompoundTypeProvider(provider1);
		
		provider.addITypeProvider(provider2);
		
		
		assertNotNull("list created", provider.getTypes());
		assertEquals("All types found", typeCount, provider.getTypes().size());
	}

}
