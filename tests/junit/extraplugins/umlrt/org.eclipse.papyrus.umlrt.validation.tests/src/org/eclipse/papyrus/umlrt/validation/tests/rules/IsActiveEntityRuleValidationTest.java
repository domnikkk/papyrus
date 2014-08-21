/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.umlrt.validation.tests.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.uml.service.validation.UMLDiagnostician;
import org.eclipse.papyrus.umlrt.validation.tests.Activator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Sample test for cut in model explorer
 *
 * @author bmaggi
 */
public class IsActiveEntityRuleValidationTest extends AbstractValidationEditorTest {

	public static final String CONSTRAINT_PLUGIN = "org.eclipse.papyrus.umlrt.validation"; //$NON-NLS-1$

	public static final String CONSTRAINT_ID = "isActiveEntity"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "IsActiveEntityRule"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "IsActiveEntityRuleValidationTest"; //$NON-NLS-1$

	public final static String CAPSULE1_NAME = "Capsule1"; //$NON-NLS-1$

	@Before
	public void initModelForCutTest() throws Exception {
		initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle());
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}

	/**
	 * Simple failing validation for IsActiveEntityRule
	 */
	@Test
	public void validateIsActiveEntityRule() throws Exception {

		// get the rootModel
		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		// get all semantic element that will handled
		Model model = (Model) getRootUMLModel();

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();
		List<Object> elements = new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		org.eclipse.uml2.uml.Class capsule1 = (org.eclipse.uml2.uml.Class) model.getPackagedElement(CAPSULE1_NAME);

		elements.clear();
		elements.add(capsule1);

		modelExplorerView.revealSemanticElement(elements);
		Object capsule1TreeObject = ((IStructuredSelection) selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Capsule1 TreeElement is null", capsule1TreeObject); //$NON-NLS-1$

		EditingDomain domain = TransactionUtil.getEditingDomain(capsule1);
		ValidateModelCommand validateModelCommand = new ValidateModelCommand(getRootUMLModel(), new UMLDiagnostician());
		domain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(validateModelCommand));

		// check that the constraint exist
		ConstraintRegistry instance = ConstraintRegistry.getInstance();
		IConstraintDescriptor descriptor = instance.getDescriptor(CONSTRAINT_PLUGIN, CONSTRAINT_ID);
		Assert.assertNotNull("Constraint is missing", descriptor);

		Diagnostic globalDiagnostic = validateModelCommand.getDiagnostic();
		List<Diagnostic> findDiagnosticBySource = findDiagnosticBySource(globalDiagnostic, CONSTRAINT_PLUGIN + "." + CONSTRAINT_ID);
		Assert.assertNotNull("Validation should have raised an error", findDiagnosticBySource); //$NON-NLS-1$
		Assert.assertEquals("Validation should have raised an error", 1, findDiagnosticBySource.size()); //$NON-NLS-1$

	}

}
