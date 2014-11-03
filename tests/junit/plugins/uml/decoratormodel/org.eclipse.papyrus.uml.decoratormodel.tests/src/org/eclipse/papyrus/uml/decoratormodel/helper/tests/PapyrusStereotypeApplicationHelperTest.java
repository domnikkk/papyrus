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

package org.eclipse.papyrus.uml.decoratormodel.helper.tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.decoratormodel.helper.PapyrusStereotypeApplicationHelper;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.junit.Test;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Tests that the {@link PapyrusStereotypeApplicationHelper} class supports standard UML usage
 * (other tests more than sufficiently cover decorator model usage).
 */
public class PapyrusStereotypeApplicationHelperTest extends AbstractPapyrusTest {
	private final PapyrusStereotypeApplicationHelper fixture = new PapyrusStereotypeApplicationHelper();

	@Test
	public void applyStereotype_resourceSet() {
		ResourceSet rset = new ResourceSetImpl();

		try {
			Resource uml = rset.createResource(URI.createURI("bogus://test"), UMLPackage.eCONTENT_TYPE);
			Package package_ = UMLFactory.eINSTANCE.createPackage();
			uml.getContents().add(package_);

			Profile profile = createProfile(rset);
			package_.applyProfile(profile);

			EClass stereotype = (EClass) package_.getProfileApplications().get(0).getAppliedDefinition(profile.getOwnedStereotype("Stereo"));
			Class foo = package_.createOwnedClass("Foo", false);
			EObject stereotypeApplication = fixture.applyStereotype(foo, stereotype);

			assertThat(UMLUtil.getBaseElement(stereotypeApplication), is((Element) foo));
			assertThat(uml.getContents(), hasItem(stereotypeApplication));
		} finally {
			EMFHelper.unload(rset);
		}
	}

	@Test
	public void applyStereotype_freeFloating() {
		ResourceSet rset = new ResourceSetImpl();

		final List<EObject> unload = Lists.newArrayList();

		try {
			Package package_ = UMLFactory.eINSTANCE.createPackage();
			unload.add(package_);

			Profile profile = createProfile(rset);
			package_.applyProfile(profile);

			EClass stereotype = (EClass) package_.getProfileApplications().get(0).getAppliedDefinition(profile.getOwnedStereotype("Stereo"));
			Class foo = package_.createOwnedClass("Foo", false);
			EObject stereotypeApplication = fixture.applyStereotype(foo, stereotype);
			unload.add(stereotypeApplication);

			assertThat(UMLUtil.getBaseElement(stereotypeApplication), is((Element) foo));
			assertThat(stereotypeApplication.eResource(), nullValue());
		} finally {
			EMFHelper.unload(rset);
			for (Iterator<EObject> iter = EcoreUtil.getAllContents(unload); iter.hasNext();) {
				iter.next().eAdapters().clear();
			}
		}
	}

	@Test
	public void stereotypeApplication_inNestedPackage() {
		ResourceSet rset = new ResourceSetImpl();

		try {
			Resource uml = rset.createResource(URI.createURI("bogus://test"), UMLPackage.eCONTENT_TYPE);
			Package package_ = UMLFactory.eINSTANCE.createPackage();
			uml.getContents().add(package_);

			Profile profile = createProfile(rset);
			package_.applyProfile(profile);

			EClass stereotype = (EClass) package_.getProfileApplications().get(0).getAppliedDefinition(profile.getOwnedStereotype("Stereo"));

			Package nested = package_.createNestedPackage("nested");
			Class foo = nested.createOwnedClass("Foo", false);
			EObject stereotypeApplication = fixture.applyStereotype(foo, stereotype);

			assertThat(UMLUtil.getBaseElement(stereotypeApplication), is((Element) foo));
			assertThat(uml.getContents(), hasItem(stereotypeApplication));
		} finally {
			EMFHelper.unload(rset);
		}
	}

	//
	// Test framework
	//

	Profile createProfile(ResourceSet rset) {
		Resource resource = rset.createResource(URI.createURI("bogus://test/profile"), UMLPackage.eCONTENT_TYPE);

		Profile result = UMLFactory.eINSTANCE.createProfile();
		resource.getContents().add(result);
		result.setName("profile");
		result.setURI(resource.getURI().toString());
		Stereotype stereo = result.createOwnedStereotype("Stereo", false);

		rset.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		Class metaclass = Iterables.getFirst(Iterables.filter(UMLUtil.findNamedElements(rset, "UML::Class"), Class.class), null);
		result.createMetaclassReference(metaclass);
		stereo.createExtension(metaclass, false);

		result.define();

		return result;
	}
}
