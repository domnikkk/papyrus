/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.tests.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.WorkspaceCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.helper.CSSHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.preferences.ThemePreferences;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheetReference;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsFactory;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.Theme;
import org.eclipse.papyrus.infra.gmfdiag.css.tests.Activator;
import org.eclipse.papyrus.infra.gmfdiag.css.theme.ThemeManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Test class for wokspace thme in Papyrus.
 *
 * @author Gabriel Pascual
 *
 */
public class CSSWorkspaceThemeTest extends AbstractCSSStylesheetTest {

	/**
	 * Force the default CSS Theme before and after testing
	 */
	@BeforeClass
	@AfterClass
	public static void restoreDefaultTheme() throws Exception {
		IPreferenceStore cssThemePreferences = org.eclipse.papyrus.infra.gmfdiag.css.Activator.getDefault().getPreferenceStore();
		cssThemePreferences.setValue(ThemePreferences.CURRENT_THEME, "org.eclipse.papyrus.css.papyrus_theme");
		WorkspaceCSSEngine.instance.reset();
	}

	/**
	 * Method will be executed before each test
	 * method
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void init() throws Exception {

		ResourceSet resourceSet = houseKeeper.createResourceSet();
		CSSHelper.installCSSSupport(resourceSet);

		URI modelURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/workspaceThemeTest/model.notation", true);

		Diagram diagram = (Diagram)EMFHelper.loadEMFModel(resourceSet, modelURI);
		Assert.assertNotNull("Cannot find the model", diagram);
		Assert.assertTrue("CSS are not activated on this resource", diagram instanceof CSSDiagram);
		this.diagram = (CSSDiagram)diagram;
	}

	/**
	 * Test of a addition of workspace theme and its expected results.
	 */
	@Test
	public void testWorkspaceTheme() {
		StylesheetsFactory factory = StylesheetsFactory.eINSTANCE;

		// Create theme to add
		Theme expectedTheme = factory.createTheme();
		String expectedId = "_1215_2154_12";
		expectedTheme.setId(expectedId);
		expectedTheme.setLabel("Workspace Theme Test ");

		StyleSheetReference styleSheetTheme = factory.createStyleSheetReference();
		URI cssFileUri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/workspaceThemeTest.css", true);
		styleSheetTheme.setPath(cssFileUri.toString());
		expectedTheme.getStylesheets().add(styleSheetTheme);

		// Load themes in manager
		ThemeManager themeManager = ThemeManager.instance;
		themeManager.getThemes();

		//Add theme to workspace preferences
		themeManager.addTemporaryTheme(expectedTheme);
		themeManager.refreshThemes();
		themeManager.persist();

		// Verify if added theme exist in preferences
		Theme persistedTheme = themeManager.getTheme(expectedId);
		Assert.assertEquals("Fail to persist workspace theme", expectedId, persistedTheme.getId());

		// Select added theme as current theme
		IPreferenceStore cssThemePreferences = org.eclipse.papyrus.infra.gmfdiag.css.Activator.getDefault().getPreferenceStore();
		cssThemePreferences.setValue(ThemePreferences.CURRENT_THEME, expectedId);
		WorkspaceCSSEngine.instance.reset();

		Assert.assertEquals("Invalid theme in preference store", expectedId, cssThemePreferences.getString(ThemePreferences.CURRENT_THEME));

		//Verify theme values with Class5 element
		Shape fifthClassShape = findShape("Class5");
		Assert.assertEquals("Invalid color", rgb(255, 0, 0), fifthClassShape.getLineColor());
	}
}
