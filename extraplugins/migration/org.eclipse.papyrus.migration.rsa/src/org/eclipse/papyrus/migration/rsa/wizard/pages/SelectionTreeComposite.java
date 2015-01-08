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

import java.io.File;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.infra.widgets.providers.IGraphicalContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.PatternViewerFilter;
import org.eclipse.papyrus.infra.widgets.providers.WorkspaceContentProvider;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * 
 * Actual composite used to display the workspace and select the wanted elements
 * 
 * @author Quentin Le Menez
 *
 */
public class SelectionTreeComposite extends Composite {

	protected TreeViewer treeViewer;

	protected LabelProviderService labelProviderService;

	protected ILabelProvider labelProvider;

	protected WorkspaceContentProvider contentProvider;

	protected ISelectionChangedListener listListener;

	protected final List<String> filterNames;

	protected final List<String> filterExtensions;

	protected Button selectAll;

	protected Button deselectAll;

	protected SelectionListener buttonListener;

	protected Collection<Object> selectedFiles;

	protected FillLayout layout;

	protected DialogData dialogData;

	/**
	 * 
	 * Constructor.
	 *
	 * @param parent
	 *            The parent composite
	 * @param style
	 *            The swt style used for this ConfigurationComposite
	 * @param extensions
	 *            The default extensions used to filter the displayed results
	 * @param extensionsNames
	 *            The displayed names of those filters
	 */
	public SelectionTreeComposite(Composite parent, int style, String[] extensions, String[] extensionsNames) {
		super(parent, style);
		this.setLayout(new GridLayout(2, false));
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		selectedFiles = new LinkedList<Object>();
		filterNames = new LinkedList<String>();
		filterExtensions = new LinkedList<String>();

		createTreeViewerComposite(extensions, extensionsNames);

		createSelectionButtons(this);
	}

	/**
	 * 
	 * Constructor used when a DialogData class is employed to store the different informations of the dialog
	 *
	 * @param parent
	 *            The parent composite
	 * @param style
	 *            The swt style used for this ConfigurationComposite
	 * @param dialogData
	 *            The DialogData in which is stored all the necessary informations
	 */
	public SelectionTreeComposite(Composite parent, int style, DialogData dialogData) {
		this(parent, style, dialogData.getExtensions(), dialogData.getExtensionsNames());
		this.dialogData = dialogData;
		ISelection treeSelection = treeViewer.getSelection();
		if (treeSelection instanceof StructuredSelection) {
			setSelectedFiles(((StructuredSelection) treeSelection).toArray());
			this.dialogData.setSelectedFiles(getSelectedFiles());
		}

	}

	/**
	 * 
	 * Creates the visual representation of the workspace
	 * 
	 * @param extensions
	 *            The default extensions used to filter the displayed results
	 * @param extensionsNames
	 *            The displayed names of those filters
	 */
	private void createTreeViewerComposite(String[] extensions, String[] extensionsNames) {
		Composite treeViewerComposite = new Composite(this, SWT.NONE);
		treeViewerComposite.setLayout(new GridLayout(1, true));
		treeViewerComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		Composite beforeTreeComposite = new Composite(treeViewerComposite, SWT.NONE);

		Composite treeComposite = new Composite(treeViewerComposite, SWT.NONE);
		treeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout = new FillLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		treeComposite.setLayout(layout);

		treeViewer = new TreeViewer(treeComposite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		treeViewer.setFilters(new ViewerFilter[] { new PatternFilter() });

		labelProviderService = new LabelProviderServiceImpl();
		try {
			labelProviderService.startService();
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}

		labelProvider = labelProviderService.getLabelProvider();
		contentProvider = new WorkspaceContentProvider();
		setFilters(extensions, extensionsNames);

		contentProvider.setExtensionFilters(new LinkedHashMap<String, String>());
		for (int i = 0; i < Math.min(filterNames.size(), filterExtensions.size()); i++) {
			contentProvider.addExtensionFilter(filterExtensions.get(i), filterNames.get(i));
		}

		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		listListener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();

				if (selection instanceof IStructuredSelection) {
					selectedFiles.clear();
					IStructuredSelection sSelection = (IStructuredSelection) selection;
					setSelectedFiles(sSelection.toArray());

					if (dialogData != null) {
						dialogData.setSelectedFiles(selectedFiles);
					}
				}
			}
		};

		treeViewer.addSelectionChangedListener(listListener);

		treeViewer.setInput(File.listRoots());

		// get the selection in the workspace at the time of the launch
		ISelection workbenchSelection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		// set the first selection of the treeviewer from the selection in the workspace
		treeViewer.setSelection(workbenchSelection, true);
		// treeViewer.setSelection(new StructuredSelection(dialogData), true);

		if (contentProvider instanceof IGraphicalContentProvider) {
			IGraphicalContentProvider graphicalContentProvider = contentProvider;

			beforeTreeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			layout = new FillLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			beforeTreeComposite.setLayout(layout);
			graphicalContentProvider.createBefore(beforeTreeComposite);
			beforeTreeComposite.moveAbove(treeViewer.getTree());

			Composite afterTreeComposite = new Composite(treeViewerComposite, SWT.NONE);
			layout = new FillLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			afterTreeComposite.setLayout(layout);
			afterTreeComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			graphicalContentProvider.createAfter(afterTreeComposite);
		}

	}

	protected void setFilters(String[] filterExtensions, String[] filterNames) {
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

	protected void setFilterExtensions(String[] filterExtensions) {
		this.filterExtensions.clear();
		this.filterExtensions.addAll(Arrays.asList(filterExtensions));
	}

	protected void setFilterNames(String[] filterNames) {
		this.filterNames.clear();
		this.filterNames.addAll(Arrays.asList(filterNames));
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	/**
	 *
	 * Fills the composite with the selection buttons
	 *
	 * @param parent
	 *            The parent composite
	 */
	public void createSelectionButtons(Composite parent) {
		Composite buttonsComposite = new Composite(parent, SWT.NONE);
		buttonsComposite.setLayout(new GridLayout());
		// Color defaultColor = new Color(Display.getDefault(), new RGB(255, 255, 255));
		// treeViewerComposite.setBackground(defaultColor);

		buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				if ((Boolean) ((Button) event.widget).getData()) {
					treeViewer.getTree().selectAll();
					// updates the selectedFiles collection
					getNestedFiles(((IStructuredSelection) treeViewer.getSelection()).toArray());

					if (dialogData != null) {
						dialogData.setSelectedFiles(selectedFiles);
					}
				} else {
					treeViewer.getTree().deselectAll();
					selectedFiles.clear();

					if (dialogData != null) {
						dialogData.setSelectedFiles(selectedFiles);
					}
				}
			}
		};

		selectAll = new Button(buttonsComposite, SWT.PUSH);
		selectAll.setText(Messages.Button_SelectAll);
		selectAll.setData(true);
		selectAll.addSelectionListener(buttonListener);
		selectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		deselectAll = new Button(buttonsComposite, SWT.PUSH);
		deselectAll.setText(Messages.Button_DeselectAll);
		deselectAll.setData(false);
		deselectAll.addSelectionListener(buttonListener);
		deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	}

	public void setSelectedFiles(Object[] elements) {
		// get the viewer selection to obtain the filtered files
		getNestedFiles(elements);
	}

	public Collection<Object> getSelectedFiles() {
		return selectedFiles;
	}

	/**
	 *
	 * Gets all the files from the user's selection in the viewer
	 *
	 * @param nestedElements
	 */
	protected void getNestedFiles(Object[] nestedElements) {
		Collection<Object> projectList = new LinkedList<Object>();
		Collection<Object> folderList = new LinkedList<Object>();
		List<PatternViewerFilter> currentFilters = new ArrayList<PatternViewerFilter>();
		for (ViewerFilter filter : treeViewer.getFilters()) {
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
					isVisible = currentFilters.get(index).isVisible(treeViewer, selectedFile.getParent(), selectedFile);
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

	@Override
	public void dispose() {
		if (buttonListener != null) {
			selectAll.removeSelectionListener(buttonListener);
			deselectAll.removeSelectionListener(buttonListener);
		}
		if (listListener != null) {
			treeViewer.removeSelectionChangedListener(listListener);
		}
		super.dispose();
	}

}
