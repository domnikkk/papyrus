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

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.papyrus.migration.rsa.messages.Messages;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.views.properties.runtime.DisplayEngine;
import org.eclipse.papyrus.views.properties.util.PropertiesDisplayHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * 
 * Actual composite used to display the previously selected elements and the migration options
 * 
 * @author Quentin Le Menez
 *
 */
public class ConfigurationComposite extends Composite {

	protected Config config;

	protected Collection<Object> transformationFiles;

	protected CheckboxTableViewer listViewer;

	protected ISelectionChangedListener listListener;

	protected DisplayEngine displayEngine;

	protected SelectionListener buttonListener;

	protected Button selectAll;

	protected Button deselectAll;

	protected DialogData dialogData;

	protected Collection<Object> uncheckedFiles;

	/**
	 * 
	 * Constructor.
	 *
	 * @param parent
	 *            The parent composite
	 * @param style
	 *            The swt style used for this ConfigurationComposite
	 * @param config
	 *            The configuration used to display the transformation options
	 */
	public ConfigurationComposite(Composite parent, int style, Config config) {
		super(parent, style);
		this.setLayout(new GridLayout(1, false));
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.config = config;

		Composite filesComposite = new Composite(this, SWT.BORDER);
		filesComposite.setLayout(new FillLayout());
		filesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite configComposite = new Composite(this, SWT.BORDER);
		configComposite.setLayout(new FillLayout());
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		createFilesComposite(filesComposite);

		createParamComposite(configComposite);
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
	public ConfigurationComposite(Composite parent, int style, DialogData dialogData) {
		this(parent, style, dialogData.getConfig());
		this.dialogData = dialogData;
		this.setViewerInput(dialogData.getSelectedFiles());
	}


	/**
	 *
	 * Fills the selection area with all the files selected previously
	 *
	 * @param parent
	 * @param selectedFiles
	 */
	protected void createFilesComposite(Composite parent) {
		Composite listComposite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		listComposite.setLayout(gridLayout);

		listViewer = CheckboxTableViewer.newCheckList(listComposite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		GridData viewerGrid = new GridData(SWT.FILL, SWT.FILL, true, true);
		listViewer.getTable().setLayoutData(viewerGrid);

		listViewer.setLabelProvider(new WorkbenchLabelProvider() {
			@Override
			protected String decorateText(String input, Object element) {
				// there should only be IFiles in the received list
				if (element instanceof IFile) {
					return FileUtil.getPath((IFile) element, true);
				} else {
					return Messages.WrongFileType;
				}
			}
		});

		listViewer.setContentProvider(new ArrayContentProvider());

		listListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				transformationFiles = new LinkedList<Object>(Arrays.asList(listViewer.getCheckedElements()));
				setUncheckedFiles();

				if (dialogData != null) {
					dialogData.setTransformationFiles(transformationFiles);
					dialogData.setUncheckedFiles(uncheckedFiles);
				}
			}
		};

		listViewer.addSelectionChangedListener(listListener);

		setTransformationFiles();

		createSelectionButtons(listComposite);

	}

	public CheckboxTableViewer getCheckboxTreeViewer() {
		return listViewer;
	}

	/**
	 * 
	 * Used to update the display from a changed selection in the ConfigPage
	 * 
	 * @param selectedFiles
	 */
	public void setViewerInput(Collection<Object> selectedFiles) {
		listViewer.setInput(selectedFiles);

		if (dialogData != null) {
			if (dialogData.getUnSelectionArray() == null) {
				// Default selection when opening the viewer without previous executions
				listViewer.setAllChecked(true);
			}
			else {
				// Recall the last unselected files to update the display
				Collection<String> previousUnSelection = Arrays.asList(dialogData.getUnSelectionArray());
				for (Object object : selectedFiles) {
					if (object instanceof IFile) {
						IFile file = (IFile) object;
						String filePath = FileUtil.getPath(file, true);
						if (previousUnSelection.contains(filePath)) {
							listViewer.setChecked(object, false);
						}
						else {
							listViewer.setChecked(object, true);
						}
					}
				}
			}

			setTransformationFiles();
			setUncheckedFiles();

			dialogData.setTransformationFiles(transformationFiles);
			dialogData.setUncheckedFiles(uncheckedFiles);
		}
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

		buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				listViewer.setAllChecked((Boolean) ((Button) event.widget).getData());
				setTransformationFiles();
				setUncheckedFiles();

				if (dialogData != null) {
					dialogData.setTransformationFiles(transformationFiles);
					dialogData.setUncheckedFiles(uncheckedFiles);
				}
			}
		};

		selectAll = new Button(buttonsComposite, SWT.PUSH);
		selectAll.setData(true);
		selectAll.setText(Messages.Button_SelectAll);
		selectAll.addSelectionListener(buttonListener);
		selectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		deselectAll = new Button(buttonsComposite, SWT.PUSH);
		deselectAll.setData(false);
		deselectAll.setText(Messages.Button_DeselectAll);
		deselectAll.addSelectionListener(buttonListener);
		deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

	}

	/**
	 * 
	 * Updates the list of files to be transformed
	 * 
	 */
	public void setTransformationFiles() {
		transformationFiles = new LinkedList<Object>(Arrays.asList(listViewer.getCheckedElements()));
	}

	public void setUncheckedFiles() {
		if (dialogData != null) {
			uncheckedFiles = new LinkedList<Object>();
			for (Object object : dialogData.getSelectedFiles()) {
				if (!transformationFiles.contains(object)) {
					uncheckedFiles.add(object);
				}
			}
			dialogData.setUncheckedFiles(uncheckedFiles);
		}
	}


	/**
	 *
	 * Fills the composite with the configuration parameters
	 *
	 * @param parent
	 *            The parent composite
	 */
	public void createParamComposite(Composite parent) {
		displayEngine = PropertiesDisplayHelper.display(config, parent);
	}

	public Collection<Object> getTransformationFiles() {
		return transformationFiles;
	}

	public Config getConfig() {
		return config;
	}

	@Override
	public void dispose() {
		if (displayEngine != null) {
			displayEngine.dispose();
		}
		if (buttonListener != null) {
			selectAll.removeSelectionListener(buttonListener);
			deselectAll.removeSelectionListener(buttonListener);
		}
		if (listListener != null) {
			listViewer.removeSelectionChangedListener(listListener);
		}
		super.dispose();
	}

}
