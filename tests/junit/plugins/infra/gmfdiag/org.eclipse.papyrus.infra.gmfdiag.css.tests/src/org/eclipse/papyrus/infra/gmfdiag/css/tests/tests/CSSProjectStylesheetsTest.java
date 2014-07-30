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

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.ProjectCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.engine.WorkspaceCSSEngine;
import org.eclipse.papyrus.infra.gmfdiag.css.helper.CSSHelper;
import org.eclipse.papyrus.infra.gmfdiag.css.notation.CSSDiagram;
import org.eclipse.papyrus.infra.gmfdiag.css.preferences.ThemePreferences;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheetReference;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsFactory;
import org.eclipse.papyrus.infra.gmfdiag.css.tests.Activator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Test class for Stylesheets project.
 *
 * @author Gabriel Pascual
 *
 */
public class CSSProjectStylesheetsTest extends AbstractCSSStylesheetTest {

	/** Used project to get project CSS engine. */
	private static IProject project = null;

	@BeforeClass
	public static void initCSSTheme() throws Exception {

		IPreferenceStore cssThemePreferences = org.eclipse.papyrus.infra.gmfdiag.css.Activator.getDefault().getPreferenceStore();
		cssThemePreferences.setValue(ThemePreferences.CURRENT_THEME, "org.eclipse.papyrus.css.papyrus_theme");
		WorkspaceCSSEngine.instance.reset();

		testEnvironmentInitialisation();


	}



	/**
	 * To test style sheets preference of a project, it is necessary to create environment in runtime workspace.
	 */
	private static void testEnvironmentInitialisation() throws Exception {

		//Create URI of Papyrus project elements
		URI notationFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/projectStylesheetsTest/model.notation", true);
		URI diFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/projectStylesheetsTest/model.di", true);
		URI umlFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/projectStylesheetsTest/model.uml", true);

		// Create URI of CSS files
		URI classProviderCSSFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/classProviderTest.css", true);
		URI comparmentCSSFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/compartments.css", true);
		URI labelCSSFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/labels.css", true);
		URI modelStylesheetsCSSFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/ModelStylesheetTest.css", true);
		URI projectStylesheetsCSSFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/projectStylesheetsTest.css", true);
		URI stylsheetFileURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/stylesheets/stylesheetTest.css", true);



		// Create first project which contains Papyrus elements
		project = ProjectUtils.createProject("projectStylesheetsTest");
		FilesUtils.copyFiles(project, "model.notation", new URL(notationFileURI.toString()));
		FilesUtils.copyFiles(project, "model.di", new URL(diFileURI.toString()));
		FilesUtils.copyFiles(project, "model.uml", new URL(umlFileURI.toString()));

		// Create second project that contains CSS files
		IProject cssProject = ProjectUtils.createProject("stylesheets");
		FilesUtils.copyFiles(cssProject, "classProviderTest.css", new URL(classProviderCSSFileURI.toString()));
		FilesUtils.copyFiles(cssProject, "compartments.css", new URL(comparmentCSSFileURI.toString()));
		FilesUtils.copyFiles(cssProject, "labels.css", new URL(labelCSSFileURI.toString()));
		FilesUtils.copyFiles(cssProject, "ModelStylesheetTest.css", new URL(modelStylesheetsCSSFileURI.toString()));
		FilesUtils.copyFiles(cssProject, "projectStylesheetsTest.css", new URL(projectStylesheetsCSSFileURI.toString()));
		FilesUtils.copyFiles(cssProject, "stylesheetTest.css", new URL(stylsheetFileURI.toString()));



		createStylesheetsProjectPreference();
	}



	/**
	 * Add a Stylesheets project preference.
	 */
	private static void createStylesheetsProjectPreference() throws Exception {
		IPath preferencePath = new ProjectScope(project).getLocation().append(ProjectCSSEngine.PROJECT_STYLESHEETS);

		// Verify presence of file in project
		IPath projectRelativePath = preferencePath.makeRelativeTo(project.getLocation());
		IFile preferenceFile = project.getFile(projectRelativePath);
		//Create default preference file
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource preferenceResource = resourceSet.createResource(URI.createPlatformResourceURI(preferenceFile.getFullPath().toOSString(), true));

		StyleSheetReference stylesheetReference = StylesheetsFactory.eINSTANCE.createStyleSheetReference();
		stylesheetReference.setPath("/stylesheets/projectStylesheetsTest.css");
		preferenceResource.getContents().add(stylesheetReference);


		preferenceResource.save(Collections.EMPTY_MAP);

	}


	@AfterClass
	public static void cleanWorkspace() throws Exception {
		if(project != null) {
			project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			project.delete(true, true, new NullProgressMonitor());
		}
	}

	@Before
	public void init() throws Exception {

		ResourceSet resourceSet = houseKeeper.createResourceSet();
		CSSHelper.installCSSSupport(resourceSet);


		IFile file = project.getFile("model.notation");
		Diagram diagram = (Diagram)EMFHelper.loadEMFModel(resourceSet, URI.createPlatformResourceURI(file.getFullPath().toOSString(), true));
		Assert.assertNotNull("Cannot find the model", diagram);
		Assert.assertTrue("CSS are not activated on this resource", diagram instanceof CSSDiagram);
		this.diagram = (CSSDiagram)diagram;



	}

	/**
	 * Test of style sheets project preference on model with no priority conflict.
	 */
	@Test
	public void testProjectStylesheets() {

		Shape componentView = findShape("Package1");

		//Stylesheets project preference apply yellow line color and line width of 4
		Assert.assertEquals("Invalid line color", rgb(255, 255, 0), componentView.getLineColor());
		Assert.assertEquals("Invalid color", 4, componentView.getLineWidth());
	}
}
