/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Thibault Le Ouay (Sherpa Engineering) t.leouay@sherpa-eng.com  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.wizards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectDiagramCategoryPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectDiagramKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRootElementPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class TestCreateModelFromExistingModelWizard extends TestNewModelWizardBase {

	//This test only covers the creation of the wizard and check if the first page contain the expected file name
	private static IProject createProject;

	private static IFile file, fileWithDot;

	/**
	 * @see org.eclipse.papyrus.uml.diagram.wizards.TestNewModelWizardBase#createWizard()
	 *
	 * @return
	 */

	@BeforeClass
	public static void init() {
		try {
			createProject = ProjectUtils.createProject("UMLOnlyTest");
		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		}

		try {
			file = PapyrusProjectUtils.copyIFile("/resources/model.uml", Platform.getBundle("org.eclipse.papyrus.uml.diagram.wizards.tests"), createProject, "model.uml");
			fileWithDot = PapyrusProjectUtils.copyIFile("/resources/model.model.uml", Platform.getBundle("org.eclipse.papyrus.uml.diagram.wizards.tests"), createProject, "model.model.uml");

		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	protected IWorkbenchWizard createWizard() {
		return new InitModelWizard() {

			private boolean isInitFromExistingDomainModel;

			private SelectRootElementPage selectRootElementPage;

			@Override
			public void init(IWorkbench workbench, IStructuredSelection selection) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				isInitFromExistingDomainModel = isSupportedDomainModelResource(uri);
				super.init(workbench, selection);
				selectRootElementPage = createSelectRootElementPage(selection);
				if(isCreateFromExistingDomainModel()) {
					// Init Model not Create a new one
					setWindowTitle(Messages.InitModelWizard_init_papyrus_diagram);
				}
			}

			@Override
			public boolean isCreateFromExistingDomainModel() {
				return true;
			}

		};

	}


	@Test
	public void testOrderOfPages() {
		Class<?>[] expectedPages = new Class[]{ NewModelFilePage.class, SelectDiagramCategoryPage.class, SelectDiagramKindPage.class, SelectRootElementPage.class };

		IWorkbenchWizard wizard = initWizardDialog();
		testOrderOfPages(wizard, expectedPages);
	}

	@Test
	public void testForSimpleModel() {
		InitModelWizard wizard = new InitModelWizard() {

			private boolean isInitFromExistingDomainModel;

			private SelectRootElementPage selectRootElementPage;

			@Override
			public void init(IWorkbench workbench, IStructuredSelection selection) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				isInitFromExistingDomainModel = isSupportedDomainModelResource(uri);
				super.init(workbench, selection);
				selectRootElementPage = createSelectRootElementPage(selection);
				if(isCreateFromExistingDomainModel()) {
					// Init Model not Create a new one
					setWindowTitle(Messages.InitModelWizard_init_papyrus_diagram);
				}
			}

			@Override
			public boolean isCreateFromExistingDomainModel() {
				return true;
			}

		};
		initWizardDialog(wizard);
		NewModelFilePage page = getPage(wizard, NewModelFilePage.class);
		assertEquals("model.di", page.getFileName());

	}

	@Test
	public void testForModelWithDot() {
		InitModelWizard wizard = new InitModelWizard() {

			private boolean isInitFromExistingDomainModel;

			private SelectRootElementPage selectRootElementPage;

			@Override
			public void init(IWorkbench workbench, IStructuredSelection selection) {
				URI uri = URI.createPlatformResourceURI(fileWithDot.getFullPath().toString(), true);
				isInitFromExistingDomainModel = isSupportedDomainModelResource(uri);
				super.init(workbench, selection);
				selectRootElementPage = createSelectRootElementPage(selection);
				if(isCreateFromExistingDomainModel()) {
					// Init Model not Create a new one
					setWindowTitle(Messages.InitModelWizard_init_papyrus_diagram);
				}
			}

			@Override
			public boolean isCreateFromExistingDomainModel() {
				return true;
			}
		};
		initWizardDialog(wizard);
		NewModelFilePage page = getPage(wizard, NewModelFilePage.class);
		assertNotSame("model.model.di", page.getFileName());
		//this should be fixed in the wizard to have the right name from the begining if the name contain a dot


	}


}
