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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget;

/**
 * @author VL222926
 *
 */
public class ConfigurePasteForCategoriesWizardPage extends SelectCategoriesWizardPage {

	public static final String DEFAULT_CONFIGURE_PASTE_PAGE_NAME = "Configure Paste In Tree Table";

	public static final String DEFAULT_CONFIGURE_PASTE_PAGE_TITLE = "Configure the paste for each categories";


	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public ConfigurePasteForCategoriesWizardPage(IElementSelector selector) {
		this(DEFAULT_CONFIGURE_PASTE_PAGE_NAME, DEFAULT_CONFIGURE_PASTE_PAGE_TITLE, null, selector);
	}

	/**
	 * Constructor.
	 *
	 * @param pageName
	 * @param pageTitle
	 * @param defaultImage
	 * @param selector
	 */
	public ConfigurePasteForCategoriesWizardPage(String pageName, String pageTitle, ImageDescriptor defaultImage, IElementSelector selector) {
		super(pageName, pageTitle, defaultImage, selector);
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.SelectCategoriesWizardPage#createWidget(org.eclipse.papyrus.infra.widgets.editors.IElementSelector, boolean, boolean, int)
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 * @return
	 */
	@Override
	protected MultipleValueSelectionWidget createWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		return new ConfigurePasteForCategoriesSelectionWidget(selector, unique, ordered, upperBound);
	}

}
