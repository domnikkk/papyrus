/*
 * Copyright (c) 2013, 2015 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - Initial API and implementation
 *   Christian W. Damus (CEA) - bug 431953 (adapted from SwitchProfileDialog)
 *   Christian W. Damus - bug 451338
 *   Christian W. Damus - bug 451557
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - bug 454997
 *   Christian W. Damus - bug 436666
 *   Christian W. Damus - bug 458736
 *
 */
package org.eclipse.papyrus.uml.modelrepair.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResourceSet;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.markerlistener.dialogs.DiagnosticDialog;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.uml.modelrepair.Activator;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.IRepairAction;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.IStereotypeOrphanGroup;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.ZombieStereotypesDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;


/**
 * This is the ZombieStereotypesDialog type. Enjoy.
 */
public class ZombieStereotypesDialog extends TrayDialog {

	private static final int APPLY_ID = IDialogConstants.CLIENT_ID + 1;

	private final TransactionalEditingDomain editingDomain;

	private TableViewer table;

	private LabelProviderService labelProviderService;

	private final List<ZombieStereotypesDescriptor> zombieDescriptors;

	private List<MissingSchema> missingSchemas;

	private final Collection<MissingSchema> actionsToApply;

	private ProgressMonitorPart progress;

	private Map<String, Profile> brokenNamespaceProfileMap;

	/**
	 * @param shell
	 */
	public ZombieStereotypesDialog(Shell shell, ResourceSet modelSet, Iterable<? extends ZombieStereotypesDescriptor> zombies) throws ServiceException {
		this(new SameShellProvider(shell), modelSet, zombies);
	}

	/**
	 * @param parentShell
	 */
	public ZombieStereotypesDialog(IShellProvider parentShell, ResourceSet modelSet, Iterable<? extends ZombieStereotypesDescriptor> zombies) throws ServiceException {
		super(parentShell);

		this.editingDomain = TransactionUtil.getEditingDomain(modelSet);
		this.zombieDescriptors = Lists.newArrayList(zombies);
		this.labelProviderService = ServiceUtilsForResourceSet.getInstance().getService(LabelProviderService.class, modelSet);
		this.actionsToApply = createActionsToApply();
		this.brokenNamespaceProfileMap = new HashMap<String, Profile>();
	}


	private Collection<MissingSchema> createActionsToApply() {
		return new AbstractCollection<ZombieStereotypesDialog.MissingSchema>() {

			private final Predicate<MissingSchema> filter = new Predicate<MissingSchema>() {

				public boolean apply(MissingSchema input) {
					return input.getSelectedRepairAction().kind() != IRepairAction.Kind.NO_OP;
				}
			};

			@Override
			public Iterator<MissingSchema> iterator() {
				return Iterators.filter(getMissingSchemas().iterator(), filter);
			}

			@Override
			public boolean isEmpty() {
				return !Iterables.any(getMissingSchemas(), filter);
			}

			@Override
			public int size() {
				return Iterators.size(iterator());
			}
		};
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite contents = (Composite) super.createDialogArea(parent);

		Composite self = new Composite(contents, SWT.NONE);
		self.setLayout(new GridLayout(1, false));
		self.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Label descriptionLabel = new Label(self, SWT.WRAP);
		String description = "For each missing profile definition, select an action to correct the problem. Recommended actions are selected already where appropriate.";
		descriptionLabel.setText(description);
		descriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		table = new TableViewer(self, SWT.FULL_SELECTION | SWT.BORDER);
		Table tableControl = table.getTable();
		TableLayout layout = new TableLayout();
		tableControl.setLayout(layout);
		tableControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tableControl.setHeaderVisible(true);

		TableColumn nameColumn = new TableColumn(tableControl, SWT.NONE);
		nameColumn.setText("Resource");
		nameColumn.setToolTipText("Resource in which problems with stereotype applications were found");
		layout.addColumnData(new ColumnWeightData(25, 250, true));

		TableColumn affectedColumn = new TableColumn(tableControl, SWT.NONE);
		affectedColumn.setText("Count");
		affectedColumn.setToolTipText("Number of stereotype applications in the resource from the wrong or missing profile definition");
		layout.addColumnData(new ColumnWeightData(5, 50, true));

		TableColumn schemaColumn = new TableColumn(tableControl, SWT.NONE);
		schemaColumn.setText("Profile");
		schemaColumn.setToolTipText("A profile definition that is missing or is not the applied version");
		layout.addColumnData(new ColumnWeightData(10, 150, true));

		TableViewerColumn actionColumn = new TableViewerColumn(table, SWT.NONE);
		actionColumn.getColumn().setText("Action");
		actionColumn.getColumn().setToolTipText("Corrective action to apply to this resource for this profile");
		layout.addColumnData(new ColumnWeightData(15, 100, true));
		actionColumn.setEditingSupport(new ActionEditingSupport(table));

		table.setContentProvider(ArrayContentProvider.getInstance());
		table.setLabelProvider(new ZombiesLabelProvider());
		table.setInput(getMissingSchemas());

		progress = new ProgressMonitorPart(self, null, true);
		progress.setLayoutData(new GridData(SWT.FILL, SWT.LEAD, true, false));
		progress.setVisible(false);

		return contents;
	}

	protected List<MissingSchema> getMissingSchemas() {
		if (missingSchemas == null) {
			missingSchemas = Lists.newArrayList();

			for (ZombieStereotypesDescriptor next : zombieDescriptors) {
				for (IAdaptable schema : next.getZombieSchemas()) {
					missingSchemas.add(new MissingSchema(schema, next));
				}
			}
		}

		return missingSchemas;
	}

	protected void updateControls() {
		String newTitle = "Repair Stereotypes";
		if (!actionsToApply.isEmpty()) {
			newTitle = newTitle + " *";
		}
		getShell().setText(newTitle);
		getButton(APPLY_ID).setEnabled(!actionsToApply.isEmpty());

		table.refresh();
	}

	protected void applyPressed() {
		if (actionsToApply.isEmpty()) {
			return;
		}

		final List<MissingSchema> repairActions = Lists.newArrayList(actionsToApply);
		try {
			((TransactionalCommandStack) editingDomain.getCommandStack()).execute(new RecordingCommand(editingDomain, "Repair stereotypes") {

				@Override
				protected void doExecute() {

					final BasicDiagnostic diagnostics = new BasicDiagnostic(Activator.PLUGIN_ID, 0, "Problems in repairing stereotypes", null);

					IRunnableWithProgress runnable = TransactionHelper.createPrivilegedRunnableWithProgress(editingDomain, new IRunnableWithProgress() {

						public void run(IProgressMonitor monitor) {
							SubMonitor subMonitor = SubMonitor.convert(monitor, actionsToApply.size());

							for (Iterator<MissingSchema> iter = repairActions.iterator(); iter.hasNext();) {
								MissingSchema missingSchema = iter.next();

								missingSchema.initialiseRepairAction(brokenNamespaceProfileMap);
								if (!missingSchema.apply(diagnostics, subMonitor.newChild(1, SubMonitor.SUPPRESS_NONE))) {
									// Leave this one to try it again
									iter.remove();
								} else {
									saveRepairAction(missingSchema);
								}
							}

							subMonitor.done();
						}
					});

					final Cursor previousCursor = getShell().getCursor();
					Cursor waitCursor = getShell().getDisplay().getSystemCursor(SWT.CURSOR_WAIT);
					try {
						getShell().setCursor(waitCursor);
						progress.setVisible(true);
						progress.attachToCancelComponent(null); // Enable the stop button
						enableButtons(false);
						ModalContext.run(runnable, true, progress, getShell().getDisplay());
					} catch (InterruptedException e) {
						// User cancelled. That's normal
					} catch (Exception e) {
						getShell().setCursor(previousCursor);
						Throwable t = e;
						if (e instanceof InvocationTargetException) {
							t = ((InvocationTargetException) e).getTargetException();
						}
						StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to repair stereotypes.", t), StatusManager.BLOCK | StatusManager.LOG);
					} finally {
						enableButtons(true);
						getShell().setCursor(previousCursor);
						progress.setVisible(false);
					}

					if (diagnostics.getSeverity() > Diagnostic.OK) {
						DiagnosticDialog dialog = new DiagnosticDialog(getShell(), "Problems in Repairing Stereotypes",
								"Some repair actions could not be completed normally. Please review the specific details and take any corrective action that may be required.",
								diagnostics, Diagnostic.ERROR | Diagnostic.WARNING);
						dialog.setBlockOnOpen(true);
						dialog.open();
					}
				}
			}, Collections.singletonMap(Transaction.OPTION_NO_VALIDATION, true));
		} catch (RollbackException e) {
			// Shouldn't happen without validation!
			Activator.log.error(e);
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Repair operation was cancelled.", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW | StatusManager.LOG);
		}

		getMissingSchemas().removeAll(repairActions);
		updateControls();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, APPLY_ID, "Apply", true);
		super.createButtonsForButtonBar(parent);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case IDialogConstants.CANCEL_ID:
			if (!actionsToApply.isEmpty() && !MessageDialog.openQuestion(getShell(), "Repair Stereotypes", "You have not yet applied the pending repair actions. Are you sure you want to cancel?")) {
				// don't cancel
				return;
			}
			break;
		case APPLY_ID:
			applyPressed();
			return;
		}

		super.buttonPressed(buttonId);
	}

	void enableButtons(boolean enable) {
		for (Iterator<Button> iter = UIUtil.allChildren(getButtonBar(), Button.class); iter.hasNext();) {
			iter.next().setEnabled(enable);
		}
	}

	@Override
	public void create() {
		super.create();

		getShell().setText("Repair Stereotypes");
		getShell().setMinimumSize(600, 400);
		getShell().pack();

		updateControls();
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	public boolean isHelpAvailable() {
		return false;
	}

	@Override
	protected void okPressed() {
		applyPressed();

		updateControls();

		// Maybe the user cancelled the work
		if (!getButton(APPLY_ID).isEnabled()) {
			super.okPressed();
		}
	}

	@Override
	public boolean close() {
		zombieDescriptors.clear();
		if (missingSchemas != null) {
			missingSchemas.clear();
		}

		return super.close();
	}

	protected void saveRepairAction(MissingSchema missingSchema) {
		IRepairAction repairAction = missingSchema.getSelectedRepairAction();

		if (repairAction instanceof IRepairAction.IApplyProfileAction) {
			Profile appliedProfile = ((IRepairAction.IApplyProfileAction) repairAction).getAppliedProfile();
			if (appliedProfile != null) {
				brokenNamespaceProfileMap.put(missingSchema.getSchema().getNsURI(), appliedProfile);
			}
		}
	}

	//
	// Nested types
	//

	private class ZombiesLabelProvider extends ColumnLabelProvider {

		public ZombiesLabelProvider() {
			super();
		}

		@Override
		public void update(ViewerCell cell) {
			switch (cell.getColumnIndex()) {
			case 0:
				updateResource(cell);
				break;
			case 1:
				updateAffected(cell);
				break;
			case 2:
				updateSchema(cell);
				break;
			case 3:
				updateAction(cell);
				break;
			}
		}

		void updateResource(ViewerCell cell) {
			Resource resource = ((MissingSchema) cell.getElement()).getResource();
			cell.setText(labelProviderService.getLabelProvider().getText(resource));
			cell.setImage(labelProviderService.getLabelProvider().getImage(resource));
		}

		void updateAffected(ViewerCell cell) {
			MissingSchema schema = (MissingSchema) cell.getElement();
			int count = schema.getAffectedCount();

			String text = Integer.toString(count);
			if (schema.isOrphanGroup()) {
				text = NLS.bind("{0} dangling stereotypes", text);
			}
			cell.setText(text);
		}

		void updateSchema(ViewerCell cell) {
			EPackage schema = ((MissingSchema) cell.getElement()).getSchema();

			cell.setText(labelProviderService.getLabelProvider().getText(schema));
			cell.setImage(labelProviderService.getLabelProvider().getImage(schema));
		}

		void updateAction(ViewerCell cell) {
			IRepairAction action = ((MissingSchema) cell.getElement()).getSelectedRepairAction();
			cell.setText(action.getLabel());
		}
	}

	private class MissingSchema {

		private final IAdaptable schema;

		private final ZombieStereotypesDescriptor descriptor;

		private IRepairAction selectedAction;

		MissingSchema(IAdaptable schema, ZombieStereotypesDescriptor descriptor) {
			this.schema = schema;
			this.descriptor = descriptor;
			this.selectedAction = descriptor.getSuggestedRepairAction(schema);
		}

		void initialiseRepairAction(Map<String, Profile> brokenNsProfileMap) {
			if (selectedAction instanceof IRepairAction.IApplyProfileAction) {
				((IRepairAction.IApplyProfileAction) selectedAction).setPreviousAppliedProfile(brokenNsProfileMap.get(getSchema().getNsURI()));
			}

		}

		Resource getResource() {
			return descriptor.getResource();
		}

		int getAffectedCount() {
			return descriptor.getZombieCount(schema);
		}

		EPackage getSchema() {
			return AdapterUtils.adapt(schema, EPackage.class, null);
		}

		boolean isOrphanGroup() {
			return AdapterUtils.adapt(schema, IStereotypeOrphanGroup.class).isPresent();
		}

		List<IRepairAction> getRepairActions() {
			return descriptor.getAvailableRepairActions(schema);
		}

		IRepairAction getSelectedRepairAction() {
			return selectedAction;
		}

		void setSelectedRepairAction(IRepairAction action) {
			this.selectedAction = action;
		}

		boolean apply(DiagnosticChain diagnostics, IProgressMonitor monitor) {
			return descriptor.repair(schema, getSelectedRepairAction(), diagnostics, monitor);
		}
	}

	private class ActionEditingSupport extends EditingSupport {

		private ComboBoxViewerCellEditor editor;

		ActionEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			if (editor == null) {
				editor = new ComboBoxViewerCellEditor((Table) getViewer().getControl(), SWT.BORDER);
				editor.setContentProvider(ArrayContentProvider.getInstance());
				editor.setLabelProvider(new LabelProvider() {

					@Override
					public String getText(Object element) {
						return ((IRepairAction) element).getLabel();
					}
				});
			}

			editor.setInput(((MissingSchema) element).getRepairActions());
			return editor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			return ((MissingSchema) element).getSelectedRepairAction();
		}

		@Override
		protected void setValue(Object element, Object value) {
			MissingSchema missing = (MissingSchema) element;
			IRepairAction action = (IRepairAction) value;

			if (missing.getSelectedRepairAction() != action) {
				missing.setSelectedRepairAction(action);

				editor.getControl().getDisplay().asyncExec(new Runnable() {

					public void run() {
						updateControls();
					}
				});
			}
		}
	}
}
