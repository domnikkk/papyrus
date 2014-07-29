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
package org.eclipse.papyrus.uml.nattable.generic.tests.tests;

import java.io.IOException;
import java.util.Collections;
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
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.nattable.generic.tests.Activator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;


public class RevealGenericTableTest extends AbstractEditorTest {

	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Model rootModel;

	protected Class classTest;

	protected List<?> elementListTest;

	protected Package packageTest;


	/**
	 * 
	 * Constructor.
	 * This plugin test the ModelExplorerView
	 */
	public RevealGenericTableTest() {
		super();
	}

	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel("RevealGenericTableTest", "modelUMLClass", getBundle()); //$NON-NLS-1$ //$NON-NLS-2$
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
			if(current.getURI().lastSegment().equals("modelUMLClass.uml")) { //$NON-NLS-1$
				this.uml = current;
			} else if(current.getURI().lastSegment().equals("modelUMLClass.notation")) { //$NON-NLS-1$
				this.notation = current;
			} else if(current.getURI().lastSegment().equals("modelUMLClass.di")) { //$NON-NLS-1$
				this.di = current;
			}
		}

		this.rootModel = (Model)this.uml.getContents().get(0);
	}

	/**
	 * select an element from the model and seek it in the generic table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	public void test1_SelectElement() {
		// select the element
		this.classTest = (Class)this.rootModel.getMember("Class3"); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		// verify that the axis is not inverted
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue("failed to find: " + this.classTest.getName(), this.classTest.getName().equals("Class3")); //$NON-NLS-1$//$NON-NLS-2$

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		// spoofs the behavior when the link with editor button is activated
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.classTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		// verify that the same element has been selected on both sides
		Assert.assertTrue("failed to match the selection with: " + this.classTest.getName(), this.classTest.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		// verify that the line selected is indeed the line corresponding to the element selected in the model explorer
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 7); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}

	/**
	 * select multiple elements from the model and seek them in the generic table,
	 * then proceed to check that their rows have been correctly selected and that none of the columns are
	 */
	@Test
	public void test2_SelectMultipleElements() {
		this.elementListTest = (this.rootModel.getMember("Package1").getOwnedElements()); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
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
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 5); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 2); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[2] == 3); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}

	/**
	 * select an element from the model and seek it in the generic table that has had its axis inverted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	public void test3_SelectElementInvertAxis() {
		this.classTest = (Class)this.rootModel.getMember("Class3"); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue("failed to find: " + this.classTest.getName(), this.classTest.getName().equals("Class3")); //$NON-NLS-1$//$NON-NLS-2$

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.classTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.classTest.getName(), this.classTest.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 7); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

	}

	/**
	 * select multiple elements from the model and seek them in the generic table that has had its axis inverted,
	 * then proceed to check that their columns have been correctly selected and that none of the rows are
	 */
	@Test
	public void test4_SelectMultipleElementsInvertAxis() {
		this.elementListTest = (this.rootModel.getMember("Package1").getOwnedElements()); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
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

		Assert.assertTrue("index of column does not match", columnSelectedPositions.length == 3); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[0] == 2); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[1] == 3); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[2] == 5); //$NON-NLS-1$
		Assert.assertTrue("number of selected rows does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

	}


	/**
	 * select an element from the model and seek it in the sorted generic table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	public void test5_SelectSortedElement() {
		this.classTest = (Class)this.rootModel.getMember("Class3"); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortRowsByName(true);

		Assert.assertTrue("failed to find: " + this.classTest.getName(), this.classTest.getName().equals("Class3")); //$NON-NLS-1$//$NON-NLS-2$

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)this.editor.getActiveEditor()).revealElement(this.classTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.classTest.getName(), this.classTest.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 6); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}

	/**
	 * select multiple elements from the model and seek them in the sorted generic table,
	 * then proceed to check that their rows have been correctly selected and that none of the columns are
	 */
	@Test
	public void test6_SelectMultipleSortedElements() {
		this.elementListTest = (this.rootModel.getMember("Package1").getOwnedElements()); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortRowsByName(true);

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
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
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 2); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 4); //$NON-NLS-1$
		Assert.assertTrue("index of row does not match", rowSelectedPositions[2] == 5); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0); //$NON-NLS-1$

	}


	/**
	 * select an element from the model and seek it in the generic table that has had its axis inverted and its elements sorted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	@Ignore
	// sortColumns/Rows is not yet supported with invertAxis
	public void test7_SelectSortedElementInvertAxis() {
		this.classTest = (Class)this.rootModel.getMember("Class3"); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortColumnsByName(true);

		Assert.assertTrue("failed to find: " + this.classTest.getName(), this.classTest.getName().equals("Class3")); //$NON-NLS-1$//$NON-NLS-2$

		Assert.assertTrue(editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(Collections.singletonList(this.classTest));
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.classTest.getName(), this.classTest.equals(currentRealObject)); //$NON-NLS-1$

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 6); //$NON-NLS-1$
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

	}

	/**
	 * select multiple elements from the model and seek them in the generic table that has had its axis inverted and its elements sorted,
	 * then proceed to check that their columns have been correctly selected and that none of the rows are
	 */
	@Test
	@Ignore
	// sortColumns/Rows is not yet supported with invertAxis
	public void test8_SelectMultipleSortedElementsInvertAxis() {
		this.elementListTest = (this.rootModel.getMember("Package1").getOwnedElements()); //$NON-NLS-1$
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortColumnsByName(true);

		Assert.assertTrue(editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(this.elementListTest);
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

		Assert.assertTrue("index of column does not match", columnSelectedPositions.length == 3); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[0] == 2); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[1] == 4); //$NON-NLS-1$
		Assert.assertTrue("index of column does not match", columnSelectedPositions[2] == 5); //$NON-NLS-1$
		Assert.assertTrue("number of selected rows does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0); //$NON-NLS-1$

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

}
