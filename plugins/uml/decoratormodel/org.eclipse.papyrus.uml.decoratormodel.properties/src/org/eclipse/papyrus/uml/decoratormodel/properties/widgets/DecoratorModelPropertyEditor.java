/*****************************************************************************
 * Copyright (c) 2011, 2014 CEA LIST, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.properties.widgets;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.widgets.editors.AbstractListEditor;
import org.eclipse.papyrus.uml.decoratormodel.internal.properties.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.commands.UnloadDecoratorModelHandler;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.DecoratorModelLabelProvider;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.DuplicateDecoratorModelWizard;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.LoadProfileApplicationsWizard;
import org.eclipse.papyrus.uml.decoratormodel.properties.Activator;
import org.eclipse.papyrus.views.properties.widgets.AbstractPropertyEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Property sheet editor for the "decorator models" property of a package.
 */
public class DecoratorModelPropertyEditor extends AbstractPropertyEditor {

	public DecoratorModelPropertyEditor(Composite parent, int style) {
		super(new DecoratorModelEditor(parent, style));
	}

	//
	// Nested types
	//

	static class DecoratorModelEditor extends AbstractListEditor implements IChangeListener {

		private TableViewer table;

		private Button loadButton;

		private Button unloadButton;

		private Button duplicateButton;

		private boolean preservingSelection;

		protected DecoratorModelEditor(Composite parent, int style) {
			super(parent, style, Messages.DecoratorModelPropertyEditor_0);
			setLayout(new GridLayout(2, false));

			createActionButtons(this);

			table = new TableViewer(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.MULTI);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.minimumHeight = 140;
			gd.horizontalSpan = 2;
			table.getTable().setLayoutData(gd);
			TableLayout tableLayout = new TableLayout(true);
			table.getTable().setLayout(tableLayout);
			table.getTable().setHeaderVisible(true);
			table.getTable().setLinesVisible(true);
			table.setContentProvider(ArrayContentProvider.getInstance());

			TableViewerColumn stateColumn = new TableViewerColumn(table, SWT.NONE);
			stateColumn.getColumn().setText(Messages.DecoratorModelPropertyEditor_1);
			stateColumn.setLabelProvider(new StateCellLabelProvider());
			tableLayout.addColumnData(new ColumnWeightData(25, 100, true));

			TableViewerColumn resourceColumn = new TableViewerColumn(table, SWT.NONE);
			resourceColumn.getColumn().setText(Messages.DecoratorModelPropertyEditor_2);
			resourceColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new DecoratorModelLabelProvider()));
			tableLayout.addColumnData(new ColumnWeightData(75, 350, true));

			table.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					updateButtons();
				}
			});
			table.addDoubleClickListener(new IDoubleClickListener() {

				public void doubleClick(DoubleClickEvent event) {
					if (loadButton.isEnabled()) {
						loadDecoratorModels();
					}
				}
			});

			updateButtons();
		}

		protected void createActionButtons(Composite parent) {
			Composite buttonsArea = new Composite(parent, SWT.NONE);
			buttonsArea.setLayoutData(new GridData(SWT.END, SWT.DEFAULT, false, false));
			buttonsArea.setLayout(new RowLayout());

			loadButton = new Button(buttonsArea, SWT.PUSH);
			loadButton.setImage(Activator.getDefault().getImage("/icons/full/dtool16/load_resource.png")); //$NON-NLS-1$
			loadButton.setToolTipText(Messages.DecoratorModelPropertyEditor_3);

			unloadButton = new Button(buttonsArea, SWT.PUSH);
			unloadButton.setImage(Activator.getDefault().getImage("/icons/full/ctool16/unload_resource.png")); //$NON-NLS-1$
			unloadButton.setToolTipText(Messages.DecoratorModelPropertyEditor_4);

			duplicateButton = new Button(buttonsArea, SWT.PUSH);
			duplicateButton.setImage(Activator.getDefault().getImage("/icons/full/ctool16/dup_resource.png")); //$NON-NLS-1$
			duplicateButton.setToolTipText(Messages.DecoratorModelPropertyEditor_5);

			SelectionListener action = new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					action((Button) e.widget);
				}
			};

			loadButton.addSelectionListener(action);
			unloadButton.addSelectionListener(action);
			duplicateButton.addSelectionListener(action);
		}

		protected void action(Button button) {
			if (button == loadButton) {
				loadDecoratorModels();
			} else if (button == unloadButton) {
				unloadDecoratorModels();
			} else if (button == duplicateButton) {
				duplicateDecoratorModel();
			}
			updateButtons();
		}

		@Override
		protected void doBinding() {
			super.doBinding();

			table.setInput(modelProperty);
			modelProperty.addChangeListener(this);
		}

		public void handleChange(ChangeEvent event) {
			if (!isDisposed()) {
				preservingSelection(new Runnable() {

					public void run() {
						table.refresh();
					}
				});
			}
		}

		protected Package getPackage() {
			return (Package) getContextElement();
		}

		protected void loadDecoratorModels() {
			Set<URI> resources = ImmutableSet.copyOf(Iterables.filter(((IStructuredSelection) table.getSelection()).toList(), URI.class));
			if (!Iterables.isEmpty(resources)) {
				final LoadProfileApplicationsWizard wizard = new LoadProfileApplicationsWizard(false, true);
				wizard.init(getPackage(), resources);

				preservingSelection(new Runnable() {

					public void run() {
						if (wizard.isComplete()) {
							// Just do it
							wizard.performFinish();
						} else {
							new WizardDialog(getShell(), wizard).open();
						}
					}
				});
			}
		}

		protected void unloadDecoratorModels() {
			final Iterable<Resource> resources = Iterables.filter(((IStructuredSelection) table.getSelection()).toList(), Resource.class);
			if (!Iterables.isEmpty(resources)) {
				final ResourceSet rset = Iterables.getFirst(resources, null).getResourceSet();

				preservingSelection(new Runnable() {

					public void run() {
						try {
							UnloadDecoratorModelHandler.unloadResources(Activator.getActiveWorkbenchWindow(), rset, resources);
						} catch (ExecutionException e) {
							Throwable exc = (e.getCause() != null) ? e.getCause() : e;
							IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.DecoratorModelPropertyEditor_6, exc);
							Activator.getDefault().getLog().log(status);
							StatusManager.getManager().handle(status, StatusManager.SHOW);
						}
					}
				});
			}
		}

		protected void duplicateDecoratorModel() {
			final Object selected = ((IStructuredSelection) table.getSelection()).getFirstElement();
			if (selected != null) {
				preservingSelection(new Runnable() {

					public void run() {
						DuplicateDecoratorModelWizard wizard = new DuplicateDecoratorModelWizard();
						wizard.init(EMFHelper.getResourceSet(getPackage()), selected);
						new WizardDialog(getShell(), wizard).open();
					}
				});
			}
		}

		protected void updateButtons() {
			List<?> selection = ((IStructuredSelection) table.getSelection()).toList();

			boolean enableLoad = !selection.isEmpty();
			boolean enableUnload = enableLoad;
			boolean enableDup = selection.size() == 1;

			if (enableLoad) {
				for (Object next : selection) {
					enableLoad = enableLoad && !(next instanceof Resource);
					enableUnload = enableUnload && (next instanceof Resource);
				}
			}

			loadButton.setImage(Activator.getDefault().getImage(enableLoad ? "/icons/full/etool16/load_resource.png" : "/icons/full/dtool16/load_resource.png")); //$NON-NLS-1$ //$NON-NLS-2$
			loadButton.setEnabled(enableLoad);
			unloadButton.setEnabled(enableUnload);
			duplicateButton.setEnabled(enableDup);
		}

		void preservingSelection(Runnable runnable) {
			final boolean wasPreservingSelection = preservingSelection;
			List<Object> selection = null;
			Set<URI> uris = null;

			if (!preservingSelection) {
				selection = Lists.newArrayList((Iterator<?>) ((IStructuredSelection) table.getSelection()).iterator());
				uris = Sets.newHashSet();
				for (Object next : selection) {
					if (next instanceof Resource) {
						next = ((Resource) next).getURI();
					}
					if (next instanceof URI) {
						uris.add((URI) next);
					}
				}

				preservingSelection = true;
			}

			try {
				runnable.run();
			} finally {
				preservingSelection = wasPreservingSelection;

				if (selection != null) {
					selection.clear();
					for (Object next : modelProperty) {
						URI uri = (next instanceof Resource) ? ((Resource) next).getURI() : (next instanceof URI) ? (URI) next : null;
						if (uris.contains(uri)) {
							selection.add(next);
						}
					}
					table.setSelection(new StructuredSelection(selection), true);
					updateButtons();
				}
			}
		}

		@Override
		public Object getEditableType() {
			return List.class;
		}

		@Override
		public void setReadOnly(boolean readOnly) {
			// Pass
		}

		@Override
		public boolean isReadOnly() {
			return true;
		}

	}

	static class StateCellLabelProvider extends CellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			cell.setText((cell.getElement() instanceof Resource) ? Messages.DecoratorModelPropertyEditor_7 : Messages.DecoratorModelPropertyEditor_8);
		}
	}
}
