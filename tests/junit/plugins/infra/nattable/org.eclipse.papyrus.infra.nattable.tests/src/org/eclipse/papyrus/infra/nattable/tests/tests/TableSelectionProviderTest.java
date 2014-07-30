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
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.tests.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.print.command.TurnViewportOffCommand;
import org.eclipse.nebula.widgets.nattable.print.command.TurnViewportOnCommand;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectCellCommand;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowsCommand;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.tests.Activator;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * 
 * @author VL222926
 * 
 *         This class tests the selection provider of the table
 * 
 */
public class TableSelectionProviderTest extends AbstractEditorTest {

	//TODO : this class could be refactored with other class tests used for table (reveal semantic element)
	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Table table;

	protected Model root;


	private INattableModelManager tableManager;

	private NatTable nattable;

	private NamedElement class1;

	//	private NamedElement class2;

	private Package _package;

	private NamedElement nestedClass1;

	private NamedElement nestedClass2;

	/**
	 * 
	 * Constructor.
	 * This plugin test the ModelExplorerView
	 */
	public TableSelectionProviderTest() {
		super();
	}


	private String modelRoot = "model";

	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel("testSelectionProvider", "model", getBundle());
		} catch (Exception e) {
			e.printStackTrace();
		}

		ResourceSet set = null;
		try {
			set = getModelSet();
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
		final List<Resource> resources = set.getResources();

		final StringBuffer model_uml = new StringBuffer(this.modelRoot);
		model_uml.append(".");
		model_uml.append(UmlModel.UML_FILE_EXTENSION);
		final StringBuffer model_notation = new StringBuffer(this.modelRoot);
		model_notation.append(".");
		model_notation.append(NotationModel.NOTATION_FILE_EXTENSION);
		final StringBuffer model_di = new StringBuffer(this.modelRoot);
		model_di.append(".");
		model_di.append(DiModel.DI_FILE_EXTENSION);
		for(Resource current : resources) {
			if(current.getURI().lastSegment().equals(model_uml.toString())) {
				this.uml = current;
			} else if(current.getURI().lastSegment().equals(model_notation.toString())) {
				this.notation = current;
			} else if(current.getURI().lastSegment().equals(model_di.toString())) {
				this.di = current;
			}


		}
		this.table = (Table)this.notation.getAllContents().next();
		this.root = (Model)this.uml.getContents().get(0);

		this.tableManager = (INattableModelManager)this.editor.getAdapter(INattableModelManager.class);
		this.nattable = (NatTable)((IAdaptable)this.tableManager).getAdapter(NatTable.class);

		this.class1 = this.root.getMember("Class1");
		//		this.class2 = this.root.getMember("Class2");
		this._package = (Package)this.root.getMember("Package");
		this.nestedClass1 = this._package.getMember("NestedClass1");
		this.nestedClass2 = this._package.getMember("NestedClass2");
	}


	/**
	 * test the selection of a single row
	 */
	@Test
	public void testRowSelection() {
		SelectionLayer selectionLayer = this.tableManager.getBodyLayerStack().getSelectionLayer();
		selectionLayer.clear();
		Assert.assertTrue(getCurrentSelection().isEmpty());
		this.nattable.doCommand(new TurnViewportOffCommand());
		this.nattable.doCommand(new SelectRowsCommand(this.nattable, 2, 3, false, false));//select the row representing class1
		this.nattable.doCommand(new TurnViewportOnCommand());
		final List<Object> wantedSelection = new ArrayList<Object>();
		wantedSelection.add(this.class1);
		verifyCurrentSelection(wantedSelection);
	}

	/**
	 * Test the selection of several rows
	 */
	@Test
	public void test_RowSelectionWithCTRL() {
		SelectionLayer selectionLayer = this.tableManager.getBodyLayerStack().getSelectionLayer();
		selectionLayer.clear();
		Assert.assertTrue(getCurrentSelection().isEmpty());
		Assert.assertTrue(getCurrentSelection().isEmpty());
		this.nattable.doCommand(new TurnViewportOffCommand());
		this.nattable.doCommand(new SelectRowsCommand(this.nattable, 2, 3, false, false));//select the row representing class1
		this.nattable.doCommand(new SelectRowsCommand(this.nattable, 2, 5, false, true));//select the row representing package
		this.nattable.doCommand(new TurnViewportOnCommand());
		final List<Object> wantedSelection = new ArrayList<Object>();
		wantedSelection.add(this._package);
		wantedSelection.add(this.class1);
		verifyCurrentSelection(wantedSelection);
	}

	/**
	 * test the selection of one row, followed by the selection of a cell, with CTRL
	 */
	@Test
	public void test_RowThenCellSelection() {
		SelectionLayer selectionLayer = this.tableManager.getBodyLayerStack().getSelectionLayer();
		selectionLayer.clear();
		Assert.assertTrue(getCurrentSelection().isEmpty());
		this.nattable.doCommand(new TurnViewportOffCommand());
		this.nattable.doCommand(new SelectRowsCommand(this.nattable, 2, 3, false, false));//select the row representing class1
		this.nattable.doCommand(new SelectCellCommand(this.nattable, 5, 5, false, true));//select the cell package/members
		this.nattable.doCommand(new TurnViewportOnCommand());
		final List<Object> wantedSelection = new ArrayList<Object>();
		wantedSelection.add(this.class1);
		wantedSelection.add(this.nestedClass1);
		wantedSelection.add(this.nestedClass2);
		verifyCurrentSelection(wantedSelection);
	}

	/**
	 * test the selection of one cell, followed by the selection of one row, with CTRL
	 */
	@Test
	public void test_CellThenRowSelection() {
		SelectionLayer selectionLayer = this.tableManager.getBodyLayerStack().getSelectionLayer();
		selectionLayer.clear();
		Assert.assertTrue(getCurrentSelection().isEmpty());
		this.nattable.doCommand(new TurnViewportOffCommand());
		this.nattable.doCommand(new SelectCellCommand(this.nattable, 5, 5, false, false));//select the cell package/members
		this.nattable.doCommand(new SelectRowsCommand(this.nattable, 2, 3, false, true));//select the row representing class1
		this.nattable.doCommand(new TurnViewportOnCommand());
		final List<Object> wantedSelection = new ArrayList<Object>();
		wantedSelection.add(this.class1);
		wantedSelection.add(this.nestedClass1);
		wantedSelection.add(this.nestedClass2);
		verifyCurrentSelection(wantedSelection);
	}

	/**
	 * 
	 * @param wantedSelection
	 *        compare the wanted selection and the current selection
	 */
	protected void verifyCurrentSelection(final List<Object> wantedSelection) {
		ISelection selection = getCurrentSelection();
		if(selection instanceof IStructuredSelection) {
			List<?> currentSelection = ((IStructuredSelection)selection).toList();
			Assert.assertEquals(wantedSelection.size(), currentSelection.size());
			for(Object current : currentSelection) {
				Assert.assertTrue(wantedSelection.contains(current));
			}
		}
	}

	/**
	 * 
	 * @return
	 *         the current eclipse selection
	 */
	protected ISelection getCurrentSelection() {
		return getSelectionService().getSelection();
	}

	/**
	 * 
	 * @return
	 *         the selection service
	 */
	protected ISelectionService getSelectionService() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
	}



	/**
	 * 
	 * @see org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest#getBundle()
	 * 
	 * @return
	 */
	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest#getSourcePath()
	 * 
	 * @return
	 */
	@Override
	protected String getSourcePath() {
		return "resources/";
	}
}
