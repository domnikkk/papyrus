package org.eclipse.papyrus.uml.profile.drafter.utils;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author cedric dumoulin
 *
 */
public class UMLPrimitiveTypesModelTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Creates and returns a temporary resource set. The resource set can be used to load libraries
	 * without polluting the current ModelSet.
	 *
	 * It is configured with XMI Load options, to allow safe loading of resources
	 *
	 * @return
	 *         A temporary resource set
	 *
	 */
	public static ResourceSet createTemporaryResourceSet() {
		ResourceSet tmpResourceSet = new ResourceSetImpl();

		tmpResourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
		tmpResourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		tmpResourceSet.getLoadOptions().put(XMIResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
		tmpResourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		return tmpResourceSet;
	}

	/**
	 * 
	 * @throws NotFoundException
	 */
	@Test
	public void testUMLPrimitiveTypesModel() throws  NotFoundException {
		
		ResourceSet resourceSet = createTemporaryResourceSet();
		
		UMLPrimitiveTypesModel model = new UMLPrimitiveTypesModel(resourceSet);
		
		assertNotNull("object created", model);
		assertNotNull("resource", model.getLibraryResource());
		assertNotNull("boolean", model.UMLPrimitiveTypes_BOOLEAN);
		assertNotNull("integer", model.UMLPrimitiveTypes_INTEGER);
		assertNotNull("real", model.UMLPrimitiveTypes_REAL);
		assertNotNull("string", model.UMLPrimitiveTypes_STRING);
		assertNotNull("unlimited_natural", model.UMLPrimitiveTypes_UNLIMITED_NATURAL);
	}

	/**
	 * 
	 * @throws NotFoundException
	 */
	@Test
	public void testGetLibraryPackage() throws  NotFoundException {
		
		ResourceSet resourceSet = createTemporaryResourceSet();
		
		UMLPrimitiveTypesModel model = new UMLPrimitiveTypesModel(resourceSet);
		
		assertNotNull("package", model.getLibraryPackage());
	}


}
