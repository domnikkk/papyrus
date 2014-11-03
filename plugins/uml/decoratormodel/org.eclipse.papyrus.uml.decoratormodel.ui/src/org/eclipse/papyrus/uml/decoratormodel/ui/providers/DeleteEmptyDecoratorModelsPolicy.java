/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.ui.providers;

import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.WhenKind.ALWAYS;
import static org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.WhenKind.NEVER;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.papyrus.uml.decoratormodel.helper.IDeleteEmptyDecoratorModelsPolicy;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences.ProfileExternalizationUIPreferences;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.providers.DecoratorModelLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * UI based policy for deletion of empty decorator models, with the possibility of interactively prompting the user.
 */
public class DeleteEmptyDecoratorModelsPolicy implements IDeleteEmptyDecoratorModelsPolicy {
	private final IShellProvider parentShell;

	public DeleteEmptyDecoratorModelsPolicy(IShellProvider parentShell) {
		super();

		this.parentShell = parentShell;
	}

	public DeleteEmptyDecoratorModelsPolicy(Shell parentShell) {
		this(new SameShellProvider(parentShell));
	}

	@Override
	public boolean shouldDeleteDecoratorModels(Collection<? extends Resource> decoratorModels) {
		boolean result;

		switch (ProfileExternalizationUIPreferences.getDeleteEmptyDecoratorModels()) {
		case PROMPT:
			result = promptToDelete(decoratorModels);
			break;
		case ALWAYS:
			result = true;
			break;
		case NEVER:
		default:
			result = false;
			break;
		}

		return result;
	}

	private boolean promptToDelete(final Collection<? extends Resource> decoratorModels) {
		MessageDialogWithToggle dlg = new MessageDialogWithToggle(parentShell.getShell(), Messages.DeleteEmptyDecoratorModelsPolicy_0, null, Messages.DeleteEmptyDecoratorModelsPolicy_1,
				MessageDialog.QUESTION, new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL }, 1, Messages.DeleteEmptyDecoratorModelsPolicy_2, false) {
			@Override
			protected Control createCustomArea(Composite parent) {
				Composite custom = new Composite(parent, SWT.NONE);
				custom.setLayout(new FillLayout());
				custom.setLayoutData(new GridData(GridData.FILL_BOTH));

				TableViewer table = new TableViewer(custom, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
				table.setContentProvider(ArrayContentProvider.getInstance());
				table.setLabelProvider(new DelegatingStyledCellLabelProvider(new DecoratorModelLabelProvider()));
				table.setComparator(new ViewerComparator()); // Label-based sort is fine
				table.setInput(decoratorModels);

				return custom;
			}
		};

		boolean result;

		switch (dlg.open()) {
		case IDialogConstants.YES_ID:
			result = true;
			if (dlg.getToggleState()) {
				ProfileExternalizationUIPreferences.setDeleteEmptyDecoratorModels(ALWAYS);
			}
			break;
		case IDialogConstants.NO_ID:
			result = false;
			if (dlg.getToggleState()) {
				ProfileExternalizationUIPreferences.setDeleteEmptyDecoratorModels(NEVER);
			}
			break;
		default: // canceled
			result = false;
			break;
		}

		return result;
	}
}
