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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
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


public class TransformationConfigPage extends WizardPage {

	protected Config config;

	protected Collection<Object> selectedFiles;

	protected Collection<Object> transformationFiles;

	protected CheckboxTableViewer listViewer;

	protected ISelectionChangedListener listListener;

	protected DisplayEngine displayEngine;

	protected SelectionListener buttonListener;

	private Button selectAll;

	private Button deselectAll;


	/**
	 *
	 * Constructor.
	 *
	 * @param selectedFiles
	 */
	public TransformationConfigPage(Collection<Object> selectedFiles) {
		super("Parameters selection"); //$NON-NLS-1$
		setTitle("Define the transformation parameters"); //$NON-NLS-1$
		setDescription("Select the files and the configuration options for the transformation"); //$NON-NLS-1$
		//		String iconPath = "icons/import_wiz_75x66.png"; //$NON-NLS-1$
		// ImageDescriptor imgDescriptior = Activator.getDefault().getImageDescriptor(iconPath);
		// setImageDescriptor(imgDescriptior);
		this.selectedFiles = selectedFiles;
		transformationFiles = new LinkedList<Object>();
		config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite workArea = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout(1, false);
		workArea.setLayout(layout);

		Composite filesComposite = new Composite(workArea, SWT.BORDER);
		filesComposite.setLayout(new FillLayout());
		filesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite configComposite = new Composite(workArea, SWT.BORDER);
		configComposite.setLayout(new FillLayout());
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		createFilesComposite(filesComposite, selectedFiles);

		createParamComposite(configComposite);

		setControl(workArea);
	}


	/**
	 *
	 * Fill the selection area with all the files selected previously
	 *
	 * @param parent
	 * @param selectedFiles
	 */
	protected void createFilesComposite(Composite parent, Collection<Object> selectedFiles) {
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

		listViewer.setInput(selectedFiles);

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
