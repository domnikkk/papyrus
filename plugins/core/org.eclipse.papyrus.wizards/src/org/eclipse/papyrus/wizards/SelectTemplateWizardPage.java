/*******************************************************************************
 * Copyright (c) 2009 Conselleria de Infraestructuras y Transporte,
 * Generalitat de la Comunitat Valenciana .
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Francisco Javier Cano Muñoz (Prodevelop) - initial API implementation
 *
 ******************************************************************************/
package org.eclipse.papyrus.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * A wizard page that allows the selection of template models contributed via an
 * extension point.
 * 
 * @author <a href="mailto:fjcano@prodevelop.es">Francisco Javier Cano Muñoz</a>
 * @see <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=293135">Bug #293135</a>
 * 
 */
public class SelectTemplateWizardPage extends WizardPage {

	private Button newModelButton;

	private Button useTemplateButton;

	private TableViewer templateTableViewer;

	private String editorId;

	protected SelectTemplateWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	public SelectTemplateWizardPage(String editorId, WizardPage nextPage,
			WizardPage templatePage) {
		super("Select creation approach");
		this.setTitle("Select creation approach");
		this
				.setDescription("Diagrams can be created from scratch or from a template");
		this.editorId = editorId;
	}

	public String getTemplatePath() {
		if(this.useTemplateButton.getSelection()) {
			if(this.templateTableViewer.getSelection() instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)this.templateTableViewer
						.getSelection()).getFirstElement();
				if(first instanceof ModelTemplateDescription) {
					return ((ModelTemplateDescription)first).getPath();
				}
			}
		}

		return null;
	}

	public String getTemplatePluginId() {
		if(this.useTemplateButton.getSelection()) {
			if(this.templateTableViewer.getSelection() instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)this.templateTableViewer
						.getSelection()).getFirstElement();
				if(first instanceof ModelTemplateDescription) {
					return ((ModelTemplateDescription)first).getPluginId();
				}
			}
		}

		return null;
	}

	public void createControl(Composite parent) {
		Composite root = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		root.setLayout(gridLayout);
		Group composite = new Group(root, 0);
		composite.setText("Creation  approach");

		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 20;
		gridLayout.marginTop = 10;
		gridLayout.verticalSpacing = 10;
		composite.setLayout(gridLayout);
		createDialogArea(composite);

		setControl(root);
	}

	private void createDialogArea(Composite composite) {
		createApproachSelectionButtons(composite);
		createTemplatesViewer(composite);
	}

	private void createTemplatesViewer(Composite composite) {
		GridData data = new GridData(GridData.FILL_BOTH);
		templateTableViewer = new TableViewer(composite);
		templateTableViewer.getTable().setLayoutData(data);

		templateTableViewer
				.setContentProvider(new ModelTemplatesContentProvider());
		templateTableViewer.setLabelProvider(new ModelTemplatesLabelProvider());
		templateTableViewer.setInput(0);
		if(templateTableViewer.getTable().getItemCount() > 0) {
			IStructuredSelection ss = new StructuredSelection(
					templateTableViewer.getElementAt(0));
			templateTableViewer.setSelection(ss);
		} else {
			useTemplateButton.setEnabled(false);
		}
		templateTableViewer.getControl().setEnabled(false);
	}

	private void createApproachSelectionButtons(Composite composite) {
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		newModelButton = new Button(composite, SWT.RADIO);
		newModelButton.setText("Create new model");
		newModelButton.setLayoutData(data);
		newModelButton.setSelection(true);

		data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		useTemplateButton = new Button(composite, SWT.RADIO);
		useTemplateButton.setText("Initialize from template");
		useTemplateButton.setLayoutData(data);
		useTemplateButton.setSelection(false);

		useTemplateButton.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

			public void widgetSelected(SelectionEvent e) {
				if(useTemplateButton.getSelection()) {
					templateTableViewer.getControl().setEnabled(true);
				} else {
					templateTableViewer.getControl().setEnabled(false);
				}
			}

		});

	}

	private class ModelTemplatesContentProvider implements
			IStructuredContentProvider {

		private static final String extensionPointId = "org.eclipse.papyrus.wizards.templates";

		private static final String ATTRIBUTE_NAME = "name";

		private static final String ATTRIBUTE_FILE = "file";

		public void dispose() {
			// TODO Auto-generated method stub

		}

		private Object[] getTemplatesDescription() {
			List<ModelTemplateDescription> templates = new ArrayList<ModelTemplateDescription>();

			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtension[] extensions = registry.getExtensionPoint(
					extensionPointId).getExtensions();

			for(IExtension extension : extensions) {
				templates.addAll(processExtension(extension));
			}

			return templates.toArray();
		}

		private Collection<ModelTemplateDescription> processExtension(
				IExtension extension) {
			List<ModelTemplateDescription> templates = new ArrayList<ModelTemplateDescription>();
			for(IConfigurationElement configElement : extension
					.getConfigurationElements()) {
				templates.add(new ModelTemplateDescription(configElement
						.getAttribute(ATTRIBUTE_NAME), extension
						.getContributor().getName(), configElement
						.getAttribute(ATTRIBUTE_FILE)));
			}
			return templates;
		}

		public Object[] getElements(Object inputElement) {
			return getTemplatesDescription();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			if(viewer instanceof TableViewer) {
				((TableViewer)viewer).add(getElements(null));
			}
		}

	}

	private class ModelTemplateDescription {

		private String name;

		// private String metamodelURI;
		private String path;

		private String pluginId;

		public ModelTemplateDescription(String name, String pluginId,
				String path) {
			super();
			this.name = name;
			// this.e = metamodelURI;
			this.path = path;
			this.pluginId = pluginId;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		// /**
		// * @return the metamodelURI
		// */
		// public String getMetamodelURI() {
		// return metamodelURI;
		// }

		/**
		 * @return the path
		 */
		public String getPath() {
			return path;
		}

		public String getFileName() {
			String[] pathParts = path.split("/");
			return pathParts[pathParts.length - 1];
		}

		public String getPluginId() {
			return pluginId;
		}

	}

	private class ModelTemplatesLabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			if(element instanceof ModelTemplateDescription) {
				ModelTemplateDescription modelTemplate = (ModelTemplateDescription)element;
				return modelTemplate.getName() + " ("
						+ modelTemplate.getFileName() + ")";
			}
			return null;
		}

		public void addListener(ILabelProviderListener listener) {

		}

		public void dispose() {

		}

		public boolean isLabelProperty(Object element, String property) {

			return false;
		}

		public void removeListener(ILabelProviderListener listener) {

		}

	}

}
