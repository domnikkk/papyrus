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
package org.eclipse.papyrus.sysml.nattable.requirement.tests.tests;

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
import org.eclipse.papyrus.sysml.nattable.requirement.tests.Activator;
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


public class RevealRequirementTableTest extends AbstractEditorTest {

	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Model rootModel;

	protected Class classTest;

	protected List<?> elementListTest;

	protected Package packageTest;

	private List<?> root;

	private Object diagramTest;


	/**
	 * 
	 * Constructor.
	 * This plugin test the ModelExplorerView
	 */
	public RevealRequirementTableTest() {
		super();
	}

	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel("revealSemanticModel", "revealSemanticModel", getBundle());
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
			if(current.getURI().lastSegment().equals("revealSemanticModel.uml")) {
				uml = current;
			} else if(current.getURI().lastSegment().equals("revealSemanticModel.notation")) {
				notation = current;
			} else if(current.getURI().lastSegment().equals("revealSemanticModel.di")) {
				di = current;
			}
		}

		rootModel = (Model)uml.getContents().get(0);
		root = notation.getContents();
		//TODO on luna : open diagram
	}


	/**
	 * select an element from the model explorer and seek it in the requirement table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	public void test1SelectElement() {
		// select the element
		diagramTest = root.get(0);
		// select the page, corresponding to the requirement table used to test the behavior, in the multidiagram view
		selectTablePage(3);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		// verify that the axis is not inverted
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		// spoofs the behavior when the link with editor button is activated
		((NavigationTarget)editor.getActiveEditor()).revealElement(diagramTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		// verify that the same element has been selected on both sides
		Assert.assertTrue("failed to match the selection with: " + diagramTest, diagramTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		// verify that the line selected is indeed the line corresponding to the element selected in the model explorer
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 0);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);

	}


	/**
	 * select an element from the model explorer and seek it in the requirement table which has had its axis inverted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	public void test2SelectElementInvertAxis() {
		diagramTest = root.get(0);
		selectTablePage(3);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(diagramTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + diagramTest, diagramTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 0);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);

	}


	/**
	 * select an element from the model explorer and seek it in the requirement table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	public void test3SelectElement() {
		classTest = (Class)rootModel.allOwnedElements().get(4);
		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(classTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + classTest, classTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 0);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);

	}


	/**
	 * select an element from the model explorer and seek it in the requirement table which has had its axis inverted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	public void test4SelectElementInvertAxis() {
		classTest = (Class)rootModel.allOwnedElements().get(4);
		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(classTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + classTest, classTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 0);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);

	}


	/**
	 * select multiple elements from the model explorer and seek them in the requirement table,
	 * then proceed to check that their rows have been correctly selected and that none of the columns are
	 */
	@Test
	public void test5SelectMultipleElements() {
		elementListTest = rootModel.allOwnedElements().get(2).getOwnedElements().subList(0, 3);

		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			// the requirement object is a class with the requirement stereotype applied to it, and we only need to verify that those are indeed selected
			if(currentRealObject instanceof Class) {
				Assert.assertTrue("failed to match the selection", elementListTest.contains(currentRealObject));
			}
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", rowSelectedPositions.length == 2);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 1);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 0);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);

	}


	/**
	 * select all elements of the table from the model explorer and seek them in the requirement table,
	 * then proceed to check the behavior of the selection
	 */
	@Test
	public void test5SelectMultipleElementsAllLines() {
		elementListTest = rootModel.allOwnedElements().get(2).getOwnedElements();

		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			// the requirement object is a class with the requirement stereotype applied to it, and we only need to verify that those are indeed selected
			if(currentRealObject instanceof Class) {
				Assert.assertTrue("failed to match the selection", elementListTest.contains(currentRealObject));
			}
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", rowSelectedPositions.length == 3);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 1);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 2);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[2] == 0);
		// the test directly under fails because having selected both elements we have selected every row elements in the table,
		// 	therefore all the columns are also considered selected (Ctrl + A behavior) and it befalls the user to know if he wanted to select rows or cells
		//				Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 4);

	}


	/**
	 * select multiple elements from the model explorer and seek them in the requirement table which axis has been inverted,
	 * then proceed to check that their columns have been correctly selected and that none of the rows are
	 */
	@Test
	public void test6SelectMultipleElementsInvertAxis() {
		elementListTest = rootModel.allOwnedElements().get(2).getOwnedElements().subList(0, 3);

		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			// the requirement object is a class with the requirement stereotype applied to it, and we only need to verify that those are indeed selected
			if(currentRealObject instanceof Class) {
				Assert.assertTrue("failed to match the selection", elementListTest.contains(currentRealObject));
			}
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", columnSelectedPositions.length == 2);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[0] == 0);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[1] == 1);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);

	}


	/**
	 * select all elements of the table from the model explorer and seek them in the requirement table,
	 * then proceed to check the behavior of the selection
	 */
	@Test
	public void test6SelectMultipleElementsInvertAxisAllColumns() {
		elementListTest = rootModel.allOwnedElements().get(2).getOwnedElements();

		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}

		Assert.assertTrue(editor.getActiveEditor() instanceof NavigationTarget);
		((NavigationTarget)editor.getActiveEditor()).revealElement(elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			// the requirement object is a class with the requirement stereotype applied to it, and we only need to verify that those are indeed selected
			if(currentRealObject instanceof Class) {
				Assert.assertTrue("failed to match the selection", elementListTest.contains(currentRealObject));
			}
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", columnSelectedPositions.length == 3);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[0] == 0);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[1] == 1);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[2] == 2);
		// the test directly under fails because having selected both elements we have selected every row elements in the table, 
		// 	therefore all the rows are also considered selected (Ctrl + A behavior) and it befalls the user to know if he wanted to select columns or cells
		//				Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 4);

	}



	/**
	 * select an element from the model and seek it in the sorted requirement table,
	 * then proceed to check that its row has been correctly selected and that none of the columns are
	 */
	@Test
	@Ignore
	// sort is not yet supported by the requirement tables
	public void test7SelectSortedElement() {
		this.classTest = (Class)this.rootModel.allOwnedElements().get(4);
		selectTablePage(4);
		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortRowsByName(true);

		Assert.assertTrue(editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(Collections.singletonList(this.classTest));
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.classTest, this.classTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + rowSelectedPositions[0], rowSelectedPositions[0] == 1);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);

	}


	/**
	 * select an element from the model and seek it in the requirement table that has had its axis inverted,
	 * then proceed to check that its column has been correctly selected and that none of the rows are
	 */
	@Test
	@Ignore
	// sort is not yet supported by the requirement tables
	public void test8SelectSortedElementInvertAxis() {
		this.classTest = (Class)this.rootModel.allOwnedElements().get(4);
		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(!manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortColumnsByName(true);

		Assert.assertTrue(editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(Collections.singletonList(this.classTest));
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object currentAxisObject = ((IStructuredSelection)selection).getFirstElement();
		Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
		Assert.assertTrue("failed to match the selection with: " + this.classTest, this.classTest.equals(currentRealObject));

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();
		Assert.assertTrue("index of row does not match: " + columnSelectedPositions[0], columnSelectedPositions[0] == 0);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);

	}


	/**
	 * select multiple elements from the model and seek them in the requirement table,
	 * then proceed to check that their rows have been correctly selected and that none of the columns are
	 */
	@Test
	@Ignore
	// sort is not yet supported by the requirement tables
	public void test9SelectSortedMultipleElements() {
		this.elementListTest = this.rootModel.allOwnedElements().get(2).getOwnedElements();
		selectTablePage(4);

		INattableModelManager manager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		if(manager.getTable().isInvertAxis()) {
			manager.invertAxis();
		}
		manager.sortRowsByName(true);

		Assert.assertTrue(editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(this.elementListTest);
		ISelectionService serv = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		final ISelection selection = serv.getSelection();

		Assert.assertTrue(selection instanceof IStructuredSelection);
		List<?> selectedRowElements = ((IStructuredSelection)selection).toList();
		for(int index = 0; index < selectedRowElements.size(); index++) {
			Object currentAxisObject = selectedRowElements.get(index);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			Assert.assertTrue("failed to match the selection", this.elementListTest.contains(currentRealObject));
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", rowSelectedPositions.length == 2);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[0] == 1);
		Assert.assertTrue("index of row does not match", rowSelectedPositions[1] == 0);
		// the test directly under fails because having selected both elements we have selected every row elements in the table,
		// 	therefore all the columns are also considered selected (Ctrl + A behavior)
		//				Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 0);
		Assert.assertTrue("number of selected columns does not match: " + columnSelectedPositions.length, columnSelectedPositions.length == 4);

	}


	/**
	 * select multiple elements from the model and seek them in the requirement table that has had its axis inverted,
	 * then proceed to check that their columns have been correctly selected and that none of the rows are
	 */
	@Test
	@Ignore
	// sort is not yet supported by the requirement tables
	public void test10SelectSortedMultipleElementsInvertAxis() {
		this.elementListTest = this.rootModel.allOwnedElements().get(2).getOwnedElements();
		selectTablePage(4);

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
			Assert.assertTrue("failed to match the selection", this.elementListTest.contains(currentRealObject));
		}

		SelectionLayer layer = manager.getBodyLayerStack().getSelectionLayer();
		int[] rowSelectedPositions = layer.getFullySelectedRowPositions();
		int[] columnSelectedPositions = layer.getFullySelectedColumnPositions();

		Assert.assertTrue("index of row does not match", columnSelectedPositions.length == 2);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[0] == 0);
		Assert.assertTrue("index of row does not match", columnSelectedPositions[1] == 1);
		// the test directly under fails because having selected both elements we have selected every column elements in the table, 
		// 	therefore all the rows are also considered selected (Ctrl + A behavior)
		//				Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 0);
		Assert.assertTrue("number of selected columns does not match: " + rowSelectedPositions.length, rowSelectedPositions.length == 4);

	}


	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected String getSourcePath() {
		return "resources/";
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
