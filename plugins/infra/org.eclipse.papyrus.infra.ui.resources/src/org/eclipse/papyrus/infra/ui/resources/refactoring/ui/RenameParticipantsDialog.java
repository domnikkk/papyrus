/*****************************************************************************
 * Copyright (c) 2011, 2014 Atos, CEA LIST, and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  <a href="mailto:tristan.faure@atos.net">Tristan FAURE</a> - Initial API and implementation
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr
 *  Christian W. Damus (CEA) - bug 436377
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.ui.resources.refactoring.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.ui.resources.refactoring.ui.ScopeChooser.ScopeChooserVisitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


/**
 * A dialog that asks the user to select the scope for analysis of dependent resources in a refactoring of some model resource.
 * If the user cancels the dialog, then the initialization of the refactoring participant is cancelled and the refactoring
 * wizard does not advance (the user may then cancel the refactoring).
 * 
 * @author tfaure
 * 
 */
public class RenameParticipantsDialog extends TrayDialog {

	private final IFile context;

	protected IScopeChooser currentScope;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public RenameParticipantsDialog(Shell parentShell, IFile context) {
		super(parentShell);
		this.context = context;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

		newShell.setText(Messages.RenameParticipantsDialog_SELECT_RENAME_OPTION);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite)super.createDialogArea(parent);

		final int verticalSpace = convertVerticalDLUsToPixels(8);

		Composite composite = new Composite(area, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		Label blurb = new Label(composite, SWT.WRAP);
		blurb.setText(Messages.RenameParticipantsDialog_DESCRIPTION);
		GridData gdata = new GridData(SWT.FILL, SWT.BEGINNING, false, false, 2, 1);
		gdata.widthHint = 250;
		blurb.setLayoutData(gdata);

		Label scopeLabel = new Label(composite, SWT.NONE);
		scopeLabel.setText("Scope:");
		gdata = new GridData(SWT.LEAD, SWT.BEGINNING, false, false);
		gdata.verticalIndent = verticalSpace;
		scopeLabel.setLayoutData(gdata);

		ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
		comboViewer.setUseHashlookup(true);
		comboViewer.setLabelProvider(new LabelProvider() {

			public boolean isLabelProperty(Object element, String property) {
				return true;
			}

			public String getText(Object element) {
				if(element instanceof IScopeChooser) {
					IScopeChooser scope = (IScopeChooser)element;
					return scope.getName();
				}
				return null;
			}
		});
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());

		Combo combo = comboViewer.getCombo();
		gdata = new GridData(SWT.FILL, SWT.FILL, false, false);
		gdata.verticalIndent = verticalSpace;
		combo.setLayoutData(gdata);

		Group grpDescription = new Group(composite, SWT.NONE);
		grpDescription.setText(Messages.RenameParticipantsDialog_DESCRIPTION_LABEL);
		grpDescription.setLayout(new GridLayout(1, false));
		grpDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));

		final Text scopeDescription = new Text(grpDescription, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.READ_ONLY | SWT.V_SCROLL);
		gdata = new GridData(SWT.FILL, SWT.FILL, false, false);
		gdata.heightHint = convertHeightInCharsToPixels(3);
		scopeDescription.setLayoutData(gdata);
		scopeDescription.setText(""); //$NON-NLS-1$

		// when the selection changed the description too 
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selec = (IStructuredSelection)event.getSelection();
					if(selec.getFirstElement() instanceof IScopeChooser) {
						IScopeChooser chooser = (IScopeChooser)selec.getFirstElement();
						scopeDescription.setText(chooser.getDescription());
						currentScope = chooser;
					}
				}
			}
		});
		Object[] input = getInput();
		comboViewer.setInput(input);
		comboViewer.setSelection(new StructuredSelection(input[0]));

		// We have no help for this dialog (yet)
		setHelpAvailable(false);

		return area;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	/**
	 * Pre defined list of chooser maybe later an extension point will be creates
	 * 
	 * @return
	 */
	private Object[] getInput() {
		final ScopeChooserVisitor visitor = new ScopeChooserVisitor();
		return new IScopeChooser[]{ new ScopeChooser(Messages.RenameParticipantsDialog_NAME_PROJECT, Messages.RenameParticipantsDialog_DESCRIPTION_PROJECT) {

			public List<IFile> getRelatedFiles(IFile f) {
				try {
					f.getProject().accept(visitor, IResource.DEPTH_INFINITE, IContainer.EXCLUDE_DERIVED);
					return visitor.getFiles();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return Collections.emptyList();
			}
		}, new ScopeChooser(Messages.RenameParticipantsDialog_NAME_WORKSPACE, Messages.RenameParticipantsDialog_DESCRIPTION_WORKSPACE) {

			public List<IFile> getRelatedFiles(IFile f) {
				try {
					ResourcesPlugin.getWorkspace().getRoot().accept(visitor, IResource.DEPTH_INFINITE, IContainer.EXCLUDE_DERIVED);
					return visitor.getFiles();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return Collections.emptyList();
			}
		}, new ScopeChooser(Messages.RenameParticipantsDialog_NAME_NO_ANALYSIS, Messages.RenameParticipantsDialog_DESCRIPTION_NO_ANALYSIS) {

			public List<IFile> getRelatedFiles(IFile f) {
				return Arrays.asList(f);
			}
		} };
	}

	public Collection<? extends IResource> getFiles() {
		return currentScope.getRelatedFiles(context);
	}
}
