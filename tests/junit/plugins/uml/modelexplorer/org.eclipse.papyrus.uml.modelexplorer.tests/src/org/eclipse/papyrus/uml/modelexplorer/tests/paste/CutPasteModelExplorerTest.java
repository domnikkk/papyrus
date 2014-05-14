/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434133
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.modelexplorer.tests.paste;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.Activator;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Sample test for cut in model explorer
 * 
 * @author bmaggi
 */
public class CutPasteModelExplorerTest extends AbstractEditorTest {

	public static final String PASTE_COMMAND_ID = "org.eclipse.ui.edit.paste"; //$NON-NLS-1$

	public static final String CUT_COMMAND_ID = "org.eclipse.ui.edit.cut"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "model"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "cutPasteTest"; //$NON-NLS-1$

	public final static String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	public final static String PRIMITIVE_BOOLEAN_NAME = "Boolean"; //$NON-NLS-1$ 
	
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
	 * A user can not cut the root of a model (Bug 434514)
	 */
	@Test
	public void cutRootOfTheModel() throws Exception {

		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();

		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();
		List<Object> elements = new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		//getItem for model
		Object modelTreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Model TreeElement is null", modelTreeObject); //$NON-NLS-1$		

		IHandler cutHandler = HandlerUtils.getActiveHandlerFor(CUT_COMMAND_ID); //$NON-NLS-1$
		Assert.assertFalse("Cut is available", cutHandler.isEnabled()); //$NON-NLS-1$
	}	
	
	/**
	 * A user can not cut a read only element (Bug 434514)
	 */
	@Test
	public void cutReadOnlyElement() throws Exception {

		Package rootUMLModel = getRootUMLModel();

		Assert.assertNotNull("RootModel is null", rootUMLModel); //$NON-NLS-1$
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();

		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();

		List<Object> elements = new ArrayList<Object>();
		elements.add(rootUMLModel);
		modelExplorerView.revealSemanticElement(elements);

		//getItem for model
		Object modelTreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Model TreeElement is null", modelTreeObject); //$NON-NLS-1$			

		//get read only item
		EList<Package> importedPackages = rootUMLModel.getImportedPackages();
		Package primitiveTypes = importedPackages.get(0);
		PackageableElement packagedElement = primitiveTypes.getPackagedElement(PRIMITIVE_BOOLEAN_NAME);
		
		elements.clear();
		elements.add(packagedElement);
		modelExplorerView.revealSemanticElement(elements);
		Object treeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Boolean Primitive PrimitiveTypes TreeElement is null", treeObject); //$NON-NLS-1$

		IHandler cutHandler = HandlerUtils.getActiveHandlerFor(CUT_COMMAND_ID);
		Assert.assertFalse("Cut is available on a readonly element (Boolean Primitive)", cutHandler.isEnabled()); //$NON-NLS-1$			
	}
	
	
	/**
	 * here the purpose is to test the cut/paste of a class in modelexplorer.
	 */
	@Test
	public void cutClassTest() throws Exception {

		//get the rootModel
		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		//get all semantic elment that will handled
		Model model = (Model)getRootUMLModel();

		org.eclipse.uml2.uml.Class class1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
		modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();
		ArrayList<Object> elements = new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);


		//getItem for model
		Object modelTreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Model TreeElement is null", modelTreeObject); //$NON-NLS-1$

		//get Item for class1
		elements.clear();
		elements.add(class1);
		modelExplorerView.revealSemanticElement(elements);
		Object class1TreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", class1TreeObject); //$NON-NLS-1$


		IHandler cutHandler = HandlerUtils.getActiveHandlerFor(CUT_COMMAND_ID);
		Assert.assertTrue("Copy not available", cutHandler.isEnabled()); //$NON-NLS-1$
		cutHandler.execute(new ExecutionEvent());

		org.eclipse.uml2.uml.Class cutClass1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);
		Assert.assertNull("The cut class is still present", cutClass1); //$NON-NLS-1$		

		elements.clear();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement(elements);

		IHandler pasteHandler = HandlerUtils.getActiveHandlerFor(PASTE_COMMAND_ID);
		Assert.assertTrue("Paste not available", pasteHandler.isEnabled()); //$NON-NLS-1$
		pasteHandler.execute(new ExecutionEvent());

		org.eclipse.uml2.uml.Class firstCopyOfClass1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);
		Assert.assertNotNull("The first copy is missing", firstCopyOfClass1); //$NON-NLS-1$		

		pasteHandler.execute(new ExecutionEvent());

		org.eclipse.uml2.uml.Class secondCopyOfClass1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(NamedElementUtil.COPY_OF + "_" + CLASS1_NAME + "_1");
		Assert.assertNotNull("The copy second is missing", secondCopyOfClass1); //$NON-NLS-1$
	}

}
