/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - post refreshes for transaction commit asynchronously (CDO)
 *  Christian W. Damus (CEA) - bug 429826
 *  Christian W. Damus (CEA) - bug 434635
 *  Christian W. Damus (CEA) - bug 437217
 *  Christian W. Damus (CEA) - bug 441857
 *  Christian W. Damus - bug 450235
 *  Christian W. Damus - bug 451683
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.util.Policy;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IReloadableEditor;
import org.eclipse.papyrus.infra.core.editor.reload.EditorReloadAdapter;
import org.eclipse.papyrus.infra.core.editor.reload.EditorReloadEvent;
import org.eclipse.papyrus.infra.core.editor.reload.TreeViewerContext;
import org.eclipse.papyrus.infra.core.lifecycleevents.IEditorInputChangedListener;
import org.eclipse.papyrus.infra.core.lifecycleevents.ISaveAndDirtyService;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyHandler2;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyListener;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyEvent;
import org.eclipse.papyrus.infra.core.resource.additional.AdditionalResourcesModel;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.providers.SemanticFromModelExplorer;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationService;
import org.eclipse.papyrus.infra.widgets.editors.SelectionMenu;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.views.modelexplorer.SharedModelExplorerState.StateChangedEvent;
import org.eclipse.papyrus.views.modelexplorer.listener.DoubleClickListener;
import org.eclipse.papyrus.views.modelexplorer.matching.IMatchingItem;
import org.eclipse.papyrus.views.modelexplorer.matching.LinkItemMatchingItem;
import org.eclipse.papyrus.views.modelexplorer.matching.ModelElementItemMatchingItem;
import org.eclipse.papyrus.views.modelexplorer.matching.ReferencableMatchingItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.CommonViewerSorter;
import org.eclipse.ui.navigator.IExtensionActivationListener;
import org.eclipse.ui.navigator.ILinkHelper;
import org.eclipse.ui.navigator.INavigatorContentService;
import org.eclipse.ui.navigator.LinkHelperService;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Papyrus Model Explorer associated to one {@link IMultiDiagramEditor}.
 * This ModelExplorer is linked to one single {@link IMultiDiagramEditor}. It doesn't change its
 * source when the current Editor change. To allow to explore different Model, use a {@link ModelExplorerPageBookView}.
 *
 */
public class ModelExplorerView extends CommonNavigator implements IRevealSemanticElement, IEditingDomainProvider, IPageLifeCycleEventsListener {

	private SharedModelExplorerState sharedState;

	private SharedModelExplorerState.StateChangedListener sharedStateListener;

	/**
	 * The context of the LabelProviderService used by this view
	 *
	 * @see {@link LabelProviderService}
	 */
	public static final String LABEL_PROVIDER_SERVICE_CONTEXT = "org.eclipse.papyrus.views.modelexplorer.labelProvider.context";

	/**
	 * The {@link ServicesRegistry} associated to the Editor. This view is associated to the
	 * ServicesRegistry rather than to the EditorPart.
	 */
	private ServicesRegistry serviceRegistry;

	/** The save aservice associated to the editor. */
	private ISaveAndDirtyService saveAndDirtyService;

	/** {@link IUndoContext} used to tag command in the commandStack. */
	private IUndoContext undoContext;

	/** editing domain used to read/write the model */
	private TransactionalEditingDomain editingDomain;

	/** Flag to avoid reentrant call to refresh. */
	private AtomicBoolean isRefreshing = new AtomicBoolean(false);

	/**
	 * A listener on page (all editors) selection change. This listener is set
	 * in {@link ModelExplorerView#init(IViewSite)}. It should be dispose to remove
	 * hook to the Eclipse page.
	 */
	private ISelectionListener pageSelectionListener = new ISelectionListener() {

		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			handleSelectionChangedFromDiagramEditor(part, selection);
		}
	};

	/**
	 * Listener on {@link ISaveAndDirtyService#addInputChangedListener(IEditorInputChangedListener)}
	 */
	protected IEditorInputChangedListener editorInputChangedListener = new IEditorInputChangedListener() {

		/**
		 * This method is called when the editor input is changed from the ISaveAndDirtyService.
		 *
		 * @see org.eclipse.papyrus.infra.core.lifecycleevents.IEditorInputChangedListener#editorInputChanged(org.eclipse.ui.part.FileEditorInput)
		 *
		 * @param fileEditorInput
		 */
		public void editorInputChanged(FileEditorInput fileEditorInput) {
			// Change the editor input.
			setPartName(fileEditorInput.getName());
		}

		/**
		 * The isDirty flag has changed, reflect its new value
		 *
		 * @see org.eclipse.papyrus.infra.core.lifecycleevents.IEditorInputChangedListener#isDirtyChanged()
		 *
		 */
		public void isDirtyChanged() {
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	};

	/** The {@link IPropertySheetPage} this model explorer will use. */
	private final List<IPropertySheetPage> propertySheetPages = new LinkedList<IPropertySheetPage>();

	/**
	 *
	 * Constructor.
	 *
	 * @param part
	 *            The part associated to this ModelExplorer
	 */
	public ModelExplorerView(IMultiDiagramEditor part) {

		if (part == null) {
			throw new IllegalArgumentException("A part should be provided.");
		}

		init(part);

		IReloadableEditor.Adapter.getAdapter(part).addEditorReloadListener(new EditorReloadAdapter() {

			@Override
			public void editorAboutToReload(EditorReloadEvent event) {
				// Stash expansion and selection state of the common viewer
				event.putContext(new ModelExplorerTreeViewerContext(getCommonViewer()));

				deactivate();
			}

			@Override
			public void editorReloaded(EditorReloadEvent event) {
				init(event.getEditor());

				activate();

				initCommonViewer(getCommonViewer());

				// Restore expansion and selection state of the common viewer
				((TreeViewerContext<?>) event.getContext()).restore(getCommonViewer());
			}
		});
	}

	private void init(IMultiDiagramEditor editor) {
		// Try to get the ServicesRegistry
		serviceRegistry = editor.getServicesRegistry();
		if (serviceRegistry == null) {
			throw new IllegalArgumentException("The editor should have a ServiceRegistry.");
		}

		// Get required services from ServicesRegistry
		try {
			saveAndDirtyService = serviceRegistry.getService(ISaveAndDirtyService.class);
			undoContext = serviceRegistry.getService(IUndoContext.class);
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
	}

	/**
	 * Handle a selection change in the editor.
	 *
	 * @param part
	 * @param selection
	 */
	private void handleSelectionChangedFromDiagramEditor(IWorkbenchPart part, ISelection selection) {
		// Handle selection from diagram editor
		if (isLinkingEnabled()) {
			if (part instanceof IEditorPart) {
				if (selection instanceof IStructuredSelection) {
					Iterator<?> selectionIterator = ((IStructuredSelection) selection).iterator();
					ArrayList<Object> semanticElementList = new ArrayList<Object>();
					while (selectionIterator.hasNext()) {
						Object currentSelection = selectionIterator.next();
						Object semanticElement = EMFHelper.getEObject(currentSelection);
						if (semanticElement != null) {
							semanticElementList.add(semanticElement);
						}

					}
					revealSemanticElement(semanticElementList);

				}

			}

			// Selections from the Model Explorer result in a part from the ModelExplorerPageBookView instance which is not an IEditorPart
			if (part instanceof ModelExplorerPageBookView && !selection.isEmpty()) {
				if (selection instanceof IStructuredSelection) {
					// Extracted from org.eclipse.ui.internal.navigator.actions.LinkEditorAction activateEditorJob
					// the problem was that multi-element selections were disabled as only selections of 1 could clear the condition size()==1
					IStructuredSelection sSelection = (IStructuredSelection) selection;
					LinkHelperService linkService = getLinkHelperService();
					ILinkHelper[] helpers = linkService.getLinkHelpersFor(sSelection.getFirstElement()); // LinkHelper in org.eclipse.papyrus.views.modelexplorer
					if (helpers.length > 0) {
						helpers[0].activateEditor(part.getSite().getPage(), sSelection);
					}
				}
			}
		}
	}

	/**
	 * look for the path the list of element (comes from the content provider) to go the eObject
	 *
	 * @param eobject
	 *            that we look for.
	 * @param objects
	 *            a list of elements where eobject can be wrapped.
	 * @return the list of modelElementItem ( from the root to the element that wrap the eobject)
	 */
	protected List<Object> searchPath(EObject eobject, List<Object> objects) {
		SemanticFromModelExplorer semanticGetter = new SemanticFromModelExplorer();
		List<Object> path = new ArrayList<Object>();
		ITreeContentProvider contentProvider = (ITreeContentProvider) getCommonViewer().getContentProvider();
		// IPageMngr iPageMngr = EditorUtils.getIPageMngr();
		IPageManager iPageMngr;
		try {
			iPageMngr = ServiceUtils.getInstance().getIPageManager(serviceRegistry);
		} catch (ServiceException e) {
			// This shouldn't happen.
			return Collections.emptyList();
		}
		Object[] result = iPageMngr.allPages().toArray();
		List<Object> editors = Arrays.asList(result);


		for (Object o : objects) {
			// Search matches in this level
			if (!editors.contains(o)) {
				if (eobject.equals(EMFHelper.getEObject(o))) {
					path.add(o);
					return path;
				}
			}

			// Find childs only for feature container
			for (int i = 0; i < contentProvider.getChildren(o).length; i++) {
				Object treeItem = contentProvider.getChildren(o)[i];

				List<Object> tmppath = new ArrayList<Object>();
				Object element = semanticGetter.getSemanticElement(treeItem);
				if (element != null) {
					if (element instanceof EReference) {
						if (((EReference) element).isContainment() && (!((EReference) element).isDerived())) {
							List<Object> childs = new ArrayList<Object>();
							childs.add(treeItem);
							tmppath = searchPath(eobject, childs);
						}
					}

					else {
						if (element instanceof EObject) {
							List<Object> childs = new ArrayList<Object>();
							childs.add(treeItem);
							tmppath = searchPath(eobject, childs);
						}
					}
				}

				// if tmppath contains the wrapped eobject we have find the good path
				if (tmppath.size() > 0) {
					if (eobject.equals((EMFHelper.getEObject((tmppath.get(tmppath.size() - 1)))))) {
						path.add(o);
						path.addAll(tmppath);
						return path;
					}
				}
			}
		}

		return new ArrayList<Object>();
	}


	/**
	 * {@inheritDoc}
	 */
	// FIXME Use of internal class (NavigatorContentService) - in the hope that the bug gets fixed soon.
	@Override
	protected CommonViewer createCommonViewerObject(Composite aParent) {
		CommonViewer viewer = new CustomCommonViewer(getViewSite().getId(), aParent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		initCommonViewer(viewer);

		viewer.getNavigatorContentService().getActivationService().addExtensionActivationListener(new IExtensionActivationListener() {

			public void onExtensionActivation(String aViewerId, String[] theNavigatorExtensionIds, boolean isActive) {
				sharedState.updateNavigatorContentExtensions(theNavigatorExtensionIds, isActive);
			}
		});

		ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);

		return viewer;
	}

	private void installEMFFacetTreePainter(Tree tree) {
		// Install the EMFFacet Custom Tree Painter
		// org.eclipse.papyrus.infra.emf.Activator.getDefault().getCustomizationManager().installCustomPainter(tree);

		// The EMF Facet MeasureItem Listener is incompatible with the NavigatorDecoratingLabelProvider. Remove it.
		// Symptoms: ModelElementItems with an EMF Facet Overlay have a small selection size
		// Removal also fixes bug 400012: no scrollbar although tree is larger than visible area
		Collection<Listener> listenersToRemove = new LinkedList<Listener>();
		for (Listener listener : tree.getListeners(SWT.MeasureItem)) {
			if (listener.getClass().getName().contains("org.eclipse.papyrus.emf.facet.infra.browser.uicore.internal.CustomTreePainter")) {
				listenersToRemove.add(listener);
			}
		}

		for (Listener listener : listenersToRemove) {
			tree.removeListener(SWT.MeasureItem, listener);
		}
	}

	private void initCommonViewer(CommonViewer viewer) {
		// enable tool-tips
		// workaround for bug 311827: the Common Viewer always uses NavigatorDecoratingLabelProvider
		// as a wrapper for the LabelProvider provided by the application. The NavigatorDecoratingLabelProvider
		// does not delegate tooltip related functions but defines them as empty.

		Object input = getInitialInput();
		ILabelProvider labelProvider = null;

		if (input instanceof ServicesRegistry) {
			ServicesRegistry registry = (ServicesRegistry) input;
			try {
				labelProvider = registry.getService(LabelProviderService.class).getLabelProvider(LABEL_PROVIDER_SERVICE_CONTEXT);
			} catch (ServiceException ex) {
				Activator.log.error(ex);
			}

			labelProvider = new DecoratingLabelProviderWTooltips(labelProvider, (ServicesRegistry) input);
		}

		if (labelProvider == null) {
			labelProvider = new LabelProvider();
		}

		viewer.setLabelProvider(labelProvider); // add for decorator and tooltip support
	}

	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);

		getCommonViewer().setSorter(null);
		((CustomCommonViewer) getCommonViewer()).getDropAdapter().setFeedbackEnabled(true);
		getCommonViewer().addDoubleClickListener(new DoubleClickListener(new Supplier<ServicesRegistry>() {
			public ServicesRegistry get() {
				return serviceRegistry;
			}
		}));

		Tree tree = getCommonViewer().getTree();

		tree.addKeyListener(new KeyListener() {

			public void keyReleased(KeyEvent e) {
				if (e.keyCode == SWT.ALT) {
					exitItem();
				}
			}

			public void keyPressed(KeyEvent e) {
				if (e.keyCode != SWT.ALT) {
					return;
				}

				Tree tree = getCommonViewer().getTree();

				// Generate a basic mouse event
				Event event = new Event();
				event.widget = tree;
				event.stateMask = SWT.ALT;

				Point absoluteTreeLocation = tree.toDisplay(new Point(0, 0));

				event.x = tree.getDisplay().getCursorLocation().x - absoluteTreeLocation.x;
				event.y = tree.getDisplay().getCursorLocation().y - absoluteTreeLocation.y;

				MouseEvent mouseEvent = new MouseEvent(event);
				if (isEnterState(mouseEvent)) {
					enterItem(currentItem);
				}
			}
		});

		tree.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseUp(MouseEvent e) {
				if ((e.stateMask & SWT.ALT) == 0) {
					return;
				}

				TreeItem currentItem = getTreeItem(e);
				if (currentItem != null) {
					Object data = currentItem.getData();
					try {
						NavigationService service = serviceRegistry.getService(NavigationService.class);
						List<NavigableElement> navigableElements = service.getNavigableElements(data);

						// TODO: Implement a priority on NavigableElements and navigate the element with the highest priority
						for (NavigableElement navigableElement : navigableElements) {
							if (navigableElement.isEnabled()) {
								service.navigate(navigableElement);
							}
						}
					} catch (ServiceException ex) {
						Activator.log.error(ex);
					}
				}
			}
		});

		tree.addMouseMoveListener(new MouseMoveListener() {

			public void mouseMove(MouseEvent e) {

				if (isExitState(e)) {
					exitItem();
				}

				if (isEnterState(e)) {
					enterItem(currentItem);
				}

			}

		});

		installEMFFacetTreePainter(tree);
		try {
			ISashWindowsContainer sashWindowsContainer = serviceRegistry.getService(ISashWindowsContainer.class);
			sashWindowsContainer.addPageLifeCycleListener(this);
		} catch (ServiceException ex) {
			// Ignore
		}

		if (sharedState != null) {
			initSharedState(sharedState);
		}
	}

	@Override
	protected CommonViewer createCommonViewer(Composite aParent) {
		CommonViewer viewer = super.createCommonViewer(aParent);
		ViewerColumn column = (ViewerColumn) viewer.getTree().getData(Policy.JFACE + ".columnViewer");
		column.setEditingSupport(new DirectEditorEditingSupport(viewer));
		return viewer;
	}


	TreeItem currentItem;

	SelectionMenu selectionMenu;

	private boolean isExitState(MouseEvent e) {
		if (currentItem == null) {
			return false;
		}

		TreeItem item = getTreeItem(e);
		if (item == null) {
			return true;
		}

		if (item != currentItem) {
			return true;
		}

		if ((e.stateMask & SWT.ALT) == 0) {
			return true;
		}

		return false;
	}

	private boolean isEnterState(MouseEvent e) {
		TreeItem item = getTreeItem(e);
		if (item == currentItem) {
			return false;
		}

		if (item == null) {
			return false;
		}

		if ((e.stateMask & SWT.ALT) == 0) {
			return false;
		}

		currentItem = item;

		return true;
	}

	private void disposeCurrentMenu() {
		if (selectionMenu != null) {
			selectionMenu.dispose();
			selectionMenu = null;
		}
	}

	private void exitItem() {
		currentItem = null;
		disposeCurrentMenu();
	}

	private void enterItem(TreeItem item) {
		try {
			final NavigationService navigation = serviceRegistry.getService(NavigationService.class);
			disposeCurrentMenu();
			selectionMenu = navigation.createNavigationList(item.getData(), item.getParent());
			if (selectionMenu == null) {
				return;
			}

			selectionMenu.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection().isEmpty()) {
						return;
					}
					Object selectedElement = ((IStructuredSelection) event.getSelection()).getFirstElement();
					if (selectedElement instanceof NavigableElement) {
						NavigableElement navigableElement = (NavigableElement) selectedElement;
						if (navigableElement.isEnabled()) {
							navigation.navigate((NavigableElement) selectedElement);
							exitItem();
						}
					}
				}
			});
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}
	}

	private TreeItem getTreeItem(MouseEvent e) {
		return ((Tree) e.widget).getItem(new Point(e.x, e.y));
	}


	/**
	 * Return the control used to render this View
	 *
	 * @see org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.IPageBookNestableViewPart#getControl()
	 *
	 * @return the main control of the navigator viewer
	 */
	public Control getControl() {
		return getCommonViewer().getControl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(IViewSite site, IMemento aMemento) throws PartInitException {
		super.init(site, aMemento);

		activate();

		// Self-listen for property changes
		addPropertyListener(new IPropertyListener() {

			public void propertyChanged(Object source, int propId) {
				switch (propId) {
				case IS_LINKING_ENABLED_PROPERTY:
					// Propagate to other instances
					sharedState.setLinkingEnabled(isLinkingEnabled());
					break;
				}
			}
		});
	}

	/**
	 * {@link ResourceSetListener} to listen and react to changes in the
	 * resource set.
	 */
	private final ResourceSetListener resourceSetListener = new ResourceSetListenerImpl() {

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			super.resourceSetChanged(event);
			handleResourceSetChanged(event);
		}
	};

	/** cache variable with last transaction which triggered a refresh */
	private Transaction lastTrans = null;

	/**
	 * Run in a UI thread to avoid non UI thread exception.
	 *
	 * @param event
	 */
	private void handleResourceSetChanged(ResourceSetChangeEvent event) {
		// avoid refreshing N times for the same transaction (called for each object in resource)
		Transaction curTrans = event.getTransaction();
		if (lastTrans != null && lastTrans.equals(curTrans)) {
			return;
		}
		lastTrans = curTrans;

		scheduleRefresh();
	}

	private Runnable refreshRunnable;

	/**
	 * Thread-safe
	 * Schedule a runnable which will refresh the view if necessary
	 */
	protected void scheduleRefresh() {
		final Runnable schedule;

		synchronized (this) {
			if (refreshRunnable == null) {
				// No refresh is yet pending. Schedule one
				schedule = createRefreshRunnable();
				refreshRunnable = schedule;
			} else {
				schedule = null;
			}
		}

		if (schedule != null) {
			Control control = getControl();
			Display display = ((control == null) || control.isDisposed()) ? null : control.getDisplay();

			if (display != null) {
				// Don't need to schedule a refresh if we have no control or it's disposed
				display.asyncExec(schedule);
			}
		}
	}

	private Runnable createRefreshRunnable() {
		return new Runnable() {

			public void run() {
				// Only run if I'm still pending
				synchronized (ModelExplorerView.this) {
					if (refreshRunnable != this) {
						return;
					}

					refreshRunnable = null;
				}

				refreshInUIThread();
			}
		};
	}

	/**
	 * Thread-safe method to hurry up a pending refresh of the Model Explorer view (if any), synchronously.
	 * When this method returns, then either the explorer has been refreshed or it doesn't need to be.
	 */
	protected void syncRefresh() {
		final Runnable pending;

		synchronized (this) {
			pending = refreshRunnable;
		}

		if (pending != null) {
			Control control = getControl();
			Display display = ((control == null) || control.isDisposed()) ? null : control.getDisplay();

			if (display != null) {
				// Don't need to execute a refresh if we have no control or it's disposed
				display.syncExec(pending);
			}
		}
	}

	/**
	 * refresh the view.
	 */
	protected void refreshInUIThread() {
		// Need to refresh, even if (temporarily) invisible
		// (Better alternative?: store refresh event and execute once visible again)
		if (getControl().isDisposed()) {
			return;
		}

		// avoid reentrant call
		// Refresh only of we are not already refreshing.
		if (isRefreshing.compareAndSet(false, true)) {
			if (!getCommonViewer().isBusy()) {
				getCommonViewer().refresh();
			}

			isRefreshing.set(false);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Object getInitialInput() {

		if (serviceRegistry != null) {
			return serviceRegistry;
		} else {
			return super.getInitialInput();
		}

	}

	/**
	 * Activate specified Part.
	 */
	private void activate() {
		try {
			this.editingDomain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);

			// Set Viewer input if it already exist
			if (getCommonViewer() != null) {
				getCommonViewer().setInput(serviceRegistry);
			}
			editingDomain.addResourceSetListener(resourceSetListener);
			IReadOnlyHandler2 readOnlyHandler = AdapterUtils.adapt(editingDomain, IReadOnlyHandler2.class, null);
			if (readOnlyHandler != null) {
				readOnlyHandler.addReadOnlyListener(createReadOnlyListener());
			}
		} catch (ServiceException e) {
			// Can't get EditingDomain, skip
		}

		// listen to change events
		getSite().getPage().addSelectionListener(pageSelectionListener);

		// Listen to isDirty flag
		saveAndDirtyService.addInputChangedListener(editorInputChangedListener);

		if (this.getCommonViewer() != null) {
			// Force a refresh
			Display display = getControl().getDisplay();
			if (display == Display.getCurrent()) {
				refreshInUIThread();
			} else {
				// Hmm. We should be on the UI thread
				Activator.log.warn("Model Explorer activated on a non-UI thread."); //$NON-NLS-1$
				scheduleRefresh();
			}
		}
	}

	/**
	 * Deactivate the Model Explorer.
	 */
	private void deactivate() {
		// deactivate global handler
		if (Activator.log.isDebugEnabled()) {
			Activator.log.debug("deactivate ModelExplorerView"); //$NON-NLS-1$
		}

		try {
			ISashWindowsContainer sashWindowsContainer = serviceRegistry.getService(ISashWindowsContainer.class);
			if (sashWindowsContainer != null) {
				sashWindowsContainer.removePageLifeCycleListener(this);
			}
		} catch (ServiceException ex) {
			// Ignore
		}

		// Stop listening on change events
		getSite().getPage().removeSelectionListener(pageSelectionListener);
		// Stop Listening to isDirty flag
		saveAndDirtyService.removeInputChangedListener(editorInputChangedListener);

		if (editingDomain != null) {
			editingDomain.removeResourceSetListener(resourceSetListener);
			editingDomain = null;
		}

		saveAndDirtyService = null;
		undoContext = null;
		editingDomain = null;
		editingDomain = null;
		lastTrans = null;
	}

	/**
	 * Invoked internally to clear the common viewer's associate listener in order to promote garbage collection.
	 */
	void aboutToDispose() {
		final CommonViewer viewer = getCommonViewer();
		if ((viewer.getTree() != null) && !viewer.getTree().isDisposed()) {
			viewer.setInput(null);

			// Kick the NavigatorContentService to clear the cache in its StructuredViewerManager that leaks all of our tree elements
			INavigatorContentService contentService = getNavigatorContentService();
			if (contentService instanceof IExtensionActivationListener) {
				((IExtensionActivationListener) getNavigatorContentService()).onExtensionActivation(contentService.getViewerId(), new String[0], false);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {

		// Stop if we are already disposed
		if (isDisposed()) {
			return;
		}

		if ((sharedStateListener != null) && (sharedState != null)) {
			sharedState.removeListener(sharedStateListener);
		}

		if (getSite() != null) {
			getSite().getPage().removeSelectionListener(pageSelectionListener);
		}

		deactivate();

		for (IPropertySheetPage propertySheetPage : this.propertySheetPages) {
			propertySheetPage.dispose();
		}

		propertySheetPages.clear();

		pageSelectionListener = null;

		super.dispose();

		// Clean up properties to help GC

	}

	/**
	 * Return true if the component is already disposed.
	 *
	 * @return
	 */
	public boolean isDisposed() {
		// use editorPart as flag
		return saveAndDirtyService == null;
	}

	/**
	 * Retrieves the {@link IPropertySheetPage} that his Model Explorer uses.
	 *
	 * @return
	 */
	private IPropertySheetPage getPropertySheetPage() {
		try {
			final IMultiDiagramEditor multiDiagramEditor = ServiceUtils.getInstance().getService(IMultiDiagramEditor.class, serviceRegistry);

			if (multiDiagramEditor != null) {
				if (multiDiagramEditor instanceof ITabbedPropertySheetPageContributor) {
					ITabbedPropertySheetPageContributor contributor = (ITabbedPropertySheetPageContributor) multiDiagramEditor;
					IPropertySheetPage propertySheetPage = new TabbedPropertySheetPage(contributor);
					this.propertySheetPages.add(propertySheetPage);
					return propertySheetPage;
				}
			}
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}
		return null;
	}

	/**
	 * in order to see element if the property view
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (IPropertySheetPage.class.equals(adapter)) {
			return getPropertySheetPage();
		}

		if (IUndoContext.class == adapter) {
			// Return the IUndoContext of associated model.
			return undoContext;
		}

		if (ISaveablePart.class.equals(adapter)) {
			try {
				return serviceRegistry.getService(IMultiDiagramEditor.class);
			} catch (ServiceException ex) {
				Activator.log.error(ex);
			}
			return saveAndDirtyService;
		}

		if (ServicesRegistry.class == adapter) {
			return serviceRegistry;
		}

		return super.getAdapter(adapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return the EditingDomain used by the properties view
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void selectReveal(ISelection selection) {
		syncRefresh();
		if (getCommonViewer() != null) {
			getCommonViewer().setSelection(selection, true);
		}
	}

	public void revealSemanticElement(List<?> elementList) {
		// Ensure that the ModelExplorer is refreshed before
		// trying to display an element. Useful if the element has just been created,
		// and the model explorer has not yet been refreshed
		syncRefresh();
		reveal(elementList, getCommonViewer());
	}

	/**
	 * Expands the given CommonViewer to reveal the given elements
	 *
	 * @param elementList
	 *            The elements to reveal
	 * @param commonViewer
	 *            The CommonViewer they are to be revealed in
	 */
	public static void reveal(Iterable<?> elementList, final CommonViewer commonViewer) {
		ArrayList<IMatchingItem> matchingItemsToSelect = new ArrayList<IMatchingItem>();
		// filter out non EMF objects
		Iterable<EObject> list = Iterables.filter(elementList, EObject.class);

		for (EObject currentEObject : list) {
			matchingItemsToSelect.add(new ModelElementItemMatchingItem(currentEObject));

			// the content provider exist?
			if (commonViewer.getContentProvider() != null) {
				// retrieve the ancestors to reveal them
				// and allow the selection of the object
				ArrayList<EObject> parents = new ArrayList<EObject>();
				EObject tmp = currentEObject.eContainer();
				while (tmp != null) {
					parents.add(tmp);
					tmp = tmp.eContainer();
				}

				Iterable<EObject> reverseParents = Lists.reverse(parents);

				// reveal the resource if necessary
				Resource r = null;
				if (!parents.isEmpty()) {
					r = parents.get(parents.size() - 1).eResource();
				} else {
					r = currentEObject.eResource();
				}

				if (r != null) {
					final ResourceSet rs = r.getResourceSet();
					final Resource resource = r;
					if (rs instanceof ModelSet && AdditionalResourcesModel.isAdditionalResource((ModelSet) rs, r.getURI())) {
						commonViewer.getControl().getDisplay().syncExec(new Runnable() {

							public void run() {
								commonViewer.expandToLevel(new ReferencableMatchingItem(rs), 1);
								commonViewer.expandToLevel(new ReferencableMatchingItem(resource), 1);
							}
						});

					}
				}

				/*
				 * reveal the ancestors tree using expandToLevel on each of them
				 * in the good order. This is a lot faster than going through the whole tree
				 * using getChildren of the ContentProvider since our Viewer uses a Hashtable
				 * to keep track of the revealed elements.
				 *
				 * However we need to use a dedicated MatchingItem to do the matching,
				 * and a specific comparer in our viewer so than the equals of MatchingItem is
				 * used in priority.
				 *
				 * Please refer to MatchingItem for more infos.
				 */
				EObject previousParent = null;
				for (EObject parent : reverseParents) {
					if (parent.eContainingFeature() != null && previousParent != null) {
						commonViewer.expandToLevel(new LinkItemMatchingItem(previousParent, parent.eContainmentFeature()), 1);
					}

					final IMatchingItem itemToExpand = new ModelElementItemMatchingItem(parent);

					commonViewer.getControl().getDisplay().syncExec(new Runnable() {

						public void run() {
							commonViewer.expandToLevel(itemToExpand, 1);
						}
					});

					previousParent = parent;
				}

				final IMatchingItem itemToExpand = new LinkItemMatchingItem(currentEObject.eContainer(), currentEObject.eContainmentFeature());

				commonViewer.getControl().getDisplay().syncExec(new Runnable() {

					public void run() {
						commonViewer.expandToLevel(itemToExpand, 1);
					}
				});
			}
		}

		selectReveal(new StructuredSelection(matchingItemsToSelect), commonViewer);
	}

	/**
	 * Selects the given ISelection in the given CommonViwer
	 *
	 * @param structuredSelection
	 *            The ISelection to select
	 * @param commonViewer
	 *            The ComonViewer to select it in
	 */
	public static void selectReveal(final ISelection structuredSelection, final Viewer commonViewer) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				commonViewer.setSelection(structuredSelection, true);
			}
		});
	}

	/**
	 * Selects and, if possible, reveals the given ISelection in the given CommonViwer
	 *
	 * @param selection
	 *            The ISelection to select
	 * @param viewer
	 *            The ComonViewer to select it in
	 */
	public static void reveal(final ISelection selection, final CommonViewer viewer) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			reveal(Lists.newArrayList(structured.iterator()), viewer);
		} else {
			viewer.getControl().getDisplay().syncExec(new Runnable() {

				public void run() {
					viewer.setSelection(selection);
				}
			});
		}
	}

	public void pageOpened(IPage page) {
		refreshTree();
	}

	public void pageClosed(IPage page) {
		refreshTree();
	}

	private void refreshTree() {
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				getCommonViewer().refresh(true);
				// Force redraw to refresh facet overlay
				getCommonViewer().getTree().redraw();
			}
		});
	}

	public void pageChanged(IPage newPage) {
		// Nothing
	}

	public void pageActivated(IPage page) {
		// Nothing
	}

	public void pageDeactivated(IPage page) {
		// Nothing
	}

	public void pageAboutToBeOpened(IPage page) {
		// Nothing
	}

	public void pageAboutToBeClosed(IPage page) {
		// Nothing
	}

	private IReadOnlyListener createReadOnlyListener() {
		return new IReadOnlyListener() {

			public void readOnlyStateChanged(ReadOnlyEvent event) {
				switch (event.getEventType()) {
				case ReadOnlyEvent.RESOURCE_READ_ONLY_STATE_CHANGED:
					scheduleRefresh();
					break;
				case ReadOnlyEvent.OBJECT_READ_ONLY_STATE_CHANGED:
					CommonViewer viewer = getCommonViewer();
					if ((viewer != null) && (viewer.getControl() != null) && !viewer.getControl().isDisposed()) {
						viewer.refresh(event.getObject());
					}
					break;
				default:
					Activator.log.warn("Unsupported read-only event type: " + event.getEventType());
					break;
				}
			}
		};
	}

	void setSharedState(SharedModelExplorerState state) {
		if (this.sharedState != null) {
			this.sharedState.removeListener(getSharedStateListener());
		}

		this.sharedState = state;

		if (state != null) {
			state.addListener(getSharedStateListener());
			initSharedState(state);
		}
	}

	void initSharedState(SharedModelExplorerState state) {
		setLinkingEnabled(state.isLinkingEnabled());
		setAlphaSorted(state.isAlphaSorted());
	}

	void setAlphaSorted(boolean sorted) {
		CommonViewer viewer = getCommonViewer();
		if ((viewer != null) && (viewer.getControl() != null) && !viewer.getControl().isDisposed()) {
			if (sorted) {
				viewer.setSorter(new CommonViewerSorter());
				if (viewer instanceof CustomCommonViewer) {
					((CustomCommonViewer) viewer).getDropAdapter().setFeedbackEnabled(false);
				}
			} else {
				viewer.setSorter(null);
				if (viewer instanceof CustomCommonViewer) {
					((CustomCommonViewer) viewer).getDropAdapter().setFeedbackEnabled(true);
				}
			}
		}
	}

	SharedModelExplorerState.StateChangedListener getSharedStateListener() {
		if (sharedStateListener == null) {
			sharedStateListener = new SharedModelExplorerState.StateChangedListener() {

				private volatile Runnable contentUpdate;

				public void sharedStateChanged(StateChangedEvent event) {
					switch (event.getEventType()) {
					case StateChangedEvent.LINKING_ENABLED:
						setLinkingEnabled(event.getSource().isLinkingEnabled());
						break;
					case StateChangedEvent.ALPHA_SORTED:
						setAlphaSorted(event.getSource().isAlphaSorted());
						break;
					case StateChangedEvent.CONTENT_EXTENSIONS:
						if (contentUpdate == null) {
							getCommonViewer().getControl().getDisplay().asyncExec(getContentUpdate());
						}
						break;
					}
				}

				private Runnable getContentUpdate() {
					if (contentUpdate == null) {
						contentUpdate = new Runnable() {

							public void run() {
								CommonViewer viewer = getCommonViewer();
								if ((viewer != null) && (viewer.getControl() != null) && !viewer.getControl().isDisposed()) {
									viewer.getNavigatorContentService().getActivationService().activateExtensions(sharedState.getNavigatorContentExtensions(), true);
								}

								// I am no longer pending
								contentUpdate = null;
							}
						};
					}
					return contentUpdate;
				}
			};
		}

		return sharedStateListener;
	}
}