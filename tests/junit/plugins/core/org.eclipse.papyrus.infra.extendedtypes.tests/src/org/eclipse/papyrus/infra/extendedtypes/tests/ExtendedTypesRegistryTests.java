/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 431953 (fix test to prevent Model Repair dialog on unrecognized profile schema)
 *  Christian W. Damus (CEA) - bug 434993
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.extendedtypes.tests;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.infra.extendedtypes.ExtendedElementTypeSetRegistry;
import org.eclipse.papyrus.infra.extendedtypes.preferences.ExtendedTypesPreferences;
import org.junit.Assert;
import org.junit.Test;


/**
 * Tests for {@link ExtendedTypesRegistry}
 */
public class ExtendedTypesRegistryTests extends AbstractElementTypeTests implements ITestConstants {

	/**
	 * Test registration based on plugin declaration
	 */
	@Test
	public final void testGetTypeRegisteredInplugin() {
		// check standard class
		IElementType classType = ElementTypeRegistry.getInstance().getType(ORG_ECLIPSE_PAPYRUS_UML_CLASS);
		Assert.assertNotNull("Element type should be registered", classType);

		IElementType abstractClassType = ElementTypeRegistry.getInstance().getType(ABSTRACT_CLASS_TOOL);
		Assert.assertNotNull("Element type should be registered", abstractClassType);
	}

	/**
	 * Test workspace registration. Element type in the workspace, but element type set is not loaded
	 */
	@Test
	public final void testGetTypeRegisteredInWorkspaceNotLoaded() {
		checkPluginTypes();

		// no preference should be set for this test
		ExtendedTypesPreferences.unregisterWorkspaceDefinition(WORKSPACE_ELEMENT_TYPE_ID);
		
		// this should not be defined yet
		IElementType workspaceType = ElementTypeRegistry.getInstance().getType(WORKSPACE_ELEMENT_TYPE_TOOL);
		Assert.assertNull("Element type should not be registered yet", workspaceType);

	}

	/**
	 * Test workspace registration. Element type in the workspace, but element type set is not loaded
	 */
	@Test
	public final void testLoadUnloadWorkspaceSet() {
		// this should not be defined yet
		IElementType workspaceType = ElementTypeRegistry.getInstance().getType(WORKSPACE_ELEMENT_TYPE_TOOL);
		Assert.assertNull("Element type should not be registered yet", workspaceType);
		checkPluginTypes();

		// register
		ExtendedTypesPreferences.registerWorkspaceDefinition(WORKSPACE_ELEMENT_TYPE_ID, workspaceTestFile.getFullPath().toString());
		ExtendedElementTypeSetRegistry.getInstance().loadExtendedElementTypeSet(WORKSPACE_ELEMENT_TYPE_ID);

		workspaceType = ElementTypeRegistry.getInstance().getType(WORKSPACE_ELEMENT_TYPE_TOOL);
		Assert.assertNotNull("Element type should be registered", workspaceType);
		checkPluginTypes();
		
		// unregister
		ExtendedTypesPreferences.unregisterWorkspaceDefinition(WORKSPACE_ELEMENT_TYPE_ID);
		ExtendedElementTypeSetRegistry.getInstance().unload(WORKSPACE_ELEMENT_TYPE_ID);

		workspaceType = ElementTypeRegistry.getInstance().getType(WORKSPACE_ELEMENT_TYPE_TOOL);
		Assert.assertNull("Element type should not be registered anymore", workspaceType);
		checkPluginTypes();

	}

	/**
	 * Check always present element types are registered
	 */
	private void checkPluginTypes() {
		IElementType classType = ElementTypeRegistry.getInstance().getType(ORG_ECLIPSE_PAPYRUS_UML_CLASS);
		Assert.assertNotNull("Element type should be registered", classType);
		IElementType abstractClassType = ElementTypeRegistry.getInstance().getType(ABSTRACT_CLASS_TOOL);
		Assert.assertNotNull("Element type should be registered", abstractClassType);
	}
}
