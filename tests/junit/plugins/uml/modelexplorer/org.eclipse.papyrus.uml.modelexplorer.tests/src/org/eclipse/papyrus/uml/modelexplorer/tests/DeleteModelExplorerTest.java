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
package org.eclipse.papyrus.uml.modelexplorer.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
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
 * 
 * Sample tests for delete in model explorer
 * 
 * @author bmaggi
 *
 */
public class DeleteModelExplorerTest extends AbstractEditorTest {

	public static final String DELETE_COMMAND_ID = "org.eclipse.ui.edit.delete"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "model"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "DeleteEditorTest"; //$NON-NLS-1$	

	public final static String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	public final static String PRIMITIVE_BOOLEAN_NAME = "Boolean"; //$NON-NLS-1$ 
	
	@Before
	public void initModelForCutTest() {
		try {
			initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle()); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}

	/**
	 * A user can not delete the root of a model
	 */
	@Test
	public void deleteRootOfTheModel() throws Exception {

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

		IHandler deleteHandler = HandlerUtils.getActiveHandlerFor(DELETE_COMMAND_ID); //$NON-NLS-1$
		Assert.assertFalse("Delete is available", deleteHandler.isEnabled()); //$NON-NLS-1$
	}


	/**
	 * A user can delete an uml class
	 */
	@Test
	public void deleteClassInTheModel() throws Exception {

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

		//get Item for class1
		Model model = (Model)getRootUMLModel();
		org.eclipse.uml2.uml.Class class1 = (org.eclipse.uml2.uml.Class)model.getPackagedElement(CLASS1_NAME);

		elements.clear();
		elements.add(class1);
		modelExplorerView.revealSemanticElement(elements);
		Object class1TreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", class1TreeObject); //$NON-NLS-1$

		IHandler deleteHandler = HandlerUtils.getActiveHandlerFor(DELETE_COMMAND_ID); //$NON-NLS-1$
		Assert.assertTrue("Delete is not available on a class", deleteHandler.isEnabled()); //$NON-NLS-1$
		deleteHandler.execute(new ExecutionEvent());

		org.eclipse.uml2.uml.Class deletedClass1 = (org.eclipse.uml2.uml.Class)getRootUMLModel().getPackagedElement(CLASS1_NAME);
		Assert.assertNull("The class is still present", deletedClass1); //$NON-NLS-1$				

	}


	/**
	 * A user can not delete a read only element
	 */
	@Test
	public void deleteReadOnlyElement() throws Exception {

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
		Assert.assertNotNull("Boolean Primitive TreeElement is null", treeObject); //$NON-NLS-1$

		IHandler deleteHandler = HandlerUtils.getActiveHandlerFor(DELETE_COMMAND_ID);
		Assert.assertFalse("Delete is available on a readonly element (Boolean Primitive)", deleteHandler.isEnabled()); //$NON-NLS-1$			
	}

}
