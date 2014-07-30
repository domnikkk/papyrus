/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *  CEA LIST - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434993
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.Activator;
import org.eclipse.papyrus.uml.diagram.common.helper.CreateOrShowExistingElementHelper;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.junit.BeforeClass;
import org.junit.ClassRule;

/**
 * Abstract Papyrus initialization class (required to get Service activation).
 */
public abstract class AbstractTest extends AbstractPapyrusTest {

	@ClassRule
	public static final HouseKeeper.Static houseKeeper = new HouseKeeper.Static();
	
	public static IEditorPart editor = null;

	@BeforeClass
	public static void openPapyrusWithAnEmptyProject() throws Exception {
		Runnable closeIntroRunnable = new Runnable() {

			public void run() {
				IIntroPart introPart = PlatformUI.getWorkbench().getIntroManager().getIntro();
				PlatformUI.getWorkbench().getIntroManager().closeIntro(introPart);
			}
		};
		PlatformUI.getWorkbench().getDisplay().syncExec(closeIntroRunnable);

		// Prepare new project for tests
		IProject testProject = houseKeeper.createProject("TestProject");

		// Copy EmptyModel from bundle to the test project
		final IFile emptyModel_di = testProject.getFile("ModelWithBDD.di");
		IFile emptyModel_no = testProject.getFile("ModelWithBDD.notation");
		IFile emptyModel_uml = testProject.getFile("ModelWithBDD.uml");

		emptyModel_di.create(Activator.getInstance().getBundle().getResource("/model/ModelWithBDD.di").openStream(), true, new NullProgressMonitor());
		emptyModel_no.create(Activator.getInstance().getBundle().getResource("/model/ModelWithBDD.notation").openStream(), true, new NullProgressMonitor());
		emptyModel_uml.create(Activator.getInstance().getBundle().getResource("/model/ModelWithBDD.uml").openStream(), true, new NullProgressMonitor());

		// Open the EmptyModel.di file with Papyrus (assumed to be the default editor for "di" files here).
		editor = houseKeeper.openPapyrusEditor(emptyModel_di);

		//set the preference to never for the dialog to display existing link instead of create a new one.
		final IPreferenceStore store = org.eclipse.papyrus.uml.diagram.common.Activator.getDefault().getPreferenceStore();
		boolean contains = store.contains(CreateOrShowExistingElementHelper.DISPLAY_DIALOG_FOR_CREATE_OR_RESTORE_ELEMENT);
		if(!contains) {
			store.setValue(CreateOrShowExistingElementHelper.DISPLAY_DIALOG_FOR_CREATE_OR_RESTORE_ELEMENT, MessageDialogWithToggle.NEVER);
			store.setDefault(CreateOrShowExistingElementHelper.DISPLAY_DIALOG_FOR_CREATE_OR_RESTORE_ELEMENT, MessageDialogWithToggle.NEVER);
		}
	}
}
