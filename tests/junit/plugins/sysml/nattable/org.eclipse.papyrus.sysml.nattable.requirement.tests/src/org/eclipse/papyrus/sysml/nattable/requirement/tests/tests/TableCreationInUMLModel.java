/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434993
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.nattable.requirement.tests.tests;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.junit.utils.GenericUtils;
import org.eclipse.papyrus.junit.utils.ModelExplorerUtils;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.sysml.nattable.requirement.tests.Activator;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.Model;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;


public class TableCreationInUMLModel extends AbstractPapyrusTest {

	@ClassRule
	public static final HouseKeeper.Static houseKeeper = new HouseKeeper.Static();

	private static final String MODEL_PATH = "/resources/umlmodel"; //$NON-NLS-1$

	private static final String SOURCE_PATH = "/resources/"; //$NON-NLS-1$

	private static final String FILE_ROOT_NAME = "umlmodel"; //$NON-NLS-1$

	private static final String PROJECT_NAME = "testCreationWithNoProfile"; //$NON-NLS-1$

	private static IMultiDiagramEditor papyrusEditor;

	private static final String BUNDLE_ID = Activator.getDefault().getBundle().getSymbolicName();

	protected static Model rootModel;

	protected static ModelExplorerView view;

	@BeforeClass
	public static void init() {
		try {

			initTests(Activator.getDefault().getBundle(), PROJECT_NAME, MODEL_PATH);

		} catch (CoreException e) {
			Activator.log.error(e);
		} catch (IOException e) {
			Activator.log.error(e);
		} catch (BundleException e) {
			Activator.log.error(e);
		}
	}

	public static void initTests(final Bundle bundle, final String projectName, final String papyrusModelPath) throws CoreException, IOException, BundleException {
		ProjectUtils.removeAllProjectFromTheWorkspace();
		IProject testProject = houseKeeper.createProject(projectName);
		final IFile file = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, FILE_ROOT_NAME);
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {
				papyrusEditor = houseKeeper.openPapyrusEditor(file);

				try {
					TableCreationInSysMLModelTest.view = ModelExplorerUtils.openModelExplorerView();
				} catch (PartInitException e) {
					setStatus(new Status(IStatus.ERROR, bundle.getSymbolicName(), e.getMessage()));
				}
				EObject root = ModelExplorerUtils.getRootInModelExplorer(TableCreationInSysMLModelTest.view);
				TableCreationInSysMLModelTest.rootModel = (Model)root;
				// we look for the testedCommand
				setStatus(Status.OK_STATUS);
			}

		};
		Display.getDefault().syncExec(runnableWithResult);
		Assert.assertEquals(runnableWithResult.getStatus().getMessage(), IStatus.OK, runnableWithResult.getStatus().getSeverity());
		Assert.assertNotNull(TableCreationInSysMLModelTest.rootModel);

	}


	@Test
	public void testCreationHandlerStatusOnRootModel() {
		ModelExplorerUtils.testHandlerStatusInModelExplorer(TableCreationInSysMLModelTest.view, AllTests.COMMAND_ID, TableCreationInSysMLModelTest.rootModel, false);
	}

	@AfterClass
	public static void endOfTest() {
		GenericUtils.closeAllEditors();
	}
}
