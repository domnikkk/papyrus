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
import java.util.Collection;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.junit.utils.DiagramUtils;
import org.eclipse.papyrus.junit.utils.HandlerUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.Activator;
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
public class DiagramCopyPasteModelExplorerTest extends AbstractEditorTest {

	public static final String COPY_COMMAND_ID = "org.eclipse.ui.edit.copy"; //$NON-NLS-1$

	public static final String PASTE_COMMAND_ID = "org.eclipse.ui.edit.paste"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "model"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "copyPasteTest"; //$NON-NLS-1$

	public final static String CLASS_DIAGRAM_NAME = "NewDiagram"; //$NON-NLS-1$

	public final static String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	@Before
	public void initModelForCutTest() {
		try {
			initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle());
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}


	/**
	 * here the purpose is to test the creation of constraint on variable elements.
	 */
	@Test
	public void copyPasteDiagramTest() throws Exception {

		//get the rootModel
		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
	
		Collection<Diagram> allNotationDiagram = DiagramUtils.getAllNotationDiagram(getModelSet(), CLASS_DIAGRAM_NAME);
		Assert.assertNotNull("No diagrams for copy", allNotationDiagram); //$NON-NLS-1$
		Assert.assertEquals("Diagram to copy is missing", 1, allNotationDiagram.size()); //$NON-NLS-1$		
		
		
		//get all semantic elment that will handled
		Model model=(Model) getRootUMLModel();
		org.eclipse.uml2.uml.Class class1=(org.eclipse.uml2.uml.Class) model.getPackagedElement(CLASS1_NAME);
		Diagram diagram1=(Diagram)getPageManager().allPages().get(0);
		Assert.assertEquals("Wrong diagram selected", CLASS_DIAGRAM_NAME, diagram1.getName()); //$NON-NLS-1$		

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
		modelExplorerView=getModelExplorerView();
		modelExplorerView.setFocus();
		ArrayList<Object>elements= new ArrayList<Object>();
		elements.add(getRootUMLModel());
		modelExplorerView.revealSemanticElement( elements);


		//getItem for model
		Object modelTreeObject=((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Model TreeElement is null", modelTreeObject); //$NON-NLS-1$

		// FIXME : this is required otherwise diagram1TreeObject is empty (something wrong in the revealSemantic on Diagrams)
		//get Item for class1
		elements.clear();
		elements.add(class1);
		modelExplorerView.revealSemanticElement( elements);
		Object class1TreeObject=((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", class1TreeObject); //$NON-NLS-1$

	
		//get Item for diagram1
		elements.clear();
		elements.add(diagram1);
		modelExplorerView.revealSemanticElement( elements);
		Object diagram1TreeObject=((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("diagram1 TreeElement is null", diagram1TreeObject); //$NON-NLS-1$

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

		allNotationDiagram = DiagramUtils.getAllNotationDiagram(getModelSet(), CLASS_DIAGRAM_NAME);
		Assert.assertEquals("Duplicate Diagram is missing", 2, allNotationDiagram.size());
	}	

}
