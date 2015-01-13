/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.widgets.widgets;

import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.messages.Messages;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author VL222926
 *
 */
public class MultipleValueEditAndSelectionWidget extends MultipleValueSelectionWidget {

	/**
	 * if <code>true</code> the edition button will be displayed
	 */
	private boolean allowEdition;


	/**
	 * The edit action button
	 */
	protected Button edit;

	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public MultipleValueEditAndSelectionWidget(IElementSelector selector) {
		super(selector);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 */
	public MultipleValueEditAndSelectionWidget(IElementSelector selector, boolean unique) {
		super(selector, unique);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 */
	public MultipleValueEditAndSelectionWidget(IElementSelector selector, boolean unique, boolean ordered) {
		super(selector, unique, ordered);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 */
	public MultipleValueEditAndSelectionWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		super(selector, unique, ordered, upperBound);
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#init()
	 *
	 */
	@Override
	protected void init() {
		super.init();
		// please, keep the default value to false
		this.allowEdition = false;
	}

	/**
	 * @return the allowEdition
	 */
	public boolean isAllowEdition() {
		return allowEdition;
	}

	/**
	 * @param allowEdition
	 *            the allowEdition to set
	 */
	public void setAllowEdition(boolean allowEdition) {
		this.allowEdition = allowEdition;
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#createRightButtonsSection(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */
	@Override
	protected void createRightButtonsSection(Composite parent) {
		super.createRightButtonsSection(parent);
		if (isAllowEdition()) {
			this.edit = new Button(rightButtonsSection, SWT.PUSH);
			edit.setImage(Activator.getDefault().getImage(ImageConstants.EDIT_12_12_ICON_PATH)); //$NON-NLS-1$
			edit.addSelectionListener(this);
			edit.setToolTipText(Messages.MultipleValueEditAndSelectionWidget_EditSelectedElement);
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#updateControls()
	 *
	 */
	@Override
	public void updateControls() {
		super.updateControls();
		if(allowEdition){
			updateControl(edit, this.factory!=null && this.factory.canEdit());
		}

	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 *
	 * @param e
	 */
	@Override
	public void widgetSelected(SelectionEvent e) {
		if (edit != null && e.widget == edit) {
			edit();
			this.selectedElementsViewer.refresh();
		}
		super.widgetSelected(e);
	}

	/**
	 * 
	 * @return
	 *         <code>true</code> if the selected element can be edited
	 */
	protected boolean canEdit() {
		return allowEdition && this.factory.canEdit();
	}

	/**
	 * edit the selected element
	 */
	protected void edit() {
		// nothing to do here
	}
}
