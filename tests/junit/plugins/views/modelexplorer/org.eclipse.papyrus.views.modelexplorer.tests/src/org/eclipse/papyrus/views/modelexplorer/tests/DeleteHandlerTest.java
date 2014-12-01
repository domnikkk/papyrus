/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 450146
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.tools.util.WorkbenchPartHelper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.navigator.CommonViewer;
import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * This plugin tests the activation of the correct handler for
 * differents selection in the ModelExplorer
 * 
 * @author Vincent Lorenzo
 */
@PluginResource("/resources/deleteHandlerTest/model.di")
public class DeleteHandlerTest extends AbstractHandlerTest {

	/**
	 * the id of the delete command
	 */
	private static final String DELETE_COMMAND_ID = "org.eclipse.ui.edit.delete"; //$NON-NLS-1$

	/**
	 * 
	 * Constructor.
	 * 
	 */
	public DeleteHandlerTest() {
		super(DeleteHandlerTest.DELETE_COMMAND_ID, Activator.getDefault().getBundle());
	}


	/**
	 * We test the delete on the diagrams
	 * 
	 * @throws Exception
	 */
	@Test
	public void deleteDiagramTest() throws Exception {
		List<Diagram> modelDiagrams = getDiagrams();
		int amountBeforeDeletion = modelDiagrams.size();

		selectElementInTheModelexplorer(modelDiagrams.get(0));
		IHandler handler = getActiveHandler();
		handler.execute((new ExecutionEvent(testedCommand, Collections.EMPTY_MAP, null, null)));

		modelDiagrams = getDiagrams();

		Assert.assertEquals("The deletion of a diagram has no effect", amountBeforeDeletion - 1, modelDiagrams.size()); // $NON-NLS-1$

		TransactionalEditingDomain domain = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(getRootOfTheModel());

		domain.getCommandStack().undo();
		modelDiagrams = getDiagrams();
		Assert.assertEquals("The undo after the deletion of a diagram has no effect", amountBeforeDeletion, modelDiagrams.size()); // $NON-NLS-1$

		domain.getCommandStack().redo();
		modelDiagrams = getDiagrams();
		Assert.assertEquals("The redo after the deletion of a diagram has no effect", amountBeforeDeletion - 1, modelDiagrams.size()); // $NON-NLS-1$

		domain.getCommandStack().undo();
		modelDiagrams = getDiagrams();
		Assert.assertEquals("The undo after the deletion of a diagram has no effect", amountBeforeDeletion, modelDiagrams.size()); // $NON-NLS-1$

		domain.getCommandStack().redo();
		modelDiagrams = getDiagrams();
		Assert.assertEquals("The redo after the deletion of a diagram has no effect", amountBeforeDeletion - 1, modelDiagrams.size()); // $NON-NLS-1$
	}

	/**
	 * We test the delete on the table.
	 * 
	 * @throws Exception
	 */
	@Test
	public void deleteTableTest() throws Exception {
		List<Table> modelTables = getTables();
		int amountBeforeDeletion = modelTables.size();

		selectElementInTheModelexplorer(modelTables.get(0));
		IHandler handler = getActiveHandler();
		handler.execute((new ExecutionEvent(testedCommand, Collections.EMPTY_MAP, null, null)));

		modelTables = getTables();

		Assert.assertEquals("The deletion of a table has no effect", amountBeforeDeletion - 1, modelTables.size()); //$NON-NLS-1$

		TransactionalEditingDomain domain = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(getRootOfTheModel());

		domain.getCommandStack().undo();
		modelTables = getTables();
		Assert.assertEquals("The undo after the deletion of a table has no effect", amountBeforeDeletion, modelTables.size()); //$NON-NLS-1$

		domain.getCommandStack().redo();
		modelTables = getTables();
		Assert.assertEquals("The redo after the deletion of a table has no effect", amountBeforeDeletion - 1, modelTables.size()); //$NON-NLS-1$

		domain.getCommandStack().undo();
		modelTables = getTables();
		Assert.assertEquals("The undo after the deletion of a table has no effect", amountBeforeDeletion, modelTables.size()); //$NON-NLS-1$

		domain.getCommandStack().redo();
		modelTables = getTables();
		Assert.assertEquals("The redo after the deletion of a table has no effect", amountBeforeDeletion - 1, modelTables.size()); //$NON-NLS-1$

	}

	/**
	 * We test if we can delete the root of the Model or not
	 */
	@Test
	public void deleteRootOfTheModel() {
		final List<EObject> selectedElement = new ArrayList<EObject>();
		selectedElement.add(getRootOfTheModel());
		getModelExplorerView().revealSemanticElement(selectedElement);

		IWorkbenchPart activePart = WorkbenchPartHelper.getCurrentActiveWorkbenchPart();
		Assert.assertNotNull("The active part could not be retrieved.", activePart); //$NON-NLS-1$
		Assert.assertTrue("The active part is not the ModelExplorer", activePart instanceof ModelExplorerPageBookView); //$NON-NLS-1$

		final IStructuredSelection currentSelection = getCurrentSelection();
		Assert.assertEquals("Only one element should be selected", currentSelection.size(), 1); //$NON-NLS-1$
		Object obj = currentSelection.getFirstElement();
		obj = EMFHelper.getEObject(obj);
		Assert.assertSame(getRootOfTheModel(), obj);
		final IHandler currentHandler = getActiveHandler();
		if (currentHandler == null) {
			// not a problem in this case
		} else {
			Assert.assertFalse("We can delete the root of the model. It is not the wanted behavior", currentHandler.isEnabled()); //$NON-NLS-1$
		}
	}

	@Test
	public void deleteLinkItemTest() {
		final CommonViewer commonViewer = getCommonViewer();

		RunnableWithResult<Object[]> runnable;
		Display.getDefault().syncExec(runnable = new RunnableWithResult.Impl<Object[]>() {

			public void run() {
				commonViewer.expandToLevel(3);
				setResult(commonViewer.getExpandedElements());
				setStatus(Status.OK_STATUS);
			}
		});

		final Object[] expandedElement = runnable.getResult();
		for (final Object object : expandedElement) {
			if (object instanceof EStructuralFeatureTreeElement) {
				selectElementInTheModelexplorer((EStructuralFeatureTreeElement) object);
				final IHandler handler = getActiveHandler();
				if (handler != null) {
					Assert.assertFalse("The handler " + handler + " is active on LinkItem, it is not the wanted behavior", handler.isEnabled()); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}
	}
}
