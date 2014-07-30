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
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class UncontrolModelWithProfileTest extends AbstractUncontrolModelTest {

	private static final String PROJECT_NAME = "UncontrolModelWithProfileTestProject"; //$NON-NLS-1$

	private static final String SOURCE_PATH = "/model/UncontrolModeWithProfileTest/"; //$NON-NLS-1$

	private static final String MODEL_FILE_ROOT_NAME = "UncontrolModeWithProfileTestModel"; //$NON-NLS-1$

	private static final String SUBMODEL_FILE_ROOT_NAME = "submodel"; //$NON-NLS-1$

	private static final String PROFILE_FILE_NAME = "testProfile.profile"; //$NON-NLS-1$

	public void initTests(final Bundle bundle) throws CoreException, IOException {
		ProjectUtils.removeAllProjectFromTheWorkspace();
		IProject testProject = ProjectUtils.createProject(PROJECT_NAME);

		//Copy the profile
		PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, PROFILE_FILE_NAME);

		//Copy the controlled model
		modelFile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, MODEL_FILE_ROOT_NAME);

		//Copy the submodel
		subModelfile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, SUBMODEL_FILE_ROOT_NAME);
		UncontrolModelWithProfileTest.bundle = bundle;
	}

	@Test
	public void uncontrolModelWithProfileTest() {
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {
				Assert.assertTrue(Messages.UncontrolModelWithProfileTest_5, HandlerUtils.getActiveHandlerFor(COMMAND_ID).isEnabled());
				uncontrolAndSave(selectElementToUncontrol(), HandlerUtils.getCommand(COMMAND_ID));
			}

		};
		Display.getDefault().syncExec(runnableWithResult);
	}


}
