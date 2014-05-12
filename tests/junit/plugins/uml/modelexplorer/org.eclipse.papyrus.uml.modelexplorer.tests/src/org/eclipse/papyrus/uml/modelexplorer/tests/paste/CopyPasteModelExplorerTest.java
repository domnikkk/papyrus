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
package org.eclipse.papyrus.uml.modelexplorer.tests.paste;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.Activator;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
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
public class CopyPasteModelExplorerTest extends AbstractEditorTest {

	public static final String COPY_COMMAND_ID = "org.eclipse.ui.edit.copy"; //$NON-NLS-1$

	public static final String PASTE_COMMAND_ID = "org.eclipse.ui.edit.paste"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "model"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "copyPasteTest"; //$NON-NLS-1$

	public final static String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	public final static String CLASS2_NAME = "Class2"; //$NON-NLS-1$

	@Before
	public void initModelForCutTest() {
		try {
			initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle()); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}


	/**
	 * Simple copy paste of a class1
	 * 
	 * @throws Exception
	 */
	@Test
	public void copyPasteofClass1Test() throws Exception {
		//get the rootModel
		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		//get all semantic elment that will handled
		Model model = (Model)getRootUMLModel();

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();
		List<Object> elements = new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		org.eclipse.uml2.uml.Class class1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);
		elements.clear();
		elements.add(class1);
		modelExplorerView.revealSemanticElement(elements);
		EObject class1TreeObject = (EObject)((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", class1TreeObject); //$NON-NLS-1$

		IHandler copyHandler = HandlerUtils.getActiveHandlerFor(COPY_COMMAND_ID);
		Assert.assertTrue("Copy not available", copyHandler.isEnabled()); //$NON-NLS-1$
		copyHandler.execute(new ExecutionEvent());

		// select root

		elements.clear();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		// paste
		IHandler pasteHandler = HandlerUtils.getActiveHandlerFor(PASTE_COMMAND_ID);
		Assert.assertTrue("Paste not available", pasteHandler.isEnabled()); //$NON-NLS-1$
		pasteHandler.execute(new ExecutionEvent());

		// check that there is a Class1 
		org.eclipse.uml2.uml.Class copyOfClass1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(NamedElementUtil.COPY_OF + "_" + CLASS1_NAME + "_1");
		Assert.assertNotNull("The copy is missing", copyOfClass1); //$NON-NLS-1$			
	}


	/**
	 * Simple copy pasteof class1 & class2 test.
	 */
	@Test
	public void copyPasteofClass1And2Test() throws Exception {

		//get the rootModel
		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		//get all semantic elment that will handled
		Model model = (Model)getRootUMLModel();

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();
		List<Object> elements = new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		org.eclipse.uml2.uml.Class class1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);
		org.eclipse.uml2.uml.Class class2 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS2_NAME);
		elements.clear();
		elements.add(class1);
		elements.add(class2);
		modelExplorerView.revealSemanticElement(elements);
		EObject class1TreeObject = (EObject)((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", class1TreeObject); //$NON-NLS-1$

		EObject class2TreeObject = (EObject)((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class2 TreeElement is null", class2TreeObject); //$NON-NLS-1$		

		IHandler copyHandler = HandlerUtils.getActiveHandlerFor(COPY_COMMAND_ID);
		Assert.assertTrue("Copy not available", copyHandler.isEnabled()); //$NON-NLS-1$
		copyHandler.execute(new ExecutionEvent());

		// select root
		elements.clear();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		// paste
		IHandler pasteHandler = HandlerUtils.getActiveHandlerFor(PASTE_COMMAND_ID);
		Assert.assertTrue("Paste not available", pasteHandler.isEnabled()); //$NON-NLS-1$
		pasteHandler.execute(new ExecutionEvent());

		// check that there is a Class1 
		org.eclipse.uml2.uml.Class copyOfClass1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(NamedElementUtil.COPY_OF + "_" + CLASS1_NAME + "_1");
		Assert.assertNotNull("The class1 copy is missing", copyOfClass1); //$NON-NLS-1$	

		org.eclipse.uml2.uml.Class copyOfClass2 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(NamedElementUtil.COPY_OF + "_" + CLASS2_NAME + "_1");
		Assert.assertNotNull("The class2 copy is missing", copyOfClass2); //$NON-NLS-1$			
	}

}
