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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IComponentPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageVisitor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.junit.utils.EditorUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPage;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.runner.Description;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;


/**
 * A fixture that presents editors on a model specified via an annotation as for {@link ProjectFixture}. The editor is closed automatically upon
 * completion of the test.
 */
public class PapyrusEditorFixture extends AbstractModelFixture<TransactionalEditingDomain> {

	private final Collection<IEditorPart> editorsToClose = Lists.newArrayList();

	private final List<String> excludedTypeView = Arrays.asList(new String[] { "Note" });

	private IMultiDiagramEditor editor;

	private DiagramEditorWithFlyOutPalette activeDiagramEditor;

	private ModelExplorerView modelExplorer;

	private Class<?> testClass;

	private Description testDescription;

	private Collection<IViewPart> viewsToClose;

	public PapyrusEditorFixture() {
		super();
	}

	public IMultiDiagramEditor getEditor() {
		return editor;
	}

	public IMultiDiagramEditor getEditor(String path) {
		IMultiDiagramEditor result = null;

		final String fileName = new Path(path).lastSegment();
		for (IEditorReference next : getWorkbenchPage().getEditorReferences()) {
			if (PapyrusMultiDiagramEditor.EDITOR_ID.equals(next.getId()) && fileName.equals(next.getName())) {
				result = (IMultiDiagramEditor) next.getEditor(true);
			}
		}

		return result;
	}

	@Override
	protected void starting(Description description) {
		testClass = description.getTestClass();
		testDescription = description;

		if (hasRequiredViews()) {
			openRequiredViews();
		}

		openAll(description);

		super.starting(description);
	}

	@Override
	protected void finished(Description description) {
		try {
			Exception exception = null;

			for (IEditorPart editor : ImmutableList.copyOf(editorsToClose)) {
				try {
					close(editor);
				} catch (Exception e) {
					if (exception == null) {
						exception = e;
					}
				}
			}

			if (exception != null) {
				exception.printStackTrace();
				fail("Failed to close an editor: " + exception.getLocalizedMessage());
			}
		} finally {
			editorsToClose.clear();
			editor = null;
			activeDiagramEditor = null;

			try {
				if (hasRequiredViews()) {
					closeRequiredViews();
				}
			} finally {
				super.finished(description);
			}
		}
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain result = null;

		if (editor != null) {
			result = getEditingDomain(editor);
		}

		return result;
	}

	public TransactionalEditingDomain getEditingDomain(IMultiDiagramEditor editor) {
		TransactionalEditingDomain result = null;

		try {
			result = getServiceRegistry(editor).getService(TransactionalEditingDomain.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get editing domain from Papyrus editor: " + e.getLocalizedMessage());
		}

		return result;
	}

	@Override
	protected TransactionalEditingDomain createEditingDomain() {
		// We don't create the domain; the editor does
		return null;
	}

	protected IMultiDiagramEditor open(final IFile modelFile) {
		final boolean firstEditor = editorsToClose.isEmpty();

		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				try {
					editor = EditorUtils.openPapyrusEditor(modelFile);
					editorsToClose.add(editor);
				} catch (Exception e) {
					e.printStackTrace();
					fail("Failed to open Papyrus editor: " + e.getLocalizedMessage());
				}
			}
		});

		if (firstEditor && !editorsToClose.isEmpty()) {
			final IWorkbenchPage page = editor.getSite().getPage();
			page.addPartListener(new IPartListener() {

				public void partClosed(IWorkbenchPart part) {
					editorsToClose.remove(part);

					if (part == editor) {
						editor = null;
					}

					if (editorsToClose.isEmpty()) {
						page.removePartListener(this);
					}
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
		}

		flushDisplayEvents();

		return editor;
	}

	protected IMultiDiagramEditor openOne(Description description) {
		IFile papyrusModel = getProject().getFile(Iterables.getOnlyElement(initModelResources(description)).getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
		return open(papyrusModel);
	}

	protected Iterable<IMultiDiagramEditor> openAll(Description description) {
		List<IMultiDiagramEditor> result = Lists.newArrayList();

		for (Resource resource : initModelResources(description)) {
			IFile papyrusModel = getProject().getFile(resource.getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION));
			result.add(open(papyrusModel));
		}

		return result;
	}

	public IMultiDiagramEditor open() {
		return openOne(testDescription);
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
		if (editor != null) {
			activate(editor);
		}
	}

	public void activate(IWorkbenchPart part) {
		IWorkbenchPage page = part.getSite().getPage();

		if (page.getActivePart() != part) {
			page.activate(part);
			flushDisplayEvents();
		}
	}

	public void close() {
		if (editor != null) {
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
				ModelExplorerPageBookView view;
				try {
					view = (ModelExplorerPageBookView) getWorkbenchPage().showView(AbstractEditorTest.MODELEXPLORER_VIEW_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
					return;
				}

				IPage currentPage = view.getCurrentPage();
				ModelExplorerPage page = (ModelExplorerPage) currentPage;
				IViewPart viewer = page.getViewer();
				modelExplorer = (ModelExplorerView) viewer;
			}
		});

		return modelExplorer;
	}

	protected final IWorkbenchPage getWorkbenchPage() {
		IWorkbench bench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = bench.getActiveWorkbenchWindow();
		if (window == null) {
			window = bench.getWorkbenchWindows()[0];
		}
		return window.getActivePage();
	}

	public ServicesRegistry getServiceRegistry() {
		return getServiceRegistry(editor);
	}

	public ServicesRegistry getServiceRegistry(IMultiDiagramEditor editor) {
		return editor.getServicesRegistry();
	}

	public ModelSet getModelSet() {
		return getModelSet(editor);
	}

	public ModelSet getModelSet(IMultiDiagramEditor editor) {
		try {
			return getServiceRegistry(editor).getService(ModelSet.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get model set from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	@Override
	public Package getModel() {
		return getModel(editor);
	}

	public Package getModel(IMultiDiagramEditor editor) {
		Package result = null;

		ModelSet modelSet = getModelSet(editor);
		UmlModel uml = (UmlModel) modelSet.getModel(UmlModel.MODEL_ID);
		assertThat("No UML model present in resource set", uml.getResource(), notNullValue());

		result = (Package) EcoreUtil.getObjectByType(uml.getResource().getContents(), UMLPackage.Literals.PACKAGE);
		assertThat("Model resource contains no UML Package", result, notNullValue());

		return result;
	}

	public IPageManager getPageManager() {
		return getPageManager(editor);
	}

	public IPageManager getPageManager(IMultiDiagramEditor editor) {
		try {
			return getServiceRegistry(editor).getService(IPageManager.class);
		} catch (ServiceException e) {
			e.printStackTrace();
			fail("Failed to get page manager from Papyrus editor: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	public PapyrusEditorFixture activateDiagram(String name) {
		return activateDiagram(editor, name);
	}

	public PapyrusEditorFixture activateDiagram(IMultiDiagramEditor editor, final String name) {
		activate(editor);

		final ISashWindowsContainer sashContainer = AdapterUtils.adapt(editor, ISashWindowsContainer.class, null);
		final org.eclipse.papyrus.infra.core.sasheditor.editor.IPage[] select = { null };

		sashContainer.visit(new IPageVisitor() {

			public void accept(IEditorPage page) {
				if (name.equals(page.getPageTitle()) && (page.getIEditorPart() instanceof DiagramEditorWithFlyOutPalette)) {
					select[0] = page;
					activeDiagramEditor = (DiagramEditorWithFlyOutPalette) page.getIEditorPart();
				}
			}

			public void accept(IComponentPage page) {
				// Pass
			}
		});

		if (select[0] != null) {
			sashContainer.selectPage(select[0]);
			flushDisplayEvents();
		}

		return this;
	}

	public DiagramEditorWithFlyOutPalette getActiveDiagramEditor() {
		DiagramEditorWithFlyOutPalette result = activeDiagramEditor;

		if (result == null) {
			IEditorPart activeEditor = getWorkbenchPage().getActiveEditor();
			if (activeEditor instanceof IMultiDiagramEditor) {
				activeEditor = ((IMultiDiagramEditor) activeEditor).getActiveEditor();
				if (activeEditor instanceof DiagramEditorWithFlyOutPalette) {
					result = (DiagramEditorWithFlyOutPalette) activeEditor;
				}
			}
		}

		assertThat("No diagram active", result, notNullValue());

		return result;
	}

	public EditPart findEditPart(EObject modelElement) {
		return findEditPart(getActiveDiagramEditor(), modelElement);
	}

	public EditPart findEditPart(IMultiDiagramEditor editor, EObject modelElement) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return findEditPart((DiagramEditor) activeEditor, modelElement);
	}

	public EditPart findEditPart(IDiagramWorkbenchPart editor, EObject modelElement) {
		DiagramEditPart diagram = editor.getDiagramEditPart();
		return findEditPart(diagram, modelElement);
	}


	/**
	 * Find orphan edit part with a type.
	 *
	 * @param type
	 *            the type
	 * @return the edits the part
	 */
	public EditPart findOrphanEditPart(String type) {
		IDiagramWorkbenchPart activeEditor = (IDiagramWorkbenchPart) editor.getActiveEditor();
		EditPart result = null;
		for (Iterator<View> views = Iterators.filter(activeEditor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();
			EObject element = next.getElement();
			if (element == null && type.equals(next.getType())) {
				result = (EditPart) activeEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;

	}

	/**
	 * Find orphan edit part.
	 *
	 * @return the edits the part
	 */
	public EditPart findOrphanEditPart() {
		IDiagramWorkbenchPart activeEditor = (IDiagramWorkbenchPart) editor.getActiveEditor();
		EditPart result = null;
		for (Iterator<View> views = Iterators.filter(activeEditor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();

			String type = next.getType();
			EObject element = next.getElement();

			if (element == null && !excludedTypeView.contains(type)) {
				result = (EditPart) activeEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;

	}

	private EditPart findEditPart(EditPart editPart, EObject modelElement) {
		EditPart result = null;

		Optional<View> view = AdapterUtils.adapt(editPart, View.class);
		if (view.isPresent() && (view.get().getElement() == modelElement)) {
			result = editPart;
		}

		if (result == null) {
			// Search children
			for (Iterator<?> iter = editPart.getChildren().iterator(); (result == null) && iter.hasNext();) {
				result = findEditPart((EditPart) iter.next(), modelElement);
			}
		}

		if ((result == null) && (editPart instanceof GraphicalEditPart)) {
			// Search edges
			for (Iterator<?> iter = ((GraphicalEditPart) editPart).getSourceConnections().iterator(); (result == null) && iter.hasNext();) {
				result = findEditPart((EditPart) iter.next(), modelElement);
			}
		}

		return result;
	}

	public EditPart findEditPart(String name, Class<? extends NamedElement> type) {
		return findEditPart(getActiveDiagramEditor(), name, type);
	}

	public EditPart findEditPart(IMultiDiagramEditor editor, String name, Class<? extends NamedElement> type) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return findEditPart((DiagramEditor) activeEditor, name, type);
	}

	public EditPart findEditPart(IDiagramWorkbenchPart editor, String name, Class<? extends NamedElement> type) {
		EditPart result = null;

		for (Iterator<View> views = Iterators.filter(editor.getDiagram().eAllContents(), View.class); views.hasNext();) {
			View next = views.next();
			EObject element = next.getElement();
			if (type.isInstance(element) && name.equals(type.cast(element).getName())) {
				result = (EditPart) editor.getDiagramGraphicalViewer().getEditPartRegistry().get(next);
				break;
			}
		}

		return result;
	}

	public void select(EditPart editPart) {
		editPart.getViewer().getSelectionManager().appendSelection(editPart);
	}

	public void deselect(EditPart editPart) {
		editPart.getViewer().getSelectionManager().deselect(editPart);
	}

	public PaletteViewer getPalette() {
		return getPalette(getActiveDiagramEditor());
	}

	public PaletteViewer getPalette(IMultiDiagramEditor editor) {
		IEditorPart activeEditor = editor.getActiveEditor();
		assertThat("No diagram active", activeEditor, instanceOf(DiagramEditor.class));
		return getPalette((DiagramEditor) activeEditor);
	}

	public PaletteViewer getPalette(IDiagramWorkbenchPart editor) {
		return editor.getDiagramEditPart().getViewer().getEditDomain().getPaletteViewer();
	}

	public void flushDisplayEvents() {
		for (;;) {
			try {
				if (!Display.getCurrent().readAndDispatch()) {
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

		IWorkbenchPage wbPage = getWorkbenchPage();

		try {
			result = wbPage.findView(id);
			if ((result == null) && open) {
				result = wbPage.showView(id);
			}

			if (result != null) {
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

	public void save(ISaveablePart part) {
		if (part.isDirty()) {
			try {
				part.doSave(new NullProgressMonitor());
			} catch (Exception e) {
				e.printStackTrace();
				fail("Failed to save editor/view: " + e.getLocalizedMessage());
			} finally {
				// Must flush display events because some steps (e.g. dependent editor reload)
				// are done asynchronously in a UI job
				flushDisplayEvents();
			}
		}
	}

	public void saveAll() {
		try {
			IWorkbenchPage page = editor.getSite().getPage();
			page.saveAllEditors(false);
		} finally {
			// Must flush display events because some steps (e.g. dependent editor reload)
			// are done asynchronously in a UI job
			flushDisplayEvents();
		}
	}

	public void splitEditorArea(IEditorPart editorToMove, boolean splitHorizontally) {
		MPart editorPart = editorToMove.getSite().getService(MPart.class);
		EModelService modelService = editorPart.getContext().get(EModelService.class);
		MPartStack oldStack = (MPartStack) modelService.getContainer(editorPart);
		MPartStack newStack = modelService.createModelElement(MPartStack.class);
		modelService.insert(newStack, oldStack, splitHorizontally ? EModelService.RIGHT_OF : EModelService.BELOW, 0.5f);
		newStack.getChildren().add(editorPart);

		activate(editorToMove);
	}

	public List<IWorkbenchPart> getPartStack(IWorkbenchPart part) {
		List<IWorkbenchPart> result;

		MPart mpart = part.getSite().getService(MPart.class);
		EModelService modelService = mpart.getContext().get(EModelService.class);
		MPartStack stack = (MPartStack) modelService.getContainer(mpart);

		result = Lists.newArrayListWithCapacity(stack.getChildren().size());
		for (MPart next : Iterables.filter(stack.getChildren(), MPart.class)) {
			IWorkbenchPart wbPart = next.getContext().get(IWorkbenchPart.class);
			if (wbPart != null) {
				result.add(wbPart);
			}
		}

		return result;
	}

	protected final boolean hasRequiredViews() {
		return getRequiredViews() != null;
	}

	protected final ShowView getRequiredViews() {
		ShowView result = testDescription.getAnnotation(ShowView.class);

		if (result == null) {
			for (Class<?> clazz = testClass; (result == null) && (clazz != null) && (clazz != Object.class); clazz = clazz.getSuperclass()) {
				result = clazz.getAnnotation(ShowView.class);
			}
		}

		return result;
	}

	protected void openRequiredViews() {
		IWorkbenchPage page = getWorkbenchPage();

		for (ShowViewDescriptor next : ShowViewDescriptor.getDescriptors(getRequiredViews())) {
			IViewPart part = page.findView(next.viewID());
			if (part == null) {
				// Must open it
				try {
					part = page.showView(next.viewID());
					movePartRelativeTo(part, next.relativeTo(), next.location());

					if (viewsToClose == null) {
						viewsToClose = Lists.newArrayListWithExpectedSize(1);
					}
					viewsToClose.add(part);
				} catch (PartInitException e) {
					e.printStackTrace();
					fail("Failed to open required view: " + e.getLocalizedMessage());
				}
			}
		}

		flushDisplayEvents();
	}

	private void movePartRelativeTo(IWorkbenchPart part, String relativeTo, int where) {
		MPart mPart = part.getSite().getService(MPart.class);
		EModelService modelService = mPart.getContext().get(EModelService.class);
		MUIElement relativePart = modelService.find(relativeTo, modelService.getTopLevelWindowFor(mPart));
		if (relativePart instanceof MPartSashContainerElement) {
			MStackElement toMove = mPart;
			MPlaceholder placeHolder = mPart.getCurSharedRef();
			if (placeHolder != null) {
				toMove = placeHolder;
			}

			if (where < 0) {
				// Add it to the relative part's containing stack
				if (relativePart instanceof MPart) {
					MPart relativeMPart = (MPart) relativePart;
					if (relativeMPart.getCurSharedRef() != null) {
						// This is where the part is stacked
						relativePart = relativeMPart.getCurSharedRef();
					}
				}
				relativePart.getParent().getChildren().add(toMove);
			} else {
				// Insert it next to the relative part
				MPartStack newStack = modelService.createModelElement(MPartStack.class);
				newStack.getChildren().add(toMove);
				modelService.insert(newStack, (MPartSashContainerElement) relativePart, where, 0.3f);
			}
		}
	}

	protected void closeRequiredViews() {
		// Only close the Palette view if we opened it
		if (viewsToClose != null) {
			for (IViewPart closeMe : viewsToClose) {
				closeMe.getSite().getPage().hideView(closeMe);
			}
			viewsToClose = null;
			flushDisplayEvents();
		}
	}

	private static final class ShowViewDescriptor {

		private static final String DEFAULT_RELATIVE_TO = "org.eclipse.ui.editorss"; //$NON-NLS-1$

		private static final ShowView.Location DEFAULT_LOCATION_EDITORS = ShowView.Location.RIGHT;

		private static final ShowView.Location DEFAULT_LOCATION_VIEW = ShowView.Location.STACKED;

		private final String viewID;

		private final String relativeTo;

		private final ShowView.Location location;

		private ShowViewDescriptor(ShowView annotation, int index) {
			this.viewID = annotation.value()[index];

			String[] relativeTo = annotation.relativeTo();
			this.relativeTo = (relativeTo.length == 0) ? null : (relativeTo.length == 1) ? relativeTo[0] : relativeTo[index];

			ShowView.Location[] location = annotation.location();
			this.location = (location.length == 0) ? null : (location.length == 1) ? location[0] : location[index];
		}

		static Iterable<ShowViewDescriptor> getDescriptors(final ShowView annotation) {
			ImmutableList.Builder<ShowViewDescriptor> result = ImmutableList.builder();

			String[] ids = annotation.value();
			for (int i = 0; i < ids.length; i++) {
				result.add(new ShowViewDescriptor(annotation, i));
			}

			return result.build();
		}

		String viewID() {
			return viewID;
		}

		String relativeTo() {
			return (relativeTo != null) ? relativeTo : DEFAULT_RELATIVE_TO;
		}

		int location() {
			return ((location != null) ? location : (relativeTo == null) ? DEFAULT_LOCATION_EDITORS : DEFAULT_LOCATION_VIEW).toModelServiceLocation();
		}
	}
}
