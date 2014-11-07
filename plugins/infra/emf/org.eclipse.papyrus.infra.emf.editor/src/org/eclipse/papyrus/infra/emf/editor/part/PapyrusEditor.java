/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.editor.part;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.papyrus.emf.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.editor.Activator;
import org.eclipse.papyrus.infra.emf.editor.actions.MoDiscoDropAdapter;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.infra.widgets.editors.StringEditor;
import org.eclipse.papyrus.infra.widgets.providers.PatternViewerFilter;
import org.eclipse.papyrus.views.properties.widgets.layout.GridData;
import org.eclipse.papyrus.views.properties.widgets.layout.PropertiesLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * An extended EMF editor
 *
 * This generic editor provides the following features :
 *
 * - EMF Facet browser customization
 * - Papyrus customizable property view
 * - Papyrus customizable new child
 *
 * @author Camille Letavernier
 *
 */
public class PapyrusEditor extends EcoreEditor implements ITabbedPropertySheetPageContributor, CommandStackListener {

	public static final String PROPERTY_VIEW_ID = "CustomizablePropertyView"; //$NON-NLS-1$

	/**
	 * The Property sheet page for this editor
	 */
	protected IPropertySheetPage iPropertySheetPage;

	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		getContainer().setBackground(new Color(getContainer().getDisplay(), 255, 255, 255));
		getContainer().setBackgroundMode(SWT.INHERIT_DEFAULT);

		Composite gParent = new Composite(getContainer(), SWT.NONE);
		gParent.setLayout(new FillLayout());

		// SashForm parent = new SashForm(gParent, SWT.VERTICAL | SWT.V_SCROLL | SWT.H_SCROLL);
		// parent.setLayout(new FillLayout());

		Composite parent = new Composite(gParent, SWT.NONE);
		parent.setLayout(new PropertiesLayout());

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			// Create a page for the selection tree view.
			//

			final PatternViewerFilter filter = new PatternViewerFilter();
			filter.setShowIfHasVisibleParent(true);

			final StringEditor filterPattern = new StringEditor(parent, SWT.NONE, "Filter");
			filterPattern.addCommitListener(new ICommitListener() {

				@Override
				public void commit(AbstractEditor editor) {
					filter.setPattern((String) filterPattern.getValue());
					selectionViewer.refresh();
				}

			});

			Tree tree = new Tree(parent, getTreeStyle() | SWT.MULTI);
			tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			selectionViewer = new TreeViewer(tree);
			selectionViewer.setFilters(new ViewerFilter[] { filter });
			setCurrentViewer(selectionViewer);

			initializeCustomizationCatalogManager();

			IStructuredContentProvider contentProvider = createContentProvider();

			ILabelProvider labelProvider = createLabelProvider();

			editingDomain.getCommandStack().addCommandStackListener(this);

			selectionViewer.setContentProvider(contentProvider);
			selectionViewer.setLabelProvider(labelProvider);

			selectionViewer.setInput(getTreeViewerInput());
			// selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);

			new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

			createContextMenuFor(selectionViewer);
			int pageIndex = addPage(gParent);
			setPageText(pageIndex, "Model"); //$NON-NLS-1$

			setActivePage(0);

			parent.layout();
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {

			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		if (getActionBarContributor() instanceof ActionBarContributor) {
			((ActionBarContributor) getActionBarContributor()).setEditingDomain(getEditingDomain());
		}

		updateProblemIndication();
	}

	@Override
	protected void handleChangedResources() {
		super.handleChangedResources();
		getViewer().setInput(getTreeViewerInput());
	}

	protected Object getTreeViewerInput() {
		List<EObject> roots = new LinkedList<EObject>();
		for (Resource resource : getResourceSet().getResources()) {
			for (EObject rootEObject : resource.getContents()) {
				roots.add(rootEObject);
			}
		}
		return roots;
	}

	protected int getTreeStyle() {
		return SWT.BORDER;
	}

	@Override
	protected void initializeEditingDomain() {
		ResourceSet resourceSet = new ResourceSetImpl();

		editingDomain = (TransactionalEditingDomainImpl) TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		editingDomain.setResourceToReadOnlyMap(new HashMap<Resource, Boolean>());

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		editingDomain.getCommandStack().addCommandStackListener(new CommandStackListener() {

			@Override
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand.getAffectedObjects());
						}

						Iterator<PropertySheetPage> propertySheetPagesIterator = propertySheetPages.iterator();
						while (propertySheetPagesIterator.hasNext()) {
							PropertySheetPage propertySheetPage = propertySheetPagesIterator.next();
							if (propertySheetPage.getControl().isDisposed()) {
								propertySheetPagesIterator.remove();
							} else {
								propertySheetPage.refresh();
							}
						}
					}
				});
			}
		});

		adapterFactory = (ComposedAdapterFactory) editingDomain.getAdapterFactory();
	}

	@Override
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator("newChild")); //$NON-NLS-1$
		contextMenu.add(new Separator("additions")); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		System.out.println(menu.hashCode());
		System.out.println(contextMenu.hashCode());

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new MoDiscoDropAdapter(editingDomain, viewer));
	}

	@Override
	public IPropertySheetPage getPropertySheetPage() {
		if (iPropertySheetPage == null) {
			iPropertySheetPage = new TabbedPropertySheetPage(this);
		}
		return iPropertySheetPage;
	}

	protected final ICustomizationManager getCustomizationManager() {
		if (customizationManager == null) {
			customizationManager = createCustomizationManager();
		}
		return customizationManager;
	}

	protected ICustomizationManager createCustomizationManager() {
		return org.eclipse.papyrus.infra.emf.Activator.getDefault().getCustomizationManager();
	}

	protected void initializeCustomizationCatalogManager() {
		// ICustomizationCatalogManager customCatalog = ICustomizationCatalogManagerFactory.DEFAULT.getOrCreateCustomizationCatalogManager(getResourceSet());
		// ICustomizationCatalogManager customCatalog = Activator.getDefault().getCustomizationManager();
		// List<Customization> allCustomizations = customCatalog.getRegisteredCustomizations();
		// for (Customization customization : allCustomizations) {
		// if (customization.isMustBeLoadedByDefault()) {
		// System.out.println("Apply default customization: " + customization.getName());
		// getCustomizationManager().getManagedCustomizations().add(customization);
		// }
		// }
	}

	protected IStructuredContentProvider createContentProvider() {
		return ICustomizedContentProviderFactory.DEFAULT.createCustomizedTreeContentProvider(getCustomizationManager());
	}

	protected ResourceSet getResourceSet() {
		return getEditingDomain().getResourceSet();
	}

	protected ILabelProvider createLabelProvider() {
		LabelProviderService labelService = new LabelProviderServiceImpl();
		try {
			labelService.startService();
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}
		return labelService.getLabelProvider();
	}

	@Override
	public void commandStackChanged(EventObject event) {
		getViewer().refresh();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	@Override
	public String getContributorId() {
		return PROPERTY_VIEW_ID;
	}

	private ICustomizationManager customizationManager;
}
