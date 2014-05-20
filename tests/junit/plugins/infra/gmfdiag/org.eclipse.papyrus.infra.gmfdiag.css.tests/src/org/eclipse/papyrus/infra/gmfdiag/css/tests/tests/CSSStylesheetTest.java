/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 422257
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.tests.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.WorkspaceCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.helper.CSSHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.preferences.ThemePreferences;
import org.eclipse.papyrus.infra.gmfdiag.css.tests.Activator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class CSSStylesheetTest extends AbstractCSSStylesheetTest {

	@BeforeClass
	public static void initCSSTheme() {
		IPreferenceStore cssThemePreferences = org.eclipse.papyrus.infra.gmfdiag.css.Activator.getDefault().getPreferenceStore();
		cssThemePreferences.setValue(ThemePreferences.CURRENT_THEME, "org.eclipse.papyrus.css.papyrus_theme");
		WorkspaceCSSEngine.instance.reset();
	}

	@Before
	public void init() throws Exception {
		ResourceSet resourceSet = houseKeeper.createResourceSet();
		CSSHelper.installCSSSupport(resourceSet);
		URI uri = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/stylesheetTest/model.notation", true);

		Diagram diagram = (Diagram)EMFHelper.loadEMFModel(resourceSet, uri);
		Assert.assertNotNull("Cannot find the model", diagram);
		Assert.assertTrue("CSS are not activated on this resource", diagram instanceof CSSDiagram);
		this.diagram = (CSSDiagram)diagram;
	}
}
