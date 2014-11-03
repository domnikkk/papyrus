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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/**
 * @author damus
 *
 */
abstract class AbstractProfileApplicationSelectionPage<I, P> extends WizardPage {

	private final Class<P> elementType;

	private CheckboxTableViewer profilesTable;

	private I input;

	private List<P> initialSelections;

	public AbstractProfileApplicationSelectionPage(String name, String title, ImageDescriptor icon, Class<P> elementType) {
		super(name, title, icon);

		this.elementType = elementType;
	}

	@Override
	public void createControl(Composite parent) {
		Composite main = new Composite(parent, SWT.NONE);

		final int layoutCols = getLayoutColumnCount();
		main.setLayout(new GridLayout(layoutCols, false));

		span(label(main, Messages.AbstractProfileApplicationSelectionPage_0), layoutCols);

		profilesTable = new CheckboxTableViewer(new Table(main, SWT.CHECK | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER));
		span(fill(profilesTable.getTable(), true, true), layoutCols);
		profilesTable.setContentProvider(createProfilesContentProvider());
		profilesTable.setLabelProvider(createProfilesLabelProvider());
		profilesTable.setComparator(new ViewerComparator());
		profilesTable.setInput(getInput());
		checkInitialSelections(profilesTable, initialSelections);

		profilesTable.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				validatePage();
			}
		});

		createSelectionButtons(main);

		createAdditionalContents(main);

		setControl(main);

		validatePage();
	}

	protected void checkInitialSelections(CheckboxTableViewer table, Collection<P> initialSelections) {
		if (initialSelections != null) {
			table.setCheckedElements(initialSelections.toArray());
		}
	}

	protected int getLayoutColumnCount() {
		return 2;
	}

	protected void createAdditionalContents(Composite mainArea) {
		// Pass
	}

	public void setInput(I input) {
		this.input = input;

		if (profilesTable != null) {
			profilesTable.setInput(input);
		}
	}

	public I getInput() {
		return input;
	}

	public void select(Iterable<P> profileApplications) {
		this.initialSelections = ImmutableList.copyOf(profileApplications);

		if (profilesTable != null) {
			profilesTable.setCheckedElements(this.initialSelections.toArray());
		}
	}

	public List<P> getSelectedProfileApplications() {
		Object[] raw = profilesTable.getCheckedElements();
		return ImmutableList.copyOf(Iterables.filter(Arrays.asList(raw), elementType));
	}

	private void createSelectionButtons(Composite parent) {
		Composite buttons = new Composite(parent, SWT.NONE);
		span(buttons, getLayoutColumnCount());

		RowLayout layout = new RowLayout();
		layout.marginLeft = 0;
		layout.marginTop = 0;
		layout.marginRight = 0;
		layout.marginBottom = 0;
		buttons.setLayout(layout);

		class ButtonHandler extends SelectionAdapter {
			final boolean select;

			ButtonHandler(boolean select) {
				this.select = select;
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				profilesTable.setAllChecked(select);
				validatePage();
			}
		}

		button(buttons, Messages.AbstractProfileApplicationSelectionPage_1).addSelectionListener(new ButtonHandler(true));
		button(buttons, Messages.AbstractProfileApplicationSelectionPage_2).addSelectionListener(new ButtonHandler(false));
	}

	protected abstract IStructuredContentProvider createProfilesContentProvider();

	protected abstract IBaseLabelProvider createProfilesLabelProvider();

	protected void validatePage() {
		if (profilesTable.getCheckedElements().length == 0) {
			setPageComplete(false);
		} else {
			setPageComplete(true);
		}
	}

	static GridData gd(Control c) {
		GridData result = (GridData) c.getLayoutData();
		if (result == null) {
			result = new GridData();
			c.setLayoutData(result);
		}
		return result;
	}

	static Label label(Composite parent, String text) {
		Label result = new Label(parent, SWT.NONE);
		result.setText(text);
		return result;
	}

	static Button button(Composite parent, String text) {
		Button result = new Button(parent, SWT.PUSH);
		result.setText(text);
		return result;
	}

	static <C extends Control> C span(C c, int horizontal) {
		gd(c).horizontalSpan = horizontal;
		return c;
	}

	static <C extends Control> C lead(C c, int dlus) {
		gd(c).verticalIndent = dlus;
		return c;
	}

	static <C extends Control> C fill(C c, boolean horizontal, boolean vertical) {
		GridData gd = gd(c);
		if (horizontal) {
			gd.horizontalAlignment = SWT.FILL;
			gd.grabExcessHorizontalSpace = true;
		}
		if (vertical) {
			gd.verticalAlignment = SWT.FILL;
			gd.grabExcessVerticalSpace = true;
		}
		return c;
	}

	static <C extends Control> C align(C c, int align) {
		GridData gd = gd(c);
		gd.horizontalAlignment = align;
		return c;
	}
}
