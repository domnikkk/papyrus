/*
 * Copyright (c) 2014, 2015 CEA, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   Christian W. Damus - bug 436666
 *
 */
package org.eclipse.papyrus.uml.decoratormodel.tests;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.IRepairAction;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.StereotypeApplicationRepairSnippet;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.ZombieStereotypesDescriptor;
import org.eclipse.uml2.uml.Profile;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Functions;


/**
 * Automated tests for stereotype/profile application repair in decorator models.
 */
@SuppressWarnings("restriction")
public class StereotypeApplicationRepairTest extends AbstractProfileExternalizationTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	private ZombieStereotypesDescriptor zombies;

	private Resource decoratorModelResource;

	public StereotypeApplicationRepairTest() {
		super();
	}

	/**
	 * Test case in which the profile application is not missing, and the EPackage schema is successfully resolved by EMF, but
	 * the stereotype applications are from a different version of the profile than is currently applied.
	 */
	@Test
	@PluginResource("/resources/wrongProfileVersion/testmodel.di")
	public void wrongProfileVersion() {
		assertThat("Should have found zombie stereotypes", zombies, notNullValue());

		IAdaptable schema = getOnlyZombieSchema();
		EPackage ePackage = AdapterUtils.adapt(schema, EPackage.class).get();
		assertThat("Did not match schema to loaded profile", EcoreUtil.getRootContainer(ePackage), is((EObject) getTestProfile()));
		assertThat("EPackage is an unknown schema", getExtendedMetadata().demandedPackages(), not(hasItem(ePackage)));

		IRepairAction action = zombies.getSuggestedRepairAction(schema);
		assertThat("Wrong suggested repair action", action.kind(), is(IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION));

		repair(schema, action);
		assertStereotypeApplication();
	}

	/**
	 * Test case in which the profile application is missing, but the EPackage schema is successfully resolved by EMF, so
	 * we just have to link up with the profile definition and apply it (no need to parse unknown-schema AnyTypes).
	 */
	@Test
	@PluginResource("/resources/missingProfileApplication/testmodel.di")
	public void missingProfileApplication() {
		assertThat("Should have found zombie stereotypes", zombies, notNullValue());

		IAdaptable schema = getOnlyZombieSchema();
		EPackage ePackage = AdapterUtils.adapt(schema, EPackage.class).get();
		assertThat("Did not match schema to loaded profile", EcoreUtil.getRootContainer(ePackage), is((EObject) getTestProfile()));
		assertThat("EPackage is an unknown schema", getExtendedMetadata().demandedPackages(), not(hasItem(ePackage)));

		IRepairAction action = zombies.getSuggestedRepairAction(schema);
		assertThat("Wrong suggested repair action", action.kind(), is(IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION));

		repair(schema, action);
		assertStereotypeApplication();
	}

	/**
	 * Test case in which the profile application and schema location are present but reference a non-existent resource.
	 * We just have to link up with the profile definition and apply it and parse unknown-schema AnyTypes to reconstruct stereotypes.
	 */
	@Test
	@PluginResource("/resources/missingSchema/testmodel.di")
	public void missingSchema() {
		assertThat("Should have found zombie stereotypes", zombies, notNullValue());

		IAdaptable schema = getOnlyZombieSchema();
		EPackage ePackage = AdapterUtils.adapt(schema, EPackage.class).get();
		assertThat("EPackage is not an unknown schema", getExtendedMetadata().demandedPackages(), hasItem(ePackage));

		IRepairAction action = zombies.getSuggestedRepairAction(schema);
		assertThat("Wrong suggested repair action", action.kind(), is(IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION));

		repair(schema, action);
		assertStereotypeApplication();
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() throws Exception {
		SnippetFixture snippet = new SnippetFixture(Functions.constant(getTestProfile()));
		snippet.start(modelSet.getResourceSet());
		houseKeeper.cleanUpLater(snippet, "dispose", modelSet.getResourceSet());

		// Load the decorator model to trigger the repair operation
		decoratorModelResource = loadDecoratorModel("package1");

		houseKeeper.setField("zombies", snippet.getZombieStereotypes(decoratorModelResource));
	}

	void repair(final IAdaptable schema, final IRepairAction action) {
		try {
			TransactionHelper.run(modelSet.getEditingDomain(), new Runnable() {

				@Override
				public void run() {
					zombies.repair(schema, action, null, null);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to run repair action: " + e.getLocalizedMessage());
		}
	}

	IAdaptable getOnlyZombieSchema() {
		Collection<? extends IAdaptable> schemata = zombies.getZombieSchemas();
		assertThat("Wrong number of zombie packages", schemata.size(), is(1));
		return schemata.iterator().next();
	}

	void assertStereotypeApplication() {
		assertThat("Stereotype not applied to the class", getEntity1().isStereotypeApplied(getBeanStereotype()));
		EObject application = getEntity1().getStereotypeApplication(getBeanStereotype());

		assertThat("Stereotype application was moved out of the decorator model", application.eResource(), not(getEntity1().eResource()));
	}

	ExtendedMetaData getExtendedMetadata() {
		return getExtendedMetadata(decoratorModelResource);
	}

	ExtendedMetaData getExtendedMetadata(Resource resource) {
		ExtendedMetaData result = ExtendedMetaData.INSTANCE;

		Object option = ((XMLResource) resource).getDefaultSaveOptions().get(XMLResource.OPTION_EXTENDED_META_DATA);
		if (option instanceof ExtendedMetaData) {
			result = (ExtendedMetaData) option;
		}

		return result;
	}

	//
	// Nested types
	//

	static class SnippetFixture extends StereotypeApplicationRepairSnippet {
		SnippetFixture(Function<? super EPackage, Profile> dynamicProfileSupplier) {
			super(dynamicProfileSupplier);
		}

		@Override
		protected ZombieStereotypesDescriptor getZombieStereotypes(Resource resource) {
			return super.getZombieStereotypes(resource);
		}
	}
}
