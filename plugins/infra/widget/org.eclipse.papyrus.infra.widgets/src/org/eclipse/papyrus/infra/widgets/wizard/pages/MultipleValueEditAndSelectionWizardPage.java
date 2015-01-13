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

package org.eclipse.papyrus.infra.widgets.wizard.pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.papyrus.infra.widgets.util.ValueUtils;
import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @author VL222926
 *
 */
public class MultipleValueEditAndSelectionWizardPage extends WizardPage {

	/**
	 * the widget displayed in this dialog
	 */
	private MultipleValueSelectionWidget widget;
	/**
	 * The list of newly created objects
	 */
	protected Set<Object> newObjects = new HashSet<Object>();

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 *            the name of the wizard page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image to use in the title
	 * @param selector
	 *            The element selector used by this dialog
	 */
	public MultipleValueEditAndSelectionWizardPage(String pageName, String title, ImageDescriptor titleImage, IElementSelector selector) {
		this(pageName, title, titleImage, selector, false, false);
	}

	/**
	 *
	 * Constructor.
	 * 
	 * @param pageName
	 *            the name of the wizard page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image to use in the title
	 * @param selector
	 *            The element selector used by this dialog
	 * @param unique
	 *            True if the values returned by this dialog should be unique
	 */
	public MultipleValueEditAndSelectionWizardPage(String pageName, String title, ImageDescriptor titleImage, IElementSelector selector, boolean unique) {
		this(pageName, title, titleImage, selector, unique, false);
	}

	/**
	 *
	 * Constructor.
	 * 
	 * @param pageName
	 *            the name of the wizard page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image to use in the title
	 * @param selector
	 *            The element selector used by this dialog
	 * @param unique
	 *            True if the values returned by this dialog should be unique
	 */
	public MultipleValueEditAndSelectionWizardPage(String pageName, String title, ImageDescriptor titleImage, IElementSelector selector, boolean unique, boolean ordered) {
		this(pageName, title, titleImage, selector, unique, false, ValueUtils.MANY);
	}

	/**
	 *
	 * Constructor.
	 * 
	 * @param pageName
	 *            the name of the wizard page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image to use in the title
	 * @param selector
	 *            The element selector used by this dialog
	 * @param unique
	 *            True if the values returned by this dialog should be unique
	 * @param upperBound
	 *            The maximum number of values selected.
	 */
	public MultipleValueEditAndSelectionWizardPage(String pageName, String title, ImageDescriptor titleImage, IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		super(pageName, title, titleImage);
		this.widget = createWidget(selector, unique, ordered, upperBound);
	}

	/**
	 * 
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 * @return
	 */
	protected MultipleValueSelectionWidget createWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		return new MultipleValueSelectionWidget(selector, unique, ordered, upperBound);
	}

	/**
	 * Sets the label provider used to display the selected elements
	 *
	 * @param labelProvider
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.widget.setLabelProvider(labelProvider);
	}


	/**
	 * Sets the {@link ReferenceValueFactory} for this editor. The {@link ReferenceValueFactory} is used to create
	 * new instances and edit existing ones.
	 *
	 * @param factory
	 *            The {@link ReferenceValueFactory} to be used by this editor
	 */
	public void setFactory(ReferenceValueFactory factory) {
		this.widget.setFactory(factory);
	}

	/**
	 * Indicates if the selected values should be unique (According to Object.equals())
	 *
	 * @param unique
	 */
	public void setUnique(boolean unique) {
		this.widget.setUnique(unique);
	}

	/**
	 * Indicates if the selected elements should be ordered
	 *
	 * @param ordered
	 */
	public void setOrdered(boolean ordered) {
		this.widget.setOrdered(ordered);
	}

	/**
	 * 
	 * @param selector
	 */
	public void setSelector(IElementSelector selector) {
		this.widget.setSelector(selector);
	}

	/**
	 * Set the maximum number of values selected.
	 *
	 * @param upperBound
	 */
	public void setUpperBound(int upperBound) {
		this.widget.setUpperBound(upperBound);
	}

	/**
	 * Sets the optional context of the element that is being edited, in which others will be added and removed.
	 *
	 * @param contextElement
	 *            the model element that is being edited
	 */
	public void setContextElement(Object contextElement) {
		this.widget.setContextElement(contextElement);
	}

	/**
	 * Queries the optional context of the element that is being edited, in which others will be added and removed.
	 *
	 * @return the model element that is being edited
	 */
	public Object getContextElement() {
		return this.widget.getContextElement();
	}


	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param arg0
	 */
	@Override
	public void createControl(Composite arg0) {
		Control ctrl = this.widget.create(arg0);
		getShell().pack();
		this.widget.updateControls();
		setControl(ctrl);
	}

	/**
	 * @param arrayList
	 */
	public void setInitialElementSelections(List<Object> arrayList) {
		this.widget.setInitialSelections(arrayList);
	}

	/**
	 * @see org.eclipse.jface.dialogs.DialogPage#dispose()
	 *
	 */
	@Override
	public void dispose() {
		this.widget.dispose();
		super.dispose();
	}

	/**
	 * @see org.eclipse.jface.dialogs.DialogPage#setVisible(boolean)
	 *
	 * @param visible
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		getControl().setVisible(visible);
		this.widget.updateControls();
		getShell().pack();
	}

	/**
	 * 
	 * @return
	 *         the wrapped widget
	 */
	protected MultipleValueSelectionWidget getWidget() {
		return this.widget;
	}
}
