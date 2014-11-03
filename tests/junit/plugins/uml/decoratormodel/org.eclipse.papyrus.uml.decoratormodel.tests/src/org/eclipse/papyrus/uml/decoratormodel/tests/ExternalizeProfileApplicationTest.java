/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * Tests the externalization of profiles.
 */
@PluginResource("/resources/testmodel.di")
public class ExternalizeProfileApplicationTest extends AbstractProfileExternalizationTest {

	public ExternalizeProfileApplicationTest() {
		super();
	}

	@Test
	public void unloadedApplicationNotAvailable() {
		assertNotApplied(getPackage2(), getTestProfile());
	}

	@Test
	public void loadApplication() {
		loadDecoratorModel("package2");
		assertExternalApplication(getPackage2(), getTestProfile(), "package2", 3);

		assertThat(getBean2(), isApplied(getBeanStereotype()));
		assertThat(getBean2().getValue(getBeanStereotype(), "kind"), is((Object) getMessageDrivenLiteral()));

		// the profile-externalization profile is not applied to the user package, although it is technically
		// applied (indirectly) to the externalizing package
		assertThat(getBean2Import(), isApplied(getImportStereotype()));
		assertThat(getBean2Import(), not(isApplicable(getApplyProfilesStereotype())));
	}

	@Test
	public void unloadApplication() {
		loadDecoratorModel("package2");

		assertThat(getBean2(), isApplied(getBeanStereotype()));

		unloadDecoratorModel("package2");

		assertNotApplied(getPackage2(), getTestProfile());
	}

	@Test
	public void externalizeApplication() {
		externalize(getPackage1(), getTestProfile(), "package1");

		// Four stereotypes: Bean, Finder, Import, and Bean again
		assertExternalApplication(getPackage1(), getTestProfile(), "package1", 4);

		URI uri = getEntity1().getStereotypeApplication(getBeanStereotype()).eResource().getURI();
		assertThat(uri, not(exists()));

		save();

		// resource was created on disk
		assertThat(uri, exists());
	}

	@Test
	public void externalizeApplication_undo() {
		externalize(getPackage1(), getTestProfile(), "package1");
		URI uri = getEntity1().getStereotypeApplication(getBeanStereotype()).eResource().getURI();

		undo();

		// Four stereotypes: Bean, Finder, Import, and Bean again
		assertInternalApplication(getPackage1(), getTestProfile(), 4);

		save();

		// The decorator model resource was not created
		assertThat(uri, not(exists()));
	}

	@Test
	public void externalizeApplication_undo_redo() {
		externalize(getPackage1(), getTestProfile(), "package1");
		URI uri = getEntity1().getStereotypeApplication(getBeanStereotype()).eResource().getURI();

		undo();
		redo();

		// Four stereotypes: Bean, Finder, Import, and Bean again
		assertExternalApplication(getPackage1(), getTestProfile(), "package1", 4);

		save();

		// resource was created on disk
		assertThat(uri, exists());
	}

	@PluginResource("/resources/package2.decorator.di")
	@Test
	public void loadDecoratorAsMainModel() {
		assertThat(getModel().getName(), is("profile_applications"));

		URI uri = modelSet.getModelResourceURI().trimSegments(1).appendSegment("testmodel.uml");
		Resource userModelResource = modelSet.getResourceSet().getResource(uri, false);

		assertThat("User model not pre-loaded by the decorator IModel", userModelResource, notNullValue());
		assertThat("User model not pre-loaded by the decorator IModel", userModelResource.isLoaded(), is(true));

		Package userModel = (Package) EcoreUtil.getObjectByType(userModelResource.getContents(), UMLPackage.Literals.PACKAGE);
		Package package2 = userModel.getNestedPackage("package2");
		assertThat(package2.getOwnedType("Bean2").getAppliedStereotypes(), hasItem(getBeanStereotype()));
		assertThat(package2.getOwnedType("MessageProcessor").getAppliedStereotypes(), hasItem(getBeanStereotype()));
	}

	@Test
	public void externalizeApplication_forNestedPackage() {
		URI decoratorURI = externalize(getPackage1(), getTestProfile(), "package1");

		// Create a nested package
		EObject stereo = execute(new Callable<EObject>() {
			@Override
			public EObject call() {
				Package nested = getPackage1().createNestedPackage("nested");
				org.eclipse.uml2.uml.Class aBean = nested.createOwnedClass("NewBean", false);
				return aBean.applyStereotype(getBeanStereotype());
			}
		});

		assertThat(stereo.eResource().getURI(), is(decoratorURI));
	}
}
