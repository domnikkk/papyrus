/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 * Adapted code from Camille Letavernier (CEA LIST) in MultipleValueSelectorDialog
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.widgets.widgets;

import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


/**
 * @author VL222926
 * 
 *
 */
public class MultipleValueSelectionWithCheckboxWidget extends MultipleValueEditAndSelectionWidget {

	/** boolean indicating if the checkbox is checked */
	protected boolean isChecked;

	/** The text to display for the checkbox */
	protected String text;

	/** the tooltip to display for the checkbox */
	protected String tooltip;

	/** indicates if the checkbox must be displayed or not */
	protected boolean displayCheckBox = true;

	protected Button checkBox;
	/**
	 * the checkbox listener
	 */
	protected SelectionListener checkboxListener;

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 */
	public MultipleValueSelectionWithCheckboxWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		super(selector, unique, ordered, upperBound);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 */
	public MultipleValueSelectionWithCheckboxWidget(IElementSelector selector, boolean unique, boolean ordered) {
		super(selector, unique, ordered);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 */
	public MultipleValueSelectionWithCheckboxWidget(IElementSelector selector, boolean unique) {
		super(selector, unique);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public MultipleValueSelectionWithCheckboxWidget(IElementSelector selector) {
		super(selector);
	}

	/**
	 * @param text
	 * @param tooltip
	 * @param isChecked
	 */
	public void setCheckBoxValues(String text, String tooltip, boolean isChecked) {
		this.text = text;
		this.tooltip = tooltip;
		this.isChecked = isChecked;
	}

	/**
	 * @return
	 *         <code>true</code> if the additional checkbox is checked
	 */
	public boolean isChecked() {
		return this.isChecked;
	}

	/**
	 * @param displayCheckBox
	 *            <code>true</code> if the additional checkbox must be displayed
	 */
	public void setDisplayCheckBox(boolean displayCheckBox) {
		this.displayCheckBox = displayCheckBox;
	}

	/**
	 * 
	 * @return <code>true</code> if the checkbox must be displayed
	 */
	public boolean isDisplayingCheckBox() {
		return this.displayCheckBox;
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#createContents(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */
	@Override
	protected Composite createContents(Composite parent) {
		Composite comp = super.createContents(parent);
		if (this.displayCheckBox) {
			this.checkBox = new Button(parent, SWT.CHECK);
			this.checkBox.setText(this.text);
			this.checkBox.setToolTipText(this.tooltip);
			this.checkBox.setSelection(this.isChecked);
			this.checkboxListener =
					new SelectionListener() {

						@Override
						public void widgetSelected(SelectionEvent e) {
							isChecked = MultipleValueSelectionWithCheckboxWidget.this.checkBox.getSelection();
						}

						@Override
						public void widgetDefaultSelected(SelectionEvent e) {
						}
					};
			this.checkBox.addSelectionListener(this.checkboxListener);
		}
		return comp;
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#dispose()
	 *
	 */
	@Override
	public void dispose() {
		if (this.checkboxListener != null && this.checkBox != null) {
			this.checkBox.removeSelectionListener(this.checkboxListener);
		}
		super.dispose();
	}
}