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
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.papyrus.infra.core.editor.CoreMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.internal.handlers.HandlerProxy;
import org.eclipse.ui.navigator.CommonViewer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.osgi.framework.Bundle;

//TODO a part of this plugin should be moved in an upper test plugin
public abstract class AbstractHandlerTest extends AbstractPapyrusTest {

	/** the id of the model explorer */
	public static final String viewId = "org.eclipse.papyrus.views.modelexplorer.modelexplorer"; //$NON-NLS-1$

	/** all the papyrus diagrams of the model */
	protected List<Diagram> diagrams = new ArrayList<Diagram>();

	/** Papyrus editor fixture. */
	@Rule
	public final PapyrusEditorFixture editorFixture = new PapyrusEditorFixture();

	protected ModelExplorerView modelExplorerView;

	protected Command testedCommand;

	protected CommonViewer commonViewer;

	protected ISelectionService selectionService;

	protected final String commandId;

	protected CoreMultiDiagramEditor editor;

	/**
	 * the bundle to use to get the model to test
	 */
	protected final Bundle bundle;

	/**
	 *
	 * Constructor.
	 *
	 * @param bundle
	 *            the bundle used to load the model
	 */
	public AbstractHandlerTest(Bundle bundle) {
		this(null, bundle);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param commandId
	 *            the id of the command to test
	 */
	public AbstractHandlerTest(String commandId, Bundle bundle) {
		Assert.assertNotNull("Bundle can't be null to do the test.", bundle); //$NON-NLS-1$
		this.commandId = commandId;
		this.bundle = bundle;
	}


	/**
	 * This method tests if the active part is the model explorer
	 */
	protected void testIsModelExplorerActivePart() {
		RunnableWithResult<IWorkbenchPart> activePartRunnable;
		Display.getDefault().syncExec(activePartRunnable = new RunnableWithResult.Impl<IWorkbenchPart>() {

			public void run() {
				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IWorkbenchPart activePart = activePage.getActivePart();
				setResult(activePart);
			}
		});

		Assert.assertTrue("The active part is not the ModelExplorer", activePartRunnable.getResult() instanceof ModelExplorerPageBookView); //$NON-NLS-1$
	}

	/**
	 * This method selects an element in the modelexplorer and test that the new
	 * selection is the wanted selection using assertion
	 *
	 * @param elementToSelect
	 *            the element to select
	 */
	protected void selectElementInTheModelexplorer(EObject elementToSelect) {
		final List<EObject> selectedElement = new ArrayList<EObject>();
		selectedElement.add(elementToSelect);
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				modelExplorerView.revealSemanticElement(selectedElement);
			}
		});

		IStructuredSelection currentSelection = (IStructuredSelection) selectionService.getSelection();
		Assert.assertEquals("Only one element should be selected", 1, currentSelection.size()); //$NON-NLS-1$
		Object obj = currentSelection.getFirstElement();
		obj = EMFHelper.getEObject(obj);
		Assert.assertSame("the current selected element is not the wanted element", elementToSelect, obj); //$NON-NLS-1$
	}

	/**
	 * This method selects an element in the modelexplorer and test that the new
	 * selection is the wanted selection using assertion
	 *
	 * @param elementToSelect
	 *            the element to select
	 */
	protected void selectElementInTheModelexplorer(final TreeElement elementToSelect) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				commonViewer.setSelection(new StructuredSelection(elementToSelect));
			}
		});

		IStructuredSelection currentSelection = (IStructuredSelection) selectionService.getSelection();
		Assert.assertEquals("Only one element should be selected", 1, currentSelection.size()); //$NON-NLS-1$
		Object obj = currentSelection.getFirstElement();
		Assert.assertSame("the current selected element is not the wanted element", elementToSelect, obj); //$NON-NLS-1$
	}

	protected IStructuredSelection getCurrentSelection() {
		return (IStructuredSelection) selectionService.getSelection();
	}

	/**
	 *
	 * @return the current handler for the command
	 */
	protected IHandler getActiveHandler() {
		IHandler currentHandler = testedCommand.getHandler();
		if (currentHandler instanceof HandlerProxy) {
			currentHandler = ((HandlerProxy) currentHandler).getHandler();
		}
		return currentHandler;
	}

	/**
	 * 
	 * @return
	 *         the diagrams owned by the IPageMngr
	 * @throws ServiceException
	 */
	protected List<Diagram> getDiagrams() throws ServiceException {

		IPageManager pageManager = ServiceUtilsForResourceSet.getInstance().getIPageManager(editorFixture.getResourceSet());
		List<Object> pages = pageManager.allPages();
		List<Diagram> diagrams = new ArrayList<Diagram>();
		for (Object current : pages) {
			if (current instanceof Diagram) {
				diagrams.add((Diagram) current);
			}
		}
		return diagrams;
	}

	/**
	 * 
	 * @return
	 *         the diagrams owned by the IPageMngr
	 * @throws ServiceException
	 */
	protected List<Table> getTables() throws ServiceException {

		IPageManager pageManager = ServiceUtilsForResourceSet.getInstance().getIPageManager(editorFixture.getResourceSet());
		List<Object> pages = pageManager.allPages();
		List<Table> diagrams = new ArrayList<Table>();
		for (Object current : pages) {
			if (current instanceof Table) {
				diagrams.add((Table) current);
			}
		}
		return diagrams;
	}

	@Before
	public void initTests() throws CoreException, IOException, ServiceException {

		// we open the editor
		editor = (CoreMultiDiagramEditor) editorFixture.open();

		RunnableWithResult<?> runnable;

		Display.getDefault().syncExec(runnable = new RunnableWithResult.Impl<Object>() {

			public void run() {
				IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				modelExplorerView = editorFixture.getModelExplorerView();
				modelExplorerView.setFocus();

				// we look for the common viewer
				commonViewer = modelExplorerView.getCommonViewer();

				// we look for the selection service
				selectionService = activeWorkbenchWindow.getSelectionService();

				// we look for the testedCommand
				ICommandService commandService = activeWorkbenchWindow.getService(ICommandService.class);
				if (commandId != null) {
					testedCommand = commandService.getCommand(commandId);
				}

				commonViewer.expandToLevel(2);

				List<Customization> appliedCustomizations = org.eclipse.papyrus.views.modelexplorer.Activator.getDefault().getCustomizationManager().getManagedCustomizations();
				Customization facetSimpleUML = null;
				Customization facetPapyrusTable = null;
				Iterator<?> iter = appliedCustomizations.iterator();
				while (iter.hasNext()) {
					Customization custo = (Customization) iter.next();
					if (custo.getName().equals("SimpleUML")) {
						facetSimpleUML = custo;
					} else if (custo.getName().equals("PapyrusTable")) {
						facetPapyrusTable = custo;
					}
				}
				Assert.assertNotNull("Custom SimpleUML not found", facetSimpleUML); //$NON-NLS-1$
				Assert.assertNotNull("Custom PapyrusTable not found", facetPapyrusTable); //$NON-NLS-1$

				org.eclipse.papyrus.views.modelexplorer.Activator.getDefault().getCustomizationManager().getManagedCustomizations().add(0, facetPapyrusTable);
				org.eclipse.papyrus.views.modelexplorer.Activator.getDefault().getCustomizationManager().getManagedCustomizations().add(0, facetSimpleUML);
				;
				setStatus(Status.OK_STATUS);
			}
		});

		Assert.assertEquals(runnable.getStatus().getMessage(), IStatus.OK, runnable.getStatus().getSeverity());
		diagrams = getDiagrams();

	}

	/**
	 *
	 * @return the root of the model
	 */
	public EObject getRootOfTheModel() {
		return editorFixture.getModel();
	}

	/**
	 *
	 * @return the model explorer view
	 */
	public ModelExplorerView getModelExplorerView() {
		return modelExplorerView;
	}

	/**
	 *
	 * @return the common viewer
	 */
	public CommonViewer getCommonViewer() {
		return commonViewer;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return TransactionUtil.getEditingDomain(getRootOfTheModel());
	}

	public CommandStack getCommandStack() {
		return getEditingDomain().getCommandStack();
	}

	public void undoRedoTest() {
		Assert.assertTrue("I can't undo the command!", getCommandStack().canUndo()); //$NON-NLS-1$
		getCommandStack().undo();
		Assert.assertTrue("I can't Redo the command!", getCommandStack().canRedo()); //$NON-NLS-1$
		getCommandStack().redo();
	}

	public void undoRedo(int time) {
		for (int i = 0; i < time; i++) {
			undoRedoTest();
		}
	}

	@After
	public void endOfTests() {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				// So that the Workbench can be closed.
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeEditor(editor, false);
			}
		});
	}
}
