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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * @author cedric dumoulin
 *
 */
public class StereotypeURLTest {

	final String profileName ="profileName1::profileName2";
	final String stereotypeName ="stereotypeName";
	final String resourceName ="resourceName";
	final String qualifiedName =  "//" + resourceName + "/" +profileName + "::" + stereotypeName;
	final String qualifiedNameNoResource =  profileName + "::" + stereotypeName;

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
	 * 
	 * @param profile
	 * @param stereotype
	 * @return
	 */
	protected String computeQualifiedName( String profile, String stereotype) {
		return profile + "::" + stereotype;
	}
	
	/**
	 * 
	 * @param resource
	 * @param profile
	 * @param stereotype
	 * @return
	 */
	protected String computeQualifiedName( String resource, String profile, String stereotype) {
		if( resource == null || resource.length() == 0) {
			return computeQualifiedName(profile, stereotype);
		}
		
		return "//" + resource + "/" + profile + "::" + stereotype;
	}
	
	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#StereotypeURL()}.
	 */
	@Test
	public void testStereotypeURL() {
		
		StereotypeURL url = new StereotypeURL();
		
		assertNotNull("object created", url);
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#StereotypeURL(java.lang.String)}.
	 */
	@Test
	public void testStereotypeURLString() {

		String qualifiedName =  profileName + "::" + stereotypeName;
		StereotypeURL url = new StereotypeURL(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#StereotypeURL(java.lang.String)}.
	 */
	@Test
	public void testStereotypeURLStringWithResource() {

		StereotypeURL url = new StereotypeURL(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", resourceName, url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#StereotypeURL(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testStereotypeURLStringString() {
		StereotypeURL url = new StereotypeURL(profileName, stereotypeName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedNameNoResource, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setQualifiedName(java.lang.String)}.
	 */
	@Test
	public void testSetQualifiedName() {
		StereotypeURL url = new StereotypeURL();
		
		String qualifiedName =  profileName + "::" + stereotypeName;
		url.setQualifiedName(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setQualifiedName(java.lang.String)}.
	 */
	@Test
	public void testSetQualifiedNameWithResource() {
		StereotypeURL url = new StereotypeURL();
		
		url.setQualifiedName(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", resourceName, url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setQualifiedName(java.lang.String)}.
	 */
	@Test
	public void testSetQualifiedNameWithoutProfile() {
		StereotypeURL url = new StereotypeURL();
		
		String qualifiedName =  stereotypeName;
		url.setQualifiedName(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", "", url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setQualifiedName(java.lang.String)}.
	 */
	@Test
	public void testSetQualifiedNameWithoutProfileWithResource() {
		StereotypeURL url = new StereotypeURL();
		
		String qualifiedName =  "//" + resourceName + "/" + stereotypeName;
		url.setQualifiedName(qualifiedName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", qualifiedName, url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", "", url.getProfileName());
		assertEquals("resourceName", resourceName, url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setStereotypeName(java.lang.String)}.
	 */
	@Test
	public void testSetStereotypeName() {
		StereotypeURL url = new StereotypeURL(qualifiedNameNoResource);
		
		String newName = "newName";
		url.setStereotypeName(newName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", computeQualifiedName(profileName, newName), url.getQualifiedName());
		assertEquals("stereotypeName", newName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setProfileName(java.lang.String)}.
	 */
	@Test
	public void testSetProfileName() {
		StereotypeURL url = new StereotypeURL(qualifiedNameNoResource);
		
		String newName = "newStereotypeName";
		url.setProfileName(newName);
		
		assertNotNull("object created", url);
		assertEquals("qualifiedname", computeQualifiedName(newName, stereotypeName), url.getQualifiedName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", newName, url.getProfileName());
		assertEquals("resourceName", "", url.getResourceName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#setResourceName(java.lang.String)}.
	 */
	@Test
	public void testSetResourceName() {
		StereotypeURL url = new StereotypeURL(qualifiedName);
		
		String newName = "newName";
		url.setResourceName(newName);
		
		assertNotNull("object created", url);
		assertEquals("resourceName", newName, url.getResourceName());
		assertEquals("stereotypeName", stereotypeName, url.getStereotypeName());
		assertEquals("profileName", profileName, url.getProfileName());
		assertEquals("qualifiedname", computeQualifiedName(newName, profileName, stereotypeName), url.getQualifiedName());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.profile.drafter.ui.model.StereotypeURL#toString()}.
	 */
	@Test
	public void testToString() {
		StereotypeURL url = new StereotypeURL(qualifiedName);
				
		assertNotNull("object created", url);
	}

}
