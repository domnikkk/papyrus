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

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;

/**
 * @author VL222926
 *
 */
public class ConfigurePasteForCategoriesSelectionWidget extends ChooseCategoriesSelectionWidget {

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 */
	public ConfigurePasteForCategoriesSelectionWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		super(selector, unique, ordered, upperBound);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 */
	public ConfigurePasteForCategoriesSelectionWidget(IElementSelector selector, boolean unique, boolean ordered) {
		super(selector, unique, ordered);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 */
	public ConfigurePasteForCategoriesSelectionWidget(IElementSelector selector, boolean unique) {
		super(selector, unique);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public ConfigurePasteForCategoriesSelectionWidget(IElementSelector selector) {
		super(selector);
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.ChooseCategoriesSelectionWidget#createListSectionContentProvider()
	 *
	 * @return
	 */
	@Override
	protected IContentProvider createListSectionContentProvider() {
		return new ITreeItemContentProvider();
	}
}
