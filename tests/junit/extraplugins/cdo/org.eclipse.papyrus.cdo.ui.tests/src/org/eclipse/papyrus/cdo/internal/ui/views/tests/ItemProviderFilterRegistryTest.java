/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.cdo.internal.ui.views.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.papyrus.cdo.core.tests.AbstractPapyrusCDOTest;
import org.eclipse.papyrus.cdo.internal.core.PapyrusRepositoryManager;
import org.eclipse.papyrus.cdo.internal.ui.views.ModelRepositoryItemProvider;
import org.junit.After;
import org.junit.Test;

import com.google.common.base.Predicate;

/**
 * Tests the {@code ItemProviderFilterRegistry} class.
 */
public class ItemProviderFilterRegistryTest extends AbstractPapyrusCDOTest {

	public ItemProviderFilterRegistryTest() {
		super();
	}

	@Test
	public void testPredicateFilter() {
		TestFilter.banned = getPapyrusRepository();
		ModelRepositoryItemProvider itemProvider = new ModelRepositoryItemProvider(null);
		itemProvider.inputChanged(null, null, PapyrusRepositoryManager.INSTANCE);

		assertThat(Arrays.asList(itemProvider.getChildren(PapyrusRepositoryManager.INSTANCE)), is(Collections.EMPTY_LIST));
	}

	//
	// Test framework
	//

	@After
	public void tearDown() {
		TestFilter.banned = null;
	}

	public static final class TestFilter implements Predicate<Object> {
		static Object banned;

		@Override
		public boolean apply(Object input) {
			return (banned != null) && (input == banned);
		}
	}
}
