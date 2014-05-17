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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.uml2.uml.PackageableElement;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class ExistingResourceControlModeTest extends AbstractControlModeTest {

	private static final String PROJECT_NAME = "ExistingResourceControlModeTestProject";

	private static final String SOURCE_PATH = "/model/ExistingResourceControlModelTest/";

	private static final String MODEL_FILE_NAME = "ControlModeTestModel";

	private static final String COMMAND_ID = "org.eclipse.papyrus.infra.services.controlmode.createsubmodel";

	private static final String EXISTING_RESOURCE_NAME = "ExistingResource";

	protected static IMultiDiagramEditor papyrusEditor;

	protected static ModelExplorerView view;

	private static SWTWorkbenchBot bot;

	@Override
	protected void initTests(Bundle bundle) throws CoreException, IOException {
		bot = new SWTWorkbenchBot();
		ProjectUtils.removeAllProjectFromTheWorkspace();
		IProject testProject = ProjectUtils.createProject(PROJECT_NAME);
		modelFile = PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, MODEL_FILE_NAME);
		PapyrusProjectUtils.copyPapyrusModel(testProject, bundle, SOURCE_PATH, EXISTING_RESOURCE_NAME);
		ControlModelTest.bundle = bundle;
	}

	@Test
	public void existingResourceControlModeTest() {
		RunnableWithResult<?> runnableWithResult = new RunnableWithResult.Impl<Object>() {

			@Override
			public void run() {
				List<PackageableElement> elements = selectElementToControl();
				boolean enabled = HandlerUtils.getActiveHandlerFor(COMMAND_ID).isEnabled();
				Assert.assertTrue("The handler for control mode is not enabled!", enabled);
				// Click "ok" with SWTBot
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							fail(e.getLocalizedMessage());
						}

						bot.textWithLabel("Resource &URI:").setText("platform:/resource/" + PROJECT_NAME + "/model/" + EXISTING_RESOURCE_NAME + ".di");
						bot.button("OK").click();

					}
				});
				controlAndSave(editor, model, elements, HandlerUtils.getCommand(COMMAND_ID));
			}

		};
		Display.getDefault().syncExec(runnableWithResult);
	}
}
