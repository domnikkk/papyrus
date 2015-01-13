/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.editors;

import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget;
import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWithCheckboxWidget;
import org.eclipse.swt.widgets.Shell;

/**
 * This dialog adds a checkbox at the end of the {@link MultipleValueSelectorDialog}
 *
 * @author vl222926
 *
 */
public class MultipleValueSelectionWithCheckBoxDialog extends MultipleValueSelectionDialog {

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param selector
	 * @param unique
	 */
	public MultipleValueSelectionWithCheckBoxDialog(Shell parentShell, IElementSelector selector, boolean unique) {
		super(parentShell, selector, unique);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param selector
	 * @param title
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 */
	public MultipleValueSelectionWithCheckBoxDialog(Shell parentShell, IElementSelector selector, String title, boolean unique, boolean ordered, int upperBound) {
		super(parentShell, selector, title, unique, ordered, upperBound);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param selector
	 * @param title
	 * @param unique
	 * @param ordered
	 */
	public MultipleValueSelectionWithCheckBoxDialog(Shell parentShell, IElementSelector selector, String title, boolean unique, boolean ordered) {
		super(parentShell, selector, title, unique, ordered);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param selector
	 * @param title
	 */
	public MultipleValueSelectionWithCheckBoxDialog(Shell parentShell, IElementSelector selector, String title) {
		super(parentShell, selector, title);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 * @param selector
	 */
	public MultipleValueSelectionWithCheckBoxDialog(Shell parentShell, IElementSelector selector) {
		super(parentShell, selector);
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.editors.MultipleValueSelectionDialog#createWidget(org.eclipse.papyrus.infra.widgets.editors.IElementSelector, boolean, boolean, int)
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperbound
	 * @return
	 */
	@Override
	protected MultipleValueSelectionWidget createWidget(IElementSelector selector, boolean unique, boolean ordered, int upperbound) {
		return new MultipleValueSelectionWithCheckboxWidget(selector, unique, ordered, upperbound);
	}

	/**
	 * 
	 * @return
	 *         the widget
	 */
	/**
	 * @see org.eclipse.papyrus.infra.widgets.editors.MultipleValueSelectionDialog#getWidget()
	 *
	 * @return
	 */
	@Override
	protected MultipleValueSelectionWithCheckboxWidget getWidget() {
		return (MultipleValueSelectionWithCheckboxWidget) super.getWidget();
	}

	/**
	 *
	 * @param text
	 *            the text to display near the checkbox
	 * @param tooltip
	 *            the tooltip to display for the checkbox
	 * @param isChecked
	 *            the initial state of the checkbox
	 */
	public void setCheckBoxValues(final String text, final String tooltip, final boolean isChecked) {
		MultipleValueSelectionWithCheckboxWidget w = getWidget();
		w.setCheckBoxValues(text, tooltip, isChecked);
	}

	/**
	 * this method allows to display or hide the checkbox
	 */
	public void setDisplayCheckBox(boolean displayCheckBox) {
		getWidget().setDisplayCheckBox(displayCheckBox);
	}

	/**
	 *
	 * @return
	 *         the state of the checkbox button
	 */
	public boolean isChecked() {
		return getWidget().isChecked();
	}

	/**
	 * 
	 * @return <code>true</code> if the checkbox must be displayed
	 */
	public boolean isDisplayingCheckBox() {
		return getWidget().isDisplayingCheckBox();
	}
}
