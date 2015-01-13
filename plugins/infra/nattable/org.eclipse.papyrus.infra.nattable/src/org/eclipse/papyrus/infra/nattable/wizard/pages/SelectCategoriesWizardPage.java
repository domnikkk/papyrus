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

package org.eclipse.papyrus.infra.nattable.wizard.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.wizard.CategoriesWizardUtils;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelectionListener;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.util.ValueUtils;
import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget;
import org.eclipse.papyrus.infra.widgets.wizard.pages.MultipleValueEditAndSelectionWizardPage;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;

/**
 * @author VL222926
 *
 */
public class SelectCategoriesWizardPage extends MultipleValueEditAndSelectionWizardPage {

	public static final String DEFAULT_SELECT_CATEGORIES_PAGE_NAME = Messages.SelectCategoriesWizardPage_SelectCategoriesPage;

	public static final String DEFAULT_SELECT_CATEGORIES_TITLE = Messages.SelectCategoriesWizardPage_SelectCategoriesToListenInTheTreeTable;

	private IElementSelector selector;

	private IElementSelectionListener selectorListener;

	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public SelectCategoriesWizardPage(IElementSelector selector) {
		this(DEFAULT_SELECT_CATEGORIES_PAGE_NAME, DEFAULT_SELECT_CATEGORIES_TITLE, null, selector);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param pageName
	 *            the name of the page
	 * @param pageTitle
	 *            the title of the page
	 * @param defaultImage
	 *            the image to use for the page
	 * @param selector
	 *            the selector to use
	 */
	public SelectCategoriesWizardPage(String pageName, String pageTitle, ImageDescriptor defaultImage, IElementSelector selector) {
		super(pageName, pageTitle, defaultImage, selector, false, true, ValueUtils.MANY);
	}


	/**
	 * @see org.eclipse.papyrus.infra.widgets.wizard.pages.MultipleValueEditAndSelectionWizardPage#createWidget(org.eclipse.papyrus.infra.widgets.editors.IElementSelector, boolean, boolean, int)
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 * @return
	 */
	@Override
	protected MultipleValueSelectionWidget createWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		this.selector = selector;
		this.selectorListener = new SelectorListener();
		// the only way found to refresh properly next button
		this.selector.addElementSelectionListener(this.selectorListener);

		return new ChooseCategoriesSelectionWidget(selector, unique, ordered, upperBound) {




			/**
			 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueEditAndSelectionWidget#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 *
			 * @param e
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				validate();
			}

			/**
			 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#doubleClick(org.eclipse.jface.viewers.DoubleClickEvent)
			 *
			 * @param event
			 */
			@Override
			public void doubleClick(DoubleClickEvent event) {
				super.doubleClick(event);
				validate();
			}
		};
	}

	/**
	 *
	 * @author VL222926
	 *
	 *         this class allows to refresh properly the next button after a double click on the left part of the widget
	 *
	 */
	private class SelectorListener implements IElementSelectionListener {

		/**
		 *
		 * @see org.eclipse.papyrus.infra.widgets.editors.IElementSelectionListener#addElements(java.lang.Object[])
		 *
		 * @param elements
		 */
		@Override
		public void addElements(Object[] elements) {
			Display.getDefault().asyncExec(new Runnable() {

				/**
				 *
				 * @see java.lang.Runnable#run()
				 *
				 */
				@Override
				public void run() {
					validate();

				}
			});
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.wizard.pages.MultipleValueEditAndSelectionWizardPage#dispose()
	 *
	 */
	@Override
	public void dispose() {
		if (this.selector != null) {
			this.selector.removeElementSelectionListener(selectorListener);
			this.selector = null;
		}
		super.dispose();
	}

	/**
	 * validate the page and display error message if required
	 */
	protected void validate() {
		List<Object> selection = getWidget().getSelection();
		List<Integer> incompleteDepth = new ArrayList<Integer>();
		for (Object current : selection) {
			Assert.isTrue(current instanceof ITreeItemAxis);
			ITreeItemAxis rootItem = (ITreeItemAxis) current;
			Assert.isTrue(CategoriesWizardUtils.isRootItem(rootItem));
			for (ITreeItemAxis depthItem : rootItem.getChildren()) {
				Assert.isTrue(CategoriesWizardUtils.isDepthItem(depthItem));
				if (depthItem.getChildren().isEmpty()) {
					int depth = Integer.valueOf(depthItem.getElement().toString()).intValue();
					if (depth != 0) {
						incompleteDepth.add(Integer.valueOf(depth));
					}
				}
			}
		}
		if (incompleteDepth.isEmpty()) {
			setErrorMessage(null);
		} else {
			StringBuilder builder = new StringBuilder(NLS.bind("The following depths don't have categories {0}", incompleteDepth.toString()));
			setErrorMessage(builder.toString());
		}

		setPageComplete(getErrorMessage() == null);
	}
}
