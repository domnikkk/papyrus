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

package org.eclipse.papyrus.uml.profile.drafter.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.DraftProfileException;
import org.eclipse.papyrus.uml.profile.drafter.tests.exception.ExecutionException;
import org.eclipse.papyrus.uml.profile.drafter.tests.exception.NotFoundException;
import org.eclipse.papyrus.uml.profile.drafter.tests.exception.TestUtilsException;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author cedric dumoulin
 *
 */
public class ModelSetManagerTest {

	/**
	 * Name of the project that is created.
	 */
	static protected String PROJECT_NAME = "org.eclipse.papyrus.uml.profile.drafter.teststemp";

	/**
	 * Plugin from which resources are copied.
	 */
	static protected String FROM_PROJECT_NAME = "org.eclipse.papyrus.uml.profile.drafter.tests";
	
	/**
	 * Prefix name of the resources
	 */
	static protected String TEST_MODEL_1 = "models/testProfile1";
	
	/**
	 * Prefix name of the resources
	 */
	static protected String PROFILE1_MODEL = "models/house.profile";
	
	/**
	 * Full name of the di resource, in project.
	 */
	static protected String MODEL_1_FULLPATH = "/" +PROJECT_NAME + "/" + TEST_MODEL_1 + ".di";

	/**
	 * Created project.
	 */
	static protected EclipseProject project;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Copy resources from plugin to a new project
		project = new EclipseProject(PROJECT_NAME);
		project.copyResources(FROM_PROJECT_NAME, TEST_MODEL_1 + ".di", TEST_MODEL_1 + ".uml", TEST_MODEL_1 + ".notation" );

		// Copy sterotype.
		project.copyResources(FROM_PROJECT_NAME, PROFILE1_MODEL + ".di", PROFILE1_MODEL + ".uml", PROFILE1_MODEL + ".notation" );
	}

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
		// Copy resources from plugin to a new project
//		EclipseProject project = new EclipseProject(PROJECT_NAME);
//		project.copyResources(FROM_PROJECT_NAME, TEST_MODEL_1 + ".di", TEST_MODEL_1 + ".uml", TEST_MODEL_1 + ".notation" );

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#ModelSetManager(java.lang.String)}.
	 * @throws DraftProfileException 
	 */
	@Test
	public void testModelSetManagerString() throws TestUtilsException {


		ModelSetManager modelSetManager = new ModelSetManager(MODEL_1_FULLPATH);
		
		// asserts
		assertNotNull("object created", modelSetManager);
		assertNotNull("modelSet created", modelSetManager.getModelSet());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#ModelSetManager(java.lang.String)}.
	 * @throws DraftProfileException 
	 */
	@Test
	public void testModelSetManagerStringModels() throws TestUtilsException {


		ModelSetManager modelSetManager = new ModelSetManager(MODEL_1_FULLPATH, ModelSetManager.UML_MODEL);
		
		// asserts
		assertNotNull("object created", modelSetManager);
		assertNotNull("modelSet created", modelSetManager.getModelSet());
		assertNotNull("uml model created", modelSetManager.getUmlModel());
		
		try {
			modelSetManager.getNotationModel();
			fail("Notation model should not be created");
		} catch (NotFoundException e) {
			// ok
		}
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#ModelSetManager(org.eclipse.emf.common.util.URI)}.
	 * @throws DraftProfileException 
	 */
	@Test
	public void testModelSetManagerURI() throws TestUtilsException {
		
		URI uri = URI.createPlatformResourceURI(MODEL_1_FULLPATH, true);
		ModelSetManager modelSetManager = new ModelSetManager(uri);
		
		// asserts
		assertNotNull("object created", modelSetManager);
		assertNotNull("modelSet created", modelSetManager.getModelSet());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#getUmlModel()}.
	 * Check if the model is really loaded !
	 * @throws NotFoundException 
	 * @throws org.eclipse.papyrus.infra.core.resource.NotFoundException 
	 * @throws DraftProfileException 
	 * @throws ExecutionException 
	 * 
	 */
	@Test
	public void testGetUmlModel() throws TestUtilsException, org.eclipse.papyrus.infra.core.resource.NotFoundException {
		
		EclipseProject project = new EclipseProject(PROJECT_NAME);
		project.copyResources(FROM_PROJECT_NAME, TEST_MODEL_1 + ".di", TEST_MODEL_1 + ".uml", TEST_MODEL_1 + ".notation" );

		ModelSetManager modelSetManager = new ModelSetManager("/" +PROJECT_NAME + "/" + TEST_MODEL_1 + ".di");
		
		// asserts
		assertNotNull("object created", modelSetManager);
		assertNotNull("modelSet created", modelSetManager.getModelSet());
		assertNotNull("UmlModel loaded", modelSetManager.getUmlModel());
		assertNotNull("UmlModel root found", modelSetManager.getUmlModel().lookupRoot());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#getUmlModel()}.
	 * Check if the model is really loaded !
	 * @throws NotFoundException 
	 * @throws org.eclipse.papyrus.infra.core.resource.NotFoundException 
	 * @throws DraftProfileException 
	 * @throws ExecutionException 
	 * 
	 */
	@Test
	public void testGetUmlModelWithIFile() throws TestUtilsException, org.eclipse.papyrus.infra.core.resource.NotFoundException {
		
		EclipseProject project = new EclipseProject(PROJECT_NAME);
		project.copyResources(FROM_PROJECT_NAME, TEST_MODEL_1 + ".di", TEST_MODEL_1 + ".uml", TEST_MODEL_1 + ".notation" );

		
		IFile file = project.getProject().getFile(TEST_MODEL_1 + ".di");

		assertTrue( "file exists", file.exists() );
		ModelSetManager modelSetManager = new ModelSetManager(file);
		
		// asserts
		assertNotNull("object created", modelSetManager);
		assertNotNull("modelSet created", modelSetManager.getModelSet());
		assertNotNull("UmlModel loaded", modelSetManager.getUmlModel());
		assertNotNull("UmlModel root found", modelSetManager.getUmlModel().lookupRoot());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#getNamedElementByName(java.lang.String)}.
	 * @throws TestUtilsException 
	 */
	@Test
	public void testGetNamedElementByNameString() throws TestUtilsException {
		ModelSetManager modelSetManager = new ModelSetManager(MODEL_1_FULLPATH);

		String qualifiedName = "p1::Class1";
		NamedElement namedElement = modelSetManager.getNamedElementByName(qualifiedName);
		assertNotNull("Class found", namedElement);
		assertTrue("Right Class found", namedElement instanceof org.eclipse.uml2.uml.Class);

		//
		qualifiedName = "p1::Class1::Attribute1";
		namedElement = modelSetManager.getNamedElementByName(qualifiedName);
		assertNotNull("Attribute found", namedElement);
		assertTrue("Right Type found", namedElement instanceof org.eclipse.uml2.uml.Property);
		
	}
	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.tests.ModelSetManager#getNamedElementByName(java.lang.String)}.
	 * Test Stereotype access.
	 * 
	 * @throws TestUtilsException 
	 */
	@Test
	public void testGetNamedElementByNameWithSterotype() throws TestUtilsException {
		ModelSetManager modelSetManager = new ModelSetManager(MODEL_1_FULLPATH);

		String qualifiedName = "p2::ClassWith1Sterotype";
		NamedElement namedElement = modelSetManager.getNamedElementByName(qualifiedName);
		assertNotNull("Class found", namedElement);
		assertTrue("Right Class found", namedElement instanceof org.eclipse.uml2.uml.Class);

		// Chack sterotype
		List<Stereotype> stereotypes = namedElement.getAppliedStereotypes();
		assertTrue("Stereotype applied", !stereotypes.isEmpty());
		assertNotNull("Stereotype found", namedElement.getAppliedStereotype("house::Building") );
	}

}
