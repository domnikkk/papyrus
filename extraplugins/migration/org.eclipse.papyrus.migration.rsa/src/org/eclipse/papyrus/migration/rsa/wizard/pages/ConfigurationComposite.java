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


public class ConfigurationComposite extends Composite {

	protected Config config;

	protected Collection<Object> transformationFiles;

	protected CheckboxTableViewer listViewer;

	protected ISelectionChangedListener listListener;

	protected DisplayEngine displayEngine;

	protected SelectionListener buttonListener;

	private Button selectAll;

	private Button deselectAll;


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
	 * Fill the selection area with all the files selected previously
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
				// there are only IFiles in the received list
				return FileUtil.getPath((IFile) element, true);
			}
		});

		listViewer.setContentProvider(new ArrayContentProvider());

		listListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				transformationFiles = new LinkedList<Object>(Arrays.asList(listViewer.getCheckedElements()));
			}
		};

		listViewer.addSelectionChangedListener(listListener);

		listViewer.setAllChecked(true);
		setTransformationFiles();

		createSelectionButtons(listComposite);

	}

	public void setViewerInput(Collection<Object> selectedFiles) {
		listViewer.setInput(selectedFiles);
		listViewer.setAllChecked(true);
		setTransformationFiles();
	}

	/**
	 *
	 * Fill the composite with the selection buttons
	 *
	 * @param parent
	 */
	public void createSelectionButtons(Composite parent) {
		Composite buttonsComposite = new Composite(parent, SWT.NONE);
		buttonsComposite.setLayout(new GridLayout());

		buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				listViewer.setAllChecked((Boolean) ((Button) event.widget).getData());
				setTransformationFiles();
			}
		};

		selectAll = new Button(buttonsComposite, SWT.PUSH);
		selectAll.setData(true);
		selectAll.setText("Select All"); //$NON-NLS-1$
		selectAll.addSelectionListener(buttonListener);
		selectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		deselectAll = new Button(buttonsComposite, SWT.PUSH);
		deselectAll.setData(false);
		deselectAll.setText("Deselect All"); //$NON-NLS-1$
		deselectAll.addSelectionListener(buttonListener);
		deselectAll.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

	}

	public void setTransformationFiles() {
		transformationFiles = new LinkedList<Object>(Arrays.asList(listViewer.getCheckedElements()));
	}


	/**
	 *
	 * Fill the composite with the parameters buttons
	 *
	 * @param parent
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
