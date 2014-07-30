/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.extendedtypes.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ModelUtils;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.edit.internal.context.TypeContext;
import org.eclipse.papyrus.junit.utils.EditorUtils;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.osgi.framework.Bundle;

/**
 * Abstract class for element types tests
 */
public abstract class AbstractElementTypeTests implements ITestConstants {


	@ClassRule
	public static HouseKeeper.Static houseKeeper = new HouseKeeper.Static();

	protected static IProject createProject;

	protected static IFile copyPapyrusModel;

	protected static IMultiDiagramEditor openPapyrusEditor;

	protected static ModelSet modelset;

	protected static UmlModel umlIModel;

	protected static Model rootModel;

	protected static TransactionalEditingDomain transactionalEditingDomain;

	protected static IFile workspaceTestFile;

	protected static Package packageWithAllElements;

	protected static Package packageWithComponents;

	protected static IClientContext papyrusContext;

	protected static Package otherPackageWithComponents;

	protected static Component component1_packageWithComponents;

	protected static Component component1_otherPackageWithComponents;

	protected static Component component1_packageWithAllElements;


	/**
	 * Init test class
	 */
	@SuppressWarnings("restriction")
	@BeforeClass
	public static void initCreateElementTest() {

		// create Project
		createProject = houseKeeper.createProject("ExtendedTypes");

		// import test model and profile
		try {
			Bundle bundle = Platform.getBundle("org.eclipse.papyrus.infra.extendedtypes.tests");
			copyPapyrusModel = PapyrusProjectUtils.copyPapyrusModel(createProject, bundle, "/model/", "model");
			PapyrusProjectUtils.copyPapyrusModel(createProject, bundle, "/model/", "ExtendedTypesTestsProfile.profile");
			workspaceTestFile = PapyrusProjectUtils.copyIFile("/model/WorkspaceTest.extendedtypes", bundle, createProject, "/model/WorkspaceTest.extendedtypes");
			Assert.assertTrue(workspaceTestFile.isAccessible());
		} catch (CoreException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}

		// open project
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					openPapyrusEditor = houseKeeper.cleanUpLater(EditorUtils.openPapyrusEditor(copyPapyrusModel));
				} catch (PartInitException e) {
					fail(e.getMessage());
				}
			}
		});

		transactionalEditingDomain = (TransactionalEditingDomain)openPapyrusEditor.getAdapter(TransactionalEditingDomain.class);
		assertTrue("Impossible to init editing domain", transactionalEditingDomain instanceof TransactionalEditingDomain);

		// retrieve UML model from this editor
		try {
			modelset = ModelUtils.getModelSetChecked(openPapyrusEditor.getServicesRegistry());
			umlIModel = UmlUtils.getUmlModel(modelset);
			rootModel = (Model)umlIModel.lookupRoot();

			Assert.assertNotNull("root model should not be null", rootModel);

		} catch (ServiceException e) {
			fail(e.getMessage());
		} catch (NotFoundException e) {
			fail(e.getMessage());
		} catch (ClassCastException e) {
			fail(e.getMessage());
		}
		try {
			initExistingElements();
		} catch (Exception e) {
			fail(e.getMessage());
		}

		try {
			papyrusContext = TypeContext.getContext();
		} catch (ServiceException e) {
			fail(e.getMessage());
		}

	}

	/**
	 * Init fields corresponding to element in the test model
	 */
	protected static void initExistingElements() throws Exception {
		packageWithComponents = rootModel.getNestedPackage(PACKAGE_WITH_COMPONENTS);
		Assert.assertNotNull(PACKAGE_WITH_COMPONENTS + " should not be null", packageWithComponents);
		Assert.assertTrue(PACKAGE_WITH_COMPONENTS + " should be a Package", packageWithComponents instanceof Package);

		packageWithAllElements = rootModel.getNestedPackage(PACKAGE_WITH_ALL_ELEMENTS);
		Assert.assertNotNull(PACKAGE_WITH_ALL_ELEMENTS + " should not be null", packageWithAllElements);
		Assert.assertTrue(PACKAGE_WITH_ALL_ELEMENTS + " should be a Package", packageWithAllElements instanceof Package);

		otherPackageWithComponents = rootModel.getNestedPackage(OTHER_PACKAGE_WITH_COMPONENTS);
		Assert.assertNotNull(OTHER_PACKAGE_WITH_COMPONENTS + " should not be null", otherPackageWithComponents);
		Assert.assertTrue(OTHER_PACKAGE_WITH_COMPONENTS + " should be a Package", otherPackageWithComponents instanceof Package);

		// init components
		component1_packageWithComponents = (Component)packageWithComponents.getPackagedElement(COMPONENT_NAME);
		Assert.assertNotNull(COMPONENT_NAME + " should not be null", component1_packageWithComponents);

		component1_otherPackageWithComponents = (Component)otherPackageWithComponents.getPackagedElement(COMPONENT_NAME);
		Assert.assertNotNull(COMPONENT_NAME + " should not be null", component1_otherPackageWithComponents);

		component1_packageWithAllElements = (Component)packageWithAllElements.getPackagedElement(COMPONENT_NAME);
		Assert.assertNotNull(COMPONENT_NAME + " should not be null", component1_packageWithAllElements);

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


}
