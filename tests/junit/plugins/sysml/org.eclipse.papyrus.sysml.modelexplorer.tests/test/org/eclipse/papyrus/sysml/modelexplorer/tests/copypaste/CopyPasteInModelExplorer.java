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
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.modelexplorer.tests.copypaste;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.IStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.PasteStrategyManager;
import org.eclipse.papyrus.sysml.diagram.common.strategy.paste.PartPasteStrategy;
import org.eclipse.papyrus.sysml.modelexplorer.tests.Activator;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Sample test for cut in model explorer
 * 
 * @author bmaggi
 */
public class CopyPasteInModelExplorer extends AbstractEditorTest {

	public static final String COPY_COMMAND_ID = "org.eclipse.ui.edit.copy"; //$NON-NLS-1$

	public static final String PASTE_COMMAND_ID = "org.eclipse.ui.edit.paste"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "model/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "Bug435197"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "NonRegression"; //$NON-NLS-1$

	public final static String BLOCK_NAME = "Block"; //$NON-NLS-1$

	public final static String PORT_NAME = "port"; //$NON-NLS-1$
	
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

	private PartPasteStrategy getPartPasteStrategy() {
		List<IStrategy> allStrategies = PasteStrategyManager.getInstance().getAllActiveStrategies();
		for(IStrategy iStrategy : allStrategies) {
			if (iStrategy instanceof PartPasteStrategy){
				return ( PartPasteStrategy) iStrategy;
			}
		}
		return null;
	}	

	
	/**
	 * Test for Bug435197
	 * @throws Exception
	 */
	@Test
	public void copyPasteofBlockWithPropertyAndNoAssociationTest() throws Exception {

		PartPasteStrategy partPasteStrategy = getPartPasteStrategy();
		Assert.assertNotNull("PartPasteStrategy not present", partPasteStrategy);
		Assert.assertTrue("PartPasteStrategy not active", PasteStrategyManager.getInstance().isActive(partPasteStrategy));
		
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

		org.eclipse.uml2.uml.Class block = (org.eclipse.uml2.uml.Class)model.getPackagedElement(BLOCK_NAME);
		elements.clear();
		elements.add(block);
		modelExplorerView.revealSemanticElement(elements);
		Object blockTreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", blockTreeObject); //$NON-NLS-1$

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

		// check that there is a Block 
		org.eclipse.uml2.uml.Class copyOfBlock = (org.eclipse.uml2.uml.Class)model.getPackagedElement(NamedElementUtil.COPY_OF + "_" + BLOCK_NAME + "_1");
		Assert.assertNotNull("The copy is missing", copyOfBlock); //$NON-NLS-1$			
	}

	
	/**
	 * Test for Bug 436385
	 * @throws Exception
	 */
	@Test
	public void copyPasteofPropertyWithoutAssociationTest() throws Exception {
		
		PartPasteStrategy partPasteStrategy = getPartPasteStrategy();
		Assert.assertNotNull("PartPasteStrategy not present", partPasteStrategy);
		Assert.assertTrue("PartPasteStrategy not active", PasteStrategyManager.getInstance().isActive(partPasteStrategy));
		
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

		org.eclipse.uml2.uml.Class block = (org.eclipse.uml2.uml.Class)model.getPackagedElement(BLOCK_NAME);
		Property port = block.getAttribute(PORT_NAME, null);
		Assert.assertNotNull("There is no port", port); //$NON-NLS-1$
		
		elements.clear();
		elements.add(port);
		modelExplorerView.revealSemanticElement(elements);
		Object blockTreeObject = ((IStructuredSelection)selectionService.getSelection()).getFirstElement();
		Assert.assertNotNull("Class1 TreeElement is null", blockTreeObject); //$NON-NLS-1$

		IHandler copyHandler = HandlerUtils.getActiveHandlerFor(COPY_COMMAND_ID);
		Assert.assertTrue("Copy not available", copyHandler.isEnabled()); //$NON-NLS-1$
		copyHandler.execute(new ExecutionEvent());

		// select the block
		elements.clear();
		elements.add(block);
		modelExplorerView.revealSemanticElement(elements);

		// paste
		IHandler pasteHandler = HandlerUtils.getActiveHandlerFor(PASTE_COMMAND_ID);
		Assert.assertTrue("Paste not available", pasteHandler.isEnabled()); //$NON-NLS-1$
		pasteHandler.execute(new ExecutionEvent());

		// check that there is a Block 
		Property copyOfPort = block.getAttribute(NamedElementUtil.COPY_OF + "_" + PORT_NAME + "_1",null);
		Assert.assertNotNull("The copy is missing", copyOfPort); //$NON-NLS-1$			
	}


	
	
}
