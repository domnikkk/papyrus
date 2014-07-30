/*******************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Cadavid <juan.cadavid@cea.fr> implementation
 ******************************************************************************/
package org.eclipse.papyrus.infra.services.controlmode.tests.uncontrol;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.papyrus.infra.services.controlmode.tests.Messages;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class UncontrolModelTest extends AbstractUncontrolModelTest {

	static final String PROJECT_NAME = "ReintegrateTestProject"; //$NON-NLS-1$

	private static final String SOURCE_PATH = "/model/UncontrolModelTest/"; //$NON-NLS-1$

	private static final String MODEL_FILE_ROOT_NAME = "ReintegrateTestModel"; //$NON-NLS-1$

	private static final String SUBMODEL_FILE_ROOT_NAME = "Subpackage"; //$NON-NLS-1$

	@Override
	public void initTests(final Bundle bundle) throws CoreException, IOException {
		ProjectUtils.removeAllProjectFromTheWorkspace();
		IProject testProject = ProjectUtils.createProject(PROJECT_NAME);
		modelFile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, MODEL_FILE_ROOT_NAME);
		subModelfile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, SUBMODEL_FILE_ROOT_NAME);
		AbstractUncontrolModelTest.bundle = bundle;
	}

	@Test
	public void uncontrolModelTest() {
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {

				Assert.assertTrue(Messages.UncontrolModelTest_4, HandlerUtils.getActiveHandlerFor(COMMAND_ID).isEnabled());
				uncontrolAndSave(selectElementToUncontrol(), HandlerUtils.getCommand(COMMAND_ID));

			}

		};
		Display.getDefault().syncExec(runnableWithResult);
	}
}
