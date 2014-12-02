/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.wizard.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelectionListener;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.messages.Messages;
import org.eclipse.papyrus.infra.widgets.providers.PatternViewerFilter;
import org.eclipse.papyrus.infra.widgets.providers.WorkspaceContentProvider;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class TransformationScopePage extends WizardSelectionPage implements IElementSelectionListener {

	protected ILabelProvider labelProvider;

	protected Collection<Object> selectedFiles;

	protected FilteredReferenceSelector selector;

	protected final List<String> filterNames;

	protected final List<String> filterExtensions;

	protected TransformationNode wizardNode;

	protected WorkspaceContentProvider contentProvider;

	protected StructuredViewer pageViewer;

	private Button selectAll;

	private Button deselectAll;

	protected SelectionListener buttonListener;

	/**
	 *
	 * Constructor.
	 *
	 */
	public TransformationScopePage() {
		super("Workspace selection");
		setTitle("Select a scope for the transformation");
		setDescription("Select the folders or files for the transformation");
		//		String iconPath = "icons/import_wiz_75x66.png"; //$NON-NLS-1$
		// ImageDescriptor imgDescriptior = Activator.getDefault().getImageDescriptor(iconPath);
		// setImageDescriptor(imgDescriptior);
		filterNames = new LinkedList<String>();
		filterExtensions = new LinkedList<String>();
		selectedFiles = new LinkedList<Object>();
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite workArea = new Composite(parent, SWT.NONE);
		workArea.setLayout(new GridLayout());

		Composite selectionComposite = new Composite(workArea, SWT.NONE);
		selectionComposite.setLayout(new GridLayout(2, false));
		selectionComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// initialize the filters used to select the files in the workspace explorer
		String[] filterExtensions = { "*", "*.emx", "*.epx", "*.epx;*.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$
		String[] filterNames = { "All", "*.emx", "*.epx", "*.epx and *.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$
		selector = setSelector(filterExtensions, filterNames);
		createSelectionWindow(selectionComposite, selector);
		createButtonsWindow(selectionComposite);

		setControl(workArea);
	}


	/**
	 *
	 * Create the selector used to display the workspace and the filters' combo box and field
	 *
	 * @param extensions
	 * @param names
	 * @return
	 *         selector
	 */
	private FilteredReferenceSelector setSelector(String[] extensions, String[] names) {

		// create the label provider used to initialize the selector
		LabelProviderService labelProviderService = new LabelProviderServiceImpl();
		try {
			labelProviderService.startService();
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}

		ILabelProvider labelProvider = labelProviderService.getLabelProvider();

		if (labelProvider != null) {
			setLabelProvider(labelProvider);
		}

		final FilteredReferenceSelector selector = new FilteredReferenceSelector();
		selector.setLabelProvider(labelProvider);

		setFilters(extensions, names);

		// Prepare the WorkspaceContentProvider and use the right filters
		contentProvider = new WorkspaceContentProvider() {

			ISelectionChangedListener listener;

			Viewer viewer;

			@Override
			public void inputChanged(final Viewer viewer, Object oldInput, Object newInput) {
				super.inputChanged(viewer, oldInput, newInput);

				// add a listener in order to know what elements are selected by the user
				listener = new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						selectedFiles.clear();
						setSelectedFiles(selector.getSelectedElements());
					}
				};

				if (viewer instanceof StructuredViewer) {
					this.viewer = viewer;
					this.viewer.addSelectionChangedListener(listener);
				}


			}

			@Override
			public void dispose() {
				if (viewer != null && listener != null && !viewer.getControl().isDisposed()) {
					viewer.removeSelectionChangedListener(listener);
				}
				super.dispose();
			}
		};

		contentProvider.setExtensionFilters(new LinkedHashMap<String, String>());
		for (int i = 0; i < Math.min(filterNames.size(), filterExtensions.size()); i++) {
			contentProvider.addExtensionFilter(filterExtensions.get(i), filterNames.get(i));
		}

		selector.setContentProvider(contentProvider);
		selector.addElementSelectionListener(this);

		return selector;
	}

	/**
	 *
	 * Fill the composite with the viewer and filter areas
	 *
	 * @param parent
	 * @param selector
	 */
	public void createSelectionWindow(Composite parent, IElementSelector selector) {

		Composite selectionArea = new Composite(parent, SWT.NONE);
		selectionArea.setLayout(new FillLayout());
		selectionArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		selector.createControls(selectionArea);
	}

	/**
	 *
	 * Fill the composite with the selection buttons
	 *
	 * @param parent
	 */
	public void createButtonsWindow(Composite parent) {
		Composite buttonsComposite = new Composite(parent, SWT.NONE);
		buttonsComposite.setLayout(new GridLayout());

		buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				if ((Boolean) ((Button) event.widget).getData()) {
					pageViewer.setSelection(new StructuredSelection(selector.getAllElements()), true);
				} else {
					pageViewer.setSelection(null, true);
				}
			}
		};

		selectAll = new Button(buttonsComposite, SWT.PUSH);
		selectAll.setText("Select All");
		selectAll.setData(true);
		selectAll.addSelectionListener(buttonListener);
		selectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		deselectAll = new Button(buttonsComposite, SWT.PUSH);
		deselectAll.setText("Deselect All");
		deselectAll.setData(false);
		deselectAll.addSelectionListener(buttonListener);
		deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	}


	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}


	public void setFilters(String[] filterExtensions, String[] filterNames) {
		if (filterExtensions.length != filterNames.length) {
			// This is a simple warning. Only valid filters will be retained.
			Activator.log.warn(Messages.MultipleStringFileEditor_2);
		}

		setFilterNames(getFilterLabels(filterNames, filterExtensions));
		setFilterExtensions(filterExtensions);
	}

	protected String[] getFilterLabels(String[] filterNames, String[] filterExtensions) {
		int size = Math.min(filterNames.length, filterExtensions.length);
		String[] filters = new String[size];
		for (int i = 0; i < size; i++) {
			filters[i] = filterNames[i] + " (" + filterExtensions[i] + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return filters;
	}

	public void setFilterExtensions(String[] filterExtensions) {
		this.filterExtensions.clear();
		this.filterExtensions.addAll(Arrays.asList(filterExtensions));
	}

	public void setFilterNames(String[] filterNames) {
		this.filterNames.clear();
		this.filterNames.addAll(Arrays.asList(filterNames));
	}


	@Override
	public void addElements(Object[] elements) {

	}

	public void setSelectedFiles(Object[] elements) {
		// get the viewer selection to obtain the filtered files
		getNestedFiles(elements);

		// create the next page using the filtered files
		if (selectedFiles.size() > 0) {
			wizardNode = new TransformationNode(selectedFiles);
			setSelectedNode(wizardNode);
		} else {
			setSelectedNode(null);
		}
	}

	/**
	 *
	 * Get all the files from the user's selection in the viewer
	 *
	 * @param nestedElements
	 */
	public void getNestedFiles(Object[] nestedElements) {
		Collection<Object> projectList = new LinkedList<Object>();
		Collection<Object> folderList = new LinkedList<Object>();
		List<PatternViewerFilter> currentFilters = new ArrayList<PatternViewerFilter>();
		for (ViewerFilter filter : pageViewer.getFilters()) {
			if (filter instanceof PatternViewerFilter) {
				currentFilters.add((PatternViewerFilter) filter);
			}
		}

		for (Object element : nestedElements) {
			if (element instanceof IProject) {
				projectList.add(element);
			}
			if (element instanceof IFolder) {
				folderList.add(element);
			}
			if (element instanceof IFile) {
				Boolean isVisible = false;
				IFile selectedFile = (IFile) element;
				String fileExtension = "*." + selectedFile.getFileExtension(); //$NON-NLS-1$
				if (filterExtensions.contains(fileExtension) && !selectedFiles.contains(selectedFile)) {
					isVisible = true;
				}
				for (int index = 0; index < currentFilters.size() && isVisible; index++) {
					isVisible = currentFilters.get(index).isVisible(pageViewer, selectedFile.getParent(), selectedFile);
				}
				if (isVisible) {
					selectedFiles.add(selectedFile);
				}
			}
		}

		if (projectList.size() > 0) {
			for (Object element : projectList) {
				IProject selectedProject = (IProject) element;
				try {
					getNestedFiles(selectedProject.members());
				} catch (CoreException e) {
					Activator.log.error(e);
				}
			}
		}

		if (folderList.size() > 0) {
			for (Object element : folderList) {
				IFolder selectedFolder = (IFolder) element;
				try {
					getNestedFiles(selectedFolder.members());
				} catch (CoreException e) {
					Activator.log.error(e);
				}
			}
		}
	}

	/**
	 *
	 * Activates the Next page button if the user has selected at least one file
	 *
	 * @see org.eclipse.jface.wizard.WizardSelectionPage#getNextPage()
	 *
	 * @return
	 */
	@Override
	public IWizardPage getNextPage() {
		if (wizardNode == null) {
			return null;
		}

		boolean isCreated = wizardNode.isContentCreated();
		IWizard configWizard = wizardNode.getWizard();

		if (configWizard == null) {
			return null;
		}

		if (!isCreated) {
			configWizard.addPages();
		}

		return configWizard.getStartingPage();

	}

	private class FilteredReferenceSelector extends ReferenceSelector {

		@Override
		public void createControls(Composite parent) {
			super.createControls(parent);
			pageViewer = treeViewer;
		}
	}

	@Override
	public void dispose() {
		if (buttonListener != null) {
			selectAll.removeSelectionListener(buttonListener);
			deselectAll.removeSelectionListener(buttonListener);
		}
		super.dispose();
	}

}
