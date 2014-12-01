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

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.papyrus.uml.profile.drafter.tests.TracesRecorder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * @author cedric dumoulin
 *
 */
public class SimpleModelVisitorTest {

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
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel)}.
	 */
	@Test
	public void testSimpleModelVisitor() {

		SimpleModelVisitor visitor = new DummySimpleModelVisitor();
		
		assertNotNull("object created", visitor);
	}


	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel)}.
	 * @Ignore Disabled because the {@link WritableList} require a valid {@link Realm} to work.
	 * 
	 */
	@Test
	@Ignore
	public void testVisitStereoptypeModel() {
		// Create a Model
		String propName1 = "propName1";
		String propName2 = "propName2";
		String propName3 = "propName3";
		
		StereoptypeModel st = new StereoptypeModel();
		PropertyModel prop1 = st.createNewPropertyModel(propName1);
		PropertyModel prop2 = st.createNewPropertyModel(propName2);
		ExtendedStereotypeModel exSt1 = st.createExtendedStereotypeModel("exSt1");
		PropertyModel prop3 = st.createNewPropertyModel(propName3);
		MetaclassModel mc1 = st.createMetaclassModel("mc1");
		
		// tests
		// Check visit order.
		DummySimpleModelVisitor visitor = new DummySimpleModelVisitor();
		st.accept(visitor);
		
		TracesRecorder<String, Object> recorder = visitor.traces;
		int i=0;
		assertEquals("right count", 6, recorder.traces.size());
		assertSame("visited member", st, recorder.get(i++).obj2);
		assertSame("visited member", prop1, recorder.get(i++).obj2);
		assertSame("visited member", prop2, recorder.get(i++).obj2);
		assertSame("visited member", prop3, recorder.get(i++).obj2);
		assertSame("visited member", mc1, recorder.get(i++).obj2);
		assertSame("visited member", exSt1, recorder.get(i++).obj2);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel)}.
	 */
	@Test
	@Ignore
	public void testVisitPropertyModel() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#visit(org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassModel)}.
	 */
	@Test
	@Ignore
	public void testVisitMetaclassesModel() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#doVisit(org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel)}.
	 */
	@Test
	@Ignore
	public void testDoVisitStereoptypeModel() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#doVisit(org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel)}.
	 */
	@Test
	@Ignore
	public void testDoVisitPropertyModel() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.SimpleModelVisitor#doVisit(org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassModel)}.
	 */
	@Test
	@Ignore
	public void testDoVisitMetaclassesModel() {
		fail("Not yet implemented");
	}

}
