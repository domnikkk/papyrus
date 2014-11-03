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

package org.eclipse.papyrus.uml.decoratormodel.internal.resource.tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelCopier;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.tests.AbstractProfileExternalizationTest;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.FrameworkUtil;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.io.Resources;

/**
 * Tests the {@link DecoratorModelCopier} class.
 */
@SuppressWarnings("restriction")
@PluginResource("/resources/testmodel.di")
public class DecoratorModelCopierTest extends AbstractProfileExternalizationTest {
	private static final String DUPLICATE_DECORATOR_KEY = "package2dup";

	private URI decoratorURI;
	private URI duplicateURI;

	@Test
	public void copy_allProfiles() {
		copy();

		loadDecoratorModel(DUPLICATE_DECORATOR_KEY);

		assertThat("Bean stereotype not applied", getBean2().getAppliedStereotypes(), hasItem(getBeanStereotype()));
		assertThat("Bean stereotype not applied", getMessageProcessor().getAppliedStereotypes(), hasItem(getBeanStereotype()));

		Stereotype eclass = getEClassStereotype();
		assertThat("EClass stereotype not applied", getBean2().getAppliedStereotypes(), hasItem(eclass));
		assertThat("EClass stereotype not applied", getMessageProcessor().getAppliedStereotypes(), hasItem(eclass));

		assertThat(getBean2().getValue(eclass, UMLUtil.TAG_DEFINITION__CLASS_NAME), is((Object) "MyBean"));
		assertThat(getBean2().getValue(eclass, UMLUtil.TAG_DEFINITION__XML_NAME), is((Object) "bean"));
	}

	@Test
	public void copy_subsetOfProfiles() {
		copy(getTestProfile().eResource().getURI());

		loadDecoratorModel(DUPLICATE_DECORATOR_KEY);

		assertThat("Bean stereotype not applied", getBean2().getAppliedStereotypes(), hasItem(getBeanStereotype()));
		assertThat("Bean stereotype not applied", getMessageProcessor().getAppliedStereotypes(), hasItem(getBeanStereotype()));

		Stereotype eclass = getEClassStereotype();
		assertThat("EClass stereotype is applied", getBean2().getAppliedStereotypes(), not(hasItem(eclass)));
		assertThat("EClass stereotype is applied", getMessageProcessor().getAppliedStereotypes(), not(hasItem(eclass)));
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		decoratorURI = createDecoratorModelURI("package2");
		duplicateURI = createDecoratorModelURI(DUPLICATE_DECORATOR_KEY);

		// Replace the decorator with one that also has the Ecore profile applied
		OutputStream output = null;

		try {
			output = modelSet.getResourceSet().getURIConverter().createOutputStream(decoratorURI);
			Resources.copy(FrameworkUtil.getBundle(getClass()).getEntry("/resources/package2.ecore.uml"), output);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Failed to create test resource: " + e.getLocalizedMessage());
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					// Pass
				}
			}
		}
	}

	void copy(URI... profilesToInclude) {
		final String dupName = "test copy";

		DecoratorModelCopier copier = (profilesToInclude.length == 0) //
		? new DecoratorModelCopier(dupName) //
				: new DecoratorModelCopier(dupName, ImmutableSet.copyOf(profilesToInclude));

		try {
			copier.copy(decoratorURI, duplicateURI).save(null);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Failed to save decorator model copy: " + e.getLocalizedMessage());
		} finally {
			copier.dispose();
		}

		try {
			String modelName = DecoratorModelIndex.getInstance().getDecoratorModelName(duplicateURI);
			assertThat(modelName, is(dupName));
		} catch (CoreException e) {
			e.printStackTrace();
			fail("Failed to get name of decorator model copy from the index: " + e.getLocalizedMessage());
		}
	}

	Stereotype getEClassStereotype() {
		return Iterables.getFirst(Iterables.filter(UMLUtil.findNamedElements(modelSet.getResourceSet().getResource(URI.createURI(UMLResource.ECORE_PROFILE_URI), true), "Ecore::EClass"), Stereotype.class), null);
	}
}
