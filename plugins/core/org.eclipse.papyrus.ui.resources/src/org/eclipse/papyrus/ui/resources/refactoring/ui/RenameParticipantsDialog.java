/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  <a href="mailto:tristan.faure@atos.net">Tristan FAURE</a> - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.ui.resources.refactoring.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.ui.resources.refactoring.ui.ScopeChooser.ScopeChooserVisitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;


/**
 * Generated by Window Builder
 * 
 * @author tfaure
 * 
 */
public class RenameParticipantsDialog extends TitleAreaDialog {

	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	private final IFile context;

	private FormText formDescription;

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

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle(Messages.RenameParticipantsDialog_SELECT_RENAME_OPTION);
		Composite area = (Composite)super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Section sctnOptions = formToolkit.createSection(container, Section.EXPANDED | Section.TITLE_BAR);
		sctnOptions.setDescription(""); //$NON-NLS-1$
		sctnOptions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(sctnOptions);
		sctnOptions.setText(Messages.RenameParticipantsDialog_OPTIONS);

		Composite composite = new Composite(sctnOptions, SWT.NONE);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		sctnOptions.setClient(composite);
		composite.setLayout(new GridLayout(1, false));

		FormText formText = formToolkit.createFormText(composite, false);
		formText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(formText);
		formText.setText(Messages.RenameParticipantsDialog_DESCRIPTION, true, false);

		ComboViewer comboViewer = new ComboViewer(composite, SWT.READ_ONLY);
		comboViewer.setUseHashlookup(true);
		comboViewer.setLabelProvider(new ILabelProvider() {

			public void removeListener(ILabelProviderListener listener) {
			}

			public boolean isLabelProperty(Object element, String property) {
				return true;
			}

			public void dispose() {
			}

			public void addListener(ILabelProviderListener listener) {
			}

			public String getText(Object element) {
				if(element instanceof IScopeChooser) {
					IScopeChooser scope = (IScopeChooser)element;
					return scope.getName();
				}
				return null;
			}

			public Image getImage(Object element) {
				return null;
			}
		});
		comboViewer.setContentProvider(new IStructuredContentProvider() {

			public Object[] getElements(Object inputElement) {
				return (Object[])inputElement;
			}

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			public void dispose() {
			}
		});

		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(combo);

		Group grpDescription = new Group(composite, SWT.NONE);
		grpDescription.setLayout(new GridLayout(1, false));
		grpDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpDescription.setText(Messages.RenameParticipantsDialog_DESCRIPTION_LABEL);
		formToolkit.adapt(grpDescription);
		formToolkit.paintBordersFor(grpDescription);

		formDescription = formToolkit.createFormText(grpDescription, false);
		formDescription.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		formToolkit.paintBordersFor(formDescription);
		formDescription.setText("", false, false); //$NON-NLS-1$

		// when the selection changed the description too 
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selec = (IStructuredSelection)event.getSelection();
					if(selec.getFirstElement() instanceof IScopeChooser) {
						IScopeChooser chooser = (IScopeChooser)selec.getFirstElement();
						formDescription.setText(chooser.getDescription(), true, false);
						currentScope = chooser;
					}
				}
			}
		});
		Object[] input = getInput();
		comboViewer.setInput(input);
		comboViewer.setSelection(new StructuredSelection(input[0]));
		return area;
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

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public Collection<? extends IResource> getFiles() {
		return currentScope.getRelatedFiles(context);
	}
}
