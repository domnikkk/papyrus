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
package org.eclipse.papyrus.infra.services.controlmode.tests.control;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.ParameterValuesException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.papyrus.infra.services.controlmode.commands.ControlModeCommandParameterValues;
import org.eclipse.papyrus.infra.services.controlmode.tests.Messages;
import org.eclipse.papyrus.infra.services.handler.ControlCommandHandler;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.uml2.uml.PackageableElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class ControlModelWithProfileTest extends AbstractControlModeTest {

	static final String PROJECT_NAME = "ControlModeWithProfileTestProject"; //$NON-NLS-1$

	static final String SOURCE_PATH = "/model/ControlModeWithProfileTest/"; //$NON-NLS-1$

	static final String MODEL_FILE_NAME = "ControlModeWithProfileTestModel"; //$NON-NLS-1$

	static final String PROFILE_FILE_NAME = "testProfile.profile"; //$NON-NLS-1$

	@Override
	protected void initTests(final Bundle bundle) throws CoreException, IOException {
		bot = new SWTWorkbenchBot();
		ProjectUtils.removeAllProjectFromTheWorkspace();
		IProject testProject = ProjectUtils.createProject(PROJECT_NAME);
		modelFile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, MODEL_FILE_NAME);
		PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, PROFILE_FILE_NAME);
		AbstractControlModeTest.bundle = bundle;
	}

	@Ignore @Test
	public void controlModelWithProfileTest() {
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {
				List<PackageableElement> elements = selectElementToControl();
				Assert.assertTrue(Messages.ControlModelWithProfileTest_4, HandlerUtils.getActiveHandlerFor(COMMAND_ID).isEnabled());
				// Click "ok" with SWTBot
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							fail(e.getLocalizedMessage());
						}
						bot.button("OK").click(); //$NON-NLS-1$

					}
				});
				controlAndSave(editor, model, elements, HandlerUtils.getCommand(COMMAND_ID));
			}

		};
		Display.getDefault().syncExec(runnableWithResult);
	}

	@Test
	public void controlModelTestWithProfileTestWithoutDialog() throws NotDefinedException, ParameterValuesException {
		IParameter dialogParameter = HandlerUtils.getCommand(this.COMMAND_ID).getParameter(ControlCommandHandler.CONTROLMODE_USE_DIALOG_PARAMETER);
		ControlModeCommandParameterValues controlModePlatformValues = (ControlModeCommandParameterValues)dialogParameter.getValues();
		controlModePlatformValues.put("showDialog", false);
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {
				List<PackageableElement> elements = selectElementToControl();
				Assert.assertTrue(Messages.ControlModelTest_4, HandlerUtils.getActiveHandlerFor(COMMAND_ID).isEnabled());
				
				controlAndSave(editor, model, elements, HandlerUtils.getCommand(COMMAND_ID));
			}

		};
		Display.getDefault().syncExec(runnableWithResult);
	}

}
