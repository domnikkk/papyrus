/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.rules;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.junit.utils.EditorUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPage;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.runner.Description;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


/**
 * A fixture that presents editors on a model specified via an annotation as for {@link ProjectFixture. The editor is closed automatically upon
 * completion of the test.
 */
public class PapyrusEditorFixture extends AbstractModelFixture<TransactionalEditingDomain> {

	private IMultiDiagramEditor editor;

	private ModelExplorerView modelExplorer;

	private Class<?> testClass;

	private Description testDescription;

	public PapyrusEditorFixture() {
		super();
	}

	public IMultiDiagramEditor getEditor() {
		return editor;
	}

	@Override
	protected void starting(Description description) {
		testClass = description.getTestClass();
		testDescription = description;

		open(description);

		super.starting(description);
	}

	@Override
	protected void finished(Description description) {
		try {
			if(editor != null) {
				close(editor);
				editor = null;
			}
		} finally {
			super.finished(description);
		}
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain result = null;

		if(editor != null) {
			try {
				result = getServiceRegistry().getService(TransactionalEditingDomain.class);
			} catch (ServiceException e) {
				e.printStackTrace();
				fail("Failed to get editing domain from Papyrus editor: " + e.getLocalizedMessage());
			}
		}
		return result;

	}

	@Override
	protected TransactionalEditingDomain createEditingDomain() {
		// We don't create the domain; the editor does
		return null;
	}

	protected IMultiDiagramEditor open(final IFile modelFile) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					editor = EditorUtils.openPapyrusEditor(modelFile);
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to open Papyrus editor: " + e.getLocalizedMessage());
				}
			}
		});

		final IWorkbenchPage page = editor.getSite().getPage();
		page.addPartListener(new IPartListener() {

			public void partClosed(IWorkbenchPart part) {
				if(part == editor) {
					editor = null;
				}
				page.removePartListener(this);
			}

			public void partOpened(IWorkbenchPart part) {
				// Pass
			}

			public void partDeactivated(IWorkbenchPart part) {
				// Pass
			}

			public void partBroughtToTop(IWorkbenchPart part) {
				// Pass
			}

			public void partActivated(IWorkbenchPart part) {
				// Pass
			}
		});

		flushDisplayEvents();

		return editor;
	}

	protected IMultiDiagramEditor open(Description description) {
		IFile papyrusModel = getProject().getFile(initModelResource(description).getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
		return open(papyrusModel);
	}

	public IMultiDiagramEditor open() {
		return open(testDescription);
	}

	public IMultiDiagramEditor open(String resourcePath) {
		return open(new Path(resourcePath).removeFileExtension().lastSegment(), ResourceKind.BUNDLE, resourcePath);
	}

	public IMultiDiagramEditor open(String targetPath, String resourcePath) {
		return open(targetPath, ResourceKind.BUNDLE, resourcePath);
	}

	public IMultiDiagramEditor open(String targetPath, ResourceKind resourceKind, String resourcePath) {
		final IFile papyrusModel = getProject().getFile(initModelResource(targetPath, resourceKind, resourcePath).getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
		return open(papyrusModel);
	}

	public void activate() {
		if(editor != null) {
			activate(editor);
		}
	}

	public void activate(IWorkbenchPart part) {
		part.getSite().getPage().activate(part);
	}

	public void close() {
		if(editor != null) {
			close(editor);
			editor = null;
		}
	}

	public void close(IEditorPart editor) {
		editor.getSite().getPage().closeEditor(editor, false);
		flushDisplayEvents();
	}

	public ModelExplorerView getModelExplorerView() {

		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				ModelExplorerPageBookView view;
				try {
					view = (ModelExplorerPageBookView)activeWorkbenchWindow.getActivePage().showView(AbstractEditorTest.MODELEXPLORER_VIEW_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
					return;
				}

				IPage currentPage = view.getCurrentPage();
				ModelExplorerPage page = (ModelExplorerPage)currentPage;
				IViewPart viewer = page.getViewer();
				modelExplorer = (ModelExplorerView)viewer;
			}
		});

		return modelExplorer;
	}

	public ServicesRegistry getServiceRegistry() {
		return editor.getServicesRegistry();
	}

	public ModelSet getModelSet() {
		try {
			return getServiceRegistry().getService(ModelSet.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get model set from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	@Override
	public Package getModel() {
		Package result = null;

		UmlModel uml = (UmlModel)getModelSet().getModel(UmlModel.MODEL_ID);
		assertThat("No UML model present in resource set", uml.getResource(), notNullValue());

		result = (Package)EcoreUtil.getObjectByType(uml.getResource().getContents(), UMLPackage.Literals.PACKAGE);
		assertThat("Model resource contains no UML Package", result, notNullValue());

		return result;
	}

	public IPageManager getPageManager() {
		try {
			return getServiceRegistry().getService(IPageManager.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get page manager from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	public void flushDisplayEvents() {
		for(;;) {
			try {
				if(!Display.getCurrent().readAndDispatch()) {
					break;
				}
			} catch (Exception e) {
				Bundle testBundle = FrameworkUtil.getBundle(testClass);
				Platform.getLog(testBundle).log(new Status(IStatus.ERROR, testBundle.getSymbolicName(), "Uncaught exception in display runnable.", e));
			}
		}
	}

	public IViewPart getView(String id, boolean open) {
		IViewPart result = null;

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		try {
			result = activeWorkbenchWindow.getActivePage().findView(id);
			if((result == null) && open) {
				result = activeWorkbenchWindow.getActivePage().showView(id);
			}

			if(result != null) {
				result.getSite().getPage().activate(result);
				flushDisplayEvents();
			}
		} catch (PartInitException e) {
			e.printStackTrace();
			fail("Failed to show a view: " + id);
		} finally {
			flushDisplayEvents();
		}

		return result;
	}
}
