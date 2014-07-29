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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.nattable.allocation.tests.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.sysml.allocations.Allocate;
import org.eclipse.papyrus.sysml.nattable.allocation.tests.Activator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;


public class RevealAllocationTableTest extends AbstractEditorTest {

	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Model rootModel;

	protected List<Abstraction> elementListTest;

	protected Package packageTest;

	protected Allocate allocateTest;

	protected Abstraction allocateAbstraction;


	/**
	 * 
	 * Constructor.
	 * This plugin test the ModelExplorerView
	 */
	public RevealAllocationTableTest() {
		super();
	}

	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel("RevealRequirementTableTest", "modelSysMLRequirement", getBundle()); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			e.printStackTrace();
		}

		ResourceSet set = null;
		try {
			set = getModelSet();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		List<Resource> resources = set.getResources();

		for(Resource current : resources) {
			if(current.getURI().lastSegment().equals("modelSysMLRequirement.uml")) { //$NON-NLS-1$
				this.uml = current;
			} else if(current.getURI().lastSegment().equals("modelSysMLRequirement.notation")) { //$NON-NLS-1$
				this.notation = current;
			} else if(current.getURI().lastSegment().equals("modelSysMLRequirement.di")) { //$NON-NLS-1$
				this.di = current;
			}
		}

		this.rootModel = (Model)this.uml.getContents().get(0);
	}


	/**
	 * select an element from the model and seek it in the allocation table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	public void test1SelectElement() {
		// select the element
		this.allocateTest = (Allocate)this.uml.getContents().get(6);
		this.allocateAbstraction = this.allocateTest.getBase_Abstraction();

		// select the page, corresponding to the requirement table used to test the behavior, in the multidiagram view
		selectTablePage(5);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		// verify that the axis is not inverted
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(this.editor.getActiveEditor() instanceof NavigationTarget);
		// spoofs the behavior when the link with editor button is activated
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.allocateAbstraction);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		// verify that the same element has been selected on both sides
		Assert.assertTrue("failed to match the selection with: " + this.allocateAbstraction, this.allocateAbstraction.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		// verify that the line selected is indeed the line corresponding to the element selected in the model explorer
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 0); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}


	/**
	 * select an element from the model and seek it in the allocation table that has had its axis inverted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	public void test2SelectElementInvertAxis() {
		this.allocateTest = (Allocate)this.uml.getContents().get(6);
		this.allocateAbstraction = this.allocateTest.getBase_Abstraction();

		selectTablePage(5);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(this.editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.allocateAbstraction);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.allocateAbstraction, this.allocateAbstraction.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 0); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

	}


	/**
	 * select multiple elements from the model and seek them in the allocation table,
	 * then proceed to check that their rows have been correctly selected and that none of the columns are
	 */
	@Test
	public void test3SelectMultipleElements() {

		this.elementListTest = buildList();

		selectTablePage(5);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(this.editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			Assert.assertTrue("failed to match the selection", this.elementListTest.contains(currentRealObject)); //$NON-NLS-1$
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", rowSelectedPositions.length == 3); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 1); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 2); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[2] == 0); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}


	/**
	 * select multiple elements from the model and seek them in the allocation table that has had its axis inverted,
	 * then proceed to check that their columns have been correctly selected and that none of the rows are
	 */
	@Test
	public void test4SelectMultipleElementsInvertAxis() {

		this.elementListTest = buildList();

		selectTablePage(5);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(this.editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			Assert.assertTrue("failed to match the selection", this.elementListTest.contains(currentRealObject)); //$NON-NLS-1$
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", columnSelectedPositions.length == 3); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", columnSelectedPositions[0] == 0); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", columnSelectedPositions[1] == 1); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", columnSelectedPositions[2] == 2); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

	}


	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected String getSourcePath() {
		return "resources/"; //$NON-NLS-1$
	}

	protected void selectTablePage(int index) {
		try {
			Object tablePage = getPageManager().allPages().get(index);
			//			getPageManager().closeAllOpenedPages();
			//			getPageManager().openPage(tablePage);
			getPageManager().selectPage(tablePage);
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
	}

	protected List<Abstraction> buildList() {
		List<Abstraction> listAbs = new ArrayList<Abstraction>();
		this.allocateTest = (Allocate)this.uml.getContents().get(6);
		this.allocateAbstraction = this.allocateTest.getBase_Abstraction();
		listAbs.add(this.allocateAbstraction);
		this.allocateTest = (Allocate)this.uml.getContents().get(7);
		this.allocateAbstraction = this.allocateTest.getBase_Abstraction();
		listAbs.add(this.allocateAbstraction);
		this.allocateTest = (Allocate)this.uml.getContents().get(8);
		this.allocateAbstraction = this.allocateTest.getBase_Abstraction();
		listAbs.add(this.allocateAbstraction);

		return listAbs;
	}

}
